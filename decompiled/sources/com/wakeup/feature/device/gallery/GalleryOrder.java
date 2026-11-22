package com.wakeup.feature.device.gallery;

import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GalleryOrder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/wakeup/feature/device/gallery/GalleryOrder;", "", "<init>", "()V", "Companion", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GalleryOrder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final BleOrderModel sendResult(int i, int i2) {
        return INSTANCE.sendResult(i, i2);
    }

    /* compiled from: GalleryOrder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Lcom/wakeup/feature/device/gallery/GalleryOrder$Companion;", "", "<init>", "()V", "sendDeviceGallery", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "sendResult", "state", "", "errorCode", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BleOrderModel sendDeviceGallery() {
            return new BleOrderModel("获取本地相册是否支持传输的信息", new byte[]{-22, 0, 3, 0, 26, 1}, false, 0, 12, null);
        }

        @JvmStatic
        public final BleOrderModel sendResult(int state, int errorCode) {
            return new BleOrderModel("发送aigc表盘图片", new byte[]{-22, 0, 5, 0, 26, 2, (byte) state, (byte) errorCode}, false, 0, 12, null);
        }
    }
}
