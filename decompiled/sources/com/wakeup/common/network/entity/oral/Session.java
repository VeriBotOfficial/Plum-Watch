package com.wakeup.common.network.entity.oral;

import android.gov.nist.core.Separators;
import androidx.compose.ui.layout.LayoutKt;
import com.anythink.core.api.ATCustomRuleKeys;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.wakeup.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OralBean.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003J½\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006<"}, d2 = {"Lcom/wakeup/common/network/entity/oral/Session;", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "roomName", "customerId", "productId", "externalUserId", "externalSessionId", "status", "createdAt", "updatedAt", "endedAt", "childName", ATCustomRuleKeys.AGE, Constants.BundleKey.GRADE, "topic", "agentMemory", "Lcom/wakeup/common/network/entity/oral/AgentMemory;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/oral/AgentMemory;)V", "getSessionId", "()Ljava/lang/String;", "getRoomName", "getCustomerId", "getProductId", "getExternalUserId", "getExternalSessionId", "getStatus", "getCreatedAt", "getUpdatedAt", "getEndedAt", "getChildName", "getAge", "getGrade", "getTopic", "getAgentMemory", "()Lcom/wakeup/common/network/entity/oral/AgentMemory;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Session {
    private final String age;
    private final AgentMemory agentMemory;
    private final String childName;
    private final String createdAt;
    private final String customerId;
    private final String endedAt;
    private final String externalSessionId;
    private final String externalUserId;
    private final String grade;
    private final String productId;
    private final String roomName;
    private final String sessionId;
    private final String status;
    private final String topic;
    private final String updatedAt;

    public Session() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LayoutKt.LargeDimension, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getEndedAt() {
        return this.endedAt;
    }

    /* renamed from: component11, reason: from getter */
    public final String getChildName() {
        return this.childName;
    }

    /* renamed from: component12, reason: from getter */
    public final String getAge() {
        return this.age;
    }

    /* renamed from: component13, reason: from getter */
    public final String getGrade() {
        return this.grade;
    }

    /* renamed from: component14, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* renamed from: component15, reason: from getter */
    public final AgentMemory getAgentMemory() {
        return this.agentMemory;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getExternalUserId() {
        return this.externalUserId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getExternalSessionId() {
        return this.externalSessionId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component9, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final Session copy(String sessionId, String roomName, String customerId, String productId, String externalUserId, String externalSessionId, String status, String createdAt, String updatedAt, String endedAt, String childName, String age, String grade, String topic, AgentMemory agentMemory) {
        return new Session(sessionId, roomName, customerId, productId, externalUserId, externalSessionId, status, createdAt, updatedAt, endedAt, childName, age, grade, topic, agentMemory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Session)) {
            return false;
        }
        Session session = (Session) other;
        return Intrinsics.areEqual(this.sessionId, session.sessionId) && Intrinsics.areEqual(this.roomName, session.roomName) && Intrinsics.areEqual(this.customerId, session.customerId) && Intrinsics.areEqual(this.productId, session.productId) && Intrinsics.areEqual(this.externalUserId, session.externalUserId) && Intrinsics.areEqual(this.externalSessionId, session.externalSessionId) && Intrinsics.areEqual(this.status, session.status) && Intrinsics.areEqual(this.createdAt, session.createdAt) && Intrinsics.areEqual(this.updatedAt, session.updatedAt) && Intrinsics.areEqual(this.endedAt, session.endedAt) && Intrinsics.areEqual(this.childName, session.childName) && Intrinsics.areEqual(this.age, session.age) && Intrinsics.areEqual(this.grade, session.grade) && Intrinsics.areEqual(this.topic, session.topic) && Intrinsics.areEqual(this.agentMemory, session.agentMemory);
    }

    public int hashCode() {
        String str = this.sessionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.roomName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.externalUserId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.externalSessionId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.status;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.createdAt;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.updatedAt;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.endedAt;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.childName;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.age;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.grade;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.topic;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        AgentMemory agentMemory = this.agentMemory;
        return hashCode14 + (agentMemory != null ? agentMemory.hashCode() : 0);
    }

    public String toString() {
        return "Session(sessionId=" + this.sessionId + ", roomName=" + this.roomName + ", customerId=" + this.customerId + ", productId=" + this.productId + ", externalUserId=" + this.externalUserId + ", externalSessionId=" + this.externalSessionId + ", status=" + this.status + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", endedAt=" + this.endedAt + ", childName=" + this.childName + ", age=" + this.age + ", grade=" + this.grade + ", topic=" + this.topic + ", agentMemory=" + this.agentMemory + Separators.RPAREN;
    }

    public Session(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, AgentMemory agentMemory) {
        this.sessionId = str;
        this.roomName = str2;
        this.customerId = str3;
        this.productId = str4;
        this.externalUserId = str5;
        this.externalSessionId = str6;
        this.status = str7;
        this.createdAt = str8;
        this.updatedAt = str9;
        this.endedAt = str10;
        this.childName = str11;
        this.age = str12;
        this.grade = str13;
        this.topic = str14;
        this.agentMemory = agentMemory;
    }

    public /* synthetic */ Session(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, AgentMemory agentMemory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : agentMemory);
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getRoomName() {
        return this.roomName;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getExternalUserId() {
        return this.externalUserId;
    }

    public final String getExternalSessionId() {
        return this.externalSessionId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getEndedAt() {
        return this.endedAt;
    }

    public final String getChildName() {
        return this.childName;
    }

    public final String getAge() {
        return this.age;
    }

    public final String getGrade() {
        return this.grade;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final AgentMemory getAgentMemory() {
        return this.agentMemory;
    }
}
