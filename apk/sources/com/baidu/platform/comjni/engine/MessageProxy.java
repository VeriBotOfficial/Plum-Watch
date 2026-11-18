package com.baidu.platform.comjni.engine;

import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class MessageProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseArray<List<Handler>> f8975a = new SparseArray<>();

    public static void destroy() {
        int size = f8975a.size();
        for (int r1 = 0; r1 < size; r1++) {
            SparseArray<List<Handler>> sparseArray = f8975a;
            List<Handler> list = sparseArray.get(sparseArray.keyAt(r1));
            if (list != null) {
                list.clear();
            }
        }
        f8975a.clear();
    }

    public static void dispatchMessage(int r5, int r6, int r7, long j) {
        SparseArray<List<Handler>> sparseArray = f8975a;
        synchronized (sparseArray) {
            List<Handler> list = sparseArray.get(r5);
            if (list != null && !list.isEmpty()) {
                for (Handler handler : list) {
                    Message messageObtain = Message.obtain(handler, r5, r6, r7, Long.valueOf(j));
                    if (r5 == 39 && (r6 == 0 || r6 == 1)) {
                        handler.handleMessage(messageObtain);
                    } else {
                        messageObtain.sendToTarget();
                    }
                }
            }
        }
    }

    public static void registerMessageHandler(int r2, Handler handler) {
        if (handler == null) {
            return;
        }
        SparseArray<List<Handler>> sparseArray = f8975a;
        synchronized (sparseArray) {
            List<Handler> list = sparseArray.get(r2);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(handler);
                sparseArray.put(r2, arrayList);
            } else if (!list.contains(handler)) {
                list.add(handler);
            }
        }
    }

    public static void unRegisterMessageHandler(int r1, Handler handler) {
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            SparseArray<List<Handler>> sparseArray = f8975a;
            synchronized (sparseArray) {
                List<Handler> list = sparseArray.get(r1);
                if (list != null) {
                    list.remove(handler);
                }
            }
        }
    }
}
