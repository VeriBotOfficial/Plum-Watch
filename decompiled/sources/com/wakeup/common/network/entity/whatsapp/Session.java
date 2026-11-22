package com.wakeup.common.network.entity.whatsapp;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WhatsAppEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00064"}, d2 = {"Lcom/wakeup/common/network/entity/whatsapp/Session;", "", "createdAt", "", "id", "lastConnectedAt", "lastDisconnectedAt", "lastEvent", "phone", "proxy", "proxyAddress", "status", "updatedAt", "waJid", "worker", "workerNode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/String;", "getId", "getLastConnectedAt", "getLastDisconnectedAt", "getLastEvent", "getPhone", "getProxy", "getProxyAddress", "getStatus", "getUpdatedAt", "getWaJid", "getWorker", "getWorkerNode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Session {

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("id")
    private final String id;

    @SerializedName("last_connected_at")
    private final String lastConnectedAt;

    @SerializedName("last_disconnected_at")
    private final String lastDisconnectedAt;

    @SerializedName("last_event")
    private final String lastEvent;

    @SerializedName("phone")
    private final String phone;

    @SerializedName("proxy")
    private final String proxy;

    @SerializedName("proxy_address")
    private final String proxyAddress;

    @SerializedName("status")
    private final String status;

    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName("wa_jid")
    private final String waJid;

    @SerializedName("worker")
    private final String worker;

    @SerializedName("worker_node")
    private final String workerNode;

    public Session() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ Session copy$default(Session session, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
        if ((i & 1) != 0) {
            str = session.createdAt;
        }
        return session.copy(str, (i & 2) != 0 ? session.id : str2, (i & 4) != 0 ? session.lastConnectedAt : str3, (i & 8) != 0 ? session.lastDisconnectedAt : str4, (i & 16) != 0 ? session.lastEvent : str5, (i & 32) != 0 ? session.phone : str6, (i & 64) != 0 ? session.proxy : str7, (i & 128) != 0 ? session.proxyAddress : str8, (i & 256) != 0 ? session.status : str9, (i & 512) != 0 ? session.updatedAt : str10, (i & 1024) != 0 ? session.waJid : str11, (i & 2048) != 0 ? session.worker : str12, (i & 4096) != 0 ? session.workerNode : str13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component10, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component11, reason: from getter */
    public final String getWaJid() {
        return this.waJid;
    }

    /* renamed from: component12, reason: from getter */
    public final String getWorker() {
        return this.worker;
    }

    /* renamed from: component13, reason: from getter */
    public final String getWorkerNode() {
        return this.workerNode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLastConnectedAt() {
        return this.lastConnectedAt;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLastDisconnectedAt() {
        return this.lastDisconnectedAt;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLastEvent() {
        return this.lastEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component7, reason: from getter */
    public final String getProxy() {
        return this.proxy;
    }

    /* renamed from: component8, reason: from getter */
    public final String getProxyAddress() {
        return this.proxyAddress;
    }

    /* renamed from: component9, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final Session copy(String createdAt, String id2, String lastConnectedAt, String lastDisconnectedAt, String lastEvent, String phone, String proxy, String proxyAddress, String status, String updatedAt, String waJid, String worker, String workerNode) {
        return new Session(createdAt, id2, lastConnectedAt, lastDisconnectedAt, lastEvent, phone, proxy, proxyAddress, status, updatedAt, waJid, worker, workerNode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Session)) {
            return false;
        }
        Session session = (Session) other;
        return Intrinsics.areEqual(this.createdAt, session.createdAt) && Intrinsics.areEqual(this.id, session.id) && Intrinsics.areEqual(this.lastConnectedAt, session.lastConnectedAt) && Intrinsics.areEqual(this.lastDisconnectedAt, session.lastDisconnectedAt) && Intrinsics.areEqual(this.lastEvent, session.lastEvent) && Intrinsics.areEqual(this.phone, session.phone) && Intrinsics.areEqual(this.proxy, session.proxy) && Intrinsics.areEqual(this.proxyAddress, session.proxyAddress) && Intrinsics.areEqual(this.status, session.status) && Intrinsics.areEqual(this.updatedAt, session.updatedAt) && Intrinsics.areEqual(this.waJid, session.waJid) && Intrinsics.areEqual(this.worker, session.worker) && Intrinsics.areEqual(this.workerNode, session.workerNode);
    }

    public int hashCode() {
        String str = this.createdAt;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastConnectedAt;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastDisconnectedAt;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lastEvent;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phone;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.proxy;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.proxyAddress;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.status;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.updatedAt;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.waJid;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.worker;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.workerNode;
        return hashCode12 + (str13 != null ? str13.hashCode() : 0);
    }

    public String toString() {
        return "Session(createdAt=" + this.createdAt + ", id=" + this.id + ", lastConnectedAt=" + this.lastConnectedAt + ", lastDisconnectedAt=" + this.lastDisconnectedAt + ", lastEvent=" + this.lastEvent + ", phone=" + this.phone + ", proxy=" + this.proxy + ", proxyAddress=" + this.proxyAddress + ", status=" + this.status + ", updatedAt=" + this.updatedAt + ", waJid=" + this.waJid + ", worker=" + this.worker + ", workerNode=" + this.workerNode + Separators.RPAREN;
    }

    public Session(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.createdAt = str;
        this.id = str2;
        this.lastConnectedAt = str3;
        this.lastDisconnectedAt = str4;
        this.lastEvent = str5;
        this.phone = str6;
        this.proxy = str7;
        this.proxyAddress = str8;
        this.status = str9;
        this.updatedAt = str10;
        this.waJid = str11;
        this.worker = str12;
        this.workerNode = str13;
    }

    public /* synthetic */ Session(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastConnectedAt() {
        return this.lastConnectedAt;
    }

    public final String getLastDisconnectedAt() {
        return this.lastDisconnectedAt;
    }

    public final String getLastEvent() {
        return this.lastEvent;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getProxy() {
        return this.proxy;
    }

    public final String getProxyAddress() {
        return this.proxyAddress;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getWaJid() {
        return this.waJid;
    }

    public final String getWorker() {
        return this.worker;
    }

    public final String getWorkerNode() {
        return this.workerNode;
    }
}
