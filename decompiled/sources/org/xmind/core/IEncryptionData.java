package org.xmind.core;

/* loaded from: classes7.dex */
public interface IEncryptionData extends IAdaptable {
    String getAttribute(String... strArr);

    String getChecksum();

    String getChecksumType();

    IFileEntry getFileEntry();

    int getIntAttribute(int i, String... strArr);

    void setAttribute(String str, String... strArr);

    void setChecksum(String str);

    void setChecksumType(String str);
}
