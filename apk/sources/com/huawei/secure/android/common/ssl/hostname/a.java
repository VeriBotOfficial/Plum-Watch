package com.huawei.secure.android.common.ssl.hostname;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10819a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private char[] g;

    public a(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f10819a = name;
        this.b = name.length();
    }

    private String a() {
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
                        cArr2[r5] = b();
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

    private char b() {
        int r0 = this.c + 1;
        this.c = r0;
        if (r0 == this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f10819a);
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
                        return c();
                }
        }
    }

    private char c() {
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

    private String d() {
        char[] cArr;
        char c;
        int r0 = this.c;
        if (r0 + 4 >= this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f10819a);
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
            throw new IllegalStateException("Unexpected end of DN: " + this.f10819a);
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

    private String e() {
        int r0;
        int r1;
        int r2;
        int r3;
        char c;
        char c2;
        char c3;
        int r4;
        int r5;
        char c4;
        char c5;
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
            if (r2 >= r3 || (c5 = this.g[r2]) == '=' || c5 == ' ') {
                break;
            }
            this.c = r2 + 1;
        }
        if (r2 >= r3) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f10819a);
        }
        this.e = r2;
        if (this.g[r2] == ' ') {
            while (true) {
                r4 = this.c;
                r5 = this.b;
                if (r4 >= r5 || (c4 = this.g[r4]) == '=' || c4 != ' ') {
                    break;
                }
                this.c = r4 + 1;
            }
            if (this.g[r4] != '=' || r4 == r5) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f10819a);
            }
        }
        this.c++;
        while (true) {
            int r6 = this.c;
            if (r6 >= this.b || this.g[r6] != ' ') {
                break;
            }
            this.c = r6 + 1;
        }
        int r7 = this.e;
        int r8 = this.d;
        if (r7 - r8 > 4) {
            char[] cArr = this.g;
            if (cArr[r8 + 3] == '.' && (((c = cArr[r8]) == 'O' || c == 'o') && (((c2 = cArr[r8 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[r8 + 2]) == 'D' || c3 == 'd')))) {
                this.d = r8 + 4;
            }
        }
        char[] cArr2 = this.g;
        int r9 = this.d;
        return new String(cArr2, r9, this.e - r9);
    }

    private String f() {
        int r0 = this.c + 1;
        this.c = r0;
        this.d = r0;
        this.e = r0;
        while (true) {
            int r1 = this.c;
            if (r1 == this.b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f10819a);
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
                cArr[this.e] = b();
            } else {
                cArr[this.e] = c;
            }
            this.c++;
            this.e++;
        }
    }

    public List<String> b(String str) {
        String strF;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = this.f10819a.toCharArray();
        List<String> listEmptyList = Collections.emptyList();
        String strE = e();
        if (strE == null) {
            return listEmptyList;
        }
        do {
            int r2 = this.c;
            if (r2 < this.b) {
                char c = this.g[r2];
                if (c == '\"') {
                    strF = f();
                } else if (c == '#') {
                    strF = d();
                } else if (c != '+' && c != ',' && c != ';') {
                    strF = a();
                } else {
                    strF = "";
                }
                if (str.equalsIgnoreCase(strE)) {
                    if (listEmptyList.isEmpty()) {
                        listEmptyList = new ArrayList<>();
                    }
                    listEmptyList.add(strF);
                }
                int r1 = this.c;
                if (r1 < this.b) {
                    char c2 = this.g[r1];
                    if (c2 != ',' && c2 != ';' && c2 != '+') {
                        throw new IllegalStateException("Malformed DN: " + this.f10819a);
                    }
                    this.c = r1 + 1;
                    strE = e();
                }
            }
            return listEmptyList;
        } while (strE != null);
        throw new IllegalStateException("Malformed DN: " + this.f10819a);
    }

    private int a(int r10) {
        int r11;
        int r0;
        int r1 = r10 + 1;
        if (r1 < this.b) {
            char[] cArr = this.g;
            char c = cArr[r10];
            if (c >= '0' && c <= '9') {
                r11 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                r11 = c - 'W';
            } else {
                if (c < 'A' || c > 'F') {
                    throw new IllegalStateException("Malformed DN: " + this.f10819a);
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
                    throw new IllegalStateException("Malformed DN: " + this.f10819a);
                }
                r0 = c2 - '7';
            }
            return (r11 << 4) + r0;
        }
        throw new IllegalStateException("Malformed DN: " + this.f10819a);
    }

    public String a(String str) {
        String strF;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = this.f10819a.toCharArray();
        String strE = e();
        if (strE == null) {
            return null;
        }
        do {
            int r2 = this.c;
            if (r2 == this.b) {
                return null;
            }
            char c = this.g[r2];
            if (c == '\"') {
                strF = f();
            } else if (c == '#') {
                strF = d();
            } else if (c != '+' && c != ',' && c != ';') {
                strF = a();
            } else {
                strF = "";
            }
            if (str.equalsIgnoreCase(strE)) {
                return strF;
            }
            int r0 = this.c;
            if (r0 >= this.b) {
                return null;
            }
            char c2 = this.g[r0];
            if (c2 != ',' && c2 != ';' && c2 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f10819a);
            }
            this.c = r0 + 1;
            strE = e();
        } while (strE != null);
        throw new IllegalStateException("Malformed DN: " + this.f10819a);
    }
}
