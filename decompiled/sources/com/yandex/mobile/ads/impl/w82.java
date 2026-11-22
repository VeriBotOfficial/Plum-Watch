package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import androidx.core.net.MailTo;
import com.blankj.utilcode.constant.PermissionConstants;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xmind.core.style.IStyle;

/* loaded from: classes5.dex */
public final class w82 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17229a = new a(0);

    public static final class a {
        @JvmStatic
        public static String a(String url) {
            Object m14057constructorimpl;
            Intrinsics.checkNotNullParameter(url, "url");
            try {
                Result.Companion companion = Result.INSTANCE;
                m14057constructorimpl = Result.m14057constructorimpl(Uri.parse(d(url)).getHost());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m14063isFailureimpl(m14057constructorimpl)) {
                m14057constructorimpl = null;
            }
            return (String) m14057constructorimpl;
        }

        @JvmStatic
        public static boolean b(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(url, "url");
            if (url.length() != 0) {
                String replaceFirst = new Regex("http(s?)://").replaceFirst(url, "");
                for (b bVar : b.values()) {
                    if (StringsKt.startsWith$default(replaceFirst, bVar.a(), false, 2, (Object) null)) {
                        break;
                    }
                }
            }
            return URLUtil.isNetworkUrl(url);
        }

        @JvmStatic
        public static boolean c(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (url.length() == 0) {
                return false;
            }
            String replaceFirst = new Regex("http(s?)://").replaceFirst(url, "");
            b.c.getClass();
            b[] bVarArr = {b.d, b.e, b.f, b.g};
            for (int i = 0; i < 4; i++) {
                if (StringsKt.startsWith$default(replaceFirst, bVarArr[i].a(), false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }

        private static String d(String str) {
            return (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) ? str : "https://" + str;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final a c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        private static final /* synthetic */ b[] h;
        private final String b;

        static {
            b bVar = new b(0, "SMS_SCHEME", "sms:");
            b bVar2 = new b(1, "MAIL_SCHEME", MailTo.MAILTO_SCHEME);
            b bVar3 = new b(2, "VOICE_MAIL_SCHEME", "voicemail:");
            b bVar4 = new b(3, "TEL_SCHEME", "tel:");
            b bVar5 = new b(4, "CALLTO", "callto:");
            b bVar6 = new b(5, "FAX", "fax:");
            b bVar7 = new b(6, "GEO_SCHEME", "geo:");
            b bVar8 = new b(7, "MAP_SCHEME", "map:");
            b bVar9 = new b(8, "MAPS_SCHEME", "maps:");
            b bVar10 = new b(9, "GOOGLE_MARKET_SCHEME", "market:");
            d = bVar10;
            b bVar11 = new b(10, "GOOGLE_PLAY_SCHEME", "play:");
            e = bVar11;
            b bVar12 = new b(11, "GOOGLE_STREET_VIEW_SCHEME", "google.streetview:");
            b bVar13 = new b(12, "GOOGLE_MARKET_HOST", "market.android");
            f = bVar13;
            b bVar14 = new b(13, "GOOGLE_PLAY_HOST", "play.google");
            g = bVar14;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, new b(14, "MAP_HOST", IStyle.MAP), new b(15, "MAPS_HOST", "maps"), new b(16, "YMOBMAPS", "mobile.maps"), new b(17, "YSHORTMOBMAPS", "m.maps"), new b(18, "YOIDMAPS", "maps.yandex.ru"), new b(19, "MESSAGE", "message:"), new b(20, "SIP", "sip:"), new b(21, "SKYPE", "skype:"), new b(22, PermissionConstants.SMS, "sms:"), new b(23, "GTALK", "gtalk:"), new b(24, "SPOTIFY", "spotify:"), new b(25, "LASTFM", "lastfm:"), new b(26, "YSTORE", "yastore:")};
            h = bVarArr;
            EnumEntriesKt.enumEntries(bVarArr);
            c = new a(0);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) h.clone();
        }

        private b(int i, String str, String str2) {
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(int i) {
                this();
            }
        }
    }

    static {
        Pattern.compile("maps.yandex");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r2) {
        /*
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L1c
            java.net.URI r0 = new java.net.URI     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L12
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L10
            goto L12
        L10:
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = kotlin.Result.m14057constructorimpl(r2)     // Catch: java.lang.Throwable -> L1c
            goto L27
        L1c:
            r2 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m14057constructorimpl(r2)
        L27:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = kotlin.Result.m14063isFailureimpl(r2)
            if (r1 == 0) goto L30
            r2 = r0
        L30:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.w82.a(java.lang.String):boolean");
    }
}
