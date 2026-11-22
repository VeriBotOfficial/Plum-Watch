package io.agora.rtc2.internal.gdp;

import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.opengl.GLES20;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.autonavi.aps.amapapi.config.Const;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.ThreadUtils;
import io.agora.utils2.internal.CommonUtility;
import io.agora.utils2.internal.Logging;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class GDPAndroid {
    private static final FileFilter CPU_FILTER = new FileFilter() { // from class: io.agora.rtc2.internal.gdp.GDPAndroid.2
        @Override // java.io.FileFilter
        public boolean accept(File pathname) {
            String name = pathname.getName();
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
    };
    private static final List<String> CPU_TEMP_FILE_PATHS = Arrays.asList("/sys/devices/system/cpu/cpu0/cpufreq/cpu_temp", "/sys/devices/system/cpu/cpu0/cpufreq/FakeShmoo_cpu_temp", "/sys/class/thermal/thermal_zone0/temp", "/sys/class/i2c-adapter/i2c-4/4-004c/temperature", "/sys/devices/platform/tegra-i2c.3/i2c-4/4-004c/temperature", "/sys/devices/platform/omap/omap_temp_sensor.0/temperature", "/sys/devices/platform/tegra_tmon/temp1_input", "/sys/kernel/debug/tegra_thermal/temp_tj", "/sys/devices/platform/s5p-tmu/temperature", "/sys/class/thermal/thermal_zone1/temp", "/sys/class/hwmon/hwmon0/device/temp1_input", "/sys/devices/virtual/thermal/thermal_zone1/temp", "/sys/devices/virtual/thermal/thermal_zone0/temp", "/sys/class/thermal/thermal_zone3/temp", "/sys/class/thermal/thermal_zone4/temp", "/sys/class/hwmon/hwmonX/temp1_input", "/sys/devices/platform/s5p-tmu/curr_temp");
    private static final int DEVICEINFO_UNKNOWN = -1;
    private static final int OP_TIMEOUT_MS = 100;
    private static final String TAG = "GDPAndroid";
    private static boolean mockGDPAndroid = false;
    private String mGpuVendor = "unkown";
    private String mGpuRenderer = "unkown";

    static class BackGround implements Runnable {
        static boolean bg = false;
        final CountDownLatch runDone = new CountDownLatch(1);

        BackGround() {
        }

        public boolean checkBackgroundSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.e(GDPAndroid.TAG, "checkBackgroundSafe timeout");
            }
            return bg;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            bg = (runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 200) ? false : true;
            this.runDone.countDown();
        }
    }

    static class BatteryLevel implements Runnable {
        static int batt;
        final CountDownLatch runDone = new CountDownLatch(1);

        BatteryLevel() {
        }

        public int getBatteryLevelSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.e(GDPAndroid.TAG, "getBatteryLevelSafe timeout");
            }
            return batt;
        }

        @Override // java.lang.Runnable
        public void run() {
            batt = GDPAndroid.getBatteryLevel();
            this.runDone.countDown();
        }
    }

    static class CPUMaxFreqKHz implements Runnable {
        static int freq = -1;
        final CountDownLatch runDone = new CountDownLatch(1);

        CPUMaxFreqKHz() {
        }

        public int getCPUMaxFreqKHzSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.e(GDPAndroid.TAG, "getCPUMaxFreqKHzSafe timeout");
            }
            return freq;
        }

        @Override // java.lang.Runnable
        public void run() {
            freq = GDPAndroid.getCPUMaxFreqKHz();
            this.runDone.countDown();
        }
    }

    static class CPUTemperature implements Runnable {
        static double currentTemp;
        final CountDownLatch runDone = new CountDownLatch(1);

        CPUTemperature() {
        }

        public int getCpuTemperatureSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.e(GDPAndroid.TAG, "getCpuTemperatureSafe timeout");
            }
            return (int) (currentTemp * 1000.0d);
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb;
            for (int i = 0; i < GDPAndroid.CPU_TEMP_FILE_PATHS.size(); i++) {
                String str = (String) GDPAndroid.CPU_TEMP_FILE_PATHS.get(i);
                double readOneLine = GDPAndroid.readOneLine(new File(str));
                if (GDPAndroid.isTemperatureValid(readOneLine) || GDPAndroid.mockGDPAndroid) {
                    currentTemp = readOneLine;
                    sb = new StringBuilder("getCpuTemperature valid path:");
                } else {
                    double d = readOneLine / 1000.0d;
                    if (GDPAndroid.isTemperatureValid(d)) {
                        currentTemp = d;
                        sb = new StringBuilder("getCpuTemperature valid path:");
                    }
                }
                Logging.d(GDPAndroid.TAG, sb.append(str).toString());
            }
            this.runDone.countDown();
        }
    }

    static class NumberOfCpuCores implements Runnable {
        static int cores = -1;
        final CountDownLatch runDone = new CountDownLatch(1);

        NumberOfCpuCores() {
        }

        public int getNumberOfCpuCoresSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.e(GDPAndroid.TAG, "getNumberOfCpuCoresSafe timeout");
            }
            return cores;
        }

        @Override // java.lang.Runnable
        public void run() {
            cores = GDPAndroid.getNumberOfCPUCores();
            this.runDone.countDown();
        }
    }

    static class TotalMemory implements Runnable {
        static int mem;
        final CountDownLatch runDone = new CountDownLatch(1);

        TotalMemory() {
        }

        public int getTotalMemorySafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.e(GDPAndroid.TAG, "getTotalMemorySafe timeout");
            }
            return mem;
        }

        @Override // java.lang.Runnable
        public void run() {
            mem = (int) (GDPAndroid.getTotalMemory(ContextUtils.getApplicationContext()) / 1024);
            this.runDone.countDown();
        }
    }

    public GDPAndroid() {
        if (!isEGL14SupportedHere() || CommonUtility.isSimulator()) {
            return;
        }
        gatherGlInfo();
    }

    private static int extractValue(byte[] buffer, int index) {
        byte b;
        while (index < buffer.length && (b = buffer[index]) != 10) {
            if (Character.isDigit(b)) {
                int i = index + 1;
                while (i < buffer.length && Character.isDigit(buffer[i])) {
                    i++;
                }
                return Integer.parseInt(new String(buffer, 0, index, i - index));
            }
            index++;
        }
        return -1;
    }

    private void gatherGlInfo() {
        try {
            HandlerThread handlerThread = new HandlerThread("Get_GL_info_thread");
            handlerThread.start();
            ThreadUtils.invokeAtFrontUninterruptibly(new Handler(handlerThread.getLooper()), new Runnable() { // from class: io.agora.rtc2.internal.gdp.GDPAndroid.1
                @Override // java.lang.Runnable
                public void run() {
                    EglCore eglCore = new EglCore(null, 2);
                    OffscreenSurface offscreenSurface = new OffscreenSurface(eglCore, 1, 1);
                    offscreenSurface.makeCurrent();
                    GDPAndroid.this.mGpuVendor = GLES20.glGetString(7936);
                    GDPAndroid.this.mGpuRenderer = GLES20.glGetString(7937);
                    offscreenSurface.release();
                    eglCore.release();
                }
            });
            handlerThread.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getBatteryLevel() {
        if (ContextUtils.getApplicationContext() == null) {
            return 0;
        }
        if (mockGDPAndroid) {
            Intent registerReceiver = new ContextWrapper(ContextUtils.getApplicationContext()).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                return (registerReceiver.getIntExtra("level", -1) * 100) / registerReceiver.getIntExtra("scale", -1);
            }
            return 0;
        }
        BatteryManager batteryManager = (BatteryManager) ContextUtils.getApplicationContext().getSystemService("batterymanager");
        if (batteryManager != null) {
            return batteryManager.getIntProperty(4);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCPUMaxFreqKHz() {
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < getNumberOfCPUCores(); i3++) {
            try {
                i2 = getMaxFreq(i3, i2);
            } catch (IOException unused) {
            }
        }
        if (i2 != -1 && !mockGDPAndroid) {
            i = i2;
            Logging.d(TAG, "max freq:" + i);
            return i;
        }
        i = getUnknowCPUMax(i2);
        Logging.d(TAG, "max freq:" + i);
        return i;
    }

    private static int getCoresFromCPUFileList() {
        return new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
    }

    private static int getCoresFromFileInfo(String fileLocation) {
        FileInputStream fileInputStream;
        Throwable th;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(fileLocation);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                try {
                    int coresFromFileString = getCoresFromFileString(bufferedReader.readLine());
                    try {
                        fileInputStream.close();
                        bufferedReader.close();
                        return coresFromFileString;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return coresFromFileString;
                    }
                } catch (IOException unused) {
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            return -1;
                        }
                    }
                    if (bufferedReader == null) {
                        return -1;
                    }
                    bufferedReader.close();
                    return -1;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            throw th;
                        }
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (IOException unused3) {
            bufferedReader = null;
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            bufferedReader = null;
        }
    }

    private static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    private static int getMaxFreq(int i, int maxFreq) throws IOException {
        File file = new File("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
        if (file.exists() && file.canRead()) {
            byte[] bArr = new byte[128];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    int read = fileInputStream.read(bArr);
                    int i2 = 0;
                    while (Character.isDigit(bArr[i2]) && i2 < read) {
                        i2++;
                    }
                    int parseInt = Integer.parseInt(new String(bArr, 0, i2));
                    if (parseInt > maxFreq) {
                        maxFreq = parseInt;
                    }
                    return maxFreq;
                } finally {
                    fileInputStream.close();
                }
            } catch (FileNotFoundException | NumberFormatException | SecurityException unused) {
            }
        }
        return maxFreq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getNumberOfCPUCores() {
        AtomicInteger atomicInteger = new AtomicInteger();
        try {
            atomicInteger.set(getCoresFromFileInfo("/sys/devices/system/cpu/possible"));
            if (atomicInteger.get() == -1 || mockGDPAndroid) {
                atomicInteger.set(getCoresFromFileInfo("/sys/devices/system/cpu/present"));
            }
            if (atomicInteger.get() == -1 || mockGDPAndroid) {
                atomicInteger.set(getCoresFromCPUFileList());
            }
        } catch (NullPointerException | SecurityException unused) {
            atomicInteger.set(-1);
        }
        Logging.d(TAG, "cores:" + atomicInteger);
        return atomicInteger.get();
    }

    public static String getSocName() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method method = cls.getMethod("get", String.class);
            return ((String) method.invoke(cls, "ro.soc.manufacturer")) + " " + ((String) method.invoke(cls, "ro.soc.model"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "";
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return "";
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return "";
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getTotalMemory(Context c) {
        if (c == null) {
            return 0L;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) c.getSystemService(Const.STR_PROCESS_TAG);
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        Logging.d(TAG, "total mem:" + memoryInfo.totalMem);
        return memoryInfo.totalMem;
    }

    public static int getUnknowCPUMax(int maxFreq) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/cpuinfo");
            int parseFileForValue = parseFileForValue("cpu MHz", fileInputStream);
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int i = parseFileForValue * 1000;
            if (i > maxFreq) {
                return i;
            }
            return -1;
        } catch (IOException | SecurityException unused) {
            return -1;
        }
    }

    private boolean isEGL14SupportedHere() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isTemperatureValid(double temp) {
        return temp >= -30.0d && temp <= 250.0d;
    }

    private static int match(int i, String textToMatch, int length, byte[] buffer) {
        for (int i2 = i; i2 < length; i2++) {
            int i3 = i2 - i;
            if (buffer[i2] != textToMatch.charAt(i3)) {
                return -1;
            }
            if (i3 == textToMatch.length() - 1) {
                return extractValue(buffer, i2);
            }
        }
        return -1;
    }

    private static int parseFileForValue(String textToMatch, FileInputStream stream) {
        byte[] bArr = new byte[1024];
        try {
            int read = stream.read(bArr);
            int i = 0;
            while (i < read) {
                byte b = bArr[i];
                if (b == 10 || i == 0) {
                    if (b == 10) {
                        i++;
                    }
                    int match = match(i, textToMatch, read, bArr);
                    if (match > 0) {
                        return match;
                    }
                }
                i++;
            }
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b A[Catch: IOException -> 0x0036, TRY_ENTER, TryCatch #5 {IOException -> 0x0036, blocks: (B:16:0x002b, B:33:0x0083, B:35:0x0088, B:37:0x008d, B:25:0x009b, B:27:0x00a0, B:29:0x00a5, B:41:0x006b, B:43:0x0070, B:45:0x0075), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0 A[Catch: IOException -> 0x0036, TryCatch #5 {IOException -> 0x0036, blocks: (B:16:0x002b, B:33:0x0083, B:35:0x0088, B:37:0x008d, B:25:0x009b, B:27:0x00a0, B:29:0x00a5, B:41:0x006b, B:43:0x0070, B:45:0x0075), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: IOException -> 0x0036, TRY_LEAVE, TryCatch #5 {IOException -> 0x0036, blocks: (B:16:0x002b, B:33:0x0083, B:35:0x0088, B:37:0x008d, B:25:0x009b, B:27:0x00a0, B:29:0x00a5, B:41:0x006b, B:43:0x0070, B:45:0x0075), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[Catch: IOException -> 0x0036, TRY_ENTER, TryCatch #5 {IOException -> 0x0036, blocks: (B:16:0x002b, B:33:0x0083, B:35:0x0088, B:37:0x008d, B:25:0x009b, B:27:0x00a0, B:29:0x00a5, B:41:0x006b, B:43:0x0070, B:45:0x0075), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088 A[Catch: IOException -> 0x0036, TryCatch #5 {IOException -> 0x0036, blocks: (B:16:0x002b, B:33:0x0083, B:35:0x0088, B:37:0x008d, B:25:0x009b, B:27:0x00a0, B:29:0x00a5, B:41:0x006b, B:43:0x0070, B:45:0x0075), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[Catch: IOException -> 0x0036, TRY_LEAVE, TryCatch #5 {IOException -> 0x0036, blocks: (B:16:0x002b, B:33:0x0083, B:35:0x0088, B:37:0x008d, B:25:0x009b, B:27:0x00a0, B:29:0x00a5, B:41:0x006b, B:43:0x0070, B:45:0x0075), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4 A[Catch: IOException -> 0x00b0, TryCatch #10 {IOException -> 0x00b0, blocks: (B:65:0x00ac, B:56:0x00b4, B:58:0x00b9), top: B:64:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9 A[Catch: IOException -> 0x00b0, TRY_LEAVE, TryCatch #10 {IOException -> 0x00b0, blocks: (B:65:0x00ac, B:56:0x00b4, B:58:0x00b9), top: B:64:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.io.InputStreamReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.io.IOException] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double readOneLine(java.io.File r6) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc2.internal.gdp.GDPAndroid.readOneLine(java.io.File):double");
    }

    public static void setMockGDPAndroid(boolean mock) {
        mockGDPAndroid = mock;
    }

    public boolean checkBackground() {
        return new BackGround().checkBackgroundSafe();
    }

    public int getBattery() {
        return new BatteryLevel().getBatteryLevelSafe();
    }

    public int getCpuClock() {
        return new CPUMaxFreqKHz().getCPUMaxFreqKHzSafe();
    }

    public int getCpuCores() {
        return new NumberOfCpuCores().getNumberOfCpuCoresSafe();
    }

    public int getCpuTemperature() {
        return new CPUTemperature().getCpuTemperatureSafe();
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0091: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:36:0x0091 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getCpuVendor() {
        /*
            r8 = this;
            java.lang.String r0 = "failed to close proc file"
            java.lang.String r1 = "GDPAndroid"
            java.lang.String r2 = ""
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45 java.io.FileNotFoundException -> L54
            java.lang.String r5 = "/proc/cpuinfo"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45 java.io.FileNotFoundException -> L54
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.io.IOException -> L3f java.io.FileNotFoundException -> L41 java.lang.Throwable -> L90
            r3.<init>(r4)     // Catch: java.io.IOException -> L3f java.io.FileNotFoundException -> L41 java.lang.Throwable -> L90
        L13:
            java.lang.String r5 = r3.readLine()     // Catch: java.io.IOException -> L3f java.io.FileNotFoundException -> L41 java.lang.Throwable -> L90
            if (r5 == 0) goto L33
            java.lang.String r6 = "Hardware"
            boolean r6 = r5.contains(r6)     // Catch: java.io.IOException -> L3f java.io.FileNotFoundException -> L41 java.lang.Throwable -> L90
            if (r6 != 0) goto L29
            java.lang.String r6 = "hardware"
            boolean r6 = r5.contains(r6)     // Catch: java.io.IOException -> L3f java.io.FileNotFoundException -> L41 java.lang.Throwable -> L90
            if (r6 == 0) goto L13
        L29:
            java.lang.String r3 = ":\\s+"
            r6 = 2
            java.lang.String[] r3 = r5.split(r3, r6)     // Catch: java.io.IOException -> L3f java.io.FileNotFoundException -> L41 java.lang.Throwable -> L90
            r5 = 1
            r2 = r3[r5]     // Catch: java.io.IOException -> L3f java.io.FileNotFoundException -> L41 java.lang.Throwable -> L90
        L33:
            r4.close()     // Catch: java.io.IOException -> L3f java.io.FileNotFoundException -> L41 java.lang.Throwable -> L90
            r4.close()     // Catch: java.io.IOException -> L3a
            goto L62
        L3a:
            r3 = move-exception
            io.agora.utils2.internal.Logging.e(r1, r0, r3)
            goto L62
        L3f:
            r3 = move-exception
            goto L49
        L41:
            r3 = move-exception
            goto L58
        L43:
            r2 = move-exception
            goto L92
        L45:
            r4 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
        L49:
            java.lang.String r5 = "getCpuName failed,"
            io.agora.utils2.internal.Logging.e(r1, r5, r3)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L62
            r4.close()     // Catch: java.io.IOException -> L3a
            goto L62
        L54:
            r4 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
        L58:
            java.lang.String r5 = "getCpuName failed, no /proc/cpuinfo found in system"
            io.agora.utils2.internal.Logging.e(r1, r5, r3)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L62
            r4.close()     // Catch: java.io.IOException -> L3a
        L62:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = getSocName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            java.lang.String r0 = r0.toLowerCase()
            return r0
        L90:
            r2 = move-exception
            r3 = r4
        L92:
            if (r3 == 0) goto L9c
            r3.close()     // Catch: java.io.IOException -> L98
            goto L9c
        L98:
            r3 = move-exception
            io.agora.utils2.internal.Logging.e(r1, r0, r3)
        L9c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc2.internal.gdp.GDPAndroid.getCpuVendor():java.lang.String");
    }

    public String getGpuRenderer() {
        return this.mGpuRenderer;
    }

    public String getGpuVendor() {
        return this.mGpuVendor;
    }

    public int getOsVersion() {
        return Build.VERSION.SDK_INT;
    }

    public int getRam() {
        return new TotalMemory().getTotalMemorySafe();
    }
}
