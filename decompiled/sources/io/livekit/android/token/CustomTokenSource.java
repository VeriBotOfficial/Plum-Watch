package io.livekit.android.token;

import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomTokenSource.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B>\u00127\u0010\u0002\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0003¢\u0006\u0002\u0010\fJ$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012RD\u0010\u0002\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Lio/livekit/android/token/CustomTokenSource;", "Lio/livekit/android/token/ConfigurableTokenSource;", "block", "Lkotlin/Function2;", "Lio/livekit/android/token/TokenRequestOptions;", "Lkotlin/ParameterName;", "name", ApiConstants.OPTIONS, "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "Lio/livekit/android/token/TokenSourceResponse;", "", "(Lkotlin/jvm/functions/Function2;)V", "getBlock", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "fetch", "fetch-gIAlu-s", "(Lio/livekit/android/token/TokenRequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomTokenSource implements ConfigurableTokenSource {
    private final Function2<TokenRequestOptions, Continuation<? super Result<TokenSourceResponse>>, Object> block;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomTokenSource(Function2<? super TokenRequestOptions, ? super Continuation<? super Result<TokenSourceResponse>>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
    }

    public final Function2<TokenRequestOptions, Continuation<? super Result<TokenSourceResponse>>, Object> getBlock() {
        return this.block;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // io.livekit.android.token.ConfigurableTokenSource
    /* renamed from: fetch-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo13957fetchgIAlus(io.livekit.android.token.TokenRequestOptions r5, kotlin.coroutines.Continuation<? super kotlin.Result<io.livekit.android.token.TokenSourceResponse>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.livekit.android.token.CustomTokenSource$fetch$1
            if (r0 == 0) goto L14
            r0 = r6
            io.livekit.android.token.CustomTokenSource$fetch$1 r0 = (io.livekit.android.token.CustomTokenSource$fetch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            io.livekit.android.token.CustomTokenSource$fetch$1 r0 = new io.livekit.android.token.CustomTokenSource$fetch$1
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2a
            goto L42
        L2a:
            r5 = move-exception
            goto L49
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.functions.Function2<io.livekit.android.token.TokenRequestOptions, kotlin.coroutines.Continuation<? super kotlin.Result<io.livekit.android.token.TokenSourceResponse>>, java.lang.Object> r6 = r4.block     // Catch: java.lang.Throwable -> L2a
            r0.label = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = r6.invoke(r5, r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 != r1) goto L42
            return r1
        L42:
            kotlin.Result r6 = (kotlin.Result) r6     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r6.getValue()     // Catch: java.lang.Throwable -> L2a
            return r5
        L49:
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r5 = kotlin.Result.m14057constructorimpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.token.CustomTokenSource.mo13957fetchgIAlus(io.livekit.android.token.TokenRequestOptions, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
