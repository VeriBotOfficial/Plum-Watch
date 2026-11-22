package com.bytedance.sdk.component.fxn;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes13.dex */
public class jq {
    boolean bh;
    WebView fxn;
    sg hm;
    mvp jq;
    fxn kg;
    Context rb;
    boolean rlu;

    /* renamed from: sg, reason: collision with root package name */
    boolean f9364sg;
    dgx tw;
    String gff = "IESJSBridge";
    String hie = "host";
    final Set<String> dgx = new LinkedHashSet();
    final Set<String> mvp = new LinkedHashSet();

    jq(WebView webView) {
        this.fxn = webView;
    }

    jq() {
    }

    public jq fxn(fxn fxnVar) {
        this.kg = fxnVar;
        return this;
    }

    public jq fxn(String str) {
        this.gff = str;
        return this;
    }

    public jq fxn(hie hieVar) {
        this.hm = sg.fxn(hieVar);
        return this;
    }

    public jq fxn(boolean z) {
        this.bh = z;
        return this;
    }

    public jq kg(boolean z) {
        this.f9364sg = z;
        return this;
    }

    public ckl fxn() {
        kg();
        return new ckl(this);
    }

    private void kg() {
        if ((this.fxn == null && !this.rlu && this.kg == null) || ((TextUtils.isEmpty(this.gff) && this.fxn != null) || this.hm == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }
}
