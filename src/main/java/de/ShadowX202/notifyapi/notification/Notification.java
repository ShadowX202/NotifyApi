package de.ShadowX202.notifyapi.notification;

public interface Notification {
    String getTitle();
    String getMessage();
    String getType();

    NotificationLevel getLevel();

    boolean isSensitive();
}
