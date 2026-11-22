package org.xmind.core.internal.security;

import java.io.InputStream;
import java.io.OutputStream;
import org.xmind.core.CoreException;
import org.xmind.core.IEncryptionData;

/* loaded from: classes7.dex */
public interface ISecurityProvider {
    InputStream createPasswordProtectedInputStream(InputStream inputStream, boolean z, IEncryptionData iEncryptionData, String str) throws CoreException;

    OutputStream createPasswordProtectedOutputStream(OutputStream outputStream, boolean z, IEncryptionData iEncryptionData, String str) throws CoreException;

    void initializeEncryptionData(IEncryptionData iEncryptionData);
}
