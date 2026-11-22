package com.qumeng.overseas.advlib.__remote__.core.proto.throwable;

import com.qumeng.overseas.advlib.__remote__.core.proto.utils.z;
import com.qumeng.overseas.advlib.__remote__.utils.ADBaseException;
import com.qumeng.overseas.advlib.core.m;

/* loaded from: classes17.dex */
public class NoSuchMaterialException extends ADBaseException {
    public NoSuchMaterialException(Class<? extends m> cls) {
        super("Required bean '" + z.a(cls.getName()) + "' did not initialize");
    }
}
