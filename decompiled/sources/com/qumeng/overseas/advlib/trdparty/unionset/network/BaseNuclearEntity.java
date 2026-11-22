package com.qumeng.overseas.advlib.trdparty.unionset.network;

import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes17.dex */
public class BaseNuclearEntity implements Serializable {

    @JSONBeanFrm.a(fieldname = "audio_brand_black_list")
    public List<String> audioBrandBlackList;

    @JSONBeanFrm.a(fieldname = "brand_black_list")
    public List<String> brandBlackList;

    @JSONBeanFrm.a(fieldname = "is_on")
    public int isOn;

    @JSONBeanFrm.a(fieldname = "timer_switch")
    public int timerSwitch = 1;

    @JSONBeanFrm.a(fieldname = "limited_count")
    public int limitedCount = 99;

    @JSONBeanFrm.a(fieldname = "interval_time")
    public int intervalTime = 600;
}
