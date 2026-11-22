package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/burypoint/DiabetesTrackExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "source", "", "tab", "", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()I", "setSource", "(I)V", "getTab", "()Ljava/lang/String;", "setTab", "(Ljava/lang/String;)V", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DiabetesTrackExtendInfo extends BaseExtendInfo {
    private int source;
    private String tab;

    public final int getSource() {
        return this.source;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public /* synthetic */ DiabetesTrackExtendInfo(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, str2, str3);
    }

    public final String getTab() {
        return this.tab;
    }

    public final void setTab(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tab = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiabetesTrackExtendInfo(int i, String tab, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(tab, "tab");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.source = i;
        this.tab = tab;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "DiabetesTrackExtendInfo(source=" + this.source + ", tab=" + this.tab + Separators.RPAREN;
    }
}
