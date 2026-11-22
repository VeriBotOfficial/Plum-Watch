package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.tensorflow.lite.schema.BuiltinOptions;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0013\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/instagram/common/viewpoint/core/ViewpointViewNode;", "Lcom/meta/analytics/dsp/uinode/DspViewableNode;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "viewRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getView", "()Landroid/view/View;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getVisibleRectWithinViewport", "", "outGlobalVisibleRect", "Landroid/graphics/Rect;", "outGlobalRect", "viewportRect", "equals", "other", "", "hashCode", "", "Companion", "fbandroid.java.com.instagram.common.viewpoint.core.core_an"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.A5, reason: from Kotlin metadata */
/* loaded from: assets/audience_network.dex */
public final class ViewpointViewNode implements DspViewableNode {
    public static byte[] A01;
    public static String[] A02 = {"qlxMVOnC9COcKZYZMIIp", "e0umeVRVCdZ74AfkeJbH87y4T07IZLh0", "i66o8C63ky1KE2dtbuTW4TOWqloIKDrs", "LkxvoQ7DD1pBAo3rq5X8aF2iImmrJAYT", "6eVsPVOukcdBuHl172QQtpwtpqadKDAQ", "cx1fs60kw", "R4DtDeY0gnGqEQjTJlumZIRTz9kcJt7M", "qFc9SandmZqx0yjNiQ6hc35paacWJuqv"};
    public static final C2937pe A03;
    public static final WeakHashMap<View, ViewpointViewNode> A04;
    public final WeakReference<View> A00;

    public /* synthetic */ ViewpointViewNode(View view, AbstractC2920p7 abstractC2920p7) {
        this(view);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {35, BuiltinOptions.ArgMinOptions, BuiltinOptions.PowOptions, 11, 32, 35, BuiltinOptions.LessEqualOptions, BuiltinOptions.GreaterEqualOptions, 32, 30, BuiltinOptions.LessOptions, BuiltinOptions.SelectOptions, BuiltinOptions.PowOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.IfOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, Byte.MAX_VALUE, 64, BuiltinOptions.MatrixSetDiagOptions, 64, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.SignOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhileOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ExpOptions, BuiltinOptions.GreaterEqualOptions, 63, BuiltinOptions.PowOptions, BuiltinOptions.MaximumMinimumOptions, 58, BuiltinOptions.LogicalOrOptions, 26, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalOrOptions};
        String[] strArr = A02;
        if (strArr[2].charAt(28) != strArr[4].charAt(28)) {
            throw new RuntimeException();
        }
        A02[0] = "5c7wFedRmnB8vDCVoIYp";
        A01 = bArr;
    }

    static {
        A03();
        A03 = new C2937pe(null);
        A04 = new WeakHashMap<>();
    }

    public ViewpointViewNode(View view) {
        this.A00 = new WeakReference<>(view);
    }

    @JvmStatic
    public static final ViewpointViewNode A00(View view) {
        return A03.A02(view);
    }

    @Override // com.facebook.ads.redexgen.core.DspViewableNode
    public final boolean A9Q(Rect rect, Rect rect2, Rect rect3) {
        C2919p6.A09(rect, A01(13, 20, 52));
        C2919p6.A09(rect2, A01(0, 13, 81));
        C2919p6.A09(rect3, A01(33, 12, 85));
        View view = this.A00.get();
        if (view == null) {
            return false;
        }
        return AbstractC2936pd.A00(view, rect, rect2, rect3);
    }

    public final boolean equals(Object other) {
        View view;
        if (other == this) {
            return true;
        }
        if (other != null) {
            Class<?> cls = other.getClass();
            String[] strArr = A02;
            if (strArr[2].charAt(28) != strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            A02[1] = "EpRMW7zpKY57PfT1pdGczBJUTQVGWfux";
            return C2919p6.A0C(cls, getClass()) && (view = this.A00.get()) != null && view == ((ViewpointViewNode) other).A00.get();
        }
        return false;
    }

    public final int hashCode() {
        View view = this.A00.get();
        if (view != null) {
            return view.hashCode();
        }
        return 0;
    }
}
