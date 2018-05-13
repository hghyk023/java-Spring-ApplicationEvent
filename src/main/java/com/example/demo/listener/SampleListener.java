package com.example.demo.listener;

import com.example.demo.event.SampleEvent;
import com.example.demo.publisher.SamplePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener {

    @Autowired
    private SamplePublisher samplePublisher;

    @EventListener
    public void onMyEvent (SampleEvent event) {
        System.out.println("Thread : " + Thread.currentThread().getName() + " event received: " + event.getMsg());
    }

}
