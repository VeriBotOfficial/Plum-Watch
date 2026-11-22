package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.gov.nist.javax.sip.ListeningPointExt;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.javax.sdp.BandWidth;
import android.os.Handler;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.parser.JSONLexer;
import com.autonavi.aps.amapapi.utils.ReportUtil;
import com.baidu.ar.auth.FeatureCodes;
import com.baidu.ar.base.MsgField;
import com.facebook.imageutils.JfifUtil;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.common.base.Ascii;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.wakeup.common.DeviceFeatures;
import com.yandex.mobile.ads.impl.ed1;
import com.yandex.mobile.ads.impl.wi;
import io.livekit.android.room.track.screencapture.ScreenCaptureService;
import java.util.HashMap;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
public final class jz implements wi, d72 {
    public static final kk0<Long> n = kk0.a(4800000L, 3100000L, 2100000L, 1500000L, 800000L);
    public static final kk0<Long> o = kk0.a(1500000L, 1000000L, 730000L, 440000L, 170000L);
    public static final kk0<Long> p = kk0.a(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: q, reason: collision with root package name */
    public static final kk0<Long> f15969q = kk0.a(3000000L, 1900000L, 1400000L, 1000000L, 660000L);
    public static final kk0<Long> r = kk0.a(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);
    public static final kk0<Long> s = kk0.a(2800000L, 2400000L, 1600000L, 1100000L, 950000L);
    private static jz t;

    /* renamed from: a, reason: collision with root package name */
    private final lk0<Integer, Long> f15970a;
    private final wi.a.C0986a b = new wi.a.C0986a();
    private final h02 c;
    private final jp d;
    private final boolean e;
    private int f;
    private long g;
    private long h;
    private int i;
    private long j;
    private long k;
    private long l;
    private long m;

    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static HashMap a(String str) {
            int[] a2 = jz.a(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            kk0<Long> kk0Var = jz.n;
            hashMap.put(2, kk0Var.get(a2[0]));
            hashMap.put(3, jz.o.get(a2[1]));
            hashMap.put(4, jz.p.get(a2[2]));
            hashMap.put(5, jz.f15969q.get(a2[3]));
            hashMap.put(10, jz.r.get(a2[4]));
            hashMap.put(9, jz.s.get(a2[5]));
            hashMap.put(7, kk0Var.get(a2[0]));
            return hashMap;
        }
    }

    @Override // com.yandex.mobile.ads.impl.wi
    public final jz a() {
        return this;
    }

    private jz(Context context, HashMap hashMap, int i, y32 y32Var, boolean z) {
        this.f15970a = lk0.a(hashMap);
        this.c = new h02(i);
        this.d = y32Var;
        this.e = z;
        if (context == null) {
            this.i = 0;
            this.l = a(0);
            return;
        }
        ed1 a2 = ed1.a(context);
        int a3 = a2.a();
        this.i = a3;
        this.l = a(a3);
        a2.b(new ed1.b() { // from class: com.yandex.mobile.ads.impl.jz$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.ed1.b
            public final void a(int i2) {
                jz.this.b(i2);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.wi
    public final void a(Handler handler, ed edVar) {
        edVar.getClass();
        this.b.a(handler, edVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(int i) {
        int i2 = this.i;
        if (i2 == 0 || this.e) {
            if (i2 == i) {
                return;
            }
            this.i = i;
            if (i != 1 && i != 0 && i != 8) {
                this.l = a(i);
                long b = this.d.b();
                int i3 = this.f > 0 ? (int) (b - this.g) : 0;
                long j = this.h;
                long j2 = this.l;
                if (i3 != 0 || j != 0 || j2 != this.m) {
                    this.m = j2;
                    this.b.a(i3, j, j2);
                }
                this.g = b;
                this.h = 0L;
                this.k = 0L;
                this.j = 0L;
                this.c.b();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.d72
    public final synchronized void b(xv xvVar, boolean z) {
        if (z) {
            if ((xvVar.i & 8) != 8) {
                if (this.f == 0) {
                    this.g = this.d.b();
                }
                this.f++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] a(String str) {
        str.getClass();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case TokenTypes.CONTENT_ENCODING /* 2083 */:
                if (str.equals("AD")) {
                    c = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c = 1;
                    break;
                }
                break;
            case TokenTypes.SUBJECT /* 2085 */:
                if (str.equals("AF")) {
                    c = 2;
                    break;
                }
                break;
            case TokenTypes.CONTENT_TYPE /* 2086 */:
                if (str.equals("AG")) {
                    c = 3;
                    break;
                }
                break;
            case TokenTypes.CALL_ID /* 2088 */:
                if (str.equals("AI")) {
                    c = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c = 5;
                    break;
                }
                break;
            case TokenTypes.RECORD_ROUTE /* 2092 */:
                if (str.equals("AM")) {
                    c = 6;
                    break;
                }
                break;
            case TokenTypes.CSEQ /* 2094 */:
                if (str.equals("AO")) {
                    c = 7;
                    break;
                }
                break;
            case TokenTypes.WWW_AUTHENTICATE /* 2096 */:
                if (str.equals("AQ")) {
                    c = '\b';
                    break;
                }
                break;
            case TokenTypes.RESPONSE_KEY /* 2097 */:
                if (str.equals("AR")) {
                    c = '\t';
                    break;
                }
                break;
            case TokenTypes.HIDE /* 2098 */:
                if (str.equals(BandWidth.AS)) {
                    c = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c = '\f';
                    break;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    c = '\r';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c = 15;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c = 16;
                    break;
                }
                break;
            case TokenTypes.AUTHENTICATION_INFO /* 2112 */:
                if (str.equals("BB")) {
                    c = 17;
                    break;
                }
                break;
            case TokenTypes.REFER_TO /* 2114 */:
                if (str.equals("BD")) {
                    c = 18;
                    break;
                }
                break;
            case TokenTypes.PUBLISH /* 2115 */:
                if (str.equals("BE")) {
                    c = 19;
                    break;
                }
                break;
            case TokenTypes.SIP_ETAG /* 2116 */:
                if (str.equals("BF")) {
                    c = 20;
                    break;
                }
                break;
            case TokenTypes.SIP_IF_MATCH /* 2117 */:
                if (str.equals("BG")) {
                    c = 21;
                    break;
                }
                break;
            case TokenTypes.MESSAGE /* 2118 */:
                if (str.equals("BH")) {
                    c = 22;
                    break;
                }
                break;
            case TokenTypes.PATH /* 2119 */:
                if (str.equals("BI")) {
                    c = 23;
                    break;
                }
                break;
            case TokenTypes.SERVICE_ROUTE /* 2120 */:
                if (str.equals("BJ")) {
                    c = 24;
                    break;
                }
                break;
            case TokenTypes.P_PREFERRED_IDENTITY /* 2122 */:
                if (str.equals("BL")) {
                    c = 25;
                    break;
                }
                break;
            case TokenTypes.P_VISITED_NETWORK_ID /* 2123 */:
                if (str.equals("BM")) {
                    c = JSONLexer.EOI;
                    break;
                }
                break;
            case TokenTypes.P_CHARGING_FUNCTION_ADDRESSES /* 2124 */:
                if (str.equals("BN")) {
                    c = 27;
                    break;
                }
                break;
            case TokenTypes.P_VECTOR_CHARGING /* 2125 */:
                if (str.equals("BO")) {
                    c = 28;
                    break;
                }
                break;
            case TokenTypes.P_ACCESS_NETWORK_INFO /* 2127 */:
                if (str.equals("BQ")) {
                    c = 29;
                    break;
                }
                break;
            case TokenTypes.P_ASSOCIATED_URI /* 2129 */:
                if (str.equals("BS")) {
                    c = 30;
                    break;
                }
                break;
            case TokenTypes.P_MEDIA_AUTHORIZATION /* 2130 */:
                if (str.equals("BT")) {
                    c = 31;
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c = ' ';
                    break;
                }
                break;
            case TokenTypes.REPLACES_TO /* 2135 */:
                if (str.equals("BY")) {
                    c = '!';
                    break;
                }
                break;
            case TokenTypes.SIPS /* 2136 */:
                if (str.equals("BZ")) {
                    c = '\"';
                    break;
                }
                break;
            case TokenTypes.P_PROFILE_KEY /* 2142 */:
                if (str.equals("CA")) {
                    c = '#';
                    break;
                }
                break;
            case TokenTypes.P_ASSERTED_SERVICE /* 2145 */:
                if (str.equals("CD")) {
                    c = Typography.dollar;
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c = '%';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c = Typography.amp;
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c = '\'';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c = '(';
                    break;
                }
                break;
            case ReportUtil.EXCEPTION_CODE_MOCKGPSLOC /* 2152 */:
                if (str.equals("CK")) {
                    c = ')';
                    break;
                }
                break;
            case ReportUtil.EXCEPTION_CODE_UNSUPPORTCOARSELBSLOC /* 2153 */:
                if (str.equals("CL")) {
                    c = '*';
                    break;
                }
                break;
            case ReportUtil.EXCEPTION_CODE_UNSUPPORTCONTINUELOC /* 2154 */:
                if (str.equals("CM")) {
                    c = '+';
                    break;
                }
                break;
            case ReportUtil.EXCEPTION_CODE_GPSORNLPUNABLE /* 2155 */:
                if (str.equals("CN")) {
                    c = AbstractJsonLexerKt.COMMA;
                    break;
                }
                break;
            case ReportUtil.EXCEPTION_CODE_FUSION_LOC_FAIL /* 2156 */:
                if (str.equals("CO")) {
                    c = '-';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c = '.';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c = '/';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c = '0';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c = '1';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c = '2';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c = '3';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c = '4';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c = '5';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c = '6';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c = '7';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c = '8';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c = '9';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c = AbstractJsonLexerKt.COLON;
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c = ';';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c = Typography.less;
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c = com.alipay.sdk.m.p.a.h;
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c = Typography.greater;
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c = '?';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c = '@';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c = 'A';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c = 'B';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c = 'C';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c = 'D';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c = 'E';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c = 'F';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c = 'G';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c = 'H';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c = 'I';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c = 'J';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c = 'K';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c = Matrix.MATRIX_TYPE_RANDOM_LT;
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c = 'M';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c = 'N';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c = 'O';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c = 'P';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c = 'Q';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c = Matrix.MATRIX_TYPE_RANDOM_REGULAR;
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c = 'S';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c = 'T';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c = Matrix.MATRIX_TYPE_RANDOM_UT;
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c = 'V';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c = 'W';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c = 'X';
                    break;
                }
                break;
            case 2307:
                if (str.equals(com.anythink.expressad.video.dynview.a.a.ab)) {
                    c = 'Y';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c = Matrix.MATRIX_TYPE_ZERO;
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c = AbstractJsonLexerKt.BEGIN_LIST;
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c = AbstractJsonLexerKt.STRING_ESC;
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c = AbstractJsonLexerKt.END_LIST;
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c = '^';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c = '_';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c = '`';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c = 'a';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c = 'b';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c = 'c';
                    break;
                }
                break;
            case ScreenCaptureService.DEFAULT_NOTIFICATION_ID /* 2345 */:
                if (str.equals("IR")) {
                    c = 'd';
                    break;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    c = 'e';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c = 'f';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c = 'g';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c = 'h';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c = 'i';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c = 'j';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c = 'k';
                    break;
                }
                break;
            case 2396:
                if (str.equals(ExpandedProductParsedResult.KILOGRAM)) {
                    c = 'l';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c = 'm';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c = 'n';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c = 'o';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c = 'p';
                    break;
                }
                break;
            case 2405:
                if (str.equals("KP")) {
                    c = 'q';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c = 'r';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c = 's';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c = 't';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c = AbstractJsonLexerKt.UNICODE_ESC;
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c = 'v';
                    break;
                }
                break;
            case 2422:
                if (str.equals(ExpandedProductParsedResult.POUND)) {
                    c = 'w';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c = 'x';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c = 'y';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c = 'z';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c = AbstractJsonLexerKt.BEGIN_OBJ;
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c = '|';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c = AbstractJsonLexerKt.END_OBJ;
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c = '~';
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c = Ascii.MAX;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c = 128;
                    break;
                }
                break;
            case 2452:
                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                    c = 129;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c = 130;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c = 131;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c = 132;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c = 133;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c = 134;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c = 135;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c = 136;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c = 137;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c = 138;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c = 139;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c = 140;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c = 141;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c = 142;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c = 143;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c = 144;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c = 145;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c = 146;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c = 147;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c = 148;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c = 149;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c = 150;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c = 151;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c = 152;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c = 153;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c = 154;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c = 155;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c = 156;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c = 157;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c = 158;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c = 159;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c = Typography.nbsp;
                    break;
                }
                break;
            case MsgField.MSG_ON_DEVICE_IR_RESULT /* 2503 */:
                if (str.equals("NU")) {
                    c = 161;
                    break;
                }
                break;
            case MsgField.MSG_VOLUME_CLOSE /* 2508 */:
                if (str.equals("NZ")) {
                    c = Typography.cent;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c = Typography.pound;
                    break;
                }
                break;
            case 2545:
                if (str.equals(com.anythink.core.common.h.ad.A)) {
                    c = 164;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c = 165;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c = 166;
                    break;
                }
                break;
            case 2551:
                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                    c = Typography.section;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c = 168;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c = Typography.copyright;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c = 170;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c = 171;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c = 172;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c = 173;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c = Typography.registered;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c = 175;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c = Typography.degree;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c = Typography.plusMinus;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c = 178;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c = 179;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c = 180;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c = 181;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c = Typography.paragraph;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c = Typography.middleDot;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c = 184;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c = 185;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c = 186;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c = 187;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c = 188;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c = Typography.half;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c = 190;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c = 191;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c = 192;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c = 193;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c = 194;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c = 195;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c = 196;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c = 197;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c = 198;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c = 199;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c = 200;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c = 201;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c = 202;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c = 203;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c = 204;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c = 205;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c = 206;
                    break;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    c = 207;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c = 208;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c = 209;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c = 210;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c = 211;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c = 212;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c = 213;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c = 214;
                    break;
                }
                break;
            case 2691:
                if (str.equals(com.anythink.expressad.video.dynview.a.a.aa)) {
                    c = Typography.times;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c = 216;
                    break;
                }
                break;
            case FeatureCodes.DIGITAL /* 2700 */:
                if (str.equals("UA")) {
                    c = 217;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c = 218;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c = 219;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c = 220;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c = 221;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c = 222;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c = 223;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c = 224;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c = 225;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c = 226;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c = 227;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c = 228;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c = 229;
                    break;
                }
                break;
            case 2780:
                if (str.equals(ListeningPointExt.WS)) {
                    c = 230;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c = 231;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c = 232;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c = 233;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c = 234;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c = 235;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c = 236;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 26:
            case 29:
            case 'I':
            case 'O':
            case 'p':
            case 't':
            case 'x':
            case NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY /* 223 */:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 4, 0};
            case 2:
            case 'P':
                return new int[]{4, 3, 3, 4, 2, 2};
            case 3:
                return new int[]{2, 4, 1, 2, 2, 2};
            case 4:
                return new int[]{0, 2, 0, 3, 2, 2};
            case 5:
            case NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS /* 231 */:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 3, 2, 2, 2};
            case '\b':
            case '>':
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
            case 'l':
            case 210:
            case 220:
                return new int[]{2, 1, 1, 1, 2, 2};
            case '\n':
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
                return new int[]{1, 0, 1, 1, 0, 0};
            case '\f':
                return new int[]{0, 1, 1, 1, 2, 0};
            case '\r':
                return new int[]{1, 3, 4, 4, 2, 2};
            case 14:
            case 'y':
            case 144:
            case DeviceFeatures.AI_AUDIO_SEARCH /* 171 */:
            case 192:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 'K':
            case 128:
            case 169:
            case DeviceFeatures.SLEEP_APNEA /* 194 */:
            case 211:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 16:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 17:
            case '8':
            case 'E':
            case 'N':
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case 21:
            case 145:
            case 190:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 1, 3, 4, 2};
            case 23:
            case '[':
            case 'o':
            case 134:
            case 154:
            case Opcodes.INVOKEINTERFACE /* 185 */:
            case 203:
            case 224:
            case DeviceFeatures.HEADSET_KEY_CALL /* 232 */:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 3, 3, 2, 2};
            case 25:
            case '2':
            case 222:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 27:
            case '1':
                return new int[]{2, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 30:
                return new int[]{4, 4, 2, 2, 2, 2};
            case 31:
                return new int[]{3, 1, 3, 2, 2, 2};
            case ' ':
                return new int[]{3, 2, 1, 0, 2, 2};
            case '!':
                return new int[]{0, 1, 2, 3, 2, 2};
            case '\"':
                return new int[]{2, 4, 2, 1, 2, 2};
            case '#':
                return new int[]{0, 2, 2, 2, 3, 2};
            case '$':
                return new int[]{4, 2, 3, 2, 2, 2};
            case '%':
            case 'n':
                return new int[]{4, 2, 4, 2, 2, 2};
            case '&':
            case '=':
            case 'W':
                return new int[]{3, 4, 3, 3, 2, 2};
            case '\'':
                return new int[]{0, 0, 0, 1, 0, 2};
            case '(':
            case ':':
            case '{':
                return new int[]{3, 4, 4, 4, 2, 2};
            case ')':
            case Opcodes.IF_ACMPNE /* 166 */:
                return new int[]{2, 2, 2, 1, 2, 2};
            case '*':
            case '_':
                return new int[]{1, 2, 2, 2, 3, 2};
            case '+':
                return new int[]{3, 3, 3, 3, 2, 2};
            case ',':
                return new int[]{2, 0, 1, 1, 3, 2};
            case '-':
                return new int[]{2, 3, 4, 3, 2, 2};
            case '.':
                return new int[]{2, 3, 4, 4, 2, 2};
            case '/':
            case '6':
            case 200:
            case 206:
            case 208:
                return new int[]{4, 3, 4, 4, 2, 2};
            case '0':
                return new int[]{2, 1, 0, 0, 2, 2};
            case '3':
            case 's':
                return new int[]{1, 0, 0, 0, 0, 2};
            case '4':
            case 158:
                return new int[]{0, 0, 2, 0, 1, 2};
            case '5':
                return new int[]{0, 1, 2, 2, 2, 3};
            case '7':
                return new int[]{0, 0, 3, 2, 0, 2};
            case '9':
                return new int[]{3, 4, 4, 4, 4, 2};
            case ';':
                return new int[]{2, 3, 2, 1, 2, 2};
            case '<':
            case 'e':
            case 127:
            case 174:
            case DeviceFeatures.CONFIG_SLEEP /* 186 */:
            case 215:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '?':
            case '^':
                return new int[]{0, 1, 1, 1, 2, 2};
            case '@':
                return new int[]{4, 3, 3, 1, 2, 2};
            case 'A':
                return new int[]{0, 0, 0, 3, 0, 2};
            case 'B':
                return new int[]{3, 1, 2, 2, 2, 2};
            case 'C':
            case 'k':
            case 'q':
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'D':
                return new int[]{4, 2, 4, 1, 2, 2};
            case 'F':
                return new int[]{1, 2, 3, 1, 0, 2};
            case 'G':
            case 204:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 'H':
                return new int[]{0, 0, 1, 1, 1, 1};
            case 'J':
                return new int[]{1, 1, 1, 2, 2, 2};
            case 'L':
            case 226:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'M':
            case 152:
            case 228:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 'Q':
                return new int[]{4, 3, 4, 2, 2, 2};
            case 'R':
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 'S':
                return new int[]{4, 2, 1, 4, 2, 2};
            case 'T':
            case 'Z':
            case 189:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 'U':
                return new int[]{2, 3, 2, 2, 2, 2};
            case 'V':
            case 165:
                return new int[]{1, 2, 4, 4, 4, 2};
            case 'X':
                return new int[]{3, 2, 2, 1, 2, 2};
            case 'Y':
                return new int[]{0, 1, 2, 3, 2, 0};
            case '\\':
                return new int[]{0, 0, 0, 1, 3, 2};
            case ']':
                return new int[]{3, 1, 2, 2, 3, 2};
            case '`':
            case JfifUtil.MARKER_EOI /* 217 */:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 'a':
                return new int[]{1, 1, 3, 2, 3, 3};
            case 'b':
            case 135:
            case 214:
            case 229:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 'c':
                return new int[]{3, 2, 2, 3, 2, 2};
            case 'd':
                return new int[]{3, 0, 1, 1, 4, 1};
            case 'f':
                return new int[]{0, 0, 0, 1, 1, 2};
            case 'g':
            case 233:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 'h':
                return new int[]{2, 4, 3, 2, 2, 2};
            case 'i':
                return new int[]{2, 1, 1, 2, 2, 2};
            case 'j':
                return new int[]{0, 1, 1, 2, 2, 4};
            case 'm':
                return new int[]{2, 1, 4, 2, 2, 2};
            case 'r':
                return new int[]{0, 1, 1, 3, 4, 4};
            case 'u':
                return new int[]{2, 1, 2, 2, 2, 2};
            case 'v':
                return new int[]{1, 2, 1, 3, 2, 2};
            case 'w':
                return new int[]{3, 3, 2, 4, 2, 2};
            case 'z':
                return new int[]{3, 1, 3, 3, 4, 2};
            case '|':
                return new int[]{3, 3, 2, 2, 2, 2};
            case '}':
                return new int[]{0, 0, 0, 0, 2, 2};
            case '~':
                return new int[]{1, 0, 3, 2, 1, 4};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 130:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 131:
            case DeviceFeatures.MAP_MODE /* 179 */:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 2, 2};
            case 133:
            case 177:
                return new int[]{1, 2, 1, 2, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 137:
            case 167:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 138:
                return new int[]{2, 4, 2, 3, 2, 2};
            case 139:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 140:
            case 141:
                return new int[]{0, 2, 4, 4, 2, 2};
            case 143:
            case TelnetCommand.EOF /* 236 */:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 146:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 147:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 148:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 149:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 150:
                return new int[]{1, 0, 3, 1, 3, 2};
            case 151:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 153:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 155:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 156:
            case DeviceFeatures.CAMERA_PREVIEW /* 164 */:
            case 198:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 157:
                return new int[]{0, 2, 2, 3, 0, 3};
            case 159:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 160:
            case 161:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 162:
            case 170:
                return new int[]{1, 1, 2, 2, 4, 2};
            case 163:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 168:
                return new int[]{2, 1, 3, 3, 3, 0};
            case 172:
                return new int[]{2, 0, 2, 1, 2, 1};
            case DeviceFeatures.E_BOOK /* 173 */:
                return new int[]{3, 4, 1, 2, 2, 2};
            case DeviceFeatures.AUDIO_MEMORANDUM /* 175 */:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 176:
                return new int[]{2, 4, 4, 4, 4, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case 180:
                return new int[]{1, 0, 0, 0, 4, 3};
            case 181:
                return new int[]{3, 4, 2, 0, 2, 2};
            case 182:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 183:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 184:
            case 209:
                return new int[]{4, 2, 1, 1, 2, 2};
            case 187:
                return new int[]{1, 1, 2, 2, 2, 1};
            case DeviceFeatures.DIAL_THUMB /* 191 */:
            case JfifUtil.MARKER_SOS /* 218 */:
                return new int[]{3, 3, 4, 3, 2, 2};
            case 193:
                return new int[]{4, 4, 4, 3, 2, 2};
            case 195:
                return new int[]{2, 4, 3, 0, 2, 2};
            case DeviceFeatures.DEVICE_SOUND_NEW /* 196 */:
                return new int[]{4, 3, 2, 3, 2, 2};
            case DeviceFeatures.NETWORK_SHARE /* 197 */:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 199:
            case 202:
                return new int[]{1, 2, 1, 0, 2, 2};
            case 201:
                return new int[]{3, 3, 3, 4, 2, 2};
            case 205:
                return new int[]{0, 2, 2, 3, 3, 4};
            case 207:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 212:
                return new int[]{1, 1, 0, 0, 2, 2};
            case FTPReply.FILE_STATUS /* 213 */:
                return new int[]{1, 4, 1, 3, 2, 2};
            case JfifUtil.MARKER_SOI /* 216 */:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 219:
                return new int[]{1, 0, 2, 2, 3, 1};
            case 221:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 225:
                return new int[]{2, 2, 1, 1, 2, 2};
            case FTPReply.ENTERING_PASSIVE_MODE /* 227 */:
                return new int[]{0, 3, 3, 4, 2, 2};
            case 230:
                return new int[]{3, 1, 3, 1, 2, 2};
            case 234:
                return new int[]{3, 2, 2, 1, 1, 2};
            case 235:
                return new int[]{3, 3, 4, 2, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long a(int i) {
        Long l = this.f15970a.get(Integer.valueOf(i));
        if (l == null) {
            l = this.f15970a.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    @Override // com.yandex.mobile.ads.impl.d72
    public final synchronized void a(xv xvVar, boolean z, int i) {
        if (z) {
            if ((xvVar.i & 8) != 8) {
                this.h += i;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.d72
    public final synchronized void a(xv xvVar, boolean z) {
        if (z) {
            if ((xvVar.i & 8) != 8) {
                if (this.f > 0) {
                    long b = this.d.b();
                    int i = (int) (b - this.g);
                    this.j += i;
                    long j = this.k;
                    long j2 = this.h;
                    this.k = j + j2;
                    if (i > 0) {
                        this.c.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                        if (this.j >= 2000 || this.k >= 524288) {
                            this.l = (long) this.c.a();
                        }
                        long j3 = this.h;
                        long j4 = this.l;
                        if (i != 0 || j3 != 0 || j4 != this.m) {
                            this.m = j4;
                            this.b.a(i, j3, j4);
                        }
                        this.g = b;
                        this.h = 0L;
                    }
                    this.f--;
                    return;
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.wi
    public final void a(ed edVar) {
        this.b.a(edVar);
    }

    public static synchronized jz a(Context context) {
        jz jzVar;
        synchronized (jz.class) {
            if (t == null) {
                t = new jz(context == null ? null : context.getApplicationContext(), a.a(f92.b(context)), 2000, jp.f15936a, true);
            }
            jzVar = t;
        }
        return jzVar;
    }
}
