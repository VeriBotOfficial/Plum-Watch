package com.sifli.ezip;

import androidx.compose.ui.layout.LayoutKt;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes16.dex */
public class LZWEncoder {
    private static final int BITS = 12;
    private static final int EOF = -1;
    private static final int HSIZE = 5003;
    private int ClearCode;
    private int EOFCode;
    private int a_count;
    private int curPixel;
    private int g_init_bits;
    private int imgH;
    private int imgW;
    private int initCodeSize;
    private int maxcode;
    private int n_bits;
    private byte[] pixAry;
    private int remaining;
    private int maxbits = 12;
    private int maxmaxcode = 4096;
    private int hsize = 5003;
    private int free_ent = 0;
    private int cur_accum = 0;
    private int cur_bits = 0;
    private int[] htab = new int[5003];
    private int[] codetab = new int[5003];
    private int[] masks = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, LayoutKt.LargeDimension, 65535};
    private byte[] accum = new byte[256];
    private boolean clear_flg = false;

    final int MAXCODE(int r2) {
        return (1 << r2) - 1;
    }

    LZWEncoder(int r4, int r5, byte[] bArr, int r7) {
        this.imgW = r4;
        this.imgH = r5;
        this.pixAry = bArr;
        this.initCodeSize = Math.max(2, r7);
    }

    void char_out(byte b, OutputStream outputStream) throws IOException {
        byte[] bArr = this.accum;
        int r1 = this.a_count;
        int r2 = r1 + 1;
        this.a_count = r2;
        bArr[r1] = b;
        if (r2 >= 254) {
            flush_char(outputStream);
        }
    }

    void cl_block(OutputStream outputStream) throws IOException {
        cl_hash(this.hsize);
        int r0 = this.ClearCode;
        this.free_ent = r0 + 2;
        this.clear_flg = true;
        output(r0, outputStream);
    }

    void cl_hash(int r4) {
        for (int r0 = 0; r0 < r4; r0++) {
            this.htab[r0] = -1;
        }
    }

    void compress(int r9, OutputStream outputStream) throws IOException {
        this.g_init_bits = r9;
        int r0 = 0;
        this.clear_flg = false;
        this.n_bits = r9;
        this.maxcode = MAXCODE(r9);
        int r10 = 1 << (r9 - 1);
        this.ClearCode = r10;
        this.EOFCode = r10 + 1;
        this.free_ent = r10 + 2;
        this.a_count = 0;
        int r11 = nextPixel();
        for (int r2 = this.hsize; r2 < 65536; r2 *= 2) {
            r0++;
        }
        int r1 = 8 - r0;
        int r3 = this.hsize;
        cl_hash(r3);
        output(this.ClearCode, outputStream);
        while (true) {
            int r4 = nextPixel();
            if (r4 != -1) {
                int r5 = (r4 << this.maxbits) + r11;
                int r6 = (r4 << r1) ^ r11;
                int r7 = this.htab[r6];
                if (r7 == r5) {
                    r11 = this.codetab[r6];
                } else {
                    if (r7 >= 0) {
                        int r8 = r3 - r6;
                        if (r6 == 0) {
                            r8 = 1;
                        }
                        while (true) {
                            r6 -= r8;
                            if (r6 < 0) {
                                r6 += r3;
                            }
                            int r12 = this.htab[r6];
                            if (r12 == r5) {
                                r11 = this.codetab[r6];
                            } else if (r12 < 0) {
                            }
                        }
                    }
                    output(r11, outputStream);
                    int r13 = this.free_ent;
                    if (r13 < this.maxmaxcode) {
                        int[] r14 = this.codetab;
                        this.free_ent = r13 + 1;
                        r14[r6] = r13;
                        this.htab[r6] = r5;
                    } else {
                        cl_block(outputStream);
                    }
                    r11 = r4;
                }
            } else {
                output(r11, outputStream);
                output(this.EOFCode, outputStream);
                return;
            }
        }
    }

    void encode(OutputStream outputStream) throws IOException {
        outputStream.write(this.initCodeSize);
        this.remaining = this.imgW * this.imgH;
        this.curPixel = 0;
        compress(this.initCodeSize + 1, outputStream);
        outputStream.write(0);
    }

    void flush_char(OutputStream outputStream) throws IOException {
        int r0 = this.a_count;
        if (r0 > 0) {
            outputStream.write(r0);
            outputStream.write(this.accum, 0, this.a_count);
            this.a_count = 0;
        }
    }

    private int nextPixel() {
        int r0 = this.remaining;
        if (r0 == 0) {
            return -1;
        }
        this.remaining = r0 - 1;
        byte[] bArr = this.pixAry;
        int r1 = this.curPixel;
        this.curPixel = r1 + 1;
        return bArr[r1] & 255;
    }

    void output(int r4, OutputStream outputStream) throws IOException {
        int r0 = this.cur_accum;
        int[] r1 = this.masks;
        int r2 = this.cur_bits;
        int r3 = r0 & r1[r2];
        this.cur_accum = r3;
        if (r2 > 0) {
            this.cur_accum = r3 | (r4 << r2);
        } else {
            this.cur_accum = r4;
        }
        this.cur_bits = r2 + this.n_bits;
        while (this.cur_bits >= 8) {
            char_out((byte) (this.cur_accum & 255), outputStream);
            this.cur_accum >>= 8;
            this.cur_bits -= 8;
        }
        if (this.free_ent > this.maxcode || this.clear_flg) {
            if (this.clear_flg) {
                int r5 = this.g_init_bits;
                this.n_bits = r5;
                this.maxcode = MAXCODE(r5);
                this.clear_flg = false;
            } else {
                int r6 = this.n_bits + 1;
                this.n_bits = r6;
                if (r6 == this.maxbits) {
                    this.maxcode = this.maxmaxcode;
                } else {
                    this.maxcode = MAXCODE(r6);
                }
            }
        }
        if (r4 == this.EOFCode) {
            while (this.cur_bits > 0) {
                char_out((byte) (this.cur_accum & 255), outputStream);
                this.cur_accum >>= 8;
                this.cur_bits -= 8;
            }
            flush_char(outputStream);
        }
    }
}
