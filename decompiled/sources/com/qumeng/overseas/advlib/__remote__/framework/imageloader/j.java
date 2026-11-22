package com.qumeng.overseas.advlib.__remote__.framework.imageloader;

/* loaded from: classes17.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12956a = "https://cdn.adseye.com/nsdk/res/imgstatic/";
    public static final String b = "https://image-cdn.adseye.com/direct_client/";
    public static final String c = "SAVE_IMG_FAIL";
    public static final String d = "SAVE_IMG_SUCCESS";
    public static final String e = "cpc";
    private static final String f = "ImageLoader";
    private static h g;

    public static h a() {
        if (g == null) {
            g = m.c();
        }
        return g;
    }

    public static void a(h hVar) {
        g = hVar;
    }

    public static h a(String str) {
        if (str.hashCode() == -657277650) {
            str.equals("ImageLoader");
        }
        return m.c();
    }
}
