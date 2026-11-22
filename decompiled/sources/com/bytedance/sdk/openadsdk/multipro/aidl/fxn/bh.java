package com.bytedance.sdk.openadsdk.multipro.aidl.fxn;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.component.bh.fxn.bh;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.core.settings.jq;
import java.util.Map;

/* loaded from: classes14.dex */
public class bh extends bh.fxn {
    private static volatile bh fxn;

    public static bh kg() {
        if (fxn == null) {
            synchronized (bh.class) {
                if (fxn == null) {
                    fxn = new bh();
                }
            }
        }
        return fxn;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.bh
    public Map fxn(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!jq.fxn()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.fxn.fxn.fxn(com.bytedance.sdk.openadsdk.multipro.rb.fxn(rmu.fxn()).fxn(uri, strArr, str, strArr2, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.bh.fxn.bh
    public String fxn(Uri uri) {
        if (jq.fxn()) {
            return com.bytedance.sdk.openadsdk.multipro.rb.fxn(rmu.fxn()).fxn(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.bh
    public String fxn(Uri uri, ContentValues contentValues) {
        Uri fxn2;
        if (jq.fxn() && (fxn2 = com.bytedance.sdk.openadsdk.multipro.rb.fxn(rmu.fxn()).fxn(uri, contentValues)) != null) {
            return fxn2.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.bh
    public int fxn(Uri uri, String str, String[] strArr) {
        if (jq.fxn()) {
            return com.bytedance.sdk.openadsdk.multipro.rb.fxn(rmu.fxn()).fxn(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.bh
    public int fxn(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (jq.fxn()) {
            return com.bytedance.sdk.openadsdk.multipro.rb.fxn(rmu.fxn()).fxn(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
