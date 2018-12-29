package org.util.database;

import org.util.pojo.Topic;

import java.sql.Connection;
import java.util.List;

public class TopicsServiceImpl implements TopicsService {
    public List<Topic> findAllTopics(){
        Connection conn = DataBaseUtil.getConnect();
        TopicsDAO tDAO = new TopicsDAOImpl(conn);
        List<Topic> list = tDAO.getAllTopics();
        DataBaseUtil.closeAll(conn, null, null);
        return list;
    }
}
