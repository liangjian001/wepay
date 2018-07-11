package com.wepay.persistence.dbutils;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSqlSessionFactory {
	public static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSessionFactory sqlSessionFactoryDsis;

	private MybatisSqlSessionFactory() {

	}

	public static SqlSessionFactory getSqlSessionFactory() {
		if (sqlSessionFactory == null) {
			try {
				String resource = "mybatis-config.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {

			}
		}
		return sqlSessionFactory;
	}

	public static SqlSessionFactory getProductSqlSessionFactory() {
		if (sqlSessionFactoryDsis == null) {
			try {
				String resource = "mybatis-config.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactoryDsis = new SqlSessionFactoryBuilder().build(inputStream,"product");
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {

			}
		}
		return sqlSessionFactoryDsis;
	}

	public static SqlSessionFactory getSqlSessionFactory(String env) {
		if (sqlSessionFactory == null) {
			try {
				String resource = "mybatis-config.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, env);
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {

			}
		}
		return sqlSessionFactory;
	}
}