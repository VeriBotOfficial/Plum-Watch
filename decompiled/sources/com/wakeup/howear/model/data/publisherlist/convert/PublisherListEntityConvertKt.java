package com.wakeup.howear.model.data.publisherlist.convert;

import com.wakeup.common.common.constants.publishlist.PublisherListItemTypes;
import com.wakeup.common.network.entity.video.PublisherListItemRemoteEntity;
import com.wakeup.howear.model.domain.publisherlist.entity.PublisherListItemEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PublisherListEntityConvert.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toDomainEntity", "Lcom/wakeup/howear/model/domain/publisherlist/entity/PublisherListItemEntity;", "Lcom/wakeup/common/network/entity/video/PublisherListItemRemoteEntity;", "app_wpOverseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PublisherListEntityConvertKt {
    public static final PublisherListItemEntity toDomainEntity(PublisherListItemRemoteEntity publisherListItemRemoteEntity) {
        Intrinsics.checkNotNullParameter(publisherListItemRemoteEntity, "<this>");
        PublisherListItemTypes publisherListItemTypes = PublisherListItemTypes.FOLLOW_PUBLISHER;
        String id2 = publisherListItemRemoteEntity.getId();
        String str = id2 == null ? "" : id2;
        String avatar = publisherListItemRemoteEntity.getAvatar();
        String str2 = avatar == null ? "" : avatar;
        Integer updatePushNum = publisherListItemRemoteEntity.getUpdatePushNum();
        int intValue = updatePushNum != null ? updatePushNum.intValue() : 0;
        String nickName = publisherListItemRemoteEntity.getNickName();
        return new PublisherListItemEntity(publisherListItemTypes, nickName == null ? "" : nickName, str2, str, intValue);
    }
}
