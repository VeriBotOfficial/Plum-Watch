package com.baidu.platform.comapi.walknavi.segmentbrowse.widget;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: GuideUtility.java */
/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static int f8821a;

    public static ArrayList<c> a(Bundle bundle, String str) {
        com.baidu.platform.comapi.wnplatform.d.a.a("yang11", "GuideUtility.getGuideText from--->" + str);
        ArrayList<c> a2 = a(bundle, false);
        a2.addAll(a(bundle));
        ArrayList<c> arrayList = new ArrayList<>();
        if (a2.size() > 0) {
            arrayList.add(a2.get(0));
            if (a2.size() >= 2) {
                c cVar = a2.get(1);
                for (int i = 2; i < a2.size(); i++) {
                    cVar = c.a(cVar, a2.get(i));
                }
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public static void a(int i) {
        f8821a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList<c> a(Bundle bundle, boolean z) {
        int i;
        int i2;
        com.baidu.platform.comapi.wnplatform.d.a.a("yang11", "GuideUtility.getGuideLineText--->" + bundle.toString());
        ArrayList<c> arrayList = new ArrayList<>();
        String string = bundle.getString("usGuideText");
        int[] intArray = bundle.getIntArray("unIdx");
        int[] intArray2 = bundle.getIntArray("unWordCnt");
        int[] intArray3 = bundle.getIntArray("unLineNo");
        bundle.getBooleanArray("bHighLight");
        int[] intArray4 = bundle.getIntArray("enWordType");
        if (string.contains(Separators.AT)) {
            string = string.replace(Separators.AT, "...");
        }
        if (intArray.length != 0) {
            HashMap hashMap = new HashMap();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = 1;
                if (i3 >= intArray3.length) {
                    break;
                }
                int i6 = intArray2[i3];
                i5 += i6;
                if (i4 != intArray3[i3]) {
                    hashMap.put(Integer.valueOf(i4), Integer.valueOf(i5 - i6));
                    i4++;
                    i5 = intArray2[i3];
                }
                if (i3 == intArray3.length - 1) {
                    hashMap.put(Integer.valueOf(i4), Integer.valueOf(i5));
                }
                i3++;
            }
            ArrayList arrayList2 = new ArrayList();
            int size = hashMap.size();
            int i7 = 0;
            while (i7 < size) {
                int intValue = ((Integer) hashMap.get(Integer.valueOf(i7))).intValue();
                char[] cArr = new char[intValue];
                int[] iArr = new int[intValue];
                int i8 = 0;
                while (i8 < intValue) {
                    if (i7 <= 0) {
                        i2 = i8;
                    } else if (i7 > i) {
                        i2 = ((Integer) hashMap.get(Integer.valueOf(i7 - 1))).intValue() + i8 + ((Integer) hashMap.get(Integer.valueOf(i7 - 2))).intValue();
                    } else {
                        i2 = ((Integer) hashMap.get(Integer.valueOf(i7 - 1))).intValue() + i8;
                    }
                    if (i2 < string.length()) {
                        cArr[i8] = string.charAt(i2);
                    }
                    int i9 = 0;
                    while (true) {
                        if (i9 >= intArray.length) {
                            break;
                        }
                        if (i9 != intArray.length - i) {
                            int i10 = i9 + 1;
                            if (i2 >= intArray[i10]) {
                                i9 = i10;
                                i = 1;
                            } else if (intArray4 != null) {
                                iArr[i8] = intArray4[i9];
                            }
                        } else if (intArray4 != null) {
                            iArr[i8] = intArray4[i9];
                        }
                    }
                    i8++;
                    i = 1;
                }
                arrayList2.add(new c(cArr, iArr));
                i7++;
                i = 1;
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                arrayList.add(arrayList2.get(i11));
            }
            if (arrayList.size() >= 1 && ((c) arrayList.get(0)).c != null && ((c) arrayList.get(0)).c.length == 0) {
                arrayList.remove(0);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList<c> a(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        int intValue;
        int i5;
        com.baidu.platform.comapi.wnplatform.d.a.c("GuideUtility.getGuideLineText", "" + bundle.toString());
        ArrayList<c> arrayList = new ArrayList<>();
        try {
            bundle.getInt("updatetype");
            if (bundle.getInt("POIIsPassingPOI") != 0) {
                String string = bundle.getString("usPOIGuideText");
                int[] intArray = bundle.getIntArray("unPOIIdx");
                int[] intArray2 = bundle.getIntArray("unPOIWordCnt");
                int[] intArray3 = bundle.getIntArray("unPOILineNo");
                boolean[] booleanArray = bundle.getBooleanArray("bPOIHighLight");
                a(intArray, intArray2, intArray3, booleanArray);
                if (string.contains(Separators.AT)) {
                    string = string.replace(Separators.AT, "...");
                }
                if (intArray.length != 0) {
                    HashMap hashMap = new HashMap();
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        i = 1;
                        if (i6 >= intArray3.length) {
                            break;
                        }
                        int i9 = intArray2[i6];
                        i8 += i9;
                        if (i7 != intArray3[i6]) {
                            hashMap.put(Integer.valueOf(i7), Integer.valueOf(i8 - i9));
                            i7++;
                            i8 = intArray2[i6];
                        }
                        if (i6 == intArray3.length - 1) {
                            hashMap.put(Integer.valueOf(i7), Integer.valueOf(i8));
                        }
                        i6++;
                    }
                    com.baidu.platform.comapi.wnplatform.d.a.a("yang11", "poi segNumMap size:" + hashMap.size());
                    for (int i10 = 0; i10 < hashMap.size(); i10++) {
                        com.baidu.platform.comapi.wnplatform.d.a.a("yang11", i10 + "==" + hashMap.get(Integer.valueOf(i10)));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = hashMap.size();
                    int i11 = 0;
                    while (i11 < size) {
                        int intValue2 = ((Integer) hashMap.get(Integer.valueOf(i11))).intValue();
                        char[] cArr = new char[intValue2];
                        int[] iArr = new int[intValue2];
                        int[] iArr2 = new int[intValue2];
                        int i12 = 0;
                        while (i12 < intValue2) {
                            if (i11 > 0) {
                                if (i11 > i) {
                                    i3 = 0;
                                    i5 = ((Integer) hashMap.get(Integer.valueOf(i11 - 1))).intValue() + i12;
                                    i2 = i;
                                    intValue = ((Integer) hashMap.get(Integer.valueOf(i11 - 2))).intValue();
                                } else {
                                    i2 = i;
                                    i3 = 0;
                                    intValue = ((Integer) hashMap.get(Integer.valueOf(i11 - 1))).intValue();
                                    i5 = i12;
                                }
                                i4 = i5 + intValue;
                            } else {
                                i2 = i;
                                i3 = 0;
                                i4 = i12;
                            }
                            if (i4 < string.length()) {
                                cArr[i12] = string.charAt(i4);
                            }
                            iArr2[i12] = i2;
                            int i13 = i3;
                            boolean[] zArr = booleanArray;
                            while (true) {
                                if (i13 >= intArray.length) {
                                    break;
                                }
                                if (i13 == intArray.length - 1) {
                                    if (zArr[i13]) {
                                        iArr[i12] = i2;
                                    } else {
                                        iArr[i12] = i3;
                                    }
                                } else {
                                    int i14 = i13 + 1;
                                    if (i4 >= intArray[i14]) {
                                        i13 = i14;
                                    } else if (zArr[i13]) {
                                        iArr[i12] = i2;
                                    } else {
                                        iArr[i12] = i3;
                                    }
                                }
                            }
                            i12++;
                            booleanArray = zArr;
                            i = i2;
                        }
                        arrayList2.add(new c(cArr, iArr, iArr2));
                        i11++;
                        booleanArray = booleanArray;
                        i = i;
                    }
                    a((ArrayList<c>) arrayList2);
                    for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                        arrayList.add(arrayList2.get(i15));
                    }
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        com.baidu.platform.comapi.wnplatform.d.a.a("yang11", "poi line:" + i16 + String.valueOf(((c) arrayList.get(i16)).c));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    private static void a(ArrayList<c> arrayList) {
        if (arrayList.size() >= 1) {
            c a2 = c.a(arrayList.get(0), arrayList.get(1));
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.add(0, a2);
            if (arrayList.get(0).c.length > f8821a) {
                com.baidu.platform.comapi.wnplatform.d.a.a("yang11", "poi enter new branch2!!!");
                c cVar = arrayList.get(0);
                c cVar2 = arrayList.size() >= 2 ? arrayList.get(1) : null;
                c a3 = c.a(arrayList.get(0), f8821a);
                c b = c.b(arrayList.get(0), f8821a);
                com.baidu.platform.comapi.wnplatform.d.a.a("yang11", "headSecondText:" + String.valueOf(a3.c));
                com.baidu.platform.comapi.wnplatform.d.a.a("yang11", "tailSecondText:" + String.valueOf(b.c));
                if (arrayList.size() >= 2) {
                    b = c.a(b, arrayList.get(1));
                }
                arrayList.remove(cVar);
                if (cVar2 != null) {
                    arrayList.remove(cVar2);
                }
                arrayList.add(a3);
                arrayList.add(b);
            }
        }
    }

    private static void a(int[] iArr, int[] iArr2, int[] iArr3, boolean[] zArr) {
        String str = "";
        String str2 = "";
        for (int i : iArr) {
            str2 = str2 + i + ",";
        }
        String str3 = "";
        for (int i2 : iArr2) {
            str3 = str3 + i2 + ",";
        }
        String str4 = "";
        for (int i3 : iArr3) {
            str4 = str4 + i3 + ",";
        }
        for (boolean z : zArr) {
            str = str + z + ",";
        }
        com.baidu.platform.comapi.wnplatform.d.a.a("yang11", "unIdxString:" + str2);
        com.baidu.platform.comapi.wnplatform.d.a.a("yang11", "unWordCntString:" + str3);
        com.baidu.platform.comapi.wnplatform.d.a.a("yang11", "unLineNoString:" + str4);
        com.baidu.platform.comapi.wnplatform.d.a.a("yang11", "highLightString:" + str);
    }
}
