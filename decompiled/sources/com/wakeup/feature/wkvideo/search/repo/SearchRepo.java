package com.wakeup.feature.wkvideo.search.repo;

import com.wakeup.common.network.entity.video.VideoEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchRepo.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0087@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001bH\u0087@¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/wakeup/feature/wkvideo/search/repo/SearchRepo;", "", "dataSource", "Lcom/wakeup/feature/wkvideo/search/repo/ISearchDataSource;", "<init>", "(Lcom/wakeup/feature/wkvideo/search/repo/ISearchDataSource;)V", "data", "", "Lcom/wakeup/common/network/entity/video/VideoEntity;", "getData", "()Ljava/util/List;", "pageIndex", "", "getPageIndex", "()I", "setPageIndex", "(I)V", "pageSize", "getPageSize", "curTag", "", "getCurTag", "()Ljava/lang/String;", "setCurTag", "(Ljava/lang/String;)V", "increaseMaxCount", "newSearchVideo", "", "tag", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMoreSearchVideo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchRepo {
    private String curTag;
    private final List<VideoEntity> data;
    private final ISearchDataSource dataSource;
    private final int increaseMaxCount;
    private int pageIndex;
    private final int pageSize;

    public SearchRepo(ISearchDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
        this.data = new ArrayList();
        this.pageIndex = 1;
        this.pageSize = 50;
        this.curTag = "";
        this.increaseMaxCount = 10;
    }

    public final List<VideoEntity> getData() {
        return this.data;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final void setPageIndex(int i) {
        this.pageIndex = i;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final String getCurTag() {
        return this.curTag;
    }

    public final void setCurTag(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.curTag = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f8 -> B:11:0x00fb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object newSearchVideo(java.lang.String r11, kotlin.coroutines.Continuation<? super java.util.List<com.wakeup.common.network.entity.video.VideoEntity>> r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.search.repo.SearchRepo.newSearchVideo(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadMoreSearchVideo(kotlin.coroutines.Continuation<? super java.util.List<com.wakeup.common.network.entity.video.VideoEntity>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.wakeup.feature.wkvideo.search.repo.SearchRepo$loadMoreSearchVideo$1
            if (r0 == 0) goto L14
            r0 = r7
            com.wakeup.feature.wkvideo.search.repo.SearchRepo$loadMoreSearchVideo$1 r0 = (com.wakeup.feature.wkvideo.search.repo.SearchRepo$loadMoreSearchVideo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.wakeup.feature.wkvideo.search.repo.SearchRepo$loadMoreSearchVideo$1 r0 = new com.wakeup.feature.wkvideo.search.repo.SearchRepo$loadMoreSearchVideo$1
            r0.<init>(r6, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            com.wakeup.feature.wkvideo.search.repo.SearchRepo r0 = (com.wakeup.feature.wkvideo.search.repo.SearchRepo) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L77
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            int r7 = r6.pageIndex
            int r7 = r7 + r3
            r2 = 3
            kotlin.Pair[] r2 = new kotlin.Pair[r2]
            java.lang.String r4 = "query"
            java.lang.String r5 = r6.curTag
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r5)
            r5 = 0
            r2[r5] = r4
            java.lang.String r4 = "pageNumber"
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            kotlin.Pair r7 = kotlin.TuplesKt.to(r4, r7)
            r2[r3] = r7
            int r7 = r6.pageSize
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            java.lang.String r4 = "pageSize"
            kotlin.Pair r7 = kotlin.TuplesKt.to(r4, r7)
            r4 = 2
            r2[r4] = r7
            java.util.Map r7 = kotlin.collections.MapsKt.mapOf(r2)
            com.wakeup.feature.wkvideo.search.repo.ISearchDataSource r2 = r6.dataSource
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r2.searchVideo(r7, r0)
            if (r7 != r1) goto L76
            return r1
        L76:
            r0 = r6
        L77:
            com.wakeup.common.network.entity.video.SearchResultEntity r7 = (com.wakeup.common.network.entity.video.SearchResultEntity) r7
            int r1 = r0.pageIndex
            int r1 = r1 + r3
            r0.pageIndex = r1
            if (r7 == 0) goto L91
            java.util.List r1 = r7.getResult()
            if (r1 == 0) goto L91
            java.util.List<com.wakeup.common.network.entity.video.VideoEntity> r0 = r0.data
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r0 = r0.addAll(r1)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
        L91:
            if (r7 == 0) goto L9f
            int r0 = r7.isNeedPages()
            if (r0 != 0) goto L9a
            goto L9f
        L9a:
            java.util.List r7 = r7.getResult()
            return r7
        L9f:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.search.repo.SearchRepo.loadMoreSearchVideo(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
