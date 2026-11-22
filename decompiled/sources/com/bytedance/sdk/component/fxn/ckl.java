package com.bytedance.sdk.component.fxn;

import android.webkit.WebView;
import com.bytedance.sdk.component.fxn.gff;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes13.dex */
public class ckl {
    private final fxn fxn;
    private final jq gff;
    private final List<mvp> hm;
    private final WebView kg;
    private volatile boolean rb;

    public static jq fxn(WebView webView) {
        return new jq(webView);
    }

    public ckl fxn(String str, hm<?, ?> hmVar) {
        return fxn(str, (String) null, hmVar);
    }

    public ckl fxn(Set<String> set, je<?, ?> jeVar) {
        return fxn(set, (String) null, jeVar);
    }

    public ckl fxn(String str, String str2, hm<?, ?> hmVar) {
        kg();
        this.fxn.f9363sg.fxn(str, hmVar);
        return this;
    }

    public ckl fxn(Set<String> set, String str, je<?, ?> jeVar) {
        kg();
        this.fxn.f9363sg.fxn(set, jeVar);
        return this;
    }

    public ckl fxn(String str, gff.kg kgVar) {
        return fxn(str, (String) null, kgVar);
    }

    public ckl fxn(String str, String str2, gff.kg kgVar) {
        kg();
        this.fxn.f9363sg.fxn(str, kgVar);
        return this;
    }

    public void fxn() {
        if (this.rb) {
            return;
        }
        this.fxn.kg();
        this.rb = true;
        Iterator<mvp> it = this.hm.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    ckl(jq jqVar) {
        ArrayList arrayList = new ArrayList();
        this.hm = arrayList;
        this.rb = false;
        this.gff = jqVar;
        if (jqVar.fxn != null) {
            if (jqVar.kg == null) {
                this.fxn = new dx();
            } else {
                this.fxn = jqVar.kg;
            }
        } else {
            this.fxn = jqVar.kg;
        }
        this.fxn.gff(jqVar);
        this.kg = jqVar.fxn;
        arrayList.add(jqVar.jq);
        ud.fxn(jqVar.f9364sg);
    }

    private void kg() {
        if (this.rb) {
            tw.fxn(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }
}
