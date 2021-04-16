package com.jsoncc.service;

import com.jsoncc.dao.GoodsMapper;
import com.jsoncc.pojo.Goods;

import java.util.List;

/**
 * Author: jsonCC
 * Date: 2021/4/15 15:18
 */
public class GoodsServiceImpl implements GoodsService {
    //调用dao层的操作，设置一个set接口，方便Spring管理
    private GoodsMapper goodsMapper;

    public void setGoodsMapper(GoodsMapper goodsMapper) {
        this.goodsMapper = goodsMapper;
    }

    //添加一个Goods
    public int addGoods(Goods goods) {
        return goodsMapper.addGoods(goods);
    }

    public List<Goods> queryAllGoods() {
        return goodsMapper.queryAllGoods();
    }
}
