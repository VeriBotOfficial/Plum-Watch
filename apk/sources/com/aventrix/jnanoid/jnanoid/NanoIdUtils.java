package com.aventrix.jnanoid.jnanoid;

import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: loaded from: classes16.dex */
public final class NanoIdUtils {
    public static final int DEFAULT_SIZE = 21;
    public static final SecureRandom DEFAULT_NUMBER_GENERATOR = new SecureRandom();
    public static final char[] DEFAULT_ALPHABET = "_-0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private NanoIdUtils() {
    }

    public static String randomNanoId() {
        return randomNanoId(DEFAULT_NUMBER_GENERATOR, DEFAULT_ALPHABET, 21);
    }

    public static String randomNanoId(Random random, char[] cArr, int r9) {
        if (random == null) {
            throw new IllegalArgumentException("random cannot be null.");
        }
        if (cArr == null) {
            throw new IllegalArgumentException("alphabet cannot be null.");
        }
        if (cArr.length == 0 || cArr.length >= 256) {
            throw new IllegalArgumentException("alphabet must contain between 1 and 255 symbols.");
        }
        if (r9 <= 0) {
            throw new IllegalArgumentException("size must be greater than zero.");
        }
        int r0 = (2 << ((int) Math.floor(Math.log(cArr.length - 1) / Math.log(2.0d)))) - 1;
        int r1 = (int) Math.ceil(((((double) r0) * 1.6d) * ((double) r9)) / ((double) cArr.length));
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte[] bArr = new byte[r1];
            random.nextBytes(bArr);
            for (int r4 = 0; r4 < r1; r4++) {
                int r5 = bArr[r4] & r0;
                if (r5 < cArr.length) {
                    sb.append(cArr[r5]);
                    if (sb.length() == r9) {
                        return sb.toString();
                    }
                }
            }
        }
    }
}
