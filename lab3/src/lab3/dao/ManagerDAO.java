/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import lab3.utils.MyConnection;

/**
 *
 * @author PC
 */
public class ManagerDAO {

    public static Vector executeQuery(String sqlStatement, int columnNumber, Object... values) throws Exception {
        Connection conn = null;
        PreparedStatement preStm = null;
        ResultSet rs = null;
        Vector list = null;
        try {
            conn = MyConnection.getConnection();
            list = new Vector();
            preStm = conn.prepareStatement(sqlStatement);
            rs = preStm.executeQuery();
            while (rs.next()) {
                Vector data = new Vector();
                for (int i = 1; i <= columnNumber; i++) {
                    data.add(rs.getString(i));
                }
                list.add(data);
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            rs.close();
            preStm.close();
            conn.close();
        }

        return list;
    }

    public static boolean executeNonQuery(String sqlStatement, Object... values) throws Exception {
        boolean result = false;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = MyConnection.getConnection();
            ps = conn.prepareStatement(sqlStatement);
            for (int i = 0; i < values.length; i++) {
                ps.setObject(i + 1, values[i]);
            }
            result = (ps.executeUpdate() > 0);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            ps.close();
            conn.close();
        }
        return result;
    }
}
