package com.wakeup.common.network.host;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public enum EnvEnum {
    SIT(102, "sit", "测试环境"),
    PRO(104, "pro", "生产环境");

    public int code;
    public String des;
    public String env;

    EnvEnum(int code, String name, String des) {
        this.code = code;
        this.env = name;
        this.des = des;
    }

    public static EnvEnum parse(int code) {
        for (EnvEnum envEnum : values()) {
            if (envEnum.code == code) {
                return envEnum;
            }
        }
        return null;
    }

    public static EnvEnum parse(String env) {
        if (TextUtils.isEmpty(env)) {
            return null;
        }
        for (EnvEnum envEnum : values()) {
            if (envEnum.env.equalsIgnoreCase(env)) {
                return envEnum;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EnvEnum{code=" + this.code + ", env='" + this.env + "', des='" + this.des + "'}";
    }
}
