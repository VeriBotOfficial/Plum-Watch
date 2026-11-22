package com.xmly.businesssdk.service;

import android.app.Activity;
import com.autonavi.aps.amapapi.config.Const;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.fragment.FragmentEventCallback;
import com.xmly.businesssdk.fragment.HaobaiBridgeManager;
import com.xmly.businesssdk.utils.Logger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FloatingPlayerManager.kt */
@Metadata(bv = {}, d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0006*\u0001!\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000eH\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000eH\u0002R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/xmly/businesssdk/service/FloatingPlayerManager;", "", "Lcom/xmly/businesssdk/service/FloatingPlayerProvider;", "provider", "", "registerFloatingPlayerProvider", "unregisterFloatingPlayerProvider", "Lcom/xmly/businesssdk/service/FloatingPlayerListener;", "listener", "addFloatingPlayerListener", "removeFloatingPlayerListener", "clearAllFloatingPlayerListeners", "Landroid/app/Activity;", Const.STR_PROCESS_TAG, "", "show", "requestShowFloatingPlayer", "isFloatingPlayerVisible", "visible", "updateFloatingPlayerState", "Lcom/xmly/businesssdk/fragment/HaobaiBridgeManager;", "bridgeManager", "registerBridgeManager", "unregisterBridgeManager", "notifyFloatingPlayerRequested", "notifyFloatingPlayerStateChanged", "Ljava/util/concurrent/CopyOnWriteArrayList;", "floatingPlayerListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "currentFloatingPlayerVisible", "Z", "floatingPlayerProvider", "Lcom/xmly/businesssdk/service/FloatingPlayerProvider;", "com/xmly/businesssdk/service/FloatingPlayerManager$internalEventCallback$1", "internalEventCallback", "Lcom/xmly/businesssdk/service/FloatingPlayerManager$internalEventCallback$1;", "<init>", "()V", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class FloatingPlayerManager {
    private static volatile boolean currentFloatingPlayerVisible;
    private static volatile FloatingPlayerProvider floatingPlayerProvider;
    public static final FloatingPlayerManager INSTANCE = new FloatingPlayerManager();
    private static final CopyOnWriteArrayList<FloatingPlayerListener> floatingPlayerListeners = new CopyOnWriteArrayList<>();
    private static final FloatingPlayerManager$internalEventCallback$1 internalEventCallback = new FragmentEventCallback() { // from class: com.xmly.businesssdk.service.FloatingPlayerManager$internalEventCallback$1
        @Override // com.xmly.businesssdk.fragment.FragmentEventCallback
        public void onEvent(String eventName, Object... params) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(params, "params");
            if (Intrinsics.areEqual(eventName, "onFloatingPlayerStateChanged")) {
                Object orNull = ArraysKt.getOrNull(params, 0);
                Boolean bool = orNull instanceof Boolean ? (Boolean) orNull : null;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    FloatingPlayerManager.updateFloatingPlayerState(booleanValue);
                    Logger.d("FloatingPlayerManager", "悬浮播放器状态已变化: " + booleanValue);
                }
            }
        }
    };

    private FloatingPlayerManager() {
    }

    @JvmStatic
    public static final void addFloatingPlayerListener(FloatingPlayerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CopyOnWriteArrayList<FloatingPlayerListener> copyOnWriteArrayList = floatingPlayerListeners;
        if (copyOnWriteArrayList.contains(listener)) {
            return;
        }
        copyOnWriteArrayList.add(listener);
        Logger.d("FloatingPlayerManager", "添加悬浮播放器监听器");
    }

    @JvmStatic
    public static final void clearAllFloatingPlayerListeners() {
        floatingPlayerListeners.clear();
        Logger.d("FloatingPlayerManager", "清除所有悬浮播放器监听器");
    }

    @JvmStatic
    public static final boolean isFloatingPlayerVisible(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FloatingPlayerProvider floatingPlayerProvider2 = floatingPlayerProvider;
        if (floatingPlayerProvider2 == null) {
            Logger.d("FloatingPlayerManager", c.a("获取悬浮播放器显示状态: ").append(currentFloatingPlayerVisible).toString());
            return currentFloatingPlayerVisible;
        }
        try {
            boolean isFloatingPlayerShowing = floatingPlayerProvider2.isFloatingPlayerShowing(activity);
            if (currentFloatingPlayerVisible != isFloatingPlayerShowing) {
                updateFloatingPlayerState(isFloatingPlayerShowing);
            }
            return isFloatingPlayerShowing;
        } catch (Exception e) {
            Logger.e("FloatingPlayerManager", "从提供者获取悬浮播放器状态失败", e);
            return currentFloatingPlayerVisible;
        }
    }

    private final void notifyFloatingPlayerRequested(boolean show) {
        StringBuilder append = new StringBuilder("通知悬浮播放器请求: show=").append(show).append(", 监听器数量=");
        CopyOnWriteArrayList<FloatingPlayerListener> copyOnWriteArrayList = floatingPlayerListeners;
        Logger.d("FloatingPlayerManager", append.append(copyOnWriteArrayList.size()).toString());
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            try {
                ((FloatingPlayerListener) it.next()).onFloatingPlayerRequested(show);
            } catch (Exception e) {
                Logger.e("FloatingPlayerManager", "通知悬浮播放器监听器失败", e);
            }
        }
    }

    private final void notifyFloatingPlayerStateChanged(boolean visible) {
        StringBuilder append = new StringBuilder("通知悬浮播放器状态变化: visible=").append(visible).append(", 监听器数量=");
        CopyOnWriteArrayList<FloatingPlayerListener> copyOnWriteArrayList = floatingPlayerListeners;
        Logger.d("FloatingPlayerManager", append.append(copyOnWriteArrayList.size()).toString());
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            try {
                ((FloatingPlayerListener) it.next()).onFloatingPlayerStateChanged(visible);
            } catch (Exception e) {
                Logger.e("FloatingPlayerManager", "通知悬浮播放器状态变化监听器失败", e);
            }
        }
    }

    @JvmStatic
    public static final void registerBridgeManager(HaobaiBridgeManager bridgeManager) {
        Intrinsics.checkNotNullParameter(bridgeManager, "bridgeManager");
        bridgeManager.addEventListener("onFloatingPlayerStateChanged", internalEventCallback);
        Logger.d("FloatingPlayerManager", "悬浮播放器管理器已注册到 HaobaiBridgeManager");
    }

    @JvmStatic
    public static final void registerFloatingPlayerProvider(FloatingPlayerProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        floatingPlayerProvider = provider;
        Logger.d("FloatingPlayerManager", "悬浮播放器提供者已注册");
    }

    @JvmStatic
    public static final void removeFloatingPlayerListener(FloatingPlayerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (floatingPlayerListeners.remove(listener)) {
            Logger.d("FloatingPlayerManager", "移除悬浮播放器监听器");
        }
    }

    @JvmStatic
    public static final boolean requestShowFloatingPlayer(Activity activity, boolean show) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str = "显示";
        Logger.d("FloatingPlayerManager", "请求" + (show ? "显示" : "隐藏") + "悬浮播放器");
        Logger.d("FloatingPlayerManager", "当前Provider状态: ".concat(floatingPlayerProvider != null ? "已注册" : "未注册"));
        StringBuilder sb = new StringBuilder("当前监听器数量: ");
        CopyOnWriteArrayList<FloatingPlayerListener> copyOnWriteArrayList = floatingPlayerListeners;
        Logger.d("FloatingPlayerManager", sb.append(copyOnWriteArrayList.size()).toString());
        FloatingPlayerProvider floatingPlayerProvider2 = floatingPlayerProvider;
        boolean z = true;
        if (floatingPlayerProvider2 == null) {
            if (copyOnWriteArrayList.isEmpty()) {
                Logger.w("FloatingPlayerManager", "没有注册悬浮播放器监听器和提供者，无法处理显示/隐藏请求");
                return false;
            }
            INSTANCE.notifyFloatingPlayerRequested(show);
            return true;
        }
        try {
            if (show) {
                z = floatingPlayerProvider2.showFloatingPlayer(activity);
            } else {
                floatingPlayerProvider2.hideFloatingPlayer(activity);
            }
            StringBuilder sb2 = new StringBuilder("通过提供者");
            if (!show) {
                str = "隐藏";
            }
            Logger.d("FloatingPlayerManager", sb2.append(str).append("悬浮播放器").append(z ? "成功" : "失败").toString());
            return z;
        } catch (Exception e) {
            Logger.e("FloatingPlayerManager", "通过提供者控制悬浮播放器失败", e);
            return false;
        }
    }

    @JvmStatic
    public static final void unregisterBridgeManager(HaobaiBridgeManager bridgeManager) {
        if (bridgeManager != null) {
            bridgeManager.removeEventListener("onFloatingPlayerStateChanged", internalEventCallback);
        }
        Logger.d("FloatingPlayerManager", "悬浮播放器管理器已从 HaobaiBridgeManager 注销");
    }

    @JvmStatic
    public static final void unregisterFloatingPlayerProvider() {
        floatingPlayerProvider = null;
        updateFloatingPlayerState(false);
        Logger.d("FloatingPlayerManager", "悬浮播放器提供者已注销");
    }

    @JvmStatic
    public static final void updateFloatingPlayerState(boolean visible) {
        if (currentFloatingPlayerVisible != visible) {
            FloatingPlayerManager floatingPlayerManager = INSTANCE;
            currentFloatingPlayerVisible = visible;
            Logger.d("FloatingPlayerManager", "悬浮播放器状态已更新: " + visible);
            floatingPlayerManager.notifyFloatingPlayerStateChanged(visible);
        }
    }
}
