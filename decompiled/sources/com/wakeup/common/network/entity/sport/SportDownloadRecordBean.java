package com.wakeup.common.network.entity.sport;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportDownloadRecordBean.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/sport/SportDownloadRecordBean;", "", "<init>", "()V", "filePath", "", "getFilePath", "()Ljava/lang/String;", "setFilePath", "(Ljava/lang/String;)V", "icon", "getIcon", "setIcon", "sportTypeId", "", "getSportTypeId", "()I", "setSportTypeId", "(I)V", "startingTime", "", "getStartingTime", "()J", "setStartingTime", "(J)V", "sourceType", "getSourceType", "setSourceType", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SportDownloadRecordBean {
    private String filePath = "";
    private String icon = "";
    private int sourceType = 1;
    private int sportTypeId;
    private long startingTime;

    public final String getFilePath() {
        return this.filePath;
    }

    public final void setFilePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filePath = str;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final void setIcon(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.icon = str;
    }

    public final int getSportTypeId() {
        return this.sportTypeId;
    }

    public final void setSportTypeId(int i) {
        this.sportTypeId = i;
    }

    public final long getStartingTime() {
        return this.startingTime;
    }

    public final void setStartingTime(long j) {
        this.startingTime = j;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final void setSourceType(int i) {
        this.sourceType = i;
    }
}
