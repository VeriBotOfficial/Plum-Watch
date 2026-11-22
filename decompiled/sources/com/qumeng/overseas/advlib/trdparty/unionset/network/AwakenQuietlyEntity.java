package com.qumeng.overseas.advlib.trdparty.unionset.network;

import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;

/* loaded from: classes17.dex */
public class AwakenQuietlyEntity extends BaseNuclearEntity {
    public String slotid;

    @JSONBeanFrm.a(fieldname = "is_cold_start")
    public int isColdStart = 0;

    @JSONBeanFrm.a(fieldname = "cold_start_time")
    public int coldStartTime = 5;

    @JSONBeanFrm.a(fieldname = "allow_empty_count")
    public int allowEmptyCount = 10;
}
