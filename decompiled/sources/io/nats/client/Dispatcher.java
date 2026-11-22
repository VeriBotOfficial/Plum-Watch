package io.nats.client;

/* loaded from: classes6.dex */
public interface Dispatcher extends Consumer {
    Dispatcher subscribe(String str);

    Dispatcher subscribe(String str, String str2);

    Subscription subscribe(String str, MessageHandler messageHandler);

    Subscription subscribe(String str, String str2, MessageHandler messageHandler);

    Dispatcher unsubscribe(Subscription subscription);

    Dispatcher unsubscribe(Subscription subscription, int i);

    Dispatcher unsubscribe(String str);

    Dispatcher unsubscribe(String str, int i);
}
