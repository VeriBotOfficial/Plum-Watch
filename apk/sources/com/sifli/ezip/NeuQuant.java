package com.sifli.ezip;

/* JADX INFO: loaded from: classes16.dex */
public class NeuQuant {
    protected static final int alphabiasshift = 10;
    protected static final int alpharadbias = 262144;
    protected static final int alpharadbshift = 18;
    protected static final int beta = 64;
    protected static final int betagamma = 65536;
    protected static final int betashift = 10;
    protected static final int gamma = 1024;
    protected static final int gammashift = 10;
    protected static final int initalpha = 1024;
    protected static final int initrad = 32;
    protected static final int initradius = 2048;
    protected static final int intbias = 65536;
    protected static final int intbiasshift = 16;
    protected static final int maxnetpos = 255;
    protected static final int minpicturebytes = 1509;
    protected static final int ncycles = 100;
    protected static final int netbiasshift = 4;
    protected static final int netsize = 256;
    protected static final int prime1 = 499;
    protected static final int prime2 = 491;
    protected static final int prime3 = 487;
    protected static final int prime4 = 503;
    protected static final int radbias = 256;
    protected static final int radbiasshift = 8;
    protected static final int radiusbias = 64;
    protected static final int radiusbiasshift = 6;
    protected static final int radiusdec = 30;
    protected int alphadec;
    protected int lengthcount;
    protected int samplefac;
    protected byte[] thepicture;
    protected int[] netindex = new int[256];
    protected int[] bias = new int[256];
    protected int[] freq = new int[256];
    protected int[] radpower = new int[32];
    protected int[][] network = new int[256][];

    public NeuQuant(byte[] bArr, int r5, int r6) {
        this.thepicture = bArr;
        this.lengthcount = r5;
        this.samplefac = r6;
        for (int r7 = 0; r7 < 256; r7++) {
            this.network[r7] = new int[]{ı, ı, ı, 0};
            int r8 = (r7 << 12) / 256;
            this.freq[r7] = 256;
            this.bias[r7] = 0;
        }
    }

    public byte[] colorMap() {
        byte[] bArr = new byte[768];
        int[] r2 = new int[256];
        for (int r4 = 0; r4 < 256; r4++) {
            r2[this.network[r4][3]] = r4;
        }
        int r6 = 0;
        for (int r5 = 0; r5 < 256; r5++) {
            int[] r7 = this.network[r2[r5]];
            bArr[r6] = (byte) r7[0];
            int r9 = r6 + 2;
            bArr[r6 + 1] = (byte) r7[1];
            r6 += 3;
            bArr[r9] = (byte) r7[2];
        }
        return bArr;
    }

