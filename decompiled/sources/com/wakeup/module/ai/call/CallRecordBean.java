package com.wakeup.module.ai.call;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CallRecordBean.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u001d\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010,\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u001eHÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u000bR\u001a\u0010&\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000b¨\u00061"}, d2 = {"Lcom/wakeup/module/ai/call/CallRecordBean;", "Ljava/io/Serializable;", "name", "", "createTime", "", "<init>", "(Ljava/lang/String;J)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getCreateTime", "()J", "isSelect", "", "()Z", "setSelect", "(Z)V", "filePath", "getFilePath", "setFilePath", "opusPath", "getOpusPath", "setOpusPath", "isEnd", "setEnd", "isConvert", "setConvert", "duration", "", "getDuration", "()I", "setDuration", "(I)V", "bookName", "getBookName", "setBookName", "callAsrContent", "getCallAsrContent", "setCallAsrContent", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CallRecordBean implements Serializable {
    private String bookName;
    private String callAsrContent;
    private final long createTime;
    private int duration;
    private String filePath;
    private boolean isConvert;
    private boolean isEnd;
    private boolean isSelect;
    private String name;
    private String opusPath;

    public static /* synthetic */ CallRecordBean copy$default(CallRecordBean callRecordBean, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callRecordBean.name;
        }
        if ((i & 2) != 0) {
            j = callRecordBean.createTime;
        }
        return callRecordBean.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final CallRecordBean copy(String name, long createTime) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new CallRecordBean(name, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallRecordBean)) {
            return false;
        }
        CallRecordBean callRecordBean = (CallRecordBean) other;
        return Intrinsics.areEqual(this.name, callRecordBean.name) && this.createTime == callRecordBean.createTime;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Long.hashCode(this.createTime);
    }

    public String toString() {
        return "CallRecordBean(name=" + this.name + ", createTime=" + this.createTime + Separators.RPAREN;
    }

    public CallRecordBean(String name, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.createTime = j;
        this.filePath = "";
        this.opusPath = "";
        this.duration = -1;
        this.bookName = "";
        this.callAsrContent = "";
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

    public final String getBookName() {
        return this.bookName;
    }

    public final void setBookName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bookName = str;
    }

    public final String getCallAsrContent() {
        return this.callAsrContent;
    }

    public final void setCallAsrContent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.callAsrContent = str;
    }
}
