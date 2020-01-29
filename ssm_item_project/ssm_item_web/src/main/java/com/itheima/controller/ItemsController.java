package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author:Asus
 * @Date:2020/1/29/15:39
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/editItems")
    public String editItems(Integer id, Model model){
        Items items = itemService.findById(id);
        model.addAttribute("items",items);
        return "editItems";
    }
    @RequestMapping(value = "/updateItems",method= RequestMethod.POST)
    public String updateItems(@RequestParam("pictureFile") MultipartFile file,
                              @RequestParam("id") Integer id,
                              @RequestParam("name") String name,
                              @RequestParam("price") Float price,
                              @RequestParam("createtime") Date createtime,
                              @RequestParam("detail") String detail,
                              Model model, HttpServletRequest request) throws IOException {
        Items items = new Items();
        items.setPrice(price);
        items.setId(id);
        items.setCreatetime(createtime);
        items.setDetail(detail);
        items.setName(name);
        if (file!=null){
            String fileName = UUID.randomUUID().toString().replaceAll("-","")+file.getOriginalFilename();
            String filePath = request.getSession().getServletContext().getRealPath("/pic");//文件存储路径
            file.transferTo(new File(filePath+ File.separator + fileName));  //进行写入文件
        }
        System.out.println(items);
        itemService.updateItems(items);
        List<Items> itemsList = itemService.queryItems();
        model.addAttribute("itemsList",itemsList);
        return "itemsList";
    }
    @RequestMapping("/queryItems")
    public String queryItems(Model model){
        List<Items> itemsList = itemService.queryItems();
        model.addAttribute("itemsList",itemsList);
        return "itemsList";
    }
}
