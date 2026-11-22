package com.baidu.location.e;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
final class g {
    private static final double[] b = {45.0d, 135.0d, 225.0d, 315.0d};

    /* renamed from: a, reason: collision with root package name */
    private final d f7642a;
    private final int c;
    private final SQLiteDatabase d;
    private int e = -1;
    private int f = -1;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private double f7643a;
        private double b;

        private a(double d, double d2) {
            this.f7643a = d;
            this.b = d2;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    private static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7644a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final /* synthetic */ b[] j;
        private final int e;
        private final String f;
        private final String g;
        private final String h;
        private final int i;

        static {
            int i = 1000;
            b bVar = new b("AREA", 0, "RGCAREA", "area", "addrv", 0, i) { // from class: com.baidu.location.e.g.b.1
                @Override // com.baidu.location.e.g.b
                List<String> a(JSONObject jSONObject, String str, int i2) {
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
                    String str8;
                    String str9;
                    String str10;
                    String str11;
                    String str12;
                    String str13 = "dist";
                    String str14 = "ct";
                    String str15 = "ctc";
                    String str16 = "prov";
                    String str17 = "cyc";
                    String str18 = "cy";
                    Iterator<String> keys = jSONObject.keys();
                    StringBuffer stringBuffer = new StringBuffer();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    ArrayList arrayList = new ArrayList();
                    int i3 = 0;
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Iterator<String> it = keys;
                        int i4 = i3;
                        try {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2.has(str18)) {
                                str7 = str18;
                                str8 = jSONObject2.getString(str18);
                            } else {
                                str7 = str18;
                                str8 = null;
                            }
                            try {
                                if (jSONObject2.has(str17)) {
                                    str6 = str17;
                                    str9 = jSONObject2.getString(str17);
                                } else {
                                    str6 = str17;
                                    str9 = null;
                                }
                                try {
                                    if (jSONObject2.has(str16)) {
                                        str5 = str16;
                                        str10 = jSONObject2.getString(str16);
                                    } else {
                                        str5 = str16;
                                        str10 = null;
                                    }
                                    try {
                                        if (jSONObject2.has(str15)) {
                                            str4 = str15;
                                            str11 = jSONObject2.getString(str15);
                                        } else {
                                            str4 = str15;
                                            str11 = null;
                                        }
                                        try {
                                            if (jSONObject2.has(str14)) {
                                                str3 = str14;
                                                str12 = jSONObject2.getString(str14);
                                            } else {
                                                str3 = str14;
                                                str12 = null;
                                            }
                                            try {
                                                String string = jSONObject2.has(str13) ? jSONObject2.getString(str13) : null;
                                                if (stringBuffer.length() > 0) {
                                                    str2 = str13;
                                                    try {
                                                        stringBuffer.append(",");
                                                    } catch (JSONException unused) {
                                                        if (i4 % 50 == 49) {
                                                            arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCAREA", stringBuffer));
                                                            arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer2));
                                                            stringBuffer.setLength(0);
                                                        }
                                                        i3 = i4 + 1;
                                                        keys = it;
                                                        str18 = str7;
                                                        str13 = str2;
                                                        str17 = str6;
                                                        str16 = str5;
                                                        str15 = str4;
                                                        str14 = str3;
                                                    }
                                                } else {
                                                    str2 = str13;
                                                }
                                                stringBuffer.append("(\"").append(next).append("\",\"").append(str8).append("\",\"").append(str9).append("\",\"").append(str10).append("\",\"").append(str12).append("\",\"").append(str11).append("\",\"").append(string).append("\",").append(System.currentTimeMillis() / 1000).append(",\"\")");
                                                try {
                                                    b.b(stringBuffer2, next, str, 0);
                                                } catch (JSONException unused2) {
                                                }
                                            } catch (JSONException unused3) {
                                                str2 = str13;
                                            }
                                        } catch (JSONException unused4) {
                                            str2 = str13;
                                            str3 = str14;
                                        }
                                    } catch (JSONException unused5) {
                                        str2 = str13;
                                        str3 = str14;
                                        str4 = str15;
                                    }
                                } catch (JSONException unused6) {
                                    str2 = str13;
                                    str3 = str14;
                                    str4 = str15;
                                    str5 = str16;
                                }
                            } catch (JSONException unused7) {
                                str2 = str13;
                                str3 = str14;
                                str4 = str15;
                                str5 = str16;
                                str6 = str17;
                            }
                        } catch (JSONException unused8) {
                            str2 = str13;
                            str3 = str14;
                            str4 = str15;
                            str5 = str16;
                            str6 = str17;
                            str7 = str18;
                        }
                        if (i4 % 50 == 49 && stringBuffer.length() > 0) {
                            arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCAREA", stringBuffer));
                            arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer2));
                            stringBuffer.setLength(0);
                        }
                        i3 = i4 + 1;
                        keys = it;
                        str18 = str7;
                        str13 = str2;
                        str17 = str6;
                        str16 = str5;
                        str15 = str4;
                        str14 = str3;
                    }
                    if (stringBuffer.length() > 0) {
                        arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCAREA", stringBuffer));
                        arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer2));
                        stringBuffer.setLength(0);
                    }
                    arrayList.add(String.format(Locale.US, "DELETE FROM RGCAREA WHERE gridkey NOT IN (SELECT gridkey FROM RGCAREA LIMIT %d);", Integer.valueOf(i2)));
                    return arrayList;
                }
            };
            f7644a = bVar;
            b bVar2 = new b("ROAD", 1, "RGCROAD", Const.JSON_KEY_ROAD, "addrv", i, 10000) { // from class: com.baidu.location.e.g.b.2
                @Override // com.baidu.location.e.g.b
                List<String> a(JSONObject jSONObject, String str, int i2) {
                    JSONArray jSONArray;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    Iterator<String> it;
                    String str7;
                    String str8;
                    String str9;
                    String str10;
                    String str11;
                    String str12;
                    String str13;
                    Double d2;
                    Double d3;
                    Double d4;
                    Double valueOf;
                    String str14 = "y2";
                    String str15 = "x2";
                    String str16 = "y1";
                    String str17 = "x1";
                    String str18 = "st";
                    Iterator<String> keys = jSONObject.keys();
                    ArrayList arrayList = new ArrayList();
                    StringBuffer stringBuffer = new StringBuffer();
                    while (keys.hasNext()) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        String next = keys.next();
                        b.b(stringBuffer, next, str, 0);
                        try {
                            jSONArray = jSONObject.getJSONArray(next);
                        } catch (JSONException unused) {
                            jSONArray = null;
                        }
                        if (jSONArray != null) {
                            int i3 = 0;
                            while (true) {
                                it = keys;
                                if (i3 >= jSONArray.length()) {
                                    break;
                                }
                                try {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                    if (jSONObject2.has(str18)) {
                                        str11 = str18;
                                        str13 = jSONObject2.getString(str18);
                                    } else {
                                        str11 = str18;
                                        str13 = null;
                                    }
                                    try {
                                        if (jSONObject2.has(str17)) {
                                            str10 = str17;
                                            d2 = Double.valueOf(jSONObject2.getDouble(str17));
                                        } else {
                                            str10 = str17;
                                            d2 = null;
                                        }
                                        try {
                                            if (jSONObject2.has(str16)) {
                                                str9 = str16;
                                                d3 = Double.valueOf(jSONObject2.getDouble(str16));
                                            } else {
                                                str9 = str16;
                                                d3 = null;
                                            }
                                            try {
                                                if (jSONObject2.has(str15)) {
                                                    str8 = str15;
                                                    d4 = Double.valueOf(jSONObject2.getDouble(str15));
                                                } else {
                                                    str8 = str15;
                                                    d4 = null;
                                                }
                                                try {
                                                    valueOf = jSONObject2.has(str14) ? Double.valueOf(jSONObject2.getDouble(str14)) : null;
                                                } catch (JSONException unused2) {
                                                }
                                            } catch (JSONException unused3) {
                                                str7 = str14;
                                                str8 = str15;
                                            }
                                        } catch (JSONException unused4) {
                                            str7 = str14;
                                            str8 = str15;
                                            str9 = str16;
                                        }
                                    } catch (JSONException unused5) {
                                        str7 = str14;
                                        str8 = str15;
                                        str9 = str16;
                                        str10 = str17;
                                    }
                                } catch (JSONException unused6) {
                                    str7 = str14;
                                    str8 = str15;
                                    str9 = str16;
                                    str10 = str17;
                                    str11 = str18;
                                }
                                if (str13 != null && d2 != null && d3 != null && d4 != null && valueOf != null) {
                                    str7 = str14;
                                    if (stringBuffer2.length() > 0) {
                                        try {
                                            stringBuffer2.append(",");
                                        } catch (JSONException unused7) {
                                        }
                                    }
                                    str12 = next;
                                    try {
                                        stringBuffer2.append("(NULL,\"").append(next).append("\",\"").append(str13).append("\",").append(d2).append(",").append(d3).append(",").append(d4).append(",").append(valueOf).append(Separators.RPAREN);
                                    } catch (JSONException unused8) {
                                    }
                                    if (i3 % 50 != 49 && stringBuffer2.length() > 0) {
                                        arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCROAD", stringBuffer2.toString()));
                                        stringBuffer2.setLength(0);
                                    }
                                    i3++;
                                    keys = it;
                                    str18 = str11;
                                    str17 = str10;
                                    str16 = str9;
                                    str15 = str8;
                                    next = str12;
                                    str14 = str7;
                                }
                                str7 = str14;
                                str12 = next;
                                if (i3 % 50 != 49) {
                                }
                                i3++;
                                keys = it;
                                str18 = str11;
                                str17 = str10;
                                str16 = str9;
                                str15 = str8;
                                next = str12;
                                str14 = str7;
                            }
                            str2 = str14;
                            str3 = str15;
                            str4 = str16;
                            str5 = str17;
                            str6 = str18;
                            if (stringBuffer2.length() > 0) {
                                arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCROAD", stringBuffer2.toString()));
                            }
                        } else {
                            str2 = str14;
                            str3 = str15;
                            str4 = str16;
                            str5 = str17;
                            str6 = str18;
                            it = keys;
                        }
                        keys = it;
                        str18 = str6;
                        str17 = str5;
                        str16 = str4;
                        str15 = str3;
                        str14 = str2;
                    }
                    if (stringBuffer.length() > 0) {
                        arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer));
                    }
                    arrayList.add(String.format(Locale.US, "DELETE FROM RGCROAD WHERE _id NOT IN (SELECT _id FROM RGCROAD LIMIT %d);", Integer.valueOf(i2)));
                    return arrayList;
                }
            };
            b = bVar2;
            b bVar3 = new b("SITE", 2, "RGCSITE", "site", "addrv", 100, 50000) { // from class: com.baidu.location.e.g.b.3
                @Override // com.baidu.location.e.g.b
                List<String> a(JSONObject jSONObject, String str, int i2) {
                    JSONArray jSONArray;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    Iterator<String> it;
                    String str6;
                    String str7;
                    String str8;
                    String str9;
                    String str10;
                    String str11;
                    Double d2;
                    String str12 = "y";
                    String str13 = "x";
                    String str14 = "stn";
                    String str15 = "st";
                    Iterator<String> keys = jSONObject.keys();
                    ArrayList arrayList = new ArrayList();
                    StringBuffer stringBuffer = new StringBuffer();
                    while (keys.hasNext()) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        String next = keys.next();
                        b.b(stringBuffer, next, str, 0);
                        try {
                            jSONArray = jSONObject.getJSONArray(next);
                        } catch (JSONException unused) {
                            jSONArray = null;
                        }
                        if (jSONArray != null) {
                            int i3 = 0;
                            while (true) {
                                it = keys;
                                if (i3 >= jSONArray.length()) {
                                    break;
                                }
                                try {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                    if (jSONObject2.has(str15)) {
                                        str9 = str15;
                                        str10 = jSONObject2.getString(str15);
                                    } else {
                                        str9 = str15;
                                        str10 = null;
                                    }
                                    try {
                                        if (jSONObject2.has(str14)) {
                                            str8 = str14;
                                            str11 = jSONObject2.getString(str14);
                                        } else {
                                            str8 = str14;
                                            str11 = null;
                                        }
                                        try {
                                            if (jSONObject2.has(str13)) {
                                                str7 = str13;
                                                d2 = Double.valueOf(jSONObject2.getDouble(str13));
                                            } else {
                                                str7 = str13;
                                                d2 = null;
                                            }
                                            try {
                                                Double valueOf = jSONObject2.has(str12) ? Double.valueOf(jSONObject2.getDouble(str12)) : null;
                                                str6 = str12;
                                                if (stringBuffer2.length() > 0) {
                                                    try {
                                                        stringBuffer2.append(",");
                                                    } catch (JSONException unused2) {
                                                    }
                                                }
                                                stringBuffer2.append("(NULL,\"").append(next).append("\",\"").append(str10).append("\",\"").append(str11).append("\",").append(d2).append(",").append(valueOf).append(Separators.RPAREN);
                                            } catch (JSONException unused3) {
                                                str6 = str12;
                                            }
                                        } catch (JSONException unused4) {
                                            str6 = str12;
                                            str7 = str13;
                                        }
                                    } catch (JSONException unused5) {
                                        str6 = str12;
                                        str7 = str13;
                                        str8 = str14;
                                    }
                                } catch (JSONException unused6) {
                                    str6 = str12;
                                    str7 = str13;
                                    str8 = str14;
                                    str9 = str15;
                                }
                                if (i3 % 50 == 49 && stringBuffer2.length() > 0) {
                                    arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCSITE", stringBuffer2.toString()));
                                    stringBuffer2.setLength(0);
                                }
                                i3++;
                                keys = it;
                                str15 = str9;
                                str14 = str8;
                                str13 = str7;
                                str12 = str6;
                            }
                            str2 = str12;
                            str3 = str13;
                            str4 = str14;
                            str5 = str15;
                            if (stringBuffer2.length() > 0) {
                                arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCSITE", stringBuffer2.toString()));
                            }
                        } else {
                            str2 = str12;
                            str3 = str13;
                            str4 = str14;
                            str5 = str15;
                            it = keys;
                        }
                        keys = it;
                        str15 = str5;
                        str14 = str4;
                        str13 = str3;
                        str12 = str2;
                    }
                    if (stringBuffer.length() > 0) {
                        arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer));
                    }
                    arrayList.add(String.format(Locale.US, "DELETE FROM RGCSITE WHERE _id NOT IN (SELECT _id FROM RGCSITE LIMIT %d);", Integer.valueOf(i2)));
                    return arrayList;
                }
            };
            c = bVar3;
            b bVar4 = new b("POI", 3, "RGCPOI", "poi", "poiv", 1000, 5000) { // from class: com.baidu.location.e.g.b.4
                /* JADX WARN: Removed duplicated region for block: B:49:0x0154  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x016a  */
                @Override // com.baidu.location.e.g.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                java.util.List<java.lang.String> a(org.json.JSONObject r27, java.lang.String r28, int r29) {
                    /*
                        Method dump skipped, instructions count: 488
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.e.g.b.AnonymousClass4.a(org.json.JSONObject, java.lang.String, int):java.util.List");
                }
            };
            d = bVar4;
            j = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        private b(String str, int i, String str2, String str3, String str4, int i2, int i3) {
            this.f = str2;
            this.g = str3;
            this.h = str4;
            this.e = i2;
            this.i = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a(int i, double d2, double d3) {
            HashSet hashSet = new HashSet();
            hashSet.add(g.b(i, d2, d3));
            int i2 = this.e;
            double d4 = i2 * 1.414d;
            boolean z = true;
            if (i2 > 0) {
                for (int i3 = 0; i3 < g.b.length; i3++) {
                    double[] b2 = g.b(d3, d2, d4, g.b[i3]);
                    hashSet.add(g.b(i, b2[1], b2[0]));
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append(AbstractJsonLexerKt.COMMA);
                }
                stringBuffer.append("\"").append(str).append("\"");
            }
            return String.format("SELECT * FROM %s WHERE gridkey IN (%s);", this.f, stringBuffer.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a(JSONObject jSONObject) {
            Iterator<String> keys = jSONObject.keys();
            StringBuffer stringBuffer = new StringBuffer();
            while (keys.hasNext()) {
                String next = keys.next();
                if (stringBuffer.length() != 0) {
                    stringBuffer.append(",");
                }
                stringBuffer.append("\"").append(next).append("\"");
            }
            return String.format(Locale.US, "DELETE FROM %s WHERE gridkey IN (%s)", this.f, stringBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(StringBuffer stringBuffer, String str, String str2, int i) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(",");
            }
            stringBuffer.append("(\"").append(str).append("\",\"").append(str2).append("\",").append(i).append(",").append(System.currentTimeMillis() / 86400000).append(Separators.RPAREN);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) j.clone();
        }

        abstract List<String> a(JSONObject jSONObject, String str, int i);
    }

    g(d dVar, SQLiteDatabase sQLiteDatabase, int i) {
        this.f7642a = dVar;
        this.d = sQLiteDatabase;
        this.c = i;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCAREA(gridkey VARCHAR(10) PRIMARY KEY, country VARCHAR(100),countrycode VARCHAR(100), province VARCHAR(100), city VARCHAR(100), citycode VARCHAR(100), district VARCHAR(100), timestamp INTEGER, version VARCHAR(50))");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCROAD(_id INTEGER PRIMARY KEY AUTOINCREMENT, gridkey VARCHAR(10), street VARCHAR(100), x1 DOUBLE, y1 DOUBLE, x2 DOUBLE, y2 DOUBLE)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCSITE(_id INTEGER PRIMARY KEY AUTOINCREMENT, gridkey VARCHAR(10), street VARCHAR(100), streetnumber VARCHAR(100), x DOUBLE, y DOUBLE)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCPOI(pid VARCHAR(50) PRIMARY KEY , gridkey VARCHAR(10), name VARCHAR(100), type VARCHAR(50), x DOUBLE, y DOUBLE, rank INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCUPDATE(gridkey VARCHAR(10), version VARCHAR(50), type INTEGER, timestamp INTEGER, PRIMARY KEY(gridkey, type))");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private double a(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d5 - d3;
        double d8 = d - d3;
        double d9 = d6 - d4;
        double d10 = d2 - d4;
        double d11 = (d7 * d8) + (d9 * d10);
        if (d11 <= 0.0d) {
            return Math.sqrt((d8 * d8) + (d10 * d10));
        }
        double d12 = (d7 * d7) + (d9 * d9);
        if (d11 >= d12) {
            double d13 = d - d5;
            double d14 = d2 - d6;
            return Math.sqrt((d13 * d13) + (d14 * d14));
        }
        double d15 = d11 / d12;
        double d16 = d - (d3 + (d7 * d15));
        double d17 = (d4 + (d9 * d15)) - d2;
        return Math.sqrt((d16 * d16) + (d17 * d17));
    }

    private static int a(int i, int i2) {
        double d;
        int i3;
        if (100 > i2) {
            d = -0.1d;
            i3 = 60000;
        } else if (500 > i2) {
            d = -0.75d;
            i3 = 55500;
        } else {
            d = -0.5d;
            i3 = 0;
        }
        return ((int) ((d * i2) + i3)) + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i, double d, double d2) {
        double d3;
        a aVar;
        int i2 = i * 5;
        char[] cArr = new char[i + 1];
        a aVar2 = new a(90.0d, -90.0d);
        a aVar3 = new a(180.0d, -180.0d);
        int i3 = 1;
        int i4 = 1;
        boolean z = true;
        int i5 = 0;
        while (i4 <= i2) {
            if (z) {
                d3 = d;
                aVar = aVar3;
            } else {
                d3 = d2;
                aVar = aVar2;
            }
            double d4 = (aVar.b + aVar.f7643a) / 2.0d;
            i5 <<= i3;
            int i6 = i3;
            if (((int) (d3 * 1000000.0d)) > ((int) (d4 * 1000000.0d))) {
                aVar.b = d4;
                i5 |= 1;
            } else {
                aVar.f7643a = d4;
            }
            if (i4 % 5 == 0) {
                cArr[(i4 / 5) - 1] = "0123456789bcdefghjkmnpqrstuvwxyz".charAt(i5);
                i5 = 0;
            }
            z = !z;
            i4++;
            i3 = i6;
        }
        cArr[i] = 0;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i7 = 0; i7 < i; i7++) {
            stringBuffer.append(cArr[i7]);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] b(double d, double d2, double d3, double d4) {
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(d2);
        double radians3 = Math.toRadians(d4);
        double d5 = d3 / 6378137.0d;
        double asin = Math.asin((Math.sin(radians) * Math.cos(d5)) + (Math.cos(radians) * Math.sin(d5) * Math.cos(radians3)));
        return new double[]{Math.toDegrees(asin), Math.toDegrees(radians2 + Math.atan2(Math.sin(radians3) * Math.sin(d5) * Math.cos(radians), Math.cos(d5) - (Math.sin(radians) * Math.sin(asin))))};
    }

    private double c(double d, double d2, double d3, double d4) {
        double d5 = d4 - d2;
        double d6 = d3 - d;
        double radians = Math.toRadians(d);
        Math.toRadians(d2);
        double radians2 = Math.toRadians(d3);
        Math.toRadians(d4);
        double radians3 = Math.toRadians(d5);
        double radians4 = Math.toRadians(d6) / 2.0d;
        double d7 = radians3 / 2.0d;
        double sin = (Math.sin(radians4) * Math.sin(radians4)) + (Math.cos(radians) * Math.cos(radians2) * Math.sin(d7) * Math.sin(d7));
        return Math.atan2(Math.sqrt(sin), Math.sqrt(1.0d - sin)) * 2.0d * 6378137.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0183 A[Catch: all -> 0x01db, Exception -> 0x01dd, TryCatch #7 {Exception -> 0x01dd, blocks: (B:32:0x017d, B:34:0x0183, B:36:0x0189), top: B:31:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r4v17, types: [android.database.sqlite.SQLiteDatabase] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.baidu.location.Address a(double r34, double r36) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.e.g.a(double, double):com.baidu.location.Address");
    }

    void a(JSONObject jSONObject) {
        SQLiteDatabase sQLiteDatabase = this.d;
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.isOpen()) {
                    try {
                        this.d.beginTransaction();
                        for (b bVar : b.values()) {
                            if (jSONObject.has(bVar.g)) {
                                String string = jSONObject.has(bVar.h) ? jSONObject.getString(bVar.h) : "";
                                ArrayList arrayList = new ArrayList();
                                JSONObject jSONObject2 = jSONObject.getJSONObject(bVar.g);
                                arrayList.add(bVar.a(jSONObject2));
                                arrayList.addAll(bVar.a(jSONObject2, string, bVar.i));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    this.d.execSQL((String) it.next());
                                }
                            }
                        }
                        this.d.setTransactionSuccessful();
                        this.e = -1;
                        this.f = -1;
                        this.d.endTransaction();
                    } catch (Exception unused) {
                        this.d.endTransaction();
                    } catch (Throwable th) {
                        try {
                            this.d.endTransaction();
                        } catch (Exception unused2) {
                        }
                        throw th;
                    }
                }
            } catch (Exception unused3) {
            }
        }
    }

    boolean a() {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        Cursor rawQuery;
        if (this.f7642a.l().l() && this.f == -1 && this.e == -1 && (sQLiteDatabase = this.d) != null && sQLiteDatabase.isOpen()) {
            Cursor cursor3 = null;
            try {
                try {
                    rawQuery = this.d.rawQuery("SELECT COUNT(*) FROM RGCSITE;", null);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                cursor2 = null;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
            try {
                rawQuery.moveToFirst();
                this.f = rawQuery.getInt(0);
                cursor3 = this.d.rawQuery("SELECT COUNT(*) FROM RGCAREA;", null);
                cursor3.moveToFirst();
                this.e = cursor3.getInt(0);
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Exception unused3) {
                    }
                }
            } catch (Exception unused4) {
                cursor2 = cursor3;
                cursor3 = rawQuery;
                if (cursor3 != null) {
                    try {
                        cursor3.close();
                    } catch (Exception unused5) {
                    }
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                if (this.f != 0) {
                }
            } catch (Throwable th3) {
                cursor = cursor3;
                cursor3 = rawQuery;
                th = th3;
                if (cursor3 != null) {
                    try {
                        cursor3.close();
                    } catch (Exception unused6) {
                    }
                }
                if (cursor == null) {
                    throw th;
                }
                try {
                    cursor.close();
                    throw th;
                } catch (Exception unused7) {
                    throw th;
                }
            }
            if (cursor3 != null) {
                cursor3.close();
            }
        }
        return this.f != 0 && this.e == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.baidu.location.Poi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.util.List<com.baidu.location.Poi> b(double r25, double r27) {
        /*
            r24 = this;
            r1 = r24
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.baidu.location.e.g$b r2 = com.baidu.location.e.g.b.d
            int r3 = r1.c
            r4 = r25
            r6 = r27
            java.lang.String r2 = com.baidu.location.e.g.b.a(r2, r3, r4, r6)
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r1.d     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La9
            android.database.Cursor r10 = r4.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La9
            boolean r2 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9f
            if (r2 == 0) goto L96
            r11 = 0
            r12 = r3
            r13 = r11
        L23:
            boolean r2 = r10.isAfterLast()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            if (r2 != 0) goto L95
            java.lang.String r14 = r10.getString(r11)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            r2 = 2
            java.lang.String r15 = r10.getString(r2)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            r2 = 4
            double r8 = r10.getDouble(r2)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            r2 = 5
            double r6 = r10.getDouble(r2)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            r2 = 6
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            r4 = r25
            r16 = r2
            r2 = r27
            double r6 = r1.c(r2, r4, r6, r8)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            com.baidu.location.e.g$b r1 = com.baidu.location.e.g.b.d     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            int r1 = com.baidu.location.e.g.b.d(r1)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L8f
            com.baidu.location.Poi r17 = new com.baidu.location.Poi     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            byte[] r2 = r14.getBytes()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            byte[] r2 = android.util.Base64.decode(r2, r11)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            byte[] r3 = r15.getBytes()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            byte[] r3 = android.util.Base64.decode(r3, r11)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            java.lang.String r22 = ""
            java.lang.String r23 = ""
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r18 = r1
            r19 = r2
            r17.<init>(r18, r19, r20, r22, r23)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            float r1 = (float) r6     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            int r1 = java.lang.Math.round(r1)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            r2 = r16
            int r1 = a(r2, r1)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            if (r1 <= r13) goto L8f
            r13 = r1
            r12 = r17
        L8f:
            r10.moveToNext()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La0
            r1 = r24
            goto L23
        L95:
            r3 = r12
        L96:
            if (r10 == 0) goto Lb0
            r10.close()     // Catch: java.lang.Exception -> Lb0
            goto Lb0
        L9c:
            r0 = move-exception
            r3 = r10
            goto La3
        L9f:
            r12 = r3
        La0:
            r3 = r10
            goto Laa
        La2:
            r0 = move-exception
        La3:
            if (r3 == 0) goto La8
            r3.close()     // Catch: java.lang.Exception -> La8
        La8:
            throw r0
        La9:
            r12 = r3
        Laa:
            if (r3 == 0) goto Laf
            r3.close()     // Catch: java.lang.Exception -> Laf
        Laf:
            r3 = r12
        Lb0:
            if (r3 == 0) goto Lb5
            r0.add(r3)
        Lb5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.e.g.b(double, double):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x018f A[Catch: all -> 0x01dd, Exception -> 0x01e1, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x01dd, blocks: (B:76:0x008b, B:79:0x0095, B:80:0x009a, B:82:0x00a0, B:85:0x00a9, B:87:0x00b9, B:89:0x00bc, B:93:0x00d2, B:95:0x00e0, B:98:0x00ea, B:100:0x00f0, B:101:0x00f5, B:103:0x00fb, B:105:0x0111, B:107:0x0114, B:110:0x0123, B:112:0x012f, B:115:0x013e, B:118:0x0148, B:120:0x0156, B:122:0x015c, B:124:0x0169, B:7:0x0187, B:10:0x018f), top: B:75:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01b5 A[Catch: all -> 0x01db, Exception -> 0x01e3, TryCatch #14 {Exception -> 0x01e3, all -> 0x01db, blocks: (B:13:0x01a5, B:15:0x01a9, B:16:0x01af, B:18:0x01b5, B:20:0x01cd), top: B:12:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01d7 A[Catch: Exception -> 0x0202, TRY_ENTER, TRY_LEAVE, TryCatch #15 {Exception -> 0x0202, blocks: (B:44:0x01ff, B:24:0x01d7), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ff A[Catch: Exception -> 0x0202, TRY_ENTER, TRY_LEAVE, TryCatch #15 {Exception -> 0x0202, blocks: (B:44:0x01ff, B:24:0x01d7), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    org.json.JSONObject b() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.e.g.b():org.json.JSONObject");
    }
}
