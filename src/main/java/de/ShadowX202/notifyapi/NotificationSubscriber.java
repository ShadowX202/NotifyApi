package de.ShadowX202.notifyapi;

import de.ShadowX202.notifyapi.notification.Notification;
import org.bukkit.OfflinePlayer;

public interface NotificationSubscriber {
    String getName();
    boolean sendNotification(OfflinePlayer player, Notification notification);
    boolean canBeActivated(OfflinePlayer player);
}
