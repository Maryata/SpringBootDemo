package com.example.multipleDataSource.controller;

import com.example.multipleDataSource.domain.Shop;
import com.example.multipleDataSource.service.ShopService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Laurance on 2017/6/12.
 */
@RestController
@RequestMapping("shop")
@Api("商家信息")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("getShopById/{id}")
    @ApiOperation("根据id获取门店信息，测试多数据源")
    public Shop getShopById(@PathVariable("id") Integer id) {
        return shopService.getShopById(id);
    }
}
