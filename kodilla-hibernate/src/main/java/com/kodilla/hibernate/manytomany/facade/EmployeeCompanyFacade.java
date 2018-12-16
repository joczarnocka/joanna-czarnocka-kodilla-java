package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeCompanyFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeCompanyFacade.class);
    public static final String ERR_RETRIEVE_ERROR = "Cannot retriiving data";


    List<Company> findCompanyBySubstring(String text) {
        try {
            return companyDao.retrieveCompaniesWithSubstring(text);
        } catch (Exception e) {
            LOGGER.error(ERR_RETRIEVE_ERROR, e);
            return new ArrayList<Company>();
        }
    }

    List<Employee> findEmployeeBySubstring(String text) {
        try {
            return employeeDao.retrieveWithLastnameSubstring(text);
        } catch (Exception e) {
            LOGGER.error(ERR_RETRIEVE_ERROR, e);
            return new ArrayList<Employee>();
        }
    }
}
