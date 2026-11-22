package com.aventrix.jnanoid.jnanoid;

import java.security.SecureRandom;
import java.util.Random;

/* loaded from: classes12.dex */
public final class NanoIdUtils {
    public static final int DEFAULT_SIZE = 21;
    public static final SecureRandom DEFAULT_NUMBER_GENERATOR = new SecureRandom();
    public static final char[] DEFAULT_ALPHABET = "_-0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private NanoIdUtils() {
    }

    public static String randomNanoId() {
        return randomNanoId(DEFAULT_NUMBER_GENERATOR, DEFAULT_ALPHABET, 21);
    }

    public static String randomNanoId(Random random, char[] cArr, int i) {
        if (random == null) {
            throw new IllegalArgumentException("random cannot be null.");
        }
        if (cArr == null) {
            throw new IllegalArgumentException("alphabet cannot be null.");
        }
        if (cArr.length == 0 || cArr.length >= 256) {
            throw new IllegalArgumentException("alphabet must contain between 1 and 255 symbols.");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("size must be greater than zero.");
        }
        int floor = (2 << ((int) Math.floor(Math.log(cArr.length - 1) / Math.log(2.0d)))) - 1;
        int ceil = (int) Math.ceil(((floor * 1.6d) * i) / cArr.length);
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte[] bArr = new byte[ceil];
            random.nextBytes(bArr);
            for (int i2 = 0; i2 < ceil; i2++) {
                int i3 = bArr[i2] & floor;
                if (i3 < cArr.length) {
                    sb.append(cArr[i3]);
                    if (sb.length() == i) {
                        return sb.toString();
                    }
                }
            }
        }
    }
}
