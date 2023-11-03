package com.herbalife.services;

import com.herbalife.entities.Topic;
import com.herbalife.exceptions.TopicFoundException;
import com.herbalife.exceptions.TopicNotFoundException;
import com.herbalife.repositories.TopicRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class ConferenceService {
    @Inject
    TopicRepository topicRepository;

    @Transactional
    public Topic addTopic(String title, int duration) {
        //Do not allow duplicate topics
        //Throw TopicFoundException if the topic exists
        if(topicRepository.hasTopicByTitle(title)) {
            throw new TopicFoundException(title);
        }
        Topic topic = new Topic();
        topic.setTitle(title);
        topic.setDuration(duration);
        topicRepository.persist(topic);
        return topic;
    }

    public List<Topic> getAllTopics() {
        return topicRepository.listAll();
    }

    @Transactional
    public void removeTopic(String title) {
        //Throw TopicNotFoundException if the topic doesn't exist
        Optional<Topic> optionalTopic = topicRepository.findByTitle(title);

        if(!optionalTopic.isPresent())
            throw new TopicNotFoundException(title);

        Topic topic = optionalTopic.get();
        topicRepository.delete(topic);
    }
}
