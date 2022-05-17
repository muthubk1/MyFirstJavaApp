package com.java.clone;

public class Employee implements Cloneable {

    private String name;
    private int age;
    private Company company;

    public Employee(String name, int age, Company company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Company c1 = new Company("Company_ABC");
        Employee e1 = new Employee("Mike",10, c1);

        System.out.println("Employee 1, Company 1:"+ e1.getCompany().getCompanyName());
        Employee e2 = (Employee) e1.clone();
        System.out.println("Employee 2, Company 1:"+ e2.getCompany().getCompanyName());
        e2.getCompany().setCompanyName("Company_XYZ");
        System.out.println("---------------------------------------------------------");
        System.out.println("Employee 1, Company 2:"+ e1.getCompany().getCompanyName());
        System.out.println("Employee 2, Company 2:"+ e2.getCompany().getCompanyName());
    }
}
