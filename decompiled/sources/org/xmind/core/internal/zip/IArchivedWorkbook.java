package org.xmind.core.internal.zip;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.xmind.core.CoreException;

/* loaded from: classes7.dex */
public interface IArchivedWorkbook {
    InputStream getEntryInputStream(String str);

    OutputStream getEntryOutputStream(String str);

    String getFile();

    long getSize(String str);

    long getTime(String str);

    void save() throws IOException, CoreException;

    void save(IArchivedWorkbook iArchivedWorkbook) throws IOException, CoreException;

    void setTime(String str, long j);
}
