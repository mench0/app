package com.armen.client;

import com.fasterxml.jackson.annotation.JsonGetter;

public class Request {

    private User user;
    private Message message;

    public Request(User user, Message message) {
        this.user = user;
        this.message = message;
    }

    public Request() {
    }

    @JsonGetter("User")
    public User getUser() {
        return user;
    }

    @JsonGetter("Message")
    public Message getMessage() {
        return message;
    }

}
