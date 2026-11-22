package com.xmly.businesssdk.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConverterManager.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00050\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/xmly/businesssdk/utils/ConverterManager;", "", "()V", "parseToList", "Ljava/util/ArrayList;", "Out", "In", "converter", "Lcom/xmly/businesssdk/utils/Converter;", "dataList", "", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ConverterManager {
    public static final ConverterManager INSTANCE = new ConverterManager();

    private ConverterManager() {
    }

    @JvmStatic
    public static final <In, Out> ArrayList<Out> parseToList(Converter<In, Out> converter, List<? extends In> dataList) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        ArrayList<Out> arrayList = new ArrayList<>(dataList != null ? dataList.size() : 0);
        if (dataList != null) {
            Iterator<? extends In> it = dataList.iterator();
            while (it.hasNext()) {
                Out convert = converter.convert(it.next());
                if (convert != null) {
                    arrayList.add(convert);
                }
            }
        }
        return arrayList;
    }
}
