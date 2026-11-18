package com.anythink.core.common.n.b.a.j;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes16.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4141a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private char[] g;

    private d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f4141a = name;
        this.b = name.length();
    }

    private String a() {
        int r0;
        int r1;
        int r2;
        int r3;
        int r4;
        char c;
        int r5;
        int r6;
        char c2;
        char c3;
        while (true) {
            r0 = this.c;
            r1 = this.b;
            if (r0 >= r1 || this.g[r0] != ' ') {
                break;
            }
            this.c = r0 + 1;
        }
        if (r0 == r1) {
            return null;
        }
        this.d = r0;
        this.c = r0 + 1;
        while (true) {
            r2 = this.c;
            r3 = this.b;
            if (r2 >= r3 || (c3 = this.g[r2]) == '=' || c3 == ' ') {
                break;
            }
            this.c = r2 + 1;
        }
        if (r2 >= r3) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f4141a);
        }
        this.e = r2;
        if (this.g[r2] == ' ') {
            while (true) {
                r5 = this.c;
                r6 = this.b;
                if (r5 >= r6 || (c2 = this.g[r5]) == '=' || c2 != ' ') {
                    break;
                }
                this.c = r5 + 1;
            }
            if (this.g[r5] != '=' || r5 == r6) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f4141a);
            }
        }
        do {
            r4 = this.c + 1;
            this.c = r4;
            if (r4 >= this.b) {
                break;
            }
        } while (this.g[r4] == ' ');
        int r7 = this.e;
        int r8 = this.d;
        if (r7 - r8 > 4) {
            char[] cArr = this.g;
            if (cArr[r8 + 3] == '.' && (((c = cArr[r8]) == 'O' || c == 'o') && ((cArr[r8 + 1] == 'I' || cArr[r8 + 1] == 'i') && (cArr[r8 + 2] == 'D' || cArr[r8 + 2] == 'd')))) {
                this.d = r8 + 4;
            }
        }
        char[] cArr2 = this.g;
        int r9 = this.d;
        return new String(cArr2, r9, this.e - r9);
    }

    private String b() {
        int r0 = this.c + 1;
        this.c = r0;
        this.d = r0;
        this.e = r0;
        while (true) {
            int r1 = this.c;
            if (r1 == this.b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f4141a);
            }
            char[] cArr = this.g;
            char c = cArr[r1];
            if (c == '\"') {
                this.c = r1 + 1;
                while (true) {
                    int r2 = this.c;
                    if (r2 >= this.b || this.g[r2] != ' ') {
                        break;
                    }
                    this.c = r2 + 1;
                }
                char[] cArr2 = this.g;
                int r3 = this.d;
                return new String(cArr2, r3, this.e - r3);
            }
            if (c == '\\') {
                cArr[this.e] = e();
            } else {
                cArr[this.e] = c;
            }
            this.c++;
            this.e++;
        }
    }

    private String c() {
        char[] cArr;
        char c;
        int r0 = this.c;
        if (r0 + 4 >= this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f4141a);
        }
        this.d = r0;
        this.c = r0 + 1;
        while (true) {
            int r1 = this.c;
            if (r1 == this.b || (c = (cArr = this.g)[r1]) == '+' || c == ',' || c == ';') {
                this.e = r1;
                break;
            }
            if (c == ' ') {
                this.e = r1;
                this.c = r1 + 1;
                while (true) {
                    int r2 = this.c;
                    if (r2 >= this.b || this.g[r2] != ' ') {
                        break;
                    }
                    this.c = r2 + 1;
                }
            } else {
                if (c >= 'A' && c <= 'F') {
                    cArr[r1] = (char) (c + ' ');
                }
                this.c = r1 + 1;
            }
        }
        int r3 = this.e;
        int r4 = this.d;
        int r5 = r3 - r4;
        if (r5 < 5 || (r5 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f4141a);
        }
        int r6 = r5 / 2;
        byte[] bArr = new byte[r6];
        int r7 = r4 + 1;
        for (int r8 = 0; r8 < r6; r8++) {
            bArr[r8] = (byte) a(r7);
            r7 += 2;
        }
        return new String(this.g, this.d, r5);
    }

    private String d() {
        int r0;
        int r1;
        char c;
        int r2 = this.c;
        this.d = r2;
        this.e = r2;
        while (true) {
            int r3 = this.c;
            if (r3 >= this.b) {
                char[] cArr = this.g;
                int r4 = this.d;
                return new String(cArr, r4, this.e - r4);
            }
            char[] cArr2 = this.g;
            char c2 = cArr2[r3];
            if (c2 != ' ') {
                if (c2 != ';') {
                    if (c2 == '\\') {
                        int r5 = this.e;
                        this.e = r5 + 1;
                        cArr2[r5] = e();
                        this.c++;
                    } else if (c2 != '+' && c2 != ',') {
                        int r6 = this.e;
                        this.e = r6 + 1;
                        cArr2[r6] = c2;
                        this.c = r3 + 1;
                    }
                }
                char[] cArr3 = this.g;
                int r7 = this.d;
                return new String(cArr3, r7, this.e - r7);
            }
            int r8 = this.e;
            this.f = r8;
            this.c = r3 + 1;
            this.e = r8 + 1;
            cArr2[r8] = ' ';
            while (true) {
                r0 = this.c;
                r1 = this.b;
                if (r0 >= r1) {
                    break;
                }
                char[] cArr4 = this.g;
                if (cArr4[r0] != ' ') {
                    break;
                }
                int r9 = this.e;
                this.e = r9 + 1;
                cArr4[r9] = ' ';
                this.c = r0 + 1;
            }
            if (r0 == r1 || (c = this.g[r0]) == ',' || c == '+' || c == ';') {
                char[] cArr5 = this.g;
                int r10 = this.d;
                return new String(cArr5, r10, this.f - r10);
            }
        }
    }

    private char e() {
        int r0 = this.c + 1;
        this.c = r0;
        if (r0 == this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f4141a);
        }
        char c = this.g[r0];
        if (c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#') {
            return c;
        }
        switch (c) {
            case '*':
            case '+':
            case ',':
                return c;
            default:
                switch (c) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c;
                    default:
                        return f();
                }
        }
    }

    private char f() {
        int r0;
        int r3;
        int r1 = a(this.c);
        this.c++;
        if (r1 < 128) {
            return (char) r1;
        }
        if (r1 < 192 || r1 > 247) {
            return '?';
        }
        if (r1 <= 223) {
            r0 = r1 & 31;
            r3 = 1;
        } else if (r1 <= 239) {
            r0 = r1 & 15;
            r3 = 2;
        } else {
            r0 = r1 & 7;
            r3 = 3;
        }
        for (int r5 = 0; r5 < r3; r5++) {
            int r6 = this.c;
            int r7 = r6 + 1;
            this.c = r7;
            if (r7 == this.b || this.g[r7] != '\\') {
                return '?';
            }
            int r8 = r6 + 2;
            this.c = r8;
            int r9 = a(r8);
            this.c++;
            if ((r9 & 192) != 128) {
                return '?';
            }
            r0 = (r0 << 6) + (r9 & 63);
        }
        return (char) r0;
    }

    private int a(int r10) {
        int r11;
        int r0;
        int r1 = r10 + 1;
        if (r1 >= this.b) {
            throw new IllegalStateException("Malformed DN: " + this.f4141a);
        }
        char[] cArr = this.g;
        char c = cArr[r10];
        if (c >= '0' && c <= '9') {
            r11 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            r11 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f4141a);
            }
            r11 = c - '7';
        }
        char c2 = cArr[r1];
        if (c2 >= '0' && c2 <= '9') {
            r0 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            r0 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f4141a);
            }
            r0 = c2 - '7';
        }
        return (r11 << 4) + r0;
    }

    private String a(String str) {
        String str2;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = this.f4141a.toCharArray();
        String strA = a();
        if (strA == null) {
            return null;
        }
        do {
            int r2 = this.c;
            if (r2 == this.b) {
                return null;
            }
            char c = this.g[r2];
            if (c == '\"') {
                int r3 = r2 + 1;
                this.c = r3;
                this.d = r3;
                this.e = r3;
                while (true) {
                    int r4 = this.c;
                    if (r4 == this.b) {
                        throw new IllegalStateException("Unexpected end of DN: " + this.f4141a);
                    }
                    char[] cArr = this.g;
                    char c2 = cArr[r4];
                    if (c2 == '\"') {
                        this.c = r4 + 1;
                        while (true) {
                            int r5 = this.c;
                            if (r5 >= this.b || this.g[r5] != ' ') {
                                break;
                            }
                            this.c = r5 + 1;
                        }
                        char[] cArr2 = this.g;
                        int r7 = this.d;
                        str2 = new String(cArr2, r7, this.e - r7);
                        break;
                    }
                    if (c2 == '\\') {
                        cArr[this.e] = e();
                    } else {
                        cArr[this.e] = c2;
                    }
                    this.c++;
                    this.e++;
                }
            } else if (c == '#') {
                str2 = c();
            } else if (c == '+' || c == ',' || c == ';') {
                str2 = "";
            } else {
                str2 = d();
            }
            if (str.equalsIgnoreCase(strA)) {
                return str2;
            }
            int r0 = this.c;
            if (r0 >= this.b) {
                return null;
            }
            char c3 = this.g[r0];
            if (c3 != ',' && c3 != ';' && c3 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f4141a);
            }
            this.c = r0 + 1;
            strA = a();
        } while (strA != null);
        throw new IllegalStateException("Malformed DN: " + this.f4141a);
    }
}
