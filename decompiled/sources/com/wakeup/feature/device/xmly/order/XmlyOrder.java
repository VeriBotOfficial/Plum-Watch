package com.wakeup.feature.device.xmly.order;

import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: XmlyOrder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\f"}, d2 = {"Lcom/wakeup/feature/device/xmly/order/XmlyOrder;", "", "<init>", "()V", "sendStyleResult", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "total", "", "index", "title", "", "urlCode", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class XmlyOrder {
    public static final XmlyOrder INSTANCE = new XmlyOrder();

    private XmlyOrder() {
    }

    @JvmStatic
    public static final BleOrderModel sendStyleResult(int total, int index, String title, String urlCode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(urlCode, "urlCode");
        byte[] bArr = {-22, 0, 5, 0, BuiltinOptions.ArgMinOptions, 2, (byte) total, (byte) index};
        if (total == 0) {
            return new BleOrderModel("发送固件标题和链接二维码 total:0, index:" + index, bArr, false, 0, 12, null);
        }
        byte[] bytes = title.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(BleUtil.addBytes(bArr, new byte[]{(byte) (bytes.length / 256), (byte) (bytes.length % 256)}), bytes);
        byte[] bytes2 = urlCode.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        byte[] addBytes2 = BleUtil.addBytes(BleUtil.addBytes(addBytes, new byte[]{(byte) (bytes2.length / 256), (byte) (bytes2.length % 256)}), bytes2);
        addBytes2[1] = (byte) ((addBytes2.length - 3) / 256);
        addBytes2[2] = (byte) ((addBytes2.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes2);
        String str = "发送固件标题和链接二维码 total:" + total + ", index:" + index;
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel(str, handleMessageBytes, false, 0, 12, null);
    }
}
