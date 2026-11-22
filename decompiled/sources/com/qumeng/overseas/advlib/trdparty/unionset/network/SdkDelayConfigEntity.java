package com.qumeng.overseas.advlib.trdparty.unionset.network;

import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes17.dex */
public class SdkDelayConfigEntity implements Serializable {

    @JSONBeanFrm.a(fieldname = "default_time")
    public int defaultTime;

    @JSONBeanFrm.a(fieldname = "sdk_delay_switch")
    public Map<String, Integer> sdkDelaySwitch;

    @JSONBeanFrm.a(fieldname = "sdk_delay_time")
    public Map<String, Integer> sdkDelayTime;
}
