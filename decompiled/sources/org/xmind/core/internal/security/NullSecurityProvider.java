package org.xmind.core.internal.security;

import java.io.InputStream;
import java.io.OutputStream;
import org.xmind.core.CoreException;
import org.xmind.core.IEncryptionData;

/* loaded from: classes7.dex */
public class NullSecurityProvider implements ISecurityProvider {
    private static final NullSecurityProvider instance = new NullSecurityProvider();

    @Override // org.xmind.core.internal.security.ISecurityProvider
    public InputStream createPasswordProtectedInputStream(InputStream inputStream, boolean z, IEncryptionData iEncryptionData, String str) throws CoreException {
        return inputStream;
    }

    @Override // org.xmind.core.internal.security.ISecurityProvider
    public OutputStream createPasswordProtectedOutputStream(OutputStream outputStream, boolean z, IEncryptionData iEncryptionData, String str) throws CoreException {
        return outputStream;
    }

    @Override // org.xmind.core.internal.security.ISecurityProvider
    public void initializeEncryptionData(IEncryptionData iEncryptionData) {
    }

    private NullSecurityProvider() {
    }

    public static NullSecurityProvider getInstance() {
        return instance;
    }
}
