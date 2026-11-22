package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* compiled from: BiPost.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\b\u00100\u001a\u00020\u0005H\u0016J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J½\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0005HÆ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010-R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001c¨\u0006I"}, d2 = {"Lcom/wakeup/common/network/entity/video/BiPost;", "", "categoryExtend", "Lcom/google/gson/JsonObject;", "userId", "", "itemId", "action", "actionTime", "", "actionValue", "position", "originPosition", "sceneId", "expIds", "traceId", "deviceId", "latitude", "longitude", "deviceModel", "deviceOs", "country", IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "<init>", "(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategoryExtend", "()Lcom/google/gson/JsonObject;", "getUserId", "()Ljava/lang/String;", "getItemId", "getAction", "getActionTime", "()J", "getActionValue", "getPosition", "getOriginPosition", "getSceneId", "getExpIds", "getTraceId", "getDeviceId", "getLatitude", "getLongitude", "getDeviceModel", "getDeviceOs", "setDeviceOs", "(Ljava/lang/String;)V", "getCountry", "getIp", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "", "other", "hashCode", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BiPost {
    private final String action;
    private final long actionTime;
    private final String actionValue;
    private final JsonObject categoryExtend;
    private final String country;
    private final String deviceId;
    private final String deviceModel;
    private String deviceOs;
    private final String expIds;
    private final String ip;
    private final String itemId;
    private final String latitude;
    private final String longitude;
    private final String originPosition;
    private final String position;
    private final String sceneId;
    private final String traceId;
    private final String userId;

    public static /* synthetic */ BiPost copy$default(BiPost biPost, JsonObject jsonObject, String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, Object obj) {
        String str17;
        String str18;
        JsonObject jsonObject2 = (i & 1) != 0 ? biPost.categoryExtend : jsonObject;
        String str19 = (i & 2) != 0 ? biPost.userId : str;
        String str20 = (i & 4) != 0 ? biPost.itemId : str2;
        String str21 = (i & 8) != 0 ? biPost.action : str3;
        long j2 = (i & 16) != 0 ? biPost.actionTime : j;
        String str22 = (i & 32) != 0 ? biPost.actionValue : str4;
        String str23 = (i & 64) != 0 ? biPost.position : str5;
        String str24 = (i & 128) != 0 ? biPost.originPosition : str6;
        String str25 = (i & 256) != 0 ? biPost.sceneId : str7;
        String str26 = (i & 512) != 0 ? biPost.expIds : str8;
        String str27 = (i & 1024) != 0 ? biPost.traceId : str9;
        String str28 = (i & 2048) != 0 ? biPost.deviceId : str10;
        String str29 = (i & 4096) != 0 ? biPost.latitude : str11;
        JsonObject jsonObject3 = jsonObject2;
        String str30 = (i & 8192) != 0 ? biPost.longitude : str12;
        String str31 = (i & 16384) != 0 ? biPost.deviceModel : str13;
        String str32 = (i & 32768) != 0 ? biPost.deviceOs : str14;
        String str33 = (i & 65536) != 0 ? biPost.country : str15;
        if ((i & 131072) != 0) {
            str18 = str33;
            str17 = biPost.ip;
        } else {
            str17 = str16;
            str18 = str33;
        }
        return biPost.copy(jsonObject3, str19, str20, str21, j2, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str18, str17);
    }

    /* renamed from: component1, reason: from getter */
    public final JsonObject getCategoryExtend() {
        return this.categoryExtend;
    }

    /* renamed from: component10, reason: from getter */
    public final String getExpIds() {
        return this.expIds;
    }

    /* renamed from: component11, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component12, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component13, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* renamed from: component14, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* renamed from: component15, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: component16, reason: from getter */
    public final String getDeviceOs() {
        return this.deviceOs;
    }

    /* renamed from: component17, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component18, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final long getActionTime() {
        return this.actionTime;
    }

    /* renamed from: component6, reason: from getter */
    public final String getActionValue() {
        return this.actionValue;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    /* renamed from: component8, reason: from getter */
    public final String getOriginPosition() {
        return this.originPosition;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSceneId() {
        return this.sceneId;
    }

    public final BiPost copy(JsonObject categoryExtend, String userId, String itemId, String action, long actionTime, String actionValue, String position, String originPosition, String sceneId, String expIds, String traceId, String deviceId, String latitude, String longitude, String deviceModel, String deviceOs, String country, String ip) {
        Intrinsics.checkNotNullParameter(categoryExtend, "categoryExtend");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(actionValue, "actionValue");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(originPosition, "originPosition");
        Intrinsics.checkNotNullParameter(sceneId, "sceneId");
        Intrinsics.checkNotNullParameter(expIds, "expIds");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(latitude, "latitude");
        Intrinsics.checkNotNullParameter(longitude, "longitude");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceOs, "deviceOs");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(ip, "ip");
        return new BiPost(categoryExtend, userId, itemId, action, actionTime, actionValue, position, originPosition, sceneId, expIds, traceId, deviceId, latitude, longitude, deviceModel, deviceOs, country, ip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiPost)) {
            return false;
        }
        BiPost biPost = (BiPost) other;
        return Intrinsics.areEqual(this.categoryExtend, biPost.categoryExtend) && Intrinsics.areEqual(this.userId, biPost.userId) && Intrinsics.areEqual(this.itemId, biPost.itemId) && Intrinsics.areEqual(this.action, biPost.action) && this.actionTime == biPost.actionTime && Intrinsics.areEqual(this.actionValue, biPost.actionValue) && Intrinsics.areEqual(this.position, biPost.position) && Intrinsics.areEqual(this.originPosition, biPost.originPosition) && Intrinsics.areEqual(this.sceneId, biPost.sceneId) && Intrinsics.areEqual(this.expIds, biPost.expIds) && Intrinsics.areEqual(this.traceId, biPost.traceId) && Intrinsics.areEqual(this.deviceId, biPost.deviceId) && Intrinsics.areEqual(this.latitude, biPost.latitude) && Intrinsics.areEqual(this.longitude, biPost.longitude) && Intrinsics.areEqual(this.deviceModel, biPost.deviceModel) && Intrinsics.areEqual(this.deviceOs, biPost.deviceOs) && Intrinsics.areEqual(this.country, biPost.country) && Intrinsics.areEqual(this.ip, biPost.ip);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.categoryExtend.hashCode() * 31) + this.userId.hashCode()) * 31) + this.itemId.hashCode()) * 31) + this.action.hashCode()) * 31) + Long.hashCode(this.actionTime)) * 31) + this.actionValue.hashCode()) * 31) + this.position.hashCode()) * 31) + this.originPosition.hashCode()) * 31) + this.sceneId.hashCode()) * 31) + this.expIds.hashCode()) * 31) + this.traceId.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.latitude.hashCode()) * 31) + this.longitude.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.deviceOs.hashCode()) * 31) + this.country.hashCode()) * 31) + this.ip.hashCode();
    }

    public BiPost(JsonObject categoryExtend, String userId, String itemId, String action, long j, String actionValue, String position, String originPosition, String sceneId, String expIds, String traceId, String deviceId, String latitude, String longitude, String deviceModel, String deviceOs, String country, String ip) {
        Intrinsics.checkNotNullParameter(categoryExtend, "categoryExtend");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(actionValue, "actionValue");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(originPosition, "originPosition");
        Intrinsics.checkNotNullParameter(sceneId, "sceneId");
        Intrinsics.checkNotNullParameter(expIds, "expIds");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(latitude, "latitude");
        Intrinsics.checkNotNullParameter(longitude, "longitude");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceOs, "deviceOs");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(ip, "ip");
        this.categoryExtend = categoryExtend;
        this.userId = userId;
        this.itemId = itemId;
        this.action = action;
        this.actionTime = j;
        this.actionValue = actionValue;
        this.position = position;
        this.originPosition = originPosition;
        this.sceneId = sceneId;
        this.expIds = expIds;
        this.traceId = traceId;
        this.deviceId = deviceId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.deviceModel = deviceModel;
        this.deviceOs = deviceOs;
        this.country = country;
        this.ip = ip;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BiPost(com.google.gson.JsonObject r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, long r27, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r22 = this;
            r0 = r42
            r1 = r0 & 1
            if (r1 == 0) goto Ld
            com.google.gson.JsonObject r1 = new com.google.gson.JsonObject
            r1.<init>()
            r3 = r1
            goto Lf
        Ld:
            r3 = r23
        Lf:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            java.lang.String r2 = ""
            if (r1 == 0) goto L18
            r18 = r2
            goto L1a
        L18:
            r18 = r38
        L1a:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L23
            r19 = r2
            goto L25
        L23:
            r19 = r39
        L25:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L2d
            r20 = r2
            goto L2f
        L2d:
            r20 = r40
        L2f:
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L47
            com.wakeup.common.burypoint.utils.EventTrackingIPKotlinUtil r0 = com.wakeup.common.burypoint.utils.EventTrackingIPKotlinUtil.INSTANCE
            boolean r0 = r0.getVideoParam()
            if (r0 == 0) goto L43
            com.wakeup.common.burypoint.utils.EventTrackingIPKotlinUtil r0 = com.wakeup.common.burypoint.utils.EventTrackingIPKotlinUtil.INSTANCE
            java.lang.String r0 = r0.getIP()
            goto L44
        L43:
            r0 = r2
        L44:
            r21 = r0
            goto L49
        L47:
            r21 = r41
        L49:
            r2 = r22
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r2.<init>(r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.video.BiPost.<init>(com.google.gson.JsonObject, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final JsonObject getCategoryExtend() {
        return this.categoryExtend;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getAction() {
        return this.action;
    }

    public final long getActionTime() {
        return this.actionTime;
    }

    public final String getActionValue() {
        return this.actionValue;
    }

    public final String getPosition() {
        return this.position;
    }

    public final String getOriginPosition() {
        return this.originPosition;
    }

    public final String getSceneId() {
        return this.sceneId;
    }

    public final String getExpIds() {
        return this.expIds;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOs() {
        return this.deviceOs;
    }

    public final void setDeviceOs(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceOs = str;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getIp() {
        return this.ip;
    }

    public String toString() {
        return "BiPost(userId='" + this.userId + "', itemId='" + this.itemId + "', sceneId='" + this.sceneId + "',action='" + this.action + "', actionValue='" + this.actionValue + "', position='" + this.position + "', originPosition='" + this.originPosition + "',ip='" + this.ip + "',categoryExtend=" + this.categoryExtend + Separators.RPAREN;
    }
}