    public void inxbuild() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        while (r1 < 256) {
            int[] r6 = this.network[r1];
            int r7 = r6[1];
            int r8 = r1 + 1;
            int r10 = r1;
            for (int r9 = r8; r9 < 256; r9++) {
                int r11 = this.network[r9][1];
                if (r11 < r7) {
                    r10 = r9;
                    r7 = r11;
                }
            }
            int[] r4 = this.network[r10];
            if (r1 != r10) {
                int r12 = r4[0];
                r4[0] = r6[0];
                r6[0] = r12;
                int r13 = r4[1];
                r4[1] = r6[1];
                r6[1] = r13;
                int r14 = r4[2];
                r4[2] = r6[2];
                r6[2] = r14;
                int r15 = r4[3];
                r4[3] = r6[3];
                r6[3] = r15;
            }
            if (r7 != r2) {
                this.netindex[r2] = (r3 + r1) >> 1;
                while (true) {
                    r2++;
                    if (r2 >= r7) {
                        break;
                    } else {
                        this.netindex[r2] = r1;
                    }
                }
                r3 = r1;
                r2 = r7;
            }
            r1 = r8;
        }
        this.netindex[r2] = (r3 + 255) >> 1;
        for (int r5 = r2 + 1; r5 < 256; r5++) {
            this.netindex[r5] = 255;
        }
    }

    public void learn() {
        int r12;
        int r7 = this.lengthcount;
        int r0 = minpicturebytes;
        if (r7 < minpicturebytes) {
            this.samplefac = 1;
        }
        int r1 = this.samplefac;
        this.alphadec = ((r1 - 1) / 3) + 30;
        byte[] bArr = this.thepicture;
        int r10 = r7 / (r1 * 3);
        int r2 = r10 / 100;
        for (int r3 = 0; r3 < 32; r3++) {
            this.radpower[r3] = 1024 * (((1024 - (r3 * r3)) * 256) / 1024);
        }
        int r4 = this.lengthcount;
        if (r4 < minpicturebytes) {
            r12 = 3;
        } else {
            if (r4 % 499 != 0) {
                r0 = 1497;
            } else if (r4 % 491 != 0) {
                r0 = 1473;
            } else if (r4 % 487 != 0) {
                r0 = 1461;
            }
            r12 = r0;
        }
        int r13 = 2048;
        int r14 = r2;
        int r15 = 1024;
        int r16 = 32;
        int r5 = 0;
        int r17 = 0;
        while (r5 < r10) {
            int r6 = (bArr[r17] & 255) << 4;
            int r8 = (bArr[r17 + 1] & 255) << 4;
            int r9 = (bArr[r17 + 2] & 255) << 4;
            int r18 = contest(r6, r8, r9);
            int r22 = r5;
            altersingle(r15, r18, r6, r8, r9);
            if (r16 != 0) {
                alterneigh(r16, r18, r6, r8, r9);
            }
            int r11 = r17 + r12;
            if (r11 >= r7) {
                r11 -= this.lengthcount;
            }
            r17 = r11;
            r5 = r22 + 1;
            if (r14 == 0) {
                r14 = 1;
            }
            if (r5 % r14 == 0) {
                r15 -= r15 / this.alphadec;
                r13 -= r13 / 30;
                int r19 = r13 >> 6;
                if (r19 <= 1) {
                    r19 = 0;
                }
                for (int r20 = 0; r20 < r19; r20++) {
                    int r21 = r19 * r19;
                    this.radpower[r20] = (((r21 - (r20 * r20)) * 256) / r21) * r15;
                }
                r16 = r19;
            }
        }
    }

    public int map(int r13, int r14, int r15) {
        int r0 = this.netindex[r14];
        int r1 = r0 - 1;
        int r2 = 1000;
        int r4 = -1;
        while (true) {
            if (r0 >= 256 && r1 < 0) {
                return r4;
            }
            if (r0 < 256) {
                int[] r10 = this.network[r0];
                int r11 = r10[1] - r14;
                if (r11 >= r2) {
                    r0 = 256;
                } else {
                    r0++;
                    if (r11 < 0) {
                        r11 = -r11;
                    }
                    int r5 = r10[0] - r13;
                    if (r5 < 0) {
                        r5 = -r5;
                    }
                    int r12 = r11 + r5;
                    if (r12 < r2) {
                        int r6 = r10[2] - r15;
                        if (r6 < 0) {
                            r6 = -r6;
                        }
                        int r16 = r12 + r6;
                        if (r16 < r2) {
                            r4 = r10[3];
                            r2 = r16;
                        }
                    }
                }
            }
            if (r1 >= 0) {
                int[] r7 = this.network[r1];
                int r9 = r14 - r7[1];
                if (r9 >= r2) {
                    r1 = -1;
                } else {
                    r1--;
                    if (r9 < 0) {
                        r9 = -r9;
                    }
                    int r8 = r7[0] - r13;
                    if (r8 < 0) {
                        r8 = -r8;
                    }
                    int r17 = r9 + r8;
                    if (r17 < r2) {
                        int r18 = r7[2] - r15;
                        if (r18 < 0) {
                            r18 = -r18;
                        }
                        int r19 = r18 + r17;
                        if (r19 < r2) {
                            r4 = r7[3];
                            r2 = r19;
                        }
                    }
                }
            }
        }
    }

    public byte[] process() {
        learn();
        unbiasnet();
        inxbuild();
        return colorMap();
    }

    public void unbiasnet() {
        for (int r1 = 0; r1 < 256; r1++) {
            int[] r2 = this.network[r1];
            r2[0] = r2[0] >> 4;
            r2[1] = r2[1] >> 4;
            r2[2] = r2[2] >> 4;
            r2[3] = r1;
        }
    }

    protected void alterneigh(int r15, int r16, int r17, int r18, int r19) {
        int r1 = r16 - r15;
        if (r1 < -1) {
            r1 = -1;
        }
        int r2 = r16 + r15;
        if (r2 > 256) {
            r2 = 256;
        }
        int r3 = r16 + 1;
        int r5 = r16 - 1;
        int r6 = 1;
        while (true) {
            if (r3 >= r2 && r5 <= r1) {
                return;
            }
            r6++;
            int r7 = this.radpower[r6];
            if (r3 < r2) {
                int r12 = r3 + 1;
                int[] r4 = this.network[r3];
                try {
                    int r11 = r4[0];
                    r4[0] = r11 - (((r11 - r17) * r7) / 262144);
                    int r13 = r4[1];
                    r4[1] = r13 - (((r13 - r18) * r7) / 262144);
                    int r14 = r4[2];
                    r4[2] = r14 - (((r14 - r19) * r7) / 262144);
                } catch (Exception unused) {
                }
                r3 = r12;
            }
            if (r5 > r1) {
                int r110 = r5 - 1;
                int[] r8 = this.network[r5];
                try {
                    int r111 = r8[0];
                    r8[0] = r111 - (((r111 - r17) * r7) / 262144);
                    int r9 = r8[1];
                    r8[1] = r9 - (((r9 - r18) * r7) / 262144);
                    int r10 = r8[2];
                    r8[2] = r10 - ((r7 * (r10 - r19)) / 262144);
                } catch (Exception unused2) {
                }
                r5 = r110;
            }
        }
    }

    protected void altersingle(int r3, int r4, int r5, int r6, int r7) {
        int[] r8 = this.network[r4];
        int r1 = r8[0];
        r8[0] = r1 - (((r1 - r5) * r3) / 1024);
        int r0 = r8[1];
        r8[1] = r0 - (((r0 - r6) * r3) / 1024);
        int r9 = r8[2];
        r8[2] = r9 - ((r3 * (r9 - r7)) / 1024);
    }

    protected int contest(int r11, int r12, int r13) {
        int r0 = Integer.MAX_VALUE;
        int r3 = -1;
        int r4 = -1;
        int r1 = Integer.MAX_VALUE;
        for (int r5 = 0; r5 < 256; r5++) {
            int[] r6 = this.network[r5];
            int r7 = r6[0] - r11;
            if (r7 < 0) {
                r7 = -r7;
            }
            int r8 = r6[1] - r12;
            if (r8 < 0) {
                r8 = -r8;
            }
            int r9 = r7 + r8;
            int r10 = r6[2] - r13;
            if (r10 < 0) {
                r10 = -r10;
            }
            int r14 = r9 + r10;
            if (r14 < r0) {
                r3 = r5;
                r0 = r14;
            }
            int[] r15 = this.bias;
            int r16 = r14 - (r15[r5] >> 12);
            if (r16 < r1) {
                r4 = r5;
                r1 = r16;
            }
            int[] r17 = this.freq;
            int r18 = r17[r5];
            int r19 = r18 >> 10;
            r17[r5] = r18 - r19;
            r15[r5] = r15[r5] + (r19 << 10);
        }
        int[] r110 = this.freq;
        r110[r3] = r110[r3] + 64;
        int[] r111 = this.bias;
        r111[r3] = r111[r3] - 65536;
        return r4;
    }
}
