package com.wakeup.module.wechat;

import android.app.Notification;
import kotlin.Metadata;

/* compiled from: WechatMsgCallback.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH&¨\u0006\u000e"}, d2 = {"Lcom/wakeup/module/wechat/WechatMsgCallback;", "", "sendToWeChat", "", "msgType", "", "name", "", "txt", "toWxId", "sendToDevice", "content", "notification", "Landroid/app/Notification;", "feature-wechat_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface WechatMsgCallback {
    void sendToDevice(String name, String content, Notification notification);

    void sendToWeChat(int msgType, String name, String txt, String toWxId);
}
