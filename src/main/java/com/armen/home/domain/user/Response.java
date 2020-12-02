package com.armen.home.domain.user;


public class Response {
    private User message;

    public Response(User message){
        this.message = message;
    }

    public Response(){

    }
    public User getMessage() {
        return message;
    }

    public void setMessage(User message) {
        this.message = message;
    }
}
