package com.anythink.basead.l.c;

import org.xmlpull.v1.XmlPullParser;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes11.dex */
public final class ak extends ay {

    /* renamed from: a, reason: collision with root package name */
    private String f2850a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;

    public ak(XmlPullParser xmlPullParser) {
        this.f2850a = xmlPullParser.getAttributeValue(null, "id");
        this.c = xmlPullParser.getAttributeValue(null, "delivery");
        this.d = xmlPullParser.getAttributeValue(null, "type");
        this.e = xmlPullParser.getAttributeValue(null, IjkMediaMeta.IJKM_KEY_BITRATE);
        this.f = xmlPullParser.getAttributeValue(null, "minBitrate");
        this.g = xmlPullParser.getAttributeValue(null, "maxBitrate");
        this.h = xmlPullParser.getAttributeValue(null, "width");
        this.i = xmlPullParser.getAttributeValue(null, "height");
        this.j = xmlPullParser.getAttributeValue(null, "xPosition");
        this.k = xmlPullParser.getAttributeValue(null, "yPosition");
        this.l = xmlPullParser.getAttributeValue(null, "duration");
        this.m = xmlPullParser.getAttributeValue(null, "offset");
        this.n = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.b = a(xmlPullParser);
    }

    private String e() {
        return this.f2850a;
    }

    public final String a() {
        return this.b;
    }

    private String f() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    private String g() {
        return this.e;
    }

    private String h() {
        return this.f;
    }

    private String i() {
        return this.g;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.i;
    }

    private String j() {
        return this.j;
    }

    private String k() {
        return this.k;
    }

    private String l() {
        return this.l;
    }

    private String m() {
        return this.m;
    }

    private String n() {
        return this.n;
    }
}
