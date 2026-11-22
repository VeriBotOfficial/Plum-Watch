package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes4.dex */
public class fw {

    /* renamed from: a, reason: collision with root package name */
    private static fw f14604a;

    /* renamed from: a, reason: collision with other field name */
    private Map<String, Object> f557a = new ConcurrentHashMap();
    private Map<String, Object> b = new ConcurrentHashMap();

    public static synchronized fw a() {
        fw fwVar;
        synchronized (fw.class) {
            if (f14604a == null) {
                f14604a = new fw();
            }
            fwVar = f14604a;
        }
        return fwVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    protected void m12172a() {
        InputStream inputStream;
        XmlPullParser newPullParser;
        int eventType;
        try {
            for (ClassLoader classLoader : m12170a()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack.providers");
                while (resources.hasMoreElements()) {
                    try {
                        inputStream = resources.nextElement().openStream();
                        try {
                            newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                            newPullParser.setInput(inputStream, "UTF-8");
                            eventType = newPullParser.getEventType();
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = null;
                    }
                    do {
                        if (eventType == 2) {
                            if (newPullParser.getName().equals("iqProvider")) {
                                newPullParser.next();
                                newPullParser.next();
                                String nextText = newPullParser.nextText();
                                newPullParser.next();
                                newPullParser.next();
                                String nextText2 = newPullParser.nextText();
                                newPullParser.next();
                                newPullParser.next();
                                String nextText3 = newPullParser.nextText();
                                String a2 = a(nextText, nextText2);
                                if (!this.b.containsKey(a2)) {
                                    try {
                                        Class<?> cls = Class.forName(nextText3);
                                        if (fu.class.isAssignableFrom(cls)) {
                                            this.b.put(a2, cls.newInstance());
                                        } else if (fn.class.isAssignableFrom(cls)) {
                                            this.b.put(a2, cls);
                                        }
                                    } catch (ClassNotFoundException e) {
                                        e.printStackTrace();
                                    }
                                }
                            } else if (newPullParser.getName().equals("extensionProvider")) {
                                newPullParser.next();
                                newPullParser.next();
                                String nextText4 = newPullParser.nextText();
                                newPullParser.next();
                                newPullParser.next();
                                String nextText5 = newPullParser.nextText();
                                newPullParser.next();
                                newPullParser.next();
                                String nextText6 = newPullParser.nextText();
                                String a3 = a(nextText4, nextText5);
                                if (!this.f557a.containsKey(a3)) {
                                    try {
                                        Class<?> cls2 = Class.forName(nextText6);
                                        if (fv.class.isAssignableFrom(cls2)) {
                                            this.f557a.put(a3, cls2.newInstance());
                                        } else if (fq.class.isAssignableFrom(cls2)) {
                                            this.f557a.put(a3, cls2);
                                        }
                                    } catch (ClassNotFoundException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                            }
                            th = th;
                            try {
                                inputStream.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                        eventType = newPullParser.next();
                    } while (eventType != 1);
                    inputStream.close();
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public Object m12171a(String str, String str2) {
        return this.f557a.get(a(str, str2));
    }

    public void a(String str, String str2, Object obj) {
        if (!(obj instanceof fv) && !(obj instanceof Class)) {
            throw new IllegalArgumentException("Provider must be a PacketExtensionProvider or a Class instance.");
        }
        this.f557a.put(a(str, str2), obj);
    }

    private String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(Separators.LESS_THAN);
        sb.append(str).append("/>");
        if (str != null) {
            sb.append(Separators.LESS_THAN).append(str2).append("/>");
        }
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    private ClassLoader[] m12170a() {
        ClassLoader[] classLoaderArr = {fw.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    private fw() {
        m12172a();
    }
}
