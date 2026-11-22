package io.livekit.android.token;

import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CachingTokenSource.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012<\u0010\u0006\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007j\u0002`\u000f¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lio/livekit/android/token/CachingFixedTokenSource;", "Lio/livekit/android/token/BaseCachingTokenSource;", "Lio/livekit/android/token/FixedTokenSource;", "source", "store", "Lio/livekit/android/token/TokenStore;", "validator", "Lkotlin/Function2;", "Lio/livekit/android/token/TokenRequestOptions;", "Lkotlin/ParameterName;", "name", ApiConstants.OPTIONS, "Lio/livekit/android/token/TokenSourceResponse;", "response", "", "Lio/livekit/android/token/TokenValidator;", "(Lio/livekit/android/token/FixedTokenSource;Lio/livekit/android/token/TokenStore;Lkotlin/jvm/functions/Function2;)V", "fetch", "Lkotlin/Result;", "fetch-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFromSource", "fetchFromSource-gIAlu-s", "(Lio/livekit/android/token/TokenRequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CachingFixedTokenSource extends BaseCachingTokenSource implements FixedTokenSource {
    private final FixedTokenSource source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachingFixedTokenSource(FixedTokenSource source, TokenStore store, Function2<? super TokenRequestOptions, ? super TokenSourceResponse, Boolean> validator) {
        super(store, validator);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.source = source;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.livekit.android.token.BaseCachingTokenSource
    /* renamed from: fetchFromSource-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo13955fetchFromSourcegIAlus(io.livekit.android.token.TokenRequestOptions r4, kotlin.coroutines.Continuation<? super kotlin.Result<io.livekit.android.token.TokenSourceResponse>> r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof io.livekit.android.token.CachingFixedTokenSource$fetchFromSource$1
            if (r4 == 0) goto L14
            r4 = r5
            io.livekit.android.token.CachingFixedTokenSource$fetchFromSource$1 r4 = (io.livekit.android.token.CachingFixedTokenSource$fetchFromSource$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L14
            int r5 = r4.label
            int r5 = r5 - r1
            r4.label = r5
            goto L19
        L14:
            io.livekit.android.token.CachingFixedTokenSource$fetchFromSource$1 r4 = new io.livekit.android.token.CachingFixedTokenSource$fetchFromSource$1
            r4.<init>(r3, r5)
        L19:
            java.lang.Object r5 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r4 = r5.getValue()
            return r4
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.ResultKt.throwOnFailure(r5)
            io.livekit.android.token.FixedTokenSource r5 = r3.source
            r4.label = r2
            java.lang.Object r4 = r5.mo13958fetchIoAF18A(r4)
            if (r4 != r0) goto L46
            return r0
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.token.CachingFixedTokenSource.mo13955fetchFromSourcegIAlus(io.livekit.android.token.TokenRequestOptions, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.livekit.android.token.FixedTokenSource
    /* renamed from: fetch-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo13958fetchIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<io.livekit.android.token.TokenSourceResponse>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.livekit.android.token.CachingFixedTokenSource$fetch$1
            if (r0 == 0) goto L14
            r0 = r5
            io.livekit.android.token.CachingFixedTokenSource$fetch$1 r0 = (io.livekit.android.token.CachingFixedTokenSource$fetch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            io.livekit.android.token.CachingFixedTokenSource$fetch$1 r0 = new io.livekit.android.token.CachingFixedTokenSource$fetch$1
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.getValue()
            return r5
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L38:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.label = r3
            r5 = 0
            java.lang.Object r5 = r4.m13956fetchImplgIAlus$livekit_android_sdk_release(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.token.CachingFixedTokenSource.mo13958fetchIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
