package com.wakeup.common.network.entity.sport;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportUploadBatchRecord.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001a\u0010%\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\u001a\u0010(\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001a\u0010+\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000f¨\u0006."}, d2 = {"Lcom/wakeup/common/network/entity/sport/SportUploadBatchRecord;", "", "<init>", "()V", "filePath", "", "getFilePath", "()Ljava/lang/String;", "setFilePath", "(Ljava/lang/String;)V", "dayNo", "", "getDayNo", "()I", "setDayNo", "(I)V", "dayNoD", "getDayNoD", "setDayNoD", "sportType", "getSportType", "setSportType", "sourceType", "getSourceType", "setSourceType", "startingTime", "", "getStartingTime", "()J", "setStartingTime", "(J)V", "repeated", "getRepeated", "setRepeated", "modified", "getModified", "setModified", "modifiedFilePath", "getModifiedFilePath", "setModifiedFilePath", "modifiedDayNo", "getModifiedDayNo", "setModifiedDayNo", "unusually", "getUnusually", "setUnusually", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class SportUploadBatchRecord {
    private int dayNo;
    private int dayNoD;
    private int modified;
    private int modifiedDayNo;
    private int repeated;
    private int sourceType;
    private int sportType;
    private long startingTime;
    private int unusually;
    private String filePath = "";
    private String modifiedFilePath = "";

    public final String getFilePath() {
        return this.filePath;
    }

    public final void setFilePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filePath = str;
    }

    public final int getDayNo() {
        return this.dayNo;
    }

    public final void setDayNo(int i) {
        this.dayNo = i;
    }

    public final int getDayNoD() {
        return this.dayNoD;
    }

    public final void setDayNoD(int i) {
        this.dayNoD = i;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final void setSourceType(int i) {
        this.sourceType = i;
    }

    public final long getStartingTime() {
        return this.startingTime;
    }

    public final void setStartingTime(long j) {
        this.startingTime = j;
    }

    public final int getRepeated() {
        return this.repeated;
    }

    public final void setRepeated(int i) {
        this.repeated = i;
    }

    public final int getModified() {
        return this.modified;
    }

    public final void setModified(int i) {
        this.modified = i;
    }

    public final String getModifiedFilePath() {
        return this.modifiedFilePath;
    }

    public final void setModifiedFilePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.modifiedFilePath = str;
    }

    public final int getModifiedDayNo() {
        return this.modifiedDayNo;
    }

    public final void setModifiedDayNo(int i) {
        this.modifiedDayNo = i;
    }

    public final int getUnusually() {
        return this.unusually;
    }

    public final void setUnusually(int i) {
        this.unusually = i;
    }
}
