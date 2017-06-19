package com.example.multipleDataSource.common.datasource;

import com.example.multipleDataSource.dao.ShopDao;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Laurance on 2017/6/12.
 */
@Aspect
@Component
public class DataSourceAspect {

    /**
     * 使用空方法定义切点表达式
     */
    @Pointcut("execution(* com.example.multipleDataSource.dao.*.*(..))")
    public void switchDataSource() {}

    /**
     * - @Before 连接点(方法)被调用前执行的操作
     * - execution(* com.example.multipleDataSource.dao.*.*(..))
     *             - 第一个*：代表任意权限和返回类型，例：public Shop，可以指定具体的权限和返回类型。
     *             - 第二个*：代表这个包下的所有类，例：ShopDao，可以指定具体的类名。
     *             - 第三个*：代表类下的所有方法，例：getShop， 可以指定具体的方法名。
     *             - ..：    代表方法的入参类型可以是任意类型、任意数量（包括0个）的，可以指定具体的参数列表。
     * - joinPoint 连接点(切面表达式覆盖的方法)
     *
     * @param joinPoint
     */
//    @Before("execution(* com.example.multipleDataSource.dao.*.*(..))")
    // 使用定义切点表达式的方法进行切点表达式的引入
    @Before("switchDataSource()")
    public void setDataSource(JoinPoint joinPoint) {
        if (joinPoint.getTarget() instanceof ShopDao) {
            DatabaseContextHolder.setContextHolder(DatabaseType.mytestdb2);
        } else {
            DatabaseContextHolder.setContextHolder(DatabaseType.mytestdb);
        }
    }
}
