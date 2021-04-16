/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.dto;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Employee {
    String empID;
    String fullname;
    String phone;
    String email;
    String address;
    Date dateOfBirth;
    boolean isDelete;

    public Employee() {
    }

    public Employee(String empID, String fullname, String phone, String email, String address, Date dateOfBirth, boolean isDelete) {
        this.empID = empID;
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.isDelete = isDelete;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Employee{" + "empID=" + empID + ", fullname=" + fullname + ", phone=" + phone + ", email=" + email + ", address=" + address + ", dateOfBirth=" + dateOfBirth + ", isDelete=" + isDelete + '}';
    }
    
}
