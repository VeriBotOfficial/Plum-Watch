package io.nats.client.api;

/* loaded from: classes6.dex */
public interface Watcher<T> {
    void endOfData();

    void watch(T t);
}
