package com.anythink.expressad.reward.a;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class e implements com.anythink.expressad.g.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5059a = "RewardUnitCacheManager";
    private ConcurrentHashMap<String, com.anythink.expressad.videocommon.e.d> b;

    /* synthetic */ e(byte b) {
        this();
    }

    private e() {
        this.b = new ConcurrentHashMap<>();
    }

    public static e a() {
        return a.f5060a;
    }

    public final void a(String str, String str2, com.anythink.expressad.videocommon.e.d dVar) {
        try {
            String str3 = str + "_" + str2;
            if (dVar != null && this.b.containsKey(str3)) {
                this.b.remove(str3);
            }
            this.b.put(str3, dVar);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public final com.anythink.expressad.videocommon.e.d a(String str, String str2) {
        try {
            try {
                return this.b.remove(str + "_" + str2);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final e f5060a = new e(0);

        private a() {
        }
    }
}
