package simpleupdate;

//SQL: create schema if not exists employees default character set utf8 collate utf8_hungarian_ci;
//
//create user 'employees'@'localhost' identified by 'employees';
//grant all on employees.* to 'employees'@'localhost';


import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;


public class EmployessMain {

    public static void main(String[] args) {



        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot create datasource", se);
        }



       try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("insert into employees(emp_name) values (?)")) {
            stmt.setString(1, "Kovács Pistike");
            stmt.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot execute the insertions", se);
        }



        try (Connection conn = dataSource.getConnection();
             Statement ps = conn.createStatement();
             ResultSet rs = ps.executeQuery("SELECT id, emp_name FROM employees")
        ) {
                while (rs.next()) {
                    long gotLongid = rs.getLong("id");
                    String name = rs.getString("emp_name");
                    System.out.println(gotLongid + " " + name);
                }
        }
        catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query", sqle);
        }








    }



}
