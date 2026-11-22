package com.bytedance.sdk.openadsdk.multipro.hm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.rmu;
import java.util.Map;

/* loaded from: classes14.dex */
public class gff implements com.bytedance.sdk.openadsdk.multipro.fxn {
    private Context fxn;

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public String fxn() {
        return "t_sp";
    }

    private Context kg() {
        Context context = this.fxn;
        return context == null ? rmu.fxn() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public Cursor fxn(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Map<String, ?> gff;
        if (!uri.getPath().split("/")[2].equals("get_all") || (gff = kg.gff(kg(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : gff.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            Object obj = gff.get(str3);
            objArr[2] = obj;
            if (obj instanceof Boolean) {
                objArr[1] = "boolean";
            } else if (obj instanceof String) {
                objArr[1] = "string";
            } else if (obj instanceof Integer) {
                objArr[1] = "int";
            } else if (obj instanceof Long) {
                objArr[1] = "long";
            } else if (obj instanceof Float) {
                objArr[1] = "float";
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public String fxn(Uri uri) {
        String[] split = uri.getPath().split("/");
        String str = split[2];
        String str2 = split[3];
        if (str.equals("contain")) {
            return String.valueOf(kg.fxn(rmu.fxn(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return kg.fxn(kg(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public Uri fxn(Uri uri, ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split("/")[3];
        Object obj = contentValues.get("value");
        if (obj != null) {
            kg.fxn(kg(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public int fxn(Uri uri, String str, String[] strArr) {
        String[] split = uri.getPath().split("/");
        if (split[2].equals("clean")) {
            kg.kg(kg(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = split[3];
        if (kg.fxn(kg(), uri.getQueryParameter("sp_file_name"), str2)) {
            kg.kg(kg(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.fxn
    public int fxn(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        fxn(uri, contentValues);
        return 0;
    }
}
