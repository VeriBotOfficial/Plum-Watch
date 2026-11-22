package com.anythink.basead.exoplayer;

import java.util.HashSet;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2701a = "ExoPlayer";
    public static final String b = "2.8.4";
    public static final String c = "ExoPlayerLib/2.8.4";
    public static final int d = 2008004;
    public static final boolean e = true;
    public static final boolean f = true;
    private static final HashSet<String> g = new HashSet<>();
    private static String h = "goog.exo.core";

    private l() {
    }

    public static synchronized String a() {
        String str;
        synchronized (l.class) {
            str = h;
        }
        return str;
    }

    private static synchronized void a(String str) {
        synchronized (l.class) {
            if (g.add(str)) {
                h += ", " + str;
            }
        }
    }
}
