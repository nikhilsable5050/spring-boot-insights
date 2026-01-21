package com.nikhilsable.Spring.Boot.Layered.Architecture.service;

import com.nikhilsable.Spring.Boot.Layered.Architecture.dto.EmployeeDTO;
import com.nikhilsable.Spring.Boot.Layered.Architecture.entity.EmployeeEntity;
import com.nikhilsable.Spring.Boot.Layered.Architecture.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDTO getEmployee(Integer id) {

        EmployeeEntity entity = employeeRepository.findById(id).orElse(null);

        if (entity == null) {
            return null;
        }

        // Entity → DTO conversion
        EmployeeDTO dto = new EmployeeDTO();
        dto.setName(entity.getName());
        dto.setDept(entity.getDept());
        dto.setAge(entity.getAge());

        return dto;
    }
}
