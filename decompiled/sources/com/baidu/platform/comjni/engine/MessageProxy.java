package com.baidu.platform.comjni.engine;

import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class MessageProxy {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<List<Handler>> f8975a = new SparseArray<>();

    public static void destroy() {
        int size = f8975a.size();
        for (int i = 0; i < size; i++) {
            SparseArray<List<Handler>> sparseArray = f8975a;
            List<Handler> list = sparseArray.get(sparseArray.keyAt(i));
            if (list != null) {
                list.clear();
            }
        }
        f8975a.clear();
    }

    public static void dispatchMessage(int i, int i2, int i3, long j) {
        SparseArray<List<Handler>> sparseArray = f8975a;
        synchronized (sparseArray) {
            List<Handler> list = sparseArray.get(i);
            if (list != null && !list.isEmpty()) {
                for (Handler handler : list) {
                    Message obtain = Message.obtain(handler, i, i2, i3, Long.valueOf(j));
                    if (i == 39 && (i2 == 0 || i2 == 1)) {
                        handler.handleMessage(obtain);
                    } else {
                        obtain.sendToTarget();
                    }
                }
            }
        }
    }

    public static void registerMessageHandler(int i, Handler handler) {
        if (handler == null) {
            return;
        }
        SparseArray<List<Handler>> sparseArray = f8975a;
        synchronized (sparseArray) {
            List<Handler> list = sparseArray.get(i);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(handler);
                sparseArray.put(i, arrayList);
            } else if (!list.contains(handler)) {
                list.add(handler);
            }
        }
    }

    public static void unRegisterMessageHandler(int i, Handler handler) {
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            SparseArray<List<Handler>> sparseArray = f8975a;
            synchronized (sparseArray) {
                List<Handler> list = sparseArray.get(i);
                if (list != null) {
                    list.remove(handler);
                }
            }
        }
    }
}
