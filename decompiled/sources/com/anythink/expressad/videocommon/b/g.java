package com.anythink.expressad.videocommon.b;

import android.webkit.URLUtil;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.videocommon.b.h;
import com.anythink.expressad.videocommon.b.i;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5517a = "<anythinkloadend></anythinkloadend>";
    private static final String b = "DownLoadUtils";
    private static final int c = 20000;
    private static final int d = 30000;

    public static void a(final String str, final String str2, final i.c cVar) {
        try {
            if (!y.a(str) && URLUtil.isNetworkUrl(str)) {
                h.a.f5520a.a(new com.anythink.expressad.foundation.g.h.a() { // from class: com.anythink.expressad.videocommon.b.g.1
                    @Override // com.anythink.expressad.foundation.g.h.a
                    public final void b() {
                    }

                    @Override // com.anythink.expressad.foundation.g.h.a
                    public final void c() {
                    }

                    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5 A[Catch: all -> 0x00bf, TryCatch #9 {all -> 0x00bf, blocks: (B:25:0x0091, B:27:0x00a5, B:30:0x00ad, B:32:0x00b1), top: B:24:0x0091 }] */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad A[Catch: all -> 0x00bf, TryCatch #9 {all -> 0x00bf, blocks: (B:25:0x0091, B:27:0x00a5, B:30:0x00ad, B:32:0x00b1), top: B:24:0x0091 }] */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x007c A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {all -> 0x0080, blocks: (B:20:0x005f, B:22:0x0064, B:54:0x007c, B:56:0x0084), top: B:3:0x0002 }] */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x0084 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:20:0x005f, B:22:0x0064, B:54:0x007c, B:56:0x0084), top: B:3:0x0002 }] */
                    @Override // com.anythink.expressad.foundation.g.h.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void a() {
                        /*
                            Method dump skipped, instructions count: 238
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.b.g.AnonymousClass1.a():void");
                    }
                });
                return;
            }
            cVar.a("url is error");
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f4564a) {
                th.printStackTrace();
            }
        }
    }
}
