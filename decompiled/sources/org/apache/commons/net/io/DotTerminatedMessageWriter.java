package org.apache.commons.net.io;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes8.dex */
public final class DotTerminatedMessageWriter extends Writer {
    private static final int LAST_WAS_CR_STATE = 1;
    private static final int LAST_WAS_NL_STATE = 2;
    private static final int NOTHING_SPECIAL_STATE = 0;
    private Writer output;
    private int state;

    public DotTerminatedMessageWriter(Writer writer) {
        super(writer);
        this.output = writer;
        this.state = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.lock) {
            Writer writer = this.output;
            if (writer == null) {
                return;
            }
            int i = this.state;
            if (i == 1) {
                writer.write(10);
            } else if (i != 2) {
                writer.write("\r\n");
            }
            this.output.write(".\r\n");
            this.output.flush();
            this.output = null;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        synchronized (this.lock) {
            this.output.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        synchronized (this.lock) {
            while (true) {
                int i3 = i2 - 1;
                if (i2 > 0) {
                    int i4 = i + 1;
                    write(cArr[i]);
                    i = i4;
                    i2 = i3;
                }
            }
        }
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        synchronized (this.lock) {
            try {
                if (i == 10) {
                    if (this.state != 1) {
                        this.output.write(13);
                    }
                    this.output.write(10);
                    this.state = 2;
                    return;
                }
                if (i == 13) {
                    this.state = 1;
                    this.output.write(13);
                    return;
                }
                if (i == 46 && this.state == 2) {
                    this.output.write(46);
                }
                this.state = 0;
                this.output.write(i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str.toCharArray());
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        write(str.toCharArray(), i, i2);
    }
}
