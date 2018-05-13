package com.example.demo.event;

import org.springframework.context.ApplicationEvent;

public class SampleEvent extends ApplicationEvent{

    private final String msg;

    public SampleEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg () {
        return msg;
    }
}
