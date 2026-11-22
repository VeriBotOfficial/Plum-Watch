package com.xmly.businesssdk.utils;

import kotlin.Metadata;

/* compiled from: Converter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0019\u0010\u0004\u001a\u0004\u0018\u00018\u00012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xmly/businesssdk/utils/Converter;", "In", "Out", "", "convert", "input", "(Ljava/lang/Object;)Ljava/lang/Object;", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface Converter<In, Out> {
    Out convert(In input);
}
