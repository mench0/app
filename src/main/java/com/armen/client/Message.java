package com.armen.client;

import com.fasterxml.jackson.annotation.JsonGetter;

public class Message {

    public String body;
    public String timestamp;

    public Message(String body, String timestamp) {
        this.body = body;
        this.timestamp = timestamp;
    }

    @JsonGetter("Body")
    public String getBody() {
        return body;
    }

    @JsonGetter("Timestamp")
    public String getTimestamp() {
        return timestamp;
    }
}
