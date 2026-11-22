package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlin.Metadata;
import org.tensorflow.lite.schema.BuiltinOptions;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\r\u000eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack;", "", "mTrackName", "", "mStartTime", "", "mEndTime", "mStickerTrackType", "Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack$StickerTrackType;", "mSegmentMetadata", "Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack$SegmentMetadata;", "<init>", "(Ljava/lang/String;JJLcom/facebook/video/heroplayer/exocustom/ImfDataTrack$StickerTrackType;Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack$SegmentMetadata;)V", "StickerTrackType", "SegmentMetadata", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.he, reason: from Kotlin metadata */
/* loaded from: assets/audience_network.dex */
public final class ImfDataTrack {
    public static byte[] A05;
    public final long A00;
    public final long A01;
    public final C2486hc A02;
    public final C2487hd A03;
    public final String A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{BuiltinOptions.FloorModOptions, BuiltinOptions.UnsortedSegmentProdOptions, 64, BuiltinOptions.SquareOptions, BuiltinOptions.FloorModOptions, 64, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.BroadcastToOptions, 64, BuiltinOptions.ReverseV2Options, BuiltinOptions.FillOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FillOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.FillOptions, BuiltinOptions.IfOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.CosOptions, 29, BuiltinOptions.LogSoftmaxOptions, 2, 17, 19, 27, BuiltinOptions.LogicalAndOptions, 17, 29, 21};
    }

    public ImfDataTrack(String str, long j, long j2, C2487hd c2487hd, C2486hc c2486hc) {
        C2919p6.A09(str, A00(33, 10, 89));
        C2919p6.A09(c2487hd, A00(16, 17, 24));
        C2919p6.A09(c2486hc, A00(0, 16, 12));
        this.A04 = str;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = c2487hd;
        this.A02 = c2486hc;
    }
}
