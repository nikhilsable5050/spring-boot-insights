package com.nikhilsable.Spring.Boot.Layered.Architecture.repository;

import com.nikhilsable.Spring.Boot.Layered.Architecture.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}
