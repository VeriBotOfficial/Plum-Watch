package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "args", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommonAdViewerExposedFunctionsKt$loadScarAd$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ LoadScarAd $loadScarAd;

    CommonAdViewerExposedFunctionsKt$loadScarAd$1(AdObject adObject, LoadScarAd loadScarAd) {
        this.$adObject = adObject;
        this.$loadScarAd = loadScarAd;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(objArr, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke2(java.lang.Object[] r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1
            if (r0 == 0) goto L14
            r0 = r13
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1
            r0.<init>(r11, r13)
        L19:
            r8 = r0
            java.lang.Object r13 = r8.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.ResultKt.throwOnFailure(r13)
            goto L9a
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = 0
            r12 = r12[r13]
            java.lang.String r13 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12, r13)
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            java.lang.String r13 = "type"
            java.lang.String r13 = r12.optString(r13)
            java.lang.String r1 = "adUnitId"
            java.lang.String r4 = r12.optString(r1)
            java.lang.String r3 = "adString"
            java.lang.String r5 = r12.optString(r3)
            java.lang.String r6 = "queryId"
            r7 = r6
            java.lang.String r6 = r12.optString(r7)
            java.lang.String r9 = "videoLength"
            int r12 = r12.optInt(r9)
            com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
            r9.setScarAd(r2)
            com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
            r9.setScarAdUnitId(r4)
            com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
            r9.setScarQueryId(r6)
            com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
            r9.setScarAdString(r5)
            r9 = r1
            com.unity3d.ads.core.domain.scar.LoadScarAd r1 = r11.$loadScarAd
            java.lang.String r10 = "adType"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r10)
            com.unity3d.ads.core.data.model.AdObject r10 = r11.$adObject
            java.lang.String r10 = r10.getPlacementId()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r8.label = r2
            r7 = r12
            r2 = r13
            r3 = r10
            java.lang.Object r12 = r1.invoke(r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L9a
            return r0
        L9a:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1.invoke2(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
