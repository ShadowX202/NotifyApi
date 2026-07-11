package de.ShadowX202.notify;

import de.ShadowX202.notify.notification.Notification;
import org.bukkit.OfflinePlayer;

import java.util.List;

public interface NotificationManager {
    void sendNotification(List<OfflinePlayer> players, Notification notification);
    void sendNotification(OfflinePlayer player, Notification notification);

    void registerNotificationSubscriber(NotificationSubscriber notificationSubscriber);
    void unregisterNotificationSubscriber(NotificationSubscriber notificationSubscriber);

    NotificationSetting getNotificationSetting(OfflinePlayer player);
}
