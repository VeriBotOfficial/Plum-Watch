package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.text.TextUtils;
import com.anythink.expressad.foundation.d.t;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.y0;
import com.tencent.connect.share.QzonePublish;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.net.URLEncoder;

/* compiled from: VideoReportDataDao.java */
/* loaded from: classes17.dex */
public class n extends a<com.mbridge.msdk.foundation.entity.m> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11523a = "com.mbridge.msdk.foundation.db.n";
    private static n b;

    private n(f fVar) {
        super(fVar);
    }

    public static n a(f fVar) {
        if (b == null) {
            synchronized (n.class) {
                if (b == null) {
                    b = new n(fVar);
                }
            }
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r1 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        if (r1 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int a() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "select count(*) from reward_report"
            android.database.sqlite.SQLiteDatabase r3 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            android.database.Cursor r1 = r3.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            if (r1 == 0) goto L19
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            if (r2 == 0) goto L19
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
        L19:
            if (r1 == 0) goto L27
            goto L24
        L1c:
            r0 = move-exception
            goto L29
        L1e:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L27
        L24:
            r1.close()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L2f
        L27:
            monitor-exit(r4)
            return r0
        L29:
            if (r1 == 0) goto L2e
            r1.close()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L2f
        L2e:
            throw r0     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.n.a():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0337, code lost:
    
        if (r10 != null) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0341 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.List<com.mbridge.msdk.foundation.entity.m> a(java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.n.a(java.lang.String):java.util.List");
    }

    public synchronized long a(com.mbridge.msdk.foundation.entity.m mVar) {
        if (mVar != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("key", mVar.n());
                contentValues.put("networkType", Integer.valueOf(mVar.q()));
                contentValues.put("network_str", mVar.r());
                contentValues.put("isCompleteView", Integer.valueOf(mVar.m()));
                contentValues.put("watchedMillis", Integer.valueOf(mVar.F()));
                contentValues.put(HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH, Integer.valueOf(mVar.C()));
                if (!TextUtils.isEmpty(mVar.s())) {
                    contentValues.put("offerUrl", mVar.s());
                }
                if (!TextUtils.isEmpty(mVar.t())) {
                    contentValues.put("reason", URLEncoder.encode(mVar.t(), "utf-8"));
                }
                contentValues.put("result", Integer.valueOf(mVar.x()));
                contentValues.put("duration", mVar.g());
                contentValues.put(QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE, Long.valueOf(mVar.D()));
                contentValues.put("type", mVar.h());
                String i = mVar.i();
                if (!TextUtils.isEmpty(i)) {
                    contentValues.put("endcard_url", i);
                }
                String E = mVar.E();
                if (!TextUtils.isEmpty(E)) {
                    contentValues.put("video_url", E);
                }
                String u = mVar.u();
                if (!TextUtils.isEmpty(u)) {
                    contentValues.put("rid", u);
                }
                String v = mVar.v();
                if (!TextUtils.isEmpty(v)) {
                    contentValues.put("rid_n", v);
                }
                String z = mVar.z();
                if (!TextUtils.isEmpty(z)) {
                    contentValues.put("template_url", z);
                }
                String l = mVar.l();
                if (!TextUtils.isEmpty(l)) {
                    contentValues.put("image_url", l);
                }
                String a2 = mVar.a();
                if (!TextUtils.isEmpty(a2)) {
                    contentValues.put("ad_type", URLEncoder.encode(a2, "utf-8"));
                }
                contentValues.put("unitId", mVar.B());
                contentValues.put("campaignId", mVar.d());
                if (t.j.equals(mVar.n())) {
                    String b2 = o.b(mVar);
                    if (y0.b(b2)) {
                        contentValues.put("h5_click_data", b2);
                    }
                }
                String w = mVar.w();
                if (!TextUtils.isEmpty(w)) {
                    contentValues.put("resource_type", URLEncoder.encode(w, "utf-8"));
                }
                String f = mVar.f();
                if (!TextUtils.isEmpty(f)) {
                    contentValues.put("device_id", URLEncoder.encode(f, "utf-8"));
                }
                String e = mVar.e();
                if (!TextUtils.isEmpty(e)) {
                    contentValues.put(t.aD, URLEncoder.encode(e, "utf-8"));
                }
                contentValues.put("adspace_t", Integer.valueOf(mVar.b()));
                return getWritableDatabase().insert("reward_report", null, contentValues);
            } catch (Exception e2) {
                o0.b(f11523a, e2.getMessage());
            }
        }
        return -1L;
    }
}
