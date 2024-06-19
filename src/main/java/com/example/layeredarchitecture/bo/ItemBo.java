package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBo {


    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException ;
    public  boolean deleteItem(String code) throws SQLException, ClassNotFoundException ;

    public boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    public boolean updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    public boolean existItem(String code) throws SQLException, ClassNotFoundException ;

    public String lastItemId() throws SQLException, ClassNotFoundException ;

    public ItemDTO searchItem(String s) throws SQLException, ClassNotFoundException ;

    public ArrayList<String> loadItemIds() throws SQLException, ClassNotFoundException ;
}
