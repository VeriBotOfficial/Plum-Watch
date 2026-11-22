package com.mbridge.msdk.foundation.error;

import android.text.TextUtils;
import android.util.SparseArray;

/* compiled from: FailureInfo.java */
/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<String> f11544a;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f11544a = sparseArray;
        sparseArray.put(com.anythink.expressad.foundation.e.b.v, "exception when request");
        sparseArray.put(com.anythink.expressad.foundation.e.b.b, "v3 params invalid");
        sparseArray.put(com.anythink.expressad.foundation.e.b.c, "v3 request error");
        sparseArray.put(com.anythink.expressad.foundation.e.b.d, "v3 response error");
        sparseArray.put(com.anythink.expressad.foundation.e.b.e, "video download error");
        sparseArray.put(com.anythink.expressad.foundation.e.b.f, "big template download error");
        sparseArray.put(com.anythink.expressad.foundation.e.b.g, "template download error");
        sparseArray.put(com.anythink.expressad.foundation.e.b.h, "endcard template download error");
        sparseArray.put(com.anythink.expressad.foundation.e.b.M, "image download error");
        sparseArray.put(com.anythink.expressad.foundation.e.b.i, "big template render error");
        sparseArray.put(com.anythink.expressad.foundation.e.b.j, "template render error");
        sparseArray.put(com.anythink.expressad.foundation.e.b.k, "load time out error");
        sparseArray.put(com.anythink.expressad.foundation.e.b.l, "render half img fail");
        sparseArray.put(com.anythink.expressad.foundation.e.b.m, "write marid fail");
        sparseArray.put(com.anythink.expressad.foundation.e.b.n, "download js file fail");
        sparseArray.put(com.anythink.expressad.foundation.e.b.o, "isready false error");
        sparseArray.put(com.anythink.expressad.foundation.e.b.p, "current unit is loading");
        sparseArray.put(com.anythink.expressad.foundation.e.b.f4813q, "adn no offer fill");
        sparseArray.put(com.anythink.expressad.foundation.e.b.r, "local return empty");
        sparseArray.put(com.anythink.expressad.foundation.e.b.u, "app already install");
        sparseArray.put(com.anythink.expressad.foundation.e.b.s, "ad over cap");
        sparseArray.put(com.anythink.expressad.foundation.e.b.t, "load exception");
        sparseArray.put(com.anythink.expressad.foundation.e.b.w, "v3 time out");
        sparseArray.put(com.anythink.expressad.foundation.e.b.x, "unknown error");
        sparseArray.put(com.anythink.expressad.foundation.e.b.y, com.anythink.expressad.foundation.g.b.b.f4836a);
        sparseArray.put(com.anythink.expressad.foundation.e.b.z, "auto refresh fail because unitId status is pause or stop");
        sparseArray.put(com.anythink.expressad.foundation.e.b.A, "download resource fail");
        sparseArray.put(com.anythink.expressad.foundation.e.b.f4811a, "has exception happen : ");
        sparseArray.put(com.anythink.expressad.foundation.e.b.B, "view width or height is 0 or view size is too small");
        sparseArray.put(com.anythink.expressad.foundation.e.b.C, "AD display requires webView but current environment not included");
        sparseArray.put(com.anythink.expressad.foundation.e.b.D, "view is null");
        sparseArray.put(com.anythink.expressad.foundation.e.b.E, "webView was destroyed");
        sparseArray.put(com.anythink.expressad.foundation.e.b.F, "unitId is null");
        sparseArray.put(com.anythink.expressad.foundation.e.b.G, "campaign is filtered");
        sparseArray.put(com.anythink.expressad.foundation.e.b.H, "render dynamic view fail");
        sparseArray.put(com.anythink.expressad.foundation.e.b.I, "bid token is null");
        sparseArray.put(com.anythink.expressad.foundation.e.b.J, "view container is null");
        sparseArray.put(com.anythink.expressad.foundation.e.b.K, "AD parameter setting error");
        sparseArray.put(com.anythink.expressad.foundation.e.b.L, "cb is open");
        sparseArray.put(com.anythink.expressad.foundation.e.b.N, "db restore failed");
        sparseArray.put(com.anythink.expressad.foundation.e.b.O, "network no connection error");
        sparseArray.put(880049, "load second request error");
        sparseArray.put(880042, "Check ad init code because ad init error");
        sparseArray.put(880043, "Ad has error because campaign is null");
        sparseArray.put(880044, "Ad load or show environment error");
        sparseArray.put(880045, "Ad render timeout");
        sparseArray.put(880046, "Ad can not show because view is null");
        sparseArray.put(880047, "Campaign image url is null");
        sparseArray.put(880048, "Ad web resource render fail");
        sparseArray.put(890001, "context or unitid is null");
        sparseArray.put(890002, "load failed");
        sparseArray.put(890003, "show fail : unexpected destroy");
        sparseArray.put(890004, "play error");
        sparseArray.put(890005, "no adapter_model");
        sparseArray.put(890006, "no isReadyCampaign");
        sparseArray.put(890007, "all campaign is loading");
        sparseArray.put(890008, "dynamicBean parse Exception");
        sparseArray.put(890009, "show parse Exception");
        sparseArray.put(890010, "activityPresenter create exception");
        sparseArray.put(890011, "network is exception");
        sparseArray.put(990001, "build Exception");
    }

    public static String a(int i) {
        String str = f11544a.get(i);
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public static int b(int i) {
        if (i == 880023) {
            return 2;
        }
        if (i == 880035) {
            return 0;
        }
        if (i == 880038) {
            return 21;
        }
        if (i == 880048) {
            return 9;
        }
        switch (i) {
            case com.anythink.expressad.foundation.e.b.b /* 880001 */:
                return 0;
            case com.anythink.expressad.foundation.e.b.c /* 880002 */:
                return 1;
            case com.anythink.expressad.foundation.e.b.d /* 880003 */:
                return 3;
            case com.anythink.expressad.foundation.e.b.e /* 880004 */:
                return 4;
            case com.anythink.expressad.foundation.e.b.f /* 880005 */:
                return 5;
            case com.anythink.expressad.foundation.e.b.g /* 880006 */:
                return 6;
            case com.anythink.expressad.foundation.e.b.h /* 880007 */:
                return 7;
            case com.anythink.expressad.foundation.e.b.i /* 880008 */:
                return 8;
            case com.anythink.expressad.foundation.e.b.j /* 880009 */:
                return 9;
            case com.anythink.expressad.foundation.e.b.k /* 880010 */:
                return 10;
            default:
                switch (i) {
                    case com.anythink.expressad.foundation.e.b.l /* 880012 */:
                        return 12;
                    case com.anythink.expressad.foundation.e.b.m /* 880013 */:
                        return 13;
                    case com.anythink.expressad.foundation.e.b.n /* 880014 */:
                        return 14;
                    case com.anythink.expressad.foundation.e.b.o /* 880015 */:
                        return 15;
                    case com.anythink.expressad.foundation.e.b.p /* 880016 */:
                        return 16;
                    case com.anythink.expressad.foundation.e.b.f4813q /* 880017 */:
                        return 17;
                    case com.anythink.expressad.foundation.e.b.r /* 880018 */:
                        return 18;
                    case com.anythink.expressad.foundation.e.b.s /* 880019 */:
                        return 19;
                    case com.anythink.expressad.foundation.e.b.t /* 880020 */:
                        return 20;
                    case com.anythink.expressad.foundation.e.b.u /* 880021 */:
                        return 11;
                    default:
                        return com.anythink.expressad.foundation.e.b.x;
                }
        }
    }

    public static String b(int i, String str) {
        return i + "#" + f11544a.get(i) + "#" + str;
    }

    public static b a(int i, String str) {
        return new b(i, str);
    }
}
