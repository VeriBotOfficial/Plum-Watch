package org.xmind.core.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmind.core.IFileEntry;
import org.xmind.core.IManifest;

/* loaded from: classes7.dex */
public abstract class Manifest extends AbstractWorkbookComponent implements IManifest {
    @Override // org.xmind.core.IManifest
    public List<IFileEntry> getFileEntries() {
        ArrayList arrayList = new ArrayList();
        Iterator<IFileEntry> iterFileEntries = iterFileEntries();
        while (iterFileEntries.hasNext()) {
            arrayList.add(iterFileEntries.next());
        }
        return arrayList;
    }

    @Override // org.xmind.core.IManifest
    public boolean deleteFileEntry(String str) {
        IFileEntry fileEntry = getFileEntry(str);
        if (fileEntry == null) {
            return false;
        }
        fileEntry.increaseReference();
        while (fileEntry.getReferenceCount() > 0) {
            fileEntry.decreaseReference();
        }
        return true;
    }
}
