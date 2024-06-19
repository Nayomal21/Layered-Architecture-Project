package com.example.layeredarchitecture.bo.impl;

import com.example.layeredarchitecture.bo.ItemBo;
import com.example.layeredarchitecture.dao.CustomerDAO;
import com.example.layeredarchitecture.dao.ItemDAO;
import com.example.layeredarchitecture.dao.custom.SQLUtil;
import com.example.layeredarchitecture.dao.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.dao.impl.ItemDAOImpl;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBoImpl implements ItemBo {

    ItemDAO itemDAO = new ItemDAOImpl();

@Override
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException {

       return itemDAO.getAll();
    }
@Override
    public  boolean deleteItem(String code) throws SQLException, ClassNotFoundException {


        return itemDAO.delete(code);
    }
@Override
    public boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
  return  itemDAO.save(itemDTO);

    }
@Override
    public boolean updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {

        return   itemDAO.update(itemDTO);



    }
@Override
    public boolean existItem(String code) throws SQLException, ClassNotFoundException {
       return  itemDAO.exist(code);
    }
@Override
    public String lastItemId() throws SQLException, ClassNotFoundException {
      return itemDAO.lastId();
    }
@Override
    public ItemDTO searchItem(String s) throws SQLException, ClassNotFoundException {

return  itemDAO.search(s);
    }
@Override
    public ArrayList<String> loadItemIds() throws SQLException, ClassNotFoundException {
       return  itemDAO.loadItemIds();

    }

}
