package com.wakeup.module.pay.aliPay;

import android.text.TextUtils;
import com.alipay.sdk.m.y.o;
import java.util.Map;

/* loaded from: classes4.dex */
public class AliPayResult {
    private String memo;
    private String result;
    private String resultStatus;

    public AliPayResult(Map<String, String> map) {
        if (map == null) {
            return;
        }
        for (String str : map.keySet()) {
            if (TextUtils.equals(str, o.f1496a)) {
                this.resultStatus = map.get(str);
            } else if (TextUtils.equals(str, "result")) {
                this.result = map.get(str);
            } else if (TextUtils.equals(str, o.b)) {
                this.memo = map.get(str);
            }
        }
    }

    public String toString() {
        return "resultStatus={" + this.resultStatus + "};memo={" + this.memo + "};result={" + this.result + "}";
    }

    public String getResultStatus() {
        return this.resultStatus;
    }

    public String getMemo() {
        return this.memo;
    }

    public String getResult() {
        return this.result;
    }
}
