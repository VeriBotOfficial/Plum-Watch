package com.baidu.ar.ihttp;

import com.baidu.ar.c6;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.j4;
import com.baidu.ar.x7;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: classes12.dex */
public final class Downloader {

    /* renamed from: a, reason: collision with root package name */
    public String f6992a;
    public int b = 0;

    public class a implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6993a;
        public final /* synthetic */ IProgressCallback b;
        public final /* synthetic */ ICallbackWith c;
        public final /* synthetic */ ICallbackWith d;

        public a(String str, IProgressCallback iProgressCallback, ICallbackWith iCallbackWith, ICallbackWith iCallbackWith2) {
            this.f6993a = str;
            this.b = iProgressCallback;
            this.c = iCallbackWith;
            this.d = iCallbackWith2;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            this.c.run(httpException);
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            Downloader.this.b = iHttpResponse.getContentLength();
            try {
                Downloader.this.download(this.f6993a, this.b);
                this.d.run(Integer.valueOf(Downloader.this.b));
            } catch (Exception e) {
                e.printStackTrace();
                this.c.run(e);
            }
        }
    }

    public Downloader(String str) {
        this.f6992a = str;
    }

    public static void a(InputStream inputStream, String str, int i, IProgressCallback iProgressCallback) {
        BufferedInputStream bufferedInputStream;
        j4.f(new File(str));
        byte[] bArr = new byte[8192];
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "rw");
            try {
                randomAccessFile2.seek(0L);
                bufferedInputStream = new BufferedInputStream(inputStream, 8192);
                int i2 = 0;
                while (true) {
                    try {
                        int read = bufferedInputStream.read(bArr, 0, 8192);
                        if (read == -1) {
                            x7.a((Closeable) bufferedInputStream);
                            x7.a(randomAccessFile2);
                            return;
                        } else {
                            randomAccessFile2.write(bArr, 0, read);
                            i2 += read;
                            if (iProgressCallback != null) {
                                iProgressCallback.onProgress(i2, i);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        x7.a((Closeable) bufferedInputStream);
                        x7.a(randomAccessFile);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
    }

    public static int getNetFileSize(String str) {
        return HttpFactory.newRequest().setUrl(str).setMethod("HEAD").execute().getContentLength();
    }

    public int download(String str, IProgressCallback iProgressCallback) {
        int fileSize = getFileSize();
        IHttpResponse execute = HttpFactory.newRequest().setUrl(this.f6992a).setMethod("GET").execute();
        if (!execute.isSuccess()) {
            throw new HttpException(4, "下载失败");
        }
        a(execute.getStream(), str, fileSize, iProgressCallback);
        return fileSize;
    }

    public IHttpRequest downloadAsync(String str, ICallbackWith<Integer> iCallbackWith, ICallbackWith<Exception> iCallbackWith2) {
        return downloadAsync(str, iCallbackWith, iCallbackWith2, null);
    }

    public IHttpRequest downloadAsync(String str, ICallbackWith<Integer> iCallbackWith, ICallbackWith<Exception> iCallbackWith2, IProgressCallback iProgressCallback) {
        IHttpRequest newRequest = HttpFactory.newRequest();
        newRequest.setUrl(this.f6992a).setMethod("HEAD").enqueue(new a(str, iProgressCallback, iCallbackWith2, iCallbackWith));
        return newRequest;
    }

    public int getFileSize() {
        if (this.b == 0) {
            this.b = getNetFileSize(this.f6992a);
        }
        return this.b;
    }
}
