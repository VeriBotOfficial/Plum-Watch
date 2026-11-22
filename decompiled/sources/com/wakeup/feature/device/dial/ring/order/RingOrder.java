package com.wakeup.feature.device.dial.ring.order;

import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: RingOrder.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u001a\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0018\u00010\nJ\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\u0005J&\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\f¨\u0006\u0017"}, d2 = {"Lcom/wakeup/feature/device/dial/ring/order/RingOrder;", "", "<init>", "()V", "sendRingList", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "pageNum", "", Const.SP_KEY_CALL_LOC_COUNT, "nameList", "", "Lkotlin/Pair;", "", "", "sendRingPlayStatus", "operation", "typeId", "musicId", "sendRingPayStatus", "sendCurrentRing", "sendRingState", "state", "code", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RingOrder {
    public static final RingOrder INSTANCE = new RingOrder();

    private RingOrder() {
    }

    public final BleOrderModel sendRingList(int pageNum, int count, List<Pair<Long, String>> nameList) {
        byte[] bArr = {-22, 0, 0, 0, 24, 1, (byte) count, (byte) pageNum};
        if (nameList != null) {
            for (Pair<Long, String> pair : nameList) {
                byte[] addBytes = BleUtil.addBytes(bArr, new byte[]{(byte) ((pair.getFirst().longValue() >> 24) & 255), (byte) ((pair.getFirst().longValue() >> 16) & 255), (byte) ((pair.getFirst().longValue() >> 8) & 255), (byte) (255 & pair.getFirst().longValue())});
                byte[] bytes = pair.getSecond().getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                bArr = BleUtil.addBytes(addBytes, bytes);
            }
        }
        bArr[1] = (byte) ((bArr.length - 3) / 256);
        bArr[2] = (byte) ((bArr.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(bArr);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("铃声类型列表", handleMessageBytes, false, 0, 12, null);
    }

    public final BleOrderModel sendRingPlayStatus(int operation, int typeId, long musicId) {
        return new BleOrderModel("铃声的播放状态", new byte[]{-22, 0, 9, 0, 24, 2, (byte) operation, (byte) typeId, (byte) ((musicId >> 24) & 255), (byte) ((musicId >> 16) & 255), (byte) ((musicId >> 8) & 255), (byte) (musicId & 255)}, false, 0, 12, null);
    }

    public final BleOrderModel sendRingPayStatus(int operation) {
        return new BleOrderModel("铃声付费情况", new byte[]{-22, 0, 4, 0, 24, 3, (byte) operation}, false, 0, 12, null);
    }

    public final BleOrderModel sendCurrentRing() {
        return new BleOrderModel("获取设备设置的当前铃声", new byte[]{-22, 0, 3, 0, 24, 5}, false, 0, 12, null);
    }

    public final BleOrderModel sendRingState(int state, int code, int typeId, long musicId) {
        return new BleOrderModel("发送个性化铃声状态", new byte[]{-22, 0, 10, 0, 24, 4, (byte) state, (byte) code, (byte) typeId, (byte) ((musicId >> 24) & 255), (byte) ((musicId >> 16) & 255), (byte) ((musicId >> 8) & 255), (byte) (musicId & 255)}, false, 0, 12, null);
    }
}
