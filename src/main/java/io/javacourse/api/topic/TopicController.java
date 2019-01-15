package io.javacourse.api.topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("Spring","Spring FW","Java EE FW"),
                new Topic("React","Javascript FW","Frontend dev"),
                new Topic("Mongo","No-SQL","For schema-less DBs")

        );
    }
}
