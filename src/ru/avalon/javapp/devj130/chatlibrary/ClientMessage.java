package ru.avalon.javapp.devj130.chatlibrary;

import java.io.Serializable;
import java.util.Date;

public class ClientMessage implements Serializable {
    private final String user;
    private final Date time;
    private final String msg;

    public ClientMessage(String user, Date time, String msg) {
        this.user = user;
        this.time = time;
        this.msg = msg;
    }

    public String getUser() {
        return user;
    }

    public Date getTime() {
        return time;
    }

    public String getMsg() {
        return msg;
    }
}
