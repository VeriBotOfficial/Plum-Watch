package com.alipay.sdk.m.l;

import androidx.media3.common.PlaybackException;

/* loaded from: classes11.dex */
public enum c {
    SUCCEEDED(9000, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(6001, "用户取消"),
    NETWORK_ERROR(6002, "网络连接异常"),
    ACTIVITY_NOT_START_EXIT(PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED, "支付未完成"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(5000, "重复请求"),
    PAY_WAITTING(8000, "支付结果确认中");


    /* renamed from: a, reason: collision with root package name */
    public int f1403a;
    public String b;

    c(int i, String str) {
        this.f1403a = i;
        this.b = str;
    }

    public void b(int i) {
        this.f1403a = i;
    }

    public int c() {
        return this.f1403a;
    }

    public void a(String str) {
        this.b = str;
    }

    public String b() {
        return this.b;
    }

    public static c a(int i) {
        if (i == 4001) {
            return PARAMS_ERROR;
        }
        if (i == 5000) {
            return DOUBLE_REQUEST;
        }
        if (i == 8000) {
            return PAY_WAITTING;
        }
        if (i == 9000) {
            return SUCCEEDED;
        }
        if (i == 6001) {
            return CANCELED;
        }
        if (i != 6002) {
            return FAILED;
        }
        return NETWORK_ERROR;
    }
}
