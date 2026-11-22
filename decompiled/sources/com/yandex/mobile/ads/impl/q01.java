package com.yandex.mobile.ads.impl;

import com.google.common.net.HttpHeaders;

/* loaded from: classes5.dex */
final class q01 {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f16615a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static t42 b(int i, ag1 ag1Var, String str) {
        int h = ag1Var.h();
        if (ag1Var.h() == 1684108385) {
            ag1Var.f(8);
            return new t42(str, null, ag1Var.b(h - 16));
        }
        et0.d("MetadataUtil", "Failed to parse text attribute: " + kh.a(i));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:8:0x002d, B:10:0x0036, B:12:0x0047, B:14:0x004d, B:16:0x0054, B:20:0x005b, B:22:0x0040, B:25:0x0069, B:30:0x0078, B:35:0x0088, B:40:0x0097, B:45:0x00a6, B:50:0x00b3, B:55:0x00c2, B:60:0x00d1, B:65:0x00e0, B:70:0x00ef, B:75:0x00fe, B:80:0x010d, B:85:0x011c, B:90:0x012b, B:95:0x013a, B:101:0x014d, B:103:0x0153, B:118:0x0167, B:115:0x0173, B:111:0x017e, B:125:0x018b, B:128:0x0234, B:133:0x01aa, B:146:0x01d2, B:151:0x01e1, B:156:0x01f0, B:161:0x01ff, B:166:0x020e, B:171:0x021d, B:176:0x022a, B:179:0x024c, B:182:0x0256), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[Catch: all -> 0x01b2, TRY_LEAVE, TryCatch #0 {all -> 0x01b2, blocks: (B:8:0x002d, B:10:0x0036, B:12:0x0047, B:14:0x004d, B:16:0x0054, B:20:0x005b, B:22:0x0040, B:25:0x0069, B:30:0x0078, B:35:0x0088, B:40:0x0097, B:45:0x00a6, B:50:0x00b3, B:55:0x00c2, B:60:0x00d1, B:65:0x00e0, B:70:0x00ef, B:75:0x00fe, B:80:0x010d, B:85:0x011c, B:90:0x012b, B:95:0x013a, B:101:0x014d, B:103:0x0153, B:118:0x0167, B:115:0x0173, B:111:0x017e, B:125:0x018b, B:128:0x0234, B:133:0x01aa, B:146:0x01d2, B:151:0x01e1, B:156:0x01f0, B:161:0x01ff, B:166:0x020e, B:171:0x021d, B:176:0x022a, B:179:0x024c, B:182:0x0256), top: B:2:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.mobile.ads.impl.ti0 b(com.yandex.mobile.ads.impl.ag1 r13) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.q01.b(com.yandex.mobile.ads.impl.ag1):com.yandex.mobile.ads.impl.ti0");
    }

    private static tq a(int i, ag1 ag1Var) {
        int h = ag1Var.h();
        if (ag1Var.h() == 1684108385) {
            ag1Var.f(8);
            String b = ag1Var.b(h - 16);
            return new tq("und", b, b);
        }
        et0.d("MetadataUtil", "Failed to parse comment attribute: " + kh.a(i));
        return null;
    }

    private static he a(ag1 ag1Var) {
        String str;
        int h = ag1Var.h();
        if (ag1Var.h() == 1684108385) {
            int h2 = ag1Var.h() & 16777215;
            if (h2 == 13) {
                str = "image/jpeg";
            } else {
                str = h2 == 14 ? "image/png" : null;
            }
            if (str == null) {
                xr0.a("Unrecognized cover art flags: ", h2, "MetadataUtil");
                return null;
            }
            ag1Var.f(4);
            int i = h - 16;
            byte[] bArr = new byte[i];
            ag1Var.a(bArr, 0, i);
            return new he(str, null, 3, bArr);
        }
        et0.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    private static t42 a(int i, ag1 ag1Var, String str) {
        int h = ag1Var.h();
        if (ag1Var.h() == 1684108385 && h >= 22) {
            ag1Var.f(10);
            int z = ag1Var.z();
            if (z > 0) {
                String a2 = oe.a("", z);
                int z2 = ag1Var.z();
                if (z2 > 0) {
                    a2 = a2 + "/" + z2;
                }
                return new t42(str, null, a2);
            }
        }
        et0.d("MetadataUtil", "Failed to parse index/count attribute: " + kh.a(i));
        return null;
    }

    private static ti0 a(int i, String str, ag1 ag1Var, boolean z, boolean z2) {
        int i2;
        ag1Var.f(4);
        if (ag1Var.h() == 1684108385) {
            ag1Var.f(8);
            i2 = ag1Var.t();
        } else {
            et0.d("MetadataUtil", "Failed to parse uint8 attribute value");
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 < 0) {
            et0.d("MetadataUtil", "Failed to parse uint8 attribute: " + kh.a(i));
            return null;
        }
        if (z) {
            return new t42(str, null, Integer.toString(i2));
        }
        return new tq("und", str, Integer.toString(i2));
    }
}
