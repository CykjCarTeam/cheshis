package com.soft.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DbHelp
{
	private static Connection conn = null;
	private static ComboPooledDataSource  datasource = null;
	static {
		datasource=	new ComboPooledDataSource("myc3p0");
		
	}
	public static QueryRunner getQueryRunner() {
		QueryRunner queryRunner = new QueryRunner(datasource);
		return queryRunner;
		
	}
}
