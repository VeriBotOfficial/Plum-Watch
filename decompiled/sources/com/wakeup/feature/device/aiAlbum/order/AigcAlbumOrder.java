package com.wakeup.feature.device.aiAlbum.order;

import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: AigcAlbumOrder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/wakeup/feature/device/aiAlbum/order/AigcAlbumOrder;", "", "<init>", "()V", "sendGetMaxSize", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AigcAlbumOrder {
    public static final AigcAlbumOrder INSTANCE = new AigcAlbumOrder();

    private AigcAlbumOrder() {
    }

    @JvmStatic
    public static final BleOrderModel sendGetMaxSize() {
        return new BleOrderModel("发送请求ai表盘相册最大数量", new byte[]{-22, 0, 3, 0, 17, 7}, false, 0, 12, null);
    }
}
