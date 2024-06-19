package com.example.layeredarchitecture.bo.impl;

import com.example.layeredarchitecture.bo.CustomerBo;
import com.example.layeredarchitecture.dao.CustomerDAO;
import com.example.layeredarchitecture.dao.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBoImpl  implements CustomerBo {
 CustomerDAO customerDAO = new CustomerDAOImpl();
 @Override

    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException {

        return  customerDAO.getAll();    }
@Override

    public  boolean saveCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException {

        return   customerDAO.save(customer);

    }
@Override

    public boolean  updateCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException {



        return      customerDAO.update(customer);
    }
@Override

    public  boolean  existCustomer(String id) throws SQLException, ClassNotFoundException{


        return  customerDAO.exist(id);

    }
@Override

    public void  deleteCustomer(String id) throws SQLException, ClassNotFoundException {
customerDAO.delete(id);
    }
@Override

    public String  lastCustomerId() throws SQLException, ClassNotFoundException {

return  customerDAO.lastId();
    }
@Override

    public CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException {
return  customerDAO.search(newValue);

    }
@Override

    public ArrayList<String> loadCustomerIds() throws SQLException, ClassNotFoundException {

     return  customerDAO.loadCustomerIds();
    }

}
