package de.ShadowX202.notify;

import de.ShadowX202.notify.notification.Notification;
import org.bukkit.OfflinePlayer;

public interface NotificationSubscriber {
    String getName();
    boolean sendNotification(OfflinePlayer player, Notification notification);
    boolean canBeActivated(OfflinePlayer player);
}
