package org.xmind.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* loaded from: classes7.dex */
public interface IInputSource {
    Iterator<String> getEntries();

    long getEntrySize(String str);

    InputStream getEntryStream(String str);

    long getEntryTime(String str);

    boolean hasEntry(String str);

    boolean isEntryAvailable(String str);

    InputStream openEntryStream(String str) throws IOException;
}
