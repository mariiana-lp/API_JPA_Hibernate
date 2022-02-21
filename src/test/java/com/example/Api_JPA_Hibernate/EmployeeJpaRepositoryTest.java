package com.example.Api_JPA_Hibernate;

import com.example.Api_JPA_Hibernate.Model.EmployeeModel;
import com.example.Api_JPA_Hibernate.Repositories.IntEmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest //solo para la capa Jpa
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeJpaRepositoryTest {

    @Autowired
    private IntEmployeeRepository employeeRepo;

    @Test
    public void saveEmployee(){
        EmployeeModel mariana = new EmployeeModel("Mariana", "Lopez", "empl100");
        EmployeeModel isabella = new EmployeeModel("Isabella", "Perez", "empl101");

        employeeRepo.save(mariana);
        employeeRepo.save(isabella);

        employeeRepo.flush();

        assertEquals(2, employeeRepo.findAll().size());
    }
}
