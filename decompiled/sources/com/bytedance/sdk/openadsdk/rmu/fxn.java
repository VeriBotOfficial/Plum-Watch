package com.bytedance.sdk.openadsdk.rmu;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.gov.nist.core.Separators;
import android.util.Log;
import com.anythink.core.common.e.a;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public class fxn {
    private static final long bh = System.currentTimeMillis();
    public static final long fxn = com.bytedance.sdk.openadsdk.rmu.hm.fxn.fxn();
    private static Context rb;
    private com.bytedance.sdk.openadsdk.rmu.gff.fxn gff;
    private Boolean hm;
    private kg kg;

    /* renamed from: sg, reason: collision with root package name */
    private int f9567sg = 0;
    private final ArrayList<hm> tw = new ArrayList<>();
    private Runnable jq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.rmu.fxn.2
        @Override // java.lang.Runnable
        public void run() {
            fxn fxnVar = fxn.this;
            fxnVar.hm = Boolean.valueOf(fxnVar.kg.isMonitorOpen());
            if (fxn.this.hm.booleanValue()) {
                fxn fxnVar2 = fxn.this;
                fxnVar2.fxn(fxnVar2.tw);
                fxn.this.tw.clear();
            }
        }
    };
    private Runnable hie = new Runnable() { // from class: com.bytedance.sdk.openadsdk.rmu.fxn.4
        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6 = "extra";
            String str7 = "is_init";
            String str8 = "mediation";
            try {
                SQLiteDatabase kg = com.bytedance.sdk.openadsdk.rmu.fxn.fxn.kg();
                if (kg != null) {
                    String[] strArr = new String[13];
                    try {
                        strArr[0] = "_id";
                        strArr[1] = "sdk_version";
                        strArr[2] = "scene";
                        strArr[3] = "start_count";
                        strArr[4] = "success_count";
                        strArr[5] = a.C0193a.p;
                        strArr[6] = "rit";
                        strArr[7] = "tag";
                        strArr[8] = "label";
                        strArr[9] = "timestamp";
                        strArr[10] = "mediation";
                        strArr[11] = "is_init";
                        strArr[12] = "extra";
                        String[] strArr2 = {String.valueOf(fxn.this.kg.getOnceLogInterval() < 86400000 ? fxn.bh : fxn.fxn)};
                        int max = Math.max(10, fxn.this.kg.getOnceLogCount());
                        if (max > 100) {
                            max = 10;
                        }
                        Cursor query = kg.query("monitor_table", strArr, "timestamp < ?", strArr2, null, null, null, String.valueOf(max));
                        if (query != null) {
                            int i = max;
                            ArrayList arrayList = new ArrayList();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                while (query.moveToNext()) {
                                    ArrayList arrayList3 = arrayList;
                                    com.bytedance.sdk.openadsdk.rmu.kg.fxn fxnVar = new com.bytedance.sdk.openadsdk.rmu.kg.fxn();
                                    if (query.getColumnIndex("_id") >= 0) {
                                        str2 = str6;
                                        str3 = str7;
                                        str4 = str8;
                                        long j = query.getLong(query.getColumnIndex("_id"));
                                        fxnVar.fxn(j);
                                        arrayList2.add(String.valueOf(j));
                                    } else {
                                        str2 = str6;
                                        str3 = str7;
                                        str4 = str8;
                                    }
                                    if (query.getColumnIndex("sdk_version") >= 0) {
                                        fxnVar.fxn(query.getString(query.getColumnIndex("sdk_version")));
                                    }
                                    if (query.getColumnIndex("scene") >= 0) {
                                        fxnVar.kg(query.getString(query.getColumnIndex("scene")));
                                    }
                                    if (query.getColumnIndex("start_count") >= 0) {
                                        fxnVar.fxn(query.getInt(query.getColumnIndex("start_count")));
                                    }
                                    if (query.getColumnIndex("success_count") >= 0) {
                                        fxnVar.kg(query.getInt(query.getColumnIndex("success_count")));
                                    }
                                    if (query.getColumnIndex(a.C0193a.p) >= 0) {
                                        fxnVar.gff(query.getInt(query.getColumnIndex(a.C0193a.p)));
                                    }
                                    if (query.getColumnIndex("rit") >= 0) {
                                        fxnVar.gff(query.getString(query.getColumnIndex("rit")));
                                    }
                                    if (query.getColumnIndex("tag") >= 0) {
                                        fxnVar.hm(query.getString(query.getColumnIndex("tag")));
                                    }
                                    if (query.getColumnIndex("label") >= 0) {
                                        fxnVar.rb(query.getString(query.getColumnIndex("label")));
                                    }
                                    if (query.getColumnIndex("timestamp") >= 0) {
                                        fxnVar.kg(query.getLong(query.getColumnIndex("timestamp")));
                                    }
                                    String str9 = str4;
                                    if (query.getColumnIndex(str9) >= 0) {
                                        fxnVar.bh(query.getString(query.getColumnIndex(str9)));
                                    }
                                    str7 = str3;
                                    if (query.getColumnIndex(str7) >= 0) {
                                        fxnVar.hm(query.getInt(query.getColumnIndex(str7)));
                                    }
                                    String str10 = str2;
                                    if (query.getColumnIndex(str10) >= 0) {
                                        str5 = str9;
                                        fxnVar.sg(query.getString(query.getColumnIndex(str10)));
                                    } else {
                                        str5 = str9;
                                    }
                                    arrayList3.add(fxnVar);
                                    arrayList = arrayList3;
                                    str6 = str10;
                                    str8 = str5;
                                }
                                ArrayList arrayList4 = arrayList;
                                query.close();
                                str = "BusMonitorCenter";
                                try {
                                    Log.i(str, "exec upload ...");
                                    if (arrayList4.isEmpty()) {
                                        return;
                                    }
                                    try {
                                        fxn.this.kg.onMonitorUpload(arrayList4);
                                        SQLiteDatabase fxn2 = com.bytedance.sdk.openadsdk.rmu.fxn.fxn.fxn();
                                        if (fxn2 != null && fxn2.isOpen()) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("_id IN (");
                                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                                sb.append(Separators.QUESTION);
                                                if (i2 < arrayList2.size() - 1) {
                                                    sb.append(",");
                                                }
                                            }
                                            sb.append(Separators.RPAREN);
                                            fxn2.delete("monitor_table", sb.toString(), (String[]) arrayList2.toArray(new String[0]));
                                            if (fxn.this.gff != null) {
                                                fxn.this.gff.fxn(fxn.bh);
                                            }
                                        }
                                        if (arrayList4.size() < i || fxn.this.f9567sg > 1000) {
                                            return;
                                        }
                                        fxn.this.fxn(false);
                                    } catch (Throwable th) {
                                        th = th;
                                        Log.e(str, th.getMessage());
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                str = "BusMonitorCenter";
                                Log.e(str, th.getMessage());
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                str = "BusMonitorCenter";
            }
        }
    };

    static /* synthetic */ int hm(fxn fxnVar) {
        int i = fxnVar.f9567sg;
        fxnVar.f9567sg = i + 1;
        return i;
    }

    private fxn(kg kgVar) {
        try {
            this.kg = new BusMonitorDependWrapper(kgVar);
            this.gff = new com.bytedance.sdk.openadsdk.rmu.gff.fxn(kgVar.getContext());
            rb = kgVar.getContext();
        } catch (Throwable th) {
            Log.e("BusMonitorCenter", th.getMessage());
        }
    }

    public static fxn fxn(kg kgVar) {
        return new fxn(kgVar);
    }

    public static Context fxn() {
        Context context = rb;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void fxn(final hm hmVar) {
        if (hmVar == null || !gff()) {
            return;
        }
        this.kg.getHandler().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.rmu.fxn.1
            @Override // java.lang.Runnable
            public void run() {
                fxn fxnVar = fxn.this;
                fxnVar.hm = Boolean.valueOf(fxnVar.kg.isMonitorOpen());
                if (fxn.this.hm.booleanValue()) {
                    fxn.this.tw.add(hmVar);
                    if (fxn.this.tw.size() >= 10) {
                        fxn fxnVar2 = fxn.this;
                        fxnVar2.fxn(fxnVar2.tw);
                        fxn.this.tw.clear();
                    }
                }
            }
        });
        this.kg.getHandler().removeCallbacks(this.jq);
        this.kg.getHandler().postDelayed(this.jq, 5000L);
    }

    private boolean gff() {
        if (this.hm == null) {
            kg kgVar = this.kg;
            return (kgVar == null || kgVar.getContext() == null || this.kg.getHandler() == null) ? false : true;
        }
        kg kgVar2 = this.kg;
        return (kgVar2 == null || kgVar2.getContext() == null || !this.kg.isMonitorOpen() || this.kg.getHandler() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0214 A[Catch: all -> 0x0218, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0218, blocks: (B:46:0x0214, B:6:0x0236), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0236 A[Catch: all -> 0x0218, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0218, blocks: (B:46:0x0214, B:6:0x0236), top: B:2:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fxn(java.util.List<com.bytedance.sdk.openadsdk.rmu.hm> r28) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.rmu.fxn.fxn(java.util.List):void");
    }

    public void fxn(final boolean z) {
        kg kgVar = this.kg;
        if (kgVar == null || kgVar.getHandler() == null || this.kg.getContext() == null || this.gff == null || !this.kg.isMonitorOpen()) {
            return;
        }
        this.kg.getHandler().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.rmu.fxn.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    fxn.hm(fxn.this);
                    if (z) {
                        long fxn2 = fxn.this.gff.fxn();
                        if (fxn2 == 0) {
                            fxn.this.gff.fxn(System.currentTimeMillis());
                            return;
                        } else if (com.bytedance.sdk.openadsdk.rmu.hm.fxn.fxn(fxn2) && System.currentTimeMillis() - fxn2 < fxn.this.kg.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    if (fxn.this.kg.getHandler() != null) {
                        fxn.this.kg.getHandler().post(fxn.this.hie);
                    }
                } catch (Throwable th) {
                    Log.e("BusMonitorCenter", th.getMessage());
                }
            }
        }, Math.max(this.kg.getOnceLogInterval(), 10000));
    }
}
