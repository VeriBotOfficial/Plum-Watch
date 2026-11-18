package com.baidu.mapapi.map;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public final class MapBaseIndoorMapInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f7929a;
    String b;
    ArrayList<String> c;

    public enum SwitchFloorError {
        SWITCH_OK,
        FLOOR_INFO_ERROR,
        FLOOR_OVERLFLOW,
        FOCUSED_ID_ERROR,
        SWITCH_ERROR
    }

    public MapBaseIndoorMapInfo() {
    }

    public String getCurFloor() {
        return this.b;
    }

    public ArrayList<String> getFloors() {
        return this.c;
    }

    public String getID() {
        return this.f7929a;
    }

    public MapBaseIndoorMapInfo(String str, String str2, ArrayList<String> arrayList) {
        this.f7929a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public MapBaseIndoorMapInfo(MapBaseIndoorMapInfo mapBaseIndoorMapInfo) {
        this.f7929a = mapBaseIndoorMapInfo.f7929a;
        this.b = mapBaseIndoorMapInfo.b;
        this.c = mapBaseIndoorMapInfo.c;
    }
}
