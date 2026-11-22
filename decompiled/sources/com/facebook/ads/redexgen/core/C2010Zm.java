package com.facebook.ads.redexgen.core;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.wakeup.common.DeviceFeatures;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Zm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2010Zm extends Drawable {
    public static byte[] A0G;
    public static String[] A0H = {"uAADS07vuTt2bWOOIRXTK9bzUqfZPQ", "cn6RXotf6zZwAeB3lSiWP6IveEHpbDAc", "fqHIMQcIn36ckD7HtV78", "rZKbd1qqPOm2jxQd70eAyB6uz1tOgPbY", "sxaVjDfKgR8b2unSnmAv", "1UAN8XI5lzImEv5q", "fr57qg0eWkx6ppTTUiLmxnyxz7CpPvLf", "EJnXX6RVHz5b530rZ3EkT3HbTheO6nDW"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public String A04;
    public String A05;
    public String A06;
    public WeakReference<C2301eX> A07;
    public boolean A08;
    public final Paint A09 = new Paint();
    public final Paint A0A = new Paint();
    public final Path A0C = new Path();
    public final TextPaint A0E = new TextPaint();
    public final Paint A0B = new Paint();
    public final Handler A0D = new Handler();
    public final Runnable A0F = new C1619Kd(this);

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0G = new byte[]{12, 26, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.NegOptions, BuiltinOptions.SliceOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.NegOptions, 35, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SliceOptions, BuiltinOptions.IfOptions, Byte.MAX_VALUE, BuiltinOptions.AssignVariableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SliceOptions, 0, 24, 4, 6, 24, 6, 29, 63, BuiltinOptions.GreaterOptions, 58, BuiltinOptions.RightShiftOptions, 7, 32, BuiltinOptions.MaximumMinimumOptions, 58, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SelectOptions, 34, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.MaximumMinimumOptions, 32, BuiltinOptions.LessOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.RankOptions, 29, BuiltinOptions.GatherNdOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.CosOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.IfOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.CosOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FillOptions, 29, BuiltinOptions.RightShiftOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.RankOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SplitVOptions, 29, BuiltinOptions.GatherNdOptions, BuiltinOptions.AddNOptions, BuiltinOptions.RangeOptions, 29, BuiltinOptions.AbsOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.RangeOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ShapeOptions, BuiltinOptions.QuantizeOptions, 10, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions};
    }

    static {
        A04();
    }

    public C2010Zm() {
        this.A09.setColor(Color.argb(127, 36, 36, 36));
        this.A09.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A0A.setAntiAlias(true);
        this.A0A.setColor(Color.argb(DeviceFeatures.DIAL_THUMB, 0, 255, 0));
        this.A0A.setStrokeWidth(20.0f);
        this.A0A.setStyle(Paint.Style.STROKE);
        this.A0E.setAntiAlias(true);
        this.A0E.setColor(-1);
        this.A0E.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A0E.setTextSize(30.0f);
        this.A0B.setColor(Color.argb(212, 0, 0, 0));
        this.A0B.setStyle(Paint.Style.FILL_AND_STROKE);
        A07();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0103 A[LOOP:0: B:25:0x0101->B:26:0x0103, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A03() {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2010Zm.A03():void");
    }

    public final void A07() {
        this.A00 = 0;
        this.A01 = -1;
        this.A05 = A02(32, 15, 65);
        this.A02 = 100;
        this.A06 = null;
        this.A03 = -1L;
        this.A07 = null;
        A0D(false);
    }

    public final void A08(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        A03();
    }

    public final void A09(long j) {
        this.A03 = j;
        A03();
    }

    public final void A0A(C2301eX c2301eX) {
        this.A07 = new WeakReference<>(c2301eX);
        A03();
    }

    public final void A0B(String str) {
        this.A04 = str;
        A03();
    }

    public final void A0C(String str) {
        this.A06 = str;
        A03();
    }

    public final void A0D(boolean z) {
        this.A08 = z;
        if (this.A08) {
            this.A0D.post(this.A0F);
        } else {
            this.A0D.removeCallbacks(this.A0F);
        }
        invalidateSelf();
    }

    public final boolean A0E() {
        return this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.A08) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        canvas.drawRect(0.0f, 0.0f, width, height, this.A09);
        StaticLayout textLayout = new StaticLayout(this.A05, this.A0E, this.A02, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        float width2 = textLayout.getWidth() / 2.0f;
        float height2 = textLayout.getHeight() / 2.0f;
        float canvasMiddleY = f - width2;
        float textMiddleX = f2 - height2;
        float textMiddleY = f + width2;
        canvas.drawRect(canvasMiddleY - 40.0f, textMiddleX - 40.0f, textMiddleY + 40.0f, f2 + height2 + 40.0f, this.A0B);
        canvas.save();
        canvas.translate(f - width2, f2 - height2);
        textLayout.draw(canvas);
        canvas.restore();
        this.A0C.reset();
        this.A0C.moveTo(0.0f, 0.0f);
        this.A0C.lineTo(width, 0.0f);
        this.A0C.lineTo(width, height);
        this.A0C.lineTo(0.0f, height);
        this.A0C.lineTo(0.0f, 0.0f);
        canvas.drawPath(this.A0C, this.A0A);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
