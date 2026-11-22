package io.livekit.android.token;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: TokenSource.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Lio/livekit/android/token/FixedTokenSource;", "Lio/livekit/android/token/TokenSource;", "fetch", "Lkotlin/Result;", "Lio/livekit/android/token/TokenSourceResponse;", "fetch-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FixedTokenSource extends TokenSource {
    /* renamed from: fetch-IoAF18A */
    Object mo13958fetchIoAF18A(Continuation<? super Result<TokenSourceResponse>> continuation);
}
