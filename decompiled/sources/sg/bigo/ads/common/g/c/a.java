package sg.bigo.ads.common.g.c;

import android.database.Cursor;
import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.utils.t;

/* loaded from: classes9.dex */
public final class a {
    public static long a(List<String> list) {
        sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "delEventInfo:" + list.size());
        StringBuilder sb = new StringBuilder("_id in (");
        int i = 0;
        while (i < list.size()) {
            sb.append(i == 0 ? Separators.QUESTION : ",?");
            i++;
        }
        sb.append(Separators.RPAREN);
        long b = sg.bigo.ads.common.g.a.a.b("tb_event", sb.toString(), (String[]) list.toArray(new String[0]));
        sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "delEventInfo count = ".concat(String.valueOf(b)));
        return b;
    }

    public static List<sg.bigo.ads.common.g.b.a> a(int i) {
        Cursor a2 = sg.bigo.ads.common.g.a.a.a("tb_event", null, null, "mtime DESC", i);
        ArrayList arrayList = new ArrayList();
        if (a2 == null) {
            return arrayList;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "getEventInfoList: count = " + a2.getCount());
        while (a2.moveToNext()) {
            arrayList.add(new sg.bigo.ads.common.g.b.a(a2));
            t.a();
        }
        a2.close();
        return arrayList;
    }
}
