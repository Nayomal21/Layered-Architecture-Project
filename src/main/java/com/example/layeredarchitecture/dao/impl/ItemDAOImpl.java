package com.example.layeredarchitecture.dao.impl;

import com.example.layeredarchitecture.dao.ItemDAO;
import com.example.layeredarchitecture.dao.custom.SQLUtil;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public class ItemDAOImpl  implements ItemDAO {
    @Override
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {

        ArrayList<ItemDTO> arlist = new ArrayList<>();


        ResultSet rst = SQLUtil.execute("SELECT * FROM Item");
        
        while (rst.next()){

            String code = rst.getString(1);
            String des = rst.getString(2);
            BigDecimal unitPrice = rst.getBigDecimal(4);
            int qty = rst.getInt(3);

            arlist.add(new ItemDTO(code,des,unitPrice,qty));

        }
        return  arlist;
    }
    @Override
public  boolean delete(String code) throws SQLException, ClassNotFoundException {


return    SQLUtil.execute("DELETE FROM Item WHERE code=?",code);

}
    @Override
    public boolean save(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
    return  SQLUtil.execute("INSERT INTO Item (code, description, unitPrice, qtyOnHand) VALUES (?,?,?,?)",itemDTO.getCode(),
            itemDTO.getDescription(),
            itemDTO.getUnitPrice(),
            itemDTO.getQtyOnHand());


    }
    @Override
    public boolean update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {

     return    SQLUtil.execute("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?",
               itemDTO.getDescription(),
               itemDTO.getUnitPrice(),
               itemDTO.getQtyOnHand(),itemDTO.getCode());



    }
    @Override
    public boolean exist(String code) throws SQLException, ClassNotFoundException {
      ResultSet rst=   SQLUtil.execute("SELECT code FROM Item WHERE code=?",code);

        return rst.next();
    }
    @Override
    public String lastId() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT code FROM Item ORDER BY code DESC LIMIT 1;");
        if (rst.next()) {
            String id = rst.getString("code");
            int newItemId = Integer.parseInt(id.replace("I00-", "")) + 1;
            return String.format("I00-%03d", newItemId);
        }return  null;
    }
    @Override
    public ItemDTO search(String s) throws SQLException, ClassNotFoundException {


        ResultSet rst = SQLUtil.execute(("SELECT * FROM Item WHERE code=?"),s);
        if (rst.next()){
            String code = rst.getString(1);
            String des = rst.getString(2);
            int qty = rst.getInt(3);
            BigDecimal unitPrice = rst.getBigDecimal(4);

            return new ItemDTO(code,des,unitPrice,qty);

        }
        return  null;
    }
    @Override
    public ArrayList<String> loadItemIds() throws SQLException, ClassNotFoundException {
        ArrayList<String> arrayList = new ArrayList<>();


        ResultSet rst = SQLUtil.execute("SELECT * FROM Item");

        while (rst.next()){
            arrayList.add(rst.getString(1));


        }
        return arrayList;

    }


}
