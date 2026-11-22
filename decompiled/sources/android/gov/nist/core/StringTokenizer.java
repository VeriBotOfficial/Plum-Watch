package android.gov.nist.core;

import java.text.ParseException;
import java.util.Vector;

/* loaded from: classes.dex */
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
        int i = this.ptr;
        do {
            int i2 = this.ptr;
            if (i2 >= this.bufferLen) {
                break;
            }
            c = this.buffer[i2];
            this.ptr = i2 + 1;
        } while (c != '\n');
        return String.valueOf(this.buffer, i, this.ptr - i);
    }

    public boolean hasMoreChars() {
        return this.ptr < this.bufferLen;
    }

    public static boolean isHexDigit(char c) {
        if (c < 'A' || c > 'F') {
            return (c >= 'a' && c <= 'f') || isDigit(c);
        }
        return true;
    }

    public static boolean isAlpha(char c) {
        return c <= 127 ? (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') : Character.isLowerCase(c) || Character.isUpperCase(c);
    }

    public static boolean isDigit(char c) {
        if (c <= 127) {
            return c <= '9' && c >= '0';
        }
        return Character.isDigit(c);
    }

    public static boolean isAlphaDigit(char c) {
        return c <= 127 ? (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c <= '9' && c >= '0') : Character.isLowerCase(c) || Character.isUpperCase(c) || Character.isDigit(c);
    }

    public String getLine() {
        int i;
        int i2;
        int i3 = this.ptr;
        while (true) {
            i = this.ptr;
            i2 = this.bufferLen;
            if (i >= i2 || this.buffer[i] == '\n') {
                break;
            }
            this.ptr = i + 1;
        }
        if (i < i2 && this.buffer[i] == '\n') {
            this.ptr = i + 1;
        }
        return String.valueOf(this.buffer, i3, this.ptr - i3);
    }

    public String peekLine() {
        int i = this.ptr;
        String line = getLine();
        this.ptr = i;
        return line;
    }

    public char lookAhead() throws ParseException {
        return lookAhead(0);
    }

    public char lookAhead(int i) throws ParseException {
        try {
            return this.buffer[this.ptr + i];
        } catch (IndexOutOfBoundsException unused) {
            return (char) 0;
        }
    }

    public char getNextChar() throws ParseException {
        int i = this.ptr;
        if (i >= this.bufferLen) {
            throw new ParseException(((Object) this.buffer) + " getNextChar: End of buffer", this.ptr);
        }
        char[] cArr = this.buffer;
        this.ptr = i + 1;
        return cArr[i];
    }

    public void consume() {
        this.ptr = this.savedPtr;
    }

    public void consume(int i) {
        this.ptr += i;
    }

    public Vector<String> getLines() {
        Vector<String> vector = new Vector<>();
        while (hasMoreChars()) {
            vector.addElement(getLine());
        }
        return vector;
    }

    public String getNextToken(char c) throws ParseException {
        int i = this.ptr;
        while (true) {
            char lookAhead = lookAhead(0);
            if (lookAhead == c) {
                return String.valueOf(this.buffer, i, this.ptr - i);
            }
            if (lookAhead == 0) {
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
