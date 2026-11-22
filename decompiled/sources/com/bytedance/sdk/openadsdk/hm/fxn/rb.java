package com.bytedance.sdk.openadsdk.hm.fxn;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes14.dex */
public class rb implements com.bytedance.sdk.openadsdk.multipro.fxn {
    private final com.bytedance.sdk.component.bh.fxn.kg.kg.kg fxn;

    public rb(com.bytedance.sdk.component.bh.fxn.kg.kg.kg kgVar) {
        this.fxn = kgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public String fxn() {
        com.bytedance.sdk.component.bh.fxn.kg.kg.kg kgVar = this.fxn;
        if (kgVar != null) {
            return kgVar.gff();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public String fxn(Uri uri) {
        com.bytedance.sdk.component.bh.fxn.kg.kg.kg kgVar = this.fxn;
        if (kgVar != null) {
            return kgVar.fxn(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public Cursor fxn(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.bytedance.sdk.component.bh.fxn.kg.kg.kg kgVar = this.fxn;
        if (kgVar != null) {
            return kgVar.fxn(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public Uri fxn(Uri uri, ContentValues contentValues) {
        com.bytedance.sdk.component.bh.fxn.kg.kg.kg kgVar = this.fxn;
        if (kgVar != null) {
            return kgVar.fxn(uri, contentValues);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public int fxn(Uri uri, String str, String[] strArr) {
        com.bytedance.sdk.component.bh.fxn.kg.kg.kg kgVar = this.fxn;
        if (kgVar != null) {
            return kgVar.fxn(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public int fxn(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        com.bytedance.sdk.component.bh.fxn.kg.kg.kg kgVar = this.fxn;
        if (kgVar != null) {
            return kgVar.fxn(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
