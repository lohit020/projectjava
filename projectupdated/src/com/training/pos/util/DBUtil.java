package com.training.pos.util;

import java.sql.Connection;

public interface DBUtil {
  
	public  Connection getDBConnection(String driverType);
}
