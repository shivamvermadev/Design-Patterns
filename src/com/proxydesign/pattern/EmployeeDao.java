package com.proxydesign.pattern;

public interface EmployeeDao {
    void create(String client, EmployeeDo obj) throws Exception;
    void delete(String client, int employeeId) throws Exception;
    EmployeeDo get(String client, int employeeId) throws Exception;
}
