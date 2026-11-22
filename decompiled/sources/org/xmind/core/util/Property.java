package org.xmind.core.util;

import com.autonavi.aps.amapapi.config.Const;

/* loaded from: classes7.dex */
public class Property {
    public String key;
    public String value;

    public Property(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("The key should NOT be null in a Property.");
        }
        this.key = str;
        this.value = str2;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof Property)) {
            Property property = (Property) obj;
            if (this.key.equals(property.key) && ((str = this.value) == (str2 = property.value) || (str != null && str.equals(str2)))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.key.hashCode();
        String str = this.value;
        return str != null ? hashCode ^ str.hashCode() : hashCode;
    }

    public String toString() {
        return Const.STR_MART_JSON_BEGIN + this.key + "=" + this.value + "}";
    }
}
