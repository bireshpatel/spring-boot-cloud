package Topic;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topicList = new ArrayList<>(Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "java Framework", "java Framework Description"),
                new Topic("groovy", "groovy Framework", "groovy Framework Description")
        ));

    public List<Topic> getTopicList() {
        return topicList;
    }

    public Topic getTopic(String id){
        return topicList.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }


    public void addTopic(Topic topic) {
        topicList.add(topic);
    }
}
