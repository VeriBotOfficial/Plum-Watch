package io.nats.client.api;

import com.baidu.mapapi.http.wrapper.HttpManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public enum KeyValueOperation {
    PUT(HttpManager.HTTP_PUT),
    DELETE("DEL"),
    PURGE("PURGE");

    private static final Map<String, KeyValueOperation> strEnumHash = new HashMap();
    private final String headerValue;

    static {
        for (KeyValueOperation keyValueOperation : values()) {
            strEnumHash.put(keyValueOperation.headerValue, keyValueOperation);
        }
    }

    KeyValueOperation(String str) {
        this.headerValue = str;
    }

    public String getHeaderValue() {
        return this.headerValue;
    }

    public static KeyValueOperation getOrDefault(String str, KeyValueOperation keyValueOperation) {
        KeyValueOperation keyValueOperation2 = str == null ? null : strEnumHash.get(str.toUpperCase());
        return keyValueOperation2 == null ? keyValueOperation : keyValueOperation2;
    }
}
