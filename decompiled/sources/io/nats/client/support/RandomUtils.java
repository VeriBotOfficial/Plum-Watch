package io.nats.client.support;

import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Random;

/* loaded from: classes6.dex */
public abstract class RandomUtils {
    public static final Random PRAND;
    public static final SecureRandom SRAND;

    private RandomUtils() {
    }

    static {
        SecureRandom secureRandom = new SecureRandom();
        SRAND = secureRandom;
        PRAND = new Random(bytesToLong(secureRandom.generateSeed(8)));
    }

    public static long nextLong(Random random, long j) {
        long nextLong;
        long j2;
        do {
            nextLong = (random.nextLong() << 1) >>> 1;
            j2 = nextLong % j;
        } while ((nextLong - j2) + (j - 1) < 0);
        return j2;
    }

    public static long bytesToLong(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(64);
        allocate.put(bArr);
        allocate.flip();
        return allocate.getLong();
    }
}
