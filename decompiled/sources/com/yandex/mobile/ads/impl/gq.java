package com.yandex.mobile.ads.impl;

import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class gq {
    public static final a d;
    private static final /* synthetic */ gq[] e;
    private final String b;
    private final String c;

    static {
        gq[] gqVarArr = {new gq(0, "CONSENT_STRING", "IABConsent_ConsentString", AndroidTcfDataSource.TCF_TCSTRING_KEY), new gq(1, "GDPR", "IABConsent_SubjectToGDPR", "IABTCF_gdprApplies"), new gq(2, "CMP_PRESENT", "IABConsent_CMPPresent", "IABTCF_CmpSdkID"), new gq(3, "PURPOSE_CONSENTS", "IABConsent_ParsedPurposeConsents", "IABTCF_PurposeConsents"), new gq(4, "VENDOR_CONSENTS", "IABConsent_ParsedVendorConsents", "IABTCF_VendorConsents"), new gq(5, "ADDITIONAL_CONSENT", null, "IABTCF_AddtlConsent")};
        e = gqVarArr;
        EnumEntriesKt.enumEntries(gqVarArr);
        d = new a(0);
    }

    public static gq valueOf(String str) {
        return (gq) Enum.valueOf(gq.class, str);
    }

    public static gq[] values() {
        return (gq[]) e.clone();
    }

    private gq(int i, String str, String str2, String str3) {
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
