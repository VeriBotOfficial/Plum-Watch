package org.xmind.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public interface IFileEntry extends IAdaptable, IWorkbookComponent {
    IEncryptionData createEncryptionData();

    void decreaseReference();

    void deleteEncryptionData();

    IEncryptionData getEncryptionData();

    InputStream getInputStream();

    String getMediaType();

    OutputStream getOutputStream();

    String getPath();

    int getReferenceCount();

    long getSize();

    List<IFileEntry> getSubEntries();

    long getTime();

    boolean hasBeenReferred();

    void increaseReference();

    boolean isDirectory();

    Iterator<IFileEntry> iterSubEntries();

    InputStream openInputStream() throws IOException;

    OutputStream openOutputStream() throws IOException;

    void setTime(long j);
}
