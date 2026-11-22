package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import io.nats.client.support.ApiConstants;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public long f19618a;
    public String b;
    public String c;
    public long d;
    public String e;
    public long f;
    public long g;

    public b(Cursor cursor) {
        this.f19618a = -1L;
        this.f19618a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.b = cursor.getString(cursor.getColumnIndex("event_id"));
        this.c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.d = cursor.getLong(cursor.getColumnIndex("expired_ts"));
        this.e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.g = cursor.getLong(cursor.getColumnIndex(ApiConstants.MTIME));
    }

    public b(String str, String str2, long j) {
        this.f19618a = -1L;
        long currentTimeMillis = System.currentTimeMillis();
        this.b = str;
        this.c = str2;
        this.d = j;
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
        if (obj.getClass() != b.class) {
            return false;
        }
        long j = this.f19618a;
        return j >= 0 && j == ((b) obj).f19618a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("mId = ");
        sb.append(this.f19618a).append(",mEventId = ");
        sb.append(this.b).append(",mExpiredTs = ");
        sb.append(this.d).append(",eventInfo = ");
        sb.append(this.c);
        return sb.toString();
    }
}
