package com.wakeup.common.burypoint.database;

import android.gov.nist.core.Separators;
import com.google.gson.JsonObject;
import com.wakeup.common.burypoint.CommonInfo;
import com.wakeup.howear.rn.api.burypoint.RnBuryPointApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BurryPointDbEntity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0001IBo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J\t\u0010?\u001a\u00020\u000fHÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\u0081\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u000fHÆ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u000fHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$R\u001a\u0010\u0012\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010.\"\u0004\b6\u00100¨\u0006J"}, d2 = {"Lcom/wakeup/common/burypoint/database/BurryPointDbEntity;", "", "actionId", "", RnBuryPointApi.KEY_ACTION_TYPE, RnBuryPointApi.KEY_ACTION_NAME, RnBuryPointApi.KEY_PAGE_ID, RnBuryPointApi.KEY_SOURCE_PAGE_ID, RnBuryPointApi.KEY_CURR_TIME, "", "extend", "Lcom/google/gson/JsonObject;", "common", "Lcom/wakeup/common/burypoint/CommonInfo;", "uploadStatus", "", "createTime", "lastUploadTime", "failCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/google/gson/JsonObject;Lcom/wakeup/common/burypoint/CommonInfo;IJJI)V", "getActionId", "()Ljava/lang/String;", "setActionId", "(Ljava/lang/String;)V", "getActionType", "setActionType", "getActionName", "setActionName", "getPageId", "setPageId", "getSourcePageId", "setSourcePageId", "getCurrTime", "()J", "setCurrTime", "(J)V", "getExtend", "()Lcom/google/gson/JsonObject;", "setExtend", "(Lcom/google/gson/JsonObject;)V", "getCommon", "()Lcom/wakeup/common/burypoint/CommonInfo;", "setCommon", "(Lcom/wakeup/common/burypoint/CommonInfo;)V", "getUploadStatus", "()I", "setUploadStatus", "(I)V", "getCreateTime", "setCreateTime", "getLastUploadTime", "setLastUploadTime", "getFailCount", "setFailCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BurryPointDbEntity {
    public static final int UPLOAD_STATUS_FAILED = 3;
    public static final int UPLOAD_STATUS_PENDING = 0;
    public static final int UPLOAD_STATUS_UPLOADED = 2;
    public static final int UPLOAD_STATUS_UPLOADING = 1;
    private String actionId;
    private String actionName;
    private String actionType;
    private CommonInfo common;
    private long createTime;
    private long currTime;
    private JsonObject extend;
    private int failCount;
    private long lastUploadTime;
    private String pageId;
    private String sourcePageId;
    private int uploadStatus;

    /* renamed from: component1, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* renamed from: component10, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component11, reason: from getter */
    public final long getLastUploadTime() {
        return this.lastUploadTime;
    }

    /* renamed from: component12, reason: from getter */
    public final int getFailCount() {
        return this.failCount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActionName() {
        return this.actionName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSourcePageId() {
        return this.sourcePageId;
    }

    /* renamed from: component6, reason: from getter */
    public final long getCurrTime() {
        return this.currTime;
    }

    /* renamed from: component7, reason: from getter */
    public final JsonObject getExtend() {
        return this.extend;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonInfo getCommon() {
        return this.common;
    }

    /* renamed from: component9, reason: from getter */
    public final int getUploadStatus() {
        return this.uploadStatus;
    }

    public final BurryPointDbEntity copy(String actionId, String actionType, String actionName, String pageId, String sourcePageId, long currTime, JsonObject extend, CommonInfo common, int uploadStatus, long createTime, long lastUploadTime, int failCount) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(sourcePageId, "sourcePageId");
        Intrinsics.checkNotNullParameter(extend, "extend");
        Intrinsics.checkNotNullParameter(common, "common");
        return new BurryPointDbEntity(actionId, actionType, actionName, pageId, sourcePageId, currTime, extend, common, uploadStatus, createTime, lastUploadTime, failCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BurryPointDbEntity)) {
            return false;
        }
        BurryPointDbEntity burryPointDbEntity = (BurryPointDbEntity) other;
        return Intrinsics.areEqual(this.actionId, burryPointDbEntity.actionId) && Intrinsics.areEqual(this.actionType, burryPointDbEntity.actionType) && Intrinsics.areEqual(this.actionName, burryPointDbEntity.actionName) && Intrinsics.areEqual(this.pageId, burryPointDbEntity.pageId) && Intrinsics.areEqual(this.sourcePageId, burryPointDbEntity.sourcePageId) && this.currTime == burryPointDbEntity.currTime && Intrinsics.areEqual(this.extend, burryPointDbEntity.extend) && Intrinsics.areEqual(this.common, burryPointDbEntity.common) && this.uploadStatus == burryPointDbEntity.uploadStatus && this.createTime == burryPointDbEntity.createTime && this.lastUploadTime == burryPointDbEntity.lastUploadTime && this.failCount == burryPointDbEntity.failCount;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.actionId.hashCode() * 31) + this.actionType.hashCode()) * 31) + this.actionName.hashCode()) * 31) + this.pageId.hashCode()) * 31) + this.sourcePageId.hashCode()) * 31) + Long.hashCode(this.currTime)) * 31) + this.extend.hashCode()) * 31) + this.common.hashCode()) * 31) + Integer.hashCode(this.uploadStatus)) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.lastUploadTime)) * 31) + Integer.hashCode(this.failCount);
    }

    public String toString() {
        return "BurryPointDbEntity(actionId=" + this.actionId + ", actionType=" + this.actionType + ", actionName=" + this.actionName + ", pageId=" + this.pageId + ", sourcePageId=" + this.sourcePageId + ", currTime=" + this.currTime + ", extend=" + this.extend + ", common=" + this.common + ", uploadStatus=" + this.uploadStatus + ", createTime=" + this.createTime + ", lastUploadTime=" + this.lastUploadTime + ", failCount=" + this.failCount + Separators.RPAREN;
    }

    public BurryPointDbEntity(String actionId, String actionType, String actionName, String pageId, String sourcePageId, long j, JsonObject extend, CommonInfo common, int i, long j2, long j3, int i2) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(sourcePageId, "sourcePageId");
        Intrinsics.checkNotNullParameter(extend, "extend");
        Intrinsics.checkNotNullParameter(common, "common");
        this.actionId = actionId;
        this.actionType = actionType;
        this.actionName = actionName;
        this.pageId = pageId;
        this.sourcePageId = sourcePageId;
        this.currTime = j;
        this.extend = extend;
        this.common = common;
        this.uploadStatus = i;
        this.createTime = j2;
        this.lastUploadTime = j3;
        this.failCount = i2;
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final void setActionId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.actionId = str;
    }

    public final String getActionType() {
        return this.actionType;
    }

    public final void setActionType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.actionType = str;
    }

    public final String getActionName() {
        return this.actionName;
    }

    public final void setActionName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.actionName = str;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final void setPageId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageId = str;
    }

    public final String getSourcePageId() {
        return this.sourcePageId;
    }

    public final void setSourcePageId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sourcePageId = str;
    }

    public final long getCurrTime() {
        return this.currTime;
    }

    public final void setCurrTime(long j) {
        this.currTime = j;
    }

    public final JsonObject getExtend() {
        return this.extend;
    }

    public final void setExtend(JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.extend = jsonObject;
    }

    public final CommonInfo getCommon() {
        return this.common;
    }

    public final void setCommon(CommonInfo commonInfo) {
        Intrinsics.checkNotNullParameter(commonInfo, "<set-?>");
        this.common = commonInfo;
    }

    public final int getUploadStatus() {
        return this.uploadStatus;
    }

    public final void setUploadStatus(int i) {
        this.uploadStatus = i;
    }

    public /* synthetic */ BurryPointDbEntity(String str, String str2, String str3, String str4, String str5, long j, JsonObject jsonObject, CommonInfo commonInfo, int i, long j2, long j3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, j, jsonObject, commonInfo, (i3 & 256) != 0 ? 0 : i, (i3 & 512) != 0 ? System.currentTimeMillis() : j2, (i3 & 1024) != 0 ? 0L : j3, (i3 & 2048) != 0 ? 0 : i2);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final long getLastUploadTime() {
        return this.lastUploadTime;
    }

    public final void setLastUploadTime(long j) {
        this.lastUploadTime = j;
    }

    public final int getFailCount() {
        return this.failCount;
    }

    public final void setFailCount(int i) {
        this.failCount = i;
    }
}
