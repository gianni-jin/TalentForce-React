package com.giannijin.TalentForce.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "departmentId")
@Table(name = "tbl_departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("departmentId")
    @Column (name = "departmentId")
    @Setter private Long departmentId;


    @Column (name = "name")
    @Setter private String name;



    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    @JsonProperty("employees")
    private List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
        employee.setDepartment(this);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
        employee.setDepartment(null);
    }


}
