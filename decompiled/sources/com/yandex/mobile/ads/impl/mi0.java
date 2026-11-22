package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mi0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16245a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f16246a;

        public final a a(String str) {
            return this;
        }

        public final a d(String str) {
            b bVar;
            b[] values = b.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = null;
                    break;
                }
                bVar = values[i];
                if (Intrinsics.areEqual(bVar.a(), str)) {
                    break;
                }
                i++;
            }
            if (bVar == null) {
                bVar = b.c;
            }
            if (bVar == b.c) {
                ce2.b(str);
            }
            return this;
        }

        public final a g(String str) {
            c[] values = c.values();
            int length = values.length;
            for (int i = 0; i < length && !Intrinsics.areEqual(values[i].a(), str); i++) {
            }
            return this;
        }

        public final void h(String str) {
        }

        public final a i(String str) {
            d dVar;
            d[] values = d.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dVar = null;
                    break;
                }
                dVar = values[i];
                if (Intrinsics.areEqual(dVar.a(), str)) {
                    break;
                }
                i++;
            }
            if (dVar == null) {
                dVar = d.c;
            }
            if (dVar == d.c) {
                ce2.b(str);
            }
            return this;
        }

        public final mi0 a() {
            return new mi0(this.f16246a, 0);
        }

        public final a f(String str) {
            this.f16246a = str;
            return this;
        }

        public final a j(String str) {
            ce2.b(str);
            return this;
        }

        public final a c(String str) {
            ce2.b(str);
            return this;
        }

        public final a e(String str) {
            ce2.a(str);
            return this;
        }

        public final a b(String str) {
            ce2.a(str);
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b c;
        private static final /* synthetic */ b[] d;
        private final String b;

        static {
            b bVar = new b(0, "ICON_HORIZONTAL_POSITION_LEFT", "left");
            b bVar2 = new b(1, "ICON_HORIZONTAL_POSITION_RIGHT", "right");
            b bVar3 = new b(2, "ICON_HORIZONTAL_POSITION_LEFT_OFFSET", "leftOffset");
            c = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            d = bVarArr;
            EnumEntriesKt.enumEntries(bVarArr);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }

        private b(int i, String str, String str2) {
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final a c;
        private static final /* synthetic */ c[] d;
        private final String b;

        static {
            c[] cVarArr = {new c(0, "STATIC_RESOURCE", "StaticResource"), new c(1, "IFRAME_RESOURCE", "IFrameResource"), new c(2, "HTML_RESOURCE", "HTMLResource")};
            d = cVarArr;
            EnumEntriesKt.enumEntries(cVarArr);
            c = new a(0);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) d.clone();
        }

        private c(int i, String str, String str2) {
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(int i) {
                this();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d c;
        private static final /* synthetic */ d[] d;
        private final String b;

        static {
            d dVar = new d(0, "ICON_VERTICAL_POSITION_TOP", "top");
            d dVar2 = new d(1, "ICON_VERTICAL_POSITION_BOTTOM", "bottom");
            d dVar3 = new d(2, "ICON_VERTICAL_POSITION_TOP_OFFSET", "topOffset");
            c = dVar3;
            d[] dVarArr = {dVar, dVar2, dVar3};
            d = dVarArr;
            EnumEntriesKt.enumEntries(dVarArr);
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) d.clone();
        }

        private d(int i, String str, String str2) {
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }
    }

    private mi0(String str) {
        this.f16245a = str;
    }

    public /* synthetic */ mi0(String str, int i) {
        this(str);
    }

    public final String a() {
        return this.f16245a;
    }
}
