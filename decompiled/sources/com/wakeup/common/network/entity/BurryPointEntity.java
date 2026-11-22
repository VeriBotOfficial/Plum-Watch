package com.wakeup.common.network.entity;

import android.gov.nist.core.Separators;
import com.google.gson.JsonObject;
import com.wakeup.common.burypoint.CommonInfo;
import com.wakeup.howear.rn.api.burypoint.RnBuryPointApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BurryPointEntity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010(\u001a\u00020\u0003H\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003JY\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00067"}, d2 = {"Lcom/wakeup/common/network/entity/BurryPointEntity;", "", "actionId", "", RnBuryPointApi.KEY_ACTION_TYPE, RnBuryPointApi.KEY_ACTION_NAME, RnBuryPointApi.KEY_PAGE_ID, RnBuryPointApi.KEY_SOURCE_PAGE_ID, RnBuryPointApi.KEY_CURR_TIME, "", "extend", "Lcom/google/gson/JsonObject;", "common", "Lcom/wakeup/common/burypoint/CommonInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/google/gson/JsonObject;Lcom/wakeup/common/burypoint/CommonInfo;)V", "getActionId", "()Ljava/lang/String;", "setActionId", "(Ljava/lang/String;)V", "getActionType", "setActionType", "getActionName", "setActionName", "getPageId", "setPageId", "getSourcePageId", "setSourcePageId", "getCurrTime", "()J", "setCurrTime", "(J)V", "getExtend", "()Lcom/google/gson/JsonObject;", "setExtend", "(Lcom/google/gson/JsonObject;)V", "getCommon", "()Lcom/wakeup/common/burypoint/CommonInfo;", "setCommon", "(Lcom/wakeup/common/burypoint/CommonInfo;)V", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BurryPointEntity {
    private String actionId;
    private String actionName;
    private String actionType;
    private CommonInfo common;
    private long currTime;
    private JsonObject extend;
    private String pageId;
    private String sourcePageId;

    public static /* synthetic */ BurryPointEntity copy$default(BurryPointEntity burryPointEntity, String str, String str2, String str3, String str4, String str5, long j, JsonObject jsonObject, CommonInfo commonInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = burryPointEntity.actionId;
        }
        if ((i & 2) != 0) {
            str2 = burryPointEntity.actionType;
        }
        if ((i & 4) != 0) {
            str3 = burryPointEntity.actionName;
        }
        if ((i & 8) != 0) {
            str4 = burryPointEntity.pageId;
        }
        if ((i & 16) != 0) {
            str5 = burryPointEntity.sourcePageId;
        }
        if ((i & 32) != 0) {
            j = burryPointEntity.currTime;
        }
        if ((i & 64) != 0) {
            jsonObject = burryPointEntity.extend;
        }
        if ((i & 128) != 0) {
            commonInfo = burryPointEntity.common;
        }
        long j2 = j;
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        return burryPointEntity.copy(str, str2, str8, str6, str7, j2, jsonObject, commonInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final String getActionId() {
        return this.actionId;
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

    public final BurryPointEntity copy(String actionId, String actionType, String actionName, String pageId, String sourcePageId, long currTime, JsonObject extend, CommonInfo common) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(sourcePageId, "sourcePageId");
        Intrinsics.checkNotNullParameter(extend, "extend");
        Intrinsics.checkNotNullParameter(common, "common");
        return new BurryPointEntity(actionId, actionType, actionName, pageId, sourcePageId, currTime, extend, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BurryPointEntity)) {
            return false;
        }
        BurryPointEntity burryPointEntity = (BurryPointEntity) other;
        return Intrinsics.areEqual(this.actionId, burryPointEntity.actionId) && Intrinsics.areEqual(this.actionType, burryPointEntity.actionType) && Intrinsics.areEqual(this.actionName, burryPointEntity.actionName) && Intrinsics.areEqual(this.pageId, burryPointEntity.pageId) && Intrinsics.areEqual(this.sourcePageId, burryPointEntity.sourcePageId) && this.currTime == burryPointEntity.currTime && Intrinsics.areEqual(this.extend, burryPointEntity.extend) && Intrinsics.areEqual(this.common, burryPointEntity.common);
    }

    public int hashCode() {
        return (((((((((((((this.actionId.hashCode() * 31) + this.actionType.hashCode()) * 31) + this.actionName.hashCode()) * 31) + this.pageId.hashCode()) * 31) + this.sourcePageId.hashCode()) * 31) + Long.hashCode(this.currTime)) * 31) + this.extend.hashCode()) * 31) + this.common.hashCode();
    }

    public BurryPointEntity(String actionId, String actionType, String actionName, String pageId, String sourcePageId, long j, JsonObject extend, CommonInfo common) {
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

    public String toString() {
        return "BurryPointEntity(actionId='" + this.actionId + "', actionType='" + this.actionType + "', actionName='" + this.actionName + "', pageId='" + this.pageId + "', sourcePageId='" + this.sourcePageId + "', currTime=" + this.currTime + ", extend=" + this.extend + ", common=" + this.common + Separators.RPAREN;
    }
}
