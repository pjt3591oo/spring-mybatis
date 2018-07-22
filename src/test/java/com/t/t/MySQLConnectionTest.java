package com.t.t;

import java.sql.DriverManager;

import org.junit.Test;

import java.sql.Connection;


public class MySQLConnectionTest {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/test";
	//jdbc:mysql:주소:포트/DB명
	private static final String USER = "root";
	private static final String PW = "";
	//Root 비밀번호
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println("test");
			System.out.println(con);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
