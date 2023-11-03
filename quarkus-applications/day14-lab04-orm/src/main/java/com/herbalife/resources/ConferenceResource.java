package com.herbalife.resources;

import com.herbalife.dto.TopicDto;
import com.herbalife.entities.Topic;
import com.herbalife.services.ConferenceService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;

import java.util.List;

@Path("/conference")
public class ConferenceResource {
    @Inject
    ConferenceService conferenceService;

    @GET
    @Path("/topics")
    public List<Topic> GetTopics(){
        return conferenceService.getAllTopics();
    }

    @POST
    @Path("/topics")
    public String AddTopic(TopicDto topic){
        conferenceService.addTopic(topic.title(), topic.duration());
        return "Topic inserted";
    }

    @DELETE
    @Path("/topics/{title}")
    public String RemoveTopic(@PathParam("title") String title) {
        conferenceService.removeTopic(title);
        return "Topic removed";
    }
}
