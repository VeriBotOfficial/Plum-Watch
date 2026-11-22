package org.xmind.core.internal.zip;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.xmind.core.Core;
import org.xmind.core.io.IInputSource;

/* loaded from: classes7.dex */
public class ZipFileInputSource implements IInputSource {
    private ZipFile zipFile;

    private static class EntryIterAdapter implements Iterator<String> {
        private Enumeration<? extends ZipEntry> entries;

        public EntryIterAdapter(Enumeration<? extends ZipEntry> enumeration) {
            this.entries = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.entries.hasMoreElements();
        }

        @Override // java.util.Iterator
        public String next() {
            ZipEntry nextElement = this.entries.nextElement();
            if (nextElement == null) {
                return null;
            }
            return nextElement.getName();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public ZipFileInputSource(ZipFile zipFile) {
        this.zipFile = zipFile;
    }

    @Override // org.xmind.core.io.IInputSource
    public Iterator<String> getEntries() {
        return new EntryIterAdapter(this.zipFile.entries());
    }

    @Override // org.xmind.core.io.IInputSource
    public boolean hasEntry(String str) {
        return this.zipFile.getEntry(str) != null;
    }

    @Override // org.xmind.core.io.IInputSource
    public InputStream getEntryStream(String str) {
        ZipEntry entry = this.zipFile.getEntry(str);
        if (entry == null) {
            return null;
        }
        try {
            return this.zipFile.getInputStream(entry);
        } catch (IOException e) {
            Core.getLogger().log(e);
            return null;
        }
    }

    @Override // org.xmind.core.io.IInputSource
    public InputStream openEntryStream(String str) throws IOException {
        ZipEntry entry = this.zipFile.getEntry(str);
        if (entry == null) {
            throw new FileNotFoundException(str);
        }
        return this.zipFile.getInputStream(entry);
    }

    @Override // org.xmind.core.io.IInputSource
    public boolean isEntryAvailable(String str) {
        ZipEntry entry = this.zipFile.getEntry(str);
        return (entry == null || entry.isDirectory()) ? false : true;
    }

    public void closeZipFile() {
        try {
            this.zipFile.close();
        } catch (IOException e) {
            Core.getLogger().log(e);
        }
    }

    @Override // org.xmind.core.io.IInputSource
    public long getEntrySize(String str) {
        ZipEntry entry = this.zipFile.getEntry(str);
        if (entry != null) {
            return entry.getSize();
        }
        return -1L;
    }

    @Override // org.xmind.core.io.IInputSource
    public long getEntryTime(String str) {
        ZipEntry entry = this.zipFile.getEntry(str);
        if (entry != null) {
            return entry.getTime();
        }
        return -1L;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ZipFileInputSource)) {
            return false;
        }
        return this.zipFile.equals(((ZipFileInputSource) obj).zipFile);
    }

    public int hashCode() {
        return this.zipFile.hashCode();
    }
}
