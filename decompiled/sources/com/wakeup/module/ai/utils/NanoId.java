package com.wakeup.module.ai.utils;

import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NanoId.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/wakeup/module/ai/utils/NanoId;", "", "<init>", "()V", "DEFAULT_ALPHABET", "", "DEFAULT_SIZE", "", "random", "Ljava/security/SecureRandom;", "generate", "size", "alphabet", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NanoId {
    private static final String DEFAULT_ALPHABET = "_-0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int DEFAULT_SIZE = 16;
    public static final NanoId INSTANCE = new NanoId();
    private static final SecureRandom random = new SecureRandom();

    private NanoId() {
    }

    public static /* synthetic */ String generate$default(NanoId nanoId, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 16;
        }
        if ((i2 & 2) != 0) {
            str = DEFAULT_ALPHABET;
        }
        return nanoId.generate(i, str);
    }

    public final String generate(int size, String alphabet) {
        Intrinsics.checkNotNullParameter(alphabet, "alphabet");
        if (alphabet.length() <= 0) {
            throw new IllegalArgumentException("Alphabet must not be empty".toString());
        }
        if (alphabet.length() >= 256) {
            throw new IllegalArgumentException("Alphabet too long (max 255)".toString());
        }
        int numberOfLeadingZeros = (2 << (31 - Integer.numberOfLeadingZeros(alphabet.length()))) - 1;
        int length = (int) (((numberOfLeadingZeros * 1.6d) * size) / alphabet.length());
        StringBuilder sb = new StringBuilder(size);
        loop0: while (sb.length() < size) {
            byte[] bArr = new byte[length];
            random.nextBytes(bArr);
            for (int i = 0; i < length; i++) {
                int i2 = bArr[i] & numberOfLeadingZeros;
                if (i2 < alphabet.length()) {
                    sb.append(alphabet.charAt(i2));
                    if (sb.length() == size) {
                        break loop0;
                    }
                }
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
