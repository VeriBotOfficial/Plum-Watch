package com.wakeup.howear.sigmobSDK.datasource;

import com.wakeup.common.nativead.entity.NativeAdItemEntity;
import com.wakeup.howear.sharevm.adsource.INativeAdDataSource;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SigmobNativeAdDataSource.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0016¨\u0006\u0014"}, d2 = {"Lcom/wakeup/howear/sigmobSDK/datasource/SigmobNativeAdDataSource;", "Lcom/wakeup/howear/sharevm/adsource/INativeAdDataSource;", "<init>", "()V", "loadAd", "Lkotlin/Result;", "Lcom/wakeup/common/nativead/entity/NativeAdItemEntity;", "placementId", "", "loadAd-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNativeAdItem", "removeNativeAd", "", "isAdReady", "", "destory", "ad", "nativeAdPositionIdToPlacementId", "position", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SigmobNativeAdDataSource implements INativeAdDataSource {
    @Override // com.wakeup.howear.sharevm.adsource.INativeAdDataSource
    public void destory(NativeAdItemEntity ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    @Override // com.wakeup.howear.sharevm.adsource.INativeAdDataSource
    public NativeAdItemEntity getNativeAdItem(String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return null;
    }

    @Override // com.wakeup.howear.sharevm.adsource.INativeAdDataSource
    public boolean isAdReady(String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return false;
    }

    @Override // com.wakeup.howear.sharevm.adsource.INativeAdDataSource
    public void removeNativeAd(String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
    }

    @Override // com.wakeup.howear.sharevm.adsource.INativeAdDataSource
    /* renamed from: loadAd-gIAlu-s */
    public Object mo10283loadAdgIAlus(String str, Continuation<? super Result<NativeAdItemEntity>> continuation) {
        Result.Companion companion = Result.INSTANCE;
        return Result.m14057constructorimpl(ResultKt.createFailure(new Exception("Not implemented")));
    }

    @Override // com.wakeup.howear.sharevm.adsource.INativeAdDataSource
    public String nativeAdPositionIdToPlacementId(String position) {
        Intrinsics.checkNotNullParameter(position, "position");
        return "";
    }
}
