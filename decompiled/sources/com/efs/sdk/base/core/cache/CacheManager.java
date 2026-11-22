package com.efs.sdk.base.core.cache;

import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.d.f;
import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.util.FileUtil;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes14.dex */
public class CacheManager {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9608a;
    private boolean b;
    private com.efs.sdk.base.core.cache.a c;
    private a d;
    private List<File> e;

    /* synthetic */ CacheManager(byte b2) {
        this();
    }

    private CacheManager() {
        this.f9608a = false;
        this.b = true;
        this.c = new com.efs.sdk.base.core.cache.a();
        this.d = new a();
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final CacheManager f9609a = new CacheManager(0);
    }

    public static CacheManager getInstance() {
        return b.f9609a;
    }

    public void put(LogDto logDto) {
        d a2;
        com.efs.sdk.base.core.d.f fVar;
        if (!"wa".equals(logDto.getLogType()) && !Constants.LOG_TYPE_CODELOGPERF.equals(logDto.getLogType()) && !com.efs.sdk.base.core.cache.b.a().f9611a) {
            if (!this.f9608a) {
                fVar = f.a.f9635a;
                int i = com.efs.sdk.base.core.config.remote.b.a().d.mConfigVersion;
                if (fVar.b != null || ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                    fVar.b.send(fVar.a("disk_limit", i));
                }
            }
            this.f9608a = true;
            return;
        }
        if (!Constants.LOG_TYPE_CODELOGPERF.equals(logDto.getLogType()) || com.efs.sdk.base.core.cache.b.a().b) {
            if ((logDto.getLogBodyType() == 0 && (logDto.getData() == null || logDto.getData().length == 0)) || (a2 = this.c.a(logDto.getLogProtocol())) == null) {
                return;
            }
            a2.a(logDto);
        }
    }

    public void flushImmediately(byte b2, String str) {
        d a2 = this.c.a(b2);
        if (a2 == null) {
            return;
        }
        a2.a(str);
    }

