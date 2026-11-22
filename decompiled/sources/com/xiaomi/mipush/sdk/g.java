package com.xiaomi.mipush.sdk;

import com.xiaomi.push.gl;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<d, a> f14390a = new HashMap<>();

    static {
        a(d.ASSEMBLE_PUSH_HUAWEI, new a("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        a(d.ASSEMBLE_PUSH_FCM, new a("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        a(d.ASSEMBLE_PUSH_COS, new a("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        a(d.ASSEMBLE_PUSH_FTOS, new a("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    private static void a(d dVar, a aVar) {
        if (aVar != null) {
            f14390a.put(dVar, aVar);
        }
    }

    public static a a(d dVar) {
        return f14390a.get(dVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static gl m11835a(d dVar) {
        return gl.AggregatePushSwitch;
    }

    /* renamed from: com.xiaomi.mipush.sdk.g$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14391a;

        static {
            int[] iArr = new int[d.values().length];
            f14391a = iArr;
            try {
                iArr[d.ASSEMBLE_PUSH_HUAWEI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14391a[d.ASSEMBLE_PUSH_FCM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14391a[d.ASSEMBLE_PUSH_COS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14391a[d.ASSEMBLE_PUSH_FTOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static v m11834a(d dVar) {
        int i = AnonymousClass1.f14391a[dVar.ordinal()];
        if (i == 1) {
            return v.UPLOAD_HUAWEI_TOKEN;
        }
        if (i == 2) {
            return v.UPLOAD_FCM_TOKEN;
        }
        if (i == 3) {
            return v.UPLOAD_COS_TOKEN;
        }
        if (i != 4) {
            return null;
        }
        return v.UPLOAD_FTOS_TOKEN;
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f14392a;
        public String b;

        public a(String str, String str2) {
            this.f14392a = str;
            this.b = str2;
        }
    }
}
