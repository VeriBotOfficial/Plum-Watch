package com.efs.sdk.memleaksdk.monitor.shark;

import com.anythink.core.d.n;
import com.facebook.hermes.intl.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J(\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/internal/aosp/ByteArrayTimSort;", "", "a", "", "c", "Lcom/efs/sdk/memleaksdk/monitor/shark/internal/aosp/ByteArrayComparator;", "entrySize", "", "([BLcom/efs/sdk/memleaksdk/monitor/shark/internal/aosp/ByteArrayComparator;I)V", "minGallop", "runBase", "", "runLen", "stackSize", "tmp", "ensureCapacity", "minCapacity", "mergeAt", "", "i", "mergeCollapse", "mergeForceCollapse", "mergeHi", "base1", "len1", "base2", "len2", "mergeLo", "pushRun", "Companion", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes14.dex */
public final class cw {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9897a = new a(0);
    private static final int j = 32;
    private static final int k = 7;
    private static final int l = 256;
    private static final boolean m = false;
    private int b;
    private byte[] c;
    private int d;
    private final int[] e;
    private final int[] f;
    private final byte[] g;
    private final cv h;
    private final int i;

    public /* synthetic */ cw(byte[] bArr, cv cvVar, int i, byte b) {
        this(bArr, cvVar, i);
    }

    private cw(byte[] bArr, cv cvVar, int i) {
        this.g = bArr;
        this.h = cvVar;
        this.i = i;
        this.b = k;
        int length = bArr.length / i;
        int i2 = l;
        this.c = new byte[i * (length < i2 * 2 ? length >>> 1 : i2)];
        int i3 = length < 120 ? 5 : length < 1542 ? 10 : length < 119151 ? 19 : 40;
        this.e = new int[i3];
        this.f = new int[i3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, int i2) {
        int[] iArr = this.e;
        int i3 = this.d;
        iArr[i3] = i;
        this.f[i3] = i2;
        this.d = i3 + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r1[r0 - 4] <= (r1[r2] + r1[r0 - 3])) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r1[r0 - 3] > (r1[r2] + r1[r0 - 1])) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        r1 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r1[r0 - 3] >= r1[r0 - 1]) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r2 = r0 - 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
        L0:
            int r0 = r6.d
            r1 = 1
            if (r0 <= r1) goto L48
            int r2 = r0 + (-2)
            if (r2 < r1) goto L18
            int[] r1 = r6.f
            int r3 = r0 + (-3)
            r3 = r1[r3]
            r4 = r1[r2]
            int r5 = r0 + (-1)
            r1 = r1[r5]
            int r4 = r4 + r1
            if (r3 <= r4) goto L2a
        L18:
            r1 = 2
            if (r2 < r1) goto L39
            int[] r1 = r6.f
            int r3 = r0 + (-4)
            r3 = r1[r3]
            r4 = r1[r2]
            int r5 = r0 + (-3)
            r1 = r1[r5]
            int r4 = r4 + r1
            if (r3 > r4) goto L39
        L2a:
            int[] r1 = r6.f
            int r3 = r0 + (-3)
            r3 = r1[r3]
            int r4 = r0 + (-1)
            r1 = r1[r4]
            if (r3 >= r1) goto L44
            int r2 = r0 + (-3)
            goto L44
        L39:
            int[] r1 = r6.f
            r3 = r1[r2]
            int r0 = r0 + (-1)
            r0 = r1[r0]
            if (r3 <= r0) goto L44
            goto L48
        L44:
            r6.a(r2)
            goto L0
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.memleaksdk.monitor.shark.cw.c():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        while (true) {
            int i = this.d;
            if (i <= 1) {
                return;
            }
            int i2 = i - 2;
            if (i2 > 0) {
                int[] iArr = this.f;
                if (iArr[i - 3] < iArr[i - 1]) {
                    i2 = i - 3;
                }
            }
            a(i2);
        }
    }

    private final void a(int i) {
        byte[] bArr;
        int a2;
        if (m) {
            int i2 = this.d;
            if (i != i2 - 2) {
                int i3 = i2 - 3;
            }
        }
        int[] iArr = this.e;
        int i4 = iArr[i];
        int[] iArr2 = this.f;
        int i5 = iArr2[i];
        int i6 = i + 1;
        int i7 = iArr[i6];
        int i8 = iArr2[i6];
        iArr2[i] = i5 + i8;
        int i9 = this.d;
        if (i == i9 - 3) {
            int i10 = i + 2;
            iArr[i6] = iArr[i10];
            iArr2[i6] = iArr2[i10];
        }
        this.d = i9 - 1;
        a aVar = f9897a;
        byte[] bArr2 = this.g;
        int b = aVar.b(bArr2, i7, bArr2, i4, i5, 0, this.i, this.h);
        int i11 = i4 + b;
        int i12 = i5 - b;
        if (i12 == 0 || (a2 = aVar.a((bArr = this.g), (i11 + i12) - 1, bArr, i7, i8, i8 - 1, this.i, this.h)) == 0) {
            return;
        }
        if (i12 <= a2) {
            a(i11, i12, i7, a2);
        } else {
            b(i11, i12, i7, a2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00b0, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        r6 = r2;
        r7 = r8;
        r8 = r9;
        r9 = r1;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        r2 = com.efs.sdk.memleaksdk.monitor.shark.cw.m;
        r2 = com.efs.sdk.memleaksdk.monitor.shark.cw.f9897a.b(r5, r6, r7, r8, r9, 0, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        if (r2 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        java.lang.System.arraycopy(r7, r8 * r11, r5, r14 * r11, r2 * r11);
        r14 = r14 + r2;
        r4 = r8 + r2;
        r8 = r9 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d8, code lost:
    
        if (r8 > r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        r9 = r4;
        r13 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        r4 = r14 * r11;
        r8 = r6 * r11;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:
    
        if (r10 >= r11) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ed, code lost:
    
        r5[r4 + r10] = r5[r8 + r10];
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f8, code lost:
    
        r14 = r14 + 1;
        r8 = r6 + 1;
        r15 = r15 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fe, code lost:
    
        if (r15 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        r6 = r7;
        r7 = r5;
        r6 = r9;
        r4 = com.efs.sdk.memleaksdk.monitor.shark.cw.f9897a.a(r6, r6, r7, r8, r15, 0, r11, r12);
        r7 = r6;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0116, code lost:
    
        if (r4 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0118, code lost:
    
        java.lang.System.arraycopy(r5, r8 * r11, r5, r14 * r11, r4 * r11);
        r14 = r14 + r4;
        r3 = r8 + r4;
        r15 = r15 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0126, code lost:
    
        if (r15 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0130, code lost:
    
        r8 = r14 * r11;
        r9 = r6 * r11;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0135, code lost:
    
        if (r10 >= r11) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0137, code lost:
    
        r5[r8 + r10] = r7[r9 + r10];
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0142, code lost:
    
        r14 = r14 + 1;
        r8 = r6 + 1;
        r9 = r13 - 1;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0149, code lost:
    
        if (r9 != 1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0183, code lost:
    
        r1 = r1 - 1;
        r10 = com.efs.sdk.memleaksdk.monitor.shark.cw.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0187, code lost:
    
        if (r2 < r10) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0189, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018c, code lost:
    
        if (r4 < r10) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018e, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0192, code lost:
    
        if ((r2 | r4) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a2, code lost:
    
        r6 = r3;
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0194, code lost:
    
        if (r1 >= 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0196, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0190, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014b, code lost:
    
        r10 = r1;
        r2 = r3;
        r1 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0128, code lost:
    
        r10 = r1;
        r2 = r3;
        r9 = r6;
        r1 = r13;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012e, code lost:
    
        r3 = r8;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0100, code lost:
    
        r10 = r1;
        r6 = r3;
        r2 = r8;
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00da, code lost:
    
        r10 = r1;
        r9 = r4;
        r2 = r6;
        r1 = r8;
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00e4, code lost:
    
        r13 = r9;
        r9 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a8 A[LOOP:3: B:23:0x0061->B:34:0x01a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba A[EDGE_INSN: B:35:0x00ba->B:36:0x00ba BREAK  A[LOOP:3: B:23:0x0061->B:34:0x01a8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.memleaksdk.monitor.shark.cw.a(int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00b8, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        r13 = r9;
        r9 = r3;
        r3 = r13;
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
    
        r4 = com.efs.sdk.memleaksdk.monitor.shark.cw.m;
        r8 = r7;
        r7 = r5;
        r5 = r6;
        r4 = com.efs.sdk.memleaksdk.monitor.shark.cw.f9897a.b(r5, r8, r7, r21, r9, r9 - 1, r11, r12);
        r5 = r7;
        r15 = r9 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        if (r15 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
    
        r1 = r1 - r15;
        r3 = r3 - r15;
        r4 = r9 - r15;
        java.lang.System.arraycopy(r5, (r3 + 1) * r11, r5, (r1 + 1) * r11, r15 * r11);
        r9 = r3;
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
    
        if (r4 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
    
        r4 = r1 * r11;
        r8 = r8 * r11;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
    
        if (r10 >= r11) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0101, code lost:
    
        r5[r4 + r10] = r5[r8 + r10];
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010c, code lost:
    
        r1 = r1 - 1;
        r16 = r8 - 1;
        r6 = r9;
        r9 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0113, code lost:
    
        if (r9 != r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011c, code lost:
    
        r4 = r5;
        r2 = r9 - com.efs.sdk.memleaksdk.monitor.shark.cw.f9897a.a(r5, r6, r5, 0, r9, r2 - 2, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0128, code lost:
    
        if (r2 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
    
        r1 = r1 - r2;
        r7 = r16 - r2;
        r8 = r9 - r2;
        java.lang.System.arraycopy(r4, (r7 + 1) * r11, r5, (r1 + 1) * r11, r2 * r11);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013e, code lost:
    
        if (r8 > r14) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0147, code lost:
    
        r9 = r1 * r11;
        r10 = r6 * r11;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014c, code lost:
    
        if (r14 >= r11) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014e, code lost:
    
        r5[r9 + r14] = r5[r10 + r14];
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0159, code lost:
    
        r1 = r1 - 1;
        r6 = r6 - 1;
        r9 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015f, code lost:
    
        if (r9 != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019f, code lost:
    
        r14 = 1;
        r13 = r13 - 1;
        r10 = com.efs.sdk.memleaksdk.monitor.shark.cw.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a5, code lost:
    
        if (r15 < r10) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a7, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01aa, code lost:
    
        if (r2 < r10) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ac, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b0, code lost:
    
        if ((r2 | r15) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bf, code lost:
    
        r3 = r6;
        r2 = r8;
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b2, code lost:
    
        if (r13 >= 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b4, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ae, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a9, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0161, code lost:
    
        r2 = r8;
        r3 = r9;
        r10 = r13;
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011a, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0140, code lost:
    
        r9 = r6;
        r2 = r8;
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0144, code lost:
    
        r8 = r9;
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0115, code lost:
    
        r4 = r5;
        r2 = r9;
        r10 = r13;
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f0, code lost:
    
        r4 = r5;
        r10 = r13;
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f5, code lost:
    
        r19 = r9;
        r9 = r3;
        r3 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c4 A[LOOP:3: B:24:0x006f->B:35:0x01c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[EDGE_INSN: B:36:0x00c0->B:37:0x00c0 BREAK  A[LOOP:3: B:24:0x006f->B:35:0x01c4], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.memleaksdk.monitor.shark.cw.b(int, int, int, int):void");
    }

    private final byte[] b(int i) {
        byte[] bArr = this.c;
        Intrinsics.checkNotNull(bArr);
        int length = bArr.length;
        int i2 = this.i;
        if (length < i * i2) {
            int i3 = (i >> 1) | i;
            int i4 = i3 | (i3 >> 2);
            int i5 = i4 | (i4 >> 4);
            int i6 = i5 | (i5 >> 8);
            int i7 = (i6 | (i6 >> 16)) + 1;
            if (i7 >= 0) {
                i = Math.min(i7, (this.g.length / i2) >>> 1);
            }
            this.c = new byte[i * this.i];
        }
        byte[] bArr2 = this.c;
        Intrinsics.checkNotNull(bArr2);
        return bArr2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J0\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002JH\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002JH\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J(\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u001e\u0010 \u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J.\u0010 \u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/internal/aosp/ByteArrayTimSort$Companion;", "", "()V", "DEBUG", "", "INITIAL_TMP_STORAGE_LENGTH", "", "MIN_GALLOP", "MIN_MERGE", "binarySort", "", "a", "", "lo", "hi", "start", "entrySize", "c", "Lcom/efs/sdk/memleaksdk/monitor/shark/internal/aosp/ByteArrayComparator;", "checkStartAndEnd", "len", "end", "countRunAndMakeAscending", "gallopLeft", "keyArray", "keyIndex", "base", "hint", "gallopRight", "minRunLength", n.f4527a, "reverseRange", Constants.SORT, "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final void a(byte[] a2, int i, int i2, int i3, cv c) {
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(c, "c");
            a(a2.length / i3, i, i2);
            int i4 = i2 - i;
            if (i4 < 2) {
                return;
            }
            if (i4 < cw.j) {
                a(a2, i, i2, i + b(a2, i, i2, i3, c), i3, c);
                return;
            }
            a aVar = this;
            int i5 = i2;
            int i6 = i3;
            cv cvVar = c;
            cw cwVar = new cw(a2, cvVar, i6, (byte) 0);
            int a3 = a(i4);
            int i7 = i;
            while (true) {
                int i8 = i6;
                cv cvVar2 = cvVar;
                int b = aVar.b(a2, i7, i5, i8, cvVar2);
                int i9 = i5;
                cvVar = cvVar2;
                i6 = i8;
                if (b < a3) {
                    int i10 = i4 <= a3 ? i4 : a3;
                    a(a2, i7, i7 + i10, i7 + b, i6, cvVar);
                    b = i10;
                }
                cwVar.a(i7, b);
                cwVar.c();
                int i11 = i7 + b;
                i4 -= b;
                if (i4 == 0) {
                    break;
                }
                aVar = this;
                i5 = i9;
                i7 = i11;
            }
            boolean unused = cw.m;
            cwVar.d();
            if (cw.m) {
                int unused2 = cwVar.d;
            }
        }

        private final void a(int i, int i2, int i3) {
            if (i2 < 0 || i3 > i) {
                throw new ArrayIndexOutOfBoundsException("start < 0 || end > len. start=" + i2 + ", end=" + i3 + ", len=" + i);
            }
            if (i2 > i3) {
                throw new IllegalArgumentException("start > end: " + i2 + " > " + i3);
            }
        }

        private final void a(byte[] bArr, int i, int i2, int i3, int i4, cv cvVar) {
            boolean unused = cw.m;
            if (i3 == i) {
                i3++;
            }
            byte[] bArr2 = new byte[i4];
            while (i3 < i2) {
                int i5 = i3 * i4;
                for (int i6 = 0; i6 < i4; i6++) {
                    bArr2[i6] = bArr[i5 + i6];
                }
                boolean unused2 = cw.m;
                int i7 = i;
                int i8 = i3;
                while (i7 < i8) {
                    int i9 = (i7 + i8) >>> 1;
                    byte[] bArr3 = bArr;
                    int i10 = i4;
                    cv cvVar2 = cvVar;
                    if (cvVar2.a(i10, bArr2, 0, bArr3, i9) < 0) {
                        i8 = i9;
                    } else {
                        i7 = i9 + 1;
                    }
                    cvVar = cvVar2;
                    i4 = i10;
                    bArr = bArr3;
                }
                byte[] bArr4 = bArr;
                int i11 = i4;
                cv cvVar3 = cvVar;
                boolean unused3 = cw.m;
                int i12 = i3 - i7;
                if (i12 == 1) {
                    int i13 = i7 * i11;
                    int i14 = (i7 + 1) * i11;
                    for (int i15 = 0; i15 < i11; i15++) {
                        bArr4[i14 + i15] = bArr4[i13 + i15];
                    }
                } else if (i12 != 2) {
                    System.arraycopy(bArr4, i7 * i11, bArr4, (i7 + 1) * i11, i12 * i11);
                } else {
                    int i16 = i7 * i11;
                    int i17 = (i7 + 1) * i11;
                    int i18 = (i7 + 2) * i11;
                    for (int i19 = 0; i19 < i11; i19++) {
                        bArr4[i18 + i19] = bArr4[i17 + i19];
                    }
                    for (int i20 = 0; i20 < i11; i20++) {
                        bArr4[i17 + i20] = bArr4[i16 + i20];
                    }
                }
                int i21 = i7 * i11;
                for (int i22 = 0; i22 < i11; i22++) {
                    bArr4[i21 + i22] = bArr2[i22];
                }
                i3++;
                cvVar = cvVar3;
                i4 = i11;
                bArr = bArr4;
            }
        }

        private final int b(byte[] bArr, int i, int i2, int i3, cv cvVar) {
            boolean unused = cw.m;
            int i4 = i + 1;
            if (i4 == i2) {
                return 1;
            }
            int a2 = cvVar.a(i3, bArr, i4, bArr, i);
            int i5 = i + 2;
            if (a2 < 0) {
                while (i5 < i2 && cvVar.a(i3, bArr, i5, bArr, i5 - 1) < 0) {
                    i5++;
                }
                a(bArr, i, i5, i3);
            } else {
                while (i5 < i2 && cvVar.a(i3, bArr, i5, bArr, i5 - 1) >= 0) {
                    i5++;
                }
            }
            return i5 - i;
        }

        private final void a(byte[] bArr, int i, int i2, int i3) {
            while (true) {
                i2--;
                if (i >= i2) {
                    return;
                }
                int i4 = i * i3;
                int i5 = i2 * i3;
                for (int i6 = 0; i6 < i3; i6++) {
                    int i7 = i4 + i6;
                    byte b = bArr[i7];
                    int i8 = i5 + i6;
                    bArr[i7] = bArr[i8];
                    bArr[i8] = b;
                }
                i++;
            }
        }

        private final int a(int i) {
            boolean unused = cw.m;
            int i2 = 0;
            while (i >= cw.j) {
                i2 |= i & 1;
                i >>= 1;
            }
            return i + i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int a(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4, int i5, cv cvVar) {
            int i6;
            int i7;
            boolean unused = cw.m;
            int i8 = i2 + i4;
            if (cvVar.a(i5, bArr, i, bArr2, i8) > 0) {
                int i9 = i3 - i4;
                int i10 = 0;
                int i11 = 1;
                while (i11 < i9 && cvVar.a(i5, bArr, i, bArr2, i8 + i11) > 0) {
                    int i12 = (i11 * 2) + 1;
                    if (i12 <= 0) {
                        i12 = i9;
                    }
                    int i13 = i12;
                    i10 = i11;
                    i11 = i13;
                }
                if (i11 <= i9) {
                    i9 = i11;
                }
                i6 = i10 + i4;
                i7 = i9 + i4;
            } else {
                int i14 = i4 + 1;
                int i15 = 0;
                int i16 = 1;
                while (i16 < i14 && cvVar.a(i5, bArr, i, bArr2, i8 - i16) <= 0) {
                    int i17 = (i16 * 2) + 1;
                    if (i17 <= 0) {
                        i17 = i14;
                    }
                    int i18 = i17;
                    i15 = i16;
                    i16 = i18;
                }
                if (i16 <= i14) {
                    i14 = i16;
                }
                int i19 = i4 - i15;
                i6 = i4 - i14;
                i7 = i19;
            }
            if (cw.m) {
            }
            int i20 = i6 + 1;
            while (i20 < i7) {
                int i21 = ((i7 - i20) >>> 1) + i20;
                if (cvVar.a(i5, bArr, i, bArr2, i2 + i21) > 0) {
                    i20 = i21 + 1;
                } else {
                    i7 = i21;
                }
            }
            boolean unused2 = cw.m;
            return i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4, int i5, cv cvVar) {
            int i6;
            int i7;
            boolean unused = cw.m;
            int i8 = i2 + i4;
            if (cvVar.a(i5, bArr, i, bArr2, i8) < 0) {
                int i9 = i4 + 1;
                int i10 = 0;
                int i11 = 1;
                while (i11 < i9 && cvVar.a(i5, bArr, i, bArr2, i8 - i11) < 0) {
                    int i12 = (i11 * 2) + 1;
                    if (i12 <= 0) {
                        i12 = i9;
                    }
                    int i13 = i12;
                    i10 = i11;
                    i11 = i13;
                }
                if (i11 <= i9) {
                    i9 = i11;
                }
                i7 = i4 - i9;
                i6 = i4 - i10;
            } else {
                int i14 = i3 - i4;
                int i15 = 0;
                int i16 = 1;
                while (i16 < i14 && cvVar.a(i5, bArr, i, bArr2, i8 + i16) >= 0) {
                    int i17 = (i16 * 2) + 1;
                    if (i17 <= 0) {
                        i17 = i14;
                    }
                    int i18 = i17;
                    i15 = i16;
                    i16 = i18;
                }
                if (i16 <= i14) {
                    i14 = i16;
                }
                i6 = i4 + i14;
                i7 = i15 + i4;
            }
            if (cw.m) {
            }
            int i19 = i7 + 1;
            while (i19 < i6) {
                int i20 = ((i6 - i19) >>> 1) + i19;
                if (cvVar.a(i5, bArr, i, bArr2, i2 + i20) < 0) {
                    i6 = i20;
                } else {
                    i19 = i20 + 1;
                }
            }
            boolean unused2 = cw.m;
            return i6;
        }
    }
}
