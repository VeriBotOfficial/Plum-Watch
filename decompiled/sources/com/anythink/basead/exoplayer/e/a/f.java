package com.anythink.basead.exoplayer.e.a;

import android.util.Log;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.core.common.e.a;
import com.google.common.net.HttpHeaders;
import com.wakeup.howear.game.offline.GamePackageManager;

/* loaded from: classes11.dex */
final class f {
    private static final String F = "und";

    /* renamed from: a, reason: collision with root package name */
    private static final String f2458a = "MetadataUtil";
    private static final int b = af.f("nam");
    private static final int c = af.f("trk");
    private static final int d = af.f("cmt");
    private static final int e = af.f(a.C0193a.k);
    private static final int f = af.f("ART");
    private static final int g = af.f("too");
    private static final int h = af.f("alb");
    private static final int i = af.f("com");
    private static final int j = af.f("wrt");
    private static final int k = af.f("lyr");
    private static final int l = af.f("gen");
    private static final int m = af.f("covr");
    private static final int n = af.f("gnre");
    private static final int o = af.f("grp");
    private static final int p = af.f(GamePackageManager.Stage.DISK);

    /* renamed from: q, reason: collision with root package name */
    private static final int f2459q = af.f("trkn");
    private static final int r = af.f("tmpo");
    private static final int s = af.f("cpil");
    private static final int t = af.f("aART");
    private static final int u = af.f("sonm");
    private static final int v = af.f("soal");
    private static final int w = af.f("soar");
    private static final int x = af.f("soaa");
    private static final int y = af.f("soco");
    private static final int z = af.f("rtng");
    private static final int A = af.f("pgap");
    private static final int B = af.f("sosn");
    private static final int C = af.f("tvsh");
    private static final int D = af.f("----");
    private static final String[] E = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    private f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[Catch: all -> 0x024f, TryCatch #0 {all -> 0x024f, blocks: (B:6:0x0021, B:8:0x0026, B:10:0x002c, B:12:0x0031, B:14:0x0038, B:18:0x003f, B:20:0x0048, B:22:0x004c, B:25:0x0056, B:27:0x005a, B:30:0x0064, B:32:0x0069, B:35:0x0073, B:37:0x0077, B:40:0x0081, B:42:0x0085, B:44:0x0091, B:48:0x00aa, B:51:0x00b8, B:56:0x00cb, B:57:0x00d4, B:59:0x00d8, B:62:0x00e2, B:64:0x00e6, B:67:0x00f0, B:69:0x00f4, B:72:0x00fe, B:74:0x0102, B:77:0x010c, B:79:0x0110, B:82:0x011a, B:84:0x011e, B:87:0x0128, B:89:0x012c, B:92:0x0136, B:94:0x013a, B:97:0x0144, B:99:0x0148, B:102:0x0152, B:104:0x0156, B:107:0x0160, B:109:0x0164, B:112:0x0221, B:116:0x0170, B:118:0x0174, B:120:0x0180, B:123:0x0193, B:124:0x01ad, B:126:0x01b1, B:129:0x01b7, B:131:0x01bb, B:134:0x01c1, B:136:0x01c5, B:139:0x01cf, B:141:0x01d3, B:144:0x01dd, B:146:0x01e1, B:149:0x01eb, B:151:0x01ef, B:154:0x01f9, B:156:0x01fd, B:159:0x0207, B:161:0x020b, B:164:0x0213, B:166:0x0217, B:169:0x023b, B:172:0x0245), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x024f, TRY_LEAVE, TryCatch #0 {all -> 0x024f, blocks: (B:6:0x0021, B:8:0x0026, B:10:0x002c, B:12:0x0031, B:14:0x0038, B:18:0x003f, B:20:0x0048, B:22:0x004c, B:25:0x0056, B:27:0x005a, B:30:0x0064, B:32:0x0069, B:35:0x0073, B:37:0x0077, B:40:0x0081, B:42:0x0085, B:44:0x0091, B:48:0x00aa, B:51:0x00b8, B:56:0x00cb, B:57:0x00d4, B:59:0x00d8, B:62:0x00e2, B:64:0x00e6, B:67:0x00f0, B:69:0x00f4, B:72:0x00fe, B:74:0x0102, B:77:0x010c, B:79:0x0110, B:82:0x011a, B:84:0x011e, B:87:0x0128, B:89:0x012c, B:92:0x0136, B:94:0x013a, B:97:0x0144, B:99:0x0148, B:102:0x0152, B:104:0x0156, B:107:0x0160, B:109:0x0164, B:112:0x0221, B:116:0x0170, B:118:0x0174, B:120:0x0180, B:123:0x0193, B:124:0x01ad, B:126:0x01b1, B:129:0x01b7, B:131:0x01bb, B:134:0x01c1, B:136:0x01c5, B:139:0x01cf, B:141:0x01d3, B:144:0x01dd, B:146:0x01e1, B:149:0x01eb, B:151:0x01ef, B:154:0x01f9, B:156:0x01fd, B:159:0x0207, B:161:0x020b, B:164:0x0213, B:166:0x0217, B:169:0x023b, B:172:0x0245), top: B:2:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anythink.basead.exoplayer.g.a.InterfaceC0141a a(com.anythink.basead.exoplayer.k.s r8) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.e.a.f.a(com.anythink.basead.exoplayer.k.s):com.anythink.basead.exoplayer.g.a$a");
    }

