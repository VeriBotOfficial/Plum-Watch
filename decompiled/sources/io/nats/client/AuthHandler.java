package io.nats.client;

/* loaded from: classes6.dex */
public interface AuthHandler {
    char[] getID();

    char[] getJWT();

    byte[] sign(byte[] bArr);
}
