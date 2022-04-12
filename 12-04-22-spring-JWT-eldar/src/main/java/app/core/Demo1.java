package app.core;

import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Demo1 {

	public static void main(String[] args) {

		// secret key
		String secret = "aaaaaaaaa1aaaaaaaaa2aaaaaaaaa3aaaaaaaaa4aaa";
		// decoded secret key (base 64)
		byte[] secretDecoded = Base64.getDecoder().decode(secret.getBytes());
		// choose algorithm name
		String alg = SignatureAlgorithm.HS256.getJcaName();
		// create a JWT key object
		Key key = new SecretKeySpec(secretDecoded, alg);

		Instant now = Instant.now();
		Instant exp = now.plus(5, ChronoUnit.MINUTES);

		String token = Jwts.builder()

				.signWith(key)

				.setSubject("aaa@email")

				.setIssuedAt(Date.from(now))

				.setExpiration(Date.from(exp))

				.claim("first name", "Dan")

				.claim("last name", "Levi")

				.compact();

		System.out.print(token);

		System.out.println("\n======================");

		// decode the JWS and get JWT
		JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(key).build();

		Jws<Claims> jws = jwtParser.parseClaimsJws(token);
		System.out.println(jws.getHeader());
		System.out.println(jws.getBody());
		System.out.println(jws.getSignature());

		System.out.println("===================");
		Claims claims = jws.getBody();
		System.out.println("subject: " + claims.getSubject());
		System.out.println("isued at: " + claims.getIssuedAt());
		System.out.println("expiration: " + claims.getExpiration());
		System.out.println(claims.get("first name"));
		System.out.println(claims.get("last name"));

	}

}
