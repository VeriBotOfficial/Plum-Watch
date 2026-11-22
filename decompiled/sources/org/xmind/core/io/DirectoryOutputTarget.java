package org.xmind.core.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.xmind.core.Core;

/* loaded from: classes7.dex */
public class DirectoryOutputTarget implements IOutputTarget {
    private File dir;
    private Map<String, Long> timeTable = new HashMap();

    private class TimedFileOutputStream extends FileOutputStream {
        private String entryName;
        private File file;

        public TimedFileOutputStream(String str, File file) throws FileNotFoundException {
            super(file);
            this.entryName = str;
            this.file = file;
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            Long l = (Long) DirectoryOutputTarget.this.timeTable.remove(this.entryName);
            if (l != null) {
                this.file.setLastModified(l.longValue());
            }
        }
    }

    public DirectoryOutputTarget(String str) {
        this.dir = new File(str);
    }

    public DirectoryOutputTarget(File file) {
        this.dir = file;
    }

    @Override // org.xmind.core.io.IOutputTarget
    public OutputStream getEntryStream(String str) {
        if (!isAvailable()) {
            return null;
        }
        try {
            return openEntryStream(str);
        } catch (IOException e) {
            Core.getLogger().log(e, "Failed to get entry output stream for file: " + new File(this.dir, str).getPath());
            return null;
        }
    }

    @Override // org.xmind.core.io.IOutputTarget
    public OutputStream openEntryStream(String str) throws IOException {
        File file = new File(this.dir, str);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        return new TimedFileOutputStream(str, file);
    }

    @Override // org.xmind.core.io.IOutputTarget
    public boolean isEntryAvaialble(String str) {
        return isAvailable() && !new File(this.dir, str).isDirectory();
    }

    public boolean isAvailable() {
        if (!this.dir.exists()) {
            this.dir.mkdirs();
        }
        return this.dir.exists() && this.dir.isDirectory();
    }

    @Override // org.xmind.core.io.IOutputTarget
    public void setEntryTime(String str, long j) {
        this.timeTable.put(str, Long.valueOf(j));
        File file = new File(this.dir, str);
        if (file.exists()) {
            file.setLastModified(j);
        }
    }
}
