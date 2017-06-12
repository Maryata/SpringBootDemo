package com.example.multipleDataSource.mapper;

import com.example.multipleDataSource.domain.Shop;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Laurance on 2017/6/12.
 */
public interface ShopMapper {

    @Select("select * from t_shop where id = #{id}")
    @Results(value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    Shop getShopById(@Param("id") Integer id);
}
