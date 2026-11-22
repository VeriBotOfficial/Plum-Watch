package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.om.GetOmData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommonAdViewerExposedFunctionsKt$omGetData$1 implements ExposedFunction {
    final /* synthetic */ GetOmData $getOmData;

    CommonAdViewerExposedFunctionsKt$omGetData$1(GetOmData getOmData) {
        this.$getOmData = getOmData;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(objArr, (Continuation<Object>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke2(java.lang.Object[] r4, kotlin.coroutines.Continuation<java.lang.Object> r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1
            if (r4 == 0) goto L14
            r4 = r5
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L14
            int r5 = r4.label
            int r5 = r5 - r1
            r4.label = r5
            goto L19
        L14:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1
            r4.<init>(r3, r5)
        L19:
            java.lang.Object r5 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            com.unity3d.ads.core.domain.om.GetOmData r5 = r3.$getOmData
            r4.label = r2
            java.lang.Object r5 = r5.invoke(r4)
            if (r5 != r0) goto L40
            return r0
        L40:
            com.unity3d.ads.core.data.model.OMData r5 = (com.unity3d.ads.core.data.model.OMData) r5
            java.util.Map r4 = kotlin.collections.MapsKt.createMapBuilder()
            java.lang.String r0 = "version"
            java.lang.String r1 = r5.getVersion()
            r4.put(r0, r1)
            java.lang.String r0 = "partnerName"
            java.lang.String r1 = r5.getPartnerName()
            r4.put(r0, r1)
            java.lang.String r0 = "partnerVersion"
            java.lang.String r5 = r5.getPartnerVersion()
            r4.put(r0, r5)
            java.util.Map r4 = kotlin.collections.MapsKt.build(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1.invoke2(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
