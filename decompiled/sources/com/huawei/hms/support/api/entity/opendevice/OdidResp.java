package com.huawei.hms.support.api.entity.opendevice;

import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes14.dex */
public class OdidResp extends AbstractMessageEntity {

    /* renamed from: id, reason: collision with root package name */
    @Packed
    private String f10730id;

    public String getId() {
        return this.f10730id;
    }

    public void setId(String str) {
        this.f10730id = str;
    }
}
