package io.nats.client.impl;

import io.nats.client.AuthHandler;
import io.nats.client.NKey;

/* loaded from: classes6.dex */
class StringAuthHandler implements AuthHandler {
    private char[] jwt;
    private char[] nkey;

    StringAuthHandler(char[] cArr, char[] cArr2) {
        this.jwt = cArr;
        this.nkey = cArr2;
    }

    @Override // io.nats.client.AuthHandler
    public byte[] sign(byte[] bArr) {
        try {
            NKey fromSeed = NKey.fromSeed(this.nkey);
            byte[] sign = fromSeed.sign(bArr);
            fromSeed.clear();
            return sign;
        } catch (Exception e) {
            throw new IllegalStateException("problem signing nonce", e);
        }
    }

    @Override // io.nats.client.AuthHandler
    public char[] getID() {
        try {
            NKey fromSeed = NKey.fromSeed(this.nkey);
            char[] publicKey = fromSeed.getPublicKey();
            fromSeed.clear();
            return publicKey;
        } catch (Exception e) {
            throw new IllegalStateException("problem getting public key", e);
        }
    }

    @Override // io.nats.client.AuthHandler
    public char[] getJWT() {
        return this.jwt;
    }
}
