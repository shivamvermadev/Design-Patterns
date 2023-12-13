package com.proxydesign.pattern;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("Created new row in Employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("deleted row with employeeId " + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("fetching data from the DB");
        return new EmployeeDo();
    }
}
