package com.wakeup.howear.sharevm.adsource;

import com.wakeup.common.nativead.entity.NativeAdItemEntity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: INativeAdDataSource.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H&¨\u0006\u0012"}, d2 = {"Lcom/wakeup/howear/sharevm/adsource/INativeAdDataSource;", "", "loadAd", "Lkotlin/Result;", "Lcom/wakeup/common/nativead/entity/NativeAdItemEntity;", "placementId", "", "loadAd-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNativeAdItem", "removeNativeAd", "", "isAdReady", "", "destory", "ad", "nativeAdPositionIdToPlacementId", "position", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface INativeAdDataSource {
    void destory(NativeAdItemEntity ad);

    NativeAdItemEntity getNativeAdItem(String placementId);

    boolean isAdReady(String placementId);

    /* renamed from: loadAd-gIAlu-s */
    Object mo10283loadAdgIAlus(String str, Continuation<? super Result<NativeAdItemEntity>> continuation);

    String nativeAdPositionIdToPlacementId(String position);

    void removeNativeAd(String placementId);
}
