package com.baidu.mapauto.auth.constant;

/* JADX INFO: loaded from: classes15.dex */
public final class FunctionStatus {
    public static final int STATUS_HAVE_AUTH = 0;
    public static final int STATUS_NOT_AUTH = 1;

    public static String getStatusDesc(int r1) {
        if (r1 == 0) {
            return "有权限";
        }
        if (r1 == 1) {
            return "没有权限";
        }
        throw new UnsupportedOperationException();
    }
}
