package de.ShadowX202.notify;

import de.ShadowX202.notify.notification.Notification;
import org.bukkit.OfflinePlayer;

import java.util.List;
import java.util.Set;

public interface NotificationManager {
    void sendNotification(List<OfflinePlayer> players, Notification notification);
    void sendNotification(OfflinePlayer player, Notification notification);

    void registerNotificationSubscriber(NotificationSubscriber notificationSubscriber);
    void unregisterNotificationSubscriber(NotificationSubscriber notificationSubscriber);

    Set<NotificationSubscriber> getNotificationSubscribers();

    NotificationSettings getNotificationSettings(OfflinePlayer player);
}
