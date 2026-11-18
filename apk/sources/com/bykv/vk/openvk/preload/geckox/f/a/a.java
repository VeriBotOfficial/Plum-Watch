package com.bykv.vk.openvk.preload.geckox.f.a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: FileLoader.java */
/* JADX INFO: loaded from: classes15.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f9191a;

    protected abstract InputStream a(File file, String str) throws IOException;

    protected abstract boolean b(File file, String str) throws IOException;

    public a(File file) {
        this.f9191a = file;
    }

    public final InputStream a(String str) throws IOException {
        return a(this.f9191a, str);
    }

    public final boolean b(String str) throws IOException {
        return b(this.f9191a, str);
    }
}
