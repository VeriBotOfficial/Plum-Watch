package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sb2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16850a;

    public static final class a {
        @JvmStatic
        public static sb2 b(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new sb2(1, description);
        }

        @JvmStatic
        public static sb2 a(String str) {
            if (str == null) {
                str = "Ad request failed with network error";
            }
            return new sb2(2, str);
        }

        @JvmStatic
        public static sb2 b() {
            Intrinsics.checkNotNullParameter("Server temporarily unavailable. Please, try again later.", "message");
            return new sb2(4, "Server temporarily unavailable. Please, try again later.");
        }

        @JvmStatic
        public static sb2 a(g50 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            String message = error.getMessage();
            if (message == null) {
                message = "Ad request completed successfully, but there are no ads available.";
            }
            return new sb2(3, message);
        }

        @JvmStatic
        public static sb2 a() {
            return new sb2(1, "Internal error. Failed to parse response");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sb2(int i, String errorDescription) {
        this(errorDescription);
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
    }

    public final String a() {
        return this.f16850a;
    }

    private sb2(String str) {
        this.f16850a = str;
    }
}
