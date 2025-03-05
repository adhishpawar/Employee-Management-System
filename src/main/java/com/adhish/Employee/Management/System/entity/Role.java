package com.adhish.Employee.Management.System.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roleName;

    @OneToOne(mappedBy = "role")
    private Employee employee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role(Long id, String roleName, Employee employee) {
        this.id = id;
        this.roleName = roleName;
        this.employee = employee;
    }

    public Role()
    {

    }
}

