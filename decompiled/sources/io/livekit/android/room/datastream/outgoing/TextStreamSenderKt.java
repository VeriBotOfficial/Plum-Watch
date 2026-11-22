package io.livekit.android.room.datastream.outgoing;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: TextStreamSender.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\"N\u0010\u0000\u001aB\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0001j\b\u0012\u0004\u0012\u00020\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"stringChunker", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "data", "", "chunkSize", "", "", "Lio/livekit/android/room/datastream/outgoing/DataChunker;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextStreamSenderKt {
    private static final Function2<String, Integer, List<byte[]>> stringChunker = new Function2<String, Integer, List<byte[]>>() { // from class: io.livekit.android.room.datastream.outgoing.TextStreamSenderKt$stringChunker$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<byte[]> invoke(String str, Integer num) {
            return invoke(str, num.intValue());
        }

        public final List<byte[]> invoke(String text, int i) {
            Intrinsics.checkNotNullParameter(text, "text");
            byte[] bytes = text.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < bytes.length) {
                byte b = bytes[i2];
                int i5 = (b & 248) == 240 ? 4 : (b & TransmissionUnpacked.HD_VAL_MAGIC_HB) == 224 ? 3 : (b & 224) == 192 ? 2 : 1;
                if ((i4 - i3) + i5 > i) {
                    byte[] copyOfRange = Arrays.copyOfRange(bytes, i3, i4);
                    Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
                    arrayList.add(copyOfRange);
                    i3 = i4;
                }
                i4 = i2 + i5;
                i2 = i4;
            }
            if (i3 != i4) {
                byte[] copyOfRange2 = Arrays.copyOfRange(bytes, i3, i4);
                Intrinsics.checkNotNullExpressionValue(copyOfRange2, "copyOfRange(...)");
                arrayList.add(copyOfRange2);
            }
            return arrayList;
        }
    };
}
