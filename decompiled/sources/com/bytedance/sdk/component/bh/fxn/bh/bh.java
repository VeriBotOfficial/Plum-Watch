package com.bytedance.sdk.component.bh.fxn.bh;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.baidu.mapapi.SDKInitializer;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes13.dex */
public class bh implements rb {
    private Context fxn;

    public bh(Context context) {
        this.fxn = context;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.bh.rb
    public List<hm> fxn() {
        LinkedList linkedList = new LinkedList();
        Cursor fxn = com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(this.fxn, "trackurl", null, null, null, null, null, null);
        if (fxn != null) {
            while (fxn.moveToNext()) {
                try {
                    String string = fxn.getString(fxn.getColumnIndex("id"));
                    String string2 = fxn.getString(fxn.getColumnIndex("url"));
                    boolean z = fxn.getInt(fxn.getColumnIndex("replaceholder")) > 0;
                    int i = fxn.getInt(fxn.getColumnIndex("retry"));
                    int i2 = fxn.getInt(fxn.getColumnIndex("url_type"));
                    String string3 = fxn.getString(fxn.getColumnIndex("ad_id"));
                    String string4 = fxn.getString(fxn.getColumnIndex(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE));
                    String string5 = fxn.getString(fxn.getColumnIndex("error_msg"));
                    hm hmVar = new hm(string, string2, z, i2, string3);
                    hmVar.fxn(i);
                    if (!TextUtils.isEmpty(string4)) {
                        hmVar.fxn(string4);
                    }
                    if (!TextUtils.isEmpty(string5)) {
                        hmVar.kg(string5);
                    }
                    linkedList.add(hmVar);
                } catch (Throwable unused) {
                    if (fxn != null) {
                        try {
                            fxn.close();
                            fxn = null;
                        } finally {
                            if (fxn != null) {
                                fxn.close();
                            }
                        }
                    }
                    if (fxn != null) {
                        fxn.close();
                    }
                }
            }
            if (fxn != null) {
                return linkedList;
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.bh.rb
    public hm fxn(String str) {
        Cursor fxn = com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(this.fxn, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (fxn != null && fxn.moveToFirst()) {
            try {
                String string = fxn.getString(fxn.getColumnIndex("id"));
                String string2 = fxn.getString(fxn.getColumnIndex("url"));
                boolean z = fxn.getInt(fxn.getColumnIndex("replaceholder")) > 0;
                int i = fxn.getInt(fxn.getColumnIndex("retry"));
                int i2 = fxn.getInt(fxn.getColumnIndex("url_type"));
                String string3 = fxn.getString(fxn.getColumnIndex("ad_id"));
                String string4 = fxn.getString(fxn.getColumnIndex(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE));
                String string5 = fxn.getString(fxn.getColumnIndex("error_msg"));
                hm hmVar = new hm(string, string2, z, i2, string3);
                hmVar.fxn(i);
                if (!TextUtils.isEmpty(string4)) {
                    hmVar.fxn(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    hmVar.kg(string5);
                }
                return hmVar;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    fxn.close();
                    fxn = null;
                } finally {
                    fxn.close();
                }
            }
        }
        if (fxn != null) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.bh.rb
    public void fxn(hm hmVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", hmVar.fxn());
        contentValues.put("url", hmVar.kg());
        contentValues.put("replaceholder", Integer.valueOf(hmVar.gff() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(hmVar.hm()));
        contentValues.put("url_type", Integer.valueOf(hmVar.rb()));
        contentValues.put("ad_id", hmVar.bh());
        contentValues.put(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, hmVar.sg());
        contentValues.put("error_msg", hmVar.jq());
        com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(this.fxn, "trackurl", contentValues);
    }

    @Override // com.bytedance.sdk.component.bh.fxn.bh.rb
    public void kg(hm hmVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", hmVar.fxn());
        contentValues.put("url", hmVar.kg());
        contentValues.put("replaceholder", Integer.valueOf(hmVar.gff() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(hmVar.hm()));
        contentValues.put(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, hmVar.sg());
        contentValues.put("error_msg", hmVar.jq());
        contentValues.put("url_type", Integer.valueOf(hmVar.rb()));
        contentValues.put("ad_id", hmVar.bh());
        com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(this.fxn, "trackurl", contentValues, "id=?", new String[]{hmVar.fxn()});
    }

    @Override // com.bytedance.sdk.component.bh.fxn.bh.rb
    public void gff(hm hmVar) {
        com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(this.fxn, "trackurl", "id=?", new String[]{hmVar.fxn()});
    }

    public static String kg() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }
}
