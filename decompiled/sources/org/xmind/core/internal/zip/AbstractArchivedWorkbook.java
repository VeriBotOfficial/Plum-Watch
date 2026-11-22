package org.xmind.core.internal.zip;

import java.io.IOException;
import org.xmind.core.CoreException;
import org.xmind.core.IWorkbook;

/* loaded from: classes7.dex */
public abstract class AbstractArchivedWorkbook implements IArchivedWorkbook {
    private final String file;
    protected final IWorkbook workbook;

    public AbstractArchivedWorkbook(IWorkbook iWorkbook, String str) {
        this.workbook = iWorkbook;
        this.file = str;
    }

    @Override // org.xmind.core.internal.zip.IArchivedWorkbook
    public String getFile() {
        return this.file;
    }

    @Override // org.xmind.core.internal.zip.IArchivedWorkbook
    public void save() throws IOException, CoreException {
        save(null);
    }
}
