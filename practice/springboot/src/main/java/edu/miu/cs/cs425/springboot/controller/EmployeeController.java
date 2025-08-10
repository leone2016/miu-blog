package edu.miu.cs.cs425.springboot.controller;

import edu.miu.cs.cs425.springboot.dto.EmployeeDTO;
import edu.miu.cs.cs425.springboot.entities.EmployeeEntity;
import edu.miu.cs.cs425.springboot.services.EmployeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {


    private final EmployeService employeService;

    public EmployeeController(EmployeService employeService) {
        this.employeService = employeService;
    }

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello LEONARDO";
    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long id) {
        return employeService.getEmployeeById(id);
    }

    @GetMapping(path = "")
    public List<EmployeeDTO> getAllEmmployees(@RequestParam Integer age) {
        return employeService.getAllEmployees();
    }

    @PostMapping(path = "")
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeService.createNewEmployee(employeeDTO);
    }

}
