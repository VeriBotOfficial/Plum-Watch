package com.xmly.businesssdk.network.bean;

import android.util.LongSparseArray;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.network.constant.PayConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pay.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/xmly/businesssdk/network/bean/PayResult;", "", "payType", "", "payContent", "(Ljava/lang/String;Ljava/lang/String;)V", "isH5PagePayCallback", "", "()Z", "setH5PagePayCallback", "(Z)V", "getPayContent", "()Ljava/lang/String;", "getPayType", "AlbumPayResult", "TracksPayResult", "VipPayResult", "Lcom/xmly/businesssdk/network/bean/PayResult$AlbumPayResult;", "Lcom/xmly/businesssdk/network/bean/PayResult$TracksPayResult;", "Lcom/xmly/businesssdk/network/bean/PayResult$VipPayResult;", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PayResult {
    private boolean isH5PagePayCallback;
    private final String payContent;
    private final String payType;

    /* compiled from: Pay.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/xmly/businesssdk/network/bean/PayResult$AlbumPayResult;", "Lcom/xmly/businesssdk/network/bean/PayResult;", "albumId", "", "payResult", "", "(Ljava/lang/String;Z)V", "getAlbumId", "()Ljava/lang/String;", "getPayResult", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class AlbumPayResult extends PayResult {
        private final String albumId;
        private final boolean payResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlbumPayResult(String albumId, boolean z) {
            super(PayConst.PAY_ALBUM, albumId, null);
            Intrinsics.checkNotNullParameter(albumId, "albumId");
            this.albumId = albumId;
            this.payResult = z;
        }

        public static /* synthetic */ AlbumPayResult copy$default(AlbumPayResult albumPayResult, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = albumPayResult.albumId;
            }
            if ((i & 2) != 0) {
                z = albumPayResult.payResult;
            }
            return albumPayResult.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAlbumId() {
            return this.albumId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getPayResult() {
            return this.payResult;
        }

        public final AlbumPayResult copy(String albumId, boolean payResult) {
            Intrinsics.checkNotNullParameter(albumId, "albumId");
            return new AlbumPayResult(albumId, payResult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlbumPayResult)) {
                return false;
            }
            AlbumPayResult albumPayResult = (AlbumPayResult) other;
            return Intrinsics.areEqual(this.albumId, albumPayResult.albumId) && this.payResult == albumPayResult.payResult;
        }

        public final String getAlbumId() {
            return this.albumId;
        }

        public final boolean getPayResult() {
            return this.payResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.albumId.hashCode() * 31;
            boolean z = this.payResult;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            return c.a("AlbumPayResult(albumId=").append(this.albumId).append(", payResult=").append(this.payResult).append(')').toString();
        }
    }

    /* compiled from: Pay.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xmly/businesssdk/network/bean/PayResult$TracksPayResult;", "Lcom/xmly/businesssdk/network/bean/PayResult;", "trackId", "", "payResults", "Landroid/util/LongSparseArray;", "", "(Ljava/lang/String;Landroid/util/LongSparseArray;)V", "getPayResults", "()Landroid/util/LongSparseArray;", "getTrackId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class TracksPayResult extends PayResult {
        private final LongSparseArray<Boolean> payResults;
        private final String trackId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TracksPayResult(String trackId, LongSparseArray<Boolean> payResults) {
            super(PayConst.PAY_TRACK, trackId, null);
            Intrinsics.checkNotNullParameter(trackId, "trackId");
            Intrinsics.checkNotNullParameter(payResults, "payResults");
            this.trackId = trackId;
            this.payResults = payResults;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TracksPayResult copy$default(TracksPayResult tracksPayResult, String str, LongSparseArray longSparseArray, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tracksPayResult.trackId;
            }
            if ((i & 2) != 0) {
                longSparseArray = tracksPayResult.payResults;
            }
            return tracksPayResult.copy(str, longSparseArray);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTrackId() {
            return this.trackId;
        }

        public final LongSparseArray<Boolean> component2() {
            return this.payResults;
        }

        public final TracksPayResult copy(String trackId, LongSparseArray<Boolean> payResults) {
            Intrinsics.checkNotNullParameter(trackId, "trackId");
            Intrinsics.checkNotNullParameter(payResults, "payResults");
            return new TracksPayResult(trackId, payResults);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TracksPayResult)) {
                return false;
            }
            TracksPayResult tracksPayResult = (TracksPayResult) other;
            return Intrinsics.areEqual(this.trackId, tracksPayResult.trackId) && Intrinsics.areEqual(this.payResults, tracksPayResult.payResults);
        }

        public final LongSparseArray<Boolean> getPayResults() {
            return this.payResults;
        }

        public final String getTrackId() {
            return this.trackId;
        }

        public int hashCode() {
            return this.payResults.hashCode() + (this.trackId.hashCode() * 31);
        }

        public String toString() {
            return c.a("TracksPayResult(trackId=").append(this.trackId).append(", payResults=").append(this.payResults).append(')').toString();
        }
    }

    /* compiled from: Pay.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/xmly/businesssdk/network/bean/PayResult$VipPayResult;", "Lcom/xmly/businesssdk/network/bean/PayResult;", "skuId", "", "payResult", "", "(Ljava/lang/String;Z)V", "getPayResult", "()Z", "getSkuId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class VipPayResult extends PayResult {
        private final boolean payResult;
        private final String skuId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VipPayResult(String skuId, boolean z) {
            super(PayConst.PAY_VIP, skuId, null);
            Intrinsics.checkNotNullParameter(skuId, "skuId");
            this.skuId = skuId;
            this.payResult = z;
        }

        public static /* synthetic */ VipPayResult copy$default(VipPayResult vipPayResult, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = vipPayResult.skuId;
            }
            if ((i & 2) != 0) {
                z = vipPayResult.payResult;
            }
            return vipPayResult.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSkuId() {
            return this.skuId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getPayResult() {
            return this.payResult;
        }

        public final VipPayResult copy(String skuId, boolean payResult) {
            Intrinsics.checkNotNullParameter(skuId, "skuId");
            return new VipPayResult(skuId, payResult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VipPayResult)) {
                return false;
            }
            VipPayResult vipPayResult = (VipPayResult) other;
            return Intrinsics.areEqual(this.skuId, vipPayResult.skuId) && this.payResult == vipPayResult.payResult;
        }

        public final boolean getPayResult() {
            return this.payResult;
        }

        public final String getSkuId() {
            return this.skuId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.skuId.hashCode() * 31;
            boolean z = this.payResult;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            return c.a("VipPayResult(skuId=").append(this.skuId).append(", payResult=").append(this.payResult).append(')').toString();
        }
    }

    private PayResult(String str, String str2) {
        this.payType = str;
        this.payContent = str2;
    }

    public /* synthetic */ PayResult(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String getPayContent() {
        return this.payContent;
    }

    public final String getPayType() {
        return this.payType;
    }

    /* renamed from: isH5PagePayCallback, reason: from getter */
    public final boolean getIsH5PagePayCallback() {
        return this.isH5PagePayCallback;
    }

    public final void setH5PagePayCallback(boolean z) {
        this.isH5PagePayCallback = z;
    }
}
