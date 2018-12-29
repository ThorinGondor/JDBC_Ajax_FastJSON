package org.util.database;

import org.util.pojo.Topic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TopicsDAOImpl extends BaseDAO implements TopicsDAO {
    public TopicsDAOImpl(Connection conn){
        super(conn);
    }

    public List<Topic> getAllTopics(){
        List<Topic> list = new ArrayList<>();
        ResultSet RS = null;
        String sql = "select * from Topics";
        try{
            RS = this.executeQuery(sql);
            System.out.println("获取数据库内容成功!");
            while (RS.next()){
                list.add(new Topic(RS.getInt("ID"), RS.getString("TopicName")));
            }
        }catch (SQLException e){
            System.out.println("ERROR--获取数据库内容失败!");
            e.printStackTrace();
        }
        return list;
    }
}
