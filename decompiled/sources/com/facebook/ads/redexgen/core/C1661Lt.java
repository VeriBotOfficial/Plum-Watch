package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.alibaba.fastjson.asm.Opcodes;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.hispark.crashdump.protocol.ProtocolBytes;
import com.wakeup.common.DeviceFeatures;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
/* renamed from: com.facebook.ads.redexgen.X.Lt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1661Lt {
    public static byte[] A02;
    public static final String[] A03;
    public String A00;
    public final InterfaceC12294m A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-91, -123, -53, -66, -54, -62, BuiltinOptions.BitwiseXorOptions, -79, -94, -75, -79, BuiltinOptions.BitwiseXorOptions, -83, ProtocolBytes.SOF, -90, -86, -98, ProtocolBytes.SOF, -74, BuiltinOptions.BitwiseXorOptions, -88, -94, -74, BuiltinOptions.BitwiseXorOptions, -85, -84, -79, BuiltinOptions.BitwiseXorOptions, -85, -78, -87, -87, -119, -55, -62, -53, -60, -47, -59, BuiltinOptions.BitwiseXorOptions, -90, -85, -79, -94, -92, -94, ProtocolBytes.SOF, BuiltinOptions.BitwiseXorOptions, -85, -84, -79, BuiltinOptions.BitwiseXorOptions, -85, -78, -87, -87, -119, -55, -66, -48, -47, PSSSigner.TRAILER_IMPLICIT, -47, -52, -46, -64, -59, PSSSigner.TRAILER_IMPLICIT, -47, -58, -54, -62, -48, -47, -66, -54, -51, BuiltinOptions.BitwiseXorOptions, -90, -85, -79, -94, -92, -94, ProtocolBytes.SOF, BuiltinOptions.BitwiseXorOptions, -85, -84, -79, BuiltinOptions.BitwiseXorOptions, -85, -78, -87, -87, -122, -98, -83, OtaCommandGenerator.CMD_OTA_INFO, -100, ProtocolBytes.SOF, OtaCommandGenerator.CMD_OTA_INFO, BuiltinOptions.SignOptions, ProtocolBytes.SOF, -100, -99, -89, OtaCommandGenerator.CMD_OTA_INFO, BuiltinOptions.SignOptions, -25, -11, -14, -13, -61, -9, -28, -27, -17, -24, -61, -20, -23, -61, -24, -5, -20, -10, -9, -10, -61, Byte.MAX_VALUE, -78, -87, -118, -90, -101, -77, -97, -84, BuiltinOptions.BitwiseXorOptions, -101, -99, -94, -97, Byte.MIN_VALUE, -93, -90, -97, -121, -97, -82, -101, -98, -101, -82, -101, 13, 2, 20, 21, 0, 21, 16, 22, 4, 9, 0, 21, 10, 14, 6, 20, 21, 2, 14, 17, -24, -31, -22, -29, TransmissionUnpacked.HD_VAL_MAGIC_HB, -28, -89, -102, -90, -98, OtaCommandGenerator.CMD_OTA_INFO, -109, -97, -105, BuiltinOptions.AddNOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.AddNOptions, BuiltinOptions.AssignVariableOptions};
    }

    static {
        A03();
        A03 = new String[]{A01(181, 4, 13), A01(DeviceFeatures.AUDIO_MEMORANDUM, 6, 80), A01(155, 20, 117)};
    }

    public C1661Lt(InterfaceC12294m interfaceC12294m) {
        this.A01 = interfaceC12294m;
    }

    private Cursor A00() {
        C3M.A01(this.A00);
        return this.A01.getReadableDatabase().query(this.A00, A03, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(129, 26, 14) + str;
    }

    public static void A04(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(A01(108, 21, 119) + str);
    }

    public final Map<String, C1660Ls> A05() throws C12284l {
        try {
            Cursor A00 = A00();
            try {
                HashMap hashMap = new HashMap(A00.getCount());
                while (A00.moveToNext()) {
                    hashMap.put((String) C3M.A01(A00.getString(0)), new C1660Ls(A00.getLong(1), A00.getLong(2)));
                }
                if (A00 != null) {
                    A00.close();
                }
                return hashMap;
            } finally {
            }
        } catch (SQLException e) {
            throw new C12284l(e);
        }
    }

    public final void A06(long j) throws C12284l {
        try {
            String hexString = Long.toHexString(j);
            String hexUid = A02(hexString);
            this.A00 = hexUid;
            if (AbstractC12314o.A00(this.A01.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    AbstractC12314o.A04(writableDatabase, 2, hexString, 1);
                    String hexUid2 = this.A00;
                    A04(writableDatabase, hexUid2);
                    StringBuilder sb = new StringBuilder();
                    String hexUid3 = A01(95, 13, 47);
                    StringBuilder append = sb.append(hexUid3);
                    String hexUid4 = this.A00;
                    StringBuilder append2 = append.append(hexUid4);
                    String hexUid5 = A01(0, 1, 89);
                    StringBuilder append3 = append2.append(hexUid5);
                    String hexUid6 = A01(1, 94, 49);
                    writableDatabase.execSQL(append3.append(hexUid6).toString());
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (SQLException e) {
            throw new C12284l(e);
        }
    }

    public final void A07(String str) throws C12284l {
        C3M.A01(this.A00);
        try {
            this.A01.getWritableDatabase().delete(this.A00, A01(Opcodes.INVOKEINTERFACE, 8, 6), new String[]{str});
        } catch (SQLException e) {
            throw new C12284l(e);
        }
    }

    public final void A08(String str, long j, long j2) throws C12284l {
        C3M.A01(this.A00);
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(A01(181, 4, 13), str);
            contentValues.put(A01(DeviceFeatures.AUDIO_MEMORANDUM, 6, 80), Long.valueOf(j));
            contentValues.put(A01(155, 20, 117), Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.A00, null, contentValues);
        } catch (SQLException e) {
            throw new C12284l(e);
        }
    }

    public final void A09(Set<String> set) throws C12284l {
        C3M.A01(this.A00);
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.A00, A01(Opcodes.INVOKEINTERFACE, 8, 6), new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C12284l(e);
        }
    }
}
