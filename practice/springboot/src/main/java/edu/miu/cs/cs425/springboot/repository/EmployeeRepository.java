package edu.miu.cs.cs425.springboot.repository;

import edu.miu.cs.cs425.springboot.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    List<EmployeeEntity> findByName(String name);
}
