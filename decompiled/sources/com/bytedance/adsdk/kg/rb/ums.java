package com.bytedance.adsdk.kg.rb;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
class ums {
    static <T> List<com.bytedance.adsdk.kg.sg.fxn<T>> fxn(JsonReader jsonReader, com.bytedance.adsdk.kg.sg sgVar, float f, ei<T> eiVar, boolean z) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.kg.sg sgVar2;
        float f2;
        ei<T> eiVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            sgVar.fxn("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("k")) {
                if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                    jsonReader.beginArray();
                    if (jsonReader.peek() == JsonToken.NUMBER) {
                        JsonReader jsonReader3 = jsonReader;
                        com.bytedance.adsdk.kg.sg sgVar3 = sgVar;
                        float f3 = f;
                        ei<T> eiVar3 = eiVar;
                        boolean z3 = z;
                        com.bytedance.adsdk.kg.sg.fxn fxn = dx.fxn(jsonReader3, sgVar3, f3, eiVar3, false, z3);
                        jsonReader2 = jsonReader3;
                        sgVar2 = sgVar3;
                        f2 = f3;
                        eiVar2 = eiVar3;
                        z2 = z3;
                        arrayList.add(fxn);
                    } else {
                        jsonReader2 = jsonReader;
                        sgVar2 = sgVar;
                        f2 = f;
                        eiVar2 = eiVar;
                        z2 = z;
                        while (jsonReader2.hasNext()) {
                            arrayList.add(dx.fxn(jsonReader2, sgVar2, f2, eiVar2, true, z2));
                        }
                    }
                    jsonReader2.endArray();
                    jsonReader = jsonReader2;
                    sgVar = sgVar2;
                    f = f2;
                    eiVar = eiVar2;
                    z = z2;
                } else {
                    JsonReader jsonReader4 = jsonReader;
                    arrayList.add(dx.fxn(jsonReader4, sgVar, f, eiVar, false, z));
                    jsonReader = jsonReader4;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        fxn(arrayList);
        return arrayList;
    }

    public static <T> void fxn(List<? extends com.bytedance.adsdk.kg.sg.fxn<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            com.bytedance.adsdk.kg.sg.fxn<T> fxnVar = list.get(i2);
            i2++;
            com.bytedance.adsdk.kg.sg.fxn<T> fxnVar2 = list.get(i2);
            fxnVar.f9267sg = Float.valueOf(fxnVar2.bh);
            if (fxnVar.kg == null && fxnVar2.fxn != null) {
                fxnVar.kg = fxnVar2.fxn;
                if (fxnVar instanceof com.bytedance.adsdk.kg.fxn.kg.jq) {
                    ((com.bytedance.adsdk.kg.fxn.kg.jq) fxnVar).fxn();
                }
            }
        }
        com.bytedance.adsdk.kg.sg.fxn<T> fxnVar3 = list.get(i);
        if ((fxnVar3.fxn == null || fxnVar3.kg == null) && list.size() > 1) {
            list.remove(fxnVar3);
        }
    }
}
