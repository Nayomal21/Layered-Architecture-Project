package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.dao.custom.CrudDAO;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO extends CrudDAO<CustomerDTO> {

    public ArrayList<String> loadCustomerIds() throws SQLException, ClassNotFoundException ;

}
