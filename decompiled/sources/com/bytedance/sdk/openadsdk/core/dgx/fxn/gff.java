package com.bytedance.sdk.openadsdk.core.dgx.fxn;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.phancy.mini.api.file.FileSystemManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes14.dex */
public class gff {
    public static int fxn = 20;
    private static volatile gff kg;
    private final Object gff = new Object();
    private final LruCache<String, fxn> hm = new LruCache<String, fxn>(fxn) { // from class: com.bytedance.sdk.openadsdk.core.dgx.fxn.gff.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, fxn fxnVar) {
            return 1;
        }
    };

    private gff() {
    }

    public static gff fxn() {
        if (kg == null) {
            synchronized (gff.class) {
                if (kg == null) {
                    kg = new gff();
                }
            }
        }
        return kg;
    }

    fxn fxn(String str, String str2) {
        fxn fxnVar;
        fxn fxn2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.gff) {
            fxnVar = this.hm.get(str);
        }
        if (fxnVar != null) {
            if (TextUtils.equals(str2, fxnVar.kg())) {
                return fxnVar;
            }
            kg(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.gff gffVar = new com.bytedance.sdk.openadsdk.multipro.aidl.gff(com.bytedance.sdk.openadsdk.multipro.fxn.fxn.fxn(rmu.fxn(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (gffVar.moveToFirst()) {
                do {
                    int columnIndex = gffVar.getColumnIndex("id");
                    int columnIndex2 = gffVar.getColumnIndex(FileSystemManager.DIGEST_MD5);
                    int columnIndex3 = gffVar.getColumnIndex("url");
                    int columnIndex4 = gffVar.getColumnIndex("data");
                    int columnIndex5 = gffVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = gffVar.getColumnIndex("rit");
                        String string = gffVar.getString(columnIndex);
                        String string2 = gffVar.getString(columnIndex2);
                        String string3 = gffVar.getString(columnIndex3);
                        String string4 = gffVar.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            return null;
                        }
                        fxn2 = new fxn().fxn(string).kg(string2).hm(string4).gff(string3).rb(columnIndex6 != -1 ? gffVar.getString(columnIndex6) : null).fxn(Long.valueOf(gffVar.getLong(columnIndex5)));
                        synchronized (this.gff) {
                            this.hm.put(string, fxn2);
                        }
                    }
                    return null;
                } while (gffVar.moveToNext());
                return fxn2;
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }

    void fxn(fxn fxnVar) {
        if (fxnVar == null || TextUtils.isEmpty(fxnVar.fxn())) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.gff gffVar = new com.bytedance.sdk.openadsdk.multipro.aidl.gff(com.bytedance.sdk.openadsdk.multipro.fxn.fxn.fxn(rmu.fxn(), "ugen_template", null, "id=?", new String[]{fxnVar.fxn()}, null, null, null));
        boolean z = gffVar.getCount() > 0;
        try {
            gffVar.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", fxnVar.fxn());
            contentValues.put(FileSystemManager.DIGEST_MD5, fxnVar.kg());
            contentValues.put("url", fxnVar.gff());
            contentValues.put("data", fxnVar.rb());
            contentValues.put("rit", fxnVar.bh());
            contentValues.put("update_time", fxnVar.hm());
            if (z) {
                com.bytedance.sdk.openadsdk.multipro.fxn.fxn.fxn(rmu.fxn(), "ugen_template", contentValues, "id=?", new String[]{fxnVar.fxn()});
            } else {
                com.bytedance.sdk.openadsdk.multipro.fxn.fxn.fxn(rmu.fxn(), "ugen_template", contentValues);
            }
            synchronized (this.gff) {
                this.hm.put(fxnVar.fxn(), fxnVar);
            }
        } catch (Throwable unused) {
        }
    }

    List<fxn> kg() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.multipro.aidl.gff gffVar = new com.bytedance.sdk.openadsdk.multipro.aidl.gff(com.bytedance.sdk.openadsdk.multipro.fxn.fxn.fxn(rmu.fxn(), "ugen_template", null, null, null, null, null, null));
        try {
            if (gffVar.moveToFirst()) {
                do {
                    int columnIndex = gffVar.getColumnIndex("id");
                    int columnIndex2 = gffVar.getColumnIndex(FileSystemManager.DIGEST_MD5);
                    int columnIndex3 = gffVar.getColumnIndex("url");
                    int columnIndex4 = gffVar.getColumnIndex("data");
                    int columnIndex5 = gffVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = gffVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? gffVar.getString(columnIndex6) : null;
                        String string2 = gffVar.getString(columnIndex);
                        String string3 = gffVar.getString(columnIndex2);
                        String string4 = gffVar.getString(columnIndex3);
                        fxn fxn2 = new fxn().fxn(string2).kg(string3).gff(string4).hm(gffVar.getString(columnIndex4)).rb(string).fxn(Long.valueOf(gffVar.getLong(columnIndex5)));
                        arrayList.add(fxn2);
                        synchronized (this.gff) {
                            this.hm.put(string2, fxn2);
                        }
                    }
                } while (gffVar.moveToNext());
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                dx.fxn("UGTmplDbHelper", "getUgenTemplate error", th);
                return arrayList;
            } finally {
                gffVar.close();
            }
        }
    }

    Set<fxn> fxn(String str) {
        fxn fxnVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.multipro.aidl.gff gffVar = new com.bytedance.sdk.openadsdk.multipro.aidl.gff(com.bytedance.sdk.openadsdk.multipro.fxn.fxn.fxn(rmu.fxn(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (gffVar.moveToFirst()) {
                do {
                    int columnIndex = gffVar.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = gffVar.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.gff) {
                                fxnVar = this.hm.get(string);
                            }
                            if (fxnVar != null) {
                                hashSet.add(fxnVar);
                            } else {
                                fxn fxnVar2 = new fxn();
                                int columnIndex2 = gffVar.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = gffVar.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        fxnVar2.hm(string2);
                                        fxnVar2.fxn(string);
                                        fxnVar2.rb(str);
                                        int columnIndex3 = gffVar.getColumnIndex(FileSystemManager.DIGEST_MD5);
                                        int columnIndex4 = gffVar.getColumnIndex("url");
                                        int columnIndex5 = gffVar.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            fxnVar2.kg(gffVar.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            fxnVar2.gff(gffVar.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            fxnVar2.fxn(Long.valueOf(gffVar.getLong(columnIndex5)));
                                        }
                                        hashSet.add(fxnVar2);
                                        synchronized (this.gff) {
                                            this.hm.put(string, fxnVar2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (gffVar.moveToNext());
            }
            return hashSet;
        } catch (Throwable th) {
            try {
                dx.fxn("UGTmplDbHelper", "getUgenTemplateFormRit error", th);
                return hashSet;
            } finally {
                gffVar.close();
            }
        }
    }

    void fxn(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                kg(str);
                com.bytedance.sdk.openadsdk.multipro.fxn.fxn.fxn(rmu.fxn(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }

    private void kg(String str) {
        if (!TextUtils.isEmpty(str) && this.hm.size() > 0) {
            synchronized (this.gff) {
                this.hm.remove(str);
            }
        }
    }

    public static String gff() {
        return "CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)";
    }

    public static String hm() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }
}
