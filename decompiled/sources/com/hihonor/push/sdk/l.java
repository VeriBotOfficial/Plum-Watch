package com.hihonor.push.sdk;

import android.util.SparseArray;
import com.iflytek.cloud.ErrorCode;
import com.tiktok.appevents.ErrorData;

/* loaded from: classes11.dex */
public enum l {
    SUCCESS(0, "success"),
    ERROR_NOT_SUPPORT_PUSH(8001000, "device is not support push."),
    ERROR_MAIN_THREAD(8001001, "operation in MAIN thread prohibited."),
    ERROR_NO_TOKEN(8001004, "token missing."),
    ERROR_NO_APPID(8001002, "app id missing."),
    ERROR_NOT_INITIALIZED(8001005, ErrorData.TT_DDL_MSG_NOT_INIT),
    ERROR_CERT_FINGERPRINT_EMPTY(8001003, "certificate fingerprint empty."),
    ERROR_BIND_SERVICE(8002001, "bind service failed."),
    ERROR_SERVICE_DISCONNECTED(8002002, "service disconnected."),
    ERROR_SERVICE_TIME_OUT(8002003, "service connect time out."),
    ERROR_SERVICE_ARGUMENTS_INVALID(8002004, "service arguments invalid."),
    ERROR_SERVICE_NULL_BINDING(8002005, "service being bound has return null."),
    ERROR_SERVICE_INVALID(8002006, "service invalid."),
    ERROR_SERVICE_DISABLED(8002007, "service disabled."),
    ERROR_SERVICE_MISSING(8002008, "service missing."),
    ERROR_PUSH_SERVER(8003001, "push server error."),
    ERROR_UNKNOWN(8003002, "unknown error."),
    ERROR_INTERNAL_ERROR(8003003, "internal error."),
    ERROR_ARGUMENTS_INVALID(8003004, "arguments invalid."),
    ERROR_OPERATION_FREQUENTLY(8003005, "operation too frequently."),
    ERROR_NETWORK_NONE(8003006, "no network."),
    ERROR_STATEMENT_AGREEMENT(8003007, "not statement agreement."),
    ERROR_SERVICE_REQUEST_TIME_OUT(8003008, "service request time out."),
    ERROR_HTTP_OPERATION_FREQUENTLY(ErrorCode.MSP_ERROR_NET_DNS, "http operation too frequently.");

    public static final SparseArray<l> A = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    public int f10143a;
    public String b;

    static {
        l[] values = values();
        for (int i = 0; i < 24; i++) {
            l lVar = values[i];
            A.put(lVar.f10143a, lVar);
        }
    }

    l(int i, String str) {
        this.f10143a = i;
        this.b = str;
    }

    public h a() {
        return new h(this.f10143a, this.b);
    }
}
