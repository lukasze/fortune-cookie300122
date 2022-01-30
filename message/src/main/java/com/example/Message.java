package com.example;

public class Message {

    private String service;
    private String message;

    public Message(String service, String message) {
        this.service = service;
        this.message = message;
    }

    public Message() {
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
