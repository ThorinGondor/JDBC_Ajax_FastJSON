package org.util.TestDB;

import org.util.database.TopicsService;
import org.util.database.TopicsServiceImpl;
import org.util.pojo.Topic;

import java.util.List;

public class TestDB {
    public static void main(String[] args){
        TopicsService TS = new TopicsServiceImpl();
        List<Topic> list = TS.findAllTopics();
        for (Topic topic: list){
            System.out.println(topic.getID()+" --- "+topic.getTopicName());
        }
    }
}
