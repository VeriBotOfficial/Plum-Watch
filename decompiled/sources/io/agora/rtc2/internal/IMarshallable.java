package io.agora.rtc2.internal;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public interface IMarshallable {
    void marshall(ByteBuffer buf);

    byte[] marshall();

    void unmarshall(ByteBuffer buf);

    void unmarshall(byte[] buf);
}
