package com.kaishengit.tools;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface BuildEnetity<T> {
	public T build(ResultSet rs) throws SQLException;

}
