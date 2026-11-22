package com.wakeup.module.device.trans;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.wakeup.common.Constants;
import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import com.wakeup.commponent.module.ble.WatchBleOrder;
import com.wakeup.commponent.module.device.work.CustomDialBean;
import com.wakeup.commponent.module.device.work.CustomVideoBean;
import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferOrder.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0007H\u0007J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J(\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0007J\u0018\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0007J \u0010 \u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0007J0\u0010\"\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010$\u001a\u00020%H\u0007J0\u0010(\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u0007H\u0007J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010$\u001a\u00020-H\u0007¨\u0006."}, d2 = {"Lcom/wakeup/module/device/trans/TransferOrder;", "", "<init>", "()V", "startSendPic", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "dataLength", "", HiAnalyticsConstant.Direction.REQUEST, "crc", "end", "fileSize", "", "sendImageContent", "data", "", "sendImageContentAi", "assemblyImageContent", ApiConstants.SEQ, "sendMultipleWatchBitmapNum", "watchBgNum", "sendCustomPuzzle", "isPuzzle", "", "sendModuleDial", "bigModel", "smallModel1", "smallModel2", "smallModel3", "sendMenuBgState", "state", "errorCode", "sendTransferState", "type", "startSendPicAi", "sendStyleNew", Constants.BundleKey.BEAN, "Lcom/wakeup/commponent/module/device/work/CustomDialBean;", "sendStyle", "sendStyleAi", "sendBarragePackage", "sendBarrageData", "mtu", "assemblyBarrageData", "sendStyleVideo", "Lcom/wakeup/commponent/module/device/work/CustomVideoBean;", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransferOrder {
    public static final TransferOrder INSTANCE = new TransferOrder();

    private TransferOrder() {
    }

    @JvmStatic
    public static final BleOrderModel startSendPic(int dataLength, int req, int crc, int end, long fileSize) {
        return new BleOrderModel(WatchBleOrder.SEND_PIC_ORDER, new byte[]{-83, (byte) (dataLength / 256), (byte) (dataLength % 256), (byte) (req / 256), (byte) (req % 256), (byte) (crc / 256), (byte) (crc % 256), (byte) end, (byte) ((fileSize >> 24) & 255), (byte) ((fileSize >> 16) & 255), (byte) ((fileSize >> 8) & 255), (byte) (fileSize & 255)}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendImageContent(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        BleOrderModel bleOrderModel = new BleOrderModel(WatchBleOrder.SEND_PIC_CONTENT_ORDER, data, false, 0, 12, null);
        bleOrderModel.setSplitNum(128);
        return bleOrderModel;
    }

    @JvmStatic
    public static final BleOrderModel sendImageContentAi(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        BleOrderModel bleOrderModel = new BleOrderModel("中科AIGC图片", data, false, 0, 12, null);
        bleOrderModel.setSplitNum(128);
        return bleOrderModel;
    }

    @JvmStatic
    public static final byte[] assemblyImageContent(int seq, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] addBytes = BleUtil.addBytes(new byte[]{-82, (byte) (data.length + 2), (byte) (seq / 256), (byte) (seq % 256)}, data);
        Intrinsics.checkNotNullExpressionValue(addBytes, "addBytes(...)");
        return addBytes;
    }

    @JvmStatic
    public static final BleOrderModel sendMultipleWatchBitmapNum(int watchBgNum) {
        return new BleOrderModel("自定义表盘-背景图片个数", new byte[]{-85, 0, 4, -1, -83, Byte.MIN_VALUE, (byte) watchBgNum}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendCustomPuzzle(boolean isPuzzle) {
        return new BleOrderModel("发送是拼图表盘", new byte[]{-22, 0, 4, 0, 8, 0, isPuzzle ? (byte) 1 : (byte) 0}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendModuleDial(int bigModel, int smallModel1, int smallModel2, int smallModel3) {
        return new BleOrderModel("发送模块表盘", new byte[]{-22, 0, 7, 0, 10, 1, (byte) bigModel, (byte) smallModel1, (byte) smallModel2, (byte) smallModel3}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendMenuBgState(int state, int errorCode) {
        return new BleOrderModel("发送菜单背景状态", new byte[]{-22, 0, 6, 0, 15, 1, 0, (byte) state, (byte) errorCode}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendTransferState(int state, int errorCode, int type) {
        return new BleOrderModel("发送菜单背景状态", new byte[]{-22, 0, 6, 0, 13, 2, (byte) type, (byte) state, (byte) errorCode}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel startSendPicAi(int dataLength, int req, int crc, int end, long fileSize) {
        return new BleOrderModel(WatchBleOrder.SEND_PIC_ORDER_AI, new byte[]{-83, (byte) (dataLength / 256), (byte) (dataLength % 256), (byte) (req / 256), (byte) (req % 256), (byte) (crc / 256), (byte) (crc % 256), (byte) end, (byte) ((fileSize >> 24) & 255), (byte) ((fileSize >> 16) & 255), (byte) ((fileSize >> 8) & 255), (byte) (fileSize & 255), 1}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendStyleNew(CustomDialBean bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        return new BleOrderModel("自定义表盘 新样式", new byte[]{-22, 0, 9, 0, 13, 1, (byte) bean.getR(), (byte) bean.getG(), (byte) bean.getB(), (byte) bean.getFont(), (byte) bean.getLocation(), (byte) bean.getFunctionType()}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendStyle(CustomDialBean bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        return new BleOrderModel(WatchBleOrder.SEND_STYLE_ORDER, new byte[]{-85, 0, 7, -1, -100, (byte) bean.getR(), (byte) bean.getG(), (byte) bean.getB(), (byte) bean.getFont(), (byte) bean.getLocation()}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendStyleAi(CustomDialBean bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        return new BleOrderModel(WatchBleOrder.SEND_STYLE_ORDER_AI, new byte[]{-85, 0, 8, -1, -100, (byte) bean.getR(), (byte) bean.getG(), (byte) bean.getB(), (byte) bean.getFont(), (byte) bean.getLocation(), 1}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendBarragePackage(int dataLength, int req, int crc, int end, long fileSize) {
        return new BleOrderModel("发送弹幕图片传输包信息", new byte[]{-78, (byte) (dataLength / 256), (byte) (dataLength % 256), (byte) (req / 256), (byte) (req % 256), (byte) (crc / 256), (byte) (crc % 256), (byte) end, (byte) ((fileSize >> 24) & 255), (byte) ((fileSize >> 16) & 255), (byte) ((fileSize >> 8) & 255), (byte) (fileSize & 255)}, false, 0, 12, null);
    }

    @JvmStatic
    public static final BleOrderModel sendBarrageData(byte[] data, int mtu) {
        Intrinsics.checkNotNullParameter(data, "data");
        BleOrderModel bleOrderModel = new BleOrderModel("中科弹幕图片", data, false, 0, 12, null);
        bleOrderModel.setSplitNum(mtu);
        return bleOrderModel;
    }

    @JvmStatic
    public static final byte[] assemblyBarrageData(int seq, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] addBytes = BleUtil.addBytes(new byte[]{-79, (byte) ((data.length + 2) / 256), (byte) ((data.length + 2) % 256), (byte) (seq / 256), (byte) (seq % 256)}, data);
        Intrinsics.checkNotNullExpressionValue(addBytes, "addBytes(...)");
        return addBytes;
    }

    @JvmStatic
    public static final BleOrderModel sendStyleVideo(CustomVideoBean bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        return new BleOrderModel("视频表盘样式", new byte[]{-22, 0, 9, 0, 13, 1, (byte) bean.getR(), (byte) bean.getG(), (byte) bean.getB(), (byte) bean.getFont(), (byte) bean.getLocation(), (byte) bean.getFunctionType()}, false, 0, 12, null);
    }
}
