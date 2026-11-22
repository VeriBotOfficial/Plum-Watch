package com.wakeup.howear.model.data.feedmenu.datasource;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;

/* compiled from: HomeFeedMenuDataSource.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0086@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/wakeup/howear/model/data/feedmenu/datasource/HomeFeedMenuDataSource;", "", "<init>", "()V", "fetchMenuFromNetwork", "", "Lcom/wakeup/common/network/entity/feedmenu/FeedMenuEntity;", RemoteMessageConst.MessageBody.PARAM, "Lcom/wakeup/common/network/entity/BasicRequest$HomePageParam;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HomeFeedMenuDataSource {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchMenuFromNetwork(java.util.List<com.wakeup.common.network.entity.BasicRequest.HomePageParam> r7, kotlin.coroutines.Continuation<? super java.util.List<com.wakeup.common.network.entity.feedmenu.FeedMenuEntity>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuDataSource$fetchMenuFromNetwork$1
            if (r0 == 0) goto L14
            r0 = r8
            com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuDataSource$fetchMenuFromNetwork$1 r0 = (com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuDataSource$fetchMenuFromNetwork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuDataSource$fetchMenuFromNetwork$1 r0 = new com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuDataSource$fetchMenuFromNetwork$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "MENU"
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L69
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.ResultKt.throwOnFailure(r8)
            com.wakeup.common.network.logger.CommonNetworkLogger r8 = com.wakeup.common.network.logger.CommonNetworkLogger.getInstance()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "startRequest,param = "
            r2.<init>(r5)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r8.print(r3, r2)
            com.wakeup.common.network.RetrofitManager$Companion r8 = com.wakeup.common.network.RetrofitManager.INSTANCE
            com.wakeup.common.network.RetrofitManager r8 = r8.getInstance()
            com.wakeup.common.network.api.NewService r8 = r8.getNewOperate()
            com.wakeup.common.network.entity.BasicRequest$HomePageRequestParam r2 = new com.wakeup.common.network.entity.BasicRequest$HomePageRequestParam
            r2.<init>(r7)
            r0.label = r4
            java.lang.Object r8 = r8.getFeedMenu(r2, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            com.wakeup.common.network.BaseResult r8 = (com.wakeup.common.network.BaseResult) r8
            com.wakeup.common.network.logger.CommonNetworkLogger r7 = com.wakeup.common.network.logger.CommonNetworkLogger.getInstance()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "fetchMenuFromNetwork,result = "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r7.print(r3, r0)
            java.lang.Object r7 = r8.getData()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuDataSource.fetchMenuFromNetwork(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
