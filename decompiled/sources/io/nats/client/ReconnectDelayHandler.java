package io.nats.client;

import java.time.Duration;

/* loaded from: classes6.dex */
public interface ReconnectDelayHandler {
    Duration getWaitTime(long j);
}
