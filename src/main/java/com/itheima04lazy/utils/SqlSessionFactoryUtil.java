package com.itheima04lazy.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author LM_Code
 * @create 2019-04-02-21:13
 */
public class SqlSessionFactoryUtil {
    /**
     * 获取会话工厂的方法
     * @return
     */
    public static SqlSessionFactory getSqlSessionFactory(){
        InputStream in = null;
        SqlSessionFactory sqlSessionFactory = null;
        try{
            //加载配置文件
            in = Resources.getResourceAsStream("SqlMapConfig.xml");
            //建造一个会话工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sqlSessionFactory;
    }

    /**
     * 打开一个sql会话工厂
     * @return
     */
    public static SqlSession getSqlSession(boolean isAutoCommit){
        return getSqlSessionFactory().openSession(isAutoCommit);
    }

    /**
     * 关闭一个会话工厂
     * @param sqlSession
     */
    public static void close(SqlSession sqlSession){
        sqlSession.close();
    }
}
