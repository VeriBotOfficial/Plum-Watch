package org.videolan.libvlc.util;

import android.content.pm.ApplicationInfo;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.autonavi.aps.amapapi.AMapLocationStaticsEntity;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes7.dex */
public class VLCUtil {
    private static final String[] CPU_archs = {"*Pre-v4", "*v4", "*v4T", "v5T", "v5TE", "v5TEJ", AMapLocationStaticsEntity.IPV6, "v6KZ", "v6T2", "v6K", "v7", "*v6-M", "*v6S-M", "*v7E-M", "*v8"};
    private static final int ELF_HEADER_SIZE = 52;
    private static final int EM_386 = 3;
    private static final int EM_AARCH64 = 183;
    private static final int EM_ARM = 40;
    private static final int EM_MIPS = 8;
    private static final int EM_X86_64 = 62;
    private static final int SECTION_HEADER_SIZE = 40;
    private static final int SHT_ARM_ATTRIBUTES = 1879048195;
    public static final String TAG = "VLC/LibVLC/Util";
    private static final String URI_AUTHORIZED_CHARS = "'()*";
    private static String errorMsg = null;
    private static boolean isCompatible = false;
    private static MachineSpecs machineSpecs;

    public static class MachineSpecs {
        public float bogoMIPS;
        public float frequency;
        public boolean hasArmV6;
        public boolean hasArmV7;
        public boolean hasFpu;
        public boolean hasMips;
        public boolean hasNeon;
        public boolean hasX86;
        public boolean is64bits;
        public int processors;
    }

    public static String getErrorMsg() {
        return errorMsg;
    }

    public static String[] getABIList21() {
        String[] strArr = Build.SUPPORTED_ABIS;
        return (strArr == null || strArr.length == 0) ? getABIList() : strArr;
    }

    public static String[] getABIList() {
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:5|(2:6|(3:8|(2:10|11)(4:13|(1:15)(2:18|(2:20|21)(2:22|(2:24|25)(2:26|(1:28)(1:29))))|16|17)|12)(1:30))|31|(2:33|(33:35|(1:223)(1:39)|40|(1:222)(1:44)|45|(1:47)(1:221)|48|(1:50)(1:(1:220))|51|(1:53)(1:218)|54|55|56|58|59|60|(3:61|62|(16:64|65|66|(11:102|(1:104)(3:105|(2:111|(1:113)(2:114|(2:119|(1:121))(1:118)))|107)|69|(1:98)|73|(1:97)|79|(1:81)|82|(2:84|(5:86|87|88|89|90)(1:95))(1:96)|91)|68|69|(1:71)|98|73|(2:75|77)|97|79|(0)|82|(0)(0)|91)(1:201))|202|124|(1:126)(1:200)|127|(7:(1:(1:162))(1:(1:159)(1:133))|(1:(1:158))(1:136)|137|(1:142)|143|(2:145|(2:149|(1:152))(1:148))|(1:155))|163|164|165|166|167|168|169|(2:171|172)(1:178)|173|174|175))(1:225)|224|55|56|58|59|60|(4:61|62|(0)(0)|91)|202|124|(0)(0)|127|(0)|163|164|165|166|167|168|169|(0)(0)|173|174|175) */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02e2, code lost:
    
        android.util.Log.w(org.videolan.libvlc.util.VLCUtil.TAG, "Could not find maximum CPU frequency!");
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02e7, code lost:
    
        close(r12);
        close(r10);
        r0 = -1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02c4, code lost:
    
        android.util.Log.w(org.videolan.libvlc.util.VLCUtil.TAG, "Could not parse maximum CPU frequency!");
        android.util.Log.w(org.videolan.libvlc.util.VLCUtil.TAG, "Failed to parse: ");
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02e1, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02c3, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02b9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02ba, code lost:
    
        r3 = null;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0353, code lost:
    
