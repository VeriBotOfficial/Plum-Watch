package io.nats.client.impl;

import io.nats.client.JetStreamApiException;
import io.nats.client.Message;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import java.util.List;

/* loaded from: classes6.dex */
abstract class AbstractListReader {
    protected ListRequestEngine engine;
    private final String filterFieldName;
    private final String objectName;

    abstract void processItems(List<JsonValue> list);

    void process(Message message) throws JetStreamApiException {
        ListRequestEngine listRequestEngine = new ListRequestEngine(message);
        this.engine = listRequestEngine;
        processItems(JsonValueUtils.readArray(listRequestEngine.getJv(), this.objectName));
    }

    AbstractListReader(String str) {
        this(str, null);
    }

    AbstractListReader(String str, String str2) {
        this.objectName = str;
        this.filterFieldName = str2;
        this.engine = new ListRequestEngine();
    }

    byte[] nextJson() {
        return this.engine.internalNextJson();
    }

    byte[] nextJson(String str) {
        String str2 = this.filterFieldName;
        if (str2 == null) {
            throw new IllegalArgumentException("Filter not supported.");
        }
        return this.engine.internalNextJson(str2, str);
    }

    boolean hasMore() {
        return this.engine.hasMore();
    }
}
