package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.no, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2843no extends SQLiteOpenHelper implements InterfaceC12294m {
    public static byte[] A00;
    public static String[] A01 = {"YuTOcDzSk33WzGuHUm34fIUZdR6FzBSo", "XTKHU7ykX6HxNiJgN0rgjCseZECTQtra", "VEZqd6OFp5mQyS5r43nHHulMPiVDQ9eW", "aLYnSlPQY916exG9yEmf5vg4GfwoTrU7", "tF23Z6GUlh0Fjg1gJR8XevpVUkpWaXM2", "mepItLhmIU8NS8JNKSf8apCSosOFfjC4", "Cz0Pux5KFog27POOTk7sr9rS4XUT", "HqOHPFLqaLH3svqHIBOSrAzDJwUDQThi"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
            String[] strArr = A01;
            if (strArr[0].charAt(22) == strArr[2].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "n1qaiWHrUpNnLAu01u7Aygvt6fyaUUnG";
            strArr2[3] = "NzqeYJq8DJ4S2vkSjhcMbPo6SDo1HpGr";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.BroadcastToOptions, 1, 14, BuiltinOptions.BroadcastToOptions, 13, 16, 1, 27, 28, 27, BuiltinOptions.BroadcastToOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.FillOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.GeluOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.PackOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.RandomOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.PackOptions, BuiltinOptions.PowOptions, BuiltinOptions.NegOptions, BuiltinOptions.SelectOptions, 10, 31, 10, 9, 10, 24, 14, BuiltinOptions.PackOptions, 25, 4, 29, 2, 15, 14, 25, BuiltinOptions.GeluOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnsortedSegmentMinOptions, Byte.MAX_VALUE, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DensifyOptions, Byte.MAX_VALUE, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BitwiseXorOptions, 63, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BucketizeOptions, 63, BuiltinOptions.SliceOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ExpandDimsOptions, 25, 27, 6, 3, 30, 15, BuiltinOptions.EqualOptions, 7, 11, 25, 30, 15, 24, 34, 32, 61, BuiltinOptions.PowOptions, BuiltinOptions.CastOptions, BuiltinOptions.ExpandDimsOptions, 14, 34, BuiltinOptions.ExpandDimsOptions, 32, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpandDimsOptions, 63, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpandDimsOptions, 64, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FillOptions, BuiltinOptions.ReverseV2Options};
    }

    static {
        A01();
    }

    public C2843no(Context context) {
        super(context.getApplicationContext(), A00(50, 21, 61), (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static void A02(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query(A00(75, 13, 70), new String[]{A00(103, 4, 24), A00(71, 4, 125)}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!A00(88, 15, 125).equals(string2)) {
                    String str = A00(11, 5, 56) + string + A00(0, 11, 100) + string2;
                    try {
                        sQLiteDatabase.execSQL(str);
                    } catch (SQLException e) {
                        String type = A00(32, 18, 71);
                        AnonymousClass44.A08(type, A00(16, 16, 55) + str, e);
                    }
                }
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        A02(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
