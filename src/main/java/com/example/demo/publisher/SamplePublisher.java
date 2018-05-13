package com.example.demo.publisher;

import com.example.demo.event.SampleEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SamplePublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void sendMessage(String msg) {
        applicationEventPublisher.publishEvent(new SampleEvent(this, msg));
    }

}