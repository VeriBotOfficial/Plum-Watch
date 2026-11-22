package com.bytedance.sdk.component.adexpress.fxn.kg;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.phancy.mini.api.file.FileSystemManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public class bh {
    public static int fxn = 20;
    private static volatile bh kg;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.fxn.gff.gff> rb;
    private final Object hm = new Object();
    private AtomicBoolean bh = new AtomicBoolean(false);

    /* renamed from: sg, reason: collision with root package name */
    private LruCache<String, com.bytedance.sdk.component.adexpress.fxn.gff.kg> f9340sg = new LruCache<String, com.bytedance.sdk.component.adexpress.fxn.gff.kg>(fxn) { // from class: com.bytedance.sdk.component.adexpress.fxn.kg.bh.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.fxn.gff.kg kgVar) {
            return 1;
        }
    };
    private Set<String> gff = Collections.synchronizedSet(new HashSet());

    public static void fxn(int i) {
        fxn = i;
    }

    public static bh fxn() {
        if (kg == null) {
            synchronized (bh.class) {
                if (kg == null) {
                    kg = new bh();
                }
            }
        }
        return kg;
    }

    private bh() {
    }

    com.bytedance.sdk.component.adexpress.fxn.gff.kg fxn(String str) {
        com.bytedance.sdk.component.adexpress.fxn.gff.kg kgVar;
        com.bytedance.sdk.component.adexpress.fxn.gff.kg fxn2;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().kg() == null) {
            return null;
        }
        synchronized (this.hm) {
            kgVar = this.f9340sg.get(String.valueOf(str));
        }
        if (kgVar != null) {
            return kgVar;
        }
        Cursor fxn3 = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().kg().fxn("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (fxn3 != null) {
            try {
                if (fxn3.moveToFirst()) {
                    do {
                        String string = fxn3.getString(fxn3.getColumnIndex("rit"));
                        String string2 = fxn3.getString(fxn3.getColumnIndex("id"));
                        String string3 = fxn3.getString(fxn3.getColumnIndex(FileSystemManager.DIGEST_MD5));
                        String string4 = fxn3.getString(fxn3.getColumnIndex("url"));
                        String string5 = fxn3.getString(fxn3.getColumnIndex("data"));
                        fxn2 = new com.bytedance.sdk.component.adexpress.fxn.gff.kg().fxn(string).kg(string2).gff(string3).hm(string4).rb(string5).bh(fxn3.getString(fxn3.getColumnIndex("version"))).fxn(Long.valueOf(fxn3.getLong(fxn3.getColumnIndex("update_time"))));
                        synchronized (this.hm) {
                            this.f9340sg.put(string2, fxn2);
                        }
                        this.gff.add(string2);
                    } while (fxn3.moveToNext());
                    fxn3.close();
                    return fxn2;
                }
            } catch (Throwable unused) {
            }
            fxn3.close();
        }
        return null;
    }

    Set<String> kg(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().kg() != null) {
            HashSet hashSet = new HashSet();
            Cursor fxn2 = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().kg().fxn("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            try {
                if (fxn2 != null) {
                    try {
                        if (fxn2.moveToFirst()) {
                            do {
                                hashSet.add(fxn2.getString(fxn2.getColumnIndex("id")));
                            } while (fxn2.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e) {
                        Log.e("TmplDbHelper", "", e);
                    }
                }
            } finally {
                fxn2.close();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    List<com.bytedance.sdk.component.adexpress.fxn.gff.kg> kg() {
        if (com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().kg() == null) {
            return null;
        }
        boolean z = this.bh.get();
        this.bh.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor fxn2 = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().kg().fxn("template_diff_new", null, null, null, null, null, null);
        if (fxn2 != null) {
            while (fxn2.moveToNext()) {
                try {
                    String string = fxn2.getString(fxn2.getColumnIndex("rit"));
                    String string2 = fxn2.getString(fxn2.getColumnIndex("id"));
                    String string3 = fxn2.getString(fxn2.getColumnIndex(FileSystemManager.DIGEST_MD5));
                    String string4 = fxn2.getString(fxn2.getColumnIndex("url"));
                    String string5 = fxn2.getString(fxn2.getColumnIndex("data"));
                    String string6 = fxn2.getString(fxn2.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.fxn.gff.kg().fxn(string).kg(string2).gff(string3).hm(string4).rb(string5).bh(string6).fxn(Long.valueOf(fxn2.getLong(fxn2.getColumnIndex("update_time")))));
                    synchronized (this.hm) {
                        this.f9340sg.put(string2, arrayList.get(arrayList.size() - 1));
                    }
                    this.gff.add(string2);
                    if (!z && com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().bh() != null) {
                        if (this.rb == null) {
                            this.rb = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.rb.contains(string2)) {
                            this.rb.put(string2, new com.bytedance.sdk.component.adexpress.fxn.gff.gff(string, string2, string3));
                        }
                    }
                } catch (Throwable unused) {
                    if (fxn2 != null) {
                        fxn2.close();
                    }
                }
            }
            if (fxn2 != null) {
                fxn2.close();
                return arrayList;
            }
        }
        return arrayList;
    }

    void fxn(com.bytedance.sdk.component.adexpress.fxn.gff.kg kgVar, boolean z) {
        if (kgVar == null || com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().kg() == null || TextUtils.isEmpty(kgVar.kg())) {
            return;
        }
        Cursor fxn2 = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().kg().fxn("template_diff_new", null, "id=?", new String[]{kgVar.kg()}, null, null, null);
        boolean z2 = fxn2 != null && fxn2.getCount() > 0;
        if (fxn2 != null) {
            try {
                r3 = fxn2.moveToFirst() ? fxn2.getString(fxn2.getColumnIndex("rit")) : null;
                fxn2.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", kgVar.fxn());
        contentValues.put("id", kgVar.kg());
        contentValues.put(FileSystemManager.DIGEST_MD5, kgVar.gff());
        contentValues.put("url", kgVar.hm());
        contentValues.put("data", kgVar.rb());
        contentValues.put("version", kgVar.bh());
        contentValues.put("update_time", kgVar.sg());
        if (z2) {
            com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().kg().fxn("template_diff_new", contentValues, "id=?", new String[]{kgVar.kg()});
        } else {
            com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().kg().fxn("template_diff_new", contentValues);
        }
        synchronized (this.hm) {
            this.f9340sg.put(kgVar.kg(), kgVar);
        }
        this.gff.add(kgVar.kg());
        if (z) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().bh() == null) {
                return;
            }
            if (this.rb == null) {
                this.rb = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.fxn.gff.gff gffVar = new com.bytedance.sdk.component.adexpress.fxn.gff.gff(kgVar.fxn(), kgVar.kg(), kgVar.gff());
            this.rb.put(kgVar.kg(), gffVar);
            if (r3 != null) {
                com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().bh();
                gffVar.kg();
            }
            com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().bh();
            kgVar.fxn();
        } catch (Throwable unused2) {
        }
    }

    void fxn(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().kg() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                hm(strArr[i]);
                com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().kg().fxn("template_diff_new", "id=?", new String[]{strArr[i]});
                gff(strArr[i]);
            }
        }
    }

    void gff(String str) {
        com.bytedance.sdk.component.adexpress.fxn.gff.gff gffVar;
        try {
            if (this.rb != null && !this.rb.isEmpty() && (gffVar = this.rb.get(str)) != null) {
                if (!TextUtils.isEmpty(gffVar.fxn()) && com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().bh() != null) {
                    com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().bh();
                }
                this.rb.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    private void hm(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.fxn.gff.kg> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.f9340sg) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.hm) {
            this.f9340sg.remove(str);
        }
    }

    public static String gff() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }
}
