package com.qweather.sdk.bean.base;

import com.wakeup.common.utils.AdvConstance;

/* loaded from: classes17.dex */
public enum Code {
    OK(AdvConstance.DEVICE_FIRMWARE_UPDATE, "成功"),
    NO_DATA(AdvConstance.WIFI_CONNECT_GLASSES, "成功, 但你查询的地区暂时没有你需要的数据。"),
    BAD_REQUEST("400", "请求错误，可能包含错误的请求参数或缺少必选的请求参数。"),
    INVALID_KEY("401", "认证失败，可能使用了错误的KEY、数字签名错误、KEY的类型错误（如使用SDK的KEY去访问Web API）。"),
    NO_MORE_REQUESTS("402", "用户的访问量已耗尽"),
    PERMISSION_DENIED("403", "无访问权限，可能是绑定的PackageName、BundleID、域名IP地址不一致，或者是需要额外付费的数据。"),
    INVALID_PARAM("404", "查询的数据或地区不存在。"),
    TOO_FAST("429", "超过限定的QPM（每分钟访问次数）"),
    INTERNET("500", "无响应或超时");

    private final String code;
    private final String txt;

    Code(String str, String str2) {
        this.code = str;
        this.txt = str2;
    }

    public String getCode() {
        return this.code;
    }

    public String getTxt() {
        return this.txt;
    }

    public static Code toEnum(String str) {
        if (str != null) {
            for (Code code : values()) {
                if (str.equalsIgnoreCase(code.getCode())) {
                    return code;
                }
            }
        }
        return INTERNET;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "{code='" + this.code + "', txt='" + this.txt + "'}";
    }
}
