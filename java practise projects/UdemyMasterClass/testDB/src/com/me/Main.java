package com.me;

import java.sql.*;

public class Main {

    public static final String DB_Name = "testJava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/sayyidiskandarkhan/github/coding_practise/java practise projects/UdemyMasterClass/testDB/src/com/me/"
            + DB_Name;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {

        try(Connection conn = DriverManager.getConnection(CONNECTION_STRING)){
            //conn.setAutoCommit(false); //files executed to the database is not automatically save
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                                   " (" + COLUMN_NAME + " text, " +
                                          COLUMN_PHONE + " integer, " +
                                          COLUMN_EMAIL + " text" +
                                   ")");

            // insert SQL statement
            insertContact(statement,"tim",6545678,"tim@email.com");
            insertContact(statement,"joe",45632,"joe@anywhere.com");
            insertContact(statement,"jane",4829484,"jane@anywhere.com");
            insertContact(statement,"fido",9038,"fido@anywhere.com");


            // update SQL statement
            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + " =5566789 " +
                    " WHERE " + COLUMN_NAME + " ='jane' " );

            // delete SQL statement
            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                    " WHERE " + COLUMN_NAME + " = 'joe' ");

            /// select SQL statement
//            statement.execute("select * from contacts");
//            ResultSet results = statement.getResultSet();

            // using executeQuery to shortcut the exceute select statement function
            ResultSet results = statement.executeQuery("SELECT * from " + TABLE_CONTACTS);

            // results will go through each record
            while(results.next()){
                System.out.println(results.getString(COLUMN_NAME) + " " +
                                   results.getInt(COLUMN_PHONE) + " " +
                                   results.getString(COLUMN_EMAIL));
            }

            //to close the select statement result
            results.close();


            // close the statement instance first followed by conn instance
            statement.close();
            conn.close();
        }
        catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {

        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + "," +
                COLUMN_EMAIL + ") " +
                "VALUES('"+ name +"'," + phone + ",'" + email + "')");

    }

}
