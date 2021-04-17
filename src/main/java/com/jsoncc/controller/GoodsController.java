package com.jsoncc.controller;

import com.jsoncc.pojo.Goods;
import com.jsoncc.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Author: jsonCC
 * Date: 2021/4/16 20:35
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    @Qualifier("GoodsServiceImpl")
    private GoodsService goodsService;

    @RequestMapping("/allGoods")
    public String list(Model model) {
        List<Goods> list = goodsService.queryAllGoods();
        model.addAttribute("list", list);
        return "allGoods";
    }
}
