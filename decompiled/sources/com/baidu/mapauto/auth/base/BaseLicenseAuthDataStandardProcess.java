package com.baidu.mapauto.auth.base;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.baidu.mapauto.auth.AuthCore;
import com.baidu.mapauto.auth.base.b;
import com.baidu.mapauto.auth.util.LogUtil;
import com.baidu.mapauto.auth.util.RSAUtil;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public abstract class BaseLicenseAuthDataStandardProcess<T extends b, Z> {

    /* renamed from: a, reason: collision with root package name */
    public final int f8244a;

    public static class ProcessException extends Exception {
        private Map<String, Integer> errors;
        private final int mCode;

        public ProcessException(int i, String str) {
            super(str);
            this.mCode = i;
        }

        public int getCode() {
            return this.mCode;
        }

        public Map<String, Integer> getErrors() {
            return this.errors;
        }

        public void setErrors(Map<String, Integer> map) {
            this.errors = map;
        }
    }

    public BaseLicenseAuthDataStandardProcess(int i) {
        this.f8244a = i;
    }

    public abstract T a(String str);

    public abstract ArrayList a(int i, AuthCore.AuthParam authParam, b bVar);

    public abstract HashMap a(b bVar);

    public final Map<String, Integer> a(AuthCore.AuthParam authParam) throws ProcessException {
        com.baidu.mapauto.auth.net.b bVar;
        int i;
        Integer num;
        LogUtil logUtil;
        String str;
        boolean z = true;
        if ((this.f8244a & 1) == 1) {
            LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "开始请求 license  服务 ==>");
            KeyPair generateKeyPair = RSAUtil.generateKeyPair();
            if (generateKeyPair == null) {
                logUtil = LogUtil.getInstance();
                str = "生成公私钥错误";
            } else {
                String publicKeyCS1Pem = RSAUtil.getPublicKeyCS1Pem(generateKeyPair.getPublic());
                if (publicKeyCS1Pem == null) {
                    logUtil = LogUtil.getInstance();
                    str = "生成公钥为空";
                } else {
                    authParam.put(com.alipay.sdk.m.t.e.o, publicKeyCS1Pem);
                    try {
                        authParam.put("private_key", RSAUtil.getPrivateKeyStr(generateKeyPair.getPrivate()));
                        int i2 = 1;
                        while (true) {
                            try {
                                bVar = c(authParam);
                            } catch (Exception e) {
                                LogUtil.getInstance().e("BaseLicenseAuthDataStandardProcess", e.toString());
                                com.baidu.mapauto.auth.net.b bVar2 = new com.baidu.mapauto.auth.net.b();
                                bVar2.d = e;
                                bVar = bVar2;
                            }
                            if (i2 >= 3) {
                                break;
                            }
                            if (!((bVar != null && bVar.d == null && (num = bVar.f8250a) != null && num.intValue() == 200) ? TextUtils.isEmpty(bVar.c) : true)) {
                                break;
                            }
                            try {
                                Thread.sleep(500L);
                            } catch (InterruptedException e2) {
                                LogUtil.getInstance().e("BaseLicenseAuthDataStandardProcess", e2.toString());
                            }
                            i2++;
                        }
                    } catch (Exception e3) {
                        LogUtil.getInstance().e("BaseLicenseAuthDataStandardProcess", e3.toString());
                    }
                    LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "<== license 服务返回结果:" + bVar);
                    i = 0;
                }
            }
            logUtil.i("BaseLicenseAuthDataStandardProcess", str);
            bVar = null;
            LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "<== license 服务返回结果:" + bVar);
            i = 0;
        } else {
            bVar = null;
            i = -1;
        }
        String str2 = bVar == null ? "" : bVar.c;
        if (TextUtils.isEmpty(str2) && (this.f8244a & 2) == 2) {
            LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "尝试从本地缓存获取 ==>");
            str2 = b(authParam);
            LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "<== 本地缓存服务返回结果:" + str2);
            i = 1;
        }
        if (i == -1) {
            return new HashMap(0);
        }
        if (TextUtils.isEmpty(str2)) {
            if ((this.f8244a & 1) != 1) {
                throw new ProcessException(-1007, "获取本地数据异常，本地无License文件");
            }
            if (bVar == null) {
                throw new ProcessException(-1001, "获取数据异常");
            }
            Exception exc = bVar.d;
            if (exc instanceof SocketTimeoutException) {
                throw new ProcessException(-1004, "网络超时");
            }
            if ((exc instanceof HttpRetryException) || (exc instanceof MalformedURLException) || (exc instanceof ProtocolException) || (exc instanceof URISyntaxException) || (exc instanceof SocketException)) {
                throw new ProcessException(-1003, "网络链接异常");
            }
            if ((exc instanceof UnknownHostException) || (exc instanceof UnknownServiceException)) {
                throw new ProcessException(-1005, "服务异常");
            }
            throw new ProcessException(-1000, "网络未知异常");
        }
        T a2 = a(str2);
        JSONObject jSONObject = a2.b;
        if (jSONObject == null) {
            throw new ProcessException(-1001, a(bVar, "license 数据解析错误"));
        }
        if (jSONObject == null || jSONObject.optInt("status", -1) != 0) {
            JSONObject jSONObject2 = a2.b;
            int optInt = jSONObject2 != null ? jSONObject2.optInt("status", -1) : -1;
            JSONObject jSONObject3 = a2.b;
            String optString = jSONObject3 != null ? jSONObject3.optString("message") : null;
            if (TextUtils.isEmpty(optString)) {
                optString = "license 数据服务错误";
            }
            throw new ProcessException(optInt, a(bVar, optString));
        }
        LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "开始校验 license 数据");
        ArrayList a3 = a(i, authParam, a2);
        if (a3 != null && !a3.isEmpty()) {
            Iterator it = a3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a aVar = (a) it.next();
                int i3 = aVar.f8245a;
                AuthCore.AuthParam authParam2 = aVar.b;
                T t = aVar.c;
                if (!(((i3 != 0 && i3 != 1) || authParam2 == null || t == 0) ? false : aVar.a(i3, authParam2, t))) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            throw new ProcessException(-1006, a(bVar, "license 校验失败"));
        }
        LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "校验 license 数据完成");
        if (i == 0) {
            LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "更新本地 license 缓存");
            b(authParam, a2);
        }
        LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "数据通过接入点开始");
        a(authParam, a2);
        LogUtil.getInstance().i("BaseLicenseAuthDataStandardProcess", "数据通过接入点结束");
        return a(a2);
    }

    public void a(AuthCore.AuthParam authParam, b bVar) throws ProcessException {
    }

    public abstract String b(AuthCore.AuthParam authParam);

    public abstract boolean b(AuthCore.AuthParam authParam, T t);

    public abstract com.baidu.mapauto.auth.net.b c(AuthCore.AuthParam authParam) throws Exception;

    public static String a(com.baidu.mapauto.auth.net.b bVar, String str) {
        Integer num;
        return (bVar == null || (num = bVar.f8250a) == null || num.intValue() == 200) ? str : Separators.LPAREN + num + Separators.RPAREN + str;
    }
}
