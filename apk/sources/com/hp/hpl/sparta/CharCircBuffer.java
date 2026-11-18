package com.hp.hpl.sparta;

/* JADX INFO: loaded from: classes16.dex */
class CharCircBuffer {
    private final int[] buf_;
    private int next_ = 0;
    private int total_ = 0;
    private boolean enabled_ = true;

    CharCircBuffer(int r2) {
        this.buf_ = new int[r2];
    }

    void enable() {
        this.enabled_ = true;
    }

    void disable() {
        this.enabled_ = false;
    }

    void addInt(int r2) {
        addRaw(r2 + 65536);
    }

    void addChar(char c) {
        addRaw(c);
    }

    private void addRaw(int r3) {
        if (this.enabled_) {
            int[] r0 = this.buf_;
            int r1 = this.next_;
            r0[r1] = r3;
            this.next_ = (r1 + 1) % r0.length;
            this.total_++;
        }
    }

    void addString(String str) {
        for (char c : str.toCharArray()) {
            addChar(c);
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer((this.buf_.length * 11) / 10);
        int r1 = this.total_;
        int[] r2 = this.buf_;
        int length = r1 < r2.length ? r2.length - r1 : 0;
        while (true) {
            int[] r3 = this.buf_;
            if (length < r3.length) {
                int r4 = r3[(this.next_ + length) % r3.length];
                if (r4 < 65536) {
                    stringBuffer.append((char) r4);
                } else {
                    stringBuffer.append(Integer.toString(r4 - 65536));
                }
                length++;
            } else {
                return stringBuffer.toString();
            }
        }
    }
}
