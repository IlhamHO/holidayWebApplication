package eu.epfc.c4119.holiday.controllers;

import eu.epfc.c4119.holiday.entities.Employee;
import eu.epfc.c4119.holiday.repositories.EmployeeRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class EmployeeController {
    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @GetMapping("employees")
    public String get(Model model){
        List<Employee> employees = employeeRepository.findAll();
        for(Employee employee : employees) System.out.println(employee.toString());
        model.addAttribute("employeeList",employees);
        return "employees";
    }
}
