package com.wakeup.commponent.module.device.wechat;

import android.app.Notification;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.wakeup.common.network.entity.wechat.LoginCheckBean;
import kotlin.Metadata;

/* compiled from: WechatReplyService.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\"\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0006H&¨\u0006\u0013"}, d2 = {"Lcom/wakeup/commponent/module/device/wechat/WechatReplyService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "startWechatSocket", "", "logout", "isResetQr", "", "handlerReceiveMsg", "name", "", "content", "notification", "Landroid/app/Notification;", "supportOpus", "connectNats", "getUserCache", "Lcom/wakeup/common/network/entity/wechat/LoginCheckBean;", "pairVersion", "isWs", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WechatReplyService extends IProvider {
    void connectNats();

    LoginCheckBean getUserCache();

    void handlerReceiveMsg(String name, String content, Notification notification);

    void logout(boolean isResetQr);

    void pairVersion(boolean isWs);

    void startWechatSocket();

    void supportOpus();
}
