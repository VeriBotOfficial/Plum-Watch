package com.airbnb.lottie.parser.moshi;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
final class JsonScope {
    static final int CLOSED = 8;
    static final int DANGLING_NAME = 4;
    static final int EMPTY_ARRAY = 1;
    static final int EMPTY_DOCUMENT = 6;
    static final int EMPTY_OBJECT = 3;
    static final int NONEMPTY_ARRAY = 2;
    static final int NONEMPTY_DOCUMENT = 7;
    static final int NONEMPTY_OBJECT = 5;

    private JsonScope() {
    }

    static String getPath(int r4, int[] r5, String[] strArr, int[] r7) {
        StringBuilder sb = new StringBuilder("$");
        for (int r1 = 0; r1 < r4; r1++) {
            int r2 = r5[r1];
            if (r2 == 1 || r2 == 2) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST).append(r7[r1]).append(AbstractJsonLexerKt.END_LIST);
            } else if (r2 == 3 || r2 == 4 || r2 == 5) {
                sb.append('.');
                String str = strArr[r1];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
