package com.example.layeredarchitecture.dao.impl;

import com.example.layeredarchitecture.dao.OrderDetailsDAO;
import com.example.layeredarchitecture.dao.custom.SQLUtil;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailsDAOImpl  implements OrderDetailsDAO {


    @Override
    public ArrayList<OrderDetailDTO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean save( OrderDetailDTO orderDetailDTO) throws SQLException, ClassNotFoundException {

       return  SQLUtil.execute("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)",
               orderDetailDTO.getOid(),
               orderDetailDTO.getItemCode(),
               orderDetailDTO.getUnitPrice(),
               orderDetailDTO.getQty()

               );


    }

    @Override
    public boolean update(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
return  false;
    }

    @Override
    public String lastId() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public OrderDetailDTO search(String newValue) throws SQLException, ClassNotFoundException {
        return null;
    }


}

