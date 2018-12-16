package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeCompanyFacadeTestSuite {

    @Autowired
    private EmployeeCompanyFacade facade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;


    @Test
    public void testFacadeFindCompanyBySubstring(){
        //Given
        Employee johnSmith = new Employee("John", "Smith2");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson2");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky2");

        Company softwareMachine = new Company("Software Machine2");
        Company dataMaesters = new Company("Data Maesters2");
        Company greyMatter = new Company("Grey Matter2");

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

        List<Company> compList = facade.findCompanyBySubstring("Ma");
        //Then
        Assert.assertEquals(3,compList.size());

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e){

        }
        //companyDao.deleteAll();
        //employeeDao.deleteAll();

    }

    @Test
    public void testFacadeFindEmployeeBySubstring(){
        //Given
        Employee johnSmith = new Employee("John", "Smith2");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson2");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky2");

        Company softwareMachine = new Company("Software Machine2");
        Company dataMaesters = new Company("Data Maesters2");
        Company greyMatter = new Company("Grey Matter2");

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

        List<Employee> empList = facade.findEmployeeBySubstring("l");
        //Then
        Assert.assertEquals(2,empList.size());

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e){

        }
        //companyDao.deleteAll();
        //employeeDao.deleteAll();

    }

}
