package sg.bigo.ads.common.g.c;

import android.database.Cursor;
import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.utils.t;

/* loaded from: classes9.dex */
public final class b {
    public static long a(List<String> list) {
        sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "delStatInfo:" + list.size());
        StringBuilder sb = new StringBuilder("_id in (");
        int i = 0;
        while (i < list.size()) {
            sb.append(i == 0 ? Separators.QUESTION : ",?");
            i++;
        }
        sb.append(Separators.RPAREN);
        long b = sg.bigo.ads.common.g.a.a.b("tb_stat", sb.toString(), (String[]) list.toArray(new String[0]));
        sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "delStatInfo count = ".concat(String.valueOf(b)));
        return b;
    }

    public static List<sg.bigo.ads.common.g.b.b> a(int i) {
        Cursor a2 = sg.bigo.ads.common.g.a.a.a("tb_stat", null, null, "mtime DESC", i);
        ArrayList arrayList = new ArrayList();
        if (a2 == null) {
            return arrayList;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "getStatInfoList: count = " + a2.getCount());
        while (a2.moveToNext()) {
            arrayList.add(new sg.bigo.ads.common.g.b.b(a2));
            t.a();
        }
        a2.close();
        return arrayList;
    }
}
