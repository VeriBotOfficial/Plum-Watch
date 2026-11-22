package io.livekit.android.token;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiteralTokenSource.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Lio/livekit/android/token/LiteralTokenSource;", "Lio/livekit/android/token/FixedTokenSource;", "serverUrl", "", "participantToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getParticipantToken", "()Ljava/lang/String;", "getServerUrl", "fetch", "Lkotlin/Result;", "Lio/livekit/android/token/TokenSourceResponse;", "fetch-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LiteralTokenSource implements FixedTokenSource {
    private final String participantToken;
    private final String serverUrl;

    public LiteralTokenSource(String serverUrl, String participantToken) {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(participantToken, "participantToken");
        this.serverUrl = serverUrl;
        this.participantToken = participantToken;
    }

    public final String getServerUrl() {
        return this.serverUrl;
    }

    public final String getParticipantToken() {
        return this.participantToken;
    }

    @Override // io.livekit.android.token.FixedTokenSource
    /* renamed from: fetch-IoAF18A */
    public Object mo13958fetchIoAF18A(Continuation<? super Result<TokenSourceResponse>> continuation) {
        Result.Companion companion = Result.INSTANCE;
        return Result.m14057constructorimpl(new TokenSourceResponse(this.serverUrl, this.participantToken, (String) null, (String) null, 12, (DefaultConstructorMarker) null));
    }
}
