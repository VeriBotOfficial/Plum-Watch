package com.wakeup.module.ai.appllm.order;

import com.blankj.utilcode.util.SPUtils;
import com.wakeup.common.Constants;
import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: AppLLMOrder.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u000e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0003\u001a \u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u001a\u000e\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0006\u001a\u000e\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0006\u001a\u000e\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u001a"}, d2 = {"sendWakeUPResult", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "state", "", "sendRecordStatus", "isOpen", "", "sendReminderFileStatus", "scheduleId", "", "status", "errorCode", "sendDevCtrl", "type", "flag", "sendVad", "sendLLMError", "sendLLMText", "text", "", "isUser", "isFinal", "sendLLMTextEnd", "sendTtsStatus", "isStart", "sendSearchStatus", "module-ai_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppLLMOrderKt {
    public static final BleOrderModel sendWakeUPResult(int i) {
        return new BleOrderModel("App大模型 发送唤醒结果", new byte[]{-22, 0, 4, 0, BuiltinOptions.LogicalOrOptions, 1, (byte) i}, false, 0, 12, null);
    }

    public static final BleOrderModel sendRecordStatus(boolean z) {
        return new BleOrderModel("App大模型 发送录音".concat(z ? "开启" : "关闭"), new byte[]{-22, 0, 4, 0, BuiltinOptions.LogicalOrOptions, 2, z ? (byte) 1 : (byte) 0}, false, 0, 12, null);
    }

    public static final BleOrderModel sendReminderFileStatus(long j, int i, int i2) {
        return new BleOrderModel("提醒音频文件发送状态", new byte[]{-22, 0, 13, 0, BuiltinOptions.LogicalOrOptions, 3, (byte) ((j >> 56) & 255), (byte) ((j >> 48) & 255), (byte) ((j >> 40) & 255), (byte) ((j >> 32) & 255), (byte) ((j >> 24) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 8) & 255), (byte) (j & 255), (byte) i, (byte) i2}, false, 0, 12, null);
    }

    public static /* synthetic */ BleOrderModel sendDevCtrl$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return sendDevCtrl(i, i2);
    }

    public static final BleOrderModel sendDevCtrl(int i, int i2) {
        return new BleOrderModel("设备操作意图", new byte[]{-22, 0, 6, 0, BuiltinOptions.LogicalOrOptions, 4, (byte) (i / 256), (byte) (i % 256), (byte) i2}, false, 0, 12, null);
    }

    public static final BleOrderModel sendVad() {
        return new BleOrderModel("触发vad", new byte[]{-22, 0, 4, 0, BuiltinOptions.LogicalOrOptions, 5, 1}, false, 0, 12, null);
    }

    public static final BleOrderModel sendLLMError(int i) {
        return new BleOrderModel("发送 LLM ".concat(i == 0 ? "占用" : "异常"), new byte[]{-22, 0, 4, 0, BuiltinOptions.LogicalOrOptions, 7, (byte) i}, false, 0, 12, null);
    }

    public static /* synthetic */ BleOrderModel sendLLMText$default(String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return sendLLMText(str, z, z2);
    }

    public static final BleOrderModel sendLLMText(String text, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(text, "text");
        byte[] bArr = {-22, 0, 0, 0, BuiltinOptions.LogicalOrOptions, 6, z ? (byte) 1 : (byte) 0, z2 ? (byte) 1 : (byte) 0};
        byte[] bytes = text.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] plus = ArraysKt.plus(bArr, bytes);
        plus[1] = (byte) ((plus.length - 3) / 256);
        plus[2] = (byte) ((plus.length - 3) % 256);
        return new BleOrderModel("发送 LLM 文本", plus, true, SPUtils.getInstance().getInt(Constants.SPKey.DEVICE_MTU));
    }

    public static final BleOrderModel sendLLMTextEnd(boolean z) {
        return new BleOrderModel("发送 LLM 文本结束", new byte[]{-22, 0, 5, 0, BuiltinOptions.LogicalOrOptions, 6, z ? (byte) 1 : (byte) 0, 1}, false, 0, 12, null);
    }

    public static final BleOrderModel sendTtsStatus(boolean z) {
        return new BleOrderModel("发送 TTS 状态", new byte[]{-22, 0, 4, 0, BuiltinOptions.LogicalOrOptions, 8, z ? (byte) 1 : (byte) 2}, false, 0, 12, null);
    }

    public static final BleOrderModel sendSearchStatus(boolean z) {
        return new BleOrderModel("发送深度思考开启状态", new byte[]{-22, 0, 4, 0, BuiltinOptions.LogicalOrOptions, 9, z ? (byte) 1 : (byte) 0}, false, 0, 12, null);
    }
}
