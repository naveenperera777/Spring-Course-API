package io.javacourse.api.topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

   private List<Topic> topics = Arrays.asList(
            new Topic("Spring","Spring FW","Java EE FW"),
                new Topic("React-Redux","Javascript FW","Frontend dev"),
                new Topic("Mongo","No-SQL","For schema-less DBs")
                );
   public List<Topic> getAllTopics(){
       return  topics;
   }

}
