package com.wakeup.module.device.work.analyzer;

import com.wakeup.common.log.LogUtils;
import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.device.BleOrderAnalyzer;
import com.wakeup.commponent.module.device.EventType;
import com.wakeup.module.device.work.DeviceEventMgr;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: CameraControlAnalyzer.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/wakeup/module/device/work/analyzer/CameraControlAnalyzer;", "Lcom/wakeup/commponent/module/device/BleOrderAnalyzer;", "<init>", "()V", "TAG", "", "analyzeOrder", "", "mac", ApiConstants.BYTES, "", "datas", "", "", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CameraControlAnalyzer implements BleOrderAnalyzer {
    private final String TAG = "CameraControlAnalyzer";

    @Override // com.wakeup.commponent.module.device.BleOrderAnalyzer
    public void analyzeOrder(String mac, byte[] bytes, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(datas, "datas");
        if (datas.size() < 6) {
            return;
        }
        int intValue = datas.get(0).intValue();
        if (datas.get(4).intValue() == 21 && intValue == 234) {
            int intValue2 = datas.get(5).intValue();
            if (intValue2 != 1) {
                if (intValue2 != 2) {
                    return;
                }
                LogUtils.d(this.TAG, "switching front and rear cameras");
                DeviceEventMgr.send(EventType.TYPE_WATCH_SWITCH_CAMERA);
                return;
            }
            if (datas.size() < 7) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", datas.get(6).intValue());
            jSONObject.put("width", -1);
            jSONObject.put("height", -1);
            if (datas.size() >= 11) {
                int bytesToInt = BleUtil.bytesToInt(BleUtil.subBytes(bytes, 7, 2));
                int bytesToInt2 = BleUtil.bytesToInt(BleUtil.subBytes(bytes, 9, 2));
                jSONObject.put("width", bytesToInt);
                jSONObject.put("height", bytesToInt2);
            }
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            LogUtils.d(this.TAG, "watch shake photo = " + jSONObject2);
            DeviceEventMgr.send(EventType.TYPE_WATCH_SHAKE_PHOTO, 0, jSONObject2);
        }
    }
}
