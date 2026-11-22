package com.wakeup.common.nativead.entity;

import android.gov.nist.core.Separators;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeAdItemEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0019\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\u0085\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001J\u0013\u0010.\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u001d\"\u0004\b\"\u0010\u001f¨\u00063"}, d2 = {"Lcom/wakeup/common/nativead/entity/NativeAdItemEntity;", "", "adId", "", "title", "description", "imageUrl", "videoView", "Landroid/view/View;", "source", "extraData", "", "hasBindListener", "", "hasRendered", "isShow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Ljava/lang/String;Ljava/util/Map;ZZZ)V", "getAdId", "()Ljava/lang/String;", "getTitle", "getDescription", "getImageUrl", "getVideoView", "()Landroid/view/View;", "getSource", "getExtraData", "()Ljava/util/Map;", "getHasBindListener", "()Z", "setHasBindListener", "(Z)V", "getHasRendered", "setHasRendered", "setShow", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NativeAdItemEntity {
    private final String adId;
    private final String description;
    private final Map<String, Object> extraData;
    private boolean hasBindListener;
    private boolean hasRendered;
    private final String imageUrl;
    private boolean isShow;
    private final String source;
    private final String title;
    private final transient View videoView;

    public static /* synthetic */ NativeAdItemEntity copy$default(NativeAdItemEntity nativeAdItemEntity, String str, String str2, String str3, String str4, View view, String str5, Map map, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeAdItemEntity.adId;
        }
        if ((i & 2) != 0) {
            str2 = nativeAdItemEntity.title;
        }
        if ((i & 4) != 0) {
            str3 = nativeAdItemEntity.description;
        }
        if ((i & 8) != 0) {
            str4 = nativeAdItemEntity.imageUrl;
        }
        if ((i & 16) != 0) {
            view = nativeAdItemEntity.videoView;
        }
        if ((i & 32) != 0) {
            str5 = nativeAdItemEntity.source;
        }
        if ((i & 64) != 0) {
            map = nativeAdItemEntity.extraData;
        }
        if ((i & 128) != 0) {
            z = nativeAdItemEntity.hasBindListener;
        }
        if ((i & 256) != 0) {
            z2 = nativeAdItemEntity.hasRendered;
        }
        if ((i & 512) != 0) {
            z3 = nativeAdItemEntity.isShow;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        Map map2 = map;
        boolean z6 = z;
        View view2 = view;
        String str6 = str5;
        return nativeAdItemEntity.copy(str, str2, str3, str4, view2, str6, map2, z6, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAdId() {
        return this.adId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final View getVideoView() {
        return this.videoView;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final Map<String, Object> component7() {
        return this.extraData;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHasBindListener() {
        return this.hasBindListener;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHasRendered() {
        return this.hasRendered;
    }

    public final NativeAdItemEntity copy(String adId, String title, String description, String imageUrl, View videoView, String source, Map<String, Object> extraData, boolean hasBindListener, boolean hasRendered, boolean isShow) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(source, "source");
        return new NativeAdItemEntity(adId, title, description, imageUrl, videoView, source, extraData, hasBindListener, hasRendered, isShow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeAdItemEntity)) {
            return false;
        }
        NativeAdItemEntity nativeAdItemEntity = (NativeAdItemEntity) other;
        return Intrinsics.areEqual(this.adId, nativeAdItemEntity.adId) && Intrinsics.areEqual(this.title, nativeAdItemEntity.title) && Intrinsics.areEqual(this.description, nativeAdItemEntity.description) && Intrinsics.areEqual(this.imageUrl, nativeAdItemEntity.imageUrl) && Intrinsics.areEqual(this.videoView, nativeAdItemEntity.videoView) && Intrinsics.areEqual(this.source, nativeAdItemEntity.source) && Intrinsics.areEqual(this.extraData, nativeAdItemEntity.extraData) && this.hasBindListener == nativeAdItemEntity.hasBindListener && this.hasRendered == nativeAdItemEntity.hasRendered && this.isShow == nativeAdItemEntity.isShow;
    }

    public int hashCode() {
        int hashCode = this.adId.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        View view = this.videoView;
        int hashCode5 = (((hashCode4 + (view == null ? 0 : view.hashCode())) * 31) + this.source.hashCode()) * 31;
        Map<String, Object> map = this.extraData;
        return ((((((hashCode5 + (map != null ? map.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasBindListener)) * 31) + Boolean.hashCode(this.hasRendered)) * 31) + Boolean.hashCode(this.isShow);
    }

    public String toString() {
        return "NativeAdItemEntity(adId=" + this.adId + ", title=" + this.title + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", videoView=" + this.videoView + ", source=" + this.source + ", extraData=" + this.extraData + ", hasBindListener=" + this.hasBindListener + ", hasRendered=" + this.hasRendered + ", isShow=" + this.isShow + Separators.RPAREN;
    }

    public NativeAdItemEntity(String adId, String str, String str2, String str3, View view, String source, Map<String, Object> map, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(source, "source");
        this.adId = adId;
        this.title = str;
        this.description = str2;
        this.imageUrl = str3;
        this.videoView = view;
        this.source = source;
        this.extraData = map;
        this.hasBindListener = z;
        this.hasRendered = z2;
        this.isShow = z3;
    }

    public final String getAdId() {
        return this.adId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final View getVideoView() {
        return this.videoView;
    }

    public final String getSource() {
        return this.source;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ NativeAdItemEntity(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, android.view.View r18, java.lang.String r19, java.util.Map r20, boolean r21, boolean r22, boolean r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 16
            if (r1 == 0) goto L9
            r1 = 0
            r7 = r1
            goto Lb
        L9:
            r7 = r18
        Lb:
            r1 = r0 & 64
            if (r1 == 0) goto L18
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
            r9 = r1
            goto L1a
        L18:
            r9 = r20
        L1a:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 0
            if (r1 == 0) goto L21
            r10 = r2
            goto L23
        L21:
            r10 = r21
        L23:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L29
            r11 = r2
            goto L2b
        L29:
            r11 = r22
        L2b:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L3a
            r12 = r2
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r8 = r19
            r2 = r13
            goto L45
        L3a:
            r12 = r23
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r8 = r19
        L45:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.nativead.entity.NativeAdItemEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.view.View, java.lang.String, java.util.Map, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final boolean getHasBindListener() {
        return this.hasBindListener;
    }

    public final void setHasBindListener(boolean z) {
        this.hasBindListener = z;
    }

    public final boolean getHasRendered() {
        return this.hasRendered;
    }

    public final void setHasRendered(boolean z) {
        this.hasRendered = z;
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public final void setShow(boolean z) {
        this.isShow = z;
    }
}
