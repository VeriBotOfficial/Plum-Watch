package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.5j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C12525j {
    public static String[] A05 = {"kbrCq6pMhmUkuvpwyFR35DcipjG4S8CW", "oaW9l9tdb", "0TRcVMdqb51VWoFscAzJe", "b9KyZslhVmWVmt6Bq2rIk", "ASY6aJ5KLIO5E4dZs7qVgEBqztuPzXSE", "", "9Pc37QLTRQIuoUm", "qelQYpgVCE3t9Ri2JAAORJatu68jVLQj"};
    public final int A00;
    public final int A01;
    public final C2905or A02;
    public final C2905or A03;
    public final String A04;

    public C12525j(String str, C2905or c2905or, C2905or c2905or2, int i, int i2) {
        C3M.A07(i == 0 || i2 == 0);
        this.A04 = C3M.A05(str);
        this.A03 = (C2905or) C3M.A01(c2905or);
        this.A02 = (C2905or) C3M.A01(c2905or2);
        this.A01 = i;
        this.A00 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12525j c12525j = (C12525j) obj;
        if (this.A01 == c12525j.A01 && this.A00 == c12525j.A00 && this.A04.equals(c12525j.A04)) {
            boolean equals = this.A03.equals(c12525j.A03);
            String[] strArr = A05;
            if (strArr[5].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A05[6] = "94n8VTHvI2C2zF2";
            if (equals && this.A02.equals(c12525j.A02)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.A01;
        int hashCode2 = ((((17 * 31) + hashCode) * 31) + this.A00) * 31;
        int hashCode3 = this.A04.hashCode();
        int hashCode4 = (((hashCode2 + hashCode3) * 31) + this.A03.hashCode()) * 31;
        int hashCode5 = this.A02.hashCode();
        return hashCode4 + hashCode5;
    }
}
