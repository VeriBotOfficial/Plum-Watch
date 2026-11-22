package com.huawei.hms.mlsdk.common;

import java.util.Arrays;

/* loaded from: classes14.dex */
public final class AppSettingHolder<T> {
    private final String persistenceKey;
    private final T setting;

    public static <T> AppSettingHolder<T> create(String str, T t) {
        return new AppSettingHolder<>(str, t);
    }

    private AppSettingHolder(String str, T t) {
        if (str == null) {
            throw new NullPointerException("Null PersistentKey");
        }
        if (t == null) {
            throw new NullPointerException("Null setting");
        }
        this.persistenceKey = str;
        this.setting = t;
    }

    public final String toString() {
        String str = this.persistenceKey;
        return new StringBuilder(String.valueOf(str).length() + 97 + String.valueOf(String.valueOf(this.setting)).length()).append("MlModelDriverInstanceKey{persistentKey=").append(str).append(", setting=").append(this.setting).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppSettingHolder) {
            AppSettingHolder appSettingHolder = (AppSettingHolder) obj;
            if (this.persistenceKey.equals(appSettingHolder.persistenceKey) && this.setting.equals(appSettingHolder.setting)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.persistenceKey, this.setting});
    }
}
