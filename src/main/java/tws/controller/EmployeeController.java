package tws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.Employee;
import tws.respository.EmployeeMapper;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@GetMapping("/")
	public ResponseEntity<List<Employee>> getAll(){
	List<Employee> employees = (List<Employee>) employeeMapper.selectAll();

	return ResponseEntity.ok(employees);
}}

