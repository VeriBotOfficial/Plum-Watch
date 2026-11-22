package android.gov.nist.javax.sdp.parser;

import android.gov.nist.core.LexerCore;

/* loaded from: classes.dex */
public class Lexer extends LexerCore {
    @Override // android.gov.nist.core.LexerCore
    public void selectLexer(String str) {
    }

    public Lexer(String str, String str2) {
        super(str, str2);
    }

    public static String getFieldName(String str) {
        int indexOf = str.indexOf("=");
        if (indexOf == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
