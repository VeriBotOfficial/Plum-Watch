package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import io.nats.client.support.ApiConstants;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public long f19617a;
    public String b;
    public String c;
    public int d;
    public String e;
    public long f;
    public long g;

    public a(Cursor cursor) {
        this.f19617a = -1L;
        this.f19617a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.b = cursor.getString(cursor.getColumnIndex("event_action"));
        this.c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.d = cursor.getInt(cursor.getColumnIndex("states"));
        this.e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.g = cursor.getLong(cursor.getColumnIndex(ApiConstants.MTIME));
    }

    public a(String str, String str2) {
        this.f19617a = -1L;
        long currentTimeMillis = System.currentTimeMillis();
        this.b = str;
        this.c = str2;
        this.d = 0;
        this.e = "";
        this.f = currentTimeMillis;
        this.g = currentTimeMillis;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        long j = this.f19617a;
        return j >= 0 && j == ((a) obj).f19617a;
    }

    public String toString() {
        return "mId = " + this.f19617a + ",eventInfo=" + this.c;
    }
}
