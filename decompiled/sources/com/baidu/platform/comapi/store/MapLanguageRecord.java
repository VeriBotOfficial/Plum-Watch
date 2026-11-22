package com.baidu.platform.comapi.store;

import com.baidu.mapapi.map.MapLanguage;

/* loaded from: classes13.dex */
public class MapLanguageRecord extends a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile MapLanguageRecord f8666a;

    private MapLanguageRecord() {
        super("map_language");
    }

    public static MapLanguageRecord newInstance() {
        if (f8666a != null) {
            return f8666a;
        }
        synchronized (MapLanguageRecord.class) {
            if (f8666a != null) {
                return f8666a;
            }
            f8666a = new MapLanguageRecord();
            return f8666a;
        }
    }

    public void clearMapLanguage() {
        remove();
    }

    public MapLanguage getMapLanguage() {
        MapLanguage mapLanguage = MapLanguage.CHINESE;
        int readInt = readInt(mapLanguage.ordinal());
        if (mapLanguage.ordinal() == readInt) {
            return mapLanguage;
        }
        MapLanguage mapLanguage2 = MapLanguage.ENGLISH;
        if (mapLanguage2.ordinal() == readInt) {
            return mapLanguage2;
        }
        throw new IllegalArgumentException();
    }

    public void setMapLanguage(MapLanguage mapLanguage) {
        if (mapLanguage == null) {
            return;
        }
        writeInt(mapLanguage.ordinal());
    }
}
