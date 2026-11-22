package com.yandex.mobile.ads.impl;

import com.applovin.sdk.AppLovinMediationProvider;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z6 {
    public static final a c;
    private static final /* synthetic */ z6[] d;
    private static final /* synthetic */ EnumEntries e;
    private final String b;

    public static final class a {

        /* renamed from: com.yandex.mobile.ads.impl.z6$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0990a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17485a;

            static {
                int[] iArr = new int[z6.values().length];
                try {
                    a aVar = z6.c;
                    iArr[6] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    a aVar2 = z6.c;
                    iArr[0] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    a aVar3 = z6.c;
                    iArr[1] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    a aVar4 = z6.c;
                    iArr[2] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    a aVar5 = z6.c;
                    iArr[3] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    a aVar6 = z6.c;
                    iArr[4] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    a aVar7 = z6.c;
                    iArr[5] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    a aVar8 = z6.c;
                    iArr[7] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    a aVar9 = z6.c;
                    iArr[8] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    a aVar10 = z6.c;
                    iArr[9] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    a aVar11 = z6.c;
                    iArr[10] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    a aVar12 = z6.c;
                    iArr[11] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    a aVar13 = z6.c;
                    iArr[12] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    a aVar14 = z6.c;
                    iArr[13] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    a aVar15 = z6.c;
                    iArr[14] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    a aVar16 = z6.c;
                    iArr[15] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                f17485a = iArr;
            }
        }

        public static AdQualityVerifiableNetwork a(z6 z6Var) {
            switch (z6Var == null ? -1 : C0990a.f17485a[z6Var.ordinal()]) {
                case 1:
                    return AdQualityVerifiableNetwork.ADMOB;
                case 2:
                    return AdQualityVerifiableNetwork.ADCOLONY;
                case 3:
                    return AdQualityVerifiableNetwork.APPLOVIN;
                case 4:
                    return AdQualityVerifiableNetwork.APPLOVINMAX;
                case 5:
                    return AdQualityVerifiableNetwork.BIGOADS;
                case 6:
                    return AdQualityVerifiableNetwork.CHARTBOOST;
                case 7:
                    return AdQualityVerifiableNetwork.GOOGLE;
                case 8:
                    return AdQualityVerifiableNetwork.INMOBI;
                case 9:
                    return AdQualityVerifiableNetwork.IRONSOURCE;
                case 10:
                    return AdQualityVerifiableNetwork.MINTEGRAL;
                case 11:
                    return AdQualityVerifiableNetwork.MYTARGET;
                case 12:
                    return AdQualityVerifiableNetwork.PANGLE;
                case 13:
                    return AdQualityVerifiableNetwork.TAPJOY;
                case 14:
                    return AdQualityVerifiableNetwork.UNITYADS;
                case 15:
                    return AdQualityVerifiableNetwork.VUNGLE;
                case 16:
                    return AdQualityVerifiableNetwork.YANDEX;
                default:
                    return null;
            }
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        z6[] z6VarArr = {new z6(0, "ADCOLONY", "adcolony"), new z6(1, com.qumeng.overseas.advlib.trdparty.unionset.common.h.e, com.qumeng.overseas.advlib.trdparty.unionset.network.c.w), new z6(2, "APPLOVINMAX", "applovin_max"), new z6(3, "BIGOADS", "bigoads"), new z6(4, "CHARTBOOST", "chartboost"), new z6(5, "GOOGLE", "admanager"), new z6(6, com.qumeng.overseas.advlib.trdparty.unionset.common.h.b, "admob"), new z6(7, "INMOBI", "inmobi"), new z6(8, "IRONSOURCE", AppLovinMediationProvider.IRONSOURCE), new z6(9, "MINTEGRAL", "mintegral"), new z6(10, "MYTARGET", "mytarget"), new z6(11, com.qumeng.overseas.advlib.trdparty.unionset.common.h.d, com.qumeng.overseas.advlib.trdparty.unionset.network.c.v), new z6(12, "TAPJOY", "tapjoy"), new z6(13, "UNITYADS", "unityads"), new z6(14, "VUNGLE", "vungle"), new z6(15, "YANDEX", "yandex")};
        d = z6VarArr;
        e = EnumEntriesKt.enumEntries(z6VarArr);
        c = new a(0);
    }

    public static EnumEntries<z6> a() {
        return e;
    }

    public static z6 valueOf(String str) {
        return (z6) Enum.valueOf(z6.class, str);
    }

    public static z6[] values() {
        return (z6[]) d.clone();
    }

    private z6(int i, String str, String str2) {
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }
}
