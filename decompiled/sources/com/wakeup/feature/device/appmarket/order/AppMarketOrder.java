package com.wakeup.feature.device.appmarket.order;

import com.vivo.push.PushClientConstants;
import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: AppMarketOrder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/wakeup/feature/device/appmarket/order/AppMarketOrder;", "", "<init>", "()V", "Companion", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppMarketOrder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: AppMarketOrder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/wakeup/feature/device/appmarket/order/AppMarketOrder$Companion;", "", "<init>", "()V", "getInstallApp", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "uninstallApp", PushClientConstants.TAG_PKG_NAME, "", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BleOrderModel getInstallApp() {
            return new BleOrderModel("获取已安装应用列表", new byte[]{-22, 0, 3, 0, 19, 1}, false, 0, 12, null);
        }

        public final BleOrderModel uninstallApp(String pkgName) {
            Intrinsics.checkNotNullParameter(pkgName, "pkgName");
            byte[] bytes = pkgName.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] addBytes = BleUtil.addBytes(new byte[]{-22, 0, 3, 0, 19, 2}, bytes);
            addBytes[1] = (byte) ((addBytes.length - 3) / 256);
            addBytes[2] = (byte) ((addBytes.length - 3) % 256);
            byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
            Intrinsics.checkNotNullExpressionValue(handleMessageBytes, "handleMessageBytes(...)");
            return new BleOrderModel("卸载app", handleMessageBytes, true, 20);
        }
    }
}
