package org.xmind.core.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.xmind.core.IFileEntry;

/* loaded from: classes7.dex */
public abstract class FileEntry extends AbstractWorkbookComponent implements IFileEntry {
    protected static final List<IFileEntry> NO_SUB_FILE_ENTRIES = Collections.emptyList();

    @Override // org.xmind.core.IFileEntry
    public List<IFileEntry> getSubEntries() {
        if (!isDirectory()) {
            return NO_SUB_FILE_ENTRIES;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<IFileEntry> iterSubEntries = iterSubEntries();
        while (iterSubEntries.hasNext()) {
            arrayList.add(iterSubEntries.next());
        }
        return arrayList;
    }
}
