package com.qumeng.overseas.advlib.trdparty.unionset.network;

import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class ScanAdBlockerDetection implements Serializable {

    @JSONBeanFrm.a(fieldname = "is_enable_scanning")
    public int isEnableScanning;

    @JSONBeanFrm.a(fieldname = "scan_interval_time")
    public int scanIntervalTime;
}
