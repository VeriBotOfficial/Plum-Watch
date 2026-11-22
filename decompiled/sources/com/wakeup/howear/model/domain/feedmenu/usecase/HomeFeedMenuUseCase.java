package com.wakeup.howear.model.domain.feedmenu.usecase;

import com.wakeup.common.network.entity.BasicRequest;
import com.wakeup.howear.model.domain.feedmenu.entity.FeedMenuDomainEntity;
import com.wakeup.howear.model.domain.feedmenu.repository.HomeFeedMenuRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeFeedMenuUseCase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/wakeup/howear/model/domain/feedmenu/usecase/HomeFeedMenuUseCase;", "", "repository", "Lcom/wakeup/howear/model/domain/feedmenu/repository/HomeFeedMenuRepository;", "<init>", "(Lcom/wakeup/howear/model/domain/feedmenu/repository/HomeFeedMenuRepository;)V", "getFeedMenuCards", "", "Lcom/wakeup/howear/model/domain/feedmenu/entity/FeedMenuDomainEntity;", "paramList", "Lcom/wakeup/common/network/entity/BasicRequest$HomePageParam;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HomeFeedMenuUseCase {
    private final HomeFeedMenuRepository repository;

    public HomeFeedMenuUseCase(HomeFeedMenuRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final Object getFeedMenuCards(List<BasicRequest.HomePageParam> list, Continuation<? super List<FeedMenuDomainEntity>> continuation) {
        return this.repository.getMenuData(list, continuation);
    }
}
