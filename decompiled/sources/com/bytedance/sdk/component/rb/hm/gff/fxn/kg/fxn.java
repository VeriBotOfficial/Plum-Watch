package com.bytedance.sdk.component.rb.hm.gff.fxn.kg;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.rb.rmu;

/* loaded from: classes13.dex */
public class fxn implements rmu {
    private long fxn = 4194304;
    private int gff;
    private com.bytedance.sdk.component.rb.hm.gff.fxn.gff<String, Bitmap> hm;
    private int kg;

    public fxn(int i, int i2) {
        this.kg = i2;
        this.gff = i;
        this.hm = new com.bytedance.sdk.component.rb.hm.gff.fxn.gff<>(this.kg);
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public boolean fxn(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int fxn = fxn(bitmap);
                if (fxn <= this.fxn && fxn != 0) {
                    this.hm.fxn(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public Bitmap fxn(String str) {
        try {
            return this.hm.fxn((com.bytedance.sdk.component.rb.hm.gff.fxn.gff<String, Bitmap>) str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public boolean kg(String str) {
        return this.hm.fxn((com.bytedance.sdk.component.rb.hm.gff.fxn.gff<String, Bitmap>) str) != null;
    }

    public static int fxn(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
