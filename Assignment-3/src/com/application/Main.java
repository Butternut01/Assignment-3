package com.application;

import java.sql.Connection;
import java.sql.Statement;

public class Main {
    public static void main(String[] args){
        DbFunctions db=new DbFunctions();
        Connection conn=db.connect_to_db("tutdb","postgres","Bayadilov06a");
        //db.createTable(conn,"employee");
        //db.insert_row(conn,"employee","Asylzhan","Kazakhstan");
        //db.delete_row_by_id(conn,"employee",5);
        //db.read_data(conn,"employee");
        //db.search_by_name(conn,"employee","Asylzhan");
        //db.update_name(conn,"employee","Alibek","Miras");
        db.search_by_id(conn, "employee",2);
        //db.delete_table(conn,"employee");
    }


}