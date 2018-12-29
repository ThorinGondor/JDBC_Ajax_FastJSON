package org.util.pojo;

public class Topic {
    private int ID = 1;
    private String TopicName = "null";

    public Topic(){
    }

    public Topic(int ID, String TopicName){
        this.ID = ID;
        this.TopicName = TopicName;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTopicName(String topicName) {
        TopicName = topicName;
    }

    public int getID() {
        return ID;
    }

    public String getTopicName() {
        return TopicName;
    }
}
