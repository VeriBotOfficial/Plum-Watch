package io.nats.client;

import io.nats.client.support.RandomUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes6.dex */
public final class NUID {
    static final int base = 62;
    static final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z'};
    private static final NUID globalNUID = new NUID();
    static final long maxInc = 333;
    static final long maxSeq = 839299365868340224L;
    static final long minInc = 33;
    static final int preLen = 12;
    static final int seqLen = 10;
    static final int totalLen = 22;
    private long seq = RandomUtils.nextLong(RandomUtils.PRAND, maxSeq);
    private long inc = RandomUtils.nextLong(RandomUtils.PRAND, 300) + minInc;
    char[] pre = new char[12];

    static NUID getInstance() {
        return globalNUID;
    }

    public NUID() {
        for (int i = 0; i < 12; i++) {
            this.pre[i] = '0';
        }
        randomizePrefix();
    }

    public static synchronized String nextGlobal() {
        String next;
        synchronized (NUID.class) {
            next = globalNUID.next();
        }
        return next;
    }

    public static synchronized String nextGlobalSequence() {
        String nextSequence;
        synchronized (NUID.class) {
            nextSequence = globalNUID.nextSequence();
        }
        return nextSequence;
    }

    public synchronized String next() {
        char[] cArr;
        long j = this.seq + this.inc;
        this.seq = j;
        if (j >= maxSeq) {
            randomizePrefix();
            resetSequential();
        }
        int i = 22;
        cArr = new char[22];
        System.arraycopy(this.pre, 0, cArr, 0, 12);
        long j2 = this.seq;
        while (i > 12) {
            i--;
            cArr[i] = digits[(int) (j2 % 62)];
            j2 /= 62;
        }
        return new String(cArr);
    }

    public synchronized String nextSequence() {
        char[] cArr;
        long j = this.seq + this.inc;
        this.seq = j;
        if (j >= maxSeq) {
            randomizePrefix();
            resetSequential();
        }
        int i = 10;
        cArr = new char[10];
        long j2 = this.seq;
        while (i > 0) {
            i--;
            cArr[i] = digits[(int) (j2 % 62)];
            j2 /= 62;
        }
        return new String(cArr);
    }

    void resetSequential() {
        this.seq = RandomUtils.nextLong(RandomUtils.PRAND, maxSeq);
        this.inc = RandomUtils.nextLong(RandomUtils.PRAND, 300L) + minInc;
    }

    final void randomizePrefix() {
        byte[] bArr = new byte[12];
        RandomUtils.SRAND.nextBytes(bArr);
        for (int i = 0; i < 12; i++) {
            this.pre[i] = digits[(bArr[i] & 255) % 62];
        }
    }

    char[] getPre() {
        return this.pre;
    }

    long getSeq() {
        return this.seq;
    }

    void setSeq(long j) {
        this.seq = j;
    }
}
