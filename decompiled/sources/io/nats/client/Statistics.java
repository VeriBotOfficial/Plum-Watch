package io.nats.client;

/* loaded from: classes6.dex */
public interface Statistics {
    long getDroppedCount();

    long getInBytes();

    long getInMsgs();

    long getOutBytes();

    long getOutMsgs();

    long getReconnects();
}
