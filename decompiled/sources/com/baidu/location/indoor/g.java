package com.baidu.location.indoor;

import com.baidu.location.indoor.mapversion.IndoorJni;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static Lock f7756a = new ReentrantLock();
    private static final byte[] b = {BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions};
    private static boolean c = false;

    public static int a(int i) {
        if (!a()) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        f7756a.lock();
        try {
            return IndoorJni.getInout(currentTimeMillis, i);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                return -1;
            } finally {
                f7756a.unlock();
            }
        }
    }

    public static void a(double d, double d2, float f, float f2, float f3, double d3, int i, long j) {
        if (a()) {
            f7756a.lock();
            try {
                IndoorJni.setGps(d, d2, f, f2, f3, d3, i, j);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    f7756a.unlock();
                }
            }
        }
    }

    public static void a(double d, double d2, String str, int i, long j, int i2) {
        if (a()) {
            if (str == null || "".equals(str)) {
                str = "unknow";
            }
            String str2 = str;
            f7756a.lock();
            try {
                IndoorJni.setBleLoc4Scenario(d, d2, str2, i, j, i2);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    f7756a.unlock();
                }
            }
        }
    }

    public static void a(float f, long j) {
        if (a()) {
            f7756a.lock();
            try {
                IndoorJni.setBarometers(f, j);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    f7756a.unlock();
                }
            }
        }
    }

    public static boolean a() {
        return IndoorJni.loadJniSuccess;
    }

    public static String[] a(int i, int i2, String str) {
        String[] strArr = new String[0];
        byte[] d = com.baidu.location.h.i.d(str);
        if (a()) {
            try {
                return IndoorJni.decrypt(i, i2, d, b).split(",");
            } catch (Throwable unused) {
            }
        }
        return strArr;
    }

    public static String b() {
        if (!a()) {
            return "";
        }
        f7756a.lock();
        try {
            String buildingId = IndoorJni.getBuildingId(System.currentTimeMillis());
            f7756a.unlock();
            return buildingId;
        } catch (Throwable unused) {
            f7756a.unlock();
            return "";
        }
    }

    public static String b(int i) {
        if (!a()) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        f7756a.lock();
        try {
            return IndoorJni.getFloor(currentTimeMillis, i);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                return "";
            } finally {
                f7756a.unlock();
            }
        }
    }
}
