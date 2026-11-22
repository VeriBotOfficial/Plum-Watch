package com.wakeup.module.wechat;

import android.app.Notification;
import android.content.Context;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.network.entity.wechat.LoginCheckBean;
import com.wakeup.commponent.ServiceManager;
import com.wakeup.commponent.module.device.wechat.WechatReplyService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WechatReplyServiceImpl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0012\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¨\u0006\u0018"}, d2 = {"Lcom/wakeup/module/wechat/WechatReplyServiceImpl;", "Lcom/wakeup/commponent/module/device/wechat/WechatReplyService;", "<init>", "()V", "startWechatSocket", "", "logout", "isResetQr", "", "handlerReceiveMsg", "name", "", "content", "notification", "Landroid/app/Notification;", "supportOpus", "connectNats", "getUserCache", "Lcom/wakeup/common/network/entity/wechat/LoginCheckBean;", "pairVersion", "isWs", "init", "context", "Landroid/content/Context;", "feature-wechat_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WechatReplyServiceImpl implements WechatReplyService {
    @Override // com.wakeup.commponent.module.device.wechat.WechatReplyService
    public void connectNats() {
    }

    @Override // com.wakeup.commponent.module.device.wechat.WechatReplyService
    public void startWechatSocket() {
        WechatReplyMgr.INSTANCE.startWechatSocket();
    }

    @Override // com.wakeup.commponent.module.device.wechat.WechatReplyService
    public void logout(boolean isResetQr) {
        WechatReplyMgr.logout(isResetQr);
    }

    @Override // com.wakeup.commponent.module.device.wechat.WechatReplyService
    public void handlerReceiveMsg(String name, String content, Notification notification) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        WechatMsgHandler.handlerReceiveMsg(name, content, notification);
    }

    @Override // com.wakeup.commponent.module.device.wechat.WechatReplyService
    public void supportOpus() {
        ServiceManager.getDeviceService().sendData(WechatMsgOrder.sendSupportOpus());
    }

    @Override // com.wakeup.commponent.module.device.wechat.WechatReplyService
    public LoginCheckBean getUserCache() {
        return WechatReplyMgr.getUser();
    }

    @Override // com.wakeup.commponent.module.device.wechat.WechatReplyService
    public void pairVersion(boolean isWs) {
        ServiceManager.getDeviceService().sendData(WechatMsgOrder.sendVersion(isWs));
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        LogUtils.i("WechatReplyServiceImpl", "init");
        WeChatDeviceMgr.INSTANCE.init();
    }
}
