package com.example.layeredarchitecture.bo.impl;

import com.example.layeredarchitecture.bo.OrderBo;
import com.example.layeredarchitecture.dao.OrderDAO;
import com.example.layeredarchitecture.dao.custom.SQLUtil;
import com.example.layeredarchitecture.dao.impl.OrderDAOImpl;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderBoImpl  implements OrderBo {


OrderDAO orderDAO = new OrderDAOImpl();

    public String lastOrderId() throws SQLException, ClassNotFoundException {
        return  orderDAO.lastId();
    }


    public OrderDTO searchOrder(String newValue) throws SQLException, ClassNotFoundException {
        return  orderDAO.search(newValue);
    }


    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException {
        return  orderDAO.exist(orderId);
    }


    public boolean deleteOrder(String id) throws SQLException, ClassNotFoundException{
        return  orderDAO.delete(id);
    }


    public ArrayList<OrderDTO> getAllOrders() throws SQLException, ClassNotFoundException {
        return  orderDAO.getAll();
    }


    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return orderDAO.save(dto);
    }


    public boolean updateOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return  orderDAO.update(dto);
    }





}
