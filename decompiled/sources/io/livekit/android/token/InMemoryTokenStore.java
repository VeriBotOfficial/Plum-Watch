package io.livekit.android.token;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import com.baidu.platform.comapi.map.MapController;
import io.livekit.android.token.TokenStore;
import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: CachingTokenSource.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0002\u0010\u000bJ \u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/livekit/android/token/InMemoryTokenStore;", "Lio/livekit/android/token/TokenStore;", "()V", MapController.ITEM_LAYER_TAG, "Lio/livekit/android/token/TokenStore$Item;", "getItem", "()Lio/livekit/android/token/TokenStore$Item;", "setItem", "(Lio/livekit/android/token/TokenStore$Item;)V", SDPKeywords.CLEAR, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieve", "store", ApiConstants.OPTIONS, "Lio/livekit/android/token/TokenRequestOptions;", "response", "Lio/livekit/android/token/TokenSourceResponse;", "(Lio/livekit/android/token/TokenRequestOptions;Lio/livekit/android/token/TokenSourceResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InMemoryTokenStore implements TokenStore {
    private TokenStore.Item item;

    public final TokenStore.Item getItem() {
        return this.item;
    }

    public final void setItem(TokenStore.Item item) {
        this.item = item;
    }

    @Override // io.livekit.android.token.TokenStore
    public Object retrieve(Continuation<? super TokenStore.Item> continuation) {
        return this.item;
    }

    @Override // io.livekit.android.token.TokenStore
    public Object store(TokenRequestOptions tokenRequestOptions, TokenSourceResponse tokenSourceResponse, Continuation<? super Unit> continuation) {
        this.item = new TokenStore.Item(tokenRequestOptions, tokenSourceResponse);
        return Unit.INSTANCE;
    }

    @Override // io.livekit.android.token.TokenStore
    public Object clear(Continuation<? super Unit> continuation) {
        this.item = null;
        return Unit.INSTANCE;
    }
}
