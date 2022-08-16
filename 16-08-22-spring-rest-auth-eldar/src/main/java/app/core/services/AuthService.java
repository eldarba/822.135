package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.auth.JwtUtilUserImpl;
import app.core.auth.User;
import app.core.auth.UserCredentials;
import app.core.exceptions.AuthException;
import app.core.exceptions.ServiceException;
import app.core.repositories.UserRepository;

@Service
public class AuthService {

	@Autowired
	private JwtUtilUserImpl jwt;
	@Autowired
	private UserRepository userRepository;

	public String register(User user) throws ServiceException {
		if (user.username == null || user.username.length() < 3) {
			throw new AuthException("The userame must be at least 3 characters");
		}
		if (user.email == null || !user.email.contains("@")) {
			throw new AuthException("Email mast contain @");
		}
		if (user.password == null || user.password.length() < 3) {
			throw new AuthException("Password must be at least 3 characters");
		}

		userRepository.save(user);
		return jwt.generateToken(user);
	}

	public String login(UserCredentials credentials) throws ServiceException {
		User user = userRepository.findByEmail(credentials.getEmail())
				.orElseThrow(() -> new AuthException("no such user: " + credentials.getEmail()));
		if (credentials.getPassword().equals(user.getPassword())) {
			String token = jwt.generateToken(user);
			return token;
		}
		throw new AuthException("login failed");
	}
}
