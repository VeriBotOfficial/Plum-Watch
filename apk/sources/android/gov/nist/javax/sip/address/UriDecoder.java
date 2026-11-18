package android.gov.nist.javax.sip.address;

import android.gov.nist.core.Separators;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: loaded from: classes.dex */
public class UriDecoder {
    static Charset utf8CharSet;

    static {
        try {
            utf8CharSet = Charset.forName("UTF8");
        } catch (UnsupportedCharsetException e) {
            throw new RuntimeException("Problem in decodePath: UTF-8 charset not supported.", e);
        }
    }

    public static String decode(String str) {
        int r1 = str.indexOf(Separators.PERCENT);
        StringBuilder sb = new StringBuilder();
        while (r1 != -1) {
            sb.append(str.substring(0, r1));
            if (r1 + 2 < str.length()) {
                String strSubstring = str.substring(r1 + 1, r1 + 3);
                try {
                    sb.append(utf8CharSet.decode(ByteBuffer.wrap(new byte[]{(byte) Integer.parseInt(strSubstring, 16)})).toString());
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Illegal hex characters in pattern %" + strSubstring);
                }
            }
            str = str.substring(r1 + 3);
            r1 = str.indexOf(Separators.PERCENT);
        }
        sb.append(str);
        return sb.toString();
    }
}
