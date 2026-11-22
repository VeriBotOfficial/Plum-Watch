package androidx.constraintlayout.core.parser;

import android.gov.nist.core.Separators;

/* loaded from: classes10.dex */
public class CLString extends CLElement {
    public CLString(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLString(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        return Separators.QUOTE + content() + Separators.QUOTE;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i);
        sb.append(Separators.QUOTE);
        sb.append(content());
        sb.append(Separators.QUOTE);
        return sb.toString();
    }
}
