package com.efs.sdk.base.core.cache;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.d.f;
import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.util.FileUtil;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.secure.EncodeUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public final class e extends Handler implements d {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, a> f9613a;
    private com.efs.sdk.base.core.c.a.d b;
    private com.efs.sdk.base.core.c.a.c c;

    e() {
        super(com.efs.sdk.base.core.util.concurrent.a.f9649a.getLooper());
        this.f9613a = new ConcurrentHashMap<>();
        this.b = new com.efs.sdk.base.core.c.a.d();
        this.c = new com.efs.sdk.base.core.c.a.c();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1 && (message.obj instanceof String)) {
                c(message.obj.toString());
                return;
            }
            return;
        }
        LogDto logDto = (LogDto) message.obj;
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                a b = b(logDto);
                if (b == null) {
                    Log.w("efs.cache", "writer is null for type " + logDto.getLogType());
                } else {
                    if (b.getChannel().position() + logDto.getData().length > 819200) {
                        c(logDto.getLogType());
                        b = b(logDto);
                        if (b == null) {
                            Log.w("efs.cache", "writer is null for type " + logDto.getLogType());
                        }
                    }
                    b.write(EncodeUtil.base64Encode(logDto.getData()));
                    b.write("\n".getBytes());
                }
                return;
            } catch (Throwable th) {
                Log.e("efs.cache", "cache file error", th);
            }
        }
    }

    @Override // com.efs.sdk.base.core.cache.d
    public final void a(LogDto logDto) {
        Message obtain = Message.obtain();
        obtain.obj = logDto;
        obtain.what = 0;
        sendMessage(obtain);
    }

    @Override // com.efs.sdk.base.core.cache.d
    public final boolean a(File file, LogDto logDto) {
        if (!logDto.isCp()) {
            a(file);
            return false;
        }
        if (!file.exists()) {
            return false;
        }
        logDto.setFile(file);
        logDto.setSendImediately(true);
        logDto.setLogBodyType(1);
        return true;
    }

    @Override // com.efs.sdk.base.core.cache.d
    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.obj = str;
        obtain.what = 1;
        sendMessage(obtain);
    }

    private static long b(String str) {
        Map<String, String> c = com.efs.sdk.base.core.config.remote.b.a().c();
        String concat = "record_accumulation_time_".concat(String.valueOf(str));
        if (!c.containsKey(concat)) {
            return 60000L;
        }
        String str2 = c.get(concat);
        if (TextUtils.isEmpty(str2)) {
            return 60000L;
        }
        try {
            return Math.max(Long.parseLong(str2) * 1000, 1000L);
        } catch (Throwable th) {
            Log.e("efs.cache", "get cache interval error", th);
            return 60000L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.efs.sdk.base.core.cache.e.a b(com.efs.sdk.base.core.model.LogDto r6) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.core.cache.e$a> r0 = r5.f9613a
            java.lang.String r1 = r6.getLogType()
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L19
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.core.cache.e$a> r0 = r5.f9613a
            java.lang.String r6 = r6.getLogType()
            java.lang.Object r6 = r0.get(r6)
            com.efs.sdk.base.core.cache.e$a r6 = (com.efs.sdk.base.core.cache.e.a) r6
            return r6
        L19:
            java.lang.String r0 = r6.getLogType()
            java.lang.String r1 = "codelogperf"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            java.lang.String r0 = com.efs.sdk.base.core.util.FileUtil.getCodelogFileName(r6)
            java.io.File r2 = new java.io.File
            com.efs.sdk.base.core.config.GlobalEnvStruct r3 = com.efs.sdk.base.core.controller.ControllerCenter.getGlobalEnvStruct()
            android.content.Context r3 = r3.mAppContext
            com.efs.sdk.base.core.config.GlobalEnvStruct r4 = com.efs.sdk.base.core.controller.ControllerCenter.getGlobalEnvStruct()
            java.lang.String r4 = r4.getAppid()
            java.io.File r3 = com.efs.sdk.base.core.util.a.g(r3, r4)
            r2.<init>(r3, r0)
            goto L5c
        L41:
            java.lang.String r0 = com.efs.sdk.base.core.util.FileUtil.getFileName(r6)
            java.io.File r2 = new java.io.File
            com.efs.sdk.base.core.config.GlobalEnvStruct r3 = com.efs.sdk.base.core.controller.ControllerCenter.getGlobalEnvStruct()
            android.content.Context r3 = r3.mAppContext
            com.efs.sdk.base.core.config.GlobalEnvStruct r4 = com.efs.sdk.base.core.controller.ControllerCenter.getGlobalEnvStruct()
            java.lang.String r4 = r4.getAppid()
            java.io.File r3 = com.efs.sdk.base.core.util.a.f(r3, r4)
            r2.<init>(r3, r0)
        L5c:
            r0 = 0
            com.efs.sdk.base.core.cache.e$a r3 = new com.efs.sdk.base.core.cache.e$a     // Catch: java.lang.Throwable -> Lac
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lac
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.core.cache.e$a> r0 = r5.f9613a     // Catch: java.lang.Throwable -> Laa
            java.lang.String r4 = r6.getLogType()     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r0 = r0.putIfAbsent(r4, r3)     // Catch: java.lang.Throwable -> Laa
            com.efs.sdk.base.core.cache.e$a r0 = (com.efs.sdk.base.core.cache.e.a) r0     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L77
            com.efs.sdk.base.core.util.FileUtil.safeClose(r3)     // Catch: java.lang.Throwable -> Laa
            com.efs.sdk.base.core.util.FileUtil.delete(r2)     // Catch: java.lang.Throwable -> Laa
            return r0
        L77:
            java.lang.String r0 = r6.getLogType()     // Catch: java.lang.Throwable -> Laa
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Laa
            r1 = 1
            if (r0 == 0) goto L92
            android.os.Message r0 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = r6.getLogType()     // Catch: java.lang.Throwable -> Laa
            r0.obj = r2     // Catch: java.lang.Throwable -> Laa
            r0.what = r1     // Catch: java.lang.Throwable -> Laa
            r5.sendMessage(r0)     // Catch: java.lang.Throwable -> Laa
            goto Lb2
        L92:
            android.os.Message r0 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = r6.getLogType()     // Catch: java.lang.Throwable -> Laa
            r0.obj = r2     // Catch: java.lang.Throwable -> Laa
            r0.what = r1     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = r6.getLogType()     // Catch: java.lang.Throwable -> Laa
            long r1 = b(r1)     // Catch: java.lang.Throwable -> Laa
            r5.sendMessageDelayed(r0, r1)     // Catch: java.lang.Throwable -> Laa
            goto Lb2
        Laa:
            r0 = move-exception
            goto Laf
        Lac:
            r1 = move-exception
            r3 = r0
            r0 = r1
        Laf:
            r0.printStackTrace()
        Lb2:
            java.lang.String r0 = "wa"
            java.lang.String r6 = r6.getLogType()
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 != 0) goto Lc8
            com.efs.sdk.base.core.d.f r6 = com.efs.sdk.base.core.d.f.a.a()
            com.efs.sdk.base.core.d.d r6 = r6.c
            r6.b()
        Lc8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.core.cache.e.b(com.efs.sdk.base.core.model.LogDto):com.efs.sdk.base.core.cache.e$a");
    }

    private void c(String str) {
        a aVar;
        com.efs.sdk.base.core.d.f fVar;
        com.efs.sdk.base.core.d.f fVar2;
        if (this.f9613a.containsKey(str) && (aVar = this.f9613a.get(str)) != null) {
            try {
                aVar.flush();
                FileUtil.safeClose(aVar);
                Log.i("RecordLogCacheProcessor", "save file, type is ".concat(String.valueOf(str)));
                a(aVar.b);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    this.f9613a.remove(str);
                    if ("wa".equalsIgnoreCase(str)) {
                        return;
                    }
                    fVar2 = f.a.f9635a;
                    fVar2.c.c();
                } finally {
                    this.f9613a.remove(str);
                    if (!"wa".equalsIgnoreCase(str)) {
                        fVar = f.a.f9635a;
                        fVar.c.c();
                    }
                }
            }
        }
    }

    @Override // com.efs.sdk.base.core.cache.d
    public final void a(File file) {
        LogDto createLogDtoByName;
        String fileName;
        File h;
        String name = file.getName();
        if (!TextUtils.isEmpty(name) && name.startsWith(Constants.LOG_TYPE_CODELOGPERF)) {
            createLogDtoByName = FileUtil.createCodeLogDtoByName(name);
        } else {
            createLogDtoByName = FileUtil.createLogDtoByName(name);
        }
        if (createLogDtoByName == null) {
            CacheManager.getInstance().onChangeDtoError(file);
            return;
        }
        if (!a(createLogDtoByName, file) || createLogDtoByName.getData() == null || createLogDtoByName.getData().length <= 0) {
            CacheManager.getInstance().onChangeDtoError(file);
            return;
        }
        if (Constants.LOG_TYPE_CODELOGPERF.equals(createLogDtoByName.getLogType())) {
            fileName = FileUtil.getCodelogFileName(createLogDtoByName);
            h = com.efs.sdk.base.core.util.a.i(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        } else {
            fileName = FileUtil.getFileName(createLogDtoByName);
            h = com.efs.sdk.base.core.util.a.h(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        }
        File file2 = new File(h, fileName);
        Log.i("RecordLogCacheProcessor", "upload file, name is ".concat(String.valueOf(name)));
        FileUtil.write(file2, createLogDtoByName.getData());
        FileUtil.delete(file);
    }

    private boolean a(LogDto logDto, File file) {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader2);
                try {
                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                        String base64DecodeToStr = EncodeUtil.base64DecodeToStr(readLine.getBytes());
                        if (!TextUtils.isEmpty(base64DecodeToStr)) {
                            sb.append(base64DecodeToStr).append("\n");
                        }
                    }
                    logDto.setData(sb.toString().getBytes());
                    logDto.setSendImediately(true);
                    this.c.a(logDto);
                    logDto.setFile(file);
                    FileUtil.safeClose(bufferedReader);
                    FileUtil.safeClose(fileReader2);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileReader = fileReader2;
                    try {
                        Log.e("efs.cache", "local decode error", th);
                        FileUtil.safeClose(bufferedReader);
                        FileUtil.safeClose(fileReader);
                        return false;
                    } catch (Throwable th2) {
                        FileUtil.safeClose(bufferedReader);
                        FileUtil.safeClose(fileReader);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
    }

    static class a extends FileOutputStream {

        /* renamed from: a, reason: collision with root package name */
        long f9614a;
        File b;

        a(File file) {
            super(file);
            this.b = file;
            this.f9614a = System.currentTimeMillis();
        }
    }
}
