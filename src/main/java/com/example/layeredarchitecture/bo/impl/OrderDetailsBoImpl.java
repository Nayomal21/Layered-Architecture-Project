package com.example.layeredarchitecture.bo.impl;

import com.example.layeredarchitecture.bo.OrderDetailsBo;
import com.example.layeredarchitecture.dao.OrderDAO;
import com.example.layeredarchitecture.dao.OrderDetailsDAO;
import com.example.layeredarchitecture.dao.custom.SQLUtil;
import com.example.layeredarchitecture.dao.impl.OrderDAOImpl;
import com.example.layeredarchitecture.dao.impl.OrderDetailsDAOImpl;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public class OrderDetailsBoImpl implements OrderDetailsBo {
   OrderDetailsDAO orderDAO =  new OrderDetailsDAOImpl();
@Override
    public boolean saveOrderdetail( OrderDetailDTO orderDetailDTO) throws SQLException, ClassNotFoundException {

return  orderDAO.save(orderDetailDTO);




    }

}
