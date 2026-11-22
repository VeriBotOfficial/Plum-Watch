package com.baidu.platform.comapi.wnplatform.e;

import com.google.protobuf.micro.MessageMicro;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ProtobufListResult.java */
/* loaded from: classes13.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private List<MessageMicro> f8893a;
    private int b;
    private int c;

    public c(int i, int i2, List<MessageMicro> list) {
        new ArrayList();
        this.c = i;
        this.b = i2;
        this.f8893a = list;
    }

    public List<MessageMicro> a() {
        return new ArrayList(this.f8893a);
    }
}
