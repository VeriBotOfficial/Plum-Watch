package com.wakeup.feature.device.meeting.order;

import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: MeetingOrder.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lcom/wakeup/feature/device/meeting/order/MeetingOrder;", "", "<init>", "()V", "start", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "state", "", "id", "", "option", "action", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MeetingOrder {
    public static final MeetingOrder INSTANCE = new MeetingOrder();

    private MeetingOrder() {
    }

    public static /* synthetic */ BleOrderModel start$default(MeetingOrder meetingOrder, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        return meetingOrder.start(i, j);
    }

    public final BleOrderModel start(int state, long id2) {
        String str;
        byte[] bArr = {-22, 0, 8, 0, BuiltinOptions.SquaredDifferenceOptions, 1, (byte) state, (byte) ((id2 >> 24) & 255), (byte) ((id2 >> 16) & 255), (byte) ((id2 >> 8) & 255), (byte) (255 & id2)};
        if (state == 0) {
            str = "成功";
        } else if (state != 1) {
            str = "网络中断";
            if (state != 2 && state == 3) {
                str = "接口异常";
            }
        } else {
            str = "功能使用中";
        }
        return new BleOrderModel("会议开始 " + str + " id:" + id2, bArr, false, 0, 12, null);
    }

    public final BleOrderModel option(long id2, int action, int state) {
        String str;
        byte[] bArr = {-22, 0, 9, 0, BuiltinOptions.SquaredDifferenceOptions, 2, (byte) ((id2 >> 24) & 255), (byte) ((id2 >> 16) & 255), (byte) ((id2 >> 8) & 255), (byte) (id2 & 255), (byte) action, (byte) state};
        String str2 = "";
        if (action == 0) {
            str = "恢复会议";
        } else if (action == 1) {
            str = "暂停会议";
        } else if (action == 2) {
            str = "结束会议";
        } else if (action != 3) {
            str = "";
        } else {
            str = "请求会议总结";
        }
        if (state == 0) {
            str2 = "成功";
        } else if (state == 1) {
            str2 = "功能使用中";
        } else if (state == 2) {
            str2 = "网络中断";
        } else if (state == 3) {
            str2 = "接口异常";
        }
        return new BleOrderModel("会议操作 " + str + " - " + str2, bArr, false, 0, 12, null);
    }
}
