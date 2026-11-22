package com.facebook.ads.androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.facebook.ads.redexgen.core.AbstractC12174a;
import com.facebook.ads.redexgen.core.C3M;
import com.facebook.ads.redexgen.core.F6;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public static String[] A06 = {"ToLQMf4zVEPQ4KvEooDgfRDe7yK6oNRK", "K0o48H12GfZKMIt1wQk8mac7vZfrpMfZ", "E5u", "BRaMCvq", "l9UvErrzvq13nAT2kKu87XSUotDZHlU4", "KpcnqVP7VQEeHX003zJg7kklGvYVOXV6", "nWaipra9RnK7e6o7QCyQoP578AoonQfH", "y6ffzf1HkvdiGAu1g8uZUTsw8JywLKMO"};
    public boolean A00;
    public final boolean A01;
    public final F6 A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 72);
            String[] strArr = A06;
            if (strArr[4].charAt(13) != strArr[7].charAt(13)) {
                throw new RuntimeException();
            }
            A06[6] = "JqkQNQrwLqX5JhphVyehfhpUDDUdSiIM";
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{22, 20, 31, 12, 22, 11, 7, 12, 35, BuiltinOptions.ExpOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, 12, BuiltinOptions.SliceOptions, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NotEqualOptions, 61, BuiltinOptions.MaximumMinimumOptions, 4, 6, 13, 30, 10, 9, 19, 30, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, BuiltinOptions.MaximumMinimumOptions, 32, 34, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SparseToDenseOptions, 30, 34, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.EqualOptions, 32, 27, 6, 0, 5, 5, 26, 7, 1, 16, 17, BuiltinOptions.WhereOptions, 5, 7, 28, 26, 7, BuiltinOptions.WhereOptions, 1, 26, BuiltinOptions.WhereOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.WhereOptions, 25, 16, 3, 16, 25, BuiltinOptions.WhereOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.Rfft2dOptions, 12, 11, 8, 13, 63, BuiltinOptions.SliceOptions, 58, BuiltinOptions.GreaterOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ShapeOptions, 58, BuiltinOptions.ReadVariableOptions, BuiltinOptions.NotEqualOptions, 63, BuiltinOptions.GreaterOptions, 58, BuiltinOptions.LessOptions, 63, BuiltinOptions.GreaterOptions, BuiltinOptions.PackOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.NotEqualOptions, 1, BuiltinOptions.LessEqualOptions, BuiltinOptions.PackOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.PowOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.TileOptions, 63, BuiltinOptions.SliceOptions, 61, BuiltinOptions.PackOptions, 11, 25, 21, 11, 13, 22, 31};
        if (A06[6].charAt(20) == 'p') {
            throw new RuntimeException();
        }
        A06[0] = "LdigSr1cvkrlhyQY3m7v5wXMq9EFvMie";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized boolean A05(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            z = true;
            if (!A04) {
                A03 = AbstractC12174a.A02 < 24 ? 0 : A00(context);
                A04 = true;
            }
            if (A03 == 0) {
                z = false;
            }
        }
        return z;
    }

    static {
        A04();
    }

    public DummySurface(F6 f6, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.A02 = f6;
        this.A01 = z;
    }

    public static int A00(Context context) {
        String eglQueryString;
        if (AbstractC12174a.A02 < 26 && (A02(127, 7, 48).equals(AbstractC12174a.A05) || A02(85, 6, 117).equals(AbstractC12174a.A06))) {
            return 0;
        }
        if ((AbstractC12174a.A02 < 26 && !context.getPackageManager().hasSystemFeature(A02(91, 36, 22))) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains(A02(0, 25, 27))) {
            return 0;
        }
        if (eglQueryString.contains(A02(25, 27, 9))) {
            return 1;
        }
        return 2;
    }

    public static DummySurface A01(Context context, boolean z) {
        A03();
        C3M.A08(!z || A05(context));
        return new F6().A04(z ? A03 : 0);
    }

    public static void A03() {
        if (AbstractC12174a.A02 >= 17) {
        } else {
            throw new UnsupportedOperationException(A02(52, 33, 61));
        }
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
