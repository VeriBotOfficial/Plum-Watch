package com.wakeup.module.device.work.analyzer;

import android.os.Bundle;
import com.blankj.utilcode.util.SPUtils;
import com.wakeup.common.Constants;
import com.wakeup.common.PreferencesUtils;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.storage.DeviceLocalSupports;
import com.wakeup.common.utils.ByteUtils;
import com.wakeup.commponent.module.device.BleOrderAnalyzer;
import com.wakeup.commponent.module.device.EventType;
import com.wakeup.module.device.work.DeviceEventMgr;
import java.util.List;

/* loaded from: classes4.dex */
public class DialAnalyzer implements BleOrderAnalyzer {
    private static final String TAG = "DialAnalyzer";

    @Override // com.wakeup.commponent.module.device.BleOrderAnalyzer
    public void analyzeOrder(String str, byte[] bArr, List<Integer> list) {
        int intValue = list.get(0).intValue();
        if (intValue == 173) {
            int intValue2 = list.get(1).intValue();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(list.get(2));
            stringBuffer.append(list.get(3));
            int parseInt = Integer.parseInt(stringBuffer.toString());
            int intValue3 = list.get(4).intValue();
            int intValue4 = list.size() > 5 ? list.get(5).intValue() : 0;
            LogUtils.i(TAG, "analyzeOrder image dial length = " + intValue2 + "    index = " + parseInt + "    status = " + intValue3 + "   type = " + intValue4);
            DeviceEventMgr.send(EventType.TYPE_DEVICE_ALBUM_DIAL_TRANSFER, intValue4, Integer.valueOf(parseInt));
            return;
        }
        if (intValue == 176) {
            int intValue5 = list.get(1).intValue();
            byte[] subBytes = ByteUtils.subBytes(bArr, 2, 2);
            LogUtils.i(TAG, "bytes = " + ByteUtils.bytesToHexStr(bArr) + "    b = " + ByteUtils.bytesToHexStr(subBytes));
            short byte2Short = ByteUtils.byte2Short(subBytes);
            LogUtils.i(TAG, "analyzeOrder dial length = " + intValue5 + "    index = " + ((int) byte2Short) + "    status = " + list.get(4).intValue());
            DeviceEventMgr.send(EventType.TYPE_DEVICE_DIAL_TRANSFER, 0, Integer.valueOf(byte2Short));
            return;
        }
        if (intValue == 178) {
            int intValue6 = list.get(1).intValue();
            byte[] subBytes2 = ByteUtils.subBytes(bArr, 2, 2);
            LogUtils.i(TAG, "bytes = " + ByteUtils.bytesToHexStr(bArr) + "    b = " + ByteUtils.bytesToHexStr(subBytes2));
            short byte2Short2 = ByteUtils.byte2Short(subBytes2);
            int intValue7 = list.get(4).intValue();
            LogUtils.i(TAG, "analyzeOrder barrage length = " + intValue6 + "    index = " + ((int) byte2Short2) + "    status = " + intValue7);
            Bundle bundle = new Bundle();
            bundle.putInt(Constants.BundleKey.PARAM_1, byte2Short2);
            bundle.putInt(Constants.BundleKey.PARAM_2, intValue7);
            DeviceEventMgr.send(EventType.TYPE_DEVICE_BARRAGE_TRANSFER, 0, bundle);
            return;
        }
        if (list.size() >= 5 && list.get(4).intValue() == 167 && intValue == 171) {
            short byte2Short3 = ByteUtils.byte2Short(ByteUtils.subBytes(bArr, 6, 2));
            int intValue8 = list.get(8).intValue();
            int i = byte2Short3 <= 512 ? byte2Short3 - 3 : 512;
            int type = DeviceLocalSupports.getType(str);
            boolean z = (type == 2 || type == 5 || type == 7 || type == 11 || type == 13) ? false : true;
            if (intValue8 <= 6 && z && i >= 256) {
                i = 253;
            }
            LogUtils.i(TAG, "device mtu = " + i);
            PreferencesUtils.putInt(str + "_majorVersion", intValue8);
            SPUtils.getInstance().put(Constants.SPKey.DEVICE_MTU, i);
            DeviceEventMgr.send(EventType.TYPE_DEVICE_MTU, 0, Integer.valueOf(i));
        }
    }
}
