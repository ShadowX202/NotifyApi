package de.ShadowX202.notify;

import de.ShadowX202.notify.notification.NotificationLevel;

public interface NotificationSettings {

    boolean isEnabled(NotificationSubscriber subscriber, String type);
    boolean isEnabled(NotificationSubscriber subscriber, String type, NotificationLevel level);

}
