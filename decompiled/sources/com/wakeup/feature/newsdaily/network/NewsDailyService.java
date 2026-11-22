package com.wakeup.feature.newsdaily.network;

import com.wakeup.feature.newsdaily.model.ClaimRequest;
import com.wakeup.feature.newsdaily.model.NewsEpisode;
import com.wakeup.feature.newsdaily.model.NewsListResponse;
import com.wakeup.feature.newsdaily.model.SubscribeResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: NewsDailyService.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u000f\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00132\b\b\u0001\u0010\u000f\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/wakeup/feature/newsdaily/network/NewsDailyService;", "", "latest", "Lcom/wakeup/feature/newsdaily/model/NewsEpisode;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "list", "Lcom/wakeup/feature/newsdaily/model/NewsListResponse;", "days", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "episode", "date", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "claim", "body", "Lcom/wakeup/feature/newsdaily/model/ClaimRequest;", "(Lcom/wakeup/feature/newsdaily/model/ClaimRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscribe", "Lcom/wakeup/feature/newsdaily/model/SubscribeResponse;", "subscribe", "Lokhttp3/RequestBody;", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsubscribe", "feature-newsdaily_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface NewsDailyService {
    @POST("daily/claim")
    Object claim(@Body ClaimRequest claimRequest, Continuation<? super NewsEpisode> continuation);

    @GET("daily/episode")
    Object episode(@Query("date") String str, Continuation<? super NewsEpisode> continuation);

    @GET("daily/subscribe")
    Object getSubscribe(Continuation<? super SubscribeResponse> continuation);

    @GET("daily/latest")
    Object latest(Continuation<? super NewsEpisode> continuation);

    @GET("daily/list")
    Object list(@Query("days") int i, Continuation<? super NewsListResponse> continuation);

    @POST("daily/subscribe")
    Object subscribe(@Body RequestBody requestBody, Continuation<? super SubscribeResponse> continuation);

    @POST("daily/unsubscribe")
    Object unsubscribe(@Body RequestBody requestBody, Continuation<? super SubscribeResponse> continuation);

    /* compiled from: NewsDailyService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object list$default(NewsDailyService newsDailyService, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: list");
            }
            if ((i2 & 1) != 0) {
                i = 7;
            }
            return newsDailyService.list(i, continuation);
        }

        public static /* synthetic */ Object claim$default(NewsDailyService newsDailyService, ClaimRequest claimRequest, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: claim");
            }
            if ((i & 1) != 0) {
                claimRequest = new ClaimRequest(null, 1, null);
            }
            return newsDailyService.claim(claimRequest, continuation);
        }
    }
}
