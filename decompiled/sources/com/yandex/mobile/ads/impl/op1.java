package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class op1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16474a;
    private final Map<String, Object> b;
    private final f c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16475a = StringsKt.capitalize("yandex");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b A;
        public static final b B;
        public static final b C;
        public static final b D;
        public static final b E;
        public static final b F;
        public static final b G;
        public static final b H;
        public static final b I;
        public static final b J;
        public static final b K;
        public static final b L;
        public static final b M;
        public static final b N;
        public static final b O;
        public static final b P;
        public static final b Q;
        public static final b R;
        public static final b S;
        public static final b T;
        public static final b U;
        public static final b V;
        public static final b W;
        public static final b X;
        public static final b Y;
        public static final b Z;
        public static final b a0;
        public static final b b0;
        public static final b c;
        public static final b c0;
        public static final b d;
        private static final /* synthetic */ b[] d0;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final b j;
        public static final b k;
        public static final b l;
        public static final b m;
        public static final b n;
        public static final b o;
        public static final b p;

        /* renamed from: q, reason: collision with root package name */
        public static final b f16476q;
        public static final b r;
        public static final b s;
        public static final b t;
        public static final b u;
        public static final b v;
        public static final b w;
        public static final b x;
        public static final b y;
        public static final b z;
        private final String b;

        static {
            b bVar = new b(0, "AD_LOADING_RESULT", "ad_loading_result");
            c = bVar;
            b bVar2 = new b(1, "AD_RENDERING_RESULT", "ad_rendering_result");
            d = bVar2;
            b bVar3 = new b(2, "ADAPTER_AUTO_REFRESH", "adapter_auto_refresh");
            e = bVar3;
            b bVar4 = new b(3, "ADAPTER_INVALID", "adapter_invalid");
            f = bVar4;
            b bVar5 = new b(4, "ADAPTER_REQUEST", "adapter_request");
            g = bVar5;
            b bVar6 = new b(5, "ADAPTER_RESPONSE", "adapter_response");
            h = bVar6;
            b bVar7 = new b(6, "ADAPTER_BIDDER_TOKEN_REQUEST", "adapter_bidder_token_request");
            i = bVar7;
            b bVar8 = new b(7, "ADTUNE", "adtune");
            j = bVar8;
            b bVar9 = new b(8, "REQUEST", "ad_request");
            k = bVar9;
            b bVar10 = new b(9, "RESPONSE", "ad_response");
            l = bVar10;
            b bVar11 = new b(10, "VAST_REQUEST", "vast_request");
            m = bVar11;
            b bVar12 = new b(11, "VAST_RESPONSE", "vast_response");
            n = bVar12;
            b bVar13 = new b(12, "VAST_WRAPPER_REQUEST", "vast_wrapper_request");
            o = bVar13;
            b bVar14 = new b(13, "VAST_WRAPPER_RESPONSE", "vast_wrapper_response");
            p = bVar14;
            b bVar15 = new b(14, "VIDEO_AD_START", "video_ad_start");
            f16476q = bVar15;
            b bVar16 = new b(15, "VIDEO_AD_COMPLETE", "video_ad_complete");
            r = bVar16;
            b bVar17 = new b(16, "VIDEO_AD_PLAYER_ERROR", "video_ad_player_error");
            s = bVar17;
            b bVar18 = new b(17, "VMAP_REQUEST", "vmap_request");
            t = bVar18;
            b bVar19 = new b(18, "VMAP_RESPONSE", "vmap_response");
            u = bVar19;
            b bVar20 = new b(19, "RENDERING_START", "rendering_start");
            v = bVar20;
            b bVar21 = new b(20, "DSP_RENDERING_START", "dsp_rendering_start");
            w = bVar21;
            b bVar22 = new b(21, "IMPRESSION_TRACKING_START", "impression_tracking_start");
            x = bVar22;
            b bVar23 = new b(22, "IMPRESSION_TRACKING_SUCCESS", "impression_tracking_success");
            y = bVar23;
            b bVar24 = new b(23, "IMPRESSION_TRACKING_FAILURE", "impression_tracking_failure");
            z = bVar24;
            b bVar25 = new b(24, "FORCED_IMPRESSION_TRACKING_FAILURE", "forced_impression_tracking_failure");
            A = bVar25;
            b bVar26 = new b(25, "ADAPTER_ACTION", "adapter_action");
            B = bVar26;
            b bVar27 = new b(26, "CLICK", "click");
            C = bVar27;
            b bVar28 = new b(27, "CLOSE", "close");
            D = bVar28;
            b bVar29 = new b(28, "FEEDBACK", "feedback");
            E = bVar29;
            b bVar30 = new b(29, "DEEPLINK", "deeplink");
            F = bVar30;
            b bVar31 = new b(30, "SHOW_SOCIAL_ACTIONS", "show_social_actions");
            G = bVar31;
            b bVar32 = new b(31, "BOUND_ASSETS", "bound_assets");
            H = bVar32;
            b bVar33 = new b(32, "RENDERED_ASSETS", "rendered_assets");
            I = bVar33;
            b bVar34 = new b(33, "REBIND", "rebind");
            J = bVar34;
            b bVar35 = new b(34, "BINDING_FAILURE", "binding_failure");
            K = bVar35;
            b bVar36 = new b(35, "EXPECTED_VIEW_MISSING", "expected_view_missing");
            L = bVar36;
            b bVar37 = new b(36, "RETURNED_TO_APP", "returned_to_app");
            M = bVar37;
            b bVar38 = new b(37, "REWARD", "reward");
            N = bVar38;
            b bVar39 = new b(38, "VIDEO_AD_RENDERING_RESULT", "video_ad_rendering_result");
            O = bVar39;
            b bVar40 = new b(39, "MULTIBANNER_EVENT", "multibanner_event");
            P = bVar40;
            b bVar41 = new b(40, "AD_VIEW_SIZE_INFO", "ad_view_size_info");
            Q = bVar41;
            b bVar42 = new b(41, "DSP_IMPRESSION_TRACKING_START", "dsp_impression_tracking_start");
            R = bVar42;
            b bVar43 = new b(42, "DSP_IMPRESSION_TRACKING_SUCCESS", "dsp_impression_tracking_success");
            S = bVar43;
            b bVar44 = new b(43, "DSP_IMPRESSION_TRACKING_FAILURE", "dsp_impression_tracking_failure");
            T = bVar44;
            b bVar45 = new b(44, "DSP_FORCED_IMPRESSION_TRACKING_FAILURE", "dsp_forced_impression_tracking_failure");
            U = bVar45;
            b bVar46 = new b(45, "LOG", "log");
            V = bVar46;
            b bVar47 = new b(46, "OPEN_BIDDING_TOKEN_GENERATION_RESULT", "open_bidding_token_generation_result");
            W = bVar47;
            b bVar48 = new b(47, "SDK_CONFIGURATION_SUCCESS", "sdk_configuration_success");
            X = bVar48;
            b bVar49 = new b(48, "SDK_CONFIGURATION_FAILURE", "sdk_configuration_failure");
            Y = bVar49;
            b bVar50 = new b(49, "SDK_TRACKING_EVENT", "tracking_event");
            Z = bVar50;
            b bVar51 = new b(50, "AD_VERIFICATION_RESULT", "ad_verification_result");
            a0 = bVar51;
            b bVar52 = new b(51, "SDK_CONFIGURATION_REQUEST", "sdk_configuration_request");
            b0 = bVar52;
            b bVar53 = new b(52, "ACTIVITY_RESULT_OPENED", "activity_result_opened");
            c0 = bVar53;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, bVar28, bVar29, bVar30, bVar31, bVar32, bVar33, bVar34, bVar35, bVar36, bVar37, bVar38, bVar39, bVar40, bVar41, bVar42, bVar43, bVar44, bVar45, bVar46, bVar47, bVar48, bVar49, bVar50, bVar51, bVar52, bVar53};
            d0 = bVarArr;
            EnumEntriesKt.enumEntries(bVarArr);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d0.clone();
        }

        private b(int i2, String str, String str2) {
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c c;
        public static final c d;
        public static final c e;
        private static final /* synthetic */ c[] f;
        private final String b;

        static {
            c cVar = new c(0, "SUCCESS", "success");
            c = cVar;
            c cVar2 = new c(1, "ERROR", "error");
            d = cVar2;
            c cVar3 = new c(2, "NO_ADS", "no_ads");
            e = cVar3;
            c[] cVarArr = {cVar, cVar2, cVar3, new c(3, "FILTERED", "filtered")};
            f = cVarArr;
            EnumEntriesKt.enumEntries(cVarArr);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f.clone();
        }

        private c(int i, String str, String str2) {
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public op1(b reportType, Map<String, ? extends Object> reportData, f fVar) {
        this(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData), fVar);
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op1)) {
            return false;
        }
        op1 op1Var = (op1) obj;
        return Intrinsics.areEqual(this.f16474a, op1Var.f16474a) && Intrinsics.areEqual(this.b, op1Var.b) && Intrinsics.areEqual(this.c, op1Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.f16474a.hashCode() * 31)) * 31;
        f fVar = this.c;
        return hashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "Report(eventName=" + this.f16474a + ", data=" + this.b + ", abExperiments=" + this.c + Separators.RPAREN;
    }

    public final String c() {
        return this.f16474a;
    }

    public final Map<String, Object> b() {
        return this.b;
    }

    public final f a() {
        return this.c;
    }

    public op1(String eventName, Map<String, Object> data, f fVar) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f16474a = eventName;
        this.b = data;
        this.c = fVar;
        data.put("sdk_version", "7.12.2");
    }
}
