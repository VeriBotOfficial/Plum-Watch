package com.wakeup.module.whatsapp;

import android.content.Context;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commponent.module.device.whatsapp.WhatsAppService;
import kotlin.Metadata;

/* compiled from: WhatsAppServiceImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/wakeup/module/whatsapp/WhatsAppServiceImpl;", "Lcom/wakeup/commponent/module/device/whatsapp/WhatsAppService;", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "logout", "feature-whatsapp_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WhatsAppServiceImpl implements WhatsAppService {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        LogUtils.i("WhatsAppServiceImpl", "init");
        WhatsAppDevMgr.INSTANCE.init();
    }

    @Override // com.wakeup.commponent.module.device.whatsapp.WhatsAppService
    public void logout() {
        WhatsAppMgrQrRefresh.INSTANCE.logout();
    }
}
