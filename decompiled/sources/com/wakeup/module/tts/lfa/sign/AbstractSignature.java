package com.wakeup.module.tts.lfa.sign;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.SignatureException;

/* loaded from: classes4.dex */
public abstract class AbstractSignature {
    private String encryptType;

    /* renamed from: id, reason: collision with root package name */
    private String f14344id;
    private String key;
    private String originSign;
    protected String requestMethod;
    protected String signa;
    private String ts;
    private String url;

    public abstract String getSigna() throws SignatureException;

    public AbstractSignature(String str, String str2, String str3) {
        this.requestMethod = "GET";
        this.f14344id = str;
        this.key = str2;
        this.url = str3;
        this.ts = generateTs();
    }

    public AbstractSignature(String str, String str2, String str3, boolean z) {
        this.requestMethod = "GET";
        this.f14344id = str;
        this.key = str2;
        this.url = str3;
        if (z) {
            this.requestMethod = "POST";
        } else {
            this.requestMethod = "GET";
        }
        this.ts = generateTs();
    }

    public String generateTs() {
        return String.valueOf(System.currentTimeMillis() / 1000);
    }

    public String generateOriginSign() throws SignatureException {
        try {
            URL url = new URL(getUrl());
            return "host: " + url.getHost() + "\ndate: " + getTs() + "\nGET " + url.getPath() + " HTTP/1.1";
        } catch (MalformedURLException e) {
            throw new SignatureException("MalformedURLException:" + e.getMessage());
        }
    }

    public String getId() {
        return this.f14344id;
    }

    public void setId(String str) {
        this.f14344id = str;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public String getOriginSign() {
        return this.originSign;
    }

    public void setOriginSign(String str) {
        this.originSign = str;
    }

    public String getTs() {
        return this.ts;
    }

    public void setTs(String str) {
        this.ts = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getEncryptType() {
        return this.encryptType;
    }

    public void setEncryptType(String str) {
        this.encryptType = str;
    }
}
