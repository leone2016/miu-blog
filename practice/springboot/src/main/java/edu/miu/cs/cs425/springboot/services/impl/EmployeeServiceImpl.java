package edu.miu.cs.cs425.springboot.services.impl;

import edu.miu.cs.cs425.springboot.config.MapperConfig;
import edu.miu.cs.cs425.springboot.dto.EmployeeDTO;
import edu.miu.cs.cs425.springboot.entities.EmployeeEntity;
import edu.miu.cs.cs425.springboot.repository.EmployeeRepository;
import edu.miu.cs.cs425.springboot.services.EmployeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeService {

    @Autowired
    private final EmployeeRepository employeeRepository;
    @Autowired
    private final ModelMapper modelMapper;


    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class))
                .orElse(null);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll().stream().map(
                employee -> modelMapper.map(employee, EmployeeDTO.class)).toList();
    }

    @Override
    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO) {
        if (employeeDTO == null) {
            return null;
        }
        var employee = new EmployeeEntity();
        employee.setName(employeeDTO.getName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setDateOfJoining(employeeDTO.getDateOfJoining());
        employee.setIsActive(employeeDTO.getIsActive());
        if (employee.getDateOfJoining() == null) {
            employee.setDateOfJoining(LocalDate.now());
        }

        return Stream.of(employeeRepository.save(employee)).map(
                savedEmployee -> modelMapper.map(savedEmployee, EmployeeDTO.class))
                .findFirst()
                .orElse(null);
    }
}
