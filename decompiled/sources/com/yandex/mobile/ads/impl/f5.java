package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f5 {
    public static final f5 A;
    public static final f5 B;
    private static final /* synthetic */ f5[] C;
    public static final f5 c;
    public static final f5 d;
    public static final f5 e;
    public static final f5 f;
    public static final f5 g;
    public static final f5 h;
    public static final f5 i;
    public static final f5 j;
    public static final f5 k;
    public static final f5 l;
    public static final f5 m;
    public static final f5 n;
    public static final f5 o;
    public static final f5 p;

    /* renamed from: q, reason: collision with root package name */
    public static final f5 f15455q;
    public static final f5 r;
    public static final f5 s;
    public static final f5 t;
    public static final f5 u;
    public static final f5 v;
    public static final f5 w;
    public static final f5 x;
    public static final f5 y;
    public static final f5 z;
    private final String b;

    static {
        f5 f5Var = new f5(0, "ADAPTER_LOADING", "adapter_loading_duration");
        c = f5Var;
        f5 f5Var2 = new f5(1, "ADVERTISING_INFO_LOADING", "advertising_info_loading_duration");
        d = f5Var2;
        f5 f5Var3 = new f5(2, "AD_LOADING", "ad_loading_duration");
        e = f5Var3;
        f5 f5Var4 = new f5(3, "AD_RENDER", "ad_rendering_duration");
        f = f5Var4;
        f5 f5Var5 = new f5(4, "AUTOGRAB_LOADING", "autograb_loading_duration");
        g = f5Var5;
        f5 f5Var6 = new f5(5, "BIDDING_DATA_LOADING", "bidding_data_loading_duration");
        h = f5Var6;
        f5 f5Var7 = new f5(6, "IDENTIFIERS_LOADING", "identifiers_loading_duration");
        i = f5Var7;
        f5 f5Var8 = new f5(7, "SDK_INITIALIZATION", "sdk_initialization_duration");
        j = f5Var8;
        f5 f5Var9 = new f5(8, "AD_BLOCKER_DETECTING", "ad_blocker_detecting_duration");
        k = f5Var9;
        f5 f5Var10 = new f5(9, "SDK_CONFIGURATION_QUEUE", "sdk_configuration_queue_duration");
        l = f5Var10;
        f5 f5Var11 = new f5(10, "SDK_CONFIGURATION_LOADING", "sdk_configuration_loading_duration");
        m = f5Var11;
        f5 f5Var12 = new f5(11, "SDK_CONFIGURATION_REQUEST_QUEUE", "sdk_configuration_request_queue_duration");
        n = f5Var12;
        f5 f5Var13 = new f5(12, "SDK_CONFIGURATION_REQUEST", "sdk_configuration_request_duration");
        o = f5Var13;
        f5 f5Var14 = new f5(13, "RESOURCES_LOADING", "resources_loading_duration");
        p = f5Var14;
        f5 f5Var15 = new f5(14, "IMAGE_LOADING", "image_loading_duration");
        f15455q = f5Var15;
        f5 f5Var16 = new f5(15, "VIDEO_CACHING", "video_caching_duration");
        r = f5Var16;
        f5 f5Var17 = new f5(16, "WEB_VIEW_CACHING", "web_view_caching_duration");
        s = f5Var17;
        f5 f5Var18 = new f5(17, "NETWORK_REQUEST_QUEUE", "network_request_queue_duration");
        t = f5Var18;
        f5 f5Var19 = new f5(18, "NETWORK_REQUEST", "network_request_durations");
        u = f5Var19;
        f5 f5Var20 = new f5(19, "VAST_LOADING", "vast_loading_durations");
        v = f5Var20;
        f5 f5Var21 = new f5(20, "VIDEO_AD_RENDERING", "video_ad_rendering_duration");
        w = f5Var21;
        f5 f5Var22 = new f5(21, "VIDEO_AD_PREPARE", "video_ad_prepare_duration");
        x = f5Var22;
        f5 f5Var23 = new f5(22, "VMAP_LOADING", "vmap_loading_duration");
        y = f5Var23;
        f5 f5Var24 = new f5(23, "BIDDER_TOKEN_LOADING", "bidder_token_loading_duration");
        z = f5Var24;
        f5 f5Var25 = new f5(24, "BIDDER_TOKEN_GENERATION", "bidder_token_generation_duration");
        A = f5Var25;
        f5 f5Var26 = new f5(25, "DNS_PREFETCH", "dns_prefetch_duration");
        B = f5Var26;
        f5[] f5VarArr = {f5Var, f5Var2, f5Var3, f5Var4, f5Var5, f5Var6, f5Var7, f5Var8, f5Var9, f5Var10, f5Var11, f5Var12, f5Var13, f5Var14, f5Var15, f5Var16, f5Var17, f5Var18, f5Var19, f5Var20, f5Var21, f5Var22, f5Var23, f5Var24, f5Var25, f5Var26};
        C = f5VarArr;
        EnumEntriesKt.enumEntries(f5VarArr);
    }

    public static f5 valueOf(String str) {
        return (f5) Enum.valueOf(f5.class, str);
    }

    public static f5[] values() {
        return (f5[]) C.clone();
    }

    private f5(int i2, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
