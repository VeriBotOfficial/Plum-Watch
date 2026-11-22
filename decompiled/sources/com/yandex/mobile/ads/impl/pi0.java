package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class pi0 extends sy1 {
    private static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f16569a = lo.c.newDecoder();
    private final CharsetDecoder b = lo.b.newDecoder();

    @Override // com.yandex.mobile.ads.impl.sy1
    protected final k01 a(n01 n01Var, ByteBuffer byteBuffer) {
        String str;
        String str2 = null;
        try {
            str = this.f16569a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                str = this.b.decode(byteBuffer).toString();
                this.b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.b.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                this.b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f16569a.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new k01(new ri0(bArr, null, null));
        }
        Matcher matcher = c.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String b = fg.b(group);
                b.getClass();
                if (b.equals("streamurl")) {
                    str3 = group2;
                } else if (b.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new k01(new ri0(bArr, str2, str3));
    }
}
