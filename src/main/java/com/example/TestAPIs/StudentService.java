package com.example.TestAPIs;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
//	ArrayList <JavaSDETStudent> students = new ArrayList();
 
	//get all students
	public ArrayList <JavaSDETStudent> getAllStudent() {
		ArrayList<JavaSDETStudent> students = new ArrayList<>();
//		students.add(new JavaSDETStudent());
		studentRepository.findAll()
		.forEach(students::add);
		return students;
	}
	//get single student by id
	public Optional<JavaSDETStudent> getStudent(String id) {
		ArrayList<JavaSDETStudent> students = new ArrayList<>();
		return studentRepository.findById(id);
	}
	
	//Add student 
	public void addStudent ( JavaSDETStudent student ) {
 		studentRepository.save(student);
	}
	//update student
	public void updateStudent(JavaSDETStudent student, String id) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}
	
	//remove student {index}
	public void removeStudent ( String id) {
		studentRepository.deleteById(id);
	}
	

	 
}
