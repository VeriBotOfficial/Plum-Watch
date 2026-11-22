package com.wakeup.feature.device.book;

import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;

/* compiled from: EBookOrder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/wakeup/feature/device/book/EBookOrder;", "", "<init>", "()V", "sendEBookState", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "state", "", "code", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EBookOrder {
    public static final EBookOrder INSTANCE = new EBookOrder();

    private EBookOrder() {
    }

    public final BleOrderModel sendEBookState(int state, int code) {
        return new BleOrderModel("发送电子书状态", new byte[]{-22, 0, 5, 0, 25, 1, (byte) state, (byte) code}, false, 0, 12, null);
    }
}
