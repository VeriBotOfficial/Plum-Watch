package io.nats.client.impl;

import io.nats.client.support.ApiConstants;

/* loaded from: classes6.dex */
class ConsumerNamesReader extends StringListReader {
    ConsumerNamesReader() {
        super(ApiConstants.CONSUMERS, "subject");
    }
}
