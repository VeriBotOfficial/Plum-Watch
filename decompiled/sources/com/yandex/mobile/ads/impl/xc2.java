package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xc2 {

    /* renamed from: a, reason: collision with root package name */
    private final a f17326a;
    private final Throwable b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        private static final /* synthetic */ a[] G;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;

        /* renamed from: q, reason: collision with root package name */
        public static final a f17327q;
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;

        static {
            a aVar = new a(0, "RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER");
            b = aVar;
            a aVar2 = new a(1, "RENDERER_FAILED_DEQUEUE_INPUT_BUFFER");
            c = aVar2;
            a aVar3 = new a(2, "RENDERER_FAILED_STOP");
            d = aVar3;
            a aVar4 = new a(3, "RENDERER_FAILED_SET_SURFACE");
            e = aVar4;
            a aVar5 = new a(4, "RENDERER_FAILED_RELEASE_OUTPUT_BUFFER");
            f = aVar5;
            a aVar6 = new a(5, "RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER");
            g = aVar6;
            a aVar7 = new a(6, "RENDERER_MEDIA_CODEC_UNKNOWN");
            h = aVar7;
            a aVar8 = new a(7, "TIMEOUT");
            i = aVar8;
            a aVar9 = new a(8, "ILLEGAL_SEEK_POSITION");
            j = aVar9;
            a aVar10 = new a(9, "DECODER_QUERY_ERROR");
            k = aVar10;
            a aVar11 = new a(10, "DECODER_INITIALIZATION_ERROR");
            l = aVar11;
            a aVar12 = new a(11, "DECODER_UNKNOWN_ERROR");
            m = aVar12;
            a aVar13 = new a(12, "BEHIND_LIVE_WINDOW_ERROR");
            n = aVar13;
            a aVar14 = new a(13, "DRM_KEYS_EXPIRED");
            o = aVar14;
            a aVar15 = new a(14, "DRM_MEDIA_RESOURCE_BUSY");
            p = aVar15;
            a aVar16 = new a(15, "DRM_SESSION_ERROR");
            f17327q = aVar16;
            a aVar17 = new a(16, "HTTP_CLEARTEXT_NOT_PERMITTED");
            r = aVar17;
            a aVar18 = new a(17, "HTTP_CODE_UNAUTHORIZED");
            s = aVar18;
            a aVar19 = new a(18, "HTTP_CODE_FORBIDDEN");
            t = aVar19;
            a aVar20 = new a(19, "HTTP_CODE_NOT_FOUND");
            u = aVar20;
            a aVar21 = new a(20, "HTTP_CODE_UNKNOWN");
            v = aVar21;
            a aVar22 = new a(21, "SSL_HANDSHAKE_ERROR");
            w = aVar22;
            a aVar23 = new a(22, "NETWORK_UNAVAILABLE");
            x = aVar23;
            a aVar24 = new a(23, "CONTENT_PARSER_ERROR");
            y = aVar24;
            a aVar25 = new a(24, "LOADER_UNEXPECTED_ERROR");
            z = aVar25;
            a aVar26 = new a(25, "AUDIO_ERROR");
            A = aVar26;
            a aVar27 = new a(26, "SUBTITLE_ERROR");
            B = aVar27;
            a aVar28 = new a(27, "CACHE_ERROR");
            C = aVar28;
            a aVar29 = new a(28, "UNKNOWN");
            D = aVar29;
            a aVar30 = new a(29, "PLAYBACK_UNKNOWN");
            E = aVar30;
            a aVar31 = new a(30, "UNKNOWN_NOT_MATCHED");
            F = aVar31;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31};
            G = aVarArr;
            EnumEntriesKt.enumEntries(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) G.clone();
        }

        private a(int i2, String str) {
        }
    }

    public xc2(a reason, Throwable underlyingError) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(underlyingError, "underlyingError");
        this.f17326a = reason;
        this.b = underlyingError;
    }

    public final a a() {
        return this.f17326a;
    }

    public final Throwable b() {
        return this.b;
    }
}
