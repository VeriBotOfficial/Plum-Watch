package com.bytedance.sdk.component.rb.gff.fxn.kg;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.rb.rmu;

/* loaded from: classes13.dex */
public class kg implements rmu {
    private int fxn;
    private com.bytedance.sdk.component.rb.gff.fxn.gff<String, Bitmap> gff;
    private int kg;

    public kg(int i, int i2) {
        this.kg = i;
        this.fxn = i2;
        this.gff = new com.bytedance.sdk.component.rb.gff.fxn.gff<String, Bitmap>(i) { // from class: com.bytedance.sdk.component.rb.gff.fxn.kg.kg.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.rb.gff.fxn.gff
            /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
            public int kg(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return kg.fxn(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public boolean fxn(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.gff.fxn(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public Bitmap fxn(String str) {
        return this.gff.fxn((com.bytedance.sdk.component.rb.gff.fxn.gff<String, Bitmap>) str);
    }

    @Override // com.bytedance.sdk.component.rb.fxn
    public boolean kg(String str) {
        return this.gff.fxn((com.bytedance.sdk.component.rb.gff.fxn.gff<String, Bitmap>) str) != null;
    }

    public static int fxn(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
