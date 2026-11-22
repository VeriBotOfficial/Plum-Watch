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

/* compiled from: DeviceSimInterOrder.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007¨\u0006\u0010"}, d2 = {"Lcom/wakeup/module/ai/simInter/order/DeviceSimInterOrder;", "", "<init>", "()V", "sendDeviceSimInterContent", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "isStream", "", "isAsr", "content", "", "sendDeviceSimInterState", "state", "", "sendDeviceSimInterTtsState", "isEnd", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceSimInterOrder {
    public static final DeviceSimInterOrder INSTANCE = new DeviceSimInterOrder();

    private DeviceSimInterOrder() {
    }

    public final BleOrderModel sendDeviceSimInterContent(boolean isStream, boolean isAsr, String content) {
        String str;
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bArr = {-22, 0, 0, 0, BuiltinOptions.BidirectionalSequenceRNNOptions, 3, isStream ? (byte) 0 : isAsr ? (byte) 1 : (byte) 2};
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
        if (isStream) {
            str = "流式ASR";
        } else {
            str = isAsr ? "ASR" : "翻译";
        }
        String concat = "发送同传".concat(str);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(plus, intValue);
        Intrinsics.checkNotNullExpressionValue(handleMessageBytes, "handleMessageBytes(...)");
        return new BleOrderModel(concat, handleMessageBytes, true, intValue);
    }

    public final BleOrderModel sendDeviceSimInterState(int state) {
        return new BleOrderModel("发送同传状态", new byte[]{-22, 0, 4, 0, BuiltinOptions.BidirectionalSequenceRNNOptions, 6, (byte) state}, false, 0, 12, null);
    }

    public final BleOrderModel sendDeviceSimInterTtsState(boolean isEnd) {
        return new BleOrderModel("发送同传TTS播报状态", new byte[]{-22, 0, 4, 0, BuiltinOptions.BidirectionalSequenceRNNOptions, 5, (byte) (isEnd ? 2 : 1)}, false, 0, 12, null);
    }
}
