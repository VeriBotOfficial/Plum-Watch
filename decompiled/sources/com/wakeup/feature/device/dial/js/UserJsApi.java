package com.wakeup.feature.device.dial.js;

import android.webkit.JavascriptInterface;
import com.wakeup.common.storage.model.UserModel;
import com.wakeup.commponent.module.h5.JsApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserJsApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/wakeup/feature/device/dial/js/UserJsApi;", "Lcom/wakeup/commponent/module/h5/JsApi;", "userModel", "Lcom/wakeup/common/storage/model/UserModel;", "<init>", "(Lcom/wakeup/common/storage/model/UserModel;)V", "getUserModel", "()Lcom/wakeup/common/storage/model/UserModel;", "getName", "", "getUserToken", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserJsApi extends JsApi {
    private final UserModel userModel;

    public UserJsApi(UserModel userModel) {
        Intrinsics.checkNotNullParameter(userModel, "userModel");
        this.userModel = userModel;
    }

    public final UserModel getUserModel() {
        return this.userModel;
    }

    @Override // com.wakeup.commponent.module.h5.JsApi
    public String getName() {
        return "android_user";
    }

    @JavascriptInterface
    public final String getUserToken() {
        String token = this.userModel.getToken();
        Intrinsics.checkNotNullExpressionValue(token, "getToken(...)");
        return token;
    }
}
