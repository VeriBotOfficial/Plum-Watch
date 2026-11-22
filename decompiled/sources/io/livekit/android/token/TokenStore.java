package io.livekit.android.token;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CachingTokenSource.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\rJ\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"Lio/livekit/android/token/TokenStore;", "", SDPKeywords.CLEAR, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieve", "Lio/livekit/android/token/TokenStore$Item;", "store", ApiConstants.OPTIONS, "Lio/livekit/android/token/TokenRequestOptions;", "response", "Lio/livekit/android/token/TokenSourceResponse;", "(Lio/livekit/android/token/TokenRequestOptions;Lio/livekit/android/token/TokenSourceResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Item", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TokenStore {
    Object clear(Continuation<? super Unit> continuation);

    Object retrieve(Continuation<? super Item> continuation);

    Object store(TokenRequestOptions tokenRequestOptions, TokenSourceResponse tokenSourceResponse, Continuation<? super Unit> continuation);

    /* compiled from: CachingTokenSource.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lio/livekit/android/token/TokenStore$Item;", "", ApiConstants.OPTIONS, "Lio/livekit/android/token/TokenRequestOptions;", "response", "Lio/livekit/android/token/TokenSourceResponse;", "(Lio/livekit/android/token/TokenRequestOptions;Lio/livekit/android/token/TokenSourceResponse;)V", "getOptions", "()Lio/livekit/android/token/TokenRequestOptions;", "getResponse", "()Lio/livekit/android/token/TokenSourceResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Item {
        private final TokenRequestOptions options;
        private final TokenSourceResponse response;

        public static /* synthetic */ Item copy$default(Item item, TokenRequestOptions tokenRequestOptions, TokenSourceResponse tokenSourceResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                tokenRequestOptions = item.options;
            }
            if ((i & 2) != 0) {
                tokenSourceResponse = item.response;
            }
            return item.copy(tokenRequestOptions, tokenSourceResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final TokenRequestOptions getOptions() {
            return this.options;
        }

        /* renamed from: component2, reason: from getter */
        public final TokenSourceResponse getResponse() {
            return this.response;
        }

        public final Item copy(TokenRequestOptions options, TokenSourceResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new Item(options, response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.options, item.options) && Intrinsics.areEqual(this.response, item.response);
        }

        public int hashCode() {
            TokenRequestOptions tokenRequestOptions = this.options;
            return ((tokenRequestOptions == null ? 0 : tokenRequestOptions.hashCode()) * 31) + this.response.hashCode();
        }

        public String toString() {
            return "Item(options=" + this.options + ", response=" + this.response + ')';
        }

        public Item(TokenRequestOptions tokenRequestOptions, TokenSourceResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.options = tokenRequestOptions;
            this.response = response;
        }

        public final TokenRequestOptions getOptions() {
            return this.options;
        }

        public final TokenSourceResponse getResponse() {
            return this.response;
        }
    }
}
