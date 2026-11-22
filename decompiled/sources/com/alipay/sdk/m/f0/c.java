package com.alipay.sdk.m.f0;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public class c implements FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f1380a;

    public c(b bVar) {
        this.f1380a = bVar;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return Pattern.matches("cpu[0-9]+", file.getName());
    }
}
