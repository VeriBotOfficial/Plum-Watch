package io.nats.client.impl;

import io.nats.client.api.StreamInfo;
import io.nats.client.support.JsonValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
class StreamListReader extends AbstractListReader {
    List<StreamInfo> streams;

    StreamListReader() {
        super("streams", "subject");
        this.streams = new ArrayList();
    }

    @Override // io.nats.client.impl.AbstractListReader
    void processItems(List<JsonValue> list) {
        Iterator<JsonValue> it = list.iterator();
        while (it.hasNext()) {
            this.streams.add(new StreamInfo(it.next()));
        }
    }

    List<StreamInfo> getStreams() {
        return this.streams;
    }
}
