package de.ShadowX202.notifyapi;

import de.ShadowX202.notifyapi.notification.NotificationLevel;

public interface NotificationSettings {

    boolean isEnabled(NotificationSubscriber subscriber, String type);
    boolean isEnabled(NotificationSubscriber subscriber, String type, NotificationLevel level);

}
