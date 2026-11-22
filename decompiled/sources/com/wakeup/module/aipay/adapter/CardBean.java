package com.wakeup.module.aipay.adapter;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.wakeup.common.network.entity.aipay.CardEnergy;
import kotlin.Metadata;

/* compiled from: CardBean.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/wakeup/module/aipay/adapter/CardBean;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "itemType", "", "<init>", "(I)V", "getItemType", "()I", "data", "Lcom/wakeup/common/network/entity/aipay/CardEnergy;", "getData", "()Lcom/wakeup/common/network/entity/aipay/CardEnergy;", "setData", "(Lcom/wakeup/common/network/entity/aipay/CardEnergy;)V", "Companion", "module-aipay_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardBean implements MultiItemEntity {
    public static final int TYPE_CARD = 1;
    public static final int TYPE_FREE = 2;
    private CardEnergy data;
    private final int itemType;

    public CardBean(int i) {
        this.itemType = i;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    public final CardEnergy getData() {
        return this.data;
    }

    public final void setData(CardEnergy cardEnergy) {
        this.data = cardEnergy;
    }
}
