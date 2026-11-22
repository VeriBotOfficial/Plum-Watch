package com.phancy.mini.core;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.qumeng.overseas.advlib.__remote__.ui.front._imp_adbrowser;
import kotlin.Metadata;

/* compiled from: IAppEngine.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\bf\u0018\u0000 (2\u00020\u0001:\u0001(J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u000bH&J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH&J\b\u0010 \u001a\u00020\u001dH&J\b\u0010!\u001a\u00020\u001dH&J\b\u0010\"\u001a\u00020\u001dH&J\b\u0010#\u001a\u00020\u001dH&J\b\u0010$\u001a\u00020\u000bH&J$\u0010%\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010&\u001a\u0004\u0018\u00010'H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\t¨\u0006)"}, d2 = {"Lcom/phancy/mini/core/IAppEngine;", "", "appService", "Lcom/phancy/mini/core/IAppService;", "getAppService", "()Lcom/phancy/mini/core/IAppService;", "engineType", "", "getEngineType", "()I", "lifecycleEnabled", "", "getLifecycleEnabled", "()Z", "pageCount", "getPageCount", "topPage", "Lcom/phancy/mini/core/IPage;", "getTopPage", "()Lcom/phancy/mini/core/IPage;", "topPageId", "getTopPageId", "handlePageEvent", "event", "", "params", "Lcom/alibaba/fastjson/JSONObject;", "onBackPressed", "onNewIntent", "", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", _imp_adbrowser.ACTIVITY_PAUSE, "onRelaunchByUser", _imp_adbrowser.ACTIVITY_RESUME, "onServiceReady", "requestGoHomeOnBack", "subscribePageHandler", "viewIds", "", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface IAppEngine {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int WEB_ENGINE = 1;
    public static final int WEB_MIXED_ENGINE = 3;
    public static final int WEB_PLUS_ENGINE = 2;

    IAppService getAppService();

    int getEngineType();

    boolean getLifecycleEnabled();

    int getPageCount();

    IPage getTopPage();

    int getTopPageId();

    boolean handlePageEvent(String event, JSONObject params);

    boolean onBackPressed();

    void onNewIntent(Intent intent);

    void onPause();

    void onRelaunchByUser();

    void onResume();

    void onServiceReady();

    boolean requestGoHomeOnBack();

    void subscribePageHandler(String event, String params, int[] viewIds);

    /* compiled from: IAppEngine.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/phancy/mini/core/IAppEngine$Companion;", "", "()V", "WEB_ENGINE", "", "WEB_MIXED_ENGINE", "WEB_PLUS_ENGINE", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int WEB_ENGINE = 1;
        public static final int WEB_MIXED_ENGINE = 3;
        public static final int WEB_PLUS_ENGINE = 2;

        private Companion() {
        }
    }
}
