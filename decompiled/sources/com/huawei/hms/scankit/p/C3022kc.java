package com.huawei.hms.scankit.p;

/* compiled from: TextEncoder.java */
/* renamed from: com.huawei.hms.scankit.p.kc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C3022kc extends C2982ac {
    C3022kc() {
    }

    @Override // com.huawei.hms.scankit.p.C2982ac
    public int a() {
        return 2;
    }

    @Override // com.huawei.hms.scankit.p.C2982ac
    int a(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'a' && c <= 'z') {
            sb.append((char) (c - 'S'));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        }
        if (c == '`') {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) 2);
            sb.append((char) (c - '@'));
            return 2;
        }
        if (c < '{' || c > 127) {
            sb.append("\u0001\u001e");
            return a((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }
}
