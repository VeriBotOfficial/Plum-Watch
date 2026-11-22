package org.xmind.core.internal.zip;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.xmind.core.Core;
import org.xmind.core.io.ICloseableOutputTarget;

/* loaded from: classes7.dex */
public class ZipStreamOutputTarget implements ICloseableOutputTarget {
    private static final boolean DEFAULT_COMPRESSED = Boolean.getBoolean("org.xmind.core.workbook.compressed");
    private Map<String, Long> timeTable;
    private ZipOutputStream zip;

    private static class ZipEntryOutputStream extends FilterOutputStream {
        public ZipEntryOutputStream(ZipOutputStream zipOutputStream) {
            super(zipOutputStream);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.out.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.out.write(bArr, i, i2);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            this.out.write(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.out.flush();
            ((ZipOutputStream) this.out).closeEntry();
        }
    }

    public ZipStreamOutputTarget(ZipOutputStream zipOutputStream) {
        this(zipOutputStream, DEFAULT_COMPRESSED);
    }

    public ZipStreamOutputTarget(ZipOutputStream zipOutputStream, boolean z) {
        this.timeTable = new HashMap();
        this.zip = zipOutputStream;
        if (z) {
            zipOutputStream.setLevel(-1);
        } else {
            zipOutputStream.setLevel(0);
        }
    }

    @Override // org.xmind.core.io.IOutputTarget
    public void setEntryTime(String str, long j) {
        this.timeTable.put(str, Long.valueOf(j));
    }

    @Override // org.xmind.core.io.IOutputTarget
    public OutputStream getEntryStream(String str) {
        try {
            return openEntryStream(str);
        } catch (IOException e) {
            Core.getLogger().log(e);
            return null;
        }
    }

    @Override // org.xmind.core.io.IOutputTarget
    public OutputStream openEntryStream(String str) throws IOException {
        ZipEntry zipEntry = new ZipEntry(str);
        Long remove = this.timeTable.remove(str);
        if (remove != null) {
            zipEntry.setTime(remove.longValue());
        }
        this.zip.putNextEntry(zipEntry);
        return new ZipEntryOutputStream(this.zip);
    }

    @Override // org.xmind.core.io.IOutputTarget
    public boolean isEntryAvaialble(String str) {
        return this.zip != null;
    }

    @Override // org.xmind.core.io.ICloseableOutputTarget
    public void close() throws IOException {
        this.zip.finish();
        this.zip.flush();
        this.zip.close();
    }
}
