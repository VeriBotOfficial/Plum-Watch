package com.bytedance.sdk.component.fxn;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* loaded from: classes13.dex */
public class dx extends fxn {
    static final /* synthetic */ boolean hie = true;
    protected WebView jq;
    protected String tw;

    @Override // com.bytedance.sdk.component.fxn.fxn
    protected Context fxn(jq jqVar) {
        if (jqVar.rb != null) {
            return jqVar.rb;
        }
        if (jqVar.fxn != null) {
            return jqVar.fxn.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.fxn.fxn
    protected String fxn() {
        return this.jq.getUrl();
    }

    @Override // com.bytedance.sdk.component.fxn.fxn
    protected void kg(jq jqVar) {
        this.jq = jqVar.fxn;
        this.tw = jqVar.gff;
        if (jqVar.rlu) {
            return;
        }
        gff();
    }

    protected void gff() {
        if (!hie && this.jq == null) {
            throw new AssertionError();
        }
        this.jq.addJavascriptInterface(this, this.tw);
    }

    @Override // com.bytedance.sdk.component.fxn.fxn
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @Override // com.bytedance.sdk.component.fxn.fxn
    protected void kg() {
        super.kg();
        hm();
    }

    protected void hm() {
        this.jq.removeJavascriptInterface(this.tw);
    }

    @Override // com.bytedance.sdk.component.fxn.fxn
    protected void fxn(String str, zu zuVar) {
        if (zuVar != null && !TextUtils.isEmpty(zuVar.tw)) {
            String str2 = zuVar.tw;
            fxn(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.fxn(str, zuVar);
    }

    @Override // com.bytedance.sdk.component.fxn.fxn
    protected void fxn(String str) {
        fxn(str, "javascript:" + this.tw + "._handleMessageFromToutiao(" + str + Separators.RPAREN);
    }

    private void fxn(String str, final String str2) {
        if (this.bh || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.fxn.dx.1
            @Override // java.lang.Runnable
            public void run() {
                if (dx.this.bh) {
                    return;
                }
                try {
                    dx.this.jq.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.hm.post(runnable);
        } else {
            runnable.run();
        }
    }
}
