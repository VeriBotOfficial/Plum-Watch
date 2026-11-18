package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes8.dex */
public final class ServiceCompat {
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_Q = 255;
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U = 1073745919;
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
    }

    public static void startForeground(Service service, int r3, Notification notification, int r5) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.startForeground(service, r3, notification, r5);
        } else if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.startForeground(service, r3, notification, r5);
        } else {
            service.startForeground(r3, notification);
        }
    }

    public static void stopForeground(Service service, int r1) {
        Api24Impl.stopForeground(service, r1);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void stopForeground(Service service, int r1) {
            service.stopForeground(r1);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void startForeground(Service service, int r2, Notification notification, int r4) {
            if (r4 == 0 || r4 == -1) {
                service.startForeground(r2, notification, r4);
            } else {
                service.startForeground(r2, notification, r4 & 255);
            }
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static void startForeground(Service service, int r2, Notification notification, int r4) {
            if (r4 == 0 || r4 == -1) {
                service.startForeground(r2, notification, r4);
            } else {
                service.startForeground(r2, notification, r4 & ServiceCompat.FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U);
            }
        }
    }
}
