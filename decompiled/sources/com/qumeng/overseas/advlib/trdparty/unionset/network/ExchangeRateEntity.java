package com.qumeng.overseas.advlib.trdparty.unionset.network;

import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes17.dex */
public class ExchangeRateEntity implements Serializable {

    @JSONBeanFrm.a(fieldname = "base_code")
    public String baseCode;

    @JSONBeanFrm.a(fieldname = "conversion_rates")
    public Map<String, Double> conversionRates;

    @JSONBeanFrm.a(fieldname = "time_last_update")
    public String time_last_update;

    @JSONBeanFrm.a(fieldname = "time_last_update_unix")
    public int time_last_update_unix;

    public String getBaseCode() {
        return this.baseCode;
    }

    public Map<String, Double> getConversionRates() {
        return this.conversionRates;
    }

    public void setBaseCode(String str) {
        this.baseCode = str;
    }

    public void setConversionRates(Map<String, Double> map) {
        this.conversionRates = map;
    }
}
