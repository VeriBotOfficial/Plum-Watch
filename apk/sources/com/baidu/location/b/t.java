package com.baidu.location.b;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.javax.sdp.BandWidth;
import android.location.GnssNavigationMessage;
import androidx.camera.video.AudioStats;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.net.ftp.FTPReply;

/* JADX INFO: loaded from: classes15.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double[] f7585a = {1999.0d, 8.0d, 22.0d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE};
    private HashMap<String, c> b = new HashMap<>();
    private HashMap<String, String> c = new HashMap<>();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static t f7586a = new t();
    }

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7587a = 0;
        double b = AudioStats.AUDIO_AMPLITUDE_NONE;

        public b() {
        }
    }

    private class c {
        private boolean b;
        private boolean c;
        private long d;
        private int e;
        private int f;
        private ArrayList<String> g;
        private ArrayList<Integer> h;
        private int i;
        private double j;
        private double k;
        private double l;
        private int m;
        private int n;
        private b o;

        public c(int r4, int r5) {
            a(r4, r5);
            this.i = 0;
            this.j = AudioStats.AUDIO_AMPLITUDE_NONE;
            this.k = AudioStats.AUDIO_AMPLITUDE_NONE;
            this.l = AudioStats.AUDIO_AMPLITUDE_NONE;
            this.m = 0;
            this.n = 0;
            this.o = t.this.new b();
        }

        private b a(int r4, double d) {
            b bVarA = a(t.f7585a);
            if (d < -1.0E9d || 1.0E9d < d) {
                d = AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            int r2 = (int) d;
            bVarA.f7587a += (r4 * 604800) + r2;
            bVarA.b = d - ((double) r2);
            return bVarA;
        }

        private b a(double[] dArr) {
            int[] r1 = {1, 32, 60, 91, 121, 152, 182, FTPReply.FILE_STATUS, 244, 274, 305, 335};
            b bVar = t.this.new b();
            int r3 = 0;
            int r4 = (int) dArr[0];
            int r6 = (int) dArr[1];
            int r8 = (int) dArr[2];
            if (r4 >= 1970 && 2099 >= r4 && r6 >= 1 && 12 >= r6) {
                int r0 = (((((r4 - 1970) * 365) + ((r4 - 1969) / 4)) + r1[r6 - 1]) + r8) - 2;
                if (r4 % 4 == 0 && r6 >= 3) {
                    r3 = 1;
                }
                int r5 = (int) Math.floor(dArr[5]);
                bVar.f7587a = ((r0 + r3) * 86400) + (((int) dArr[3]) * 3600) + (((int) dArr[4]) * 60) + r5;
                bVar.b = dArr[5] - ((double) r5);
            }
            return bVar;
        }

        private String a(GnssNavigationMessage gnssNavigationMessage) {
            StringBuilder sb = new StringBuilder();
            for (byte b : gnssNavigationMessage.getData()) {
                sb.append(String.format("%8s", Integer.toBinaryString(b & 255)).replace(' ', '0'));
            }
            return sb.toString();
        }

        private void a() {
            if (this.g.size() != 0) {
                for (int r0 = 0; r0 < this.g.size(); r0++) {
                    if (!this.g.get(r0).contains("None")) {
                    }
                }
                this.c = true;
                return;
            }
            this.c = false;
        }

        private void a(int r6, int r7) {
            int r0 = this.f;
            int r2 = 5;
            if (r0 != 257 && r0 != 769) {
                if (r0 == 1537) {
                    r2 = 6;
                } else if (r0 != 1281) {
                    r2 = r0 != 1282 ? 0 : 10;
                } else {
                    r2 = 3;
                }
            }
            ArrayList<String> arrayList = this.g;
            if (arrayList != null) {
                arrayList.clear();
            } else {
                this.g = new ArrayList<>();
            }
            ArrayList<Integer> arrayList2 = this.h;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                this.h = new ArrayList<>();
            }
            for (int r1 = 0; r1 < r2; r1++) {
                this.g.add("None");
            }
            this.e = r6;
            this.f = r7;
            this.b = false;
            this.c = false;
            this.d = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(GnssNavigationMessage gnssNavigationMessage, long j) {
            int type = gnssNavigationMessage.getType();
            int svid = gnssNavigationMessage.getSvid();
            int submessageId = gnssNavigationMessage.getSubmessageId();
            byte[] data = gnssNavigationMessage.getData();
            if (j - this.d > 1200 || this.b || this.g.size() == 0 || type != this.f || svid != this.e) {
                a(svid, type);
            }
            if ((type == 1282 || type == 1281) && !b()) {
                a(svid, type);
            }
            if (this.g.size() == 0) {
                return;
            }
            int r4 = this.f;
            boolean z = true;
            int r12 = r4 == 1537 ? 0 : 1;
            if (r4 == 1282) {
                if (submessageId != 1) {
                    return;
                }
                e(b(gnssNavigationMessage));
                submessageId = this.m;
            }
            int r5 = submessageId - r12;
            if (r5 >= this.g.size()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (byte b : data) {
                if (z) {
                    z = false;
                } else {
                    sb.append(AbstractJsonLexerKt.COMMA);
                }
                sb.append((int) b);
            }
            this.g.set(r5, sb.toString());
            if (type == 1281 || type == 1282) {
                this.h.add(Integer.valueOf(r5));
            }
            if (this.f == 1537) {
                a(a(gnssNavigationMessage));
            }
            a();
            this.d = j;
        }

        private void a(String str) {
            StringBuilder sbAppend;
            int r2;
            char cCharAt = str.charAt(0);
            char cCharAt2 = str.charAt(120);
            if (cCharAt == '1' && cCharAt2 == '0') {
                sbAppend = new StringBuilder().append(str.substring(2, 18));
                r2 = 234;
            } else {
                if (cCharAt != '0' || cCharAt2 != '1') {
                    return;
                }
                sbAppend = new StringBuilder().append(str.substring(2, 114));
                r2 = 138;
            }
            String string = sbAppend.append(str.substring(122, r2)).toString();
            int r0 = Integer.parseInt(string.substring(0, 6), 2);
            if (r0 == 0) {
                b(string);
            } else if (r0 == 1) {
                c(string);
            } else if (r0 == 4) {
                d(string);
            }
        }

        private String b(GnssNavigationMessage gnssNavigationMessage) {
            StringBuilder sb = new StringBuilder();
            byte[] data = gnssNavigationMessage.getData();
            int length = data.length;
            for (int r2 = 0; r2 < length; r2++) {
                String strReplace = String.format("%8s", Integer.toBinaryString(data[r2] & 255)).replace(' ', '0');
                if (r2 % 4 == 0) {
                    strReplace = strReplace.substring(2, 8);
                }
                sb.append(strReplace);
            }
            return sb.toString();
        }

        private void b(String str) {
            this.i = Integer.parseInt(str.substring(96, 108), 2);
            this.j = Long.parseLong(str.substring(108, 128), 2);
        }

        private boolean b() {
            if (this.h == null) {
                return false;
            }
            for (int r0 = 0; r0 < this.h.size(); r0++) {
                if (this.h.get(r0).intValue() != r0) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            StringBuilder sb = new StringBuilder();
            if (!this.c) {
                return sb.toString();
            }
            if (this.f == 1537) {
                d();
            }
            sb.append(this.o.f7587a);
            sb.append('|');
            boolean z = true;
            for (int r3 = 0; r3 < this.g.size(); r3++) {
                if (z) {
                    z = false;
                } else {
                    sb.append(AbstractJsonLexerKt.COMMA);
                }
                sb.append(this.g.get(r3));
            }
            this.b = true;
            return sb.toString();
        }

        private void c(String str) {
            this.k = Long.parseLong(str.substring(16, 30), 2) * 60.0d;
        }

        private void d() {
            int r0;
            b bVarA = a(this.i, this.j);
            b bVarA2 = a(this.i, this.k);
            double d = (((double) (bVarA2.f7587a - bVarA.f7587a)) + bVarA2.b) - bVarA.b;
            if (d <= 302400.0d) {
                if (d < -302400.0d) {
                    r0 = this.i + 1;
                }
                this.o = a(this.i, this.l);
                this.n = this.i + 1024;
            }
            r0 = this.i - 1;
            this.i = r0;
            this.o = a(this.i, this.l);
            this.n = this.i + 1024;
        }

        private void d(String str) {
            this.l = Long.parseLong(str.substring(54, 68), 2) * 60;
        }

        private void e(String str) {
            this.m = Integer.parseInt(str.substring(42, 46), 2);
        }
    }

    public static t a() {
        return a.f7586a;
    }

    public void a(GnssNavigationMessage gnssNavigationMessage, long j) {
        String str;
        HashMap<String, c> map;
        int svid = gnssNavigationMessage.getSvid();
        int type = gnssNavigationMessage.getType();
        if (type == 257) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        } else if (type == 769) {
            str = TokenNames.R;
        } else if (type == 1537) {
            str = "E";
        } else if (type != 1281) {
            str = type != 1282 ? "none" : BandWidth.CT;
        } else {
            str = "CO";
        }
        String str2 = str + svid;
        if (str2.contains("none") || (map = this.b) == null) {
            return;
        }
        if (!map.containsKey(str2)) {
            this.b.put(str2, new c(svid, type));
        }
        this.b.get(str2).a(gnssNavigationMessage, j);
    }

    public ArrayList<String> b() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, c> entry : this.b.entrySet()) {
            String key = entry.getKey();
            String strC = entry.getValue().c();
            if (strC != null && strC.length() != 0) {
                if (this.c.containsKey(key)) {
                    if (strC.substring(0, 100).equals(this.c.get(key).substring(0, 100))) {
                    }
                } else {
                    this.c.put(key, strC);
                }
                arrayList.add(key + '|' + strC);
            }
        }
        return arrayList;
    }
}
