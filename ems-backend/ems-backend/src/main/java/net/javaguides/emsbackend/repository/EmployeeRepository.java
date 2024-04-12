package net.javaguides.emsbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.emsbackend.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{}

