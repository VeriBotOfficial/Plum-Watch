package com.baidu.platform.comapi.license;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mapapi.CommonInfo;
import com.baidu.mapauto.auth.AuthCore;
import com.baidu.mapauto.auth.ILicenseAuthListener;
import com.baidu.mapauto.auth.LicenseAuth;
import com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess;
import com.baidu.mapsdkplatform.comapi.Initializer;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import com.baidu.mapsdkplatform.comapi.util.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes13.dex */
public class LicenseAuthManager implements ILicenseAuthManager {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<b, Map<String, Integer>> f8564a = new HashMap();
    private static final Set<d<ILicenseAuthManagerListener>> b = new HashSet();
    private static final Map<Integer, Integer> c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final int m;
    private final List<IExtraLicenseAuth> n;
    private ILicenseAuthListener o;

    public static class Builder {
        private String mAk;
        private String mAppVersion;
        private String mChannel;
        private String mCuid;
        private String mDeviceId;
        private List<IExtraLicenseAuth> mExtraLicenseAuths;
        private String mFunctionName;
        private String mModel;
        private String mOsVersion;
        private String mServiceName;
        private int mType;

        public Builder ak(String str) {
            this.mAk = str;
            return this;
        }

        public Builder appVersion(String str) {
            this.mAppVersion = str;
            return this;
        }

        public ILicenseAuthManager build() {
            return new LicenseAuthManager(this.mAk, this.mChannel, this.mDeviceId, this.mCuid, this.mAppVersion, this.mOsVersion, this.mModel, this.mServiceName, this.mFunctionName, this.mType, this.mExtraLicenseAuths);
        }

        public Builder channel(String str) {
            this.mChannel = str;
            return this;
        }

        public Builder cuid(String str) {
            this.mCuid = str;
            return this;
        }

        public Builder deviceId(String str) {
            this.mDeviceId = str;
            return this;
        }

        public Builder extraAuth(List<IExtraLicenseAuth> list) {
            this.mExtraLicenseAuths = list;
            return this;
        }

        public Builder functionName(String str) {
            this.mFunctionName = str;
            return this;
        }

        public Builder model(String str) {
            this.mModel = str;
            return this;
        }

        public Builder osVersion(String str) {
            this.mOsVersion = str;
            return this;
        }

        public Builder serviceName(String str) {
            this.mServiceName = str;
            return this;
        }

        public Builder type(int i) {
            this.mType = i;
            return this;
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f8565a;
        private final String b;
        private final String c;

        public b(String str, String str2, int i) {
            this.b = str;
            this.c = str2;
            this.f8565a = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return ("" + this.b + "" + this.c + "" + this.f8565a).equals("" + bVar.b + "" + bVar.c + "" + bVar.f8565a);
        }

        public int hashCode() {
            if (TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.c)) {
                return super.hashCode();
            }
            int i = this.f8565a;
            if (!TextUtils.isEmpty(this.b)) {
                i = (i * 31) + this.b.hashCode();
            }
            return !TextUtils.isEmpty(this.c) ? (i * 31) + this.c.hashCode() : i;
        }
    }

    private class c implements ILicenseAuthListener {

        /* renamed from: a, reason: collision with root package name */
        private final ILicenseAuthManagerListener f8566a;

        public c(ILicenseAuthManagerListener iLicenseAuthManagerListener) {
            this.f8566a = iLicenseAuthManagerListener;
        }

        @Override // com.baidu.mapauto.auth.ILicenseAuthListener
        public void onError(int i, String str, Exception exc) {
            String str2;
            int a2 = LicenseAuthManager.this.a(i);
            LicenseAuthManager.f8564a.remove(new b(LicenseAuthManager.this.k, LicenseAuthManager.this.l, LicenseAuthManager.this.m));
            ILicenseAuthManagerListener iLicenseAuthManagerListener = this.f8566a;
            if (iLicenseAuthManagerListener != null) {
                str2 = str;
                iLicenseAuthManagerListener.onError(LicenseAuthManager.this.k, LicenseAuthManager.this.l, LicenseAuthManager.this.m, a2, str2);
            } else {
                str2 = str;
            }
            LicenseAuthManager licenseAuthManager = LicenseAuthManager.this;
            licenseAuthManager.a(licenseAuthManager.k, LicenseAuthManager.this.l, LicenseAuthManager.this.m, a2, str2);
        }

        @Override // com.baidu.mapauto.auth.ILicenseAuthListener
        public void onSuccess(Map<String, Integer> map) {
            LicenseAuthManager.f8564a.put(new b(LicenseAuthManager.this.k, LicenseAuthManager.this.l, LicenseAuthManager.this.m), map);
            ILicenseAuthManagerListener iLicenseAuthManagerListener = this.f8566a;
            if (iLicenseAuthManagerListener != null) {
                iLicenseAuthManagerListener.onSuccess(LicenseAuthManager.this.k, LicenseAuthManager.this.l, LicenseAuthManager.this.m, map);
            }
            LicenseAuthManager licenseAuthManager = LicenseAuthManager.this;
            licenseAuthManager.a(licenseAuthManager.k, LicenseAuthManager.this.l, LicenseAuthManager.this.m, map);
        }
    }

    private static class d<T> extends WeakReference<T> {
        public d(T t) {
            super(t);
        }

        public boolean equals(Object obj) {
            T t = get();
            return t != null ? t.equals(obj) : super.equals(obj);
        }

        public int hashCode() {
            T t = get();
            return t != null ? t.hashCode() : super.hashCode();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put(0, 0);
        hashMap.put(-1001, 1);
        hashMap.put(-1002, 2);
        hashMap.put(-1003, 100);
        hashMap.put(-1004, 101);
        hashMap.put(-1005, 102);
        hashMap.put(-1006, 202);
        hashMap.put(-1000, 1000);
    }

