package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001f\u001a\u00020\u0003H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019¨\u0006 "}, d2 = {"Lcom/wakeup/common/burypoint/EquipmentPageWatchExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "classifyID", "", "watchDialReID", "watchDialReName", "watchDialRePosition", "", "expIds", "from", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getClassifyID", "()Ljava/lang/String;", "setClassifyID", "(Ljava/lang/String;)V", "getWatchDialReID", "setWatchDialReID", "getWatchDialReName", "setWatchDialReName", "getWatchDialRePosition", "()Ljava/lang/Integer;", "setWatchDialRePosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getExpIds", "setExpIds", "getFrom", "setFrom", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EquipmentPageWatchExtendInfo extends BaseExtendInfo {
    private String classifyID;
    private String expIds;
    private Integer from;
    private String watchDialReID;
    private String watchDialReName;
    private Integer watchDialRePosition;

    public final String getClassifyID() {
        return this.classifyID;
    }

    public final void setClassifyID(String str) {
        this.classifyID = str;
    }

    public final String getWatchDialReID() {
        return this.watchDialReID;
    }

    public final void setWatchDialReID(String str) {
        this.watchDialReID = str;
    }

    public final String getWatchDialReName() {
        return this.watchDialReName;
    }

    public final void setWatchDialReName(String str) {
        this.watchDialReName = str;
    }

    public final Integer getWatchDialRePosition() {
        return this.watchDialRePosition;
    }

    public final void setWatchDialRePosition(Integer num) {
        this.watchDialRePosition = num;
    }

    public final String getExpIds() {
        return this.expIds;
    }

    public final void setExpIds(String str) {
        this.expIds = str;
    }

    public final Integer getFrom() {
        return this.from;
    }

    public final void setFrom(Integer num) {
        this.from = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquipmentPageWatchExtendInfo(String str, String str2, String str3, Integer num, String str4, Integer num2, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.classifyID = str;
        this.watchDialReID = str2;
        this.watchDialReName = str3;
        this.watchDialRePosition = num;
        this.expIds = str4;
        this.from = num2;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "EquipmentPageWatchExtendInfo(classifyID=" + this.classifyID + ",watchDialReID=" + this.watchDialReID + ", watchDialReName=" + this.watchDialReName + ", watchDialRePosition=" + this.watchDialRePosition + ",expIds=" + this.expIds + ",from=" + this.from + Separators.RPAREN;
    }
}
