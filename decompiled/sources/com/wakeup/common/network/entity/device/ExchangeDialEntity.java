package com.wakeup.common.network.entity.device;

import kotlin.Metadata;

/* compiled from: ExchangeDialEntity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/wakeup/common/network/entity/device/ExchangeDialEntity;", "", "code", "", "bonus", "message", "", "<init>", "(IILjava/lang/String;)V", "getCode", "()I", "getBonus", "getMessage", "()Ljava/lang/String;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExchangeDialEntity {
    private final int bonus;
    private final int code;
    private final String message;

    public ExchangeDialEntity(int i, int i2, String str) {
        this.code = i;
        this.bonus = i2;
        this.message = str;
    }

    public final int getBonus() {
        return this.bonus;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }
}
