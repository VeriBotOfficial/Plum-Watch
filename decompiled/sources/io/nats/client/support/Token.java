package io.nats.client.support;

import java.nio.charset.StandardCharsets;

/* loaded from: classes6.dex */
public class Token {
    private int end;
    private boolean hasValue;
    private final byte[] serialized;
    private final int start;
    private final TokenType type;

    public Token(byte[] bArr, int i, Token token, TokenType tokenType) {
        this(bArr, i, token.end + (token.type == TokenType.KEY ? 2 : 1), tokenType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r6[r8] != 13) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        mustBeCrlf(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        r5.hasValue = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Token(byte[] r6, int r7, int r8, io.nats.client.support.TokenType r9) {
        /*
            r5 = this;
            r5.<init>()
            r5.serialized = r6
            java.lang.String r0 = "Invalid header composition"
            if (r8 >= r7) goto L81
            r1 = r6[r8]
            r2 = 32
            r3 = 1
            if (r1 != r2) goto L21
            io.nats.client.support.TokenType r7 = io.nats.client.support.TokenType.SPACE
            r5.type = r7
            r5.start = r8
            r5.end = r8
        L18:
            int r8 = r8 + r3
            r7 = r6[r8]
            if (r7 != r2) goto L20
            r5.end = r8
            goto L18
        L20:
            return
        L21:
            r4 = 13
            if (r1 != r4) goto L32
            r5.mustBeCrlf(r7, r8)
            io.nats.client.support.TokenType r6 = io.nats.client.support.TokenType.CRLF
            r5.type = r6
            r5.start = r8
            int r8 = r8 + r3
            r5.end = r8
            return
        L32:
            io.nats.client.support.TokenType r1 = io.nats.client.support.TokenType.CRLF
            if (r9 == r1) goto L7b
            io.nats.client.support.TokenType r1 = io.nats.client.support.TokenType.SPACE
            if (r9 == r1) goto L7b
            if (r9 == 0) goto L53
            io.nats.client.support.TokenType r1 = io.nats.client.support.TokenType.TEXT
            if (r9 != r1) goto L41
            goto L53
        L41:
            io.nats.client.support.TokenType r1 = io.nats.client.support.TokenType.WORD
            if (r9 != r1) goto L4b
            io.nats.client.support.TokenType r9 = io.nats.client.support.TokenType.WORD
            r5.type = r9
            r9 = r4
            goto L59
        L4b:
            io.nats.client.support.TokenType r9 = io.nats.client.support.TokenType.KEY
            r5.type = r9
            r2 = 58
            r9 = r2
            goto L59
        L53:
            io.nats.client.support.TokenType r9 = io.nats.client.support.TokenType.TEXT
            r5.type = r9
            r9 = r4
            r2 = r9
        L59:
            r5.start = r8
            r5.end = r8
        L5d:
            int r8 = r8 + r3
            if (r8 >= r7) goto L69
            r1 = r6[r8]
            if (r1 == r2) goto L69
            if (r1 == r9) goto L69
            r5.end = r8
            goto L5d
        L69:
            if (r8 >= r7) goto L75
            r6 = r6[r8]
            if (r6 != r4) goto L72
            r5.mustBeCrlf(r7, r8)
        L72:
            r5.hasValue = r3
            return
        L75:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            throw r6
        L7b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            throw r6
        L81:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nats.client.support.Token.<init>(byte[], int, int, io.nats.client.support.TokenType):void");
    }

    private void mustBeCrlf(int i, int i2) {
        int i3 = i2 + 1;
        if (i3 >= i || this.serialized[i3] != 10) {
            throw new IllegalArgumentException(NatsConstants.INVALID_HEADER_COMPOSITION);
        }
    }

    public void mustBe(TokenType tokenType) {
        if (this.type != tokenType) {
            throw new IllegalArgumentException(NatsConstants.INVALID_HEADER_COMPOSITION);
        }
    }

    public boolean isType(TokenType tokenType) {
        return this.type == tokenType;
    }

    public boolean hasValue() {
        return this.hasValue;
    }

    public String getValue() {
        if (!this.hasValue) {
            return "";
        }
        byte[] bArr = this.serialized;
        int i = this.start;
        return new String(bArr, i, (this.end - i) + 1, StandardCharsets.US_ASCII).trim();
    }

    public boolean samePoint(Token token) {
        return this.start == token.start && this.end == token.end && this.type == token.type;
    }
}
