package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kk0;
import com.yandex.mobile.ads.impl.y11;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
final class gl2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f15605a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r7 == (-1)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.yandex.mobile.ads.impl.y11 b(java.lang.String r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r20
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = com.yandex.mobile.ads.impl.fl2.c(r0, r1)
            r3 = 0
            if (r2 == 0) goto Ld1
            com.yandex.mobile.ads.impl.kk0 r2 = com.yandex.mobile.ads.impl.kk0.h()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = com.yandex.mobile.ads.impl.fl2.c(r0, r8)
            if (r8 == 0) goto L9d
            java.lang.String[] r2 = com.yandex.mobile.ads.impl.gl2.f15605a
            r6 = 0
            r7 = r6
        L37:
            r8 = 4
            if (r7 >= r8) goto L9c
            r9 = r2[r7]
            java.lang.String r9 = com.yandex.mobile.ads.impl.fl2.a(r0, r9)
            if (r9 == 0) goto L99
            int r2 = java.lang.Integer.parseInt(r9)
            r7 = 1
            if (r2 != r7) goto L9c
            java.lang.String[] r2 = com.yandex.mobile.ads.impl.gl2.b
            r7 = r6
        L4c:
            if (r7 >= r8) goto L64
            r9 = r2[r7]
            java.lang.String r9 = com.yandex.mobile.ads.impl.fl2.a(r0, r9)
            if (r9 == 0) goto L61
            long r7 = java.lang.Long.parseLong(r9)
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L65
            goto L64
        L61:
            int r7 = r7 + 1
            goto L4c
        L64:
            r7 = r4
        L65:
            java.lang.String[] r2 = com.yandex.mobile.ads.impl.gl2.c
        L67:
            r9 = 2
            if (r6 >= r9) goto L93
            r9 = r2[r6]
            java.lang.String r9 = com.yandex.mobile.ads.impl.fl2.a(r0, r9)
            if (r9 == 0) goto L90
            long r12 = java.lang.Long.parseLong(r9)
            com.yandex.mobile.ads.impl.y11$a r14 = new com.yandex.mobile.ads.impl.y11$a
            r16 = 0
            r18 = 0
            java.lang.String r15 = "image/jpeg"
            r14.<init>(r15, r16, r18)
            r2 = r14
            com.yandex.mobile.ads.impl.y11$a r10 = new com.yandex.mobile.ads.impl.y11$a
            java.lang.String r11 = "video/mp4"
            r14 = 0
            r10.<init>(r11, r12, r14)
            com.yandex.mobile.ads.impl.kk0 r2 = com.yandex.mobile.ads.impl.kk0.a(r2, r10)
            goto L97
        L90:
            int r6 = r6 + 1
            goto L67
        L93:
            com.yandex.mobile.ads.impl.kk0 r2 = com.yandex.mobile.ads.impl.kk0.h()
        L97:
            r6 = r7
            goto Lbe
        L99:
            int r7 = r7 + 1
            goto L37
        L9c:
            return r3
        L9d:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = com.yandex.mobile.ads.impl.fl2.c(r0, r8)
            if (r8 == 0) goto Lae
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            com.yandex.mobile.ads.impl.kk0 r2 = a(r0, r2, r8)
            goto Lbe
        Lae:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = com.yandex.mobile.ads.impl.fl2.c(r0, r8)
            if (r8 == 0) goto Lbe
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            com.yandex.mobile.ads.impl.kk0 r2 = a(r0, r2, r8)
        Lbe:
            boolean r8 = com.yandex.mobile.ads.impl.fl2.b(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lcb
            return r3
        Lcb:
            com.yandex.mobile.ads.impl.y11 r0 = new com.yandex.mobile.ads.impl.y11
            r0.<init>(r6, r2)
            return r0
        Ld1:
            java.lang.String r0 = "Couldn't find xmp metadata"
            com.yandex.mobile.ads.impl.eg1 r0 = com.yandex.mobile.ads.impl.eg1.a(r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gl2.b(java.lang.String):com.yandex.mobile.ads.impl.y11");
    }

    public static y11 a(String str) throws IOException {
        try {
            return b(str);
        } catch (eg1 | NumberFormatException | XmlPullParserException unused) {
            et0.d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static kk0<y11.a> a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i = kk0.d;
        kk0.a aVar = new kk0.a();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (fl2.c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a2 = fl2.a(xmlPullParser, concat3);
                String a3 = fl2.a(xmlPullParser, concat4);
                String a4 = fl2.a(xmlPullParser, concat5);
                String a5 = fl2.a(xmlPullParser, concat6);
                if (a2 != null && a3 != null) {
                    aVar.b(new y11.a(a2, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L));
                } else {
                    return kk0.h();
                }
            }
        } while (!fl2.b(xmlPullParser, concat2));
        return aVar.a();
    }
}
