package com.wakeup.module.glasses.order;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.iflytek.cloud.SpeechConstant;
import com.wakeup.common.Constants;
import com.wakeup.commponent.module.ble.BleOrderModel;
import kotlin.Metadata;
import org.tensorflow.lite.schema.BuiltinOptions;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: GlassesOrder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007JN\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0007J\u0016\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0007J\u0006\u0010\u001f\u001a\u00020\u0005J\u0006\u0010 \u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010#\u001a\u00020\u0005J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010'\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007J\u0006\u0010+\u001a\u00020\u0005¨\u0006,"}, d2 = {"Lcom/wakeup/module/glasses/order/GlassesOrder;", "", "<init>", "()V", "sendAudioMaxTime", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "maxTime", "", "sendVideoMaxTime", "sendKeyDefine", "keyId", "updateType", "click", "dClick", "tClick", "l2Click", "l3Click", "l4Click", "l5Click", "sendVolume", SpeechConstant.VOLUME, "switchWakeup", "isOpen", "", "syncFileCount", "type", "sendMusic", "operation", "status", "sendNavResult", "result", "sendWifiReconnect", "sendWifiConnectQuery", "sendGuideMode", "switchWifiScan", "queryWearSwitch", "setWearSwitch", "switchDirection", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "setHallSwitch", "setAutoShutdown", DOMConstants.ATTR_MODE, Constants.BundleKey.MINUTE, "fileStartCheck", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlassesOrder {
    public static final GlassesOrder INSTANCE = new GlassesOrder();

    private GlassesOrder() {
    }

    public final BleOrderModel sendAudioMaxTime(int maxTime) {
        return new BleOrderModel("发送录音最大时长", new byte[]{-22, 0, 6, 0, BuiltinOptions.ExpandDimsOptions, 1, 1, (byte) (maxTime / 256), (byte) (maxTime % 256)}, false, 0, 12, null);
    }

    public final BleOrderModel sendVideoMaxTime(int maxTime) {
        return new BleOrderModel("发送录屏最大时长", new byte[]{-22, 0, 6, 0, BuiltinOptions.ExpandDimsOptions, 1, 0, (byte) (maxTime / 256), (byte) (maxTime % 256)}, false, 0, 12, null);
    }

    public final BleOrderModel sendKeyDefine(int keyId, int updateType, int click, int dClick, int tClick, int l2Click, int l3Click, int l4Click, int l5Click) {
        return new BleOrderModel("设置按键定义", new byte[]{-22, 0, 12, 0, BuiltinOptions.ExpandDimsOptions, 2, (byte) keyId, (byte) updateType, (byte) click, (byte) dClick, (byte) tClick, (byte) l2Click, (byte) l3Click, (byte) l4Click, (byte) l5Click}, false, 0, 12, null);
    }

    public final BleOrderModel sendVolume(int volume) {
        return new BleOrderModel("音量设置", new byte[]{-22, 0, 4, 0, BuiltinOptions.ExpandDimsOptions, 3, (byte) volume}, false, 0, 12, null);
    }

    public final BleOrderModel switchWakeup(boolean isOpen) {
        return new BleOrderModel(isOpen ? "开启语音唤醒" : "关闭语音唤醒", new byte[]{-22, 0, 4, 0, BuiltinOptions.ExpandDimsOptions, 4, isOpen ? (byte) 1 : (byte) 0}, false, 0, 12, null);
    }

    public final BleOrderModel syncFileCount(int type) {
        return new BleOrderModel("同步文件数量 " + type, new byte[]{-22, 0, 4, 0, BuiltinOptions.ExpandDimsOptions, 5, (byte) type}, false, 0, 12, null);
    }

    public final BleOrderModel sendMusic(int operation, int status) {
        return new BleOrderModel("发送" + (operation == 0 ? "下载" : "删除") + " " + (status == 0 ? "开始" : "结束"), new byte[]{-22, 0, 5, 0, BuiltinOptions.ExpandDimsOptions, 8, (byte) operation, (byte) status}, false, 0, 12, null);
    }

    public final BleOrderModel sendNavResult(int result) {
        return new BleOrderModel("发送导航结果", new byte[]{-22, 0, 4, 0, BuiltinOptions.ExpandDimsOptions, 6, (byte) result}, false, 0, 12, null);
    }

    public final BleOrderModel sendWifiReconnect() {
        return new BleOrderModel("发送设备wifi 回连", new byte[]{-22, 0, 3, 0, BuiltinOptions.TileOptions, 11}, false, 0, 12, null);
    }

    public final BleOrderModel sendWifiConnectQuery() {
        return new BleOrderModel("发送设备wifi 查询连接", new byte[]{-22, 0, 3, 0, BuiltinOptions.TileOptions, 3}, false, 0, 12, null);
    }

    public final BleOrderModel sendGuideMode(boolean isOpen) {
        return new BleOrderModel("发送" + (isOpen ? "开启" : "关闭") + "引导模式", new byte[]{-22, 0, 4, 0, BuiltinOptions.ShapeOptions, 1, isOpen ? (byte) 1 : (byte) 0}, false, 0, 12, null);
    }

    public final BleOrderModel switchWifiScan(boolean isOpen) {
        byte[] bArr;
        if (isOpen) {
            bArr = new byte[]{-22, 0, 4, 0, BuiltinOptions.TileOptions, 9, 0};
        } else {
            bArr = new byte[]{-22, 0, 3, 0, BuiltinOptions.TileOptions, 12};
        }
        return new BleOrderModel("发送" + (isOpen ? "开启" : "关闭") + "WIFI扫描", bArr, false, 0, 12, null);
    }

    public final BleOrderModel queryWearSwitch() {
        return new BleOrderModel("请求佩戴状态开关", new byte[]{-22, 0, 4, 0, BuiltinOptions.ExpandDimsOptions, 10, 0}, false, 0, 12, null);
    }

    public final BleOrderModel setWearSwitch(boolean isOpen) {
        return new BleOrderModel("发送佩戴状态开关", new byte[]{-22, 0, 5, 0, BuiltinOptions.ExpandDimsOptions, 10, 1, isOpen ? (byte) 1 : (byte) 0}, false, 0, 12, null);
    }

    public final BleOrderModel switchDirection(int direction) {
        return new BleOrderModel("设置眼镜录像图像方向", new byte[]{-22, 0, 4, 0, BuiltinOptions.ExpandDimsOptions, 9, (byte) direction}, false, 0, 12, null);
    }

    public final BleOrderModel setHallSwitch(boolean isOpen) {
        return new BleOrderModel("设置霍尔开关工作模式", new byte[]{-22, 0, 4, 0, BuiltinOptions.ExpandDimsOptions, 15, isOpen ? (byte) 1 : (byte) 0}, false, 0, 12, null);
    }

    public final BleOrderModel setAutoShutdown(int mode, int minute) {
        return new BleOrderModel((mode == 0 ? "获取" : "设置").concat("自动开机"), new byte[]{-22, 0, 5, 0, BuiltinOptions.ExpandDimsOptions, 16, (byte) mode, (byte) minute}, false, 0, 12, null);
    }

    public final BleOrderModel fileStartCheck() {
        return new BleOrderModel("文件传输前的状态指令", new byte[]{-22, 0, 3, 0, BuiltinOptions.ZerosLikeOptions, 1}, false, 0, 12, null);
    }
}
