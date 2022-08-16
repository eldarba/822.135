package app.core.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import app.core.auth.User.Role;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;

@Component
public class JwtUtilUserImpl extends JwtUtilAbstract<User, Integer> {

	@Override
	public String generateToken(User user) {
		Map<String, Object> claims = new HashMap<>();

		claims.put("email", user.getEmail());
		claims.put("firstName", user.getFirstName());
		claims.put("lastName", user.getLastName());
		claims.put("username", user.getUsername());
		claims.put("role", user.getRole());
//		claims.put("user", user);

		return createToken(claims, user.getId()); // id is subject
		// never include password or any sensitive date in token
	}

	/**
	 * @param token
	 * @return the user object of this token
	 * @throws JwtException in case the JWT is invalid from some reason
	 */
	@Override
	public User extractUser(String token) throws JwtException {
		Claims claims = extractAllClaims(token);
		int id = Integer.parseInt(claims.getSubject());
		String email = claims.get("email", String.class);
		String firstName = claims.get("firstName", String.class);
		String lastName = claims.get("lastName", String.class);
		String userName = claims.get("username", String.class);
		Role role = Role.valueOf(claims.get("role", String.class));
		User user = new User(id, email, firstName, lastName, userName, null, role);
//		User user = claims.get("user", User.class);
		return user;
	}

}
