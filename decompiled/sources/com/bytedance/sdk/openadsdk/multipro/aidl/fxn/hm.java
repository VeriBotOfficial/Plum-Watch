package com.bytedance.sdk.openadsdk.multipro.aidl.fxn;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public class hm extends fxn {
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> fxn = new ConcurrentHashMap<>();
    private static volatile hm kg;

    public static hm fxn() {
        if (kg == null) {
            synchronized (hm.class) {
                if (kg == null) {
                    kg = new hm();
                }
            }
        }
        return kg;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.fxn.fxn, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        fxn.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.fxn.fxn, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fxn.remove(str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.fxn.fxn, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        fxn(str, str2);
    }

    private synchronized void fxn(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = fxn;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i = 0; i < beginBroadcast; i++) {
                    try {
                        IDislikeClosedListener broadcastItem = remoteCallbackList.getBroadcastItem(i);
                        if (broadcastItem != null && "onItemClickClosed".equals(str2)) {
                            broadcastItem.onItemClickClosed();
                        }
                    } catch (Throwable th) {
                        dx.fxn("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th2) {
            dx.fxn("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th2);
        }
    }
}
