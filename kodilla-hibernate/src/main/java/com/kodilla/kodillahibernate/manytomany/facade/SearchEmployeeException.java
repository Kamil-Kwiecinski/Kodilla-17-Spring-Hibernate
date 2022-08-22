package com.kodilla.kodillahibernate.manytomany.facade;

public class SearchEmployeeException extends Exception{

    public final static String ERR_EMPLOYEE_NOT_FOUND = "Employee not found";

    public SearchEmployeeException(String message) {
        super(message);
    }
}
