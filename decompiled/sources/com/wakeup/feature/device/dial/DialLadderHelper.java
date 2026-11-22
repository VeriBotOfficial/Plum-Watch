package com.wakeup.feature.device.dial;

import com.baidu.platform.comapi.map.MapController;
import com.wakeup.common.network.entity.device.DialModel;
import com.wakeup.common.storage.UserDao;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialLadderHelper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/wakeup/feature/device/dial/DialLadderHelper;", "", "<init>", "()V", "abEnabled", "", "hasLadderPrice", MapController.ITEM_LAYER_TAG, "Lcom/wakeup/common/network/entity/device/DialModel;", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DialLadderHelper {
    public static final DialLadderHelper INSTANCE = new DialLadderHelper();

    @JvmStatic
    public static final boolean abEnabled() {
        return false;
    }

    private DialLadderHelper() {
    }

    @JvmStatic
    public static final boolean hasLadderPrice(DialModel item) {
        Float ladderPrice;
        Intrinsics.checkNotNullParameter(item, "item");
        return abEnabled() && item.getType() == 2 && !UserDao.isVip() && (ladderPrice = item.getLadderPrice()) != null && ladderPrice.floatValue() > 0.0f;
    }
}
