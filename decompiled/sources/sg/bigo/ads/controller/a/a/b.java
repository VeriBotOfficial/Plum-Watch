package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import android.text.TextUtils;
import com.iflytek.cloud.util.AudioDetector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.f;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.controller.a.j;

/* loaded from: classes9.dex */
public class b implements sg.bigo.ads.common.f {

    /* renamed from: a, reason: collision with root package name */
    public C1093b f19802a;
    public C1093b b;
    public int c;
    private final String d;
    private final String e;
    private Map<a, C1093b> f;
    private Map<a, List<C1093b>> g;
    private int h = 3;
    private Map<a, C1093b> i = a();
    private Map<a, List<C1093b>> j;

    static class a implements sg.bigo.ads.common.f {
        private static final f.a<a> c = new f.a<a>() { // from class: sg.bigo.ads.controller.a.a.b.a.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ a a() {
                return new a("", 0);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public String f19804a;
        public int b;

        protected a(String str, int i) {
            this.f19804a = TextUtils.isEmpty(str) ? "all" : str.toLowerCase();
            this.b = i;
        }

        @Override // sg.bigo.ads.common.f
        public final void a(Parcel parcel) {
            parcel.writeString(this.f19804a);
            parcel.writeInt(this.b);
        }

        @Override // sg.bigo.ads.common.f
        public final void b(Parcel parcel) {
            this.f19804a = n.a(parcel, "");
            this.b = n.a(parcel, 0);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f19804a, aVar.f19804a) && this.b == aVar.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f19804a + "_" + this.b).hashCode();
        }

