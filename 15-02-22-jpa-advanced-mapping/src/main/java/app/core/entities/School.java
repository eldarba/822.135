package app.core.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"address", "principal"})
@Entity
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Enumerated(EnumType.STRING)
	private Category category;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;
	
	
	@OneToOne(mappedBy = "school", cascade = CascadeType.ALL)
	private Principal principal;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "school_id")
	private List<Teacher> teachers;

	public enum Category {
		SCIENCES, ARTS, PUBLIC, PRIVATE
	}

	public School(int id, String name, Category category, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.address = address;
	}
	
	public void addTeacher(Teacher teacher) {
		if(this.teachers==null) {
			this.teachers = new ArrayList<>();
		}
		this.teachers.add(teacher);
	}
	
	

}
