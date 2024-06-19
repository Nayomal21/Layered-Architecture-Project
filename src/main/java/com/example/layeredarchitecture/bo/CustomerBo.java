package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBo {

    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException ;

    public  boolean saveCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException ;

    public boolean  updateCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException ;
    public  boolean  existCustomer(String id) throws SQLException, ClassNotFoundException;

    public void  deleteCustomer(String id) throws SQLException, ClassNotFoundException ;

    public String  lastCustomerId() throws SQLException, ClassNotFoundException ;
    public CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException ;


    public ArrayList<String> loadCustomerIds() throws SQLException, ClassNotFoundException ;

}
