package app.core.beans;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Student {

	private int id;
	private String name;
	private LocalDate enrollDate;
	private boolean active;
	private University university;

	public Student(String name, LocalDate enrollDate, boolean active) {
		super();
		this.name = name;
		this.enrollDate = enrollDate;
		this.active = active;
	}

}
