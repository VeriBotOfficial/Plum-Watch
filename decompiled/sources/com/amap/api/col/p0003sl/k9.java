package com.amap.api.col.p0003sl;

import com.amap.api.col.p0003sl.j9;

/* compiled from: PrivacyError.java */
/* loaded from: classes11.dex */
public class k9 {

    /* renamed from: a, reason: collision with root package name */
    public final j9.e f1729a;
    public final String b;

    /* compiled from: PrivacyError.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1730a;

        static {
            j9.e.values();
            int[] iArr = new int[9];
            f1730a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1730a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1730a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1730a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1730a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1730a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1730a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1730a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1730a[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    k9(j9.e eVar, l9 l9Var) {
        String format;
        this.f1729a = eVar;
        switch (a.f1730a[eVar.ordinal()]) {
            case 1:
                format = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请设置隐私权政策是否弹窗告知用户", l9Var.d());
                break;
            case 2:
                format = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已弹窗告知用户", l9Var.d());
                break;
            case 3:
                format = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保设置隐私权政策是否包含高德开平隐私权政策", l9Var.d());
                break;
            case 4:
                format = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已经包含高德开平隐私权政策", l9Var.d());
                break;
            case 5:
                format = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保设置隐私权政策是否取得用户同意", l9Var.d());
                break;
            case 6:
                format = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已取得用户同意", l9Var.d());
                break;
            case 7:
                format = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能使用前请确保已经正确设置apiKey，如有疑问请在高德开放平台官网中搜索【INVALID_USER_KEY】相关内容进行解决。", l9Var.d());
                break;
            case 8:
                format = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n参数非法，context 或 sdkInfo为空", new Object[0]);
                break;
            case 9:
                format = String.format("设置隐私政策成功", new Object[0]);
                break;
            default:
                format = "";
                break;
        }
        this.b = format;
    }
}
