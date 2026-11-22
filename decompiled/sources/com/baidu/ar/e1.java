package com.baidu.ar;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public abstract class e1 {
    public static final String i = "e1";
    public z8 c;
    public MediaCodec d;
    public p3 f;
    public boolean g;

    /* renamed from: a, reason: collision with root package name */
    public int f6900a = -1;
    public boolean b = false;
    public long h = 0;
    public MediaCodec.BufferInfo e = new MediaCodec.BufferInfo();

    public void a() {
        this.d.release();
        this.d = null;
        this.c = null;
    }

    public void a(p3 p3Var) {
        this.f = p3Var;
    }

    public final void a(boolean z) {
        ByteBuffer[] byteBufferArr;
        int i2;
        String str;
        String str2;
        h.a(i, "drainEncoder endOfStream = " + z);
        try {
            byteBufferArr = this.d.getOutputBuffers();
        } catch (Exception e) {
            e.printStackTrace();
            byteBufferArr = null;
        }
        if (byteBufferArr == null) {
            return;
        }
        while (true) {
            try {
                i2 = this.d.dequeueOutputBuffer(this.e, 10000L);
            } catch (Exception e2) {
                e2.printStackTrace();
                i2 = 0;
            }
            str = i;
            h.a(str, "drainEncoder encoderStatus = " + i2);
            if (i2 == -1) {
                if (!z) {
                    return;
                } else {
                    h.a(str, "no output available, spinning to await EOS");
                }
            } else if (i2 == -3) {
                byteBufferArr = this.d.getOutputBuffers();
            } else if (i2 == -2) {
                if (this.c.a()) {
                    str2 = "format changed twice!!!!";
                    break;
                }
                MediaFormat outputFormat = this.d.getOutputFormat();
                h.a(str, "encoder output format changed: " + outputFormat);
                this.f6900a = this.c.a(outputFormat);
                this.b = true;
                p3 p3Var = this.f;
                if (p3Var != null) {
                    p3Var.b(true);
                }
                if (this.g) {
                    this.c.c();
                }
            } else if (i2 < 0) {
                h.e(str, "unexpected result from encoder.dequeueOutputBuffer: " + i2);
            } else {
                ByteBuffer byteBuffer = byteBufferArr[i2];
                if (byteBuffer == null) {
                    throw new RuntimeException("encoderOutputBuffer " + i2 + " was null");
                }
                if ((this.e.flags & 2) != 0) {
                    h.a(str, "ignoring BUFFER_FLAG_CODEC_CONFIG");
                    this.e.size = 0;
                }
                if (this.e.size != 0) {
                    if (this.c.a()) {
                        byteBuffer.position(this.e.offset);
                        MediaCodec.BufferInfo bufferInfo = this.e;
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        d();
                        h.a(str, "drainEncoder writeSampleData mBufferInfo = " + this.e.presentationTimeUs + "&& size = " + this.e.size);
                        this.c.a(this.f6900a, byteBuffer, this.e);
                    } else {
                        h.a(str, "drainEncoder wait for mMuxer start !!!");
                    }
                }
                this.d.releaseOutputBuffer(i2, false);
                if ((this.e.flags & 4) != 0) {
                    if (z) {
                        if (this.g) {
                            this.c.d();
                        }
                        p3 p3Var2 = this.f;
                        if (p3Var2 != null) {
                            p3Var2.a(true);
                            return;
                        }
                        return;
                    }
                    str2 = "reached end of stream unexpectedly";
                }
            }
        }
        h.b(str, str2);
    }

    public void a(boolean z, ByteBuffer byteBuffer, int i2, long j) {
        MediaCodec mediaCodec = this.d;
        if (mediaCodec != null) {
            int i3 = -1;
            if (!this.b || this.f6900a != -1) {
                try {
                    i3 = mediaCodec.dequeueInputBuffer(10000L);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                int i4 = i3;
                if (i4 < 0) {
                    h.a(i, "drainBuffer encode input buffer not available");
                } else if (z) {
                    h.a(i, "drainBuffer sending EOS to drainBufferEncoder");
                    this.d.queueInputBuffer(i4, 0, 0, 0L, 4);
                } else {
                    if (!a(i4, byteBuffer, i2, j)) {
                        return;
                    }
                    MediaCodec mediaCodec2 = this.d;
                    MediaCodec.BufferInfo bufferInfo = this.e;
                    mediaCodec2.queueInputBuffer(i4, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, 0);
                }
                a(z);
            }
        }
    }

    public final boolean a(int i2, ByteBuffer byteBuffer, int i3, long j) {
        ByteBuffer byteBuffer2 = this.d.getInputBuffers()[i2];
        if (byteBuffer2.capacity() < byteBuffer.capacity()) {
            return false;
        }
        byteBuffer2.position(0);
        byteBuffer2.put(byteBuffer);
        byteBuffer2.flip();
        MediaCodec.BufferInfo bufferInfo = this.e;
        bufferInfo.offset = 0;
        bufferInfo.size = i3;
        bufferInfo.presentationTimeUs = j / 1000;
        return true;
    }

    public void b() {
        boolean z;
        h.a(i, "startEncoder !!!");
        MediaCodec mediaCodec = this.d;
        if (mediaCodec != null) {
            try {
                mediaCodec.start();
            } catch (Exception e) {
                e.printStackTrace();
                z = false;
            }
        }
        z = true;
        p3 p3Var = this.f;
        if (p3Var != null) {
            p3Var.c(z);
        }
    }

    public void b(boolean z) {
        h.a(i, "drainSurface endOfStream = " + z);
        if (z) {
            z8 z8Var = this.c;
            if (z8Var == null || !z8Var.a()) {
                p3 p3Var = this.f;
                if (p3Var != null) {
                    p3Var.a(true);
                    return;
                }
                return;
            }
            this.d.signalEndOfInputStream();
        }
        a(z);
    }

    public void c() {
        h.a(i, "stopEncoder !!!");
        MediaCodec mediaCodec = this.d;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public abstract void d();
}
