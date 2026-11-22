package com.yandex.div.storage.db;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DB.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"appendPlaceholders", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", Const.SP_KEY_CALL_LOC_COUNT, "", "div-storage_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DBKt {
    public static final StringBuilder appendPlaceholders(StringBuilder sb, int i) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(Separators.LPAREN);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(Separators.QUESTION);
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
        sb.append(Separators.RPAREN);
        return sb;
    }
}
