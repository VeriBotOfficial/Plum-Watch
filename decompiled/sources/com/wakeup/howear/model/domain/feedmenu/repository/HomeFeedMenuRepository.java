package com.wakeup.howear.model.domain.feedmenu.repository;

import com.wakeup.common.network.entity.BasicRequest;
import com.wakeup.howear.model.domain.feedmenu.entity.FeedMenuDomainEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: HomeFeedMenuRepository.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H¦@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/howear/model/domain/feedmenu/repository/HomeFeedMenuRepository;", "", "getMenuData", "", "Lcom/wakeup/howear/model/domain/feedmenu/entity/FeedMenuDomainEntity;", "paramList", "Lcom/wakeup/common/network/entity/BasicRequest$HomePageParam;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface HomeFeedMenuRepository {
    Object getMenuData(List<BasicRequest.HomePageParam> list, Continuation<? super List<FeedMenuDomainEntity>> continuation);
}
