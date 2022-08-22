package com.kodilla.kodillahibernate.manytomany.dao.facade;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.Employee;
import com.kodilla.kodillahibernate.manytomany.facade.SearchCompanyException;
import com.kodilla.kodillahibernate.manytomany.facade.SearchEmployeeException;
import com.kodilla.kodillahibernate.manytomany.facade.SearchingFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class SearchingFacadeTestSuite {

    @Autowired
    private SearchingFacade searchingFacade;

    @Test
    void testSearchingFacadeForCompany() {
        //Given
        List<Company> companiesFound = new ArrayList<>();

        //When
        try {
            companiesFound = searchingFacade.findCompany("FO");
        }catch (SearchCompanyException e) {
            System.out.println("Exception handling " + e.getMessage());
        }

        //Then
        Assertions.assertEquals(1, companiesFound.size());
        Assertions.assertEquals("Ford", companiesFound.get(0).getName());
    }

    @Test
    void testSearchingFacadeForEmployee() {
        //Given
        List<Employee> employeesFound = new ArrayList<>();

        //When
        try {
            employeesFound = searchingFacade.findEmployee("Kowa");
        }catch (SearchEmployeeException e) {
            System.out.println("Exception handling " + e.getMessage());
        }

        //Then
        Assertions.assertEquals(1, employeesFound.size());
        Assertions.assertEquals("Kowalski", employeesFound.get(0).getLastname());
    }

}
