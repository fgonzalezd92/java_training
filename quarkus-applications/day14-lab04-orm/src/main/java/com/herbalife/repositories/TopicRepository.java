package com.herbalife.repositories;

import com.herbalife.entities.Topic;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Optional;

@ApplicationScoped
public class TopicRepository implements PanacheRepositoryBase<Topic, Integer> {
    public boolean hasTopicByTitle(String title){
        String query ="from Topic t where t.title = ?1";
        long count = count(query, title);
        return count>0;
    }

    public Optional<Topic> findByTitle(String title){
        String query ="from Topic t where t.title = ?1";
        return find(query, title).firstResultOptional();
    }
}
