package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/burypoint/MyAppExposureExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "type", "", "myAppId", "my_app_name", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getMyAppId", "setMyAppId", "getMy_app_name", "setMy_app_name", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MyAppExposureExtendInfo extends BaseExtendInfo {
    private String myAppId;
    private String my_app_name;
    private String type;

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final String getMyAppId() {
        return this.myAppId;
    }

    public final void setMyAppId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.myAppId = str;
    }

    public final String getMy_app_name() {
        return this.my_app_name;
    }

    public final void setMy_app_name(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.my_app_name = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyAppExposureExtendInfo(String type, String myAppId, String my_app_name, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(myAppId, "myAppId");
        Intrinsics.checkNotNullParameter(my_app_name, "my_app_name");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.type = type;
        this.myAppId = myAppId;
        this.my_app_name = my_app_name;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "MyAppExposureExtendInfo(type=" + this.type + ", myAppId=" + this.myAppId + ", my_app_name=" + this.my_app_name + ", launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
