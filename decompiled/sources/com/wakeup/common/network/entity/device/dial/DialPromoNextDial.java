package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import com.wakeup.common.network.entity.device.DialModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialPromoNextModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/DialPromoNextDial;", "", "id", "", "name", "", "imgUrl", "oldPrice", "newPrice", "origin", "Lcom/wakeup/common/network/entity/device/DialModel;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/device/DialModel;)V", "getId", "()I", "setId", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getImgUrl", "setImgUrl", "getOldPrice", "setOldPrice", "getNewPrice", "setNewPrice", "getOrigin", "()Lcom/wakeup/common/network/entity/device/DialModel;", "setOrigin", "(Lcom/wakeup/common/network/entity/device/DialModel;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialPromoNextDial {
    private int id;
    private String imgUrl;
    private String name;
    private String newPrice;
    private String oldPrice;
    private DialModel origin;

    public DialPromoNextDial() {
        this(0, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ DialPromoNextDial copy$default(DialPromoNextDial dialPromoNextDial, int i, String str, String str2, String str3, String str4, DialModel dialModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dialPromoNextDial.id;
        }
        if ((i2 & 2) != 0) {
            str = dialPromoNextDial.name;
        }
        if ((i2 & 4) != 0) {
            str2 = dialPromoNextDial.imgUrl;
        }
        if ((i2 & 8) != 0) {
            str3 = dialPromoNextDial.oldPrice;
        }
        if ((i2 & 16) != 0) {
            str4 = dialPromoNextDial.newPrice;
        }
        if ((i2 & 32) != 0) {
            dialModel = dialPromoNextDial.origin;
        }
        String str5 = str4;
        DialModel dialModel2 = dialModel;
        return dialPromoNextDial.copy(i, str, str2, str3, str5, dialModel2);
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
    public final String getImgUrl() {
        return this.imgUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOldPrice() {
        return this.oldPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNewPrice() {
        return this.newPrice;
    }

    /* renamed from: component6, reason: from getter */
    public final DialModel getOrigin() {
        return this.origin;
    }

    public final DialPromoNextDial copy(int id2, String name, String imgUrl, String oldPrice, String newPrice, DialModel origin) {
        return new DialPromoNextDial(id2, name, imgUrl, oldPrice, newPrice, origin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialPromoNextDial)) {
            return false;
        }
        DialPromoNextDial dialPromoNextDial = (DialPromoNextDial) other;
        return this.id == dialPromoNextDial.id && Intrinsics.areEqual(this.name, dialPromoNextDial.name) && Intrinsics.areEqual(this.imgUrl, dialPromoNextDial.imgUrl) && Intrinsics.areEqual(this.oldPrice, dialPromoNextDial.oldPrice) && Intrinsics.areEqual(this.newPrice, dialPromoNextDial.newPrice) && Intrinsics.areEqual(this.origin, dialPromoNextDial.origin);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imgUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.oldPrice;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.newPrice;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DialModel dialModel = this.origin;
        return hashCode5 + (dialModel != null ? dialModel.hashCode() : 0);
    }

    public String toString() {
        return "DialPromoNextDial(id=" + this.id + ", name=" + this.name + ", imgUrl=" + this.imgUrl + ", oldPrice=" + this.oldPrice + ", newPrice=" + this.newPrice + ", origin=" + this.origin + Separators.RPAREN;
    }

    public DialPromoNextDial(int i, String str, String str2, String str3, String str4, DialModel dialModel) {
        this.id = i;
        this.name = str;
        this.imgUrl = str2;
        this.oldPrice = str3;
        this.newPrice = str4;
        this.origin = dialModel;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ DialPromoNextDial(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, com.wakeup.common.network.entity.device.DialModel r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = r0
        L15:
            r9 = r8 & 16
            if (r9 == 0) goto L1a
            r6 = r0
        L1a:
            r8 = r8 & 32
            if (r8 == 0) goto L26
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2d
        L26:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2d:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.device.dial.DialPromoNextDial.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.wakeup.common.network.entity.device.DialModel, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
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
        this.name = str;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final void setImgUrl(String str) {
        this.imgUrl = str;
    }

    public final String getOldPrice() {
        return this.oldPrice;
    }

    public final void setOldPrice(String str) {
        this.oldPrice = str;
    }

    public final String getNewPrice() {
        return this.newPrice;
    }

    public final void setNewPrice(String str) {
        this.newPrice = str;
    }

    public final DialModel getOrigin() {
        return this.origin;
    }

    public final void setOrigin(DialModel dialModel) {
        this.origin = dialModel;
    }
}
