package sg.bigo.ads.common.aa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f19555a = false;
    private static boolean b = false;
    private static int c = 1;
    private static long d;

    /* renamed from: sg.bigo.ads.common.aa.a$a, reason: collision with other inner class name */
    final class C1068a implements FileFilter {
        C1068a() {
        }

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int a() {
        if (f19555a) {
            return c;
        }
        int a2 = sg.bigo.ads.common.x.a.a();
        c = a2;
        if (a2 != 0) {
            f19555a = true;
            return a2;
        }
        try {
            c = new File("/sys/devices/system/cpu/").listFiles(new C1068a()).length;
        } catch (Throwable unused) {
        }
        if (c <= 1) {
            c = Runtime.getRuntime().availableProcessors();
        }
        f19555a = true;
        sg.bigo.ads.common.x.a.a(c);
        return c;
    }

    public static long b() {
        if (b) {
            long j = d;
            if (j != 0) {
                return j;
            }
        }
        long b2 = sg.bigo.ads.common.x.a.b();
        d = b2;
        if (b2 != 0) {
            b = true;
            return b2;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < a(); i3++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i4 = 0;
                        while (Character.isDigit(bArr[i4]) && i4 < 128) {
                            i4++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i4)));
                        if (valueOf.intValue() > i2) {
                            i2 = valueOf.intValue();
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (Exception unused2) {
            }
        }
        if (i2 == -1) {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(":", 2);
                    if ("cpu MHz".equals(split[0].replaceAll("[\\t\\n\\r]", ""))) {
                        int parseDouble = (split[1].contains(".") ? (int) Double.parseDouble(split[1]) : Integer.parseInt(split[1])) * 1000;
                        if (parseDouble > i2) {
                            i2 = parseDouble;
                        }
                    }
                } catch (Exception unused3) {
                } catch (Throwable th2) {
                    fileReader.close();
                    bufferedReader.close();
                    throw th2;
                }
            }
            fileReader.close();
            bufferedReader.close();
        }
        i = i2;
        b = true;
        long j2 = i / 1000;
        d = j2;
        sg.bigo.ads.common.x.a.a(j2);
        return d;
    }
}
