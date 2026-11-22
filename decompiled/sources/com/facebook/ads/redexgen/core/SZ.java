package com.facebook.ads.redexgen.core;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class SZ {
    public static byte[] A04;
    public static final String A05;
    public static final Lock A06;
    public static final Lock A07;
    public static final ReentrantReadWriteLock A08;
    public SQLiteOpenHelper A00;
    public final C2202cu A01;
    public final C2200cs A03 = new C2200cs(this);
    public final C2201ct A02 = new C2201ct(this);

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A04 = new byte[]{-82, -53, -82, BuiltinOptions.HashtableImportOptions, -117, BuiltinOptions.HashtableImportOptions, -116, BuiltinOptions.WhereOptions, BuiltinOptions.UnsortedSegmentProdOptions, -120, BuiltinOptions.UnsortedSegmentMinOptions, -102, -64, -52, -55, -57, -102, Byte.MAX_VALUE, -87, -82, -88, -83, Byte.MAX_VALUE, BuiltinOptions.DepthToSpaceOptions, -118, -121, -117, -121, OtaCommandGenerator.CMD_GET_INFO_TLV, BuiltinOptions.DepthToSpaceOptions, -93, -46, -47, -93, BuiltinOptions.ReverseSequenceOptions, -122, -119, BuiltinOptions.SignOptions, BuiltinOptions.BitcastOptions, -119, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.UnsortedSegmentSumOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.WhereOptions, -120, BuiltinOptions.ATan2Options, -119, BuiltinOptions.WhereOptions, -115, -60, -75, -78, -65, -78, -115, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.GeluOptions, -82, -94, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.HashtableSizeOptions, -101, -99, -55, -25, -12, -12, -11, -6, -90, -23, -25, -14, -14, -90, -19, -21, -6, -54, -25, -6, -25, -24, -25, -7, -21, -90, -20, -8, -11, -13, -90, -6, -18, -21, -90, -37, -49, -90, -6, -18, -8, -21, -25, -22, -89, OtaCommandGenerator.CMD_NOTIFY_STATUS, -126, -119, -126, Byte.MIN_VALUE, OtaCommandGenerator.CMD_GET_INFO, BuiltinOptions.WhileOptions, -79, -84, -88, -94, -85, -80, BuiltinOptions.HashtableOptions, -64, -69, ProtocolBytes.SOF, -84, -65, -80, -117, -29, -32, -13, -32, -31, -32, -14, -28, OtaCommandGenerator.CMD_NOTIFY_STATUS, -95, OtaCommandGenerator.CMD_NOTIFY_STATUS, -103, -97, -98, -116, -121, -125, BuiltinOptions.BitwiseXorOptions, -122, -117};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0J() {
        for (int i = 0; i < A0M().length; i++) {
        }
        if (this.A00 != null) {
            this.A00.close();
            this.A00 = null;
        }
    }

    static {
        A07();
        StringBuilder append = new StringBuilder().append(A05(107, 14, 44)).append(C2200cs.A03.A01);
        String A052 = A05(58, 2, 113);
        StringBuilder append2 = append.append(A052);
        String A053 = A05(142, 6, 7);
        StringBuilder append3 = append2.append(A053);
        String A054 = A05(60, 1, 31);
        StringBuilder append4 = append3.append(A054).append(C2200cs.A02.A01).append(A052);
        String A055 = A05(136, 6, 26);
        A05 = append4.append(A055).append(A054).append(C2201ct.A04.A01).append(A052).append(A055).append(A054).append(C2201ct.A05.A01).append(A052).append(A055).append(A054).append(C2201ct.A0A.A01).append(A052).append(A055).append(A054).append(C2201ct.A08.A01).append(A052).append(A055).append(A054).append(C2201ct.A07.A01).append(A052).append(A055).append(A054).append(C2201ct.A06.A01).append(A052).append(A055).append(A054).append(C2201ct.A03.A01).append(A052).append(A055).append(A054).append(C2201ct.A02.A01).append(A05(11, 6, 105)).append(A055).append(A05(17, 6, 78)).append(A053).append(A05(30, 4, 114)).append(A055).append(A054).append(C2201ct.A09.A01).append(A05(0, 3, 125)).append(A053).append(A054).append(C2200cs.A03.A01).append(A05(34, 10, 38)).append(A055).append(A054).append(C2201ct.A08.A01).append(A05(7, 4, 36)).toString();
        A08 = new ReentrantReadWriteLock();
        A06 = A08.readLock();
        A07 = A08.writeLock();
    }

    public SZ(C2202cu c2202cu) {
        this.A01 = c2202cu;
    }

    private synchronized SQLiteDatabase A00() {
        if (this.A00 == null) {
            this.A00 = new C1820Sa(this.A01, this);
        }
        return this.A00.getWritableDatabase();
    }

    private synchronized SQLiteDatabase A01() {
        SQLiteException e = null;
        for (int i = 0; i < 10; i++) {
            try {
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
        this.A01.A08().AAy(A05(128, 8, 110), AbstractC1841Sv.A0v, new C1842Sw(e));
        throw e;
        return A00();
    }

    public final int A08(int i) {
        A07.lock();
        try {
            return A0E().delete(A05(136, 6, 26), C2201ct.A02.A01 + A05(3, 4, 60), new String[]{String.valueOf(i - 1)});
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A09() {
        A06.lock();
        try {
            return this.A02.A0B();
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0A() {
        A06.lock();
        try {
            return this.A02.A0C();
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0B() {
        A06.lock();
        try {
            return this.A03.A0B();
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0C(int i) {
        A06.lock();
        try {
            return A0E().rawQuery(A05 + A05(23, 7, 45) + String.valueOf(i), null);
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0D(String str) {
        A06.lock();
        try {
            return this.A02.A0D(str);
        } finally {
            A06.unlock();
        }
    }

    public final SQLiteDatabase A0E() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return A01();
        }
        throw new IllegalStateException(A05(64, 43, 117));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Sc != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Tg != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public final <T> AsyncTask A0F(AbstractC1822Sc<T> abstractC1822Sc, AbstractC1852Tg<T> abstractC1852Tg) {
        return XR.A00(XU.A07, new SY(this.A01, abstractC1822Sc, abstractC1852Tg), new Void[0]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Tg != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    public final AsyncTask A0G(final String str, final int i, final String str2, final double d, final double d2, final String str3, final Map<String, String> data, AbstractC1852Tg<String> abstractC1852Tg) {
        return A0F(new AbstractC2199cr<String>() { // from class: com.facebook.ads.redexgen.X.6L
            public static byte[] A08;
            public static String[] A09 = {"ZKW0rplATEIsE5gjt8qXTQnY", "r6HJdeSoORQdJfGxA0AnZWlkU33wQIlK", "lLZOtDHAe6uwMhK1fYaqg", "CFnqFcdcZfU1FaRsph1ThokBMpi4uqZk", "TONJvFd", "LRRDDC4", "oqOd7Km", "E"};

            public static String A01(int i2, int i3, int i4) {
                byte[] copyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
                for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                    copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 122);
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                byte[] bArr = {BuiltinOptions.PowOptions, BuiltinOptions.EqualOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ArgMinOptions};
                if (A09[2].length() == 32) {
                    throw new RuntimeException();
                }
                A09[2] = "0lpDBp9tBU8jLddyd5eWZp";
                A08 = bArr;
            }

            static {
                A02();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1822Sc
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final String A03() {
                C2202cu c2202cu;
                Lock lock;
                Lock lock2;
                C2202cu c2202cu2;
                C2202cu c2202cu3;
                Lock lock3;
                C2202cu c2202cu4;
                C2201ct c2201ct;
                C2200cs c2200cs;
                Lock lock4;
                C2202cu c2202cu5;
                String eventId = A01(0, 8, 90);
                c2202cu = SZ.this.A01;
                c2202cu.A08().A9v(str2);
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                lock = SZ.A07;
                lock.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        sQLiteDatabase = SZ.this.A0E();
                        sQLiteDatabase.beginTransaction();
                        c2201ct = SZ.this.A02;
                        c2200cs = SZ.this.A03;
                        String A0E = c2201ct.A0E(c2200cs.A0C(str), i, str2, d, d2, str3, data);
                        sQLiteDatabase.setTransactionSuccessful();
                        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Exception e) {
                                c2202cu5 = SZ.this.A01;
                                c2202cu5.A08().AAy(eventId, AbstractC1841Sv.A0z, new C1842Sw(e));
                            }
                        }
                        lock4 = SZ.A07;
                        lock4.unlock();
                        return A0E;
                    } catch (Exception e2) {
                        A01(EnumC1821Sb.A05);
                        c2202cu3 = SZ.this.A01;
                        c2202cu3.A08().AAy(eventId, AbstractC1841Sv.A0y, new C1842Sw(e2));
                        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Exception e3) {
                                c2202cu4 = SZ.this.A01;
                                c2202cu4.A08().AAy(eventId, AbstractC1841Sv.A0z, new C1842Sw(e3));
                            }
                        }
                        lock3 = SZ.A07;
                        lock3.unlock();
                        return null;
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        boolean isOpen = sQLiteDatabase.isOpen();
                        if (A09[5].length() != 7) {
                            throw new RuntimeException();
                        }
                        A09[2] = "rWG930h";
                        if (isOpen) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Exception e4) {
                                c2202cu2 = SZ.this.A01;
                                c2202cu2.A08().AAy(eventId, AbstractC1841Sv.A0z, new C1842Sw(e4));
                            }
                        }
                    }
                    lock2 = SZ.A07;
                    lock2.unlock();
                    throw th;
                }
            }
        }, abstractC1852Tg);
    }

    public final void A0H() {
        A07.lock();
        try {
            this.A02.A09();
            this.A03.A09();
        } finally {
            A07.unlock();
        }
    }

    public final void A0I() {
        A07.lock();
        try {
            this.A03.A0D(this.A01);
        } finally {
            A07.unlock();
        }
    }

    public final boolean A0K(String str) {
        A07.lock();
        try {
            return this.A02.A0F(str);
        } finally {
            A07.unlock();
        }
    }

    public final boolean A0L(String str) {
        boolean z;
        A07.lock();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(A05(121, 7, 90)).append(A05(136, 6, 26)).append(A05(44, 5, 36)).append(C2201ct.A02.A01).append(A05(61, 1, 32)).append(C2201ct.A02.A01).append(A05(56, 2, 50)).append(A05(49, 7, 92)).append(C2201ct.A04.A01).append(A05(62, 2, 77));
            A0E().execSQL(sb.toString(), new String[]{str});
            z = true;
        } catch (SQLiteException unused) {
            z = false;
        }
        A07.unlock();
        return z;
    }

    public final AbstractC1823Sd[] A0M() {
        return new AbstractC1823Sd[]{this.A03, this.A02};
    }
}
