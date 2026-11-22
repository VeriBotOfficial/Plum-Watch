package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.iu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2555iu implements M5 {
    public static byte[] A04;
    public static final String[] A05;
    public String A00;
    public String A01;
    public final SparseArray<M4> A02 = new SparseArray<>();
    public final InterfaceC12294m A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{BuiltinOptions.ShapeOptions, BuiltinOptions.PadV2Options, BuiltinOptions.Conv3DOptions, BuiltinOptions.CallOnceOptions, 35, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseV2Options, 35, BuiltinOptions.GatherNdOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.MatrixSetDiagOptions, 35, BuiltinOptions.FloorModOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.MatrixSetDiagOptions, 35, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseSequenceOptions, 35, BuiltinOptions.MirrorPadOptions, BuiltinOptions.RankOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SelectOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ATan2Options, 35, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ReverseSequenceOptions, 35, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseSequenceOptions, 35, BuiltinOptions.MirrorPadOptions, BuiltinOptions.RankOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SelectOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SelectV2Options, 35, BuiltinOptions.FloorDivOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, 35, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseSequenceOptions, 35, BuiltinOptions.MirrorPadOptions, BuiltinOptions.RankOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.NegOptions, BuiltinOptions.LessEqualOptions, 63, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.MirrorPadOptions, 6, 16, 13, 18, BuiltinOptions.SelectV2Options, 22, 3, 0, 14, 7, BuiltinOptions.SelectV2Options, 11, 4, BuiltinOptions.SelectV2Options, 7, 26, 11, 17, 22, 17, BuiltinOptions.SelectV2Options, BuiltinOptions.LessOptions, 20, 3, BuiltinOptions.LogicalOrOptions, 0, 13, 21, 9, 30, BuiltinOptions.SelectOptions, 13, 15, 4, 9, BuiltinOptions.CastOptions, 2, 8, 9, 20, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.WhereOptions, 18, 31, BuiltinOptions.HardSwishOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.FillOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ScatterNdOptions};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.M5
    public final void AAj(HashMap<String, M4> hashMap, SparseArray<String> sparseArray) throws IOException {
        C2553is A02;
        C3M.A08(this.A02.size() == 0);
        try {
            if (AbstractC12314o.A00(this.A03.getReadableDatabase(), 1, (String) C3M.A01(this.A00)) != 1) {
                SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    A04(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
            Cursor A00 = A00();
            while (A00.moveToNext()) {
                try {
                    int i = A00.getInt(0);
                    String str = (String) C3M.A01(A00.getString(1));
                    A02 = M6.A02(new DataInputStream(new ByteArrayInputStream(A00.getBlob(2))));
                    M4 m4 = new M4(i, str, A02);
                    hashMap.put(m4.A02, m4);
                    sparseArray.put(m4.A01, m4.A02);
                } finally {
                }
            }
            if (A00 != null) {
                A00.close();
            }
        } catch (SQLiteException e) {
            hashMap.clear();
            sparseArray.clear();
            throw new C12284l(e);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.M5
    public final void AJY(HashMap<String, M4> hashMap) throws IOException {
        if (this.A02.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < this.A02.size(); i++) {
                try {
                    M4 valueAt = this.A02.valueAt(i);
                    if (valueAt == null) {
                        A05(writableDatabase, this.A02.keyAt(i));
                    } else {
                        A06(writableDatabase, valueAt);
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.A02.clear();
        } catch (SQLException e) {
            throw new C12284l(e);
        }
    }

    static {
        A03();
        A05 = new String[]{A01(128, 2, 48), A01(136, 3, 37), A01(139, 8, 1)};
    }

    public C2555iu(InterfaceC12294m interfaceC12294m) {
        this.A03 = interfaceC12294m;
    }

    private Cursor A00() {
        return this.A03.getReadableDatabase().query((String) C3M.A01(this.A01), A05, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(109, 19, 109) + str;
    }

    private void A04(SQLiteDatabase sQLiteDatabase) throws C12284l {
        AbstractC12314o.A04(sQLiteDatabase, 1, (String) C3M.A01(this.A00), 1);
        A07(sQLiteDatabase, (String) C3M.A01(this.A01));
        sQLiteDatabase.execSQL(A01(75, 13, 108) + this.A01 + A01(0, 1, 22) + A01(1, 74, 2));
    }

    private void A05(SQLiteDatabase sQLiteDatabase, int i) {
        sQLiteDatabase.delete((String) C3M.A01(this.A01), A01(130, 6, 122), new String[]{Integer.toString(i)});
    }

    private void A06(SQLiteDatabase sQLiteDatabase, M4 m4) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        M6.A08(m4.A03(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(A01(128, 2, 48), Integer.valueOf(m4.A01));
        contentValues.put(A01(136, 3, 37), m4.A02);
        contentValues.put(A01(139, 8, 1), byteArray);
        sQLiteDatabase.replaceOrThrow((String) C3M.A01(this.A01), null, contentValues);
    }

    public static void A07(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(A01(88, 21, 67) + str);
    }

    public static void A08(InterfaceC12294m interfaceC12294m, String str) throws C12284l {
        try {
            String A02 = A02(str);
            SQLiteDatabase writableDatabase = interfaceC12294m.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                AbstractC12314o.A03(writableDatabase, 1, str);
                A07(writableDatabase, A02);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C12284l(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void A5h() throws C12284l {
        A08(this.A03, (String) C3M.A01(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final boolean A6K() throws C12284l {
        try {
            return AbstractC12314o.A00(this.A03.getReadableDatabase(), 1, (String) C3M.A01(this.A00)) != -1;
        } catch (SQLException e) {
            throw new C12284l(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void AA7(long j) {
        this.A00 = Long.toHexString(j);
        this.A01 = A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void AEv(M4 m4, boolean z) {
        if (z) {
            this.A02.delete(m4.A01);
        } else {
            this.A02.put(m4.A01, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void AFa(M4 m4) {
        this.A02.put(m4.A01, m4);
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void AJX(HashMap<String, M4> hashMap) throws IOException {
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                A04(writableDatabase);
                Iterator<M4> it = hashMap.values().iterator();
                while (it.hasNext()) {
                    A06(writableDatabase, it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.A02.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C12284l(e);
        }
    }
}
