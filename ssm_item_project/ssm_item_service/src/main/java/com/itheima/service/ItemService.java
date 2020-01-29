package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @Author:Asus
 * @Date:2020/1/29/15:08
 */

public interface ItemService {
    Items findById(Integer id);

    void updateItems(Items items);

    List<Items> queryItems();
}
