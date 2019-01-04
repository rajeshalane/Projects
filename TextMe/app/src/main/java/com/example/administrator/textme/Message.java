package com.example.administrator.textme;

/**
 * Created by Administrator on 12/9/2018.
 */
public class Message {
    private String text;
    private MemberData data;
    private boolean belongsToCurrentUser;

    public Message(String text, MemberData data, boolean belongsToCurrentUser) {
        this.text = text;
        this.data = data;
        this.belongsToCurrentUser = belongsToCurrentUser;
    }

    public String getText() {
        return text;
    }

    public MemberData getData() {
        return data;
    }

    public boolean isBelongsToCurrentUser() {
        return belongsToCurrentUser;
    }
}