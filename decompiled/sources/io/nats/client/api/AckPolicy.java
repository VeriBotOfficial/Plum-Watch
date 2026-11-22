package io.nats.client.api;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public enum AckPolicy {
    None("none"),
    All("all"),
    Explicit("explicit");

    private static final Map<String, AckPolicy> strEnumHash = new HashMap();
    private String policy;

    static {
        for (AckPolicy ackPolicy : values()) {
            strEnumHash.put(ackPolicy.toString(), ackPolicy);
        }
    }

    AckPolicy(String str) {
        this.policy = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.policy;
    }

    public static AckPolicy get(String str) {
        return strEnumHash.get(str);
    }
}