    public List<File> getFileList(int i, IFileFilter iFileFilter) {
        com.efs.sdk.base.core.d.f fVar;
        a();
        File h = com.efs.sdk.base.core.util.a.h(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (!h.exists()) {
            return Collections.emptyList();
        }
        List<File> listFiles = FileUtil.listFiles(h);
        if (this.b) {
            fVar = f.a.f9635a;
            int size = listFiles.size();
            if (fVar.b != null && ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                com.efs.sdk.base.core.d.b bVar = new com.efs.sdk.base.core.d.b("efs_core", "log_lag", fVar.f9634a.c);
                bVar.put("cnt", Integer.valueOf(size));
                fVar.b.send(bVar);
            }
            this.b = false;
        }
        Collections.sort(listFiles, this.d);
        ArrayList arrayList = new ArrayList(i);
        for (int size2 = listFiles.size() - 1; size2 >= 0 && arrayList.size() < i; size2--) {
            File file = listFiles.get(size2);
            if (file.exists() && (iFileFilter == null || !iFileFilter.filter(file))) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public List<File> getCodeLogList() {
        return this.e;
    }

    public List<File> getFileListCodeLog(int i, IFileFilter iFileFilter) {
        b();
        List<File> list = this.e;
        if (list == null || list.isEmpty()) {
            File i2 = com.efs.sdk.base.core.util.a.i(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
            if (!i2.exists()) {
                return Collections.emptyList();
            }
            List<File> listFiles = FileUtil.listFiles(i2);
            this.e = listFiles;
            Collections.sort(listFiles, this.d);
        }
        ArrayList arrayList = new ArrayList(i);
        for (int size = this.e.size() - 1; size >= 0 && arrayList.size() < i; size--) {
            File file = this.e.get(size);
            if (file.exists()) {
                if (iFileFilter == null || !iFileFilter.filter(file)) {
                    Log.i("efs.cache", "[-->>] add file is " + file.getName());
                    arrayList.add(file);
                } else {
                    Log.i("efs.cache", "[--xx] filter file is " + file.getName());
                }
            }
        }
        return arrayList;
    }

    public List<LogDto> getLogDto(int i, IFileFilter iFileFilter) {
        a();
        List<File> fileList = getFileList(i, iFileFilter);
        ArrayList arrayList = new ArrayList(i);
        for (File file : fileList) {
            LogDto changeLogDto = changeLogDto(file);
            if (changeLogDto == null) {
                Log.w("efs.cache", "file upload error, name is " + file.getName());
            } else {
                arrayList.add(changeLogDto);
            }
        }
        return arrayList;
    }

    public List<LogDto> getLogDtoCodeLog(int i, IFileFilter iFileFilter) {
        b();
        List<File> fileListCodeLog = getFileListCodeLog(i, iFileFilter);
        ArrayList arrayList = new ArrayList(i);
        for (File file : fileListCodeLog) {
            LogDto changeLogDto = changeLogDto(file);
            if (changeLogDto == null) {
                Log.w("efs.cache", "file upload error, name is " + file.getName());
            } else {
                arrayList.add(changeLogDto);
            }
        }
        return arrayList;
    }

    private void a() {
        String[] list;
        LogDto createLogDtoByName;
        File d = com.efs.sdk.base.core.util.a.d(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (!d.exists() || !d.isDirectory() || (list = d.list()) == null || list.length <= 0) {
            return;
        }
        for (String str : list) {
            if (!ProcessUtil.isProcessExist(ControllerCenter.getGlobalEnvStruct().mAppContext, str)) {
                File file = new File(d, str);
                List<File> listFiles = FileUtil.listFiles(file);
                if (!listFiles.isEmpty()) {
                    for (File file2 : listFiles) {
                        if (a(file2.getName())) {
                            a(file2);
                        } else {
                            String name = file2.getName();
                            if (!TextUtils.isEmpty(name) && name.startsWith(Constants.LOG_TYPE_CODELOGPERF)) {
                                createLogDtoByName = FileUtil.createCodeLogDtoByName(name);
                            } else {
                                createLogDtoByName = FileUtil.createLogDtoByName(name);
                            }
                            if (createLogDtoByName == null) {
                                onChangeDtoError(file2);
                            } else {
                                d a2 = this.c.a(createLogDtoByName.getLogProtocol());
                                if (a2 == null) {
                                    onChangeDtoError(file2);
                                } else {
                                    a2.a(file2);
                                }
                            }
                        }
                    }
                }
                FileUtil.delete(file);
            }
        }
    }

    private void b() {
        String[] list;
        LogDto createLogDtoByName;
        File e = com.efs.sdk.base.core.util.a.e(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (!e.exists() || !e.isDirectory() || (list = e.list()) == null || list.length <= 0) {
            return;
        }
        for (String str : list) {
            if (!ProcessUtil.isProcessExist(ControllerCenter.getGlobalEnvStruct().mAppContext, str)) {
                File file = new File(e, str);
                List<File> listFiles = FileUtil.listFiles(file);
                if (!listFiles.isEmpty()) {
                    for (File file2 : listFiles) {
                        if (a(file2.getName())) {
                            a(file2);
                        } else {
                            String name = file2.getName();
                            if (!TextUtils.isEmpty(name) && name.startsWith(Constants.LOG_TYPE_CODELOGPERF)) {
                                createLogDtoByName = FileUtil.createCodeLogDtoByName(name);
                            } else {
                                createLogDtoByName = FileUtil.createLogDtoByName(name);
                            }
                            if (createLogDtoByName == null) {
                                onChangeDtoError(file2);
                            } else {
                                d a2 = this.c.a(createLogDtoByName.getLogProtocol());
                                if (a2 == null) {
                                    onChangeDtoError(file2);
                                } else {
                                    a2.a(file2);
                                }
                            }
                        }
                    }
                }
                FileUtil.delete(file);
            }
        }
    }

    static boolean a(String str) {
        long parseLong;
        try {
            if (str.startsWith(Constants.LOG_TYPE_CODELOGPERF)) {
                parseLong = Long.parseLong(str.substring(str.lastIndexOf("_") + 1));
            } else {
                parseLong = Long.parseLong(str.substring(str.lastIndexOf("_") + 1));
            }
            com.efs.sdk.base.core.a.a.a();
            return Math.abs(com.efs.sdk.base.core.a.a.b() - parseLong) >= 604800000;
        } catch (Throwable unused) {
            return true;
        }
    }

    public LogDto changeLogDto(File file) {
        LogDto createLogDtoByName;
        try {
            if (!file.exists()) {
                return null;
            }
            if (a(file.getName())) {
                a(file);
                return null;
            }
            String name = file.getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(Constants.LOG_TYPE_CODELOGPERF)) {
                createLogDtoByName = FileUtil.createCodeLogDtoByName(name);
            } else {
                createLogDtoByName = FileUtil.createLogDtoByName(name);
            }
            if (createLogDtoByName == null) {
                onChangeDtoError(file);
                return null;
            }
            d a2 = this.c.a(createLogDtoByName.getLogProtocol());
            if (a2 == null) {
                onChangeDtoError(file);
                return null;
            }
            if (a2.a(file, createLogDtoByName)) {
                return createLogDtoByName;
            }
            onChangeDtoError(file);
            return null;
        } catch (Throwable th) {
            Log.w("efs.cache", th);
            onChangeDtoError(file);
            return null;
        }
    }

    public void onChangeDtoError(File file) {
        com.efs.sdk.base.core.d.f fVar;
        if (!file.getName().startsWith("wa_")) {
            fVar = f.a.f9635a;
            fVar.c.c.incrementAndGet();
        }
        FileUtil.delete(file);
    }

    static void a(File file) {
        com.efs.sdk.base.core.d.f fVar;
        StringBuilder append = new StringBuilder("file is expire: ").append(file.getName()).append(", now is ");
        com.efs.sdk.base.core.a.a.a();
        Log.i("efs.cache", append.append(com.efs.sdk.base.core.a.a.b()).toString());
        if (!file.getName().startsWith("wa_")) {
            fVar = f.a.f9635a;
            fVar.c.d();
        }
        FileUtil.delete(file);
    }

    public static class a implements Comparator<File> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            long lastModified = file.lastModified() - file2.lastModified();
            if (lastModified > 0) {
                return 1;
            }
            return lastModified == 0 ? 0 : -1;
        }
    }
}
