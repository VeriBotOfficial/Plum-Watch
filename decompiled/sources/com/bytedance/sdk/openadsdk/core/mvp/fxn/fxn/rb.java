package com.bytedance.sdk.openadsdk.core.mvp.fxn.fxn;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.jz;
import com.bytedance.sdk.openadsdk.core.mvp.fxn.kg;
import com.bytedance.sdk.openadsdk.core.mvp.gff.fxn;
import com.bytedance.sdk.openadsdk.core.mvp.kg.gff;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes14.dex */
public class rb extends com.bytedance.sdk.openadsdk.core.mvp.fxn.kg {

    /* renamed from: sg, reason: collision with root package name */
    public static final String f9513sg = null;

    public rb(Context context, int i, int i2) {
        super(context, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.mvp.fxn.kg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.openadsdk.core.mvp.fxn fxn(java.lang.String r5, java.io.File r6, java.util.List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> r7) {
        /*
            r4 = this;
            r0 = 0
            r4.rb = r0
            android.content.Context r1 = r4.kg
            r2 = 0
            if (r1 != 0) goto Lc
            r5 = -1
            r4.rb = r5
            return r2
        Lc:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L18
            if (r6 != 0) goto L18
            r5 = -2
            r4.rb = r5
            return r2
        L18:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.String r3 = "UTF-8"
            if (r1 != 0) goto L2a
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            byte[] r5 = r5.getBytes(r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            goto L30
        L2a:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r6 = r5
        L30:
            org.xmlpull.v1.XmlPullParser r5 = android.util.Xml.newPullParser()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L59
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r5.setFeature(r1, r0)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L59
            r5.setInput(r6, r3)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L59
            r5.nextTag()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L59
            com.bytedance.sdk.openadsdk.core.mvp.fxn r5 = r4.fxn(r5, r7)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L59
            r4.fxn(r5)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L59
            r6.close()     // Catch: java.io.IOException -> L49
        L49:
            return r5
        L4a:
            r5 = move-exception
            goto L5b
        L4c:
            r6 = r2
        L4d:
            r5 = -3
            r4.rb = r5     // Catch: java.lang.Throwable -> L59
            r4.fxn(r2)     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L58
            r6.close()     // Catch: java.io.IOException -> L58
        L58:
            return r2
        L59:
            r5 = move-exception
            r2 = r6
        L5b:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L60
        L60:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mvp.fxn.fxn.rb.fxn(java.lang.String, java.io.File, java.util.List):com.bytedance.sdk.openadsdk.core.mvp.fxn");
    }

    private void fxn(com.bytedance.sdk.openadsdk.core.mvp.fxn fxnVar) {
        if (this.bh == null) {
            this.bh = new kg.fxn();
        }
        this.bh.fxn = this.rb;
        this.bh.kg = this.fxn;
        if (fxnVar != null) {
            this.bh.gff = fxnVar.fxn().kg.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.mvp.fxn fxn(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> list) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2;
        List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> list2;
        XmlPullParser xmlPullParser3;
        List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> list3;
        xmlPullParser.require(2, f9513sg, "VAST");
        boolean z = false;
        String str = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    str = kg(xmlPullParser, name);
                } else {
                    if ("Ad".equals(name)) {
                        if (fxn(xmlPullParser.getAttributeValue(f9513sg, "sequence"))) {
                            while (true) {
                                if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                    xmlPullParser2 = xmlPullParser;
                                    list2 = list;
                                    z = true;
                                    break;
                                }
                                if (xmlPullParser.getEventType() == 2) {
                                    String name2 = xmlPullParser.getName();
                                    if ("InLine".equals(name2)) {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        com.bytedance.sdk.openadsdk.core.mvp.fxn fxn2 = kg.fxn(this.kg, xmlPullParser3, list3, this.gff, this.hm);
                                        if (fxn2 != null) {
                                            if (!TextUtils.isEmpty(fxn2.sg())) {
                                                return fxn2;
                                            }
                                            this.rb = -6;
                                            return null;
                                        }
                                    } else {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        if ("Wrapper".equals(name2)) {
                                            com.bytedance.sdk.openadsdk.core.mvp.fxn kg = kg(xmlPullParser3, list3);
                                            if (kg != null) {
                                                return kg;
                                            }
                                        } else {
                                            fxn(xmlPullParser3);
                                        }
                                    }
                                    xmlPullParser = xmlPullParser3;
                                    list = list3;
                                }
                            }
                        } else {
                            fxn(xmlPullParser);
                            z = true;
                        }
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        list2 = list;
                        fxn(xmlPullParser2);
                    }
                    xmlPullParser = xmlPullParser2;
                    list = list2;
                }
            }
        }
        if (!z) {
            this.rb = -4;
            gff(str);
        }
        if (this.rb == 0) {
            this.rb = -5;
        }
        return null;
    }

    private void gff(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.mvp.kg.gff.fxn(com.bytedance.sdk.openadsdk.core.mvp.kg.gff.fxn((jz) null, (List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff>) Collections.singletonList(new gff.fxn(str).fxn()), this.fxn > 0 ? com.bytedance.sdk.openadsdk.core.mvp.fxn.fxn.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.mvp.fxn.fxn.UNDEFINED_ERROR, -1L, (String) null, (String) null), (gff.kg) null);
    }

    static class fxn {
        String fxn;
        fxn.kg gff;
        String hm;
        fxn.EnumC0518fxn kg;
        final List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> rb = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> bh = new ArrayList();

        /* renamed from: sg, reason: collision with root package name */
        float f9514sg = Float.MIN_VALUE;

        public fxn() {
        }

        public fxn(String str, fxn.EnumC0518fxn enumC0518fxn, fxn.kg kgVar) {
            fxn(str, enumC0518fxn, kgVar);
        }

        public void fxn(String str, fxn.EnumC0518fxn enumC0518fxn, fxn.kg kgVar) {
            this.fxn = str;
            this.kg = enumC0518fxn;
            this.gff = kgVar;
        }

        public void fxn(String str) {
            this.rb.add(new gff.fxn(str).fxn());
        }

        public void kg(String str) {
            this.bh.add(new gff.fxn(str).fxn());
        }
    }

    public static List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> fxn(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        return fxn(xmlPullParser, str, false);
    }

    public static List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> fxn(XmlPullParser xmlPullParser, String str, boolean z) throws IOException, XmlPullParserException {
        return fxn(kg(xmlPullParser, str), z);
    }

    public static int kg(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    public static String kg(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        String str2;
        String str3 = f9513sg;
        xmlPullParser.require(2, str3, str);
        if (xmlPullParser.next() != 4) {
            str2 = "";
        } else {
            str2 = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        }
        xmlPullParser.require(3, str3, str);
        return str2;
    }

    public static void fxn(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static void fxn(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x012c, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.bytedance.sdk.openadsdk.core.mvp.fxn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.bytedance.sdk.openadsdk.core.mvp.fxn kg(org.xmlpull.v1.XmlPullParser r19, java.util.List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mvp.fxn.fxn.rb.kg(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.mvp.fxn");
    }

    private static List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> fxn(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new gff.fxn(str).fxn(z).fxn());
    }
}
