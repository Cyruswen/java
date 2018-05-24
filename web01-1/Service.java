package com.kaikai;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Service {
	Dao dao = new Dao();
	public int regist(String id, String name, String pwd, String sex){
		return dao.insert(id, name, pwd, sex);
	}
}
