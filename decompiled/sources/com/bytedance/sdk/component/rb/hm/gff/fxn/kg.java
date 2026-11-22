package com.bytedance.sdk.component.rb.hm.gff.fxn;

import android.content.Context;
import java.io.File;

/* loaded from: classes13.dex */
public class kg implements com.bytedance.sdk.component.rb.kg, Cloneable {
    private static volatile com.bytedance.sdk.component.rb.kg jq;
    private boolean bh;
    private long fxn;
    private int gff;
    private int hm;
    private int kg;
    private boolean rb;

    /* renamed from: sg, reason: collision with root package name */
    private boolean f9389sg;
    private File tw;

    @Override // com.bytedance.sdk.component.rb.kg
    public boolean jq() {
        return true;
    }

    public kg(int i, int i2, int i3, long j, File file) {
        this(i, i2, i3, j, i2 != 0, j != 0, file);
    }

    public kg(int i, int i2, int i3, long j, boolean z, boolean z2, File file) {
        this.fxn = j;
        this.kg = i;
        this.gff = i2;
        this.hm = i3;
        this.rb = z;
        this.bh = z2;
        this.tw = file;
        this.f9389sg = i3 != 0;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public long fxn() {
        return this.fxn;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public int kg() {
        return this.kg;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public int gff() {
        return this.gff;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public int hm() {
        return this.hm;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public boolean rb() {
        return this.rb;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public boolean bh() {
        return this.f9389sg;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public boolean sg() {
        return this.bh;
    }

    @Override // com.bytedance.sdk.component.rb.kg
    public File tw() {
        return this.tw;
    }

    public static void fxn(Context context, com.bytedance.sdk.component.rb.kg kgVar) {
        if (kgVar != null) {
            jq = kgVar;
        } else {
            jq = fxn(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.rb.kg fxn(File file) {
        long fxn;
        int gff;
        int hm;
        file.mkdirs();
        if (jq == null) {
            gff = 10;
            hm = 14;
            fxn = 20;
        } else {
            fxn = jq.fxn();
            gff = jq.gff();
            hm = jq.hm();
        }
        return new kg(0, gff, hm, fxn, file);
    }

    public static com.bytedance.sdk.component.rb.kg hie() {
        return jq;
    }
}
