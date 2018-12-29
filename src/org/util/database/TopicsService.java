package org.util.database;

import org.util.pojo.Topic;

import java.util.List;

public interface TopicsService {
    List<Topic> findAllTopics();
}
