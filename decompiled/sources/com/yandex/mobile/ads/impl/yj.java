package com.yandex.mobile.ads.impl;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class yj {
    @JvmStatic
    public static final byte[] a(String str) {
        Object m14057constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] readBytes = ByteStreamsKt.readBytes(gZIPInputStream);
                    CloseableKt.closeFinally(gZIPInputStream, null);
                    CloseableKt.closeFinally(byteArrayInputStream, null);
                    m14057constructorimpl = Result.m14057constructorimpl(readBytes);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m14060exceptionOrNullimpl(m14057constructorimpl) != null) {
            m14057constructorimpl = new byte[0];
        }
        return (byte[]) m14057constructorimpl;
    }

    @JvmStatic
    public static final String b(String str) {
        Object m14057constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] decode = Base64.decode(str, 0);
            Intrinsics.checkNotNull(decode);
            Charset charset = Charsets.UTF_8;
            m14057constructorimpl = Result.m14057constructorimpl(new String(a(new String(decode, charset)), charset));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m14060exceptionOrNullimpl(m14057constructorimpl) != null) {
            m14057constructorimpl = "";
        }
        return (String) m14057constructorimpl;
    }
}
