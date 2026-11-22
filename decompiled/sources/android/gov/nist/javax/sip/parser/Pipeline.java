package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.javax.sip.stack.SIPStackTimerTask;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class Pipeline extends InputStream {
    private LinkedList buffList = new LinkedList();
    private Buffer currentBuffer;
    private boolean isClosed;
    private SIPStackTimerTask myTimerTask;
    private InputStream pipe;
    private int readTimeout;
    private SipTimer timer;

    class MyTimer extends SIPStackTimerTask {
        private boolean isCancelled;
        Pipeline pipeline;

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return null;
        }

        protected MyTimer(Pipeline pipeline) {
            this.pipeline = pipeline;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            if (this.isCancelled) {
                this.pipeline = null;
                return;
            }
            try {
                this.pipeline.close();
            } catch (IOException e) {
                InternalErrorHandler.handleException(e);
            }
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void cleanUpBeforeCancel() {
            this.isCancelled = true;
            this.pipeline = null;
            super.cleanUpBeforeCancel();
        }
    }

    class Buffer {
        byte[] bytes;
        int length;
        int ptr = 0;

        public Buffer(byte[] bArr, int i) {
            this.length = i;
            this.bytes = bArr;
        }

        public int getNextByte() {
            byte[] bArr = this.bytes;
            int i = this.ptr;
            this.ptr = i + 1;
            return bArr[i] & 255;
        }
    }

    public void startTimer() {
        if (this.readTimeout == -1) {
            return;
        }
        MyTimer myTimer = new MyTimer(this);
        this.myTimerTask = myTimer;
        this.timer.schedule(myTimer, this.readTimeout);
    }

    public void stopTimer() {
        SIPStackTimerTask sIPStackTimerTask;
        if (this.readTimeout == -1 || (sIPStackTimerTask = this.myTimerTask) == null) {
            return;
        }
        this.timer.cancel(sIPStackTimerTask);
    }

    public Pipeline(InputStream inputStream, int i, SipTimer sipTimer) {
        this.timer = sipTimer;
        this.pipe = inputStream;
        this.readTimeout = i;
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.isClosed) {
            throw new IOException("Closed!!");
        }
        Buffer buffer = new Buffer(bArr, i2);
        buffer.ptr = i;
        synchronized (this.buffList) {
            this.buffList.add(buffer);
            this.buffList.notifyAll();
        }
    }

    public void write(byte[] bArr) throws IOException {
        if (this.isClosed) {
            throw new IOException("Closed!!");
        }
        Buffer buffer = new Buffer(bArr, bArr.length);
        synchronized (this.buffList) {
            this.buffList.add(buffer);
            this.buffList.notifyAll();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.isClosed = true;
        synchronized (this.buffList) {
            this.buffList.notifyAll();
        }
        this.pipe.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        synchronized (this.buffList) {
            Buffer buffer = this.currentBuffer;
            if (buffer != null && buffer.ptr < this.currentBuffer.length) {
                int nextByte = this.currentBuffer.getNextByte();
                if (this.currentBuffer.ptr == this.currentBuffer.length) {
                    this.currentBuffer = null;
                }
                return nextByte;
            }
            if (this.isClosed && this.buffList.isEmpty()) {
                return -1;
            }
            while (this.buffList.isEmpty()) {
                try {
                    try {
                        this.buffList.wait();
                        if (this.buffList.isEmpty() && this.isClosed) {
                            return -1;
                        }
                    } catch (NoSuchElementException e) {
                        e.printStackTrace();
                        throw new IOException(e.getMessage());
                    }
                } catch (InterruptedException e2) {
                    throw new IOException(e2.getMessage());
                }
            }
            Buffer buffer2 = (Buffer) this.buffList.removeFirst();
            this.currentBuffer = buffer2;
            int nextByte2 = buffer2.getNextByte();
            if (this.currentBuffer.ptr == this.currentBuffer.length) {
                this.currentBuffer = null;
            }
            return nextByte2;
        }
    }

    public boolean isClosed() {
        return this.isClosed;
    }
}
