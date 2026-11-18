package androidx.core.os;

import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
public final class ProcessCompat {
    private ProcessCompat() {
    }

    public static boolean isApplicationUid(int r0) {
        return Api24Impl.isApplicationUid(r0);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean isApplicationUid(int r0) {
            return Process.isApplicationUid(r0);
        }
    }

    static class Api19Impl {
        private static Method sMethodUserHandleIsAppMethod;
        private static boolean sResolved;
        private static final Object sResolvedLock = new Object();

        private Api19Impl() {
        }

        static boolean isApplicationUid(int r7) {
            try {
                synchronized (sResolvedLock) {
                    if (!sResolved) {
                        sResolved = true;
                        sMethodUserHandleIsAppMethod = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = sMethodUserHandleIsAppMethod;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(r7));
                    if (bool == null) {
                        throw new NullPointerException();
                    }
                    return bool.booleanValue();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }
}
