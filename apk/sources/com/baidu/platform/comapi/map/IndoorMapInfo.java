package com.baidu.platform.comapi.map;

import android.text.TextUtils;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public final class IndoorMapInfo implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8585a;
    private String b;
    private String[] c;
    private int[] d;
    private int e;
    private int f;
    private String g;

    public IndoorMapInfo(String str, String str2) {
        this.f8585a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IndoorMapInfo)) {
            return false;
        }
        IndoorMapInfo indoorMapInfo = (IndoorMapInfo) obj;
        if (TextUtils.equals(this.f8585a, indoorMapInfo.f8585a) && TextUtils.equals(this.b, indoorMapInfo.b) && Arrays.equals(this.c, indoorMapInfo.c)) {
            return Arrays.equals(this.d, indoorMapInfo.d);
        }
        return false;
    }

    public String getBuildingId() {
        return this.f8585a;
    }

    public final int[] getFloorAttribute() {
        return this.d;
    }

    public String getFloorId() {
        return this.b;
    }

    public final String[] getFloorList() {
        return this.c;
    }

    public String getIdrSearch() {
        return this.g;
    }

    public int getIdrguide() {
        return this.f;
    }

    public int getIndoorType() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IndoorMapInfo:building_id:");
        sb.append(this.f8585a);
        sb.append(";floor_id:").append(this.b);
        sb.append(";indoor_type:").append(this.e);
        sb.append(";floor_list:").append(Arrays.toString(this.c));
        sb.append(";floor_attribute:").append(Arrays.toString(this.d));
        return sb.toString();
    }

    public IndoorMapInfo(String str, String str2, String[] strArr, int[] r12, int r13) {
        this(str, str2, strArr, r12, r13, 0, "");
    }

    public IndoorMapInfo(String str, String str2, String[] strArr, int[] r12, int r13, int r14) {
        this(str, str2, strArr, r12, r13, r14, "");
    }

    public IndoorMapInfo(String str, String str2, String[] strArr, int[] r4, int r5, int r6, String str3) {
        this.f8585a = str;
        this.b = str2;
        this.e = r5;
        this.f = r6;
        if (strArr != null) {
            String[] strArr2 = (String[]) Array.newInstance((Class<?>) String.class, strArr.length);
            this.c = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        }
        if (r4 != null) {
            int[] r2 = new int[r4.length];
            this.d = r2;
            System.arraycopy(r4, 0, r2, 0, r4.length);
        }
        this.g = str3;
    }
}
