package com.bytedance.adsdk.fxn.kg.rb;

import com.bytedance.adsdk.fxn.kg.hm.gff;
import com.bytedance.adsdk.fxn.kg.hm.hm;
import com.bytedance.adsdk.fxn.kg.kg.fxn.bh;
import com.bytedance.adsdk.fxn.kg.kg.fxn.dgx;
import com.bytedance.adsdk.fxn.kg.kg.fxn.je;
import com.bytedance.adsdk.fxn.kg.kg.fxn.jq;
import com.bytedance.adsdk.fxn.kg.kg.fxn.mvp;
import com.bytedance.adsdk.fxn.kg.kg.fxn.rb;
import com.bytedance.adsdk.fxn.kg.kg.fxn.rlu;
import com.bytedance.adsdk.fxn.kg.kg.fxn.rmu;
import com.bytedance.adsdk.fxn.kg.kg.fxn.tw;
import com.bytedance.adsdk.fxn.kg.kg.fxn.ud;
import com.bytedance.adsdk.fxn.kg.kg.fxn.zu;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes13.dex */
public class kg {
    public static com.bytedance.adsdk.fxn.kg.kg.fxn fxn(List<com.bytedance.adsdk.fxn.kg.kg.fxn> list, String str, int i) {
        gff(list, str, i);
        Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> fxn = fxn(kg(list, str, i));
        if (fxn.size() != 1) {
            throw new IllegalStateException();
        }
        return fxn.getFirst();
    }

    private static Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> fxn(Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.fxn.kg.kg.fxn) linkedList.peekLast()).fxn() == gff.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar2 = (com.bytedance.adsdk.fxn.kg.kg.fxn) linkedList.pollLast();
                if (((com.bytedance.adsdk.fxn.kg.kg.fxn) linkedList.pollLast()).fxn() != gff.QUESTION) {
                    throw new IllegalStateException();
                }
                com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar3 = (com.bytedance.adsdk.fxn.kg.kg.fxn) linkedList.pollLast();
                ud udVar = new ud();
                udVar.fxn(fxnVar3);
                udVar.kg(fxnVar2);
                udVar.gff(fxnVar);
                linkedList.addLast(udVar);
            } else {
                linkedList.addLast(fxnVar);
            }
        }
        return linkedList;
    }

    private static Deque<com.bytedance.adsdk.fxn.kg.kg.fxn> kg(List<com.bytedance.adsdk.fxn.kg.kg.fxn> list, String str, int i) {
        LinkedList<com.bytedance.adsdk.fxn.kg.kg.fxn> linkedList = new LinkedList(list);
        int i2 = 5;
        while (i2 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar : linkedList) {
                if (!linkedList2.isEmpty() && gff.fxn(((com.bytedance.adsdk.fxn.kg.kg.fxn) linkedList2.peekLast()).fxn()) && ((gff) ((com.bytedance.adsdk.fxn.kg.kg.fxn) linkedList2.peekLast()).fxn()).kg() == i2) {
                    com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar2 = (com.bytedance.adsdk.fxn.kg.kg.fxn) linkedList2.pollLast();
                    com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar3 = (com.bytedance.adsdk.fxn.kg.kg.fxn) linkedList2.pollLast();
                    if (!gff.fxn(fxnVar3.fxn()) && !gff.fxn(fxnVar.fxn())) {
                        linkedList2.addLast(fxn(fxnVar3, fxnVar2, fxnVar));
                    } else {
                        throw new IllegalArgumentException(str.substring(0, i));
                    }
                } else {
                    linkedList2.addLast(fxnVar);
                }
            }
            i2--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    private static void gff(List<com.bytedance.adsdk.fxn.kg.kg.fxn> list, String str, int i) {
        Iterator<com.bytedance.adsdk.fxn.kg.kg.fxn> it = list.iterator();
        while (it.hasNext()) {
            if (hm.fxn(it.next().fxn())) {
                throw new IllegalArgumentException(str.substring(0, i));
            }
        }
    }

    /* renamed from: com.bytedance.adsdk.fxn.kg.rb.kg$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fxn;

        static {
            int[] iArr = new int[gff.values().length];
            fxn = iArr;
            try {
                iArr[gff.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fxn[gff.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                fxn[gff.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                fxn[gff.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                fxn[gff.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                fxn[gff.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                fxn[gff.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                fxn[gff.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                fxn[gff.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                fxn[gff.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                fxn[gff.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                fxn[gff.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                fxn[gff.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static com.bytedance.adsdk.fxn.kg.kg.fxn fxn(com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar, com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar2, com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar3) {
        rmu dgxVar;
        switch (AnonymousClass1.fxn[((gff) fxnVar2.fxn()).ordinal()]) {
            case 1:
                dgxVar = new dgx();
                break;
            case 2:
                dgxVar = new je();
                break;
            case 3:
                dgxVar = new com.bytedance.adsdk.fxn.kg.kg.fxn.fxn();
                break;
            case 4:
                dgxVar = new rlu();
                break;
            case 5:
                dgxVar = new mvp();
                break;
            case 6:
                dgxVar = new com.bytedance.adsdk.fxn.kg.kg.fxn.hm();
                break;
            case 7:
                dgxVar = new zu();
                break;
            case 8:
                dgxVar = new bh();
                break;
            case 9:
                dgxVar = new jq();
                break;
            case 10:
                dgxVar = new rb();
                break;
            case 11:
                dgxVar = new tw();
                break;
            case 12:
                dgxVar = new com.bytedance.adsdk.fxn.kg.kg.fxn.kg();
                break;
            case 13:
                dgxVar = new com.bytedance.adsdk.fxn.kg.kg.fxn.gff();
                break;
            default:
                throw new UnsupportedOperationException(fxnVar2.fxn().toString());
        }
        dgxVar.fxn(fxnVar);
        dgxVar.kg(fxnVar3);
        return dgxVar;
    }

    public static boolean fxn(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
