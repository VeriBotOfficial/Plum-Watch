package com.wakeup.feature.device.music.order;

import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LocalMusicOrder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/wakeup/feature/device/music/order/LocalMusicOrder;", "", "<init>", "()V", "Companion", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocalMusicOrder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: LocalMusicOrder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lcom/wakeup/feature/device/music/order/LocalMusicOrder$Companion;", "", "<init>", "()V", "sendLocalMusicState", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "state", "", "code", "sendLocalMusicList", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BleOrderModel sendLocalMusicState(int state, int code) {
            return new BleOrderModel("发送本地音乐状态", new byte[]{-22, 0, 5, 0, 16, 2, (byte) state, (byte) code}, false, 0, 12, null);
        }

        public final BleOrderModel sendLocalMusicList() {
            return new BleOrderModel("获取本地音乐列表", new byte[]{-22, 0, 3, 0, 16, 1}, false, 0, 12, null);
        }
    }
}
