package io.nats.client.impl;

import io.nats.client.support.JsonValue;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
abstract class StringListReader extends AbstractListReader {
    List<String> strings;

    StringListReader(String str) {
        this(str, null);
    }

    StringListReader(String str, String str2) {
        super(str, str2);
        this.strings = new ArrayList();
    }

    @Override // io.nats.client.impl.AbstractListReader
    void processItems(List<JsonValue> list) {
        for (JsonValue jsonValue : list) {
            if (jsonValue.string != null) {
                this.strings.add(jsonValue.string);
            }
        }
    }

    List<String> getStrings() {
        return this.strings;
    }
}
