package com.xiaomi.clientreport.processor;

import android.text.TextUtils;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.push.x;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class e {
    public static void a(String str, com.xiaomi.clientreport.data.a[] aVarArr) {
        FileLock fileLock;
        RandomAccessFile randomAccessFile;
        IOException iOException;
        if (aVarArr == null || aVarArr.length <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        FileLock fileLock2 = null;
        try {
            File file = new File(str + ".lock");
            x.m12499a(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileLock2 = randomAccessFile.getChannel().lock();
                HashMap<String, String> m11795a = m11795a(str);
                for (com.xiaomi.clientreport.data.a aVar : aVarArr) {
                    if (aVar != null) {
                        String a2 = a((PerfClientReport) aVar);
                        long j = ((PerfClientReport) aVar).perfCounts;
                        long j2 = ((PerfClientReport) aVar).perfLatencies;
                        if (!TextUtils.isEmpty(a2) && j > 0 && j2 >= 0) {
                            a(m11795a, a2, j, j2);
                        }
                    }
                }
                a(str, m11795a);
                if (fileLock2 != null && fileLock2.isValid()) {
                    try {
                        fileLock2.release();
                    } catch (IOException e) {
                        iOException = e;
                        com.xiaomi.channel.commonutils.logger.b.a(iOException);
                        x.a(randomAccessFile);
                    }
                }
            } catch (Throwable unused) {
                fileLock = fileLock2;
                try {
                    com.xiaomi.channel.commonutils.logger.b.c("failed to write perf to file ");
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException e2) {
                            iOException = e2;
                            com.xiaomi.channel.commonutils.logger.b.a(iOException);
                            x.a(randomAccessFile);
                        }
                    }
                    x.a(randomAccessFile);
                } catch (Throwable th) {
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException e3) {
                            com.xiaomi.channel.commonutils.logger.b.a(e3);
                        }
                    }
                    x.a(randomAccessFile);
                    throw th;
                }
            }
        } catch (Throwable unused2) {
            fileLock = null;
            randomAccessFile = null;
        }
        x.a(randomAccessFile);
    }

    private static void a(HashMap<String, String> hashMap, String str, long j, long j2) {
        String str2;
        String str3 = hashMap.get(str);
        if (TextUtils.isEmpty(str3)) {
            hashMap.put(str, j + "#" + j2);
            return;
        }
        long[] m11796a = m11796a(str3);
        if (m11796a != null) {
            long j3 = m11796a[0];
            if (j3 > 0) {
                long j4 = m11796a[1];
                if (j4 >= 0) {
                    str2 = (j + j3) + "#" + (j2 + j4);
                    hashMap.put(str, str2);
                }
            }
        }
        str2 = j + "#" + j2;
        hashMap.put(str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    protected static long[] m11796a(String str) {
        long[] jArr = new long[2];
        try {
            String[] split = str.split("#");
            if (split.length >= 2) {
                jArr[0] = Long.parseLong(split[0].trim());
                jArr[1] = Long.parseLong(split[1].trim());
            }
            return jArr;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return null;
        }
    }

    private static void a(String str, HashMap<String, String> hashMap) {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e;
        if (TextUtils.isEmpty(str) || hashMap == null || hashMap.size() == 0) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                try {
                    for (String str2 : hashMap.keySet()) {
                        bufferedWriter.write(str2 + "%%%" + hashMap.get(str2));
                        bufferedWriter.newLine();
                    }
                    x.a(bufferedWriter);
                } catch (Exception e2) {
                    e = e2;
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                    x.a(bufferedWriter);
                }
            } catch (Throwable th2) {
                th = th2;
                x.a((Closeable) null);
                throw th;
            }
        } catch (Exception e3) {
            bufferedWriter = null;
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            x.a((Closeable) null);
            throw th;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static HashMap<String, String> m11795a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine != null) {
                                String[] split = readLine.split("%%%");
                                if (split.length >= 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                                    hashMap.put(split[0], split[1]);
                                }
                            } else {
                                x.a(bufferedReader2);
                                return hashMap;
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            com.xiaomi.channel.commonutils.logger.b.a(e);
                            x.a(bufferedReader);
                            return hashMap;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            x.a(bufferedReader);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d7, code lost:
    
        if (r1 != null) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.BufferedReader, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> a(android.content.Context r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.e.a(android.content.Context, java.lang.String):java.util.List");
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String[] m11797a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("#");
    }

    private static PerfClientReport a(String str) {
        PerfClientReport perfClientReport = null;
        try {
            String[] m11797a = m11797a(str);
            if (m11797a == null || m11797a.length < 4 || TextUtils.isEmpty(m11797a[0]) || TextUtils.isEmpty(m11797a[1]) || TextUtils.isEmpty(m11797a[2]) || TextUtils.isEmpty(m11797a[3])) {
                return null;
            }
            perfClientReport = PerfClientReport.getBlankInstance();
            perfClientReport.production = Integer.parseInt(m11797a[0]);
            perfClientReport.clientInterfaceId = m11797a[1];
            perfClientReport.reportType = Integer.parseInt(m11797a[2]);
            perfClientReport.code = Integer.parseInt(m11797a[3]);
            return perfClientReport;
        } catch (Exception unused) {
            com.xiaomi.channel.commonutils.logger.b.c("parse per key error");
            return perfClientReport;
        }
    }

    private static PerfClientReport a(PerfClientReport perfClientReport, String str) {
        long[] m11796a;
        if (perfClientReport == null || (m11796a = m11796a(str)) == null) {
            return null;
        }
        perfClientReport.perfCounts = m11796a[0];
        perfClientReport.perfLatencies = m11796a[1];
        return perfClientReport;
    }

    public static String a(PerfClientReport perfClientReport) {
        return perfClientReport.production + "#" + perfClientReport.clientInterfaceId + "#" + perfClientReport.reportType + "#" + perfClientReport.code;
    }
}
