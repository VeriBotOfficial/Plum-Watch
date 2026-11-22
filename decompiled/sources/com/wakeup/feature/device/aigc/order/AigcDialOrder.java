package com.wakeup.feature.device.aigc.order;

import com.applovin.sdk.AppLovinMediationProvider;
import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: AigcDialOrder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007J0\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0007J\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u0007¨\u0006\u0014"}, d2 = {"Lcom/wakeup/feature/device/aigc/order/AigcDialOrder;", "", "<init>", "()V", "sendCreateResult", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "result", "", "sendResult", "state", "errorCode", "sendSpeakResult", "resultCode", "runCode", "", "overLength", AppLovinMediationProvider.MAX, "sendStyleResult", "styleName", "clearOld", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AigcDialOrder {
    public static final AigcDialOrder INSTANCE = new AigcDialOrder();

    private AigcDialOrder() {
    }

    @JvmStatic
    public static final BleOrderModel sendCreateResult(int result) {
        return new BleOrderModel("发送aigc表盘图片生成结果", new byte[]{-22, 0, 4, 0, 17, 5, (byte) result}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendResult(int state, int errorCode) {
        return new BleOrderModel("发送aigc表盘图片", new byte[]{-22, 0, 5, 0, 17, 6, (byte) state, (byte) errorCode}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendSpeakResult(int resultCode, int runCode, String result, int overLength, int max) {
        Intrinsics.checkNotNullParameter(result, "result");
        byte[] bArr = {-22, 0, 0, 0, 17, 2, (byte) resultCode, (byte) runCode, result.length() >= max ? (byte) 1 : (byte) overLength};
        byte[] bytes = result.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(bArr, BleUtil.addBytes(new byte[]{(byte) (bytes.length / 256), (byte) (bytes.length % 256)}, bytes));
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("语音转换结果", handleMessageBytes, false, 0, 12, null);
    }

    public static /* synthetic */ BleOrderModel sendStyleResult$default(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return sendStyleResult(str, i);
    }

    @JvmStatic
    public static final BleOrderModel sendStyleResult(String styleName, int clearOld) {
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        byte[] bytes = styleName.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(new byte[]{-22, 0, 0, 0, 17, 4, (byte) clearOld}, bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("发送aigc绘图当前风格", handleMessageBytes, false, 0, 12, null);
    }
}
