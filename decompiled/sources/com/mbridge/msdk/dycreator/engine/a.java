package com.mbridge.msdk.dycreator.engine;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.CameraInfo;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MBLayoutInflate.java */
/* loaded from: classes17.dex */
public class a {
    private static final Class[] e = {Context.class, AttributeSet.class};
    private static final HashMap<String, Constructor> f = new HashMap<>();
    private static String g = "com.mbridge.msdk.dycreator.baseview.MB";
    protected final Context b;
    private long d;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f11454a = true;
    private final Object[] c = new Object[2];

    public a(Context context) {
        this.b = context;
    }

    public Context a() {
        return this.b;
    }

    protected View b(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return (str.equals("MBStarLevelLayoutView") || str.equals("LuckPan")) ? a(str, "", attributeSet) : a(str, g, attributeSet);
    }

    public View a(String str, ViewGroup viewGroup) {
        return a(str, viewGroup, viewGroup != null);
    }

    public View a(String str, ViewGroup viewGroup, boolean z) {
        this.d = System.currentTimeMillis();
        System.out.println("INFLATING from resource: " + str);
        return a(a(str), viewGroup, z);
    }

    private void b(XmlPullParser xmlPullParser, View view, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("requestFocus".equals(name)) {
                    a(xmlPullParser, view);
                } else if ("include".equals(name)) {
                    if (xmlPullParser.getDepth() != 0) {
                        a(xmlPullParser, view, attributeSet);
                    } else {
                        throw new InflateException("<include /> cannot be the root element");
                    }
                } else if (!"merge".equals(name)) {
                    View a2 = a(name, attributeSet);
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewGroup.LayoutParams generateLayoutParams = viewGroup.generateLayoutParams(attributeSet);
                    b(xmlPullParser, a2, attributeSet);
                    viewGroup.addView(a2, generateLayoutParams);
                } else {
                    throw new InflateException("<merge /> must be the root element");
                }
            }
        }
    }

    public XmlPullParser a(String str) {
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setInput(new FileInputStream(str), "utf-8");
            return newPullParser;
        } catch (Exception e2) {
            e2.printStackTrace();
            return newPullParser;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View] */
    public View a(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        int next;
        ViewGroup.LayoutParams layoutParams;
        synchronized (this.c) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.c[0] = this.b;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (IOException e2) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e2.getMessage());
                    inflateException.initCause(e2);
                    throw inflateException;
                } catch (XmlPullParserException e3) {
                    InflateException inflateException2 = new InflateException(e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next == 2) {
                String name = xmlPullParser.getName();
                System.out.println("**************************");
                System.out.println("Creating root view: " + name);
                System.out.println("**************************");
                if (!"merge".equals(name)) {
                    View a2 = a(name, asAttributeSet);
                    if (viewGroup != 0) {
                        System.out.println("Creating params from root: " + ((Object) viewGroup));
                        layoutParams = viewGroup.generateLayoutParams(asAttributeSet);
                        if (!z) {
                            a2.setLayoutParams(layoutParams);
                        }
                    } else {
                        layoutParams = null;
                    }
                    System.out.println("-----> start inflating children");
                    b(xmlPullParser, a2, asAttributeSet);
                    System.out.println("-----> done inflating children");
                    if (viewGroup != 0 && z) {
                        viewGroup.addView(a2, layoutParams);
                    }
                    if (viewGroup == 0 || !z) {
                        viewGroup = a2;
                    }
                } else if (viewGroup != 0 && z) {
                    b(xmlPullParser, viewGroup, asAttributeSet);
                } else {
                    throw new InflateException("<merge /> can be used only with a valid ViewGroup root and attachToRoot=true");
                }
            } else {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
        }
        return viewGroup;
    }

    public final View a(String str, String str2, AttributeSet attributeSet) throws ClassNotFoundException, InflateException {
        HashMap<String, Constructor> hashMap = f;
        Constructor<?> constructor = hashMap.get(str);
        Class<?> cls = null;
        if (constructor == null) {
            try {
                cls = this.b.getClassLoader().loadClass(str2 != null ? str2 + str : str);
                constructor = cls.getConstructor(e);
                hashMap.put(str, constructor);
            } catch (ClassNotFoundException e2) {
                throw e2;
            } catch (NoSuchMethodException e3) {
                StringBuilder append = new StringBuilder().append(attributeSet.getPositionDescription()).append(": Error inflating class ");
                if (str2 != null) {
                    str = str2 + str;
                }
                InflateException inflateException = new InflateException(append.append(str).toString());
                inflateException.initCause(e3);
                throw inflateException;
            } catch (Exception e4) {
                InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + (cls == null ? CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN : cls.getName()));
                inflateException2.initCause(e4);
                throw inflateException2;
            }
        }
        Object[] objArr = this.c;
        objArr[1] = attributeSet;
        return (View) constructor.newInstance(objArr);
    }

    View a(String str, AttributeSet attributeSet) {
        View a2;
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        System.out.println("******** Creating view: " + str);
        try {
            if (-1 == str.indexOf(46)) {
                a2 = b(str, attributeSet);
            } else {
                a2 = a(str, (String) null, attributeSet);
            }
            System.out.println("Created view is: " + a2);
            return a2;
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    private void a(XmlPullParser xmlPullParser, View view) throws XmlPullParserException, IOException {
        int next;
        view.requestFocus();
        int depth = xmlPullParser.getDepth();
        do {
            next = xmlPullParser.next();
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        } while (next != 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006e, code lost:
    
        if (r8 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
    
        b(r0, r2, r1);
        r7.addView(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        r2.setLayoutParams(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0077, code lost:
    
        if (r8 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(org.xmlpull.v1.XmlPullParser r6, android.view.View r7, android.util.AttributeSet r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lbd
            r0 = 0
            r1 = 0
            java.lang.String r2 = "layout"
            int r0 = r8.getAttributeResourceValue(r1, r2, r0)
            if (r0 != 0) goto L37
            java.lang.String r6 = r8.getAttributeValue(r1, r2)
            if (r6 != 0) goto L1c
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.String r7 = "You must specifiy a layout in the include tag: <include layout=\"@layout/layoutID\" />"
            r6.<init>(r7)
            throw r6
        L1c:
            android.view.InflateException r7 = new android.view.InflateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "You must specifiy a valid layout reference. The layout ID "
            r8.<init>(r0)
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r8 = " is not valid."
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L37:
            android.content.Context r1 = r5.a()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.XmlResourceParser r0 = r1.getLayout(r0)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r0)     // Catch: java.lang.Throwable -> Lb8
        L47:
            int r2 = r0.next()     // Catch: java.lang.Throwable -> Lb8
            r3 = 1
            r4 = 2
            if (r2 == r4) goto L52
            if (r2 == r3) goto L52
            goto L47
        L52:
            if (r2 != r4) goto L9b
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = "merge"
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Throwable -> Lb8
            if (r4 == 0) goto L64
            r5.b(r0, r7, r1)     // Catch: java.lang.Throwable -> Lb8
            goto L82
        L64:
            android.view.View r2 = r5.a(r2, r1)     // Catch: java.lang.Throwable -> Lb8
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch: java.lang.Throwable -> Lb8
            android.view.ViewGroup$LayoutParams r8 = r7.generateLayoutParams(r8)     // Catch: java.lang.Throwable -> L71 java.lang.RuntimeException -> L73
            if (r8 == 0) goto L7c
            goto L79
        L71:
            r6 = move-exception
            goto L9a
        L73:
            android.view.ViewGroup$LayoutParams r8 = r7.generateLayoutParams(r1)     // Catch: java.lang.Throwable -> L71
            if (r8 == 0) goto L7c
        L79:
            r2.setLayoutParams(r8)     // Catch: java.lang.Throwable -> Lb8
        L7c:
            r5.b(r0, r2, r1)     // Catch: java.lang.Throwable -> Lb8
            r7.addView(r2)     // Catch: java.lang.Throwable -> Lb8
        L82:
            r0.close()
            int r7 = r6.getDepth()
        L89:
            int r8 = r6.next()
            r0 = 3
            if (r8 != r0) goto L96
            int r0 = r6.getDepth()
            if (r0 <= r7) goto L99
        L96:
            if (r8 == r3) goto L99
            goto L89
        L99:
            return
        L9a:
            throw r6     // Catch: java.lang.Throwable -> Lb8
        L9b:
            android.view.InflateException r6 = new android.view.InflateException     // Catch: java.lang.Throwable -> Lb8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb8
            r7.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r8 = r0.getPositionDescription()     // Catch: java.lang.Throwable -> Lb8
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r8 = ": No start tag found!"
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lb8
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lb8
            throw r6     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r6 = move-exception
            r0.close()
            throw r6
        Lbd:
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.String r7 = "<include /> can only be used inside of a ViewGroup"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.engine.a.a(org.xmlpull.v1.XmlPullParser, android.view.View, android.util.AttributeSet):void");
    }
}
