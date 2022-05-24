package app.core.util;

import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import app.core.util.JwtUtil.Client.ClientType;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.AllArgsConstructor;
import lombok.Data;

@Component
public class JwtUtil {

	private String alg = SignatureAlgorithm.HS256.getJcaName();
	@Value("${jwt.util.secret.key}")
	private String secret;
	private Key key; // contains secret password and algorithm
	// time attributes for token validity
	@Value("${jwt.util.chrono.unit}")
	private String chronoUnit; // time units
	@Value("${jwt.util.chrono.unit.number}")
	private int unitsNumber; // number of time units

	@PostConstruct
	public void init() {
		byte[] secretDecoded = Base64.getDecoder().decode(secret.getBytes());
		this.key = new SecretKeySpec(secretDecoded, alg);
	}

	public String generateToken(Client client) {
		Map<String, Object> claims = new HashMap<>();
		claims.put("clientType", client.getType());
		claims.put("clientId", client.getId());
		return createToken(claims, client.getEmail());
	}

	private String createToken(Map<String, Object> claims, String subject) {
		Instant now = Instant.now();
		Instant exp = now.plus(this.unitsNumber, ChronoUnit.valueOf(this.chronoUnit));

		String token = Jwts.builder()

				.setClaims(claims) // setting the claims (non standard) should be first

				.setSubject(subject)

				.setIssuedAt(Date.from(now))

				.setExpiration(Date.from(exp))

				.signWith(key)

				.compact();

		return token;
	}

	/**
	 * @param token
	 * @return the client object of this token
	 * @throws JwtException in case the JWT is invalid from some reason
	 */
	public Client extractClient(String token) throws JwtException {
		Claims claims = extractAllClaims(token);
		String email = claims.getSubject();
		ClientType clientType = ClientType.valueOf(claims.get("clientType", String.class));
		int clientId = claims.get("clientId", Integer.class);
		Client client = new Client(email, clientType, clientId);
		return client;
	}

	private Claims extractAllClaims(String token) throws JwtException {
		JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(key).build();
		Jws<Claims> jws = jwtParser.parseClaimsJws(token);
		return jws.getBody();
	}

	// more method for more info
	public Date getTokenExp(String token) {
		return extractAllClaims(token).getExpiration();
	}

	public Date getTokenIssuedAt(String token) {
		return extractAllClaims(token).getIssuedAt();
	}

	@Data
	@AllArgsConstructor
	public static class Client {

		public String email;
		public ClientType type;
		public int id;

		public enum ClientType {
			ADMIN, COMPANY, CUSTOMER
		}
	}

}
