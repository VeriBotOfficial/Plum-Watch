package com.baidu.mapapi.map.entity;

/* JADX INFO: loaded from: classes15.dex */
public class BackgroundNaviRealTimeInfoEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f8037a;
    private double b;
    private double c;
    private double d;
    private int e;
    private double f;
    private double g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private int o;
    private int p;

    public int getMapLevel() {
        return this.m;
    }

    public int getNaviScene() {
        return this.p;
    }

    public int getNaviType() {
        return this.o;
    }

    public int getRotateAngle() {
        return this.h;
    }

    public int getRouteAngle() {
        return this.i;
    }

    public double getStCurRouteProjectPosX() {
        return this.f;
    }

    public double getStCurRouteProjectPosY() {
        return this.g;
    }

    public double getStCurStartPosX() {
        return this.c;
    }

    public double getStCurStartPosY() {
        return this.d;
    }

    public double getStPosX() {
        return this.f8037a;
    }

    public double getStPosY() {
        return this.b;
    }

    public int getnCurRouteShapeIdx() {
        return this.e;
    }

    public boolean isbGuide() {
        return this.l;
    }

    public boolean isbIsNearOrFarawayStatus() {
        return this.j;
    }

    public boolean isbMatchPosLinkIsUnverified() {
        return this.k;
    }

    public boolean isbRedLine() {
        return this.n;
    }

    public void setMapLevel(int r1) {
        this.m = r1;
    }

    public void setNaviScene(int r1) {
        this.p = r1;
    }

    public void setNaviType(int r1) {
        this.o = r1;
    }

    public void setRotateAngle(int r1) {
        this.h = r1;
    }

    public void setRouteAngle(int r1) {
        this.i = r1;
    }

    public void setStCurRouteProjectPosX(double d) {
        this.f = d;
    }

    public void setStCurRouteProjectPosY(double d) {
        this.g = d;
    }

    public void setStCurStartPosX(double d) {
        this.c = d;
    }

    public void setStCurStartPosY(double d) {
        this.d = d;
    }

    public void setStPosX(double d) {
        this.f8037a = d;
    }

    public void setStPosY(double d) {
        this.b = d;
    }

    public void setbGuide(boolean z) {
        this.l = z;
    }

    public void setbIsNearOrFarawayStatus(boolean z) {
        this.j = z;
    }

    public void setbMatchPosLinkIsUnverified(boolean z) {
        this.k = z;
    }

    public void setbRedLine(boolean z) {
        this.n = z;
    }

    public void setnCurRouteShapeIdx(int r1) {
        this.e = r1;
    }
}
