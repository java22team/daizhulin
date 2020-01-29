package com.itheima.service.impl;

import com.itheima.mapper.ItemMapper;
import com.itheima.pojo.Items;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Asus
 * @Date:2020/1/29/15:08
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public Items findById(Integer id) {
        return itemMapper.findById(id);
    }

    @Override
    public void updateItems(Items items) {
        itemMapper.updateItems(items);
    }

    @Override
    public List<Items> queryItems() {
        return itemMapper.queryItems();
    }
}
