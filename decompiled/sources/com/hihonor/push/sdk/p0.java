package com.hihonor.push.sdk;

import android.content.Intent;
import java.util.concurrent.Callable;

/* loaded from: classes11.dex */
public class p0 implements Callable<HonorPushDataMsg> {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f10151a;

    public p0(Intent intent) {
        this.f10151a = intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hihonor.push.sdk.HonorPushDataMsg call() {
        /*
            r10 = this;
            java.lang.String r0 = "PassByMsgIntentParser"
            android.content.Intent r1 = r10.f10151a
            r2 = 0
            if (r1 == 0) goto La1
            r3 = 0
            java.lang.String r5 = "msg_id"
            long r3 = r1.getLongExtra(r5, r3)     // Catch: java.lang.Exception -> L10
            goto L16
        L10:
            r1 = move-exception
            java.lang.String r5 = "parserMsgId"
            com.hihonor.push.sdk.j.a(r0, r5, r1)
        L16:
            android.content.Intent r1 = r10.f10151a
            java.lang.String r5 = "msg_content"
            byte[] r0 = r1.getByteArrayExtra(r5)     // Catch: java.lang.Exception -> L1f
            goto L26
        L1f:
            r1 = move-exception
            java.lang.String r5 = "parseMsgContent"
            com.hihonor.push.sdk.j.a(r0, r5, r1)
            r0 = r2
        L26:
            java.lang.String r1 = "DeflateUtil"
            if (r0 == 0) goto L7d
            int r5 = r0.length
            if (r5 != 0) goto L2e
            goto L7d
        L2e:
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r0)
            java.util.zip.InflaterInputStream r0 = new java.util.zip.InflaterInputStream
            java.util.zip.Inflater r6 = new java.util.zip.Inflater
            r6.<init>()
            r0.<init>(r5, r6)
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            r7 = 256(0x100, float:3.59E-43)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
        L46:
            int r8 = r0.read(r7)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            if (r8 <= 0) goto L51
            r9 = 0
            r6.write(r7, r9, r8)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            goto L46
        L51:
            java.lang.String r7 = "UTF-8"
            java.lang.String r1 = r6.toString(r7)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            com.hihonor.push.sdk.f.a(r5)
            com.hihonor.push.sdk.f.a(r0)
            com.hihonor.push.sdk.f.a(r6)
            goto L83
        L61:
            r1 = move-exception
            goto L73
        L63:
            r7 = move-exception
            java.lang.String r8 = "unZipString"
            com.hihonor.push.sdk.j.a(r1, r8, r7)     // Catch: java.lang.Throwable -> L61
            com.hihonor.push.sdk.f.a(r5)
            com.hihonor.push.sdk.f.a(r0)
            com.hihonor.push.sdk.f.a(r6)
            goto L82
        L73:
            com.hihonor.push.sdk.f.a(r5)
            com.hihonor.push.sdk.f.a(r0)
            com.hihonor.push.sdk.f.a(r6)
            throw r1
        L7d:
            java.lang.String r0 = "un zip data is empty"
            android.util.Log.w(r1, r0)
        L82:
            r1 = r2
        L83:
            if (r1 == 0) goto La1
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.lang.String r1 = "data"
            java.lang.String r0 = r0.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto La1
            com.hihonor.push.sdk.HonorPushDataMsg r2 = new com.hihonor.push.sdk.HonorPushDataMsg
            r2.<init>()
            r2.setMsgId(r3)
            r2.setData(r0)
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hihonor.push.sdk.p0.call():java.lang.Object");
    }
}
