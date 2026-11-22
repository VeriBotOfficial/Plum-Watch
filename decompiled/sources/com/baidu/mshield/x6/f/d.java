package com.baidu.mshield.x6.f;

import android.text.TextUtils;
import org.json.JSONArray;

/* compiled from: BitOperationUtil.java */
/* loaded from: classes13.dex */
public class d {
    public static int a(int i, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return -1;
            }
            if (jSONArray.length() == 1) {
                return jSONArray.optInt(0);
            }
            if (i == 1) {
                return a(jSONArray);
            }
            if (i == 2) {
                return d(jSONArray);
            }
            if (i == 3) {
                return e(jSONArray);
            }
            if (i == 4) {
                return b(jSONArray);
            }
            if (i != 5) {
                return -1;
            }
            return c(jSONArray);
        } catch (Throwable th) {
            f.b(th);
            return -1;
        }
    }

    public static int b(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    if (jSONArray.length() == 1) {
                        return jSONArray.optInt(0);
                    }
                    int optInt = jSONArray.optInt(0);
                    for (int i = 1; i < jSONArray.length(); i++) {
                        optInt <<= jSONArray.optInt(i);
                    }
                    return optInt;
                }
            } catch (Throwable th) {
                f.b(th);
            }
        }
        return 0;
    }

    public static int c(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    if (jSONArray.length() == 1) {
                        return jSONArray.optInt(0);
                    }
                    int optInt = jSONArray.optInt(0);
                    for (int i = 1; i < jSONArray.length(); i++) {
                        optInt >>= jSONArray.optInt(i);
                    }
                    return optInt;
                }
            } catch (Throwable th) {
                f.b(th);
            }
        }
        return 0;
    }

    public static int d(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    if (jSONArray.length() == 1) {
                        return jSONArray.optInt(0);
                    }
                    int optInt = jSONArray.optInt(0);
                    for (int i = 1; i < jSONArray.length(); i++) {
                        optInt |= jSONArray.optInt(i);
                    }
                    return optInt;
                }
            } catch (Throwable th) {
                f.b(th);
            }
        }
        return 0;
    }

    public static int e(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    if (jSONArray.length() == 1) {
                        return jSONArray.optInt(0);
                    }
                    int optInt = jSONArray.optInt(0);
                    for (int i = 1; i < jSONArray.length(); i++) {
                        optInt ^= jSONArray.optInt(i);
                    }
                    return optInt;
                }
            } catch (Throwable th) {
                f.b(th);
            }
        }
        return 0;
    }

    public static int a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    if (jSONArray.length() == 1) {
                        return jSONArray.optInt(0);
                    }
                    int optInt = jSONArray.optInt(0);
                    for (int i = 1; i < jSONArray.length(); i++) {
                        optInt &= jSONArray.optInt(i);
                    }
                    return optInt;
                }
            } catch (Throwable th) {
                f.b(th);
            }
        }
        return 0;
    }
}
