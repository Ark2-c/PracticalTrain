package com.gfz.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ClassName: MybatisUtil
 * date: 2020/4/8 17:47
 *
 * @author gfz
 */
public class MybatisUtils {
    private MybatisUtils() {
    }

    /**
     * ªÒ»°SqlSessionFactory
     * @return
     * @throws IOException
     */
    public static SqlSessionFactory getFactory() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        return factory;
    }

}
