package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public interface OrderDetailsBo {

    public boolean saveOrderdetail( OrderDetailDTO orderDetailDTO) throws SQLException, ClassNotFoundException ;
}
