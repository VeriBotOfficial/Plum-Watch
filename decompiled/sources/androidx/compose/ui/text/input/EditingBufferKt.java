package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import io.nats.client.support.ApiConstants;
import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", ApiConstants.DELETED, "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m5718updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m5554getLengthimpl;
        int m5556getMinimpl = TextRange.m5556getMinimpl(j);
        int m5555getMaximpl = TextRange.m5555getMaximpl(j);
        if (TextRange.m5560intersects5zctL8(j2, j)) {
            if (TextRange.m5548contains5zctL8(j2, j)) {
                m5556getMinimpl = TextRange.m5556getMinimpl(j2);
                m5555getMaximpl = m5556getMinimpl;
            } else {
                if (TextRange.m5548contains5zctL8(j, j2)) {
                    m5554getLengthimpl = TextRange.m5554getLengthimpl(j2);
                } else if (TextRange.m5549containsimpl(j2, m5556getMinimpl)) {
                    m5556getMinimpl = TextRange.m5556getMinimpl(j2);
                    m5554getLengthimpl = TextRange.m5554getLengthimpl(j2);
                } else {
                    m5555getMaximpl = TextRange.m5556getMinimpl(j2);
                }
                m5555getMaximpl -= m5554getLengthimpl;
            }
        } else if (m5555getMaximpl > TextRange.m5556getMinimpl(j2)) {
            m5556getMinimpl -= TextRange.m5554getLengthimpl(j2);
            m5554getLengthimpl = TextRange.m5554getLengthimpl(j2);
            m5555getMaximpl -= m5554getLengthimpl;
        }
        return TextRangeKt.TextRange(m5556getMinimpl, m5555getMaximpl);
    }
}
