package com.phancy.mini.core;

import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.phancy.mini.core.web.MiniJSCore;
import com.qumeng.overseas.advlib.__remote__.ui.front._imp_adbrowser;
import kotlin.Metadata;

/* compiled from: IAppService.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u000bH&J\b\u0010\u0011\u001a\u00020\u000bH&J\"\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0016H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/phancy/mini/core/IAppService;", "", "appServiceLayout", "Landroid/widget/FrameLayout;", "getAppServiceLayout", "()Landroid/widget/FrameLayout;", "jsCore", "Lcom/phancy/mini/core/web/MiniJSCore;", "getJsCore", "()Lcom/phancy/mini/core/web/MiniJSCore;", "evaluateJavascript", "", "script", "", "callback", "Landroid/webkit/ValueCallback;", _imp_adbrowser.ACTIVITY_PAUSE, _imp_adbrowser.ACTIVITY_RESUME, "subscribeHandler", "event", "params", "viewId", "", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface IAppService {
    void evaluateJavascript(String script, ValueCallback<String> callback);

    FrameLayout getAppServiceLayout();

    MiniJSCore getJsCore();

    void onPause();

    void onResume();

    void subscribeHandler(String event, String params, int viewId);
}
