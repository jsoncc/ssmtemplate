package com.jsoncc.service;

import com.jsoncc.pojo.Goods;

import java.util.List;

/**
 * Author: jsonCC
 * Date: 2021/4/15 15:14
 */
public interface GoodsService {
    //添加一个Goods
    int addGoods(Goods goods);

    //查询所有的Goods，返回List集合
    List<Goods> queryAllGoods();

}
