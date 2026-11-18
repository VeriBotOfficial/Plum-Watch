package com.hp.hpl.sparta.xpath;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes16.dex */
public class SimpleStreamTokenizer {
    private static final int QUOTE = -6;
    public static final int TT_EOF = -1;
    public static final int TT_NUMBER = -2;
    public static final int TT_WORD = -3;
    private static final int WHITESPACE = -5;
    private int nextType_;
    private final Reader reader_;
    public int ttype = Integer.MIN_VALUE;
    public int nval = Integer.MIN_VALUE;
    public String sval = "";
    private final StringBuffer buf_ = new StringBuffer();
    private final int[] charType_ = new int[256];
    private boolean pushedBack_ = false;
    private char inQuote_ = 0;

    public String toString() {
        int r0 = this.ttype;
        if (r0 != -3) {
            if (r0 == -2) {
                return Integer.toString(this.nval);
            }
            if (r0 == -1) {
                return "(EOF)";
            }
            if (r0 != 34) {
                if (r0 == 39) {
                    return Separators.QUOTE + this.sval + Separators.QUOTE;
                }
                return Separators.QUOTE + ((char) this.ttype) + Separators.QUOTE;
            }
        }
        return "\"" + this.sval + "\"";
    }

    public SimpleStreamTokenizer(Reader reader) throws IOException {
        char c = 0;
        this.reader_ = reader;
        while (true) {
            int[] r3 = this.charType_;
            if (c >= r3.length) {
                nextToken();
                return;
            }
            if (('A' <= c && c <= 'Z') || (('a' <= c && c <= 'z') || c == '-')) {
                r3[c] = -3;
            } else if ('0' <= c && c <= '9') {
                r3[c] = -2;
            } else if (c >= 0 && c <= ' ') {
                r3[c] = -5;
            } else {
                r3[c] = c;
            }
            c = (char) (c + 1);
        }
    }

    public void ordinaryChar(char c) {
        this.charType_[c] = c;
    }

    public void wordChars(char c, char c2) {
        while (c <= c2) {
            this.charType_[c] = -3;
            c = (char) (c + 1);
        }
    }

    public int nextToken() throws IOException {
        int r2;
        int r4;
        char c;
        boolean z;
        boolean z2;
        int r0;
        if (this.pushedBack_) {
            this.pushedBack_ = false;
            return this.ttype;
        }
        this.ttype = this.nextType_;
        do {
            boolean z3 = false;
            do {
                r2 = this.reader_.read();
                if (r2 == -1) {
                    if (this.inQuote_ != 0) {
                        throw new IOException("Unterminated quote");
                    }
                    r4 = -1;
                } else {
                    r4 = this.charType_[r2];
                }
                c = this.inQuote_;
                z = c == 0 && r4 == -5;
                z3 = z3 || z;
            } while (z);
            if (r4 == 39 || r4 == 34) {
                if (c == 0) {
                    this.inQuote_ = (char) r4;
                } else if (c == r4) {
                    this.inQuote_ = (char) 0;
                }
            }
            char c2 = this.inQuote_;
            if (c2 != 0) {
                r4 = c2;
            }
            z2 = z3 || !(((r0 = this.ttype) < -1 || r0 == 39 || r0 == 34) && r0 == r4);
            if (z2) {
                int r10 = this.ttype;
                if (r10 == -3) {
                    this.sval = this.buf_.toString();
                    this.buf_.setLength(0);
                } else if (r10 == -2) {
                    this.nval = Integer.parseInt(this.buf_.toString());
                    this.buf_.setLength(0);
                } else if (r10 == 34 || r10 == 39) {
                    this.sval = this.buf_.toString().substring(1, this.buf_.length() - 1);
                    this.buf_.setLength(0);
                }
                if (r4 != -5) {
                    this.nextType_ = r4 == -6 ? r2 : r4;
                }
            }
            if (r4 == -3 || r4 == -2 || r4 == 34 || r4 == 39) {
                this.buf_.append((char) r2);
            }
        } while (!z2);
        return this.ttype;
    }

    public void pushBack() {
        this.pushedBack_ = true;
    }
}
