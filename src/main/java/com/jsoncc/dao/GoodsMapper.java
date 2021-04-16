package com.jsoncc.dao;

import com.jsoncc.pojo.Goods;

import java.util.List;

/**
 * Author: jsonCC
 * Date: 2021/4/15 15:04
 */
public interface GoodsMapper {
    int addGoods(Goods goods);
    List<Goods> queryAllGoods();
}
