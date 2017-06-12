package com.example.multipleDataSource.dao;

import com.example.multipleDataSource.common.datasource.DatabaseContextHolder;
import com.example.multipleDataSource.common.datasource.DatabaseType;
import com.example.multipleDataSource.domain.Shop;
import com.example.multipleDataSource.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Laurance on 2017/6/12.
 */
@Repository
public class ShopDao {

    @Autowired
    private ShopMapper shopMapper;

    public Shop getShopById(Integer id) {
        /**
         * 根据实际情况选择不同的数据库
         */
//        DatabaseContextHolder.setContextHolder(DatabaseType.mytestdb);
        DatabaseContextHolder.setContextHolder(DatabaseType.mytestdb2);

        return shopMapper.getShopById(id);
    }
}
