package com.jsoncc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: jsonCC
 * Date: 2021/4/15 14:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private int id;
    private String name;
    private double market_price;
    private int stock;
}
