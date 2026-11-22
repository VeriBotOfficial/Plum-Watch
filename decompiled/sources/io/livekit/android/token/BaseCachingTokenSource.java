package io.livekit.android.token;

import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CachingTokenSource.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012<\u0010\u0004\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005j\u0002`\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0002\u0010\u0010J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\b\u0010\t\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0080@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u000e\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RD\u0010\u0004\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005j\u0002`\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Lio/livekit/android/token/BaseCachingTokenSource;", "", "store", "Lio/livekit/android/token/TokenStore;", "validator", "Lkotlin/Function2;", "Lio/livekit/android/token/TokenRequestOptions;", "Lkotlin/ParameterName;", "name", ApiConstants.OPTIONS, "Lio/livekit/android/token/TokenSourceResponse;", "response", "", "Lio/livekit/android/token/TokenValidator;", "(Lio/livekit/android/token/TokenStore;Lkotlin/jvm/functions/Function2;)V", "cachedResponse", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFromSource", "Lkotlin/Result;", "fetchFromSource-gIAlu-s", "(Lio/livekit/android/token/TokenRequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchImpl", "fetchImpl-gIAlu-s$livekit_android_sdk_release", "invalidate", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseCachingTokenSource {
    private final TokenStore store;
    private final Function2<TokenRequestOptions, TokenSourceResponse, Boolean> validator;

    /* renamed from: fetchFromSource-gIAlu-s, reason: not valid java name */
    public abstract Object mo13955fetchFromSourcegIAlus(TokenRequestOptions tokenRequestOptions, Continuation<? super Result<TokenSourceResponse>> continuation);

    /* JADX WARN: Multi-variable type inference failed */
    public BaseCachingTokenSource(TokenStore store, Function2<? super TokenRequestOptions, ? super TokenSourceResponse, Boolean> validator) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.store = store;
        this.validator = validator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        if (r10 != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: fetchImpl-gIAlu-s$livekit_android_sdk_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m13956fetchImplgIAlus$livekit_android_sdk_release(io.livekit.android.token.TokenRequestOptions r9, kotlin.coroutines.Continuation<? super kotlin.Result<io.livekit.android.token.TokenSourceResponse>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.livekit.android.token.BaseCachingTokenSource$fetchImpl$1
            if (r0 == 0) goto L14
            r0 = r10
            io.livekit.android.token.BaseCachingTokenSource$fetchImpl$1 r0 = (io.livekit.android.token.BaseCachingTokenSource$fetchImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            io.livekit.android.token.BaseCachingTokenSource$fetchImpl$1 r0 = new io.livekit.android.token.BaseCachingTokenSource$fetchImpl$1
            r0.<init>(r8, r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L58
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r9 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r10)
            return r9
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.Object r9 = r0.L$1
            io.livekit.android.token.TokenRequestOptions r9 = (io.livekit.android.token.TokenRequestOptions) r9
            java.lang.Object r2 = r0.L$0
            io.livekit.android.token.BaseCachingTokenSource r2 = (io.livekit.android.token.BaseCachingTokenSource) r2
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.getValue()
            goto La7
        L4c:
            java.lang.Object r9 = r0.L$1
            io.livekit.android.token.TokenRequestOptions r9 = (io.livekit.android.token.TokenRequestOptions) r9
            java.lang.Object r2 = r0.L$0
            io.livekit.android.token.BaseCachingTokenSource r2 = (io.livekit.android.token.BaseCachingTokenSource) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L6b
        L58:
            kotlin.ResultKt.throwOnFailure(r10)
            io.livekit.android.token.TokenStore r10 = r8.store
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.retrieve(r0)
            if (r10 != r1) goto L6a
            goto Lc2
        L6a:
            r2 = r8
        L6b:
            io.livekit.android.token.TokenStore$Item r10 = (io.livekit.android.token.TokenStore.Item) r10
            if (r10 == 0) goto L9a
            io.livekit.android.token.TokenRequestOptions r5 = r10.getOptions()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r9)
            if (r5 == 0) goto L9a
            kotlin.jvm.functions.Function2<io.livekit.android.token.TokenRequestOptions, io.livekit.android.token.TokenSourceResponse, java.lang.Boolean> r5 = r2.validator
            io.livekit.android.token.TokenRequestOptions r6 = r10.getOptions()
            io.livekit.android.token.TokenSourceResponse r7 = r10.getResponse()
            java.lang.Object r5 = r5.invoke(r6, r7)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L9a
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            io.livekit.android.token.TokenSourceResponse r9 = r10.getResponse()
            java.lang.Object r9 = kotlin.Result.m14057constructorimpl(r9)
            return r9
        L9a:
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r2.mo13955fetchFromSourcegIAlus(r9, r0)
            if (r10 != r1) goto La7
            goto Lc2
        La7:
            boolean r4 = kotlin.Result.m14064isSuccessimpl(r10)
            if (r4 == 0) goto Lc3
            kotlin.ResultKt.throwOnFailure(r10)
            r4 = r10
            io.livekit.android.token.TokenSourceResponse r4 = (io.livekit.android.token.TokenSourceResponse) r4
            io.livekit.android.token.TokenStore r2 = r2.store
            r0.L$0 = r10
            r5 = 0
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r2.store(r9, r4, r0)
            if (r9 != r1) goto Lc3
        Lc2:
            return r1
        Lc3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.token.BaseCachingTokenSource.m13956fetchImplgIAlus$livekit_android_sdk_release(io.livekit.android.token.TokenRequestOptions, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object invalidate(Continuation<? super Unit> continuation) {
        Object clear = this.store.clear(continuation);
        return clear == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? clear : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cachedResponse(kotlin.coroutines.Continuation<? super io.livekit.android.token.TokenSourceResponse> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.livekit.android.token.BaseCachingTokenSource$cachedResponse$1
            if (r0 == 0) goto L14
            r0 = r5
            io.livekit.android.token.BaseCachingTokenSource$cachedResponse$1 r0 = (io.livekit.android.token.BaseCachingTokenSource$cachedResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            io.livekit.android.token.BaseCachingTokenSource$cachedResponse$1 r0 = new io.livekit.android.token.BaseCachingTokenSource$cachedResponse$1
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            io.livekit.android.token.TokenStore r5 = r4.store
            r0.label = r3
            java.lang.Object r5 = r5.retrieve(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            io.livekit.android.token.TokenStore$Item r5 = (io.livekit.android.token.TokenStore.Item) r5
            if (r5 == 0) goto L49
            io.livekit.android.token.TokenSourceResponse r5 = r5.getResponse()
            return r5
        L49:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.token.BaseCachingTokenSource.cachedResponse(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
