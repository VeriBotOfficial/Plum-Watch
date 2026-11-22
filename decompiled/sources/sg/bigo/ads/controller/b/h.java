package sg.bigo.ads.controller.b;

import android.content.Context;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.common.f;
import sg.bigo.ads.common.n;

/* loaded from: classes9.dex */
public final class h extends sg.bigo.ads.common.e {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, i> f19846a;

    public h(Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.common.e
    public final String a() {
        return "bigoad_slots.dat";
    }

    public final l a(String str) {
        Map<String, i> map = this.f19846a;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    public final l a(sg.bigo.ads.api.b bVar) {
        l h = bVar.h();
        return h != null ? h : a(bVar.f19525a);
    }

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        Map<String, i> map = this.f19846a;
        if (map != null) {
            arrayList.addAll(map.values());
        }
        n.a(parcel, arrayList);
    }

    public final void a(JSONArray jSONArray) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            i iVar = new i();
            if (iVar.a(optJSONObject)) {
                hashMap.put(iVar.l(), iVar);
            }
        }
        this.f19846a = hashMap;
    }

    @Override // sg.bigo.ads.common.e
    public final String b() {
        return "SlotData";
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        List<i> a2 = n.a(parcel, new f.a<i>() { // from class: sg.bigo.ads.controller.b.h.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ i a() {
                return new i();
            }
        });
        HashMap hashMap = new HashMap();
        for (i iVar : a2) {
            hashMap.put(iVar.l(), iVar);
        }
        this.f19846a = hashMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Map<String, i> map = this.f19846a;
        if (map != null) {
            for (i iVar : map.values()) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(iVar);
            }
        }
        return "SlotData[" + sb.toString() + AbstractJsonLexerKt.END_LIST;
    }
}