    public static void addLicenseAuthLicense(ILicenseAuthManagerListener iLicenseAuthManagerListener) {
        b.add(new d<>(iLicenseAuthManagerListener));
    }

    public static void removeLicenseAuthLicense(ILicenseAuthManagerListener iLicenseAuthManagerListener) {
        Iterator<d<ILicenseAuthManagerListener>> it = b.iterator();
        while (it.hasNext()) {
            ILicenseAuthManagerListener iLicenseAuthManagerListener2 = it.next().get();
            if (iLicenseAuthManagerListener2 == null) {
                it.remove();
            } else if (iLicenseAuthManagerListener2 == iLicenseAuthManagerListener) {
                it.remove();
            }
        }
    }

    @Override // com.baidu.platform.comapi.license.ILicenseAuthManager
    public boolean isEffective(String str, String str2) {
        return new StringBuilder("").append(this.k).toString().equals(new StringBuilder("").append(str).toString()) && new StringBuilder("").append(this.l).toString().equals(new StringBuilder("").append(str2).toString());
    }

    @Override // com.baidu.platform.comapi.license.ILicenseAuthManager
    public boolean isHaveAuthority() {
        Integer num;
        Map<String, Integer> map = f8564a.get(new b(this.k, this.l, this.m));
        return (map == null || (num = map.get(this.l)) == null || num.intValue() != 0) ? false : true;
    }

    @Override // com.baidu.platform.comapi.license.ILicenseAuthManager
    public void loadAuth(Context context, ILicenseAuthManagerListener iLicenseAuthManagerListener) {
        try {
            b();
            HashMap hashMap = new HashMap();
            hashMap.put(AuthCore.AuthParam.KEY_EXTRA_CUID, this.g);
            hashMap.put(AuthCore.AuthParam.KEY_EXTRA_APP_VERSION, this.h);
            hashMap.put(AuthCore.AuthParam.KEY_EXTRA_OS_VERSION, this.i);
            hashMap.put(AuthCore.AuthParam.KEY_EXTRA_MODEL, this.j);
            this.o = new c(iLicenseAuthManagerListener);
            LicenseAuth.getInstance().loadAuth(context, this.d, this.e, this.f, this.k, this.l, this.m, hashMap, this.o);
        } catch (BaseLicenseAuthDataStandardProcess.ProcessException e) {
            int code = e.getCode();
            String message = e.getMessage();
            f8564a.remove(new b(this.k, this.l, this.m));
            if (iLicenseAuthManagerListener != null) {
                iLicenseAuthManagerListener.onError(this.k, this.l, this.m, code, message);
            }
            a(this.k, this.l, this.m, code, message);
        }
    }

    @Override // com.baidu.platform.comapi.license.ILicenseAuthManager
    public Map<String, Integer> loadLocalAuth(Context context) throws BaseLicenseAuthDataStandardProcess.ProcessException {
        b();
        try {
            return LicenseAuth.getInstance().loadLocalAuth(context, this.d, this.e, this.f, this.k, this.l, this.m);
        } catch (BaseLicenseAuthDataStandardProcess.ProcessException e) {
            throw new BaseLicenseAuthDataStandardProcess.ProcessException(a(e.getCode()), e.getMessage());
        }
    }

    private LicenseAuthManager(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, List<IExtraLicenseAuth> list) {
        this.d = TextUtils.isEmpty(str) ? PermissionCheck.getApiKey() : str;
        CommonInfo commonInfo = Initializer.getCommonInfo();
        if (TextUtils.isEmpty(str2)) {
            this.e = commonInfo == null ? "" : commonInfo.getChannel();
        } else {
            this.e = str2;
        }
        if (TextUtils.isEmpty(str3)) {
            this.f = commonInfo != null ? commonInfo.getShareDeviceId() : "";
        } else {
            this.f = str3;
        }
        this.g = TextUtils.isEmpty(str4) ? g.c() : str4;
        this.h = TextUtils.isEmpty(str5) ? g.o() : str5;
        this.i = TextUtils.isEmpty(str6) ? g.k() : str6;
        this.j = TextUtils.isEmpty(str7) ? g.l() : str7;
        this.k = str8;
        this.l = str9;
        this.m = i;
        this.n = list;
    }

    private void b() throws BaseLicenseAuthDataStandardProcess.ProcessException {
        List<IExtraLicenseAuth> list = this.n;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<IExtraLicenseAuth> it = list.iterator();
        while (it.hasNext()) {
            it.next().check();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, Map<String, Integer> map) {
        Iterator<d<ILicenseAuthManagerListener>> it = b.iterator();
        while (it.hasNext()) {
            ILicenseAuthManagerListener iLicenseAuthManagerListener = it.next().get();
            if (iLicenseAuthManagerListener == null) {
                it.remove();
            } else {
                iLicenseAuthManagerListener.onSuccess(str, str2, i, map);
            }
        }
    }

    @Override // com.baidu.platform.comapi.license.ILicenseAuthManager
    public boolean isHaveAuthority(Map<String, Integer> map) {
        Integer num;
        return (map == null || (num = map.get(this.l)) == null || num.intValue() != 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, int i2, String str3) {
        Iterator<d<ILicenseAuthManagerListener>> it = b.iterator();
        while (it.hasNext()) {
            ILicenseAuthManagerListener iLicenseAuthManagerListener = it.next().get();
            if (iLicenseAuthManagerListener == null) {
                it.remove();
            } else {
                iLicenseAuthManagerListener.onError(str, str2, i, i2, str3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i) {
        Integer num = c.get(Integer.valueOf(i));
        return num == null ? i : num.intValue();
    }
}
