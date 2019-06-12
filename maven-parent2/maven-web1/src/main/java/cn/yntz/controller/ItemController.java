package cn.yntz.controller;

import cn.yntz.domain.Items;
import cn.yntz.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: Baiyu
 * @modified By:
 * @version: 1.0
 */
@Controller
@RequestMapping("item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("findOne")
    public String findOne(Integer id, Model model){
        Items items=itemService.findOne(id);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
