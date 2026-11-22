package com.efs.sdk.base.core.d;

import com.efs.sdk.base.core.config.GlobalInfo;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.protocol.record.AbsRecordLog;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes14.dex */
public final class b extends AbsRecordLog {

    /* renamed from: a, reason: collision with root package name */
    private String f9632a;
    private String b;
    private String c;
    private String d;
    private long e;
    private long f;

    public b(String str, String str2, String str3) {
        super("wa");
        this.e = 0L;
        this.f = 0L;
        this.f9632a = str;
        this.b = str2;
        this.d = str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS", Locale.CHINA);
        com.efs.sdk.base.core.a.a.a();
        this.c = simpleDateFormat.format(new Date(com.efs.sdk.base.core.a.a.b()));
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final void insertGlobal(GlobalInfo globalInfo) {
        this.dataMap.putAll(globalInfo.getGlobalInfoMap());
        this.dataMap.putAll(ControllerCenter.getGlobalEnvStruct().getPublicParamMap());
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final byte[] generate() {
        String generateString = generateString();
        if (ControllerCenter.getGlobalEnvStruct().isPrintLogDetail()) {
            Log.i("efs.base", generateString);
        }
        return generateString.getBytes();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String generateString() {
        StringBuilder sb = new StringBuilder();
        sb.append("lt=event`ev_ct=");
        sb.append(this.f9632a).append("`ev_ac=");
        sb.append(this.b).append("`tm=");
        sb.append(this.c).append("`dn=");
        sb.append(this.d).append("`");
        for (Map.Entry<String, Object> entry : this.dataMap.entrySet()) {
            sb.append(entry.getKey()).append("=").append(entry.getValue()).append("`");
        }
        return sb.subSequence(0, sb.length() - 1).toString();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String getLinkKey() {
        return "";
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String getLinkId() {
        return "";
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final void setLogBeginTime(long j) {
        this.e = j;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final long getLogBeginTime() {
        return this.e;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final void setLogEndTime(long j) {
        this.f = j;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final long getLogEndTime() {
        return this.f;
    }
}
