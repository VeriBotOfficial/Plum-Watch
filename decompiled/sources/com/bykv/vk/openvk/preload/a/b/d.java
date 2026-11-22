package com.bykv.vk.openvk.preload.a.b;

/* compiled from: JavaVersion.java */
/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f9131a;

    private static int a(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int a() {
        return f9131a;
    }

    public static boolean b() {
        return f9131a >= 9;
    }

    static {
        String property = System.getProperty("java.version");
        int a2 = a(property);
        if (a2 == -1) {
            a2 = b(property);
        }
        if (a2 == -1) {
            a2 = 6;
        }
        f9131a = a2;
    }
}
