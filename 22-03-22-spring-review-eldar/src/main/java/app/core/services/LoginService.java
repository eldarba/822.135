package app.core.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Value("${system.user}")
	private String user;
	@Value("${system.password}")
	private String password;
	private boolean loggedIn;

	public boolean login(String user, String password) {
		if (this.user.equals(user) && this.password.equals(password)) {
			this.loggedIn = true;
			return true;
		}
		return false;
	}
	
	public void logout() {
		this.loggedIn = false;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}
	
	

}
