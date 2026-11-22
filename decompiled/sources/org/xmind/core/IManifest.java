package org.xmind.core;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public interface IManifest extends IWorkbookComponent, IAdaptable {
    IFileEntry cloneEntry(IFileEntry iFileEntry, String str) throws IOException;

    IFileEntry cloneEntryAsAttachment(IFileEntry iFileEntry) throws IOException;

    IFileEntry createAttachmentFromFilePath(String str) throws IOException;

    IFileEntry createAttachmentFromFilePath(String str, String str2) throws IOException;

    IFileEntry createAttachmentFromStream(InputStream inputStream, String str) throws IOException;

    IFileEntry createAttachmentFromStream(InputStream inputStream, String str, String str2) throws IOException;

    IFileEntry createFileEntry(String str);

    IFileEntry createFileEntry(String str, String str2);

    boolean deleteFileEntry(String str);

    IEncryptionData getEncryptionData(String str);

    List<IFileEntry> getFileEntries();

    IFileEntry getFileEntry(String str);

    Iterator<IFileEntry> iterFileEntries();

    Iterator<IFileEntry> iterFileEntries(IFileEntryFilter iFileEntryFilter);

    String makeAttachmentPath(String str);

    String makeAttachmentPath(String str, boolean z);
}
