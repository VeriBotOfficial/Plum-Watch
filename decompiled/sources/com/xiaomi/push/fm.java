package com.xiaomi.push;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmind.core.internal.dom.DOMConstants;

/* loaded from: classes4.dex */
public class fm implements fq {

    /* renamed from: a, reason: collision with root package name */
    private String f14592a;

    /* renamed from: a, reason: collision with other field name */
    private List<fm> f538a;

    /* renamed from: a, reason: collision with other field name */
    private String[] f539a;
    private String b;

    /* renamed from: b, reason: collision with other field name */
    private String[] f540b;
    private String c;

    public fm(String str, String str2, String[] strArr, String[] strArr2) {
        this.f538a = null;
        this.f14592a = str;
        this.b = str2;
        this.f539a = strArr;
        this.f540b = strArr2;
    }

    public fm(String str, String str2, String[] strArr, String[] strArr2, String str3, List<fm> list) {
        this.f14592a = str;
        this.b = str2;
        this.f539a = strArr;
        this.f540b = strArr2;
        this.c = str3;
        this.f538a = list;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m12161a() {
        return this.f14592a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        if (!TextUtils.isEmpty(this.c)) {
            return fy.b(this.c);
        }
        return this.c;
    }

    public String toString() {
        return d();
    }

    @Override // com.xiaomi.push.fq
    public String d() {
        StringBuilder sb = new StringBuilder(Separators.LESS_THAN);
        sb.append(this.f14592a);
        if (!TextUtils.isEmpty(this.b)) {
            sb.append(" xmlns=\"").append(this.b).append("\"");
        }
        String[] strArr = this.f539a;
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < this.f539a.length; i++) {
                if (!TextUtils.isEmpty(this.f540b[i])) {
                    sb.append(" ").append(this.f539a[i]).append("=\"").append(fy.a(this.f540b[i])).append("\"");
                }
            }
        }
        if (!TextUtils.isEmpty(this.c)) {
            sb.append(Separators.GREATER_THAN).append(this.c).append("</").append(this.f14592a).append(Separators.GREATER_THAN);
        } else {
            List<fm> list = this.f538a;
            if (list != null && list.size() > 0) {
                sb.append(Separators.GREATER_THAN);
                Iterator<fm> it = this.f538a.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().d());
                }
                sb.append("</").append(this.f14592a).append(Separators.GREATER_THAN);
            } else {
                sb.append("/>");
            }
        }
        return sb.toString();
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.f14592a);
        bundle.putString("ext_ns", this.b);
        bundle.putString("ext_text", this.c);
        Bundle bundle2 = new Bundle();
        String[] strArr = this.f539a;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f539a;
                if (i >= strArr2.length) {
                    break;
                }
                bundle2.putString(strArr2[i], this.f540b[i]);
                i++;
            }
        }
        bundle.putBundle("attributes", bundle2);
        List<fm> list = this.f538a;
        if (list != null && list.size() > 0) {
            bundle.putParcelableArray(DOMConstants.TAG_CHILDREN, a(this.f538a));
        }
        return bundle;
    }

    /* renamed from: a, reason: collision with other method in class */
    public Parcelable m12160a() {
        return a();
    }

    public static Parcelable[] a(fm[] fmVarArr) {
        if (fmVarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[fmVarArr.length];
        for (int i = 0; i < fmVarArr.length; i++) {
            parcelableArr[i] = fmVarArr[i].m12160a();
        }
        return parcelableArr;
    }

    public static Parcelable[] a(List<fm> list) {
        return a((fm[]) list.toArray(new fm[list.size()]));
    }

    public static fm a(Bundle bundle) {
        ArrayList arrayList;
        String string = bundle.getString("ext_ele_name");
        String string2 = bundle.getString("ext_ns");
        String string3 = bundle.getString("ext_text");
        Bundle bundle2 = bundle.getBundle("attributes");
        Set<String> keySet = bundle2.keySet();
        String[] strArr = new String[keySet.size()];
        String[] strArr2 = new String[keySet.size()];
        int i = 0;
        for (String str : keySet) {
            strArr[i] = str;
            strArr2[i] = bundle2.getString(str);
            i++;
        }
        if (bundle.containsKey(DOMConstants.TAG_CHILDREN)) {
            Parcelable[] parcelableArray = bundle.getParcelableArray(DOMConstants.TAG_CHILDREN);
            arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add(a((Bundle) parcelable));
            }
        } else {
            arrayList = null;
        }
        return new fm(string, string2, strArr, strArr2, string3, arrayList);
    }

    public String a(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (this.f539a == null) {
            return null;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.f539a;
            if (i >= strArr.length) {
                return null;
            }
            if (str.equals(strArr[i])) {
                return this.f540b[i];
            }
            i++;
        }
    }

    public void a(fm fmVar) {
        if (this.f538a == null) {
            this.f538a = new ArrayList();
        }
        if (this.f538a.contains(fmVar)) {
            return;
        }
        this.f538a.add(fmVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12162a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.c = fy.a(str);
        } else {
            this.c = str;
        }
    }
}