    private static com.anythink.basead.exoplayer.g.b.k a(int i2, String str, s sVar) {
        int i3 = sVar.i();
        if (sVar.i() == a.aK) {
            sVar.d(8);
            return new com.anythink.basead.exoplayer.g.b.k(str, null, sVar.e(i3 - 16));
        }
        Log.w(f2458a, "Failed to parse text attribute: " + a.c(i2));
        return null;
    }

    private static com.anythink.basead.exoplayer.g.b.e a(int i2, s sVar) {
        int i3 = sVar.i();
        if (sVar.i() == a.aK) {
            sVar.d(8);
            String e2 = sVar.e(i3 - 16);
            return new com.anythink.basead.exoplayer.g.b.e("und", e2, e2);
        }
        Log.w(f2458a, "Failed to parse comment attribute: " + a.c(i2));
        return null;
    }

    private static com.anythink.basead.exoplayer.g.b.h a(int i2, String str, s sVar, boolean z2, boolean z3) {
        int d2 = d(sVar);
        if (z3) {
            d2 = Math.min(1, d2);
        }
        if (d2 < 0) {
            Log.w(f2458a, "Failed to parse uint8 attribute: " + a.c(i2));
            return null;
        }
        if (z2) {
            return new com.anythink.basead.exoplayer.g.b.k(str, null, Integer.toString(d2));
        }
        return new com.anythink.basead.exoplayer.g.b.e("und", str, Integer.toString(d2));
    }

    private static com.anythink.basead.exoplayer.g.b.k b(int i2, String str, s sVar) {
        int i3 = sVar.i();
        if (sVar.i() == a.aK && i3 >= 22) {
            sVar.d(10);
            int e2 = sVar.e();
            if (e2 > 0) {
                String valueOf = String.valueOf(e2);
                int e3 = sVar.e();
                if (e3 > 0) {
                    valueOf = valueOf + "/" + e3;
                }
                return new com.anythink.basead.exoplayer.g.b.k(str, null, valueOf);
            }
        }
        Log.w(f2458a, "Failed to parse index/count attribute: " + a.c(i2));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.anythink.basead.exoplayer.g.b.k b(com.anythink.basead.exoplayer.k.s r3) {
        /*
            int r3 = d(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = com.anythink.basead.exoplayer.e.a.f.E
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.anythink.basead.exoplayer.g.b.k r1 = new com.anythink.basead.exoplayer.g.b.k
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            android.util.Log.w(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.e.a.f.b(com.anythink.basead.exoplayer.k.s):com.anythink.basead.exoplayer.g.b.k");
    }

    private static com.anythink.basead.exoplayer.g.b.a c(s sVar) {
        String str;
        int i2 = sVar.i();
        if (sVar.i() == a.aK) {
            int b2 = a.b(sVar.i());
            if (b2 == 13) {
                str = "image/jpeg";
            } else {
                str = b2 == 14 ? "image/png" : null;
            }
            if (str == null) {
                Log.w(f2458a, "Unrecognized cover art flags: ".concat(String.valueOf(b2)));
                return null;
            }
            sVar.d(4);
            int i3 = i2 - 16;
            byte[] bArr = new byte[i3];
            sVar.a(bArr, 0, i3);
            return new com.anythink.basead.exoplayer.g.b.a(str, null, 3, bArr);
        }
        Log.w(f2458a, "Failed to parse cover art attribute");
        return null;
    }

    private static com.anythink.basead.exoplayer.g.b.h a(s sVar, int i2) {
        String str = null;
        String str2 = null;
        int i3 = -1;
        int i4 = -1;
        while (sVar.c() < i2) {
            int c2 = sVar.c();
            int i5 = sVar.i();
            int i6 = sVar.i();
            sVar.d(4);
            if (i6 == a.aI) {
                str = sVar.e(i5 - 12);
            } else if (i6 == a.aJ) {
                str2 = sVar.e(i5 - 12);
            } else {
                if (i6 == a.aK) {
                    i3 = c2;
                    i4 = i5;
                }
                sVar.d(i5 - 12);
            }
        }
        if (str == null || str2 == null || i3 == -1) {
            return null;
        }
        sVar.c(i3);
        sVar.d(16);
        return new com.anythink.basead.exoplayer.g.b.i(str, str2, sVar.e(i4 - 16));
    }

    private static int d(s sVar) {
        sVar.d(4);
        if (sVar.i() == a.aK) {
            sVar.d(8);
            return sVar.d();
        }
        Log.w(f2458a, "Failed to parse uint8 attribute value");
        return -1;
    }
}
