package com.bytedance.sdk.openadsdk.je.fxn;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.component.utils.hm;

/* loaded from: classes14.dex */
public class kg {
    int fxn;
    private byte[] gff;
    private Bitmap hm;
    private Drawable kg;
    private Bitmap rb;

    public kg(Drawable drawable, int i) {
        this.gff = null;
        this.hm = null;
        this.rb = null;
        this.kg = drawable;
        this.fxn = i;
    }

    public kg(byte[] bArr, int i) {
        this.kg = null;
        this.hm = null;
        this.rb = null;
        this.gff = bArr;
        this.fxn = i;
    }

    public kg(Bitmap bitmap, Bitmap bitmap2, int i) {
        this.kg = null;
        this.gff = null;
        this.rb = bitmap2;
        this.hm = bitmap;
        this.fxn = i;
    }

    public Bitmap fxn() {
        return this.hm;
    }

    public Bitmap kg() {
        return this.rb;
    }

    public byte[] gff() {
        try {
            if (this.gff == null) {
                this.gff = hm.fxn(this.hm);
            }
        } catch (OutOfMemoryError e) {
            dx.gff("GifRequestResult", e.getMessage());
        }
        return this.gff;
    }

    public Drawable hm() {
        return this.kg;
    }

    public boolean rb() {
        if (this.hm != null || this.kg != null) {
            return true;
        }
        byte[] bArr = this.gff;
        return bArr != null && bArr.length > 0;
    }
}
