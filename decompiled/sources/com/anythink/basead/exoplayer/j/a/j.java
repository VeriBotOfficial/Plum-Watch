package com.anythink.basead.exoplayer.j.a;

import android.net.Uri;

/* loaded from: classes11.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2630a = "exo_";
    private static final String b = "exo_redir";
    private static final String c = "exo_len";

    public static long a(i iVar) {
        return iVar.a("exo_len");
    }

    public static void a(k kVar, long j) {
        kVar.a("exo_len", j);
    }

    private static void a(k kVar) {
        kVar.a("exo_len");
    }

    private static Uri b(i iVar) {
        String a2 = iVar.a("exo_redir", (String) null);
        if (a2 == null) {
            return null;
        }
        return Uri.parse(a2);
    }

    public static void a(k kVar, Uri uri) {
        kVar.a("exo_redir", uri.toString());
    }

    private static void b(k kVar) {
        kVar.a("exo_redir");
    }

    private j() {
    }
}
