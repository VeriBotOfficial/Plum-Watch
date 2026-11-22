package io.nats.client.api;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public enum DeliverPolicy {
    All("all"),
    Last("last"),
    New("new"),
    ByStartSequence("by_start_sequence"),
    ByStartTime("by_start_time"),
    LastPerSubject("last_per_subject");

    private static final Map<String, DeliverPolicy> strEnumHash = new HashMap();
    private final String policy;

    static {
        for (DeliverPolicy deliverPolicy : values()) {
            strEnumHash.put(deliverPolicy.toString(), deliverPolicy);
        }
    }

    DeliverPolicy(String str) {
        this.policy = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.policy;
    }

    public static DeliverPolicy get(String str) {
        return strEnumHash.get(str);
    }
}