        close(r3);
        close(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0359, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02e0, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02c2, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02bd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02be, code lost:
    
        r3 = null;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x01db, code lost:
    
        r23 = true;
        r17 = r16;
        r18 = r17;
        r19 = r18;
        r20 = r19 ? 1 : 0;
        r21 = r20;
        r19 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x01ff, code lost:
    
        r9 = null;
        r22 = -1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01d8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01d9, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01ea, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x01f2, code lost:
    
        r23 = true;
        r17 = r16;
        r18 = r17;
        r19 = r18;
        r20 = r19 ? 1 : 0;
        r21 = r20;
        r3 = null;
        r19 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x01e8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x01e9, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a8 A[Catch: NumberFormatException -> 0x02c4, IOException -> 0x02e2, all -> 0x0351, TRY_LEAVE, TryCatch #6 {all -> 0x0351, blocks: (B:169:0x02a2, B:171:0x02a8, B:183:0x02c4, B:180:0x02e2), top: B:164:0x0296 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01d1 A[EDGE_INSN: B:201:0x01d1->B:202:0x01d1 BREAK  A[LOOP:1: B:61:0x010b->B:91:0x01cd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a3 A[Catch: all -> 0x01d4, IOException -> 0x0202, TryCatch #7 {all -> 0x01d4, blocks: (B:62:0x010b, B:66:0x0113, B:69:0x016f, B:71:0x0177, B:73:0x0181, B:75:0x0189, B:77:0x0191, B:79:0x019b, B:81:0x01a3, B:84:0x01aa, B:86:0x01b8, B:88:0x01be, B:99:0x011f, B:102:0x0128, B:105:0x0133, B:108:0x013e, B:111:0x0147, B:114:0x0152, B:116:0x015a, B:119:0x0165), top: B:61:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01aa A[Catch: all -> 0x01d4, IOException -> 0x0202, TryCatch #7 {all -> 0x01d4, blocks: (B:62:0x010b, B:66:0x0113, B:69:0x016f, B:71:0x0177, B:73:0x0181, B:75:0x0189, B:77:0x0191, B:79:0x019b, B:81:0x01a3, B:84:0x01aa, B:86:0x01b8, B:88:0x01be, B:99:0x011f, B:102:0x0128, B:105:0x0133, B:108:0x013e, B:111:0x0147, B:114:0x0152, B:116:0x015a, B:119:0x0165), top: B:61:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v63, types: [int] */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r10v66, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v73 */
    /* JADX WARN: Type inference failed for: r10v74 */
    /* JADX WARN: Type inference failed for: r10v75 */
    /* JADX WARN: Type inference failed for: r10v76 */
    /* JADX WARN: Type inference failed for: r10v77 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean hasCompatibleCPU(android.content.Context r24) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.util.VLCUtil.hasCompatibleCPU(android.content.Context):boolean");
    }

    public static MachineSpecs getMachineSpecs() {
        return machineSpecs;
    }

    private static class ElfData {
        String att_arch;
        boolean att_fpu;
        int e_machine;
        int e_shnum;
        int e_shoff;
        boolean is64bits;
        ByteOrder order;
        int sh_offset;
        int sh_size;

        private ElfData() {
        }
    }

    private static File searchLibrary(ApplicationInfo applicationInfo) {
        String[] strArr;
        if ((applicationInfo.flags & 1) != 0) {
            strArr = System.getProperty("java.library.path").split(":");
        } else {
            strArr = new String[]{applicationInfo.nativeLibraryDir};
        }
        if (strArr[0] == null) {
            Log.e(TAG, "can't find library path");
            return null;
        }
        for (String str : strArr) {
            File file = new File(str, "libvlcjni.so");
            if (file.exists() && file.canRead()) {
                return file;
            }
        }
        Log.e(TAG, "WARNING: Can't find shared library");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ElfData readLib(File file) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        Object[] objArr = 0;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                try {
                    ElfData elfData = new ElfData();
                    if (!readHeader(randomAccessFile, elfData)) {
                        close(randomAccessFile);
                        return null;
                    }
                    int i = elfData.e_machine;
                    if (i != 3 && i != 8) {
                        if (i == 40) {
                            randomAccessFile.close();
                            RandomAccessFile randomAccessFile3 = new RandomAccessFile(file, "r");
                            try {
                                if (!readSection(randomAccessFile3, elfData)) {
                                    close(randomAccessFile3);
                                    return null;
                                }
                                randomAccessFile3.close();
                                randomAccessFile = new RandomAccessFile(file, "r");
                                if (readArmAttributes(randomAccessFile, elfData)) {
                                    close(randomAccessFile);
                                    return elfData;
                                }
                                close(randomAccessFile);
                                return null;
                            } catch (IOException e) {
                                e = e;
                                randomAccessFile = randomAccessFile3;
                                e.printStackTrace();
                                close(randomAccessFile);
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                randomAccessFile2 = randomAccessFile3;
                                close(randomAccessFile2);
                                throw th;
                            }
                        }
                        if (i != 62 && i != 183) {
                            close(randomAccessFile);
                            return null;
                        }
                    }
                    close(randomAccessFile);
                    return elfData;
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
            }
        } catch (IOException e3) {
            e = e3;
            randomAccessFile = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static boolean readHeader(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        byte b;
        ByteOrder byteOrder;
        byte[] bArr = new byte[52];
        randomAccessFile.readFully(bArr);
        if (bArr[0] != Byte.MAX_VALUE || bArr[1] != 69 || bArr[2] != 76 || bArr[3] != 70 || ((b = bArr[4]) != 1 && b != 2)) {
            Log.e(TAG, "ELF header invalid");
            return false;
        }
        elfData.is64bits = b == 2;
        if (bArr[5] == 1) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        elfData.order = byteOrder;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(elfData.order);
        elfData.e_machine = wrap.getShort(18);
        elfData.e_shoff = wrap.getInt(32);
        elfData.e_shnum = wrap.getShort(48);
        return true;
    }

    private static boolean readSection(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        byte[] bArr = new byte[40];
        randomAccessFile.seek(elfData.e_shoff);
        for (int i = 0; i < elfData.e_shnum; i++) {
            randomAccessFile.readFully(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(elfData.order);
            if (wrap.getInt(4) == SHT_ARM_ATTRIBUTES) {
                elfData.sh_offset = wrap.getInt(16);
                elfData.sh_size = wrap.getInt(20);
                return true;
            }
        }
        return false;
    }

    private static boolean readArmAttributes(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        byte[] bArr = new byte[elfData.sh_size];
        randomAccessFile.seek(elfData.sh_offset);
        randomAccessFile.readFully(bArr);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(elfData.order);
        if (wrap.get() != 65) {
            return false;
        }
        while (true) {
            if (wrap.remaining() <= 0) {
                break;
            }
            int position = wrap.position();
            int i = wrap.getInt();
            if (getString(wrap).equals("aeabi")) {
                while (wrap.position() < position + i) {
                    int position2 = wrap.position();
                    byte b = wrap.get();
                    int i2 = wrap.getInt();
                    if (b != 1) {
                        wrap.position(position2 + i2);
                    } else {
                        while (wrap.position() < position2 + i2) {
                            int uleb128 = getUleb128(wrap);
                            if (uleb128 == 6) {
                                elfData.att_arch = CPU_archs[getUleb128(wrap)];
                            } else if (uleb128 == 27) {
                                getUleb128(wrap);
                                elfData.att_fpu = true;
                            } else {
                                int i3 = uleb128 % 128;
                                if (i3 == 4 || i3 == 5 || i3 == 32 || (i3 > 32 && (i3 & 1) != 0)) {
                                    getString(wrap);
                                } else {
                                    getUleb128(wrap);
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private static String getString(ByteBuffer byteBuffer) {
        char c;
        StringBuilder sb = new StringBuilder(byteBuffer.limit());
        while (byteBuffer.remaining() > 0 && (c = (char) byteBuffer.get()) != 0) {
            sb.append(c);
        }
        return sb.toString();
    }

    private static int getUleb128(ByteBuffer byteBuffer) {
        byte b;
        int i = 0;
        do {
            b = byteBuffer.get();
            i = (i << 7) | (b & Byte.MAX_VALUE);
        } while ((b & 128) > 0);
        return i;
    }

    public static Uri UriFromMrl(String str) {
        int parseInt;
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder(charArray.length * 2);
        int i = 0;
        while (i < charArray.length) {
            char c = charArray[i];
            if (c == '%' && charArray.length - i >= 3) {
                try {
                    parseInt = Integer.parseInt(new String(charArray, i + 1, 2), 16);
                } catch (NumberFormatException unused) {
                }
                if (URI_AUTHORIZED_CHARS.indexOf(parseInt) != -1) {
                    sb.append((char) parseInt);
                    i += 2;
                    i++;
                }
            }
            sb.append(c);
            i++;
        }
        return Uri.parse(sb.toString());
    }

    public static String encodeVLCUri(Uri uri) {
        return encodeVLCString(uri.toString());
    }

    public static String encodeVLCString(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder(charArray.length * 2);
        for (char c : charArray) {
            if (URI_AUTHORIZED_CHARS.indexOf(c) != -1) {
                sb.append(Separators.PERCENT).append(Integer.toHexString(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
