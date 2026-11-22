package org.xmind.core.internal.security;

import java.io.InputStream;
import java.io.OutputStream;
import org.xmind.core.CoreException;
import org.xmind.core.IEncryptionData;

/* loaded from: classes7.dex */
public class Crypto {
    private static ISecurityProvider provider;

    public static void setProvider(ISecurityProvider iSecurityProvider) {
        if (provider != null) {
            return;
        }
        provider = iSecurityProvider;
    }

    public static ISecurityProvider getProvider() {
        if (provider == null) {
            provider = NullSecurityProvider.getInstance();
        }
        return provider;
    }

    public static OutputStream creatOutputStream(OutputStream outputStream, boolean z, IEncryptionData iEncryptionData, String str) throws CoreException {
        return getProvider().createPasswordProtectedOutputStream(outputStream, z, iEncryptionData, str);
    }

    public static InputStream createInputStream(InputStream inputStream, boolean z, IEncryptionData iEncryptionData, String str) throws CoreException {
        return getProvider().createPasswordProtectedInputStream(inputStream, z, iEncryptionData, str);
    }

    public static void initEncryptionData(IEncryptionData iEncryptionData) {
        getProvider().initializeEncryptionData(iEncryptionData);
    }
}
