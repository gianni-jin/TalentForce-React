package com.giannijin.TalentForce.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.giannijin.TalentForce.model.enums.ContractType;
import com.giannijin.TalentForce.model.enums.EmploymentStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.math.BigDecimal;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "employeeId")
@Entity
@Table(name = "tbl_employee")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("employeeId")
    @Column(name = "employeeId")
    private Long employeeId;

    @NotBlank(message = "First name should not be null")
    @Column(name = "first_name")
    private String firstName;

    @NotBlank(message = "Last name should not be null")
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Long age = 0L;

    @Column(name = "gender")
    @Pattern(regexp = "^(M|F)$", message = "Invalid gender, insert 'M' for male, and 'F' for female")
    private String gender;

    @Column(name = "location")
    private String location;

    @Column(name = "email")
    private String email;


    @Column(name = "leave_days_left")
    private Integer leaveDaysLeft = 0;

    @Enumerated(EnumType.STRING)
    @Column(name = "contract_type")
    private ContractType contractType;

    @Column(name = "salary")
    private BigDecimal salary = BigDecimal.ZERO;

    @Column(name = "hire_date")
    private String hireDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "employment_status")
    private EmploymentStatus employmentStatus;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "department_id")
    private Department department;

    public void setDepartment(Department department) {
        if (department == null) {
            if (this.department != null) {
                this.department.getEmployees().remove(this);
            }
        } else {
            department.getEmployees().add(this);
        }
        this.department = department;
    }
}
