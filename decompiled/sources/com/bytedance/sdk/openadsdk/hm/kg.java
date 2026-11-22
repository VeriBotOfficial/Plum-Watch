package com.bytedance.sdk.openadsdk.hm;

import com.bytedance.sdk.openadsdk.hm.gff.fxn;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes14.dex */
public class kg {
    public static final String fxn = fxn.InterfaceC0538fxn.fxn;
    public static final String kg = fxn.InterfaceC0538fxn.kg;
    public static final String gff = fxn.InterfaceC0538fxn.gff;
    public static final String hm = fxn.InterfaceC0538fxn.hm;
    public static final String rb = fxn.InterfaceC0538fxn.rb;
    public static final String bh = fxn.InterfaceC0538fxn.bh;

    /* renamed from: sg, reason: collision with root package name */
    public static final Set<String> f9563sg = new HashSet(Arrays.asList("click", "show", "insight_log"));

    public static class fxn {
        public static String fxn = "openDetailPage";
        public static String gff = "direct";
        public static String hm = "saLandingPageLinks";
        public static String kg = "openAdLandPageLinks";
    }

    /* renamed from: com.bytedance.sdk.openadsdk.hm.kg$kg, reason: collision with other inner class name */
    public static class C0539kg {
        public static int fxn = 1;
        public static int gff = 100;
        public static int kg = 2;
    }

    public static boolean fxn(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
