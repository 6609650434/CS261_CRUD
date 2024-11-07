package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentRepository StudentRepository;
	
	@GetMapping
	public List<Student> getAllUsers(){
		return StudentRepository.findAll();
	}
	
	@PostMapping
	public Student createUser(@RequestBody Student student) {
		return StudentRepository.save(student);
	}
}
