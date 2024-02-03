/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author johnn
 */
public class Tables
        
{
    public static void main(String[] args) 
    {
        Connection con = null;
        Statement st = null;
        try
        {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("CREATE TABLE users ("
                    + "name VARCHAR(200), "
                    + "email VARCHAR(200), "
                    + "password VARCHAR(50), "
                    + "securityQuestion VARCHAR(500), "
                    + "answer VARCHAR(200), "
                    + "address VARCHAR(200), "
                    + "status VARCHAR(20))");
st.executeUpdate ("create table room (roomNo varchar (10) , roomType varchar (200) , bed varchar (200),price int, status varchar(20)) ");
st.executeUpdate("CREATE TABLE customer (id INT, name VARCHAR(200), mobileNumber VARCHAR(20), nationality VARCHAR(200), gender VARCHAR(50), email VARCHAR(200), idProof VARCHAR(200), address VARCHAR(200), checkIn VARCHAR(50), roomNo VARCHAR(10), bed VARCHAR(200), roomType VARCHAR(200), pricePerDay INT(10), numberOfDaysStay INT(10), totalAmount VARCHAR(200), checkOut VARCHAR(50))");
            JOptionPane.showMessageDialog(null, "Table createOd successfully");

        }
            catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
                con.close();
                st.close();
            }
            catch (Exception e)
            {

            }

        }
    }
}