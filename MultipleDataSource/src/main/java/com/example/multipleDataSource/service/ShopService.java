package com.example.multipleDataSource.service;

import com.example.multipleDataSource.dao.ShopDao;
import com.example.multipleDataSource.domain.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Laurance on 2017/6/12.
 */
@Service
public class ShopService {

    @Autowired
    private ShopDao shopDao;

    public Shop getShopById(Integer id) {
        return shopDao.getShopById(id);
    }
}
