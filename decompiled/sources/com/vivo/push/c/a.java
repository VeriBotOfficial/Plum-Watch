package com.vivo.push.c;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.t;
import java.util.HashMap;

/* compiled from: CoreConfigManager.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f14064a;
    private HashMap<String, String> b = new HashMap<>();

    public a(Context context) {
        this.f14064a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5 A[Catch: Exception -> 0x00c1, TRY_LEAVE, TryCatch #6 {Exception -> 0x00c1, blocks: (B:79:0x00bd, B:70:0x00c5), top: B:78:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int g() {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.c.a.g():int");
    }

    public final int a() {
        int b = b(1);
        t.d("CoreConfigManager", "isSupportNewControlStrategies : ".concat(String.valueOf(b)));
        return b;
    }

    public final int b() {
        int b = b(4);
        t.d("CoreConfigManager", "isSupportSyncProfileInfo : ".concat(String.valueOf(b)));
        return b;
    }

    public final boolean c() {
        int b = b(8);
        t.d("CoreConfigManager", "isSupportdeleteRegid : ".concat(String.valueOf(b)));
        return b == 0;
    }

    public final boolean d() {
        int b = b(16);
        t.d("CoreConfigManager", "isSupportQueryCurrentAppState : ".concat(String.valueOf(b)));
        return b == 0;
    }

    public final boolean e() {
        int b = b(32);
        t.d("CoreConfigManager", "isSupportCreateNotifyChannel : ".concat(String.valueOf(b)));
        return b == 0;
    }

    public final boolean f() {
        int b = b(128);
        t.d("CoreConfigManager", "isSupportAliasSubscribeCheck : ".concat(String.valueOf(b)));
        return b == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r10 != 4096) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r10) {
        /*
            r9 = this;
            int r0 = r9.b(r10)
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 2048(0x800, float:2.87E-42)
            r2 = 1024(0x400, float:1.435E-42)
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = 512(0x200, float:7.17E-43)
            r5 = 256(0x100, float:3.59E-43)
            r6 = 0
            if (r10 == r5) goto L1d
            if (r10 == r4) goto L1d
            if (r10 == r3) goto L1d
            if (r10 == r2) goto L1d
            if (r10 != r0) goto L5b
        L1d:
            android.content.Context r7 = r9.f14064a
            java.lang.String r7 = com.vivo.push.util.aa.a(r7)
            java.lang.String r8 = "com.vivo.pushservice"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L5b
            android.content.Context r7 = r9.f14064a
            long r7 = com.vivo.push.util.ah.a(r7)
            if (r10 == r5) goto L54
            if (r10 == r4) goto L4c
            if (r10 == r2) goto L44
            if (r10 == r0) goto L3c
            if (r10 == r3) goto L4c
            goto L5b
        L3c:
            r2 = 4400(0x1130, double:2.174E-320)
            int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r10 < 0) goto L43
            return r1
        L43:
            return r6
        L44:
            r2 = 4200(0x1068, double:2.075E-320)
            int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r10 < 0) goto L4b
            return r1
        L4b:
            return r6
        L4c:
            r2 = 4100(0x1004, double:2.0257E-320)
            int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r10 < 0) goto L53
            return r1
        L53:
            return r6
        L54:
            r2 = 3700(0xe74, double:1.828E-320)
            int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r10 < 0) goto L5b
            return r1
        L5b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.c.a.a(int):boolean");
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00b2: MOVE (r3 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:61:0x00b1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7 A[Catch: Exception -> 0x0092, TRY_ENTER, TryCatch #5 {Exception -> 0x0092, blocks: (B:28:0x008e, B:30:0x0097, B:38:0x00a7, B:40:0x00ac), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac A[Catch: Exception -> 0x0092, TRY_LEAVE, TryCatch #5 {Exception -> 0x0092, blocks: (B:28:0x008e, B:30:0x0097, B:38:0x00a7, B:40:0x00ac), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.c.a.a(android.content.Context, java.lang.String):java.lang.String");
    }

    private int b(int i) {
        int g = g();
        if (g != 0) {
            return g;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap == null || hashMap.size() == 0) {
            return 8006;
        }
        String str = this.b.get("pushSupport");
        if (TextUtils.isEmpty(str)) {
            return 2;
        }
        try {
            return (i & Integer.parseInt(str)) > 0 ? 0 : 1;
        } catch (Exception unused) {
            return 8007;
        }
    }
}
