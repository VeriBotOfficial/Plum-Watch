package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.mw0;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class t42 extends ti0 {
    public static final Parcelable.Creator<t42> CREATOR = new a();
    public final String c;
    public final String d;

    final class a implements Parcelable.Creator<t42> {
        @Override // android.os.Parcelable.Creator
        public final t42 createFromParcel(Parcel parcel) {
            return new t42(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final t42[] newArray(int i) {
            return new t42[i];
        }

        a() {
        }
    }

    @Override // com.yandex.mobile.ads.impl.ti0
    public final String toString() {
        return this.b + ": description=" + this.c + ": value=" + this.d;
    }

    private static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    t42(Parcel parcel) {
        super((String) f92.a(parcel.readString()));
        this.c = parcel.readString();
        this.d = (String) f92.a(parcel.readString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.mobile.ads.impl.k01.b
    public final void a(mw0.a aVar) {
        char c;
        String str = this.b;
        str.getClass();
        str.hashCode();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    aVar.b(this.d);
                    break;
                case 1:
                case 11:
                    aVar.d(this.d);
                    break;
                case 2:
                case '\f':
                    aVar.b(Integer.valueOf(Integer.parseInt(this.d.substring(2, 4)))).a(Integer.valueOf(Integer.parseInt(this.d.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    aVar.c(this.d);
                    break;
                case 4:
                case 18:
                    aVar.a(this.d);
                    break;
                case 5:
                case 19:
                    aVar.e(this.d);
                    break;
                case 6:
                case 20:
                    String str2 = this.d;
                    int i = f92.f15466a;
                    String[] split = str2.split("/", -1);
                    aVar.h(Integer.valueOf(Integer.parseInt(split[0]))).g(split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null);
                    break;
                case 7:
                case 16:
                    aVar.i(this.d);
                    break;
                case '\b':
                case 15:
                    aVar.j(this.d);
                    break;
                case '\t':
                case 21:
                    aVar.c(Integer.valueOf(Integer.parseInt(this.d)));
                    break;
                case '\r':
                    ArrayList a2 = a(this.d);
                    int size = a2.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.a((Integer) a2.get(2));
                            }
                        }
                        aVar.b((Integer) a2.get(1));
                    }
                    aVar.c((Integer) a2.get(0));
                    break;
                case 14:
                    ArrayList a3 = a(this.d);
                    int size2 = a3.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.d((Integer) a3.get(2));
                            }
                        }
                        aVar.e((Integer) a3.get(1));
                    }
                    aVar.f((Integer) a3.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public t42(String str, String str2, String str3) {
        super(str);
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t42.class == obj.getClass()) {
            t42 t42Var = (t42) obj;
            if (f92.a(this.b, t42Var.b) && f92.a(this.c, t42Var.c) && f92.a(this.d, t42Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a2 = v3.a(this.b, 527, 31);
        String str = this.c;
        int hashCode = (a2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
