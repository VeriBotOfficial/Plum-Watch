package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "args", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommonAdViewerExposedFunctionsKt$setOrientation$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;

    CommonAdViewerExposedFunctionsKt$setOrientation$1(AdObject adObject) {
        this.$adObject = adObject;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(objArr, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke2(java.lang.Object[] r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1
            if (r0 == 0) goto L14
            r0 = r8
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L67
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = 0
            r7 = r7[r8]
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.INSTANCE
            kotlinx.coroutines.flow.MutableSharedFlow r8 = r8.getDisplayMessages()
            com.unity3d.ads.adplayer.DisplayMessage$SetOrientation r2 = new com.unity3d.ads.adplayer.DisplayMessage$SetOrientation
            com.unity3d.ads.core.data.model.AdObject r4 = r6.$adObject
            com.google.protobuf.ByteString r4 = r4.getOpportunityId()
            java.lang.String r4 = r4.toStringUtf8()
            java.lang.String r5 = "adObject.opportunityId.toStringUtf8()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r2.<init>(r4, r7)
            r0.label = r3
            java.lang.Object r7 = r8.emit(r2, r0)
            if (r7 != r1) goto L67
            return r1
        L67:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1.invoke2(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
