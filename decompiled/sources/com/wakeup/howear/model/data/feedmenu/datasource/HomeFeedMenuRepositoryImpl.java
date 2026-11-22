package com.wakeup.howear.model.data.feedmenu.datasource;

import com.wakeup.howear.model.domain.feedmenu.repository.HomeFeedMenuRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeFeedMenuRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0096@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/wakeup/howear/model/data/feedmenu/datasource/HomeFeedMenuRepositoryImpl;", "Lcom/wakeup/howear/model/domain/feedmenu/repository/HomeFeedMenuRepository;", "dataSource", "Lcom/wakeup/howear/model/data/feedmenu/datasource/HomeFeedMenuDataSource;", "<init>", "(Lcom/wakeup/howear/model/data/feedmenu/datasource/HomeFeedMenuDataSource;)V", "getMenuData", "", "Lcom/wakeup/howear/model/domain/feedmenu/entity/FeedMenuDomainEntity;", "paramList", "Lcom/wakeup/common/network/entity/BasicRequest$HomePageParam;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HomeFeedMenuRepositoryImpl implements HomeFeedMenuRepository {
    private final HomeFeedMenuDataSource dataSource;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeFeedMenuRepositoryImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HomeFeedMenuRepositoryImpl(HomeFeedMenuDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
    }

    public /* synthetic */ HomeFeedMenuRepositoryImpl(HomeFeedMenuDataSource homeFeedMenuDataSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new HomeFeedMenuDataSource() : homeFeedMenuDataSource);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: Exception -> 0x0070, LOOP:0: B:12:0x0059->B:14:0x005f, LOOP_END, TryCatch #0 {Exception -> 0x0070, blocks: (B:10:0x0026, B:11:0x0040, B:12:0x0059, B:14:0x005f, B:16:0x006d, B:23:0x0035), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.wakeup.howear.model.domain.feedmenu.repository.HomeFeedMenuRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getMenuData(java.util.List<com.wakeup.common.network.entity.BasicRequest.HomePageParam> r5, kotlin.coroutines.Continuation<? super java.util.List<com.wakeup.howear.model.domain.feedmenu.entity.FeedMenuDomainEntity>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuRepositoryImpl$getMenuData$1
            if (r0 == 0) goto L14
            r0 = r6
            com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuRepositoryImpl$getMenuData$1 r0 = (com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuRepositoryImpl$getMenuData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuRepositoryImpl$getMenuData$1 r0 = new com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuRepositoryImpl$getMenuData$1
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L70
            goto L40
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r6)
            com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuDataSource r6 = r4.dataSource     // Catch: java.lang.Exception -> L70
            r0.label = r3     // Catch: java.lang.Exception -> L70
            java.lang.Object r6 = r6.fetchMenuFromNetwork(r5, r0)     // Catch: java.lang.Exception -> L70
            if (r6 != r1) goto L40
            return r1
        L40:
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Exception -> L70
            java.util.List r5 = kotlin.collections.CollectionsKt.toMutableList(r6)     // Catch: java.lang.Exception -> L70
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Exception -> L70
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L70
            r0 = 10
            int r0 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, r0)     // Catch: java.lang.Exception -> L70
            r6.<init>(r0)     // Catch: java.lang.Exception -> L70
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Exception -> L70
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L70
        L59:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Exception -> L70
            com.wakeup.common.network.entity.feedmenu.FeedMenuEntity r0 = (com.wakeup.common.network.entity.feedmenu.FeedMenuEntity) r0     // Catch: java.lang.Exception -> L70
            com.wakeup.howear.model.domain.feedmenu.entity.FeedMenuDomainEntity r0 = com.wakeup.howear.model.data.feedmenu.convert.FeedMenuEntityConvertKt.toDomainEntity(r0)     // Catch: java.lang.Exception -> L70
            r6.add(r0)     // Catch: java.lang.Exception -> L70
            goto L59
        L6d:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> L70
            return r6
        L70:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuRepositoryImpl.getMenuData(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
