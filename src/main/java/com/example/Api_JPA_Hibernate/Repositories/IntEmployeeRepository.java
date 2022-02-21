package com.example.Api_JPA_Hibernate.Repositories;

import com.example.Api_JPA_Hibernate.Model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IntEmployeeRepository extends JpaRepository <EmployeeModel,Long>{
    Optional<EmployeeModel> findById (Long id);

}
