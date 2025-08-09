package edu.miu.cs.cs425.springboot.controller;

import edu.miu.cs.cs425.springboot.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello LEONARDO";
    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long id) {
        return new EmployeeDTO(id, "Leonardo da Vinci", "leoz.31@hotmail.com", 45, LocalDate.of(1452, 4, 15), true);
    }

    @GetMapping(path = "")
    public String getAllEmmployees(@RequestParam Integer age) {
        return "hi age is "+ age;
    }

    @PostMapping(path = "")
    public String createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return "test create employee"+ employeeDTO.toString();
    }

}
