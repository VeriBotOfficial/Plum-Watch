package io.nats.client;

/* loaded from: classes6.dex */
public interface MessageHandler {
    void onMessage(Message message) throws InterruptedException;
}
