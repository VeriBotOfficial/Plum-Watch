package com.wakeup.commonui.utils;

import android.content.Context;
import android.os.LocaleList;
import com.alipay.sdk.app.AlipayApi;
import com.alipay.sdk.m.n.b;
import com.anythink.expressad.video.dynview.a.a;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.ar.ta;
import com.facebook.hermes.intl.Constants;
import com.umeng.analytics.pro.ak;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.wakeup.commonui.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LanguageUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lcom/wakeup/commonui/utils/LanguageUtils;", "", "<init>", "()V", "getLanguageStr", "", "mContext", "Landroid/content/Context;", "code", "getSystemLanguageCode", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LanguageUtils {
    public static final LanguageUtils INSTANCE = new LanguageUtils();

    private LanguageUtils() {
    }

    public final String getLanguageStr(Context mContext, String code) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(code, "code");
        switch (code.hashCode()) {
            case 3121:
                if (!code.equals(a.X)) {
                    return "";
                }
                String string = mContext.getString(R.string.language_ar);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            case 3129:
                if (!code.equals("az")) {
                    return "";
                }
                String string2 = mContext.getString(R.string.language_az);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 3141:
                if (!code.equals("bg")) {
                    return "";
                }
                String string3 = mContext.getString(R.string.language_bg);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 3148:
                if (!code.equals(ScarConstants.BN_SIGNAL_KEY)) {
                    return "";
                }
                String string4 = mContext.getString(R.string.language_bn);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 3166:
                if (!code.equals("ca")) {
                    return "";
                }
                String string5 = mContext.getString(R.string.language_ca);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 3184:
                if (!code.equals("cs")) {
                    return "";
                }
                String string6 = mContext.getString(R.string.language_cs);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 3197:
                if (!code.equals("da")) {
                    return "";
                }
                String string7 = mContext.getString(R.string.language_da);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 3201:
                if (!code.equals("de")) {
                    return "";
                }
                String string8 = mContext.getString(R.string.language_de);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case 3239:
                if (!code.equals("el")) {
                    return "";
                }
                String string9 = mContext.getString(R.string.language_el);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
            case 3241:
                if (!code.equals("en")) {
                    return "";
                }
                String string10 = mContext.getString(R.string.language_en);
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                return string10;
            case 3246:
                if (!code.equals("es")) {
                    return "";
                }
                String string11 = mContext.getString(R.string.language_es);
                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                return string11;
            case 3259:
                if (!code.equals("fa")) {
                    return "";
                }
                String string12 = mContext.getString(R.string.language_fa);
                Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                return string12;
            case 3267:
                if (!code.equals("fi")) {
                    return "";
                }
                String string13 = mContext.getString(R.string.language_fi);
                Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                return string13;
            case 3276:
                if (!code.equals("fr")) {
                    return "";
                }
                String string14 = mContext.getString(R.string.language_fr);
                Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                return string14;
            case 3325:
                if (!code.equals("he")) {
                    return "";
                }
                String string15 = mContext.getString(R.string.language_iw);
                Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                return string15;
            case 3329:
                if (!code.equals("hi")) {
                    return "";
                }
                String string16 = mContext.getString(R.string.language_hi);
                Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                return string16;
            case 3341:
                if (!code.equals("hu")) {
                    return "";
                }
                String string17 = mContext.getString(R.string.language_hu);
                Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
                return string17;
            case 3355:
                if (!code.equals("id")) {
                    return "";
                }
                String string18 = mContext.getString(R.string.language_id);
                Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
                return string18;
            case 3369:
                if (!code.equals("ir")) {
                    return "";
                }
                String string19 = mContext.getString(R.string.language_ir);
                Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
                return string19;
            case 3371:
                if (!code.equals("it")) {
                    return "";
                }
                String string20 = mContext.getString(R.string.language_it);
                Intrinsics.checkNotNullExpressionValue(string20, "getString(...)");
                return string20;
            case 3383:
                if (!code.equals(a.T)) {
                    return "";
                }
                String string21 = mContext.getString(R.string.language_ja);
                Intrinsics.checkNotNullExpressionValue(string21, "getString(...)");
                return string21;
            case 3424:
                if (!code.equals("kk")) {
                    return "";
                }
                String string22 = mContext.getString(R.string.language_kk);
                Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
                return string22;
            case 3426:
                if (!code.equals("km")) {
                    return "";
                }
                String string23 = mContext.getString(R.string.language_km);
                Intrinsics.checkNotNullExpressionValue(string23, "getString(...)");
                return string23;
            case 3427:
                if (!code.equals(Constants.COLLATION_EXTENSION_PARAM_NUMERIC_SHORT)) {
                    return "";
                }
                String string24 = mContext.getString(R.string.language_kn);
                Intrinsics.checkNotNullExpressionValue(string24, "getString(...)");
                return string24;
            case 3428:
                if (!code.equals(a.V)) {
                    return "";
                }
                String string25 = mContext.getString(R.string.language_ko);
                Intrinsics.checkNotNullExpressionValue(string25, "getString(...)");
                return string25;
            case 3445:
                if (!code.equals("la")) {
                    return "";
                }
                String string26 = mContext.getString(R.string.language_la);
                Intrinsics.checkNotNullExpressionValue(string26, "getString(...)");
                return string26;
            case 3459:
                if (!code.equals("lo")) {
                    return "";
                }
                String string27 = mContext.getString(R.string.language_lo);
                Intrinsics.checkNotNullExpressionValue(string27, "getString(...)");
                return string27;
            case 3487:
                if (!code.equals("ml")) {
                    return "";
                }
                String string28 = mContext.getString(R.string.language_ml);
                Intrinsics.checkNotNullExpressionValue(string28, "getString(...)");
                return string28;
            case 3493:
                if (!code.equals("mr")) {
                    return "";
                }
                String string29 = mContext.getString(R.string.language_mr);
                Intrinsics.checkNotNullExpressionValue(string29, "getString(...)");
                return string29;
            case 3494:
                if (!code.equals(Const.SP_KEY_GSM_UPLOAD_MXSIZE)) {
                    return "";
                }
                String string30 = mContext.getString(R.string.language_ms);
                Intrinsics.checkNotNullExpressionValue(string30, "getString(...)");
                return string30;
            case 3500:
                if (!code.equals("my")) {
                    return "";
                }
                String string31 = mContext.getString(R.string.language_my);
                Intrinsics.checkNotNullExpressionValue(string31, "getString(...)");
                return string31;
            case 3511:
                if (!code.equals("ne")) {
                    return "";
                }
                String string32 = mContext.getString(R.string.language_ne);
                Intrinsics.checkNotNullExpressionValue(string32, "getString(...)");
                return string32;
            case 3518:
                if (!code.equals("nl")) {
                    return "";
                }
                String string33 = mContext.getString(R.string.language_nl);
                Intrinsics.checkNotNullExpressionValue(string33, "getString(...)");
                return string33;
            case 3521:
                if (!code.equals("no")) {
                    return "";
                }
                String string34 = mContext.getString(R.string.language_no);
                Intrinsics.checkNotNullExpressionValue(string34, "getString(...)");
                return string34;
            case 3569:
                if (!code.equals(b.k)) {
                    return "";
                }
                String string35 = mContext.getString(R.string.language_pa);
                Intrinsics.checkNotNullExpressionValue(string35, "getString(...)");
                return string35;
            case 3580:
                if (!code.equals(ak.az)) {
                    return "";
                }
                String string36 = mContext.getString(R.string.language_pl);
                Intrinsics.checkNotNullExpressionValue(string36, "getString(...)");
                return string36;
            case 3588:
                if (!code.equals("pt")) {
                    return "";
                }
                String string37 = mContext.getString(R.string.language_pt);
                Intrinsics.checkNotNullExpressionValue(string37, "getString(...)");
                return string37;
            case 3645:
                if (!code.equals("ro")) {
                    return "";
                }
                String string38 = mContext.getString(R.string.language_ro);
                Intrinsics.checkNotNullExpressionValue(string38, "getString(...)");
                return string38;
            case 3651:
                if (!code.equals(a.Y)) {
                    return "";
                }
                String string39 = mContext.getString(R.string.language_ru);
                Intrinsics.checkNotNullExpressionValue(string39, "getString(...)");
                return string39;
            case AlipayApi.d /* 3670 */:
                if (!code.equals("si")) {
                    return "";
                }
                String string40 = mContext.getString(R.string.language_si);
                Intrinsics.checkNotNullExpressionValue(string40, "getString(...)");
                return string40;
            case 3683:
                if (!code.equals("sv")) {
                    return "";
                }
                String string41 = mContext.getString(R.string.language_sv);
                Intrinsics.checkNotNullExpressionValue(string41, "getString(...)");
                return string41;
            case 3684:
                if (!code.equals("sw")) {
                    return "";
                }
                String string42 = mContext.getString(R.string.language_sw);
                Intrinsics.checkNotNullExpressionValue(string42, "getString(...)");
                return string42;
            case 3693:
                if (!code.equals(ta.l)) {
                    return "";
                }
                String string43 = mContext.getString(R.string.language_ta);
                Intrinsics.checkNotNullExpressionValue(string43, "getString(...)");
                return string43;
            case 3697:
                if (!code.equals("te")) {
                    return "";
                }
                String string44 = mContext.getString(R.string.language_te);
                Intrinsics.checkNotNullExpressionValue(string44, "getString(...)");
                return string44;
            case 3700:
                if (!code.equals("th")) {
                    return "";
                }
                String string45 = mContext.getString(R.string.language_th);
                Intrinsics.checkNotNullExpressionValue(string45, "getString(...)");
                return string45;
            case 3710:
                if (!code.equals("tr")) {
                    return "";
                }
                String string46 = mContext.getString(R.string.language_tr);
                Intrinsics.checkNotNullExpressionValue(string46, "getString(...)");
                return string46;
            case 3734:
                if (!code.equals("uk")) {
                    return "";
                }
                String string47 = mContext.getString(R.string.language_uk);
                Intrinsics.checkNotNullExpressionValue(string47, "getString(...)");
                return string47;
            case 3741:
                if (!code.equals("ur")) {
                    return "";
                }
                String string48 = mContext.getString(R.string.language_ur);
                Intrinsics.checkNotNullExpressionValue(string48, "getString(...)");
                return string48;
            case 3763:
                if (!code.equals("vi")) {
                    return "";
                }
                String string49 = mContext.getString(R.string.language_vi);
                Intrinsics.checkNotNullExpressionValue(string49, "getString(...)");
                return string49;
            case 3886:
                if (!code.equals("zh")) {
                    return "";
                }
                String string50 = mContext.getString(R.string.language_zh);
                Intrinsics.checkNotNullExpressionValue(string50, "getString(...)");
                return string50;
            case 101385:
                if (!code.equals("fil")) {
                    return "";
                }
                String string51 = mContext.getString(R.string.language_fil);
                Intrinsics.checkNotNullExpressionValue(string51, "getString(...)");
                return string51;
            case 111189:
                if (!code.equals("pot")) {
                    return "";
                }
                String string52 = mContext.getString(R.string.language_pot);
                Intrinsics.checkNotNullExpressionValue(string52, "getString(...)");
                return string52;
            default:
                return "";
        }
    }

    public final String getSystemLanguageCode() {
        Locale locale = LocaleList.getDefault().get(0);
        Intrinsics.checkNotNull(locale);
        String language = locale.getLanguage();
        if (Intrinsics.areEqual(language, "zh")) {
            String country = locale.getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
            String upperCase = country.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase.length() == 0 ? "zh-CN" : "zh-" + upperCase;
        }
        Intrinsics.checkNotNull(language);
        return language;
    }
}
