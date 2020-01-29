package com.itheima.mapper;

import com.itheima.pojo.Items;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author:Asus
 * @Date:2020/1/29/14:17
 */
public interface ItemMapper {

    Items findById(Integer id);

    void updateItems(Items items);

    List<Items> queryItems();
}
