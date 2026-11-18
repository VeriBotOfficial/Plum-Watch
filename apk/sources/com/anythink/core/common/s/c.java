package com.anythink.core.common.s;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.u;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4335a;
    private final String b;
    private final int c;
    private final int d;

    /* synthetic */ c(Context context, String str, int r3, int r4, byte b) {
        this(context, str, r3, r4);
    }

    private c(Context context, String str, int r3, int r4) {
        this.f4335a = context;
        this.b = str;
        this.c = r3;
        this.d = r4;
    }

    public final Context a() {
        return this.f4335a;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f4336a;
        private String b;
        private int c;
        private int d;

        public final a a(Context context) {
            this.f4336a = context;
            return this;
        }

        public final a a(String str) {
            this.b = str;
            return this;
        }

        public final a a(int r1) {
            this.c = r1;
            return this;
        }

        public final a b(int r1) {
            this.d = r1;
            return this;
        }

        private void b() {
            if (TextUtils.isEmpty(this.b) || !this.b.equalsIgnoreCase(u.b.f)) {
                return;
            }
            this.c = 0;
        }

        public final c a() {
            if (!TextUtils.isEmpty(this.b) && this.b.equalsIgnoreCase(u.b.f)) {
                this.c = 0;
            }
            return new c(this.f4336a, this.b, this.c, this.d, (byte) 0);
        }
    }
}
