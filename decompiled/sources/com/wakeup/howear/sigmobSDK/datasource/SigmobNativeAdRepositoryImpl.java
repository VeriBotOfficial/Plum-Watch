package com.wakeup.howear.sigmobSDK.datasource;

import com.wakeup.common.nativead.entity.NativeAdItemEntity;
import com.wakeup.common.nativead.repository.NativeAdRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SigmobNativeAdRepositoryImpl.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/wakeup/howear/sigmobSDK/datasource/SigmobNativeAdRepositoryImpl;", "Lcom/wakeup/common/nativead/repository/NativeAdRepository;", "dataSource", "Lcom/wakeup/howear/sigmobSDK/datasource/SigmobNativeAdDataSource;", "<init>", "(Lcom/wakeup/howear/sigmobSDK/datasource/SigmobNativeAdDataSource;)V", "loadAndGetNativeEntity", "Lkotlin/Result;", "Lcom/wakeup/common/nativead/entity/NativeAdItemEntity;", "forceRefresh", "", "positionId", "", "loadAndGetNativeEntity-0E7RQCE", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entryAdScenario", "", "scenarioId", "destory", "ad", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SigmobNativeAdRepositoryImpl implements NativeAdRepository {
    private final SigmobNativeAdDataSource dataSource;

    @Override // com.wakeup.common.nativead.repository.NativeAdRepository
    public void destory(NativeAdItemEntity ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    @Override // com.wakeup.common.nativead.repository.NativeAdRepository
    public void entryAdScenario(String positionId, String scenarioId) {
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        Intrinsics.checkNotNullParameter(scenarioId, "scenarioId");
    }

    public SigmobNativeAdRepositoryImpl(SigmobNativeAdDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.wakeup.common.nativead.repository.NativeAdRepository
    /* renamed from: loadAndGetNativeEntity-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo8518loadAndGetNativeEntity0E7RQCE(boolean r3, java.lang.String r4, kotlin.coroutines.Continuation<? super kotlin.Result<com.wakeup.common.nativead.entity.NativeAdItemEntity>> r5) {
        /*
            r2 = this;
            boolean r3 = r5 instanceof com.wakeup.howear.sigmobSDK.datasource.SigmobNativeAdRepositoryImpl$loadAndGetNativeEntity$1
            if (r3 == 0) goto L14
            r3 = r5
            com.wakeup.howear.sigmobSDK.datasource.SigmobNativeAdRepositoryImpl$loadAndGetNativeEntity$1 r3 = (com.wakeup.howear.sigmobSDK.datasource.SigmobNativeAdRepositoryImpl$loadAndGetNativeEntity$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r0
            if (r4 == 0) goto L14
            int r4 = r3.label
            int r4 = r4 - r0
            r3.label = r4
            goto L19
        L14:
            com.wakeup.howear.sigmobSDK.datasource.SigmobNativeAdRepositoryImpl$loadAndGetNativeEntity$1 r3 = new com.wakeup.howear.sigmobSDK.datasource.SigmobNativeAdRepositoryImpl$loadAndGetNativeEntity$1
            r3.<init>(r2, r5)
        L19:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            kotlin.ResultKt.throwOnFailure(r4)
            goto L58
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L32:
            kotlin.ResultKt.throwOnFailure(r4)
            r3.label = r1
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            kotlinx.coroutines.CancellableContinuationImpl r4 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r3)
            r4.<init>(r0, r1)
            r4.initCancellability()
            r0 = r4
            kotlinx.coroutines.CancellableContinuation r0 = (kotlinx.coroutines.CancellableContinuation) r0
            java.lang.Object r4 = r4.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r0) goto L55
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r3)
        L55:
            if (r4 != r5) goto L58
            return r5
        L58:
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r3 = r4.getValue()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.howear.sigmobSDK.datasource.SigmobNativeAdRepositoryImpl.mo8518loadAndGetNativeEntity0E7RQCE(boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
