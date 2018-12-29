package org.util.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDAO {
    private Connection conn;
    public BaseDAO(Connection conn){
        this.conn = conn;
    }

    public int executeUpdate(String sql, Object...params)throws SQLException {
        int result = -1;
        PreparedStatement PS = conn.prepareStatement(sql);
        for (int i = 0; i <params.length; i++){
            PS.setObject(i+1, params[i]);
        }
        result = PS.executeUpdate();
        DataBaseUtil.closeAll(null, PS, null);
        return result;
    }

    public ResultSet executeQuery(String sql, Object...params)throws SQLException{
        ResultSet RS = null;
        PreparedStatement PS = null;
        PS = conn.prepareStatement(sql);
        for (int i = 0; i< params.length; i++){
            PS.setObject(i+1, params[i]);
        }
        RS = PS.executeQuery();
        return RS;
    }
}
