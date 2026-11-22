package com.wakeup.howear.model.domain.publisherlist.repository;

import androidx.paging.PagingData;
import com.wakeup.howear.model.domain.publisherlist.entity.PublisherListItemEntity;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: PublisherListRepository.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/wakeup/howear/model/domain/publisherlist/repository/PublisherListRepository;", "", "getPublisherListPagingData", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/wakeup/howear/model/domain/publisherlist/entity/PublisherListItemEntity;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PublisherListRepository {
    Flow<PagingData<PublisherListItemEntity>> getPublisherListPagingData();
}
