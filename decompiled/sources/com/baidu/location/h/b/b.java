package com.baidu.location.h.b;

import com.baidu.location.h.b.a;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static int f7708a = -1;
    private static int b = -1;
    private static int c = -1;
    private static int d = -1;
    private static int e = -1;
    private static int f = -1;

    /* renamed from: com.baidu.location.h.b.b$1, reason: invalid class name */
    class AnonymousClass1 {
    }

    /* renamed from: com.baidu.location.h.b.b$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7709a;

        static {
            int[] iArr = new int[EnumC0353b.values().length];
            f7709a = iArr;
            try {
                iArr[EnumC0353b.SUBWAY_STATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7709a[EnumC0353b.TRAFFIC_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7709a[EnumC0353b.VDR_INDOOR_SPEED_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7709a[EnumC0353b.INDOOR_POI_DATA_STATUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7709a[EnumC0353b.OUTDOOR_POI_DATA_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7709a[EnumC0353b.GPS_CHECKER_STATUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f7710a = new b(null);
    }

    /* renamed from: com.baidu.location.h.b.b$b, reason: collision with other inner class name */
    public enum EnumC0353b {
        SUBWAY_STATIC,
        TRAFFIC_STATUS,
        VDR_INDOOR_SPEED_STATUS,
        INDOOR_POI_DATA_STATUS,
        OUTDOOR_POI_DATA_STATUS,
        GPS_CHECKER_STATUS
    }

    private b() {
    }

    /* synthetic */ b(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static b a() {
        return a.f7710a;
    }

    public String a(EnumC0353b enumC0353b) {
        switch (AnonymousClass2.f7709a[enumC0353b.ordinal()]) {
            case 1:
                if (f7708a == 0) {
                    return a.e.b;
                }
                return null;
            case 2:
                if (b == 0) {
                    return a.f.b;
                }
                return null;
            case 3:
                if (c == 0) {
                    return a.c.b;
                }
                return null;
            case 4:
                if (d == 0) {
                    return a.b.f7703a;
                }
                return null;
            case 5:
                if (e == 0) {
                    return a.d.f7705a;
                }
                return null;
            case 6:
                if (f == 0) {
                    return a.C0352a.f7702a;
                }
                return null;
            default:
                return null;
        }
    }
}
