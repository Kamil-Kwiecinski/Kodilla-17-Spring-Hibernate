package com.kodilla.kodillahibernate.manytomany.dao;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        //try {
        //    companyDao.deleteById(softwareMachineId);
        //    companyDao.deleteById(dataMaestersId);
        //    companyDao.deleteById(greyMatterId);
        //} catch (Exception e) {
        //    //do nothing
        //}
    }

    @Test
    void testNamedQueryForEmployeeAndCompany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee billGates = new Employee("Bill", "Gates");
        Employee elonMusk = new Employee("Elon", "Musk");

        Company company1 = new Company("1Company");
        Company company2 = new Company("2Company");
        Company company3 = new Company("3Company");

        company1.getEmployees().add(johnSmith);
        company1.getEmployees().add(billGates);
        company2.getEmployees().add(elonMusk);
        company2.getEmployees().add(johnSmith);
        company3.getEmployees().add(elonMusk);

        johnSmith.getCompanies().add(company1);
        johnSmith.getCompanies().add(company2);
        billGates.getCompanies().add(company1);
        elonMusk.getCompanies().add(company2);
        elonMusk.getCompanies().add(company3);

        //When
        companyDao.save(company1);
        int softwareMachineId = company1.getId();
        companyDao.save(company2);
        int dataMaestersId = company2.getId();
        companyDao.save(company3);
        int greyMatterId = company3.getId();

        List<Employee> employes = employeeDao.retriveEmployeeByLastName("Gates");
        List<Company> companies = companyDao.retriveCompanyByFirstThreeLetters("1Com");

        //Then
        assertEquals(1, employes.size());
        assertEquals(1, companies.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
