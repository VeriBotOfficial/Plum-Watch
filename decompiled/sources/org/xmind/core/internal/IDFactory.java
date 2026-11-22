package org.xmind.core.internal;

import java.math.BigInteger;
import java.util.Random;
import org.xmind.core.IIdFactory;

/* loaded from: classes7.dex */
public class IDFactory implements IIdFactory {
    private static final int ID_LENGTH = 26;
    private static final char PADDING_CHAR = '0';
    private static final Random random = new Random(System.currentTimeMillis());

    @Override // org.xmind.core.IIdFactory
    public String createId() {
        String bigInteger = new BigInteger(128, random).toString(32);
        int length = 26 - bigInteger.length();
        if (length <= 0) {
            return bigInteger;
        }
        StringBuffer stringBuffer = new StringBuffer(26);
        for (int i = 0; i < length; i++) {
            stringBuffer.append(PADDING_CHAR);
        }
        stringBuffer.append(bigInteger);
        return stringBuffer.toString();
    }
}
