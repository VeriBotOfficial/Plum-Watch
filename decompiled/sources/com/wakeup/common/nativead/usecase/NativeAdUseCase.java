package com.wakeup.common.nativead.usecase;

import com.wakeup.common.nativead.entity.NativeAdItemEntity;
import com.wakeup.common.nativead.repository.NativeAdRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeAdUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/nativead/usecase/NativeAdUseCase;", "", "repository", "Lcom/wakeup/common/nativead/repository/NativeAdRepository;", "<init>", "(Lcom/wakeup/common/nativead/repository/NativeAdRepository;)V", "fetchAdOrLoad", "Lkotlin/Result;", "Lcom/wakeup/common/nativead/entity/NativeAdItemEntity;", "forceRefresh", "", "positionId", "", "fetchAdOrLoad-0E7RQCE", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enterScenario", "", "scenarioId", "destory", "ad", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NativeAdUseCase {
    private final NativeAdRepository repository;

    public NativeAdUseCase(NativeAdRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: fetchAdOrLoad-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8519fetchAdOrLoad0E7RQCE(boolean r5, java.lang.String r6, kotlin.coroutines.Continuation<? super kotlin.Result<com.wakeup.common.nativead.entity.NativeAdItemEntity>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.wakeup.common.nativead.usecase.NativeAdUseCase$fetchAdOrLoad$1
            if (r0 == 0) goto L14
            r0 = r7
            com.wakeup.common.nativead.usecase.NativeAdUseCase$fetchAdOrLoad$1 r0 = (com.wakeup.common.nativead.usecase.NativeAdUseCase$fetchAdOrLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.wakeup.common.nativead.usecase.NativeAdUseCase$fetchAdOrLoad$1 r0 = new com.wakeup.common.nativead.usecase.NativeAdUseCase$fetchAdOrLoad$1
            r0.<init>(r4, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.getValue()
            return r5
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            com.wakeup.common.nativead.repository.NativeAdRepository r7 = r4.repository
            r0.label = r3
            java.lang.Object r5 = r7.mo8518loadAndGetNativeEntity0E7RQCE(r5, r6, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.nativead.usecase.NativeAdUseCase.m8519fetchAdOrLoad0E7RQCE(boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void enterScenario(String positionId, String scenarioId) {
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        Intrinsics.checkNotNullParameter(scenarioId, "scenarioId");
        this.repository.entryAdScenario(positionId, scenarioId);
    }

    public final void destory(NativeAdItemEntity ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.repository.destory(ad);
    }
}
