package io.nats.client.support;

import java.io.IOException;

/* loaded from: classes6.dex */
public class JsonParseException extends IOException {
    public JsonParseException(String str) {
        super(str);
    }

    public JsonParseException(String str, Throwable th) {
        super(str, th);
    }

    public JsonParseException(Throwable th) {
        super(th);
    }
}
