package com.umeng.commonsdk.statistics.common;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public enum DeviceTypeEnum {
    IMEI(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.o, com.qumeng.overseas.advlib.__remote__.core.coreutils.a.o),
    OAID("oaid", "oaid"),
    ANDROIDID("android_id", "android_id"),
    MAC("mac", "mac"),
    SERIALNO("serial_no", "serial_no"),
    IDFA(com.anythink.expressad.foundation.g.a.bn, com.anythink.expressad.foundation.g.a.bn),
    DEFAULT(AbstractJsonLexerKt.NULL, AbstractJsonLexerKt.NULL);

    private String description;
    private String deviceIdType;

    DeviceTypeEnum(String str, String str2) {
        this.deviceIdType = str;
        this.description = str2;
    }

    public String getDeviceIdType() {
        return this.deviceIdType;
    }

    public String getDescription() {
        return this.description;
    }
}
