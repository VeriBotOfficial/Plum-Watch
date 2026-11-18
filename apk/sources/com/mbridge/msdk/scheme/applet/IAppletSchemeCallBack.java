package com.mbridge.msdk.scheme.applet;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public interface IAppletSchemeCallBack extends Serializable {
    void onAppletSchemeRequestFailed(int r1, String str, String str2);

    void onAppletSchemeRequestStart();

    void onAppletSchemeRequestSuccess(String str);

    void onNetworkError(int r1, String str, String str2);
}
