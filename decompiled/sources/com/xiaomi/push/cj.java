package com.xiaomi.push;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.net.telnet.TelnetCommand;

/* loaded from: classes4.dex */
public abstract class cj {

    public static class a extends ci {
        public a() {
            super(1);
        }

        @Override // com.xiaomi.push.ci
        public String a(Context context, String str, List<au> list) {
            if (list == null) {
                return av.a(context, new URL(str));
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (au auVar : list) {
                buildUpon.appendQueryParameter(auVar.a(), auVar.b());
            }
            return av.a(context, new URL(buildUpon.toString()));
        }
    }

    public static String a(Context context, String str, List<au> list) {
        return a(context, str, list, new a(), true);
    }

    public static String a(Context context, String str, List<au> list, ci ciVar, boolean z) {
        String str2;
        cd cdVar;
        IOException iOException;
        String str3;
        String str4;
        if (!av.m11884a(context)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (z) {
                cdVar = ch.a().m11962a(str);
                if (cdVar != null) {
                    arrayList = cdVar.a(str);
                }
            } else {
                cdVar = null;
            }
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
            Iterator<String> it = arrayList.iterator();
            String str5 = null;
            while (it.hasNext()) {
                String next = it.next();
                ArrayList arrayList2 = list != null ? new ArrayList(list) : null;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                } catch (IOException e) {
                    iOException = e;
                    str3 = str5;
                }
                if (!ciVar.m11972a(context, next, (List<au>) arrayList2)) {
                    return str5;
                }
                String a2 = ciVar.a(context, next, (List<au>) arrayList2);
                try {
                } catch (IOException e2) {
                    e = e2;
                    str3 = a2;
                }
                if (!TextUtils.isEmpty(a2)) {
                    if (cdVar != null) {
                        try {
                            str2 = null;
                            str4 = next;
                            cdVar = cdVar;
                            try {
                                cdVar.a(str4, System.currentTimeMillis() - currentTimeMillis, a(ciVar, next, arrayList2, a2));
                            } catch (MalformedURLException e3) {
                                e = e3;
                                e.printStackTrace();
                                return str2;
                            }
                        } catch (IOException e4) {
                            e = e4;
                        }
                    }
                    return a2;
                }
                str4 = next;
                if (cdVar != null) {
                    try {
                        str3 = a2;
                        try {
                            cdVar.a(str4, System.currentTimeMillis() - currentTimeMillis, a(ciVar, str4, arrayList2, a2), null);
                        } catch (IOException e5) {
                            e = e5;
                            next = str4;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        next = str4;
                    }
                } else {
                    str3 = a2;
                }
                str5 = str3;
                e = e6;
                next = str4;
                str3 = a2;
                iOException = e;
                if (cdVar != null) {
                    cdVar.a(next, System.currentTimeMillis() - currentTimeMillis, a(ciVar, next, arrayList2, str3), iOException);
                }
                iOException.printStackTrace();
                str5 = str3;
            }
            return str5;
        } catch (MalformedURLException e7) {
            e = e7;
            str2 = null;
        }
    }

    private static int a(ci ciVar, String str, List<au> list, String str2) {
        if (ciVar.a() == 1) {
            return a(str.length(), a(str2));
        }
        if (ciVar.a() != 2) {
            return -1;
        }
        return a(str.length(), a(list), a(str2));
    }

    static int a(List<au> list) {
        int i = 0;
        for (au auVar : list) {
            if (!TextUtils.isEmpty(auVar.a())) {
                i += auVar.a().length();
            }
            if (!TextUtils.isEmpty(auVar.b())) {
                i += auVar.b().length();
            }
        }
        return i * 2;
    }

    static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    static int a(int i, int i2) {
        return (((i2 + TelnetCommand.BREAK) / 1448) * 132) + 1080 + i + i2;
    }

    static int a(int i, int i2, int i3) {
        return (((i2 + 200) / 1448) * 132) + 1011 + i2 + i + i3;
    }
}
