package com.wakeup.common.storage.memorandum;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MemorandumModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0011HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\u000f¨\u0006#"}, d2 = {"Lcom/wakeup/common/storage/memorandum/MemorandumModel;", "Ljava/io/Serializable;", "path", "", "createTime", "", "generateName", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "getPath", "()Ljava/lang/String;", "getCreateTime", "()J", "getGenerateName", "setGenerateName", "(Ljava/lang/String;)V", "duration", "", "getDuration", "()I", "setDuration", "(I)V", "convertText", "getConvertText", "setConvertText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MemorandumModel implements Serializable {
    private String convertText;
    private final long createTime;
    private int duration;
    private String generateName;
    private final String path;

    public static /* synthetic */ MemorandumModel copy$default(MemorandumModel memorandumModel, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memorandumModel.path;
        }
        if ((i & 2) != 0) {
            j = memorandumModel.createTime;
        }
        if ((i & 4) != 0) {
            str2 = memorandumModel.generateName;
        }
        return memorandumModel.copy(str, j, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGenerateName() {
        return this.generateName;
    }

    public final MemorandumModel copy(String path, long createTime, String generateName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(generateName, "generateName");
        return new MemorandumModel(path, createTime, generateName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemorandumModel)) {
            return false;
        }
        MemorandumModel memorandumModel = (MemorandumModel) other;
        return Intrinsics.areEqual(this.path, memorandumModel.path) && this.createTime == memorandumModel.createTime && Intrinsics.areEqual(this.generateName, memorandumModel.generateName);
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + Long.hashCode(this.createTime)) * 31) + this.generateName.hashCode();
    }

    public String toString() {
        return "MemorandumModel(path=" + this.path + ", createTime=" + this.createTime + ", generateName=" + this.generateName + Separators.RPAREN;
    }

    public MemorandumModel(String path, long j, String generateName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(generateName, "generateName");
        this.path = path;
        this.createTime = j;
        this.generateName = generateName;
        this.convertText = "";
    }

    public final String getPath() {
        return this.path;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getGenerateName() {
        return this.generateName;
    }

    public final void setGenerateName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.generateName = str;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final String getConvertText() {
        return this.convertText;
    }

    public final void setConvertText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.convertText = str;
    }
}
