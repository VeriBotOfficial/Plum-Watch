package com.qumeng.overseas.advlib.__remote__.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes17.dex */
public class h {

    public static class b extends a {
        public b(byte[] bArr) throws IOException {
            super(bArr);
        }

        @Override // com.qumeng.overseas.advlib.__remote__.utils.h.a
        public void add(byte... bArr) throws IOException {
            if (h.a(bArr)) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
                super.add(gZIPInputStream);
                gZIPInputStream.close();
            }
        }
    }

    public static class c extends a {
        public c(byte[] bArr) throws IOException {
            super(bArr);
        }

        @Override // com.qumeng.overseas.advlib.__remote__.utils.h.a
        public void add(byte... bArr) throws IOException {
            if (bArr != null && !h.a(bArr)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
            }
            super.add(bArr);
        }
    }

    public static boolean a(byte... bArr) {
        if (bArr != null && bArr.length > 2) {
            if (((bArr[0] | (bArr[1] << 8)) & 65535) == 35615) {
                return true;
            }
        }
        return false;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private List<byte[]> f13233a = new ArrayList();

        public a() {
        }

        protected void a(byte... bArr) throws IOException {
            this.f13233a.add(bArr);
        }

        public void add(byte... bArr) throws IOException {
            synchronized (this.f13233a) {
                a(bArr);
            }
        }

        public int length() {
            Iterator<byte[]> it = this.f13233a.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().length;
            }
            return i;
        }

        public byte[] toByteArray() {
            if (this.f13233a.size() > 1) {
                trim();
            }
            return this.f13233a.get(0);
        }

        public void trim() {
            synchronized (this.f13233a) {
                if (this.f13233a.size() > 1) {
                    byte[] bArr = new byte[length()];
                    int i = 0;
                    for (byte[] bArr2 : this.f13233a) {
                        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
                        i += bArr2.length;
                    }
                    this.f13233a.clear();
                    this.f13233a.add(bArr);
                }
            }
        }

        public a(byte[] bArr) throws IOException {
            add(bArr);
        }

        public void add(InputStream inputStream) throws IOException {
            synchronized (this.f13233a) {
                while (true) {
                    byte[] bArr = new byte[1024];
                    int read = inputStream.read(bArr);
                    if (read < 1024) {
                        a(Arrays.copyOf(bArr, read));
                    } else {
                        a(bArr);
                    }
                }
            }
        }
    }

    public static boolean a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[2];
        return inputStream.read(bArr) > 1 && a(bArr[0], bArr[1], 0);
    }
}
