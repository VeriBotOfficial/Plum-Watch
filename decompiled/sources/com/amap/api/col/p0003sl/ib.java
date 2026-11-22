package com.amap.api.col.p0003sl;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BinaryRequest.java */
/* loaded from: classes11.dex */
public abstract class ib extends h9 {
    protected Context mContext;
    protected byte[] mDatas;
    protected l9 mSDKInfo;

    public ib(Context context, l9 l9Var) {
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        this.mSDKInfo = l9Var;
        setBinary(true);
    }

    private static byte[] c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(m9.e("PANDORA$"));
            byteArrayOutputStream.write(new byte[]{1});
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                return byteArray;
            } catch (Throwable th) {
                return byteArray;
            }
        } catch (Throwable th2) {
            try {
                fa.a(th2, "bre", "gbh");
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (Throwable th3) {
                    fa.a(th3, "bre", "gbh");
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    fa.a(th4, "bre", "gbh");
                }
            }
        }
    }

    private byte[] d() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] rawDatas = getRawDatas();
            if (rawDatas != null && rawDatas.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byteArrayOutputStream.write(getDatasLength(rawDatas));
                byteArrayOutputStream.write(rawDatas);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    return byteArray;
                } catch (Throwable th) {
                    return byteArray;
                }
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray2;
            } catch (Throwable th2) {
                fa.a(th2, "bre", "grrd");
                return byteArray2;
            }
        } catch (Throwable th3) {
            try {
                fa.a(th3, "bre", "grrd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    fa.a(th4, "bre", "grrd");
                }
                return new byte[]{0};
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    fa.a(th5, "bre", "grrd");
                }
            }
        }
    }

    private byte[] e() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] rsaAesRawDatas = getRsaAesRawDatas();
            if (rsaAesRawDatas != null && rsaAesRawDatas.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byte[] d = f9.d(rsaAesRawDatas);
                byteArrayOutputStream.write(getDatasLength(d));
                byteArrayOutputStream.write(d);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    return byteArray;
                } catch (Throwable th) {
                    return byteArray;
                }
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray2;
            } catch (Throwable th2) {
                fa.a(th2, "bre", "gred");
                return byteArray2;
            }
        } catch (Throwable th3) {
            try {
                fa.a(th3, "bre", "gred");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    fa.a(th4, "bre", "gred");
                }
                return new byte[]{0};
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    fa.a(th5, "bre", "gred");
                }
            }
        }
    }

    protected byte[] getDatasLength(byte[] bArr) {
        return m9.a(bArr.length, 2);
    }

    @Override // com.amap.api.col.p0003sl.ob
    public final byte[] getEntityBytes() {
        byte[] bArr = this.mDatas;
        if (bArr != null) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(c());
            byteArrayOutputStream.write(getPublicData());
            byteArrayOutputStream.write(d());
            byteArrayOutputStream.write(e());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.mDatas = byteArray;
            try {
                return byteArray;
            } catch (Throwable th) {
                return byteArray;
            }
        } catch (Throwable th2) {
            try {
                fa.a(th2, "bre", "geb");
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (Throwable th3) {
                    fa.a(th3, "bre", "geb");
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    fa.a(th4, "bre", "geb");
                }
            }
        }
    }

    protected String getLogVersion() {
        return "2.1";
    }

    @Override // com.amap.api.col.p0003sl.ob
    public Map<String, String> getParams() {
        String e = z8.e(this.mContext);
        String a2 = c9.a();
        String a3 = c9.a(this.mContext, a2, "key=".concat(String.valueOf(e)));
        HashMap hashMap = new HashMap();
        hashMap.put("ts", a2);
        hashMap.put("key", e);
        hashMap.put("scode", a3);
        return hashMap;
    }

    public String getPlatInfo() {
        return String.format("platform=Android&sdkversion=%s&product=%s", this.mSDKInfo.b(), this.mSDKInfo.d());
    }

    public byte[] getPublicData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{3});
            if (getXinfoFlag()) {
                Context context = this.mContext;
                boolean isLocRequest = isLocRequest();
                l9 l9Var = this.mSDKInfo;
                byte[] a2 = c9.a(context, isLocRequest, l9Var != null && "navi".equals(l9Var.d()));
                byteArrayOutputStream.write(getDatasLength(a2));
                byteArrayOutputStream.write(a2);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] e = m9.e(getLogVersion());
            if (e == null || e.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(getDatasLength(e));
                byteArrayOutputStream.write(e);
            }
            byte[] e2 = m9.e(getPlatInfo());
            if (e2 == null || e2.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(getDatasLength(e2));
                byteArrayOutputStream.write(e2);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                return byteArray;
            } catch (Throwable th) {
                return byteArray;
            }
        } catch (Throwable th2) {
            try {
                fa.a(th2, "bre", "gpd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    fa.a(th3, "bre", "gred");
                }
                return new byte[]{0};
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    fa.a(th4, "bre", "gred");
                }
            }
        }
    }

    public abstract byte[] getRawDatas();

    @Override // com.amap.api.col.p0003sl.ob
    public abstract Map<String, String> getRequestHead();

    public abstract byte[] getRsaAesRawDatas();

    @Override // com.amap.api.col.p0003sl.ob
    public abstract String getURL();

    public boolean getXinfoFlag() {
        return true;
    }

    protected boolean isLocRequest() {
        return false;
    }
}
