package com.bytedance.sdk.component.kg.fxn.fxn.fxn;

import android.text.TextUtils;
import com.bytedance.sdk.component.kg.fxn.ckl;
import com.bytedance.sdk.component.kg.fxn.mvp;
import com.bytedance.sdk.component.kg.fxn.zu;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class tw extends zu {
    public static int fxn = -1;
    mvp gff;
    int hm;
    HttpURLConnection kg;
    String rb;

    @Override // com.bytedance.sdk.component.kg.fxn.zu
    public long fxn() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.zu
    public long kg() {
        return 0L;
    }

    public tw(HttpURLConnection httpURLConnection, mvp mvpVar) {
        this.hm = fxn;
        this.kg = httpURLConnection;
        this.gff = mvpVar;
    }

    public tw(int i, String str, mvp mvpVar) {
        this.rb = str;
        this.gff = mvpVar;
        this.hm = i;
    }

    public mvp jq() {
        return this.gff;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.zu
    public int gff() {
        try {
            return this.kg.getResponseCode();
        } catch (Exception unused) {
            return this.hm;
        }
    }

    @Override // com.bytedance.sdk.component.kg.fxn.zu
    public boolean hm() {
        return gff() >= 200 && gff() < 300;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.zu
    public String rb() throws IOException {
        if (!TextUtils.isEmpty(this.rb)) {
            return this.rb;
        }
        return this.kg.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.kg.fxn.zu
    public ckl bh() {
        jq jqVar;
        mvp mvpVar = this.gff;
        if (mvpVar != null && mvpVar.kg != null) {
            this.gff.kg.dgx();
        }
        try {
            try {
                jqVar = new jq(this.kg);
            } catch (Throwable th) {
                th.getMessage();
                jqVar = null;
            }
        } catch (Exception unused) {
            HttpURLConnection httpURLConnection = this.kg;
            jqVar = new jq(httpURLConnection, httpURLConnection.getErrorStream());
        }
        mvp mvpVar2 = this.gff;
        if (mvpVar2 != null && mvpVar2.kg != null) {
            this.gff.kg.rlu();
        }
        return jqVar;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.zu
    public com.bytedance.sdk.component.kg.fxn.bh sg() {
        if (this.kg == null) {
            return new com.bytedance.sdk.component.kg.fxn.bh(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.kg.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!HttpHeaders.CONTENT_RANGE.equalsIgnoreCase(entry.getKey()) || gff() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.kg.fxn.bh((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.kg.fxn.zu, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            bh().close();
        } catch (Exception unused) {
        }
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.kg.fxn.zu
    public com.bytedance.sdk.component.kg.fxn.hie tw() {
        if (jq() == null || jq().kg == null) {
            return null;
        }
        return new com.bytedance.sdk.component.kg.fxn.hie(jq().kg);
    }
}
