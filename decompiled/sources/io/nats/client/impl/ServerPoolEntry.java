package io.nats.client.impl;

import io.nats.client.support.NatsUri;

/* loaded from: classes6.dex */
public class ServerPoolEntry {
    public int failedAttempts;
    public boolean isGossiped;
    public long lastAttempt;
    public NatsUri nuri;

    public ServerPoolEntry(NatsUri natsUri, boolean z) {
        this.nuri = natsUri;
        this.isGossiped = z;
    }

    public String toString() {
        return this.nuri + " " + this.isGossiped + "/" + this.failedAttempts;
    }
}
