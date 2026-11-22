package com.wakeup.feature.health.fatigue.order;

import com.blankj.utilcode.util.SPUtils;
import com.wakeup.common.Constants;
import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: WriteNoiseOrder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/wakeup/feature/health/fatigue/order/WriteNoiseOrder;", "", "<init>", "()V", "Companion", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WriteNoiseOrder {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: WriteNoiseOrder.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000b¨\u0006\u000e"}, d2 = {"Lcom/wakeup/feature/health/fatigue/order/WriteNoiseOrder$Companion;", "", "<init>", "()V", "sendName", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "name", "", "sendFail", "sendPlayState", "state", "", "sendPlayModel", "model", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BleOrderModel sendName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            byte[] bArr = {-22, 0, 0, 0, BuiltinOptions.LessEqualOptions, 2, 1};
            byte[] bytes = name.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] plus = ArraysKt.plus(bArr, bytes);
            plus[1] = (byte) ((plus.length - 3) / 256);
            plus[2] = (byte) ((plus.length - 3) % 256);
            SPUtils.getInstance().getInt(Constants.SPKey.DEVICE_MTU);
            byte[] handleMessageBytes = BleUtil.handleMessageBytes(plus);
            Intrinsics.checkNotNullExpressionValue(handleMessageBytes, "handleMessageBytes(...)");
            return new BleOrderModel("发送白噪音音频名", handleMessageBytes, true, 20);
        }

        public final BleOrderModel sendFail() {
            return new BleOrderModel("发送获取白噪音失败", new byte[]{-22, 0, 4, 0, BuiltinOptions.LessEqualOptions, 2, 0}, false, 0, 12, null);
        }

        public final BleOrderModel sendPlayState(int state) {
            return new BleOrderModel("发送白噪音播放状态", new byte[]{-22, 0, 4, 0, BuiltinOptions.LessEqualOptions, 3, (byte) state}, false, 0, 12, null);
        }

        public final BleOrderModel sendPlayModel(int model) {
            return new BleOrderModel("发送播放模式", new byte[]{-22, 0, 4, 0, BuiltinOptions.LessEqualOptions, 4, (byte) model}, false, 0, 12, null);
        }
    }
}