        public final String toString() {
            return super.toString();
        }
    }

    /* renamed from: sg.bigo.ads.controller.a.a.b$b, reason: collision with other inner class name */
    public static class C1093b extends j implements sg.bigo.ads.common.f {
        private static final f.a<C1093b> e = new f.a<C1093b>() { // from class: sg.bigo.ads.controller.a.a.b.b.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ C1093b a() {
                return new C1093b("", "", 0);
            }
        };
        boolean d;

        protected C1093b(String str, String str2, int i) {
            super(str, str2, i);
            this.d = true;
        }

        @Override // sg.bigo.ads.common.f
        public final void a(Parcel parcel) {
            parcel.writeString(this.f19831a);
            parcel.writeInt(this.c);
            n.a(parcel, this.d);
            parcel.writeString(this.b);
        }

        public final void a(String str) {
            this.b = str;
        }

        @Override // sg.bigo.ads.common.f
        public final void b(Parcel parcel) {
            this.f19831a = n.a(parcel, "");
            this.c = n.a(parcel, 1);
            this.d = n.b(parcel, true);
            this.b = n.a(parcel, "");
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof j) {
                return TextUtils.equals(this.f19831a, ((j) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            if (this.f19831a != null) {
                return this.f19831a.hashCode();
            }
            return 0;
        }
    }

    public b(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    private static List<a> a(a aVar) {
        ArrayList arrayList = new ArrayList();
        a aVar2 = new a("all", 0);
        if (aVar2.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar2);
        a aVar3 = new a("all", aVar.b);
        if (aVar3.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar3);
        a aVar4 = new a(aVar.f19804a, 0);
        if (aVar4.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar4);
        arrayList.add(0, aVar);
        return arrayList;
    }

    private Map<a, C1093b> a() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.d)) {
            hashMap.put(new a("all", 0), new C1093b(this.d, "", 0));
        }
        if (!TextUtils.isEmpty(this.e)) {
            hashMap.put(new a(com.anythink.expressad.video.dynview.a.a.Y, 0), new C1093b(this.e, "", 0));
        }
        return hashMap;
    }

    private static C1093b a(Map<a, C1093b> map, a aVar) {
        if (!k.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C1093b c1093b = map.get(it.next());
                if (a(c1093b)) {
                    return c1093b;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private sg.bigo.ads.controller.a.a.b.C1093b a(sg.bigo.ads.controller.a.a.b.a r6, boolean r7) {
        /*
            r5 = this;
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, sg.bigo.ads.controller.a.a.b$b> r0 = r5.f
            sg.bigo.ads.controller.a.a.b$b r0 = a(r0, r6)
            boolean r1 = a(r0)
            r2 = 0
            if (r1 != 0) goto L34
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, java.util.List<sg.bigo.ads.controller.a.a.b$b>> r0 = r5.g
            sg.bigo.ads.controller.a.a.b$b r0 = r5.b(r0, r6)
            boolean r1 = a(r0)
            if (r1 != 0) goto L34
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, sg.bigo.ads.controller.a.a.b$b> r0 = r5.i
            sg.bigo.ads.controller.a.a.b$b r0 = a(r0, r6)
            boolean r1 = a(r0)
            if (r1 != 0) goto L34
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, java.util.List<sg.bigo.ads.controller.a.a.b$b>> r0 = r5.j
            sg.bigo.ads.controller.a.a.b$b r0 = r5.b(r0, r6)
            boolean r1 = a(r0)
            if (r1 == 0) goto L32
            goto L34
        L32:
            r1 = r2
            goto L35
        L34:
            r1 = 1
        L35:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getBestHost "
            r3.<init>(r4)
            if (r1 == 0) goto L41
            java.lang.String r1 = "success"
            goto L43
        L41:
            java.lang.String r1 = "fail"
        L43:
            java.lang.StringBuilder r1 = r3.append(r1)
            if (r7 == 0) goto L4c
            java.lang.String r7 = " after reset"
            goto L4e
        L4c:
            java.lang.String r7 = ""
        L4e:
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r1 = ", countryKey="
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r7 = ", currentHost="
            java.lang.StringBuilder r6 = r6.append(r7)
            sg.bigo.ads.controller.a.a.b$b r7 = r5.b
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 3
            java.lang.String r1 = "AntiBanHost"
            sg.bigo.ads.common.t.a.a(r2, r7, r1, r6)
            boolean r6 = a(r0)
            if (r6 == 0) goto L79
            return r0
        L79:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.a.a.b.a(sg.bigo.ads.controller.a.a.b$a, boolean):sg.bigo.ads.controller.a.a.b$b");
    }

    private void a(Map<a, C1093b> map, Map<a, List<C1093b>> map2, String str, int i) {
        C1093b value;
        C1093b c1093b;
        synchronized (this) {
            if (!k.a(this.f) && !k.a(map)) {
                for (Map.Entry<a, C1093b> entry : this.f.entrySet()) {
                    a key = entry.getKey();
                    if (key != null && (value = entry.getValue()) != null && (c1093b = map.get(key)) != null && value.equals(c1093b)) {
                        value.a(c1093b.b());
                    }
                }
            }
            if (!k.a(this.g) && !k.a(map2)) {
                for (Map.Entry<a, List<C1093b>> entry2 : this.g.entrySet()) {
                    a key2 = entry2.getKey();
                    if (key2 != null) {
                        List<C1093b> value2 = entry2.getValue();
                        if (!k.a((Collection) value2)) {
                            List<C1093b> list = map2.get(key2);
                            if (!k.a((Collection) list)) {
                                for (C1093b c1093b2 : value2) {
                                    if (c1093b2 != null) {
                                        Iterator<C1093b> it = list.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                C1093b next = it.next();
                                                if (c1093b2.equals(next)) {
                                                    c1093b2.a(next.b());
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C1093b c1093b3 = this.b;
            if (c1093b3 != null) {
                if (c1093b3.d() == 1) {
                    C1093b c1093b4 = this.f.get(new a(str, i));
                    if (this.b.equals(c1093b4)) {
                        this.b.a(c1093b4.b());
                    }
                } else if (this.b.d() == 2) {
                    List<C1093b> list2 = this.g.get(new a(str, i));
                    if (!k.a((Collection) list2)) {
                        Iterator<C1093b> it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C1093b next2 = it2.next();
                            if (this.b.equals(next2)) {
                                this.b.a(next2.b());
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean a(C1093b c1093b) {
        return c1093b != null && c1093b.d;
    }

    private C1093b b(Map<a, List<C1093b>> map, a aVar) {
        if (!k.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C1093b c1093b = (C1093b) k.a(k.a(map.get(it.next()), new Comparable<C1093b>() { // from class: sg.bigo.ads.controller.a.a.b.1
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(C1093b c1093b2) {
                        C1093b c1093b3 = c1093b2;
                        return (c1093b3 == null || !c1093b3.d) ? 0 : 1;
                    }
                }));
                if (a(c1093b)) {
                    return c1093b;
                }
            }
        }
        return null;
    }

    public final sg.bigo.ads.controller.a.e a(String str, int i) {
        boolean z;
        sg.bigo.ads.controller.a.e eVar;
        synchronized (this) {
            if (this.b == null || this.c >= this.h) {
                a aVar = new a(str, i);
                C1093b a2 = a(aVar, false);
                if (a(a2)) {
                    z = false;
                } else {
                    Map<a, C1093b> map = this.f;
                    if (map != null) {
                        Iterator<Map.Entry<a, C1093b>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            C1093b value = it.next().getValue();
                            if (value != null) {
                                value.d = true;
                            }
                        }
                    }
                    Map<a, List<C1093b>> map2 = this.g;
                    if (map2 != null) {
                        Iterator<Map.Entry<a, List<C1093b>>> it2 = map2.entrySet().iterator();
                        while (it2.hasNext()) {
                            List<C1093b> value2 = it2.next().getValue();
                            if (!k.a((Collection) value2)) {
                                Iterator<C1093b> it3 = value2.iterator();
                                while (it3.hasNext()) {
                                    it3.next().d = true;
                                }
                            }
                        }
                    }
                    Map<a, List<C1093b>> map3 = this.j;
                    if (map3 != null) {
                        Iterator<Map.Entry<a, List<C1093b>>> it4 = map3.entrySet().iterator();
                        while (it4.hasNext()) {
                            List<C1093b> value3 = it4.next().getValue();
                            if (!k.a((Collection) value3)) {
                                Iterator<C1093b> it5 = value3.iterator();
                                while (it5.hasNext()) {
                                    it5.next().d = true;
                                }
                            }
                        }
                    }
                    Map<a, C1093b> map4 = this.i;
                    if (map4 != null) {
                        Iterator<Map.Entry<a, C1093b>> it6 = map4.entrySet().iterator();
                        while (it6.hasNext()) {
                            C1093b value4 = it6.next().getValue();
                            if (value4 != null) {
                                value4.d = true;
                            }
                        }
                    }
                    this.f19802a = this.b;
                    this.b = null;
                    this.c = 0;
                    a2 = a(aVar, true);
                    z = true;
                }
                if (a(a2)) {
                    a2.d = false;
                    this.f19802a = this.b;
                    this.b = new C1093b(a2.a(), a2.b(), a2.d());
                    this.c = 0;
                }
                if (this.b == null) {
                    this.b = new C1093b(this.d, "", 0);
                }
                eVar = new sg.bigo.ads.controller.a.e(this.b, z, true);
            } else {
                eVar = new sg.bigo.ads.controller.a.e(this.b, false, false);
            }
        }
        return eVar;
    }

    @Override // sg.bigo.ads.common.f
    public void a(Parcel parcel) {
        synchronized (this) {
            n.a(parcel, this.f);
            n.b(parcel, this.g);
            parcel.writeInt(this.h);
            n.a(parcel, this.i);
            n.b(parcel, this.j);
            n.a(parcel, this.f19802a);
            n.a(parcel, this.b);
            parcel.writeInt(this.c);
        }
    }

    public void a(JSONObject jSONObject, boolean z, String str, int i) {
        synchronized (this) {
            HashMap hashMap = new HashMap();
            JSONArray optJSONArray = jSONObject.optJSONArray("country_hosts");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("host", "");
                        if (sg.bigo.ads.controller.a.d.a(optString)) {
                            hashMap.put(new a(optJSONObject.optString("country", "all"), optJSONObject.optInt("app_flag", 0)), new C1093b(optString, optJSONObject.optString("domain_front", ""), 1));
                        }
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("backup_hosts");
            if (optJSONArray2 != null) {
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                    if (optJSONObject2 != null) {
                        a aVar = new a(optJSONObject2.optString("country", "all"), optJSONObject2.optInt("app_flag", 0));
                        List<C1093b> list = hashMap2.get(aVar);
                        if (list == null) {
                            list = new ArrayList<>();
                            hashMap2.put(aVar, list);
                        }
                        String optString2 = optJSONObject2.optString("domain_front", "");
                        JSONArray optJSONArray3 = optJSONObject2.optJSONArray("hosts");
                        if (optJSONArray3 != null) {
                            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                String optString3 = optJSONArray3.optString(i4, "");
                                if (sg.bigo.ads.controller.a.d.a(optString3)) {
                                    C1093b c1093b = new C1093b(optString3, optString2, 2);
                                    if (!list.contains(c1093b)) {
                                        list.add(c1093b);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (z) {
                a(hashMap, hashMap2, str, i);
            } else {
                int optInt = jSONObject.optInt(AudioDetector.THRESHOLD, 3);
                this.f = hashMap;
                this.g = hashMap2;
                this.h = optInt;
                this.j = new HashMap();
                this.i = a();
                this.f19802a = this.b;
                this.b = null;
                this.c = 0;
            }
        }
    }

    public final boolean a(String str, String str2) {
        synchronized (this) {
            if (sg.bigo.ads.controller.a.d.a(str2)) {
                a aVar = new a(str, 0);
                if (this.j == null) {
                    this.j = new HashMap();
                }
                List<C1093b> list = this.j.get(aVar);
                if (list == null) {
                    list = new ArrayList<>();
                    this.j.put(aVar, list);
                }
                C1093b c1093b = new C1093b(str2, "", 3);
                if (!list.contains(c1093b)) {
                    list.add(c1093b);
                    return true;
                }
            }
            return false;
        }
    }

    @Override // sg.bigo.ads.common.f
    public void b(Parcel parcel) {
        synchronized (this) {
            this.f = n.a(parcel, a.c, C1093b.e);
            this.g = n.b(parcel, a.c, C1093b.e);
            this.h = n.a(parcel, 3);
            Map a2 = n.a(parcel, a.c, C1093b.e);
            this.j = n.b(parcel, a.c, C1093b.e);
            this.f19802a = (C1093b) n.b(parcel, C1093b.e);
            this.b = (C1093b) n.b(parcel, C1093b.e);
            this.c = n.a(parcel, 0);
            this.i = a();
            HashSet hashSet = new HashSet();
            for (C1093b c1093b : this.i.values()) {
                hashSet.add(c1093b.a());
                if (!k.a(a2)) {
                    for (C1093b c1093b2 : a2.values()) {
                        if (TextUtils.equals(c1093b.a(), c1093b2.a())) {
                            c1093b.d = c1093b2.d;
                        }
                    }
                }
            }
            C1093b c1093b3 = this.b;
            if (c1093b3 != null && c1093b3.d() == 0 && !hashSet.contains(this.b.a())) {
                this.f19802a = this.b;
                this.b = null;
                this.c = 0;
            }
        }
    }

    public String toString() {
        return super.toString();
    }
}
