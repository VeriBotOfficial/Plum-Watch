package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class OO {
    public static OO A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<ON>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<ON>> A03 = new HashMap<>();
    public final ArrayList<OM> A02 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{11, 11, BuiltinOptions.HashtableImportOptions, BuiltinOptions.SquareOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.AbsOptions, BuiltinOptions.QuantizeOptions, 11, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SplitVOptions, 11, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, BuiltinOptions.NonMaxSuppressionV4Options, 11, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.FloorModOptions, BuiltinOptions.ZerosLikeOptions, 17, 11, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ArgMinOptions, 22, 19, 11, 26, 13, BuiltinOptions.NonMaxSuppressionV4Options, 18, 30, 11, 28, 23, 26, 27, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.NonMaxSuppressionV4Options, 18, 30, 11, 28, 23, BuiltinOptions.SquareOptions, BuiltinOptions.SplitVOptions, 7, BuiltinOptions.NegOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.NegOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.NegOptions, BuiltinOptions.CastOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BroadcastToOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CastOptions, BuiltinOptions.RankOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SignOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.CosOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.WhereOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentSumOptions, Byte.MAX_VALUE, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.Conv3DOptions, 24, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ExpOptions, BuiltinOptions.NotEqualOptions, 61, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PackOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PackOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ExpOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ExpOptions, BuiltinOptions.SliceOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.DynamicUpdateSliceOptions, 24, BuiltinOptions.SelectOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LogicalOrOptions, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.TileOptions, 58, BuiltinOptions.SelectOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.PowOptions, 58, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquareOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.CosOptions, 12, 9, 28, 9, BuiltinOptions.FloorModOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.HardSwishOptions, 64, BuiltinOptions.BidirectionalSequenceLSTMOptions, 64, BuiltinOptions.FloorDivOptions, BuiltinOptions.QuantizeOptions, 64, 14, BuiltinOptions.IfOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.WhileOptions, BuiltinOptions.FloorDivOptions, 64};
    }

    static {
        A03();
        A07 = new Object();
    }

    public OO(Context context) {
        this.A00 = context;
        this.A01 = new OL(this, context.getMainLooper());
    }

    public static OO A00(Context context) {
        OO oo;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new OO(context.getApplicationContext());
            }
            oo = A05;
        }
        return oo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect condition in loop: B:10:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A02() {
        /*
            r8 = this;
        L0:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.facebook.ads.redexgen.X.ON>> r1 = r8.A04
            monitor-enter(r1)
            java.util.ArrayList<com.facebook.ads.redexgen.X.OM> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L45
            if (r0 > 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            goto L44
        Ld:
            com.facebook.ads.redexgen.X.OM[] r7 = new com.facebook.ads.redexgen.core.OM[r0]     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList<com.facebook.ads.redexgen.X.OM> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            r0.toArray(r7)     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList<com.facebook.ads.redexgen.X.OM> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            r0.clear()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            r6 = 0
        L1b:
            int r0 = r7.length
            if (r6 >= r0) goto L0
            r5 = r7[r6]
            java.util.ArrayList<com.facebook.ads.redexgen.X.ON> r0 = r5.A01
            int r4 = r0.size()
            r3 = 0
        L27:
            if (r3 >= r4) goto L41
            java.util.ArrayList<com.facebook.ads.redexgen.X.ON> r0 = r5.A01
            java.lang.Object r1 = r0.get(r3)
            com.facebook.ads.redexgen.X.ON r1 = (com.facebook.ads.redexgen.core.ON) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L3e
            android.content.BroadcastReceiver r2 = r1.A02
            android.content.Context r1 = r8.A00
            android.content.Intent r0 = r5.A00
            r2.onReceive(r1, r0)
        L3e:
            int r3 = r3 + 1
            goto L27
        L41:
            int r6 = r6 + 1
            goto L1b
        L44:
            return
        L45:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.OO.A02():void");
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<ON> remove = this.A04.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                ON on = remove.get(size);
                on.A01 = true;
                for (int j = 0; j < on.A03.countActions(); j++) {
                    String action = on.A03.getAction(j);
                    ArrayList<ON> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i = arrayList.size();
                        for (int i2 = i - 1; i2 >= 0; i2--) {
                            ON on2 = arrayList.get(i2);
                            if (on2.A02 == broadcastReceiver) {
                                on2.A01 = true;
                                arrayList.remove(i2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            ON on = new ON(intentFilter, broadcastReceiver);
            ArrayList<ON> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(on);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<ON> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(on);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String A01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String action2 = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean debug = (intent.getFlags() & 8) != 0;
            if (debug) {
                StringBuilder sb = new StringBuilder();
                String type = A01(128, 15, 117);
                StringBuilder append = sb.append(type).append(resolveTypeIfNeeded);
                String type2 = A01(62, 8, 58);
                StringBuilder append2 = append.append(type2).append(action2);
                String type3 = A01(51, 11, 53);
                append2.append(type3).append(intent).toString();
            }
            HashMap<String, ArrayList<ON>> hashMap = this.A03;
            String type4 = intent.getAction();
            ArrayList<ON> arrayList = hashMap.get(type4);
            if (arrayList != null) {
                if (debug) {
                    StringBuilder sb2 = new StringBuilder();
                    String type5 = A01(70, 13, 40);
                    sb2.append(type5).append(arrayList).toString();
                }
                ArrayList arrayList2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    ON on = arrayList.get(i);
                    if (debug) {
                        StringBuilder sb3 = new StringBuilder();
                        String type6 = A01(104, 24, 106);
                        sb3.append(type6).append(on.A03).toString();
                    }
                    if (!on.A00) {
                        int match = on.A03.match(action, resolveTypeIfNeeded, action2, data, categories, A01(83, 21, 39));
                        if (match >= 0) {
                            if (debug) {
                                String str = A01(24, 27, 64) + Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(on);
                            on.A00 = true;
                        } else if (debug) {
                            switch (match) {
                                case -4:
                                    A01 = A01(149, 8, 18);
                                    break;
                                case -3:
                                    A01 = A01(143, 6, 102);
                                    break;
                                case -2:
                                    A01 = A01(157, 4, 87);
                                    break;
                                case -1:
                                    A01 = A01(161, 4, 3);
                                    break;
                                default:
                                    A01 = A01(165, 14, 17);
                                    break;
                            }
                            String str2 = A01(0, 24, 20) + A01;
                        }
                    }
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((ON) arrayList2.get(i2)).A00 = false;
                    }
                    this.A02.add(new OM(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
