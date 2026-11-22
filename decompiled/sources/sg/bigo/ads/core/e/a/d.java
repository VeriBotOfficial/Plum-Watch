package sg.bigo.ads.core.e.a;

import android.text.TextUtils;
import com.alibaba.fastjson.parser.JSONLexer;
import com.autonavi.aps.amapapi.config.Const;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    int f20011a;
    String b;
    int c;
    int d;
    JSONObject e;
    private String f;
    private String g;
    private String[] h;
    private String[] i;
    private String j;
    private int k;
    private final Map<String, String> l;
    private sg.bigo.ads.common.g m;

    d(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    public d(JSONObject jSONObject, sg.bigo.ads.common.g gVar) {
        this.m = gVar;
        this.e = jSONObject;
        this.l = new HashMap();
        this.f20011a = jSONObject.optInt("type", 0);
        this.f = jSONObject.optString("value", "");
        this.b = jSONObject.optString("name", "");
        this.g = jSONObject.optString(CommonUrlParts.UUID, "");
        this.k = jSONObject.optInt("expired");
        this.c = jSONObject.optInt("replace", 0);
        this.d = jSONObject.optInt("norepeat", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("reg");
        if (optJSONArray != null) {
            this.h = new String[optJSONArray.length()];
            this.i = new String[optJSONArray.length()];
            a(optJSONArray);
        }
        this.j = jSONObject.optString("real_url");
    }

    private void a(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.optJSONObject(i) != null) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                this.h[i] = optJSONObject.optString("token", "");
                this.i[i] = optJSONObject.optString("value", "");
            }
        }
    }

    private boolean f() {
        return this.c == 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private String g() {
        char c;
        long a2;
        int d;
        if (TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.b)) {
            return "";
        }
        String trim = this.f.trim();
        if (this.h != null && this.i != null && this.m != null) {
            for (int i = 0; i < this.h.length; i++) {
                String str = this.i[i];
                switch (str.hashCode()) {
                    case -2138759690:
                        if (str.equals("regist_time")) {
                            c = '/';
                            break;
                        }
                        c = 65535;
                        break;
                    case -2076227591:
                        if (str.equals("timezone")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1795462070:
                        if (str.equals("express_id")) {
                            c = '!';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1600030548:
                        if (str.equals("resolution")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1273393189:
                        if (str.equals("sec_price")) {
                            c = Typography.dollar;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1229750878:
                        if (str.equals("sec_bidder")) {
                            c = '%';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1182905495:
                        if (str.equals("os_lang")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1174888717:
                        if (str.equals("gps_adid")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1007979832:
                        if (str.equals("os_ver")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -986522696:
                        if (str.equals("pkg_ch")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -986522112:
                        if (str.equals("pkg_vc")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -934795532:
                        if (str.equals("region")) {
                            c = '.';
                            break;
                        }
                        c = 65535;
                        break;
                    case -906980142:
                        if (str.equals("sdk_vc")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -820075192:
                        if (str.equals("vendor")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case -793620671:
                        if (str.equals("app_key")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -777008198:
                        if (str.equals("click_prop")) {
                            c = ' ';
                            break;
                        }
                        c = 65535;
                        break;
                    case -693230854:
                        if (str.equals("first_price")) {
                            c = Typography.amp;
                            break;
                        }
                        c = 65535;
                        break;
                    case -613897138:
                        if (str.equals("support_om")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case -517414224:
                        if (str.equals("pkg_ver")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -424587677:
                        if (str.equals("first_bidder")) {
                            c = '\'';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3556:
                        if (str.equals("os")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 99677:
                        if (str.equals("dpi")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 104582:
                        if (str.equals("isp")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 106905:
                        if (str.equals("lan")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 106911:
                        if (str.equals("lat")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case 107301:
                        if (str.equals("lng")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case 107855:
                        if (str.equals("mac")) {
                            c = AbstractJsonLexerKt.COMMA;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108957:
                        if (str.equals("net")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 115792:
                        if (str.equals("uid")) {
                            c = '1';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3053931:
                        if (str.equals("city")) {
                            c = JSONLexer.EOI;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3165045:
                        if (str.equals("gaid")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3184265:
                        if (str.equals("guid")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3197719:
                        if (str.equals("hdid")) {
                            c = '-';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3236040:
                        if (str.equals(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.o)) {
                            c = '*';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3236474:
                        if (str.equals("imsi")) {
                            c = '+';
                            break;
                        }
                        c = 65535;
                        break;
                    case 25209764:
                        if (str.equals("device_id")) {
                            c = '2';
                            break;
                        }
                        c = 65535;
                        break;
                    case 55126294:
                        if (str.equals("timestamp")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 92714869:
                        if (str.equals("af_id")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case 104069929:
                        if (str.equals("model")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109757585:
                        if (str.equals("state")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case 440309782:
                        if (str.equals("advertising_id")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 530453763:
                        if (str.equals("click_module")) {
                            c = '#';
                            break;
                        }
                        c = 65535;
                        break;
                    case 702731954:
                        if (str.equals("click_source")) {
                            c = '\"';
                            break;
                        }
                        c = 65535;
                        break;
                    case 957831062:
                        if (str.equals("country")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1139786014:
                        if (str.equals("pkg_name")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1139954915:
                        if (str.equals("pkg_sver")) {
                            c = ')';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1505024451:
                        if (str.equals("local_timestamp_ms")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1583758243:
                        if (str.equals("action_type")) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1793985248:
                        if (str.equals("loss_reason")) {
                            c = '(';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1845546289:
                        if (str.equals("new_uid")) {
                            c = '0';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1948386846:
                        if (str.equals("sdk_ver")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                String str2 = "0";
                switch (c) {
                    case 0:
                        a2 = r.a();
                        str2 = String.valueOf(a2);
                        break;
                    case 1:
                        a2 = System.currentTimeMillis();
                        str2 = String.valueOf(a2);
                        break;
                    case 2:
                        str2 = this.m.C();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        str2 = this.m.A();
                        break;
                    case 6:
                        str2 = this.m.a();
                        break;
                    case 7:
                        str2 = this.m.b();
                        break;
                    case '\b':
                        str2 = String.valueOf(this.m.c());
                        break;
                    case '\t':
                        d = this.m.d();
                        str2 = String.valueOf(d);
                        break;
                    case '\n':
                        str2 = this.m.e();
                        break;
                    case 11:
                        str2 = this.m.i();
                        break;
                    case '\f':
                        str2 = this.m.j();
                        break;
                    case '\r':
                    case 19:
                        str2 = this.m.k();
                        break;
                    case 14:
                        str2 = this.m.l();
                        break;
                    case 15:
                        str2 = this.m.m();
                        break;
                    case 16:
                        str2 = this.m.n();
                        break;
                    case 17:
                        str2 = this.m.o();
                        break;
                    case 18:
                        d = this.m.p();
                        str2 = String.valueOf(d);
                        break;
                    case 20:
                        str2 = this.m.r();
                        break;
                    case 21:
                        str2 = this.m.s();
                        break;
                    case 22:
                        str2 = this.m.y();
                        break;
                    case 23:
                        str2 = "50300";
                        break;
                    case 24:
                        str2 = this.m.t();
                        break;
                    case 25:
                        str2 = this.m.w();
                        break;
                    case 26:
                        str2 = this.m.x();
                        break;
                    case 27:
                    case 28:
                        break;
                    case 29:
                        str2 = this.m.B();
                        break;
                    case 30:
                        str2 = "1";
                        break;
                    case 31:
                    case ' ':
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                        if (this.l.containsKey(str)) {
                            str2 = this.l.get(str);
                            break;
                        }
                    default:
                        str2 = "";
                        break;
                }
                String str3 = this.h[i];
                if (str2 == null) {
                    str2 = "";
                }
                trim = trim.replace(str3, str2);
            }
        }
        h hVar = i.f19524a;
        if (trim == null || hVar == null || !hVar.n().a(8)) {
            return trim;
        }
        try {
            return trim.replace(Const.STR_MART_JSON_BEGIN, "%7B").replace("}", "%7D");
        } catch (Exception unused) {
            return trim;
        }
    }

    public final void a(String str, String str2) {
        this.l.put(str, str2);
    }

    public final boolean a() {
        return "bigo_tracker".equals(this.g);
    }

    public final boolean b() {
        return this.k != 0 && r.a() / 1000 > ((long) this.k);
    }

    public final boolean c() {
        return this.f20011a == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final sg.bigo.ads.common.u.a d() {
        /*
            r6 = this;
            java.lang.String r0 = r6.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 3
            r2 = 0
            java.lang.String r3 = "ThirdTrack"
            if (r0 == 0) goto L23
            r6.e()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "getRealUrl url = "
            r0.<init>(r4)
            java.lang.String r4 = r6.j
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            sg.bigo.ads.common.t.a.a(r2, r1, r3, r0)
        L23:
            boolean r0 = r6.c()
            if (r0 == 0) goto L59
            boolean r0 = r6.f()
            if (r0 == 0) goto L59
            sg.bigo.ads.core.e.a.c r0 = sg.bigo.ads.core.e.a.c.a()
            sg.bigo.ads.common.k r0 = r0.d
            if (r0 == 0) goto L54
            java.lang.String r4 = r6.j
            sg.bigo.ads.common.k$b r0 = r0.a(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "replaceHost new url = "
            r4.<init>(r5)
            java.lang.String r5 = r0.a()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            sg.bigo.ads.common.t.a.a(r2, r1, r3, r4)
            goto L5a
        L54:
            java.lang.String r0 = "replaceHost handle is null, replace failed"
            sg.bigo.ads.common.t.a.a(r2, r3, r0)
        L59:
            r0 = 0
        L5a:
            if (r0 != 0) goto L63
            sg.bigo.ads.common.k$a r0 = new sg.bigo.ads.common.k$a
            java.lang.String r1 = r6.j
            r0.<init>(r1)
        L63:
            sg.bigo.ads.core.e.a r1 = new sg.bigo.ads.core.e.a
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.e.a.d.d():sg.bigo.ads.common.u.a");
    }

    public final void e() {
        this.j = g();
        sg.bigo.ads.common.t.a.a(0, 3, "ThirdTrack", "updateRealUrl url = " + this.j);
        JSONObject jSONObject = this.e;
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("real_url", this.j);
            } catch (JSONException unused) {
            }
        }
    }

    public final String toString() {
        return "type=" + this.f20011a + ",name=" + this.b + ",url=" + this.j;
    }
}
