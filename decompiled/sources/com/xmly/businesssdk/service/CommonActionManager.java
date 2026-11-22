package com.xmly.businesssdk.service;

import com.xmly.businesssdk.utils.Logger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonActionManager.kt */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xmly/businesssdk/service/CommonActionManager;", "", "Lcom/xmly/businesssdk/service/CommonActionListener;", "listener", "", "addCommonActionListener", "removeCommonActionListener", "clearAllCommonActionListeners", "Lcom/xmly/businesssdk/service/PlayerRequestData;", "playerData", "notifyPlayerRequest", "", "albumId", "notifyAlbumDetailRequested", "Ljava/util/concurrent/CopyOnWriteArrayList;", "commonActionListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "<init>", "()V", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class CommonActionManager {
    public static final CommonActionManager INSTANCE = new CommonActionManager();
    private static final CopyOnWriteArrayList<CommonActionListener> commonActionListeners = new CopyOnWriteArrayList<>();

    private CommonActionManager() {
    }

    @JvmStatic
    public static final void addCommonActionListener(CommonActionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CopyOnWriteArrayList<CommonActionListener> copyOnWriteArrayList = commonActionListeners;
        if (copyOnWriteArrayList.contains(listener)) {
            return;
        }
        copyOnWriteArrayList.add(listener);
        Logger.d("CommonActionManager", "添加通用动作监听器");
    }

    @JvmStatic
    public static final void clearAllCommonActionListeners() {
        commonActionListeners.clear();
        Logger.d("CommonActionManager", "清除所有通用动作监听器");
    }

    @JvmStatic
    public static final void notifyAlbumDetailRequested(String albumId) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        Logger.d("CommonActionManager", "通知专辑详情页请求: albumId=" + albumId);
        Iterator<T> it = commonActionListeners.iterator();
        while (it.hasNext()) {
            try {
                ((CommonActionListener) it.next()).onAlbumDetailRequested(albumId);
            } catch (Exception e) {
                Logger.e("CommonActionManager", "通知通用动作监听器专辑详情页请求时发生错误", e);
            }
        }
    }

    @JvmStatic
    public static final void notifyPlayerRequest(PlayerRequestData playerData) {
        Intrinsics.checkNotNullParameter(playerData, "playerData");
        Logger.d("CommonActionManager", "通知播放器请求: playerData=" + playerData);
        Iterator<T> it = commonActionListeners.iterator();
        while (it.hasNext()) {
            try {
                ((CommonActionListener) it.next()).onPlayerRequested(playerData);
            } catch (Exception e) {
                Logger.e("CommonActionManager", "通知通用动作监听器播放器请求时发生错误", e);
            }
        }
    }

    @JvmStatic
    public static final void removeCommonActionListener(CommonActionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (commonActionListeners.remove(listener)) {
            Logger.d("CommonActionManager", "移除通用动作监听器");
        }
    }
}
