package com.efs.sdk.base.core.model;

import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;

/* loaded from: classes14.dex */
public class LogDto {

    /* renamed from: a, reason: collision with root package name */
    private a f9637a;
    private b b = new b();
    private byte[] c;
    private File d;

    public LogDto(String str, byte b) {
        this.f9637a = new a(str, b);
    }

    public void setUid(String str) {
        this.f9637a.h = str;
    }

    public String getUid() {
        return this.f9637a.h;
    }

    public void setDid(String str) {
        this.f9637a.i = str;
    }

    public String getDid() {
        return this.f9637a.i;
    }

    public void setBeginTime(long j) {
        this.f9637a.j = j;
    }

    public long getBeginTime() {
        return this.f9637a.j;
    }

    public void setEndTime(long j) {
        this.f9637a.k = j;
    }

    public long getEndTime() {
        return this.f9637a.k;
    }

    public int getLogCnt() {
        return this.f9637a.g;
    }

    public void setLogCnt(int i) {
        this.f9637a.g = i;
    }

    public long getBodySize() {
        a();
        return this.f9637a.f;
    }

    private void a() {
        if (getLogBodyType() == 0 && getData() != null) {
            this.f9637a.f = getData().length;
        } else if (getLogBodyType() == 1 && getFile().exists()) {
            this.f9637a.f = getFile().length();
        }
    }

    public boolean isCp() {
        return !"none".equals(this.f9637a.d);
    }

    public void setCp(String str) {
        this.f9637a.d = str;
    }

    public String getCp() {
        return this.f9637a.d;
    }

    public boolean isDe() {
        return 1 != this.f9637a.e;
    }

    public void setDe(int i) {
        this.f9637a.e = i;
        a();
    }

    public int getDe() {
        return this.f9637a.e;
    }

    public byte getLogProtocol() {
        return this.f9637a.b;
    }

    public int getLogBodyType() {
        return this.f9637a.c;
    }

    public void setLogBodyType(int i) {
        this.f9637a.c = i;
    }

    public String getLogType() {
        return this.f9637a.f9638a;
    }

    public byte[] getData() {
        return this.c;
    }

    public void setData(byte[] bArr) {
        this.c = bArr;
        a();
    }

    public File getFile() {
        return this.d;
    }

    public void setFile(File file) {
        this.d = file;
    }

    public void setSendImediately(boolean z) {
        this.b.f9639a = z;
    }

    public boolean isSendImediately() {
        return this.b.f9639a;
    }

    public void setLimitByFlow(boolean z) {
        this.b.b = z;
    }

    public boolean isLimitByFlow() {
        return this.b.b;
    }

    public void setResponseDto(HttpResponse httpResponse) {
        this.b.c = httpResponse;
    }

    public HttpResponse getResponseDto() {
        return this.b.c;
    }

    public static LogDto buildLogDto(ILogProtocol iLogProtocol) {
        LogDto logDto;
        LogDto logDto2 = null;
        try {
            logDto = new LogDto(iLogProtocol.getLogType(), iLogProtocol.getLogProtocol());
        } catch (Exception e) {
            e = e;
        }
        try {
            int bodyType = iLogProtocol.getBodyType();
            if (bodyType != 0) {
                if (bodyType != 1) {
                    Log.w("efs.base", "Can not support body type: " + iLogProtocol.getBodyType());
                    return logDto;
                }
                logDto.setLogBodyType(1);
                logDto.setFile(new File(iLogProtocol.getFilePath()));
                return logDto;
            }
            logDto.setLogBodyType(0);
            logDto.setData(iLogProtocol.generate());
            if (Constants.LOG_TYPE_CODELOGPERF.equals(logDto.getLogType())) {
                logDto.setUid(ControllerCenter.getGlobalEnvStruct().getLogUid());
                logDto.setDid(ControllerCenter.getGlobalEnvStruct().getLogDid());
                logDto.setBeginTime(iLogProtocol.getLogBeginTime());
                logDto.setEndTime(iLogProtocol.getLogEndTime());
            }
            return logDto;
        } catch (Exception e2) {
            e = e2;
            logDto2 = logDto;
            Log.e("efs.base", "log send error", e);
            return logDto2;
        }
    }
}
