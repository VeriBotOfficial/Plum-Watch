package com.anythink.expressad.splash.view;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;

/* loaded from: classes12.dex */
public class ATSplashWebview extends WindVaneWebView {
    private static final String d = "ATSplashWebview";
    private String e;

    public void finishAdSession() {
    }

    public ATSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public String getRequestId() {
        return this.e;
    }

    public void setRequestId(String str) {
        this.e = str;
    }
}
