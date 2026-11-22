package io.nats.client.impl;

import io.nats.client.api.ConsumerInfo;
import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
class ConsumerListReader extends AbstractListReader {
    List<ConsumerInfo> consumers;

    ConsumerListReader() {
        super(ApiConstants.CONSUMERS);
        this.consumers = new ArrayList();
    }

    @Override // io.nats.client.impl.AbstractListReader
    protected void processItems(List<JsonValue> list) {
        Iterator<JsonValue> it = list.iterator();
        while (it.hasNext()) {
            this.consumers.add(new ConsumerInfo(it.next()));
        }
    }

    public List<ConsumerInfo> getConsumers() {
        return this.consumers;
    }
}
