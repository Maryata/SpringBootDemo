package com.example.multipleDataSource.common.datasource;

/**
 * Created by Laurance on 2017/6/12.
 *
 * 保存一个线程安全的DatabaseType容器
 */
public class DatabaseContextHolder {

    private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<>();

    public static void setContextHolder(DatabaseType databaseType) {
        contextHolder.set(databaseType);
    }

    public static DatabaseType getContextHolder() {
        return contextHolder.get();
    }
}
