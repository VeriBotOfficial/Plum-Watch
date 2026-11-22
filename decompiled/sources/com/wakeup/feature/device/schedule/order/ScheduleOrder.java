package com.wakeup.feature.device.schedule.order;

import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: ScheduleOrder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\tH\u0007¨\u0006\r"}, d2 = {"Lcom/wakeup/feature/device/schedule/order/ScheduleOrder;", "", "<init>", "()V", "scheduleOp", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "op", "", "time", "", "content", "", "scheduleId", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScheduleOrder {
    public static final ScheduleOrder INSTANCE = new ScheduleOrder();

    private ScheduleOrder() {
    }

    public static /* synthetic */ BleOrderModel scheduleOp$default(int i, long j, String str, long j2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            j2 = 0;
        }
        return scheduleOp(i, j, str, j2);
    }

    @JvmStatic
    public static final BleOrderModel scheduleOp(int op, long time, String content, long scheduleId) {
        String str;
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(new byte[]{-22, 0, 0, 0, BuiltinOptions.NotEqualOptions, 1, (byte) op, (byte) ((scheduleId >> 56) & 255), (byte) ((scheduleId >> 48) & 255), (byte) ((scheduleId >> 40) & 255), (byte) ((scheduleId >> 32) & 255), (byte) ((scheduleId >> 24) & 255), (byte) ((scheduleId >> 16) & 255), (byte) ((scheduleId >> 8) & 255), (byte) (scheduleId & 255), (byte) ((time >> 24) & 255), (byte) ((time >> 16) & 255), (byte) ((time >> 8) & 255), (byte) (time & 255), (byte) bytes.length}, bytes);
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        if (op != 1) {
            str = op != 2 ? "删除" : "修改";
        } else {
            str = "新增";
        }
        String concat = "App新日程 ".concat(str);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel(concat, handleMessageBytes, false, 0, 12, null);
    }
}
