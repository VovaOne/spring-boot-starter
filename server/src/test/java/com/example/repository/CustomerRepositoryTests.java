package com.example.repository;

import com.example.AppDev;
import com.example.repository.entity.Customer;
import com.example.repository.repository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(AppDev.class)
public class CustomerRepositoryTests {

    @Autowired
    CustomerRepository repository;

    @Test
    @Sql(scripts = {"/com/example/repository/test-data.sql"}) // insert 2 Customer
    public void findByLastNameTest() {
        Customer jack = repository.findOne(1L);
        assertEquals("Jack", jack.getFirstName());
    }

}
