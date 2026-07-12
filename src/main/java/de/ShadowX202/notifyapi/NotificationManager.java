package de.ShadowX202.notifyapi;

import de.ShadowX202.notifyapi.notification.Notification;
import de.ShadowX202.notifyapi.notification.NotificationBuilder;
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

    NotificationBuilder getNotificationBuilder();

    List<String> getNotificationTypes();
    void registerNotificationType(String type);
}
