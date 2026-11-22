package com.baidu.mapauto.auth.constant;

/* loaded from: classes13.dex */
public final class FunctionStatus {
    public static final int STATUS_HAVE_AUTH = 0;
    public static final int STATUS_NOT_AUTH = 1;

    public static String getStatusDesc(int i) {
        if (i == 0) {
            return "有权限";
        }
        if (i == 1) {
            return "没有权限";
        }
        throw new UnsupportedOperationException();
    }
}
