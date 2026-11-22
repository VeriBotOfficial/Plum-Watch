package com.wakeup.module.xmly;

import android.app.Application;
import android.content.Context;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.storage.AppConfigManager;
import com.wakeup.common.storage.model.AppConfig;
import com.wakeup.commponent.module.xmly.XmlyService;
import com.xmly.businesssdk.BusinessSDK;
import com.xmly.businesssdk.config.BusinessSdkConfig;
import com.yandex.div.core.timer.TimerController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: XmlyServiceImpl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016¨\u0006\u001b"}, d2 = {"Lcom/wakeup/module/xmly/XmlyServiceImpl;", "Lcom/wakeup/commponent/module/xmly/XmlyService;", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "initSuccess", "open", "extendInfo", "", "showEntryFailure", "", "checkUserInfo", "getIndexPageUrl", "jumpParamsUrl", "url", "queryKey", "keyTxt", "play", "albumId", "trackId", "handlerAppLLmData", "data", TimerController.STOP_COMMAND, "initXmly", "module-xmly_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class XmlyServiceImpl implements XmlyService {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AppConfig config = AppConfigManager.getConfig();
        LogUtils.i("XmlyServiceImpl", "init " + config.isAgreePrivacy());
        config.isAgreePrivacy();
    }

    @Override // com.wakeup.commponent.module.xmly.XmlyService
    public void initSuccess() {
        XmlyHelper.INSTANCE.init();
    }

    @Override // com.wakeup.commponent.module.xmly.XmlyService
    public void open(String extendInfo) {
        Intrinsics.checkNotNullParameter(extendInfo, "extendInfo");
        XmlyHelper.checkUserInfo$default(XmlyHelper.INSTANCE, extendInfo, false, false, 6, null);
    }

    @Override // com.wakeup.commponent.module.xmly.XmlyService
    public void open(String extendInfo, boolean showEntryFailure) {
        Intrinsics.checkNotNullParameter(extendInfo, "extendInfo");
        XmlyHelper.checkUserInfo$default(XmlyHelper.INSTANCE, extendInfo, false, showEntryFailure, 2, null);
    }

    @Override // com.wakeup.commponent.module.xmly.XmlyService
    public void checkUserInfo(String extendInfo) {
        Intrinsics.checkNotNullParameter(extendInfo, "extendInfo");
        XmlyHelper.checkUserInfo$default(XmlyHelper.INSTANCE, extendInfo, false, false, 4, null);
    }

    @Override // com.wakeup.commponent.module.xmly.XmlyService
    public String getIndexPageUrl() {
        return "https://m.ximalaya.com/gatekeeper/aiot-common-h5";
    }

    @Override // com.wakeup.commponent.module.xmly.XmlyService
    public void jumpParamsUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        XmlyHelper.INSTANCE.jumpParamsUrl(url);
    }

    @Override // com.wakeup.commponent.module.xmly.XmlyService
    public void queryKey(String keyTxt) {
        Intrinsics.checkNotNullParameter(keyTxt, "keyTxt");
        XmlyHelper.INSTANCE.queryKey(keyTxt);
    }

    @Override // com.wakeup.commponent.module.xmly.XmlyService
    public void play(String albumId, String trackId) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        XmlyHelper.INSTANCE.play(albumId, trackId);
    }

    @Override // com.wakeup.commponent.module.xmly.XmlyService
    public void handlerAppLLmData(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        XmlyHelper.INSTANCE.handlerAppLLmData(data);
    }

    @Override // com.wakeup.commponent.module.xmly.XmlyService
    public void stop() {
        XmlyHelper.INSTANCE.stop();
    }

    @Override // com.wakeup.commponent.module.xmly.XmlyService
    public void initXmly() {
        if (BusinessSDK.INSTANCE.isInitialized()) {
            return;
        }
        BusinessSdkConfig.Builder builder = new BusinessSdkConfig.Builder();
        String packageName = BaseApplication.getApplication().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        BusinessSdkConfig build = builder.setAppId(packageName).setUseMediaSession(false).setDebugMode(false).build();
        BusinessSDK.Companion companion = BusinessSDK.INSTANCE;
        Application application = BaseApplication.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        companion.init(application, build, new Function1() { // from class: com.wakeup.module.xmly.XmlyServiceImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit initXmly$lambda$0;
                initXmly$lambda$0 = XmlyServiceImpl.initXmly$lambda$0(XmlyServiceImpl.this, ((Boolean) obj).booleanValue());
                return initXmly$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initXmly$lambda$0(XmlyServiceImpl xmlyServiceImpl, boolean z) {
        if (z) {
            LogUtils.i("XmlyServiceImpl", "initXmlySdk BusinessSDK 初始化成功 false");
            xmlyServiceImpl.initSuccess();
        } else {
            LogUtils.w("XmlyServiceImpl", "initXmlySdk BusinessSDK 初始化失败 false");
        }
        return Unit.INSTANCE;
    }
}
