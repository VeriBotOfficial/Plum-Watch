package io.livekit.android.token;

import io.nats.client.support.ApiConstants;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TokenSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/livekit/android/token/TokenSource;", "", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TokenSource {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: TokenSource.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u00020\u000427\u0010\u0005\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0002\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0015J.\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\n\u001a\u00020\u001c¨\u0006\u001d"}, d2 = {"Lio/livekit/android/token/TokenSource$Companion;", "", "()V", "fromCustom", "Lio/livekit/android/token/ConfigurableTokenSource;", "block", "Lkotlin/Function2;", "Lio/livekit/android/token/TokenRequestOptions;", "Lkotlin/ParameterName;", "name", ApiConstants.OPTIONS, "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "Lio/livekit/android/token/TokenSourceResponse;", "(Lkotlin/jvm/functions/Function2;)Lio/livekit/android/token/ConfigurableTokenSource;", "fromEndpoint", "url", "Ljava/net/URL;", "method", "", ApiConstants.HEADERS, "", "fromLiteral", "Lio/livekit/android/token/FixedTokenSource;", "serverUrl", "participantToken", "fromSandboxTokenServer", "sandboxId", "Lio/livekit/android/token/SandboxTokenServerOptions;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final FixedTokenSource fromLiteral(String serverUrl, String participantToken) {
            Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
            Intrinsics.checkNotNullParameter(participantToken, "participantToken");
            return new LiteralTokenSource(serverUrl, participantToken);
        }

        public final ConfigurableTokenSource fromCustom(Function2<? super TokenRequestOptions, ? super Continuation<? super Result<TokenSourceResponse>>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new CustomTokenSource(block);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConfigurableTokenSource fromEndpoint$default(Companion companion, String str, String str2, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = "POST";
            }
            if ((i & 4) != 0) {
                map = MapsKt.emptyMap();
            }
            return companion.fromEndpoint(str, str2, (Map<String, String>) map);
        }

        public final ConfigurableTokenSource fromEndpoint(String url, String method, Map<String, String> headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(headers, "headers");
            return new EndpointTokenSourceImpl(url, method, headers);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConfigurableTokenSource fromEndpoint$default(Companion companion, URL url, String str, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "POST";
            }
            if ((i & 4) != 0) {
                map = MapsKt.emptyMap();
            }
            return companion.fromEndpoint(url, str, (Map<String, String>) map);
        }

        public final ConfigurableTokenSource fromEndpoint(URL url, String method, Map<String, String> headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(headers, "headers");
            return new EndpointTokenSourceImpl(url, method, headers);
        }

        public static /* synthetic */ ConfigurableTokenSource fromSandboxTokenServer$default(Companion companion, String str, SandboxTokenServerOptions sandboxTokenServerOptions, int i, Object obj) {
            if ((i & 2) != 0) {
                sandboxTokenServerOptions = new SandboxTokenServerOptions(null, 1, null);
            }
            return companion.fromSandboxTokenServer(str, sandboxTokenServerOptions);
        }

        public final ConfigurableTokenSource fromSandboxTokenServer(String sandboxId, SandboxTokenServerOptions options) {
            Intrinsics.checkNotNullParameter(sandboxId, "sandboxId");
            Intrinsics.checkNotNullParameter(options, "options");
            return new SandboxTokenSource(sandboxId, options);
        }
    }
}
