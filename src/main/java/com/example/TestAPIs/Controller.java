package com.example.TestAPIs;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Calculator.CalculatorTest.App;

@RestController
public class Controller {
	

 
	
	@Autowired
	private StudentService studentService;
	
	//get all students
	@RequestMapping("/students")
	public ArrayList <JavaSDETStudent> getAllStudent() {
  
		return studentService.getAllStudent();
		
	}
	//get student by id
	@RequestMapping("/students/{index}")
	public Optional<JavaSDETStudent> getStudent(@PathVariable String index) {
 		return studentService.getStudent(index);
	}
	

	
	//Add student  
	@RequestMapping(method=RequestMethod.POST, value="/students")
	public void addStudent (@RequestBody JavaSDETStudent student) {
		studentService.addStudent(student);
		
	}
	//update student
	@RequestMapping(method=RequestMethod.PUT, value="/students/{id}")
	public void updateStudent (@RequestBody JavaSDETStudent student, @PathVariable String id) {
		studentService.updateStudent(student, id);
		
	}
	
//	//remove student {index}
	@RequestMapping(method=RequestMethod.DELETE, value="/students/{id}")
	public void removeStudent (@PathVariable String id) {
 		studentService.removeStudent(id);
 	}
//	 
}
