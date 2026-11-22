package com.facebook.ads.redexgen.core;

import android.os.AsyncTask;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SY<T> extends AsyncTask<Void, Void, T> {
    public static byte[] A04;
    public EnumC1821Sb A00;
    public final C2202cu A01;
    public final AbstractC1822Sc<T> A02;
    public final AbstractC1852Tg<T> A03;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{5, 2, 21, 2, 3, 2, 20, 6};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.SY != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Sc != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Tg != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public SY(C2202cu c2202cu, AbstractC1822Sc<T> abstractC1822Sc, AbstractC1852Tg<T> abstractC1852Tg) {
        this.A02 = abstractC1822Sc;
        this.A03 = abstractC1852Tg;
        this.A01 = c2202cu;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.SY != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    private final T A00(Void... voidArr) {
        if (AbstractC1907Vl.A02(this)) {
            return null;
        }
        T t = null;
        try {
            try {
                t = this.A02.A03();
                this.A00 = this.A02.A00();
                return t;
            } catch (Exception e) {
                this.A01.A08().AAy(A01(0, 8, 89), AbstractC1841Sv.A0w, new C1842Sw(e));
                this.A00 = EnumC1821Sb.A08;
                return t;
            }
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
            return null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.SY != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) {
        if (AbstractC1907Vl.A02(this)) {
            return null;
        }
        try {
            return A00(voidArr);
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
            return null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.SY != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    @Override // android.os.AsyncTask
    public final void onPostExecute(T result) {
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                this.A03.A02(result);
            } else {
                this.A03.A01(this.A00.A03(), this.A00.A04());
            }
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
