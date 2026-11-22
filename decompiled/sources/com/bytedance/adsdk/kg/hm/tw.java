package com.bytedance.adsdk.kg.hm;

import android.content.Context;
import android.util.Pair;
import com.anythink.core.common.m.a;
import com.bytedance.adsdk.kg.mvp;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes13.dex */
public class tw {
    private final sg fxn;
    private final bh kg;

    public tw(sg sgVar, bh bhVar) {
        this.fxn = sgVar;
        this.kg = bhVar;
    }

    public mvp<com.bytedance.adsdk.kg.sg> fxn(Context context, String str, String str2) {
        com.bytedance.adsdk.kg.sg kg = kg(context, str, str2);
        if (kg != null) {
            return new mvp<>(kg);
        }
        return gff(context, str, str2);
    }

    private com.bytedance.adsdk.kg.sg kg(Context context, String str, String str2) {
        sg sgVar;
        Pair<gff, InputStream> fxn;
        mvp<com.bytedance.adsdk.kg.sg> kg;
        if (str2 == null || (sgVar = this.fxn) == null || (fxn = sgVar.fxn(str)) == null) {
            return null;
        }
        gff gffVar = (gff) fxn.first;
        InputStream inputStream = (InputStream) fxn.second;
        if (gffVar == gff.ZIP) {
            kg = com.bytedance.adsdk.kg.tw.fxn(context, new ZipInputStream(inputStream), str2);
        } else {
            kg = com.bytedance.adsdk.kg.tw.kg(inputStream, str2);
        }
        if (kg.fxn() != null) {
            return kg.fxn();
        }
        return null;
    }

    private mvp<com.bytedance.adsdk.kg.sg> gff(Context context, String str, String str2) {
        hm hmVar = null;
        try {
            try {
                hm fxn = this.kg.fxn(str);
                if (fxn.fxn()) {
                    mvp<com.bytedance.adsdk.kg.sg> fxn2 = fxn(context, str, fxn.kg(), fxn.gff(), str2);
                    fxn2.fxn();
                    if (fxn != null) {
                        try {
                            fxn.close();
                        } catch (IOException unused) {
                        }
                    }
                    return fxn2;
                }
                mvp<com.bytedance.adsdk.kg.sg> mvpVar = new mvp<>(new IllegalArgumentException(fxn.hm()));
                if (fxn != null) {
                    try {
                        fxn.close();
                    } catch (IOException unused2) {
                    }
                }
                return mvpVar;
            } catch (Exception e) {
                mvp<com.bytedance.adsdk.kg.sg> mvpVar2 = new mvp<>(e);
                if (0 != 0) {
                    try {
                        hmVar.close();
                    } catch (IOException unused3) {
                    }
                }
                return mvpVar2;
            }
        } finally {
        }
    }

    private mvp<com.bytedance.adsdk.kg.sg> fxn(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        mvp<com.bytedance.adsdk.kg.sg> fxn;
        gff gffVar;
        sg sgVar;
        if (str2 == null) {
            str2 = a.f3976q;
        }
        if (str2.contains(DfuBaseService.MIME_TYPE_ZIP) || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            gff gffVar2 = gff.ZIP;
            fxn = fxn(context, str, inputStream, str3);
            gffVar = gffVar2;
        } else {
            gffVar = gff.JSON;
            fxn = fxn(str, inputStream, str3);
        }
        if (str3 != null && fxn.fxn() != null && (sgVar = this.fxn) != null) {
            sgVar.fxn(str, gffVar);
        }
        return fxn;
    }

    private mvp<com.bytedance.adsdk.kg.sg> fxn(Context context, String str, InputStream inputStream, String str2) throws IOException {
        sg sgVar;
        if (str2 == null || (sgVar = this.fxn) == null) {
            return com.bytedance.adsdk.kg.tw.fxn(context, new ZipInputStream(inputStream), (String) null);
        }
        return com.bytedance.adsdk.kg.tw.fxn(context, new ZipInputStream(new FileInputStream(sgVar.fxn(str, inputStream, gff.ZIP))), str);
    }

    private mvp<com.bytedance.adsdk.kg.sg> fxn(String str, InputStream inputStream, String str2) throws IOException {
        sg sgVar;
        if (str2 == null || (sgVar = this.fxn) == null) {
            return com.bytedance.adsdk.kg.tw.kg(inputStream, (String) null);
        }
        return com.bytedance.adsdk.kg.tw.kg(new FileInputStream(sgVar.fxn(str, inputStream, gff.JSON).getAbsolutePath()), str);
    }
}
