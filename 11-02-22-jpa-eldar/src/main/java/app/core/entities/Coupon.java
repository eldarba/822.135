package app.core.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// entities are managed by persistence context
@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Coupon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	@Enumerated(EnumType.STRING)
	private category category;
	private LocalDate startDate;
	private LocalDate expirationDate;
	private double price;
	
	
	
	public enum category{
		FOOD, VACATION, HOTELS, CLOTHING;
	}
	
	

}
