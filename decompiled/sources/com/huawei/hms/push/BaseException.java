package com.huawei.hms.push;

import com.huawei.hms.aaid.constant.ErrorEnum;

/* loaded from: classes14.dex */
public class BaseException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f10463a;
    private final ErrorEnum b;

    public BaseException(int i) {
        ErrorEnum fromCode = ErrorEnum.fromCode(i);
        this.b = fromCode;
        this.f10463a = fromCode.getExternalCode();
    }

    public int getErrorCode() {
        return this.f10463a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.b.getMessage();
    }
}
