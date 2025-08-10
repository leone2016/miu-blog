package edu.miu.cs.cs425.springboot.services;

import edu.miu.cs.cs425.springboot.dto.EmployeeDTO;
import edu.miu.cs.cs425.springboot.entities.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeService {

    EmployeeDTO getEmployeeById(Long id);

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO);
}
