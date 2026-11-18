package com.baidu.location.h;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class c {
    public static int a(ArrayList<ArrayList<Float>> arrayList) {
        int r1 = 0;
        for (int r0 = 0; r0 < arrayList.size(); r0++) {
            ArrayList<Float> arrayList2 = arrayList.get(r0);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() > 0.0f) {
                r1++;
            }
        }
        return r1;
    }

    public static int b(ArrayList<ArrayList<Float>> arrayList) {
        int r1 = 0;
        for (int r0 = 0; r0 < arrayList.size(); r0++) {
            ArrayList<Float> arrayList2 = arrayList.get(r0);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() >= 15.0f) {
                r1++;
            }
        }
        return r1;
    }

    public static int c(ArrayList<ArrayList<Float>> arrayList) {
        int r1 = 0;
        for (int r0 = 0; r0 < arrayList.size(); r0++) {
            ArrayList<Float> arrayList2 = arrayList.get(r0);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() >= 20.0f) {
                r1++;
            }
        }
        return r1;
    }

    public static int d(ArrayList<ArrayList<Float>> arrayList) {
        float fFloatValue = 0.0f;
        for (int r1 = 0; r1 < arrayList.size(); r1++) {
            ArrayList<Float> arrayList2 = arrayList.get(r1);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() > 0.0f) {
                fFloatValue += arrayList2.get(2).floatValue();
            }
        }
        return Math.round(fFloatValue);
    }

    public static int e(ArrayList<ArrayList<Float>> arrayList) {
        return Math.round(d(arrayList) / a(arrayList));
    }

    public static int f(ArrayList<ArrayList<Float>> arrayList) {
        float fFloatValue = 0.0f;
        for (int r1 = 0; r1 < arrayList.size(); r1++) {
            ArrayList<Float> arrayList2 = arrayList.get(r1);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() > 0.0f) {
                fFloatValue += arrayList2.get(2).floatValue() * arrayList2.get(1).floatValue();
            }
        }
        return Math.round(fFloatValue);
    }

    public static int g(ArrayList<ArrayList<Float>> arrayList) {
        return Math.round(f(arrayList) / a(arrayList));
    }

    public static int h(ArrayList<ArrayList<Float>> arrayList) {
        int r4;
        int[] r0 = new int[37];
        int r1 = 0;
        int r2 = 0;
        while (true) {
            try {
                if (r2 >= arrayList.size()) {
                    break;
                }
                ArrayList<Float> arrayList2 = arrayList.get(r2);
                if (arrayList2 != null && arrayList2.size() > 0 && arrayList2.get(0).floatValue() < 360.0d) {
                    int r3 = (int) Math.ceil(arrayList2.get(0).floatValue() / 10.0f);
                    r0[r3] = r0[r3] + 1;
                }
                r2++;
            } catch (Exception unused) {
                return 0;
            }
        }
        for (r4 = 1; r4 <= 36; r4++) {
            if (r0[r4] > 0) {
                r1++;
            }
        }
        return Math.round((r1 / 36.0f) * 1000.0f);
    }
}
