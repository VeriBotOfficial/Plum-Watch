package io.livekit.android.token;

import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: TokenSource.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Lio/livekit/android/token/ConfigurableTokenSource;", "Lio/livekit/android/token/TokenSource;", "fetch", "Lkotlin/Result;", "Lio/livekit/android/token/TokenSourceResponse;", ApiConstants.OPTIONS, "Lio/livekit/android/token/TokenRequestOptions;", "fetch-gIAlu-s", "(Lio/livekit/android/token/TokenRequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ConfigurableTokenSource extends TokenSource {
    /* renamed from: fetch-gIAlu-s */
    Object mo13957fetchgIAlus(TokenRequestOptions tokenRequestOptions, Continuation<? super Result<TokenSourceResponse>> continuation);

    /* compiled from: TokenSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        /* renamed from: fetch-gIAlu-s$default, reason: not valid java name */
        public static /* synthetic */ Object m13961fetchgIAlus$default(ConfigurableTokenSource configurableTokenSource, TokenRequestOptions tokenRequestOptions, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch-gIAlu-s");
            }
            if ((i & 1) != 0) {
                tokenRequestOptions = new TokenRequestOptions(null, null, null, null, null, null, null, 127, null);
            }
            return configurableTokenSource.mo13957fetchgIAlus(tokenRequestOptions, continuation);
        }
    }
}
