package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.healthGuidelines.DepartmentBean;
import com.wakeup.common.network.entity.healthGuidelines.HeadLinesBean;
import com.wakeup.common.network.entity.healthGuidelines.TopicArticleBean;
import com.wakeup.common.network.entity.healthGuidelines.TopicListBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: GuidelinesService.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\tJ.\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\tJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H§@¢\u0006\u0002\u0010\u000eJ.\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00102\b\b\u0003\u0010\b\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J2\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00102\b\b\u0003\u0010\u0006\u001a\u00020\u00102\b\b\u0003\u0010\b\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/api/GuidelinesService;", "", "getTopicList", "Lcom/wakeup/common/network/BaseResult;", "", "Lcom/wakeup/common/network/entity/healthGuidelines/TopicArticleBean;", "pageNum", "", "pageSize", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDepartmentList", "Lcom/wakeup/common/network/entity/healthGuidelines/DepartmentBean;", "getHeadlinesContent", "Lcom/wakeup/common/network/entity/healthGuidelines/HeadLinesBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHealthTopic", "", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getListArticle", "Lcom/wakeup/common/network/entity/healthGuidelines/TopicListBean;", "topicId", "(JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHeadLinesDetail", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface GuidelinesService {
    @GET("healthNews/hospitalDepartment/pageList")
    Object getDepartmentList(@Query("pageNum") String str, @Query("pageSize") String str2, Continuation<? super BaseResult<List<DepartmentBean>>> continuation);

    @GET("healthNews/healthArticle/getDetail")
    Object getHeadLinesDetail(@Query("id") String str, Continuation<? super BaseResult<HeadLinesBean>> continuation);

    @GET("healthNews/healthArticle/getHeadlines")
    Object getHeadlinesContent(Continuation<? super BaseResult<HeadLinesBean>> continuation);

    @GET("healthNews/healthTopic/pageList")
    Object getHealthTopic(@Query("pageNum") long j, @Query("pageSize") long j2, Continuation<? super BaseResult<List<TopicArticleBean>>> continuation);

    @GET("healthNews/healthArticle/listArticle")
    Object getListArticle(@Query("topicId") long j, @Query("pageNum") long j2, @Query("pageSize") long j3, Continuation<? super BaseResult<TopicListBean>> continuation);

    @GET("healthNews/healthArticle/listTopicArticle")
    Object getTopicList(@Query("pageNum") String str, @Query("pageSize") String str2, Continuation<? super BaseResult<List<TopicArticleBean>>> continuation);

    /* compiled from: GuidelinesService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getHealthTopic$default(GuidelinesService guidelinesService, long j, long j2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHealthTopic");
            }
            if ((i & 1) != 0) {
                j = 1;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = 999;
            }
            return guidelinesService.getHealthTopic(j3, j2, continuation);
        }

        public static /* synthetic */ Object getListArticle$default(GuidelinesService guidelinesService, long j, long j2, long j3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListArticle");
            }
            if ((i & 2) != 0) {
                j2 = 1;
            }
            return guidelinesService.getListArticle(j, j2, (i & 4) != 0 ? 999L : j3, continuation);
        }
    }
}
