/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.dto;

import java.text.SimpleDateFormat;
import java.util.Vector;
import lab3.dao.ManagerDAO;

/**
 *
 * @author PC
 */
public class EmployeeData {
  
    
    public static Vector getAllEmp() throws Exception{
        String sqlStatement="select empID, fullname, phone, email, address, dateOfBirth, isDelete from tblEmployee";
        Vector empList=ManagerDAO.executeQuery(sqlStatement, 7);
        return empList;
    }
    public static boolean insertEmp(Employee emp) throws Exception{
        boolean result=false;
        String sql="insert into tblEmployee values(?,?,?,?,?,?,?)";
        String date=new SimpleDateFormat("MM/dd/yyyy").format(emp.getDateOfBirth());
        result=ManagerDAO.executeNonQuery(sql,emp.getEmpID(),emp.getFullname(),emp.getPhone(),
                emp.getEmail(),emp.getAddress(),date,emp.isIsDelete());
        return result;
    }
    
    public static boolean updateEmp(Employee emp) throws Exception{
        boolean result=false;
        String sql="update tblEmployee set fullname=?, phone=?, email=?, address=?, dateOfBirth=?, isDelete=? "
                + "where empID=?";
        String date=new SimpleDateFormat("MM/dd/yyyy").format(emp.getDateOfBirth());
        
        result=ManagerDAO.executeNonQuery(sql, emp.getFullname(),emp.getPhone(), emp.getEmail(), emp.getAddress(),
                date, emp.isIsDelete(),emp.getEmpID());
        return result;
    }
    public static boolean deleteEmp(String empID) throws Exception{
        boolean result=false;
        String sql="delete from tblEmployee where empID=?";
        result=ManagerDAO.executeNonQuery(sql, empID);
        return result;
    }
}
