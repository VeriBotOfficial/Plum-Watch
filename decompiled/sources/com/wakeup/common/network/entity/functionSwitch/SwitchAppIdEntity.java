package com.wakeup.common.network.entity.functionSwitch;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SwitchAppIdEntity.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/functionSwitch/SwitchAppIdEntity;", "", "android_appId", "", "android_appKey", "ios_appId", "ios_appKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAndroid_appId", "()Ljava/lang/String;", "setAndroid_appId", "(Ljava/lang/String;)V", "getAndroid_appKey", "setAndroid_appKey", "getIos_appId", "setIos_appId", "getIos_appKey", "setIos_appKey", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchAppIdEntity {
    private String android_appId;
    private String android_appKey;
    private String ios_appId;
    private String ios_appKey;

    public SwitchAppIdEntity() {
        this(null, null, null, null, 15, null);
    }

    public SwitchAppIdEntity(String android_appId, String android_appKey, String ios_appId, String ios_appKey) {
        Intrinsics.checkNotNullParameter(android_appId, "android_appId");
        Intrinsics.checkNotNullParameter(android_appKey, "android_appKey");
        Intrinsics.checkNotNullParameter(ios_appId, "ios_appId");
        Intrinsics.checkNotNullParameter(ios_appKey, "ios_appKey");
        this.android_appId = android_appId;
        this.android_appKey = android_appKey;
        this.ios_appId = ios_appId;
        this.ios_appKey = ios_appKey;
    }

    public /* synthetic */ SwitchAppIdEntity(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public final String getAndroid_appId() {
        return this.android_appId;
    }

    public final void setAndroid_appId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.android_appId = str;
    }

    public final String getAndroid_appKey() {
        return this.android_appKey;
    }

    public final void setAndroid_appKey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.android_appKey = str;
    }

    public final String getIos_appId() {
        return this.ios_appId;
    }

    public final void setIos_appId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ios_appId = str;
    }

    public final String getIos_appKey() {
        return this.ios_appKey;
    }

    public final void setIos_appKey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ios_appKey = str;
    }
}
