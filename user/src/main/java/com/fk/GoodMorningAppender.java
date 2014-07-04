package com.fk;

public class GoodMorningAppender {
    private final HelloMsg msg;

    public GoodMorningAppender(HelloMsg msg) {
        this.msg = msg;
    }

    public String goodMorningMsg() {
        return msg.getMsg() + " Good morning!";
    }
}
