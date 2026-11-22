package io.nats.client.impl;

import io.nats.client.AuthHandler;
import io.nats.client.NKey;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/* loaded from: classes6.dex */
class FileAuthHandler implements AuthHandler {
    private String credsFile;
    private String jwtFile;
    private String nkeyFile;

    FileAuthHandler(String str) {
        this.credsFile = str;
    }

    FileAuthHandler(String str, String str2) {
        this.jwtFile = str;
        this.nkeyFile = str2;
    }

    private char[] extract(CharBuffer charBuffer, int i) {
        CharBuffer allocate = CharBuffer.allocate(charBuffer.length());
        boolean z = false;
        int i2 = 0;
        loop0: while (true) {
            int i3 = -1;
            while (charBuffer.length() > 0) {
                char c = charBuffer.get();
                i3++;
                if (c == '\n' || c == '\r') {
                    if (allocate.position() > 0) {
                        break;
                    }
                    z = false;
                } else if (!z && !Character.isWhitespace(c)) {
                    if (c == '-' && i3 == 0) {
                        i2++;
                        z = true;
                    } else if (!z && i2 == i) {
                        allocate.put(c);
                    }
                }
            }
            break loop0;
        }
        if (allocate.position() == 0 && i == 1) {
            charBuffer.position(0);
            while (charBuffer.length() > 0) {
                char c2 = charBuffer.get();
                if (c2 == '\n' || c2 == '\r' || Character.isWhitespace(c2)) {
                    if (allocate.position() > 0) {
                        break;
                    }
                } else {
                    allocate.put(c2);
                }
            }
            allocate.flip();
        } else {
            allocate.flip();
        }
        char[] cArr = new char[allocate.length()];
        allocate.get(cArr);
        allocate.clear();
        for (int i4 = 0; i4 < allocate.capacity(); i4++) {
            allocate.put((char) 0);
        }
        return cArr;
    }

    private char[] readKeyChars() throws IOException {
        String str = this.credsFile;
        if (str != null) {
            byte[] readAllBytes = Files.readAllBytes(Paths.get(str, new String[0]));
            CharBuffer decode = StandardCharsets.UTF_8.decode(ByteBuffer.wrap(readAllBytes));
            char[] extract = extract(decode, 3);
            decode.clear();
            for (int i = 0; i < decode.capacity(); i++) {
                decode.put((char) 0);
            }
            for (int i2 = 0; i2 < readAllBytes.length; i2++) {
                readAllBytes[i2] = 0;
            }
            return extract;
        }
        byte[] readAllBytes2 = Files.readAllBytes(Paths.get(this.nkeyFile, new String[0]));
        CharBuffer decode2 = StandardCharsets.UTF_8.decode(ByteBuffer.wrap(readAllBytes2));
        char[] extract2 = extract(decode2, 1);
        decode2.clear();
        for (int i3 = 0; i3 < decode2.capacity(); i3++) {
            decode2.put((char) 0);
        }
        for (int i4 = 0; i4 < readAllBytes2.length; i4++) {
            readAllBytes2[i4] = 0;
        }
        return extract2;
    }

    @Override // io.nats.client.AuthHandler
    public byte[] sign(byte[] bArr) {
        try {
            NKey fromSeed = NKey.fromSeed(readKeyChars());
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
            NKey fromSeed = NKey.fromSeed(readKeyChars());
            char[] publicKey = fromSeed.getPublicKey();
            fromSeed.clear();
            return publicKey;
        } catch (Exception e) {
            throw new IllegalStateException("problem getting public key", e);
        }
    }

    @Override // io.nats.client.AuthHandler
    public char[] getJWT() {
        try {
            String str = this.jwtFile;
            String str2 = this.credsFile;
            if (str2 != null) {
                str = str2;
            }
            if (str == null) {
                return null;
            }
            byte[] readAllBytes = Files.readAllBytes(Paths.get(str, new String[0]));
            ByteBuffer wrap = ByteBuffer.wrap(readAllBytes);
            CharBuffer decode = StandardCharsets.UTF_8.decode(wrap);
            char[] extract = extract(decode, 1);
            decode.clear();
            for (int i = 0; i < decode.capacity(); i++) {
                decode.put((char) 0);
            }
            wrap.clear();
            for (int i2 = 0; i2 < readAllBytes.length; i2++) {
                readAllBytes[i2] = 0;
            }
            return extract;
        } catch (Exception e) {
            throw new IllegalStateException("problem reading jwt", e);
        }
    }
}
