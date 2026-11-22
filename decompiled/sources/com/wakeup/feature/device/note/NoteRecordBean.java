package com.wakeup.feature.device.note;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoteRecordBean.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J'\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010-\u001a\u00020\u00152\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001a\u0010\u001f\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010!\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001a\u0010#\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010\u0011¨\u00062"}, d2 = {"Lcom/wakeup/feature/device/note/NoteRecordBean;", "Ljava/io/Serializable;", "id", "", "name", "", "createTime", "", "<init>", "(ILjava/lang/String;J)V", "getId", "()I", "setId", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getCreateTime", "()J", "isSelect", "", "()Z", "setSelect", "(Z)V", "filePath", "getFilePath", "setFilePath", "opusPath", "getOpusPath", "setOpusPath", "isEnd", "setEnd", "isConvert", "setConvert", "duration", "getDuration", "setDuration", "callAsrContent", "getCallAsrContent", "setCallAsrContent", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NoteRecordBean implements Serializable {
    private String callAsrContent;
    private final long createTime;
    private int duration;
    private String filePath;
    private int id;
    private boolean isConvert;
    private boolean isEnd;
    private boolean isSelect;
    private String name;
    private String opusPath;

    public static /* synthetic */ NoteRecordBean copy$default(NoteRecordBean noteRecordBean, int i, String str, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = noteRecordBean.id;
        }
        if ((i2 & 2) != 0) {
            str = noteRecordBean.name;
        }
        if ((i2 & 4) != 0) {
            j = noteRecordBean.createTime;
        }
        return noteRecordBean.copy(i, str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final NoteRecordBean copy(int id2, String name, long createTime) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new NoteRecordBean(id2, name, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteRecordBean)) {
            return false;
        }
        NoteRecordBean noteRecordBean = (NoteRecordBean) other;
        return this.id == noteRecordBean.id && Intrinsics.areEqual(this.name, noteRecordBean.name) && this.createTime == noteRecordBean.createTime;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.createTime);
    }

    public String toString() {
        return "NoteRecordBean(id=" + this.id + ", name=" + this.name + ", createTime=" + this.createTime + Separators.RPAREN;
    }

    public NoteRecordBean(int i, String name, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.name = name;
        this.createTime = j;
        this.filePath = "";
        this.opusPath = "";
        this.duration = -1;
        this.callAsrContent = "";
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final void setFilePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filePath = str;
    }

    public final String getOpusPath() {
        return this.opusPath;
    }

    public final void setOpusPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.opusPath = str;
    }

    /* renamed from: isEnd, reason: from getter */
    public final boolean getIsEnd() {
        return this.isEnd;
    }

    public final void setEnd(boolean z) {
        this.isEnd = z;
    }

    /* renamed from: isConvert, reason: from getter */
    public final boolean getIsConvert() {
        return this.isConvert;
    }

    public final void setConvert(boolean z) {
        this.isConvert = z;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final String getCallAsrContent() {
        return this.callAsrContent;
    }

    public final void setCallAsrContent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.callAsrContent = str;
    }
}
