package io.livekit.android.room.util;

import io.livekit.android.util.OkHttpCallExtKt;
import io.livekit.android.util.UrlUtilsKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: ConnectionWarmer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/livekit/android/room/util/OkHttpConnectionWarmer;", "Lio/livekit/android/room/util/ConnectionWarmer;", "okHttpClient", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "fetch", "Lokhttp3/Response;", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OkHttpConnectionWarmer implements ConnectionWarmer {
    private final OkHttpClient okHttpClient;

    @Inject
    public OkHttpConnectionWarmer(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
    }

    @Override // io.livekit.android.room.util.ConnectionWarmer
    public Object fetch(String str, Continuation<? super Response> continuation) {
        return OkHttpCallExtKt.executeAsync(this.okHttpClient.newCall(new Request.Builder().url(UrlUtilsKt.toHttpUrl(str)).method("HEAD", null).build()), continuation);
    }
}
