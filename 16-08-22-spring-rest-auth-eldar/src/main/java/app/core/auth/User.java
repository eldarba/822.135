package app.core.auth;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String email;
	public String password;
	public String firstName;
	public String lastName;
	public String username;
	@Enumerated(EnumType.STRING)
	public Role role;

	public enum Role {
		ADMIN, COMPANY, CUSTOMER
	}
}
