package oqmg;

import android.content.SharedPreferences;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.e;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, SharedPreferences> f18751a = new ConcurrentHashMap();

    public static SharedPreferences a(String str) {
        SharedPreferences sharedPreferences;
        if (f18751a.containsKey(str)) {
            return f18751a.get(str);
        }
        if (e.a() == null) {
            return null;
        }
        try {
            sharedPreferences = (SharedPreferences) Class.forName("com.tencent.mmkv.MMKV").getMethod("mmkvWithID", Integer.class).invoke(str, 2);
        } catch (Throwable unused) {
            sharedPreferences = e.a().getSharedPreferences(str, 4);
        }
        n.c("MMKVHelper", "craete shrPref : " + str + " , supportmmkv : " + oqme.a.e(), new Object[0]);
        f18751a.put(str, sharedPreferences);
        return sharedPreferences;
    }
}
