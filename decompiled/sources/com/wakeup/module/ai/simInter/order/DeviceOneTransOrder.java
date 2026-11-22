package com.wakeup.module.ai.simInter.order;

import com.blankj.utilcode.util.SPUtils;
import com.wakeup.common.Constants;
import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: DeviceOneTransOrder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/wakeup/module/ai/simInter/order/DeviceOneTransOrder;", "", "<init>", "()V", "sendDeviceErr", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "eCode", "", "sendDeviceContent", "languageId", "content", "", "sendDeviceTransContent", "sendDeviceTtsState", "isEnd", "", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceOneTransOrder {
    public static final DeviceOneTransOrder INSTANCE = new DeviceOneTransOrder();

    private DeviceOneTransOrder() {
    }

    public final BleOrderModel sendDeviceErr(int eCode) {
        return new BleOrderModel("发送一键翻译异常情况", new byte[]{-22, 0, 0, 0, BuiltinOptions.LeakyReluOptions, 3, (byte) eCode}, false, 0, 12, null);
    }

    public final BleOrderModel sendDeviceContent(int languageId, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bArr = {-22, 0, 0, 0, BuiltinOptions.LeakyReluOptions, 4, (byte) languageId};
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] plus = ArraysKt.plus(bArr, bytes);
        plus[1] = (byte) ((plus.length - 3) / 256);
        plus[2] = (byte) ((plus.length - 3) % 256);
        Integer valueOf = Integer.valueOf(SPUtils.getInstance().getInt(Constants.SPKey.DEVICE_MTU, 20));
        if (valueOf.intValue() <= 1) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 20;
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(plus, intValue);
        Intrinsics.checkNotNullExpressionValue(handleMessageBytes, "handleMessageBytes(...)");
        return new BleOrderModel("发送原文文本", handleMessageBytes, true, intValue);
    }

    public final BleOrderModel sendDeviceTransContent(int languageId, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bArr = {-22, 0, 0, 0, BuiltinOptions.LeakyReluOptions, 5, (byte) languageId};
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] plus = ArraysKt.plus(bArr, bytes);
        plus[1] = (byte) ((plus.length - 3) / 256);
        plus[2] = (byte) ((plus.length - 3) % 256);
        Integer valueOf = Integer.valueOf(SPUtils.getInstance().getInt(Constants.SPKey.DEVICE_MTU, 20));
        if (valueOf.intValue() <= 1) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 20;
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(plus, intValue);
        Intrinsics.checkNotNullExpressionValue(handleMessageBytes, "handleMessageBytes(...)");
        return new BleOrderModel("发送译文文本", handleMessageBytes, true, intValue);
    }

    public final BleOrderModel sendDeviceTtsState(boolean isEnd) {
        return new BleOrderModel("发送一键翻译TTS播报状态", new byte[]{-22, 0, 4, 0, BuiltinOptions.LeakyReluOptions, 7, (byte) (isEnd ? 3 : 1)}, false, 0, 12, null);
    }
}
