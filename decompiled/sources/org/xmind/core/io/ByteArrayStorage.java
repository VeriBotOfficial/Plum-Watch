package org.xmind.core.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class ByteArrayStorage implements IStorage {
    private static Collection<String> NO_ENTRIES = Collections.emptyList();
    private Map<String, byte[]> dataTable;
    private Map<String, Long> timeTable;

    protected class ByteArrayInputSource implements IInputSource {
        protected ByteArrayInputSource() {
        }

        @Override // org.xmind.core.io.IInputSource
        public Iterator<String> getEntries() {
            if (ByteArrayStorage.this.dataTable == null) {
                return ByteArrayStorage.NO_ENTRIES.iterator();
            }
            return ByteArrayStorage.this.dataTable.keySet().iterator();
        }

        @Override // org.xmind.core.io.IInputSource
        public boolean isEntryAvailable(String str) {
            return ByteArrayStorage.this.dataTable.get(str) != null;
        }

        @Override // org.xmind.core.io.IInputSource
        public InputStream getEntryStream(String str) {
            byte[] bArr;
            if (ByteArrayStorage.this.dataTable == null || str == null || (bArr = (byte[]) ByteArrayStorage.this.dataTable.get(str)) == null) {
                return null;
            }
            return new ByteArrayInputStream(bArr);
        }

        @Override // org.xmind.core.io.IInputSource
        public InputStream openEntryStream(String str) throws IOException {
            InputStream entryStream = getEntryStream(str);
            if (entryStream != null) {
                return entryStream;
            }
            throw new FileNotFoundException(str);
        }

        @Override // org.xmind.core.io.IInputSource
        public long getEntrySize(String str) {
            byte[] bArr;
            if (ByteArrayStorage.this.dataTable == null || str == null || (bArr = (byte[]) ByteArrayStorage.this.dataTable.get(str)) == null) {
                return -1L;
            }
            return bArr.length;
        }

        @Override // org.xmind.core.io.IInputSource
        public long getEntryTime(String str) {
            Long l;
            if (ByteArrayStorage.this.timeTable == null || str == null || (l = (Long) ByteArrayStorage.this.timeTable.get(str)) == null) {
                return 0L;
            }
            return l.longValue();
        }

        @Override // org.xmind.core.io.IInputSource
        public boolean hasEntry(String str) {
            return ByteArrayStorage.this.dataTable != null && ByteArrayStorage.this.dataTable.containsKey(str);
        }
    }

    protected class ByteArrayOutputTarget implements IOutputTarget {
        @Override // org.xmind.core.io.IOutputTarget
        public boolean isEntryAvaialble(String str) {
            return str != null;
        }

        protected ByteArrayOutputTarget() {
        }

        private class ByteArrayOutputStream2 extends ByteArrayOutputStream {
            private String entryName;

            public ByteArrayOutputStream2(String str) {
                this.entryName = str;
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                super.flush();
                pushBytes();
            }

            @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                pushBytes();
                synchronized (ByteArrayOutputTarget.this) {
                    if (ByteArrayStorage.this.timeTable == null || !ByteArrayStorage.this.timeTable.containsKey(this.entryName)) {
                        ByteArrayOutputTarget.this.setEntryTime(this.entryName, System.currentTimeMillis());
                    }
                }
            }

            private void pushBytes() {
                if (ByteArrayStorage.this.dataTable == null) {
                    ByteArrayStorage.this.dataTable = new HashMap();
                }
                ByteArrayStorage.this.dataTable.put(this.entryName, toByteArray());
            }
        }

        @Override // org.xmind.core.io.IOutputTarget
        public OutputStream getEntryStream(String str) {
            return new ByteArrayOutputStream2(str);
        }

        @Override // org.xmind.core.io.IOutputTarget
        public OutputStream openEntryStream(String str) throws IOException {
            return new ByteArrayOutputStream2(str);
        }

        @Override // org.xmind.core.io.IOutputTarget
        public void setEntryTime(String str, long j) {
            synchronized (this) {
                if (ByteArrayStorage.this.timeTable == null) {
                    ByteArrayStorage.this.timeTable = new HashMap();
                }
                ByteArrayStorage.this.timeTable.put(str, Long.valueOf(j));
            }
        }
    }

    @Override // org.xmind.core.io.IStorage
    public String getFullPath() {
        return getName();
    }

    @Override // org.xmind.core.io.IStorage
    public IInputSource getInputSource() {
        return new ByteArrayInputSource();
    }

    @Override // org.xmind.core.io.IStorage
    public String getName() {
        return toString();
    }

    @Override // org.xmind.core.io.IStorage
    public IOutputTarget getOutputTarget() {
        return new ByteArrayOutputTarget();
    }

    @Override // org.xmind.core.io.IStorage
    public void clear() {
        this.dataTable = null;
        this.timeTable = null;
    }
}
