package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HSRecord.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 A2\u00020\u0001:\u0001AB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J'\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010<\u001a\u00020.2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\u0005HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\u0013R\u001a\u0010$\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000b\"\u0004\b&\u0010\u0013R\u001a\u0010'\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\u0013R\u001a\u0010*\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\u0013R\u001a\u0010-\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R\u001a\u00104\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\u001a\u00106\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010/\"\u0004\b7\u00101¨\u0006B"}, d2 = {"Lcom/wakeup/module/ai/bean/HSRecord;", "Ljava/io/Serializable;", "id", "", "type", "", "createTime", "", "<init>", "(Ljava/lang/String;IJ)V", "getId", "()Ljava/lang/String;", "getType", "()I", "getCreateTime", "()J", "customTitle", "getCustomTitle", "setCustomTitle", "(Ljava/lang/String;)V", "describe", "getDescribe", "setDescribe", "audioPath", "getAudioPath", "setAudioPath", "wavPath", "getWavPath", "setWavPath", "audioDuration", "getAudioDuration", "setAudioDuration", "(J)V", "beforeTextPath", "getBeforeTextPath", "setBeforeTextPath", "afterTextPath", "getAfterTextPath", "setAfterTextPath", "beforeText", "getBeforeText", "setBeforeText", "afterText", "getAfterText", "setAfterText", "isAudioUp", "", "()Z", "setAudioUp", "(Z)V", "isBeforeUp", "setBeforeUp", "isAfterUp", "setAfterUp", "isUpload", "setUpload", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "Companion", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HSRecord implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int TYPE_FT = 3;
    public static final int TYPE_MEETING = 5;
    public static final int TYPE_SCENE = 2;
    public static final int TYPE_SI = 1;
    public static final int TYPE_VIDEO = 4;
    private String afterText;
    private String afterTextPath;
    private long audioDuration;
    private String audioPath;
    private String beforeText;
    private String beforeTextPath;
    private final long createTime;
    private String customTitle;
    private String describe;
    private final String id;
    private boolean isAfterUp;
    private boolean isAudioUp;
    private boolean isBeforeUp;
    private boolean isUpload;
    private final int type;
    private String wavPath;

    public static /* synthetic */ HSRecord copy$default(HSRecord hSRecord, String str, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hSRecord.id;
        }
        if ((i2 & 2) != 0) {
            i = hSRecord.type;
        }
        if ((i2 & 4) != 0) {
            j = hSRecord.createTime;
        }
        return hSRecord.copy(str, i, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final HSRecord copy(String id2, int type, long createTime) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new HSRecord(id2, type, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HSRecord)) {
            return false;
        }
        HSRecord hSRecord = (HSRecord) other;
        return Intrinsics.areEqual(this.id, hSRecord.id) && this.type == hSRecord.type && this.createTime == hSRecord.createTime;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + Integer.hashCode(this.type)) * 31) + Long.hashCode(this.createTime);
    }

    public String toString() {
        return "HSRecord(id=" + this.id + ", type=" + this.type + ", createTime=" + this.createTime + Separators.RPAREN;
    }

    public HSRecord(String id2, int i, long j) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.type = i;
        this.createTime = j;
        this.customTitle = "";
        this.describe = "";
        this.audioPath = "";
        this.wavPath = "";
        this.audioDuration = -1L;
        this.beforeTextPath = "";
        this.afterTextPath = "";
        this.beforeText = "";
        this.afterText = "";
        this.isUpload = this.isAudioUp && this.isBeforeUp && this.isAfterUp;
    }

    public final String getId() {
        return this.id;
    }

    public final int getType() {
        return this.type;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    /* compiled from: HSRecord.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/wakeup/module/ai/bean/HSRecord$Companion;", "", "<init>", "()V", "TYPE_SI", "", "TYPE_SCENE", "TYPE_FT", "TYPE_VIDEO", "TYPE_MEETING", "generateId", "", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String generateId() {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            return uuid;
        }
    }

    public final String getCustomTitle() {
        return this.customTitle;
    }

    public final void setCustomTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customTitle = str;
    }

    public final String getDescribe() {
        return this.describe;
    }

    public final void setDescribe(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.describe = str;
    }

    public final String getAudioPath() {
        return this.audioPath;
    }

    public final void setAudioPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.audioPath = str;
    }

    public final String getWavPath() {
        return this.wavPath;
    }

    public final void setWavPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wavPath = str;
    }

    public final long getAudioDuration() {
        return this.audioDuration;
    }

    public final void setAudioDuration(long j) {
        this.audioDuration = j;
    }

    public final String getBeforeTextPath() {
        return this.beforeTextPath;
    }

    public final void setBeforeTextPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.beforeTextPath = str;
    }

    public final String getAfterTextPath() {
        return this.afterTextPath;
    }

    public final void setAfterTextPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.afterTextPath = str;
    }

    public final String getBeforeText() {
        return this.beforeText;
    }

    public final void setBeforeText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.beforeText = str;
    }

    public final String getAfterText() {
        return this.afterText;
    }

    public final void setAfterText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.afterText = str;
    }

    /* renamed from: isAudioUp, reason: from getter */
    public final boolean getIsAudioUp() {
        return this.isAudioUp;
    }

    public final void setAudioUp(boolean z) {
        this.isAudioUp = z;
    }

    /* renamed from: isBeforeUp, reason: from getter */
    public final boolean getIsBeforeUp() {
        return this.isBeforeUp;
    }

    public final void setBeforeUp(boolean z) {
        this.isBeforeUp = z;
    }

    /* renamed from: isAfterUp, reason: from getter */
    public final boolean getIsAfterUp() {
        return this.isAfterUp;
    }

    public final void setAfterUp(boolean z) {
        this.isAfterUp = z;
    }

    /* renamed from: isUpload, reason: from getter */
    public final boolean getIsUpload() {
        return this.isUpload;
    }

    public final void setUpload(boolean z) {
        this.isUpload = z;
    }
}
