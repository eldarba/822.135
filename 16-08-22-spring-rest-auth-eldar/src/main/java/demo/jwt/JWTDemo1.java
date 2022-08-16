package demo.jwt;

import io.jsonwebtoken.Jwts;

public class JWTDemo1 {

	public static void main(String[] args) {
		// get a JwtBuilder and create a jwt:
		String jwt = Jwts.builder().compact();
		System.out.println(jwt);
	}

}
