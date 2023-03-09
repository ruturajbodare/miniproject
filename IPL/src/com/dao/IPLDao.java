package com.dao;
import java.sql.SQLException;
import java.util.List;

import com.entity.IPL;
public interface IPLDao {

	public void insertIPL(IPL i) throws ClassNotFoundException, SQLException ;
	public void updateIPL(IPL i) throws ClassNotFoundException, SQLException ;
	public void deleteIPL(IPL i) throws ClassNotFoundException, SQLException ;
	public List<IPL> findAll() throws ClassNotFoundException, SQLException;
	
	

}
