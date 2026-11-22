package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/burypoint/MineModuleCampaignClickExtentInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "campaignId", "", "campaignName", "", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignId", "()I", "setCampaignId", "(I)V", "getCampaignName", "()Ljava/lang/String;", "setCampaignName", "(Ljava/lang/String;)V", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MineModuleCampaignClickExtentInfo extends BaseExtendInfo {
    private int campaignId;
    private String campaignName;

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final void setCampaignId(int i) {
        this.campaignId = i;
    }

    public final String getCampaignName() {
        return this.campaignName;
    }

    public final void setCampaignName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.campaignName = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MineModuleCampaignClickExtentInfo(int i, String campaignName, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(campaignName, "campaignName");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.campaignId = i;
        this.campaignName = campaignName;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "MineModuleCampaignClickExtentInfo(campaignId=" + this.campaignId + ", campaignName=" + this.campaignName + ", launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
