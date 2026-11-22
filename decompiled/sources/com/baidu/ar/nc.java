package com.baidu.ar;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.ar.util.SystemInfoUtil;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public class nc {

    public class a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    public static long a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1048576;
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
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0071: MOVE (r6 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:62:0x0071 */
    public static java.lang.String a() {
        /*
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            java.lang.String r3 = "/proc/cpuinfo"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            java.lang.String r3 = "utf-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L70
            java.lang.String r4 = ":\\s+"
            r5 = 2
            java.lang.String[] r3 = r3.split(r4, r5)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L70
            r4 = 0
        L24:
            int r5 = r3.length     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L70
            if (r4 >= r5) goto L2a
            int r4 = r4 + 1
            goto L24
        L2a:
            r4 = 1
            r0 = r3[r4]     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L70
            r2.close()     // Catch: java.io.IOException -> L31
            goto L37
        L31:
            r2 = move-exception
            java.io.PrintStream r3 = java.lang.System.out
            r2.printStackTrace(r3)
        L37:
            r1.close()     // Catch: java.io.IOException -> L3b
            goto L41
        L3b:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.out
            r1.printStackTrace(r2)
        L41:
            return r0
        L42:
            r3 = move-exception
            goto L52
        L44:
            r2 = move-exception
            goto L74
        L46:
            r2 = move-exception
            r3 = r2
            r2 = r0
            goto L52
        L4a:
            r1 = move-exception
            r2 = r1
            r1 = r0
            goto L74
        L4e:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r2 = r1
        L52:
            java.io.PrintStream r4 = java.lang.System.out     // Catch: java.lang.Throwable -> L70
            r3.printStackTrace(r4)     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L5d
            goto L63
        L5d:
            r2 = move-exception
            java.io.PrintStream r3 = java.lang.System.out
            r2.printStackTrace(r3)
        L63:
            if (r1 == 0) goto L6f
            r1.close()     // Catch: java.io.IOException -> L69
            goto L6f
        L69:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.out
            r1.printStackTrace(r2)
        L6f:
            return r0
        L70:
            r0 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
        L74:
            if (r0 == 0) goto L80
            r0.close()     // Catch: java.io.IOException -> L7a
            goto L80
        L7a:
            r0 = move-exception
            java.io.PrintStream r3 = java.lang.System.out
            r0.printStackTrace(r3)
        L80:
            if (r1 == 0) goto L8c
            r1.close()     // Catch: java.io.IOException -> L86
            goto L8c
        L86:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.out
            r0.printStackTrace(r1)
        L8c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.nc.a():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long b(android.content.Context r10) {
        /*
            java.lang.String r10 = "/proc/meminfo"
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            java.lang.String r10 = "utf-8"
            java.nio.charset.Charset r10 = java.nio.charset.Charset.forName(r10)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            r1.<init>(r2, r10)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r2 = 8192(0x2000, float:1.148E-41)
            r10.<init>(r1, r2)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.lang.String r0 = r10.readLine()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r2 = "\\s+"
            java.lang.String[] r2 = r0.split(r2)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            int r3 = r2.length     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            r4 = 0
        L26:
            if (r4 >= r3) goto L4f
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r6 = "bdar:"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            r7.<init>()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.StringBuilder r7 = r7.append(r0)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r8 = ", "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.StringBuilder r5 = r7.append(r5)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r7 = "\t"
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            android.util.Log.i(r6, r5)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            int r4 = r4 + 1
            goto L26
        L4f:
            r0 = 1
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            long r2 = (long) r0
            r10.close()     // Catch: java.io.IOException -> L5b
            goto L87
        L5b:
            r10 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            r10.printStackTrace(r0)
            goto L87
        L62:
            r0 = move-exception
            goto L99
        L64:
            r0 = move-exception
            r9 = r0
            r0 = r10
            r10 = r9
            goto L72
        L69:
            r10 = move-exception
            goto L9c
        L6b:
            r10 = move-exception
            goto L72
        L6d:
            r10 = move-exception
            r1 = r0
            goto L9c
        L70:
            r10 = move-exception
            r1 = r0
        L72:
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Throwable -> L95
            r10.printStackTrace(r2)     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L83
            r0.close()     // Catch: java.io.IOException -> L7d
            goto L83
        L7d:
            r10 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            r10.printStackTrace(r0)
        L83:
            r2 = 0
            if (r1 == 0) goto L91
        L87:
            r1.close()     // Catch: java.io.IOException -> L8b
            goto L91
        L8b:
            r10 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            r10.printStackTrace(r0)
        L91:
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 / r0
            return r2
        L95:
            r10 = move-exception
            r9 = r0
            r0 = r10
            r10 = r9
        L99:
            r9 = r0
            r0 = r10
            r10 = r9
        L9c:
            if (r0 == 0) goto La8
            r0.close()     // Catch: java.io.IOException -> La2
            goto La8
        La2:
            r0 = move-exception
            java.io.PrintStream r2 = java.lang.System.out
            r0.printStackTrace(r2)
        La8:
            if (r1 == 0) goto Lb4
            r1.close()     // Catch: java.io.IOException -> Lae
            goto Lb4
        Lae:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.out
            r0.printStackTrace(r1)
        Lb4:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.nc.b(android.content.Context):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x006b -> B:12:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b() {
        /*
            java.lang.String r0 = "N/A"
            r1 = 0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.lang.String r4 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.lang.String r4 = "utf-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            int r1 = r1 / 1000
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r3.close()     // Catch: java.io.IOException -> L34
            goto L3a
        L34:
            r1 = move-exception
            java.io.PrintStream r3 = java.lang.System.out
            r1.printStackTrace(r3)
        L3a:
            r2.close()     // Catch: java.io.IOException -> L6a
            goto L70
        L3e:
            r0 = move-exception
            r1 = r3
            goto L73
        L41:
            r1 = move-exception
            r5 = r2
            r2 = r1
            r1 = r3
            r3 = r5
            goto L53
        L47:
            r0 = move-exception
            goto L73
        L49:
            r3 = move-exception
            r5 = r3
            r3 = r2
            r2 = r5
            goto L53
        L4e:
            r0 = move-exception
            r2 = r1
            goto L73
        L51:
            r2 = move-exception
            r3 = r1
        L53:
            java.io.PrintStream r4 = java.lang.System.out     // Catch: java.lang.Throwable -> L71
            r2.printStackTrace(r4)     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L64
            r1.close()     // Catch: java.io.IOException -> L5e
            goto L64
        L5e:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.out
            r1.printStackTrace(r2)
        L64:
            if (r3 == 0) goto L70
            r3.close()     // Catch: java.io.IOException -> L6a
            goto L70
        L6a:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.out
            r1.printStackTrace(r2)
        L70:
            return r0
        L71:
            r0 = move-exception
            r2 = r3
        L73:
            if (r1 == 0) goto L7f
            r1.close()     // Catch: java.io.IOException -> L79
            goto L7f
        L79:
            r1 = move-exception
            java.io.PrintStream r3 = java.lang.System.out
            r1.printStackTrace(r3)
        L7f:
            if (r2 == 0) goto L8b
            r2.close()     // Catch: java.io.IOException -> L85
            goto L8b
        L85:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.out
            r1.printStackTrace(r2)
        L8b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.nc.b():java.lang.String");
    }

    public static String c() {
        String str;
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            String str2 = "";
            while (inputStream.read(bArr) != -1) {
                str2 = str2 + new String(bArr, "utf-8");
            }
            inputStream.close();
            str = String.valueOf(Integer.parseInt(str2.trim()) / 1000);
        } catch (Exception e) {
            e.printStackTrace(System.out);
            str = SystemInfoUtil.NA;
        }
        return String.valueOf(str);
    }

    public static boolean c(Context context) {
        return ((SensorManager) context.getSystemService(ak.ac)).getDefaultSensor(4) != null;
    }

    public static String d() {
        String str;
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            String str2 = "";
            while (inputStream.read(bArr) != -1) {
                str2 = str2 + new String(bArr, "utf-8");
            }
            inputStream.close();
            str = String.valueOf(Integer.parseInt(str2.trim()) / 1000);
        } catch (Exception unused) {
            str = SystemInfoUtil.NA;
        }
        return str.trim();
    }

    public static boolean d(Context context) {
        String str = Build.MODEL;
        return "RLIAN00".equalsIgnoreCase(str) || "RLIN29".equalsIgnoreCase(str) || "TAH-AN00".equalsIgnoreCase(str) || "TAHN29".equalsIgnoreCase(str) || "TAH-AN00m".equalsIgnoreCase(str) || "RLI-N29".equalsIgnoreCase(str) || "TAH-N29".equalsIgnoreCase(str) || "RHA-AN00m".equalsIgnoreCase(str);
    }

    public static int e() {
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
            Log.d("bdar", "CPU Count: " + listFiles.length);
            return listFiles.length;
        } catch (Exception e) {
            Log.d("bdar", "CPU Count: Failed.");
            e.printStackTrace(System.out);
            return 1;
        }
    }

    public static long[] f() {
        long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        return new long[]{(r1.getBlockCount() * blockSize) / 1048576, (blockSize * r1.getAvailableBlocks()) / 1048576};
    }

    public static long g() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return (statFs.getBlockSize() * statFs.getAvailableBlocks()) / 1048576;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return 0L;
        }
    }

    public static long h() {
        try {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return (statFs.getBlockSize() * statFs.getBlockCount()) / 1048576;
        } catch (Throwable th) {
            th.printStackTrace(System.out);
            return 0L;
        }
    }

    public static boolean i() {
        return true;
    }

    public static boolean j() {
        return "Nexus 5X".equals(Build.MODEL);
    }

    public static boolean k() {
        String str = Build.MODEL;
        return "Nexus 6P".equals(str) || "AOSP on angler".equals(str);
    }
}
