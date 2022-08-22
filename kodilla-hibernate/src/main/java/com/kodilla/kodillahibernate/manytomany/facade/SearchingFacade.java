package com.kodilla.kodillahibernate.manytomany.facade;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.Employee;
import com.kodilla.kodillahibernate.manytomany.dao.CompanyDao;
import com.kodilla.kodillahibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchingFacade {

    private final Logger companyLogger = LoggerFactory.getLogger(Company.class);
    private final Logger employeeLogger = LoggerFactory.getLogger(Employee.class);
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public SearchingFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> findCompany(final String text) throws SearchCompanyException {
        companyLogger.info("Starting to search company by : " + text);
        List<Company> companies = companyDao.findCompanyByAnyText(text);

        if (companies.size() == 0) {
            companyLogger.warn("Company not found");
            throw new SearchCompanyException(SearchCompanyException.ERR_COMPANY_NOT_FOUND);
        }
        return companies;
    }

    public List<Employee> findEmployee(final String text) throws SearchEmployeeException {
        employeeLogger.info("Starting to search employee by : " + text);
        List<Employee> employees = employeeDao.findEmployeeByAnyText(text);

        if(employees.size() == 0) {
            employeeLogger.warn("Employee not found");
            throw new SearchEmployeeException(SearchEmployeeException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return employees;
    }
}
