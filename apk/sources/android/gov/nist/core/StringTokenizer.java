package android.gov.nist.core;

import java.text.ParseException;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class StringTokenizer {
    protected char[] buffer;
    protected int bufferLen;
    protected int ptr;
    protected int savedPtr;

    protected StringTokenizer() {
    }

    public StringTokenizer(String str) {
        this.buffer = str.toCharArray();
        this.bufferLen = str.length();
        this.ptr = 0;
    }

    public String nextToken() {
        char c;
        int r0 = this.ptr;
        do {
            int r1 = this.ptr;
            if (r1 >= this.bufferLen) {
                break;
            }
            c = this.buffer[r1];
            this.ptr = r1 + 1;
        } while (c != '\n');
        return String.valueOf(this.buffer, r0, this.ptr - r0);
    }

    public boolean hasMoreChars() {
        return this.ptr < this.bufferLen;
    }

    public static boolean isHexDigit(char c) {
        return (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f') || isDigit(c);
    }

    public static boolean isAlpha(char c) {
        if (c <= 127) {
            return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
        }
        return Character.isLowerCase(c) || Character.isUpperCase(c);
    }

    public static boolean isDigit(char c) {
        if (c <= 127) {
            return c <= '9' && c >= '0';
        }
        return Character.isDigit(c);
    }

    public static boolean isAlphaDigit(char c) {
        if (c <= 127) {
            return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c <= '9' && c >= '0');
        }
        return Character.isLowerCase(c) || Character.isUpperCase(c) || Character.isDigit(c);
    }

    public String getLine() {
        int r1;
        int r2;
        int r0 = this.ptr;
        while (true) {
            r1 = this.ptr;
            r2 = this.bufferLen;
            if (r1 >= r2 || this.buffer[r1] == '\n') {
                break;
            }
            this.ptr = r1 + 1;
        }
        if (r1 < r2 && this.buffer[r1] == '\n') {
            this.ptr = r1 + 1;
        }
        return String.valueOf(this.buffer, r0, this.ptr - r0);
    }

    public String peekLine() {
        int r0 = this.ptr;
        String line = getLine();
        this.ptr = r0;
        return line;
    }

    public char lookAhead() throws ParseException {
        return lookAhead(0);
    }

    public char lookAhead(int r3) throws ParseException {
        try {
            return this.buffer[this.ptr + r3];
        } catch (IndexOutOfBoundsException unused) {
            return (char) 0;
        }
    }

    public char getNextChar() throws ParseException {
        int r0 = this.ptr;
        if (r0 >= this.bufferLen) {
            throw new ParseException(((Object) this.buffer) + " getNextChar: End of buffer", this.ptr);
        }
        char[] cArr = this.buffer;
        this.ptr = r0 + 1;
        return cArr[r0];
    }

    public void consume() {
        this.ptr = this.savedPtr;
    }

    public void consume(int r2) {
        this.ptr += r2;
    }

    public Vector<String> getLines() {
        Vector<String> vector = new Vector<>();
        while (hasMoreChars()) {
            vector.addElement(getLine());
        }
        return vector;
    }

    public String getNextToken(char c) throws ParseException {
        int r0 = this.ptr;
        while (true) {
            char cLookAhead = lookAhead(0);
            if (cLookAhead == c) {
                return String.valueOf(this.buffer, r0, this.ptr - r0);
            }
            if (cLookAhead == 0) {
                throw new ParseException("EOL reached", 0);
            }
            consume(1);
        }
    }

    public static String getSDPFieldName(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.substring(0, str.indexOf("="));
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
