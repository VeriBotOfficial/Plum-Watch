package com.baidu.ar.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.ar.h;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes12.dex */
public class SystemInfoUtil {
    public static final String COLON = ":";
    public static final String COMMA = ",";
    public static final String LINE_END = "\r\n";
    public static final String NA = "N/A";

    /* renamed from: a, reason: collision with root package name */
    public static StringBuilder f7250a;
    public static StringBuilder b;
    public static StringBuilder sValueBuilder;

    public class a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    public static boolean checkFlashFeature(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
    }

    public static List<String> getAllInfos(Context context, GL10 gl10) {
        f7250a = new StringBuilder();
        b = new StringBuilder();
        sValueBuilder = new StringBuilder();
        long[] romMemroy = getRomMemroy();
        long sDCardTotalSize = getSDCardTotalSize();
        long sDAvailableSizeByM = getSDAvailableSizeByM();
        f7250a.append("基本信息：\n");
        getBaseInfo(context);
        f7250a.append("\n存储：\n");
        getLogStr("可用/内存大小", getAvailMemory(context) + "/" + getRamMemory(context) + "MB");
        getLogStr("可用/ROM存储", romMemroy[1] + "/" + romMemroy[0] + "MB");
        getLogStr("可用/SDCard存储", sDAvailableSizeByM + "/" + sDCardTotalSize + "MB");
        getLogStr("Heap Size", ((int) (Runtime.getRuntime().maxMemory() / 1048576)) + "MB");
        f7250a.append("\nCPU信息：\n");
        getLogStr("CPU名称", getCpuName());
        getLogStr("核心数", String.valueOf(getNumCores()));
        getLogStr("最低频率", getMinCpuFreq() + "MHz");
        getLogStr("最高频率", getMaxCpuFreq() + "MHz");
        getLogStr("当前频率", getCurCpuFreq() + "MHz");
        f7250a.append("\nGPU信息：\n");
        getGPUInfo(gl10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(f7250a.toString());
        arrayList.add(b.toString());
        arrayList.add(sValueBuilder.toString());
        return arrayList;
    }

    public static String getAppName(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static long getAvailMemory(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1048576;
    }

    public static void getBaseInfo(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = context.getResources().getDisplayMetrics().densityDpi;
        getLogStr("手机厂商", Build.BRAND);
        getLogStr("手机型号", Build.MODEL);
        getLogStr("SDK版本", Build.VERSION.SDK);
        getLogStr("系统版本", Build.VERSION.RELEASE);
        getLogStr("屏幕分辨率", displayMetrics.widthPixels + "*" + displayMetrics.heightPixels);
        getLogStr("屏幕密度", f + "dpi");
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r0v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r0v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r0v2 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r0v3 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005c: MOVE (r6 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:57:0x005c */
    public static java.lang.String getCpuName() {
        /*
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            java.lang.String r3 = "/proc/cpuinfo"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5b
            java.lang.String r4 = ":\\s+"
            r5 = 2
            java.lang.String[] r3 = r3.split(r4, r5)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5b
            r4 = 1
            r0 = r3[r4]     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5b
            r2.close()     // Catch: java.io.IOException -> L26
            goto L2a
        L26:
            r2 = move-exception
            r2.printStackTrace()
        L2a:
            r1.close()     // Catch: java.io.IOException -> L2e
            goto L32
        L2e:
            r1 = move-exception
            r1.printStackTrace()
        L32:
            return r0
        L33:
            r3 = move-exception
            goto L43
        L35:
            r2 = move-exception
            goto L5f
        L37:
            r2 = move-exception
            r3 = r2
            r2 = r0
            goto L43
        L3b:
            r1 = move-exception
            r2 = r1
            r1 = r0
            goto L5f
        L3f:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r2 = r1
        L43:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L50
            r2.close()     // Catch: java.io.IOException -> L4c
            goto L50
        L4c:
            r2 = move-exception
            r2.printStackTrace()
        L50:
            if (r1 == 0) goto L5a
            r1.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r1 = move-exception
            r1.printStackTrace()
        L5a:
            return r0
        L5b:
            r0 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
        L5f:
            if (r0 == 0) goto L69
            r0.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r0 = move-exception
            r0.printStackTrace()
        L69:
            if (r1 == 0) goto L73
            r1.close()     // Catch: java.io.IOException -> L6f
            goto L73
        L6f:
            r0 = move-exception
            r0.printStackTrace()
        L73:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.util.SystemInfoUtil.getCpuName():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0061 -> B:12:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getCurCpuFreq() {
        /*
            java.lang.String r0 = "N/A"
            r1 = 0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.lang.String r4 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            int r1 = r1 / 1000
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            r3.close()     // Catch: java.io.IOException -> L30
            goto L34
        L30:
            r1 = move-exception
            r1.printStackTrace()
        L34:
            r2.close()     // Catch: java.io.IOException -> L60
            goto L64
        L38:
            r0 = move-exception
            r1 = r3
            goto L67
        L3b:
            r1 = move-exception
            r5 = r2
            r2 = r1
            r1 = r3
            r3 = r5
            goto L4d
        L41:
            r0 = move-exception
            goto L67
        L43:
            r3 = move-exception
            r5 = r3
            r3 = r2
            r2 = r5
            goto L4d
        L48:
            r0 = move-exception
            r2 = r1
            goto L67
        L4b:
            r2 = move-exception
            r3 = r1
        L4d:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L5a
            r1.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r1 = move-exception
            r1.printStackTrace()
        L5a:
            if (r3 == 0) goto L64
            r3.close()     // Catch: java.io.IOException -> L60
            goto L64
        L60:
            r1 = move-exception
            r1.printStackTrace()
        L64:
            return r0
        L65:
            r0 = move-exception
            r2 = r3
        L67:
            if (r1 == 0) goto L71
            r1.close()     // Catch: java.io.IOException -> L6d
            goto L71
        L6d:
            r1 = move-exception
            r1.printStackTrace()
        L71:
            if (r2 == 0) goto L7b
            r2.close()     // Catch: java.io.IOException -> L77
            goto L7b
        L77:
            r1 = move-exception
            r1.printStackTrace()
        L7b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.util.SystemInfoUtil.getCurCpuFreq():java.lang.String");
    }

    public static void getGPUInfo(GL10 gl10) {
        getLogStr("GL_VENDOR", gl10.glGetString(7936));
        getLogStr("GL_RENDERER", gl10.glGetString(7937));
        getLogStr("GL_VERSION", gl10.glGetString(7938));
    }

    public static void getLogStr(String str, String str2) {
        if (!TextUtils.isEmpty(b.toString())) {
            b.append(",");
        }
        b.append(TextUtils.isEmpty(str) ? NA : str);
        if (!TextUtils.isEmpty(sValueBuilder.toString())) {
            sValueBuilder.append(",");
        }
        sValueBuilder.append(TextUtils.isEmpty(str2) ? NA : str2);
        StringBuilder sb = f7250a;
        if (TextUtils.isEmpty(str)) {
            str = NA;
        }
        StringBuilder append = sb.append(str).append(": ");
        if (TextUtils.isEmpty(str2)) {
            str2 = NA;
        }
        append.append(str2).append("\n");
    }

    public static String getMaxCpuFreq() {
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                sb2.append(new String(bArr, StandardCharsets.UTF_8));
            }
            inputStream.close();
            sb = new StringBuilder(String.valueOf(Integer.parseInt(sb2.toString().trim()) / 1000));
        } catch (Exception e) {
            e.printStackTrace();
            sb = new StringBuilder(NA);
        }
        return sb.toString();
    }

    public static String getMinCpuFreq() {
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                sb2.append(new String(bArr, StandardCharsets.UTF_8));
            }
            inputStream.close();
            sb = new StringBuilder(Integer.parseInt(sb2.toString().trim()) / 1000);
        } catch (Exception unused) {
            sb = new StringBuilder(NA);
        }
        return sb.toString().trim();
    }

    public static int getNumCores() {
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
            h.a("CPU Count: " + listFiles.length);
            return listFiles.length;
        } catch (Exception e) {
            h.a("CPU Count: Failed.");
            e.printStackTrace();
            return 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long getRamMemory(android.content.Context r9) {
        /*
            java.lang.String r9 = "/proc/meminfo"
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            r1.<init>(r2, r9)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            r2 = 8192(0x2000, float:1.148E-41)
            r9.<init>(r1, r2)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            java.lang.String r0 = r9.readLine()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.String r2 = "\\s+"
            java.lang.String[] r2 = r0.split(r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            int r3 = r2.length     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            r4 = 0
        L22:
            if (r4 >= r3) goto L49
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            r6.<init>()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.StringBuilder r6 = r6.append(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.String r7 = ", "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.StringBuilder r5 = r6.append(r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.String r6 = "\t"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            com.baidu.ar.h.c(r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            int r4 = r4 + 1
            goto L22
        L49:
            r0 = 1
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            long r2 = (long) r0
            r9.close()     // Catch: java.io.IOException -> L55
            goto L7e
        L55:
            r9 = move-exception
            r9.printStackTrace()
            goto L7e
        L5a:
            r0 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L8a
        L5f:
            r0 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L6d
        L64:
            r9 = move-exception
            goto L8a
        L66:
            r9 = move-exception
            goto L6d
        L68:
            r9 = move-exception
            r1 = r0
            goto L8a
        L6b:
            r9 = move-exception
            r1 = r0
        L6d:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L7a
            r0.close()     // Catch: java.io.IOException -> L76
            goto L7a
        L76:
            r9 = move-exception
            r9.printStackTrace()
        L7a:
            r2 = 0
            if (r1 == 0) goto L86
        L7e:
            r1.close()     // Catch: java.io.IOException -> L82
            goto L86
        L82:
            r9 = move-exception
            r9.printStackTrace()
        L86:
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 / r0
            return r2
        L8a:
            if (r0 == 0) goto L94
            r0.close()     // Catch: java.io.IOException -> L90
            goto L94
        L90:
            r0 = move-exception
            r0.printStackTrace()
        L94:
            if (r1 == 0) goto L9e
            r1.close()     // Catch: java.io.IOException -> L9a
            goto L9e
        L9a:
            r0 = move-exception
            r0.printStackTrace()
        L9e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.util.SystemInfoUtil.getRamMemory(android.content.Context):long");
    }

    public static long[] getRomMemroy() {
        long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        return new long[]{(r1.getBlockCount() * blockSize) / 1048576, (blockSize * r1.getAvailableBlocks()) / 1048576};
    }

    public static long getSDAvailableSizeByM() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return (statFs.getBlockSize() * statFs.getAvailableBlocks()) / 1048576;
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public static long getSDCardTotalSize() {
        try {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return (statFs.getBlockSize() * statFs.getBlockCount()) / 1048576;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0L;
        }
    }

    public static boolean isHasGyroscope(Context context) {
        return ((SensorManager) context.getSystemService(ak.ac)).getDefaultSensor(4) != null;
    }

    public static boolean isNexus6P() {
        String str = Build.MODEL;
        return "Nexus 6P".equals(str) || "AOSP on angler".equals(str);
    }

    public static boolean isScreenOrientationLandscape(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
