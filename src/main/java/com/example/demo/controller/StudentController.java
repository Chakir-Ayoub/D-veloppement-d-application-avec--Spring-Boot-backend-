package com.example.demo.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

import lombok.Getter;

@RestController
@RequestMapping("students")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/save")
	public void Save(@RequestBody Student student) {
		studentRepository.save(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public void Delete(@PathVariable(required = true) int id) {
		Student s = studentRepository.findById(id);
		studentRepository.delete(s);
	}
	
	@GetMapping("/all")
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
	
	@GetMapping(value = "/count")
	public long countStudent() {
	return studentRepository.count();
	}


	
	
}
