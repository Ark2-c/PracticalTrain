package com.gfz.util;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;

/**
 * ClassName: DruidDataSourceFactory
 * date: 2020/7/15 14:43
 *
 * @author gfz
 */
public class DruidDataSourceFactory  extends PooledDataSourceFactory {
    public DruidDataSourceFactory() {
        this.dataSource = new DruidDataSource();
    }

}
