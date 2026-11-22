package com.xmly.businesssdk.service;

import com.xmly.businesssdk.login.ExternalLoginError;
import kotlin.Metadata;

/* compiled from: UcActionListener.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/xmly/businesssdk/service/UcActionListener;", "", "onLoginFailed", "", "error", "Lcom/xmly/businesssdk/login/ExternalLoginError;", "onLoginSuccess", "onUcPayRequested", "albumId", "", "onUcPlayerRequested", "playerData", "Lcom/xmly/businesssdk/service/PlayerRequestData;", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface UcActionListener {
    void onLoginFailed(ExternalLoginError error);

    void onLoginSuccess();

    void onUcPayRequested(String albumId);

    void onUcPlayerRequested(PlayerRequestData playerData);
}
