package me.doruk.plumwatch.watch

import android.app.Notification
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification

/**
 * Forwards notifications only from packages explicitly selected in Plum Watch.
 * Android requires the user to enable this listener in system notification-access settings.
 */
class PlumNotificationListenerService : NotificationListenerService() {

    override fun onNotificationPosted(sbn: StatusBarNotification) {
        if (sbn.packageName == packageName || sbn.isOngoing) return
        if ((sbn.notification.flags and Notification.FLAG_GROUP_SUMMARY) != 0) return

        val preferences = getSharedPreferences("plum_watch_notifications", MODE_PRIVATE)
        val selected = preferences.getStringSet("selected_packages", emptySet()).orEmpty()
        if (sbn.packageName !in selected) return

        val extras = sbn.notification.extras ?: return
        val title = extras.getCharSequence(Notification.EXTRA_TITLE)?.toString().orEmpty()
        val text = sequenceOf(
            extras.getCharSequence(Notification.EXTRA_BIG_TEXT)?.toString(),
            extras.getCharSequence(Notification.EXTRA_TEXT)?.toString(),
            extras.getCharSequence(Notification.EXTRA_SUMMARY_TEXT)?.toString()
        ).filterNotNull().firstOrNull { it.isNotBlank() }.orEmpty()
        if (title.isBlank() && text.isBlank()) return

        runCatching {
            BleWatchManager.getInstance(applicationContext).sendAppNotification(
                title = title,
                text = text
            )
        }
    }
}
