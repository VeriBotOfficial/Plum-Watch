package com.yandex.mobile.ads.nativeads.template.appearance;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ka1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000b\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001a\u0010\u0018\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/template/appearance/RatingAppearance;", "Landroid/os/Parcelable;", "Lcom/yandex/mobile/ads/impl/ka1;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", TokenNames.I, "getBackgroundStarColor", "backgroundStarColor", "c", "getProgressStarColor", "progressStarColor", "Builder", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RatingAppearance implements Parcelable, ka1 {
    public static final Parcelable.Creator<RatingAppearance> CREATOR = new a();

    /* renamed from: b, reason: from kotlin metadata */
    private final int backgroundStarColor;

    /* renamed from: c, reason: from kotlin metadata */
    private final int progressStarColor;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/template/appearance/RatingAppearance$Builder;", "", "Lcom/yandex/mobile/ads/nativeads/template/appearance/RatingAppearance;", "build", "()Lcom/yandex/mobile/ads/nativeads/template/appearance/RatingAppearance;", "", "backgroundStarColor", "setBackgroundStarColor", "(I)Lcom/yandex/mobile/ads/nativeads/template/appearance/RatingAppearance$Builder;", "progressStarColor", "setProgressStarColor", "<init>", "()V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private int f17600a;
        private int b;

        public final RatingAppearance build() {
            return new RatingAppearance(this.f17600a, this.b, null);
        }

        public final Builder setBackgroundStarColor(int backgroundStarColor) {
            this.f17600a = backgroundStarColor;
            return this;
        }

        public final Builder setProgressStarColor(int progressStarColor) {
            this.b = progressStarColor;
            return this;
        }
    }

    public static final class a implements Parcelable.Creator<RatingAppearance> {
        @Override // android.os.Parcelable.Creator
        public final RatingAppearance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RatingAppearance(parcel.readInt(), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAppearance[] newArray(int i) {
            return new RatingAppearance[i];
        }
    }

    public /* synthetic */ RatingAppearance(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(RatingAppearance.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance");
        RatingAppearance ratingAppearance = (RatingAppearance) other;
        return getBackgroundStarColor() == ratingAppearance.getBackgroundStarColor() && getProgressStarColor() == ratingAppearance.getProgressStarColor();
    }

    @Override // com.yandex.mobile.ads.impl.ka1
    public int getBackgroundStarColor() {
        return this.backgroundStarColor;
    }

    @Override // com.yandex.mobile.ads.impl.ka1
    public int getProgressStarColor() {
        return this.progressStarColor;
    }

    public int hashCode() {
        return getProgressStarColor() + (getBackgroundStarColor() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.backgroundStarColor);
        parcel.writeInt(this.progressStarColor);
    }

    private RatingAppearance(int i, int i2) {
        this.backgroundStarColor = i;
        this.progressStarColor = i2;
    }
}
