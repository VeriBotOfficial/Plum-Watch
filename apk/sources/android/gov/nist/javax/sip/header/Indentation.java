package android.gov.nist.javax.sip.header;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class Indentation {
    private int indentation;

    protected Indentation() {
        this.indentation = 0;
    }

    protected Indentation(int r1) {
        this.indentation = r1;
    }

    protected void setIndentation(int r1) {
        this.indentation = r1;
    }

    protected int getCount() {
        return this.indentation;
    }

    protected void increment() {
        this.indentation++;
    }

    protected void decrement() {
        this.indentation--;
    }

    protected String getIndentation() {
        char[] cArr = new char[this.indentation];
        Arrays.fill(cArr, ' ');
        return new String(cArr);
    }
}
