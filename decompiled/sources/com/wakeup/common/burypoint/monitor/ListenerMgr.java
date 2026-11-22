package com.wakeup.common.burypoint.monitor;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class ListenerMgr<T> {
    private static boolean sDebug = false;
    private final Set<T> mListeners = Collections.newSetFromMap(new WeakHashMap());

    public interface INotifyCallback<T> {
        void onNotify(T listener);
    }

    public static void setDebug(boolean debug) {
        sDebug = debug;
    }

    public void register(T listener) {
        if (listener == null) {
            return;
        }
        synchronized (this.mListeners) {
            this.mListeners.add(listener);
        }
    }

    public void unregister(T listener) {
        if (listener == null) {
            return;
        }
        synchronized (this.mListeners) {
            this.mListeners.remove(listener);
        }
    }

    public void startNotify(INotifyCallback<T> callback) {
        ArrayList arrayList;
        synchronized (this.mListeners) {
            arrayList = !this.mListeners.isEmpty() ? new ArrayList(this.mListeners) : null;
        }
        if (arrayList != null) {
            Iterator<T> it = this.mListeners.iterator();
            while (it.hasNext()) {
                notifySingleListener(callback, it.next());
            }
        }
    }

    private void notifySingleListener(INotifyCallback<T> callback, T listener) {
        if (listener == null) {
            return;
        }
        try {
            callback.onNotify(listener);
        } catch (Throwable th) {
            Log.e("crash", th.toString(), th);
            if (sDebug) {
                throwException(th);
            }
        }
    }

    private void throwException(final Throwable e) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.wakeup.common.burypoint.monitor.ListenerMgr.1
            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(e);
            }
        });
    }

    public void clear() {
        synchronized (this.mListeners) {
            this.mListeners.clear();
        }
    }
}
