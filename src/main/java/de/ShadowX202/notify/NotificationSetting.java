package de.ShadowX202.notify;

import de.ShadowX202.notify.notification.NotificationLevel;

public interface NotificationSetting {

    boolean isEnabled(String type, NotificationLevel level);
    boolean isEnabled(String type);

}
