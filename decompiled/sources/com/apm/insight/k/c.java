package com.apm.insight.k;

import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CrashUploadHandler.java */
/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f6051a = new ConcurrentLinkedQueue<>();

    static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f6051a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f6051a.isEmpty()) {
            f6051a.poll();
        }
        f6051a = null;
    }

    /* compiled from: CrashUploadHandler.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f6053a;
        private JSONObject b;
        private CrashType c;

        a(JSONObject jSONObject, CrashType crashType) {
            this.c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f6053a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f6053a = jSONObject;
            }
            this.b = jSONObject.optJSONObject("header");
        }

        public final String a() {
            return this.f6053a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f6053a.optInt("app_start_time", -1);
        }

        public final String c() {
            int i = AnonymousClass1.f6052a[this.c.ordinal()];
            if (i == 1) {
                return this.f6053a.optString("data", null);
            }
            if (i == 2) {
                return this.f6053a.optString("stack", null);
            }
            if (i != 3) {
                return null;
            }
            return this.f6053a.optString("data", null);
        }
    }

    /* compiled from: CrashUploadHandler.java */
    /* renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6052a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f6052a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6052a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6052a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
