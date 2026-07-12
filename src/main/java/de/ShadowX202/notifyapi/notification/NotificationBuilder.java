package de.ShadowX202.notifyapi.notification;

public interface NotificationBuilder {

    class MissingArgumentException extends RuntimeException {}

    NotificationBuilder setTitle(String title);
    NotificationBuilder setMessage(String message);
    NotificationBuilder setType(String type);

    NotificationBuilder setSensitive(boolean sensitive);

    Notification build() throws MissingArgumentException;


}
