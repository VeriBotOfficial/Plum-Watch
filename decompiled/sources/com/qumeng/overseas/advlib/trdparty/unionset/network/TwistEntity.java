package com.qumeng.overseas.advlib.trdparty.unionset.network;

import android.text.TextUtils;
import android.util.Pair;
import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import com.wakeup.common.functionSwitch.FunctionSwitchManager;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public class TwistEntity implements Serializable {

    @JSONBeanFrm.a(fieldname = "enable")
    public int enable;

    @JSONBeanFrm.a(fieldname = "freq_group")
    public Map<String, SlotIdSaveConfig> freqGroup;

    @JSONBeanFrm.a(fieldname = "high")
    public OffsetPos high;

    @JSONBeanFrm.a(fieldname = "low")
    public OffsetPos low;

    @JSONBeanFrm.a(fieldname = FunctionSwitchManager.KEY_MIDDLE)
    public OffsetPos middle;

    public static class OffsetPos implements Serializable {

        @JSONBeanFrm.a(fieldname = "duration")
        public int duration;

        @JSONBeanFrm.a(fieldname = "offsetX")
        public double offsetX;

        @JSONBeanFrm.a(fieldname = "offsetY")
        public double offsetY;

        @JSONBeanFrm.a(fieldname = "offsetZ")
        public double offsetZ;

        @JSONBeanFrm.a(fieldname = "time")
        public int time;

        @JSONBeanFrm.a(fieldname = "trigger_angle")
        public double triggerAngle;
    }

    public static class SlotIdSaveConfig implements Serializable {

        @JSONBeanFrm.a(fieldname = "num")
        public int num;

        @JSONBeanFrm.a(fieldname = "slot_ids")
        public List<String> slotIds;
    }

    public static Pair<String, Integer> getTwistConfigBySlotId(Map<String, SlotIdSaveConfig> map, String str) {
        if (!TextUtils.isEmpty(str) && map != null && map.size() != 0) {
            for (Map.Entry<String, SlotIdSaveConfig> entry : map.entrySet()) {
                SlotIdSaveConfig value = entry.getValue();
                List<String> list = value.slotIds;
                if (list != null && list.size() > 0 && list.contains(str)) {
                    return new Pair<>(entry.getKey(), Integer.valueOf(value.num));
                }
            }
        }
        return null;
    }
}
