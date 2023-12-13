package com.proxydesign.pattern;

public class ProxyDesignPattern {
    public static void main(String[] args) throws Exception {
        EmployeeDao employeeDao = new EmployeeDaoProxy();
        employeeDao.create("USER", new EmployeeDo());
    }
}
