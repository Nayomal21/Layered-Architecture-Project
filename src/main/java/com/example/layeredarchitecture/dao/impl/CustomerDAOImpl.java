package com.example.layeredarchitecture.dao.impl;

import com.example.layeredarchitecture.dao.CustomerDAO;
import com.example.layeredarchitecture.dao.custom.SQLUtil;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {


    @Override
    public   ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {


        ArrayList<CustomerDTO> arrayList = new ArrayList<>();
        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer");

        while (rst.next()){

            String id = rst.getString(1);
            String name = rst.getString(2);
            String address = rst.getString(3);

            arrayList.add(new CustomerDTO(id,name,address));


        }

        return arrayList;
    }

    public  boolean save(CustomerDTO customer) throws SQLException, ClassNotFoundException {

    return     SQLUtil.execute("INSERT INTO Customer (id,name, address) VALUES (?,?,?)",customer.getId(),
                customer.getName(),
                customer.getAddress());

    }
    @Override
    public boolean  update(CustomerDTO customer) throws SQLException, ClassNotFoundException {



  return       SQLUtil.execute("UPDATE Customer SET name=?, address=? WHERE id=?",customer.getId(),
                customer.getName(),
                customer.getAddress());
}
    @Override
    public  boolean  exist(String id) throws SQLException, ClassNotFoundException{


        ResultSet execute = SQLUtil.execute("SELECT id FROM Customer WHERE id=?", id);
        return  execute.next();

    }
    @Override
    public boolean  delete(String id) throws SQLException, ClassNotFoundException {
      return   SQLUtil.execute("DELETE FROM Customer WHERE id=?",id);

}
    @Override
    public String  lastId() throws SQLException, ClassNotFoundException {


  ResultSet rst = SQLUtil.execute("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");

        if (rst.next()){
         return rst.getString(1);
        }return null;
    }
    @Override
    public CustomerDTO search(String newValue) throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer WHERE id=?",newValue+"");
    rst.next();
        return  new CustomerDTO(newValue + "", rst.getString("name"), rst.getString("address"));


    }
    @Override

    public ArrayList<String> loadCustomerIds() throws SQLException, ClassNotFoundException {

        ArrayList<String> arrayList = new ArrayList<>();
        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer");

        while (rst.next()){
            arrayList.add(rst.getString(1));


        }
            return arrayList;
    }

}
