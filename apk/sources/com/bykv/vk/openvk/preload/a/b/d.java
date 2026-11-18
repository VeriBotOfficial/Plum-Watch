package com.bykv.vk.openvk.preload.a.b;

/* JADX INFO: compiled from: JavaVersion.java */
/* JADX INFO: loaded from: classes15.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f9131a;

    private static int a(String str) {
        try {
            String[] strArrSplit = str.split("[._]");
            int r0 = Integer.parseInt(strArrSplit[0]);
            return (r0 != 1 || strArrSplit.length <= 1) ? r0 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int r1 = 0; r1 < str.length(); r1++) {
                char cCharAt = str.charAt(r1);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb.append(cCharAt);
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
        int r1 = a(property);
        if (r1 == -1) {
            r1 = b(property);
        }
        if (r1 == -1) {
            r1 = 6;
        }
        f9131a = r1;
    }
}
