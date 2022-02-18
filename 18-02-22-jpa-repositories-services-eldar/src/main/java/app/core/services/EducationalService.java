package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.School;
import app.core.exceptions.EducationalSystemException;
import app.core.repositories.AddressRepository;
import app.core.repositories.PrincipalRepository;
import app.core.repositories.ReviewRepository;
import app.core.repositories.SchoolRepository;
import app.core.repositories.StudentRepository;
import app.core.repositories.TeacherRepository;

// service is a type for application logic (facade)
@Service
@Transactional
public class EducationalService {

	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private PrincipalRepository principalRepository;
	@Autowired
	private ReviewRepository reviewRepository;
	@Autowired
	private SchoolRepository schoolRepository;
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private TeacherRepository teacherRepository;

	/**
	 * add a new school or throws an exception if a school by the specified id and
	 * name exists.
	 * 
	 * @param school the school to add
	 * @return the id of the new school
	 * @throws EducationalSystemException if a school by the specified id and name
	 *                                    exists.
	 */
	public int addSchool(School school) throws EducationalSystemException {
		// check that this is a new school (id)
		if (this.schoolRepository.existsById(school.getId())) {
			throw new EducationalSystemException("addSchool failed - already exists");
		}
		// check that there is no school with the same name
		if (this.schoolRepository.existsByName(school.getName())) {
			throw new EducationalSystemException("addSchool failed - name already exists");
		}
		// add the school
		school = this.schoolRepository.save(school);
		// return the id
		return school.getId();
	}

}
