package com.kodilla.kodillahibernate.manytomany.facade;

public class SearchCompanyException extends Exception{

    public final static String ERR_COMPANY_NOT_FOUND = "Company not found";

    public SearchCompanyException(String message) {
        super(message);
    }
}
