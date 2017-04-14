package com.delaroystudios.firebasechat.events;

/**
 * Created by delaroy on 4/13/17.
 */
public class PushNotificationEvent {
    private String title;
    private String message;
    private String username;
    private String uid;
    private String fcmToken;
    public PushNotificationEvent() {
    }

    public PushNotificationEvent(String title, String message, String username, String uid, String fcmToken) {
        this.title = title;
        this.message = message;
        this.username = username;
        this.uid = uid;
        this.fcmToken = fcmToken;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFcmToken() {
        return fcmToken;
    }

    public void setFcmToken(String fcmToken) {
        this.fcmToken = fcmToken;
    }
}