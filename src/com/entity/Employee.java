package com.entity;

import java.util.List;

import com.util.Role;

public class Employee {

    private int id;
    private String name;
    private List<Role> roles;
    private Employee supervisor;

    public Employee(int id, String name, List<Role> roles, Employee supervisor) {
        this.id = id;
        this.name = name;
        this.roles = roles;
        this.supervisor = supervisor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }
}
