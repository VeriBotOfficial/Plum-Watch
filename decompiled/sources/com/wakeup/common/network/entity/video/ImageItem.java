package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageItem.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J>\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, d2 = {"Lcom/wakeup/common/network/entity/video/ImageItem;", "Landroid/os/Parcelable;", "imageUrl", "", "imageWidth", "", "imageHigh", "sortOrder", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getImageUrl", "()Ljava/lang/String;", "getImageWidth", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getImageHigh", "getSortOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/wakeup/common/network/entity/video/ImageItem;", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ImageItem implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Long imageHigh;
    private final String imageUrl;
    private final Long imageWidth;
    private final Integer sortOrder;

    public ImageItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ImageItem copy$default(ImageItem imageItem, String str, Long l, Long l2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageItem.imageUrl;
        }
        if ((i & 2) != 0) {
            l = imageItem.imageWidth;
        }
        if ((i & 4) != 0) {
            l2 = imageItem.imageHigh;
        }
        if ((i & 8) != 0) {
            num = imageItem.sortOrder;
        }
        return imageItem.copy(str, l, l2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getImageWidth() {
        return this.imageWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getImageHigh() {
        return this.imageHigh;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    public final ImageItem copy(String imageUrl, Long imageWidth, Long imageHigh, Integer sortOrder) {
        return new ImageItem(imageUrl, imageWidth, imageHigh, sortOrder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageItem)) {
            return false;
        }
        ImageItem imageItem = (ImageItem) other;
        return Intrinsics.areEqual(this.imageUrl, imageItem.imageUrl) && Intrinsics.areEqual(this.imageWidth, imageItem.imageWidth) && Intrinsics.areEqual(this.imageHigh, imageItem.imageHigh) && Intrinsics.areEqual(this.sortOrder, imageItem.sortOrder);
    }

    public int hashCode() {
        String str = this.imageUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.imageWidth;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.imageHigh;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.sortOrder;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ImageItem(imageUrl=" + this.imageUrl + ", imageWidth=" + this.imageWidth + ", imageHigh=" + this.imageHigh + ", sortOrder=" + this.sortOrder + Separators.RPAREN;
    }

    public ImageItem(String str, Long l, Long l2, Integer num) {
        this.imageUrl = str;
        this.imageWidth = l;
        this.imageHigh = l2;
        this.sortOrder = num;
    }

    public /* synthetic */ ImageItem(String str, Long l, Long l2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? 0L : l2, (i & 8) != 0 ? 0 : num);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Long getImageWidth() {
        return this.imageWidth;
    }

    public final Long getImageHigh() {
        return this.imageHigh;
    }

    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImageItem(android.os.Parcel r6) {
        /*
            r5 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = r6.readString()
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r6.readValue(r1)
            boolean r2 = r1 instanceof java.lang.Long
            r3 = 0
            if (r2 == 0) goto L1c
            java.lang.Long r1 = (java.lang.Long) r1
            goto L1d
        L1c:
            r1 = r3
        L1d:
            java.lang.Class r2 = java.lang.Long.TYPE
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.lang.Object r2 = r6.readValue(r2)
            boolean r4 = r2 instanceof java.lang.Long
            if (r4 == 0) goto L2e
            java.lang.Long r2 = (java.lang.Long) r2
            goto L2f
        L2e:
            r2 = r3
        L2f:
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.lang.ClassLoader r4 = r4.getClassLoader()
            java.lang.Object r6 = r6.readValue(r4)
            boolean r4 = r6 instanceof java.lang.Integer
            if (r4 == 0) goto L40
            r3 = r6
            java.lang.Integer r3 = (java.lang.Integer) r3
        L40:
            r5.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.video.ImageItem.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.imageUrl);
        parcel.writeValue(this.imageWidth);
        parcel.writeValue(this.imageHigh);
        parcel.writeValue(this.sortOrder);
    }

    /* compiled from: ImageItem.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/common/network/entity/video/ImageItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/wakeup/common/network/entity/video/ImageItem;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wakeup/common/network/entity/video/ImageItem;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.wakeup.common.network.entity.video.ImageItem$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<ImageItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ImageItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageItem[] newArray(int size) {
            return new ImageItem[size];
        }
    }
}
