package com.qweather.sdk.bean.base;

import com.anythink.expressad.video.dynview.a.a;
import com.autonavi.aps.amapapi.config.Const;
import com.umeng.analytics.pro.ak;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;

/* loaded from: classes17.dex */
public enum Lang {
    ZH_HANS("zh-hans"),
    ZH_HANT("zh-hant"),
    EN("en"),
    DE("de"),
    ES("es"),
    FR("fr"),
    IT("it"),
    JA(a.T),
    KO(a.V),
    RU(a.Y),
    HI("hi"),
    TH("th"),
    AR(a.X),
    PT("pt"),
    BN(ScarConstants.BN_SIGNAL_KEY),
    MS(Const.SP_KEY_GSM_UPLOAD_MXSIZE),
    NL("nl"),
    EL("el"),
    LA("la"),
    SV("sv"),
    ID("id"),
    PL(ak.az),
    TR("tr"),
    CS("cs"),
    ET("et"),
    VI("vi"),
    FIL("fil"),
    FI("fi"),
    HE("he"),
    IS(ak.ae),
    NB("nb");

    private final String code;

    Lang(String str) {
        this.code = str;
    }

    public String getCode() {
        return this.code;
    }
}
