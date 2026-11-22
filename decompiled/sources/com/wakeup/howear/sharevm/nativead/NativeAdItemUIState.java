package com.wakeup.howear.sharevm.nativead;

import android.gov.nist.core.Separators;
import com.wakeup.common.nativead.entity.NativeAdItemEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeAdItemUIState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/wakeup/howear/sharevm/nativead/NativeAdItemUIState;", "", "<init>", "()V", "Loading", "Success", "Error", "Empty", "Lcom/wakeup/howear/sharevm/nativead/NativeAdItemUIState$Empty;", "Lcom/wakeup/howear/sharevm/nativead/NativeAdItemUIState$Error;", "Lcom/wakeup/howear/sharevm/nativead/NativeAdItemUIState$Loading;", "Lcom/wakeup/howear/sharevm/nativead/NativeAdItemUIState$Success;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class NativeAdItemUIState {
    public /* synthetic */ NativeAdItemUIState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NativeAdItemUIState() {
    }

    /* compiled from: NativeAdItemUIState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/wakeup/howear/sharevm/nativead/NativeAdItemUIState$Loading;", "Lcom/wakeup/howear/sharevm/nativead/NativeAdItemUIState;", "<init>", "()V", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends NativeAdItemUIState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: NativeAdItemUIState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/wakeup/howear/sharevm/nativead/NativeAdItemUIState$Success;", "Lcom/wakeup/howear/sharevm/nativead/NativeAdItemUIState;", "ad", "Lcom/wakeup/common/nativead/entity/NativeAdItemEntity;", "<init>", "(Lcom/wakeup/common/nativead/entity/NativeAdItemEntity;)V", "getAd", "()Lcom/wakeup/common/nativead/entity/NativeAdItemEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends NativeAdItemUIState {
        private final NativeAdItemEntity ad;

        public static /* synthetic */ Success copy$default(Success success, NativeAdItemEntity nativeAdItemEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                nativeAdItemEntity = success.ad;
            }
            return success.copy(nativeAdItemEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final NativeAdItemEntity getAd() {
            return this.ad;
        }

        public final Success copy(NativeAdItemEntity ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            return new Success(ad);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.ad, ((Success) other).ad);
        }

        public int hashCode() {
            return this.ad.hashCode();
        }

        public String toString() {
            return "Success(ad=" + this.ad + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(NativeAdItemEntity ad) {
            super(null);
            Intrinsics.checkNotNullParameter(ad, "ad");
            this.ad = ad;
        }

        public final NativeAdItemEntity getAd() {
            return this.ad;
        }
    }

    /* compiled from: NativeAdItemUIState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/wakeup/howear/sharevm/nativead/NativeAdItemUIState$Error;", "Lcom/wakeup/howear/sharevm/nativead/NativeAdItemUIState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends NativeAdItemUIState {
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: NativeAdItemUIState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/wakeup/howear/sharevm/nativead/NativeAdItemUIState$Empty;", "Lcom/wakeup/howear/sharevm/nativead/NativeAdItemUIState;", "<init>", "()V", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Empty extends NativeAdItemUIState {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
            super(null);
        }
    }
}
