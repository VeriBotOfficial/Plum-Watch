package io.nats.client.api;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public enum DiscardPolicy {
    New("new"),
    Old("old");

    private static final Map<String, DiscardPolicy> strEnumHash = new HashMap();
    private final String policy;

    static {
        for (DiscardPolicy discardPolicy : values()) {
            strEnumHash.put(discardPolicy.toString(), discardPolicy);
        }
    }

    DiscardPolicy(String str) {
        this.policy = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.policy;
    }

    public static DiscardPolicy get(String str) {
        return strEnumHash.get(str);
    }
}
