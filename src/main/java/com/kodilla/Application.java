package com.kodilla;

interface Employee {

    double calculateSalary();

}

// Pracownika zarabiającego 5 zł za stworzenie jednego produktu,
class ItemsSalaryEmployee implements Employee {

    private int items;

    private double salaryPerItem;

    public  ItemsSalaryEmployee(int items, double salaryPerItem) {
        this.items = items;
        this.salaryPerItem = salaryPerItem;
    }

    public double calculateSalary() {
        return this.items * this.salaryPerItem;
    }

}


// Pracownika, który zarabia pensję podstawową 2000zł i 20% tej pensji jeżeli
//zrealizuje dodatkową sprzedaż dowolnego produktu
class ProvisionSalaryEmployee implements Employee {

    double basicSalary;
    double percentage;
    boolean realized;

    public  ProvisionSalaryEmployee(double basicSalary, double percentage, boolean realized) {
        this.basicSalary= basicSalary;
        this.percentage = percentage;
        this.realized = realized;
    }

    public double calculateSalary() {
        return this.basicSalary
                + ((this.realized) ? this.percentage/100 * this.basicSalary : 0);
    }

}


class FixedSalaryEmployee implements Employee {

    private double salary;

    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }

}

class HourlySalaryEmployee implements Employee {

    private double hours;
    private double hourlyPay;

    public HourlySalaryEmployee(double hours, double hourlyPay) {
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }

    public double calculateSalary() {
        return this.hourlyPay * this.hours;
    }

}

// Payout
interface SalaryPayout {

    //private Employee employee;

//    public SalaryPayout(Employee employee); {
//        this.employee = employee;
//    }

    void payout();

    default void processPayout(Employee employee) {
        System.out.println("Creating payout for: " + employee.calculateSalary() + " PLN");
        this.payout();
        System.out.println("Payout has been completed!");
    }

}

class SalaryPayoutProcessor implements SalaryPayout {

//    public SalaryPayoutProcessor(Employee employee) {
//        super(employee);
//    }

    public void payout() {
        System.out.println("Sending money to employee");
    }

}

class Application {

    public static void main(String args[]) {

        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000);
        HourlySalaryEmployee employee1 = new HourlySalaryEmployee(40, 19);

        ItemsSalaryEmployee employee2 = new ItemsSalaryEmployee(1,5);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor();
        processor.processPayout(employee2);


        ProvisionSalaryEmployee employee3 = new ProvisionSalaryEmployee(2000, 20, true);

        //SalaryPayoutProcessor processor2 = new SalaryPayoutProcessor(employee3);
        processor.processPayout(employee3);

    }

}