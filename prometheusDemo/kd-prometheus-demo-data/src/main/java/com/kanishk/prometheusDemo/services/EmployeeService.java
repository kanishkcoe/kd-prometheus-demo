package com.kanishk.prometheusDemo.services;

import com.kanishk.prometheusDemo.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee findById(Long id);

    Employee save(Employee employee);

    List<Employee> findAll();

    Employee findByLastName(String lastName);

    Employee findByCity(String city);
}
