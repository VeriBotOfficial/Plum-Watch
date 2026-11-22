package com.wakeup.module.device.work;

import android.os.Handler;
import android.os.Looper;
import com.blankj.utilcode.util.CollectionUtils;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commponent.module.device.EventType;
import com.wakeup.commponent.module.device.OnEventListener;
import com.wakeup.module.device.work.debug.BleDebugMonitor;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceEventMgr.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\nH\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J&\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0007J&\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0006\u001a*\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007j\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/wakeup/module/device/work/DeviceEventMgr;", "", "<init>", "()V", "handler", "Landroid/os/Handler;", "listenerMap", "Ljava/util/HashMap;", "Lcom/wakeup/commponent/module/device/EventType;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/wakeup/commponent/module/device/OnEventListener;", "Lkotlin/collections/HashMap;", MiPushClient.COMMAND_REGISTER, "", "type", "listener", MiPushClient.COMMAND_UNREGISTER, "callback", "send", "sendState", "code", "", "mac", "", "data", "sendSync", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceEventMgr {
    public static final DeviceEventMgr INSTANCE = new DeviceEventMgr();
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final HashMap<EventType, CopyOnWriteArrayList<OnEventListener>> listenerMap = new HashMap<>();

    private DeviceEventMgr() {
    }

    @JvmStatic
    public static final void register(EventType type, OnEventListener listener) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(listener, "listener");
        HashMap<EventType, CopyOnWriteArrayList<OnEventListener>> hashMap = listenerMap;
        if (!hashMap.containsKey(type)) {
            hashMap.put(type, new CopyOnWriteArrayList<>());
        }
        CopyOnWriteArrayList<OnEventListener> copyOnWriteArrayList = hashMap.get(type);
        Intrinsics.checkNotNull(copyOnWriteArrayList);
        if (copyOnWriteArrayList.contains(listener)) {
            return;
        }
        copyOnWriteArrayList.add(listener);
    }

    @JvmStatic
    public static final void unregister(OnEventListener callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Iterator<Map.Entry<EventType, CopyOnWriteArrayList<OnEventListener>>> it = listenerMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().remove(callback);
        }
    }

    @JvmStatic
    public static final void send(EventType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        send(type, 0, null);
    }

    @JvmStatic
    public static final void sendState(int code) {
        send(EventType.TYPE_DEVICE_STATE, code, null);
    }

    @JvmStatic
    public static final void sendState(int code, String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        send(EventType.TYPE_DEVICE_STATE, code, mac);
    }

    @JvmStatic
    public static final void send(EventType type, int code) {
        Intrinsics.checkNotNullParameter(type, "type");
        send(type, code, null);
    }

    public static /* synthetic */ void send$default(EventType eventType, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        send(eventType, i, obj);
    }

    @JvmStatic
    public static final void send(final EventType type, final int code, final Object data) {
        Intrinsics.checkNotNullParameter(type, "type");
        LogUtils.i("DeviceEventMgr", "onEvent: type = " + type + " code = " + code);
        if (type == EventType.TYPE_DEVICE_STATE) {
            BleDebugMonitor.onStateBroadcast(code, data instanceof String ? (String) data : null);
        }
        HashMap<EventType, CopyOnWriteArrayList<OnEventListener>> hashMap = listenerMap;
        if (hashMap.containsKey(type)) {
            final CopyOnWriteArrayList<OnEventListener> copyOnWriteArrayList = hashMap.get(type);
            if (CollectionUtils.isEmpty(copyOnWriteArrayList)) {
                return;
            }
            handler.post(new Runnable() { // from class: com.wakeup.module.device.work.DeviceEventMgr$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceEventMgr.send$lambda$2(copyOnWriteArrayList, type, code, data);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void send$lambda$2(CopyOnWriteArrayList copyOnWriteArrayList, EventType eventType, int i, Object obj) {
        Intrinsics.checkNotNull(copyOnWriteArrayList);
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((OnEventListener) it.next()).onEvent(eventType, i, obj);
        }
    }

    public static /* synthetic */ void sendSync$default(EventType eventType, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        sendSync(eventType, i, obj);
    }

    @JvmStatic
    public static final void sendSync(EventType type, int code, Object data) {
        Intrinsics.checkNotNullParameter(type, "type");
        HashMap<EventType, CopyOnWriteArrayList<OnEventListener>> hashMap = listenerMap;
        if (hashMap.containsKey(type)) {
            CopyOnWriteArrayList<OnEventListener> copyOnWriteArrayList = hashMap.get(type);
            if (CollectionUtils.isEmpty(copyOnWriteArrayList)) {
                return;
            }
            Intrinsics.checkNotNull(copyOnWriteArrayList);
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((OnEventListener) it.next()).onEvent(type, code, data);
            }
        }
    }
}
