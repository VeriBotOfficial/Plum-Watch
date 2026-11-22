package com.autonavi.aps.amapapi.restruct;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.pc;
import com.amap.location.support.bean.cell.AmapCell;
import com.amap.location.support.bean.cell.AmapCellCdma;
import com.amap.location.support.bean.cell.AmapCellGsm;
import com.amap.location.support.bean.cell.AmapCellLte;
import com.amap.location.support.bean.cell.AmapCellWcdma;
import com.autonavi.aps.amapapi.ICollectionManager;
import com.autonavi.aps.amapapi.config.Const;
import com.autonavi.aps.amapapi.utils.CoreUtil;
import com.autonavi.aps.amapapi.utils.DebugUtils;
import com.autonavi.aps.amapapi.utils.Utils;
import com.hjq.permissions.Permission;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class CgiManager {
    public static final String HAS_FINE_LOC_PERM = "hasFineLocPerm";
    public static final String HAS_NO_FINE_LOC_PERM = "hasNoFineLocPerm";
    public static final String HAS_NO_READ_PHONESTATE_PERM = "hasNoReadPhoneStatePerm";
    public static final String HAS_READ_PHONESTATE_PERM = "hasReadPhoneStatePerm";
    public static final int MASK_NEW_VERSION_INDICATOR = 4;
    public static final int MASK_OPERATOR_INDICATOR = 8;
    public static final int MASK_V1_CELL_TYPE = 3;

    /* renamed from: a, reason: collision with root package name */
    private Context f6679a;
    TelephonyManager g;
    private CellAgeEstimator h;
    SignalStrength k;
    private TelephonyManager.CellInfoCallback m;
    private ICollectionManager w;
    private boolean b = false;
    private boolean c = false;
    ArrayList<Cgi> d = new ArrayList<>();
    private String e = null;
    private ArrayList<Cgi> f = new ArrayList<>();
    private long i = 0;
    PhoneStateListener j = null;
    private Object l = new Object();
    private boolean n = false;
    boolean o = false;
    StringBuilder p = null;

    /* renamed from: q, reason: collision with root package name */
    private String f6680q = null;
    private String r = null;
    String s = null;
    private volatile boolean t = true;
    private volatile boolean u = true;
    private volatile boolean v = false;

    class CellInfoCallBack extends TelephonyManager.CellInfoCallback {
        CellInfoCallBack() {
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
            try {
                DebugUtils.writeCat("CgiManager", "CellInfoCallBack onCellInfo");
                DebugUtils.writeCat("CgiManager", "noLocReqCgiEnable:" + CgiManager.this.u + " isStartLocation:" + CgiManager.this.t);
                if ((CgiManager.this.u || CgiManager.this.t) && Utils.getTimeBoot() - CgiManager.this.i >= 500) {
                    CgiManager.this.n = true;
                    CgiManager.this.a(CgiManager.this.e());
                    CgiManager.this.a(list);
                    CgiManager.this.i = Utils.getTimeBoot();
                }
            } catch (SecurityException e) {
                CgiManager.this.s = e.getMessage();
            } catch (Throwable th) {
                CoreUtil.reportError(th, "Cgi", "cellInfo");
            }
        }
    }

    class CgiPhoneListener extends PhoneStateListener {
        CgiPhoneListener() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCellInfoChanged(List<CellInfo> list) {
            try {
                DebugUtils.writeCat("CgiManager", "CgiPhoneListener onCellInfoChanged");
                DebugUtils.writeCat("CgiManager", "noLocReqCgiEnable:" + CgiManager.this.u + " isStartLocation:" + CgiManager.this.t);
                if (CgiManager.this.u || CgiManager.this.t) {
                    if (CgiManager.this.w != null) {
                        CgiManager.this.w.updateCell();
                    }
                    if (Utils.getTimeBoot() - CgiManager.this.i < 500) {
                        return;
                    }
                    CgiManager.this.a(CgiManager.this.e());
                    CgiManager.this.a(list);
                    CgiManager.this.i = Utils.getTimeBoot();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.telephony.PhoneStateListener
        public void onCellLocationChanged(CellLocation cellLocation) {
            DebugUtils.writeCat("CgiManager", "CgiPhoneListener onCellLocationChanged");
            DebugUtils.writeCat("CgiManager", "noLocReqCgiEnable:" + CgiManager.this.u + " isStartLocation:" + CgiManager.this.t);
            if ((CgiManager.this.u || CgiManager.this.t) && Utils.getTimeBoot() - CgiManager.this.i >= 500) {
                try {
                    CgiManager.this.a(cellLocation);
                    CgiManager.this.a(CgiManager.this.d());
                    CgiManager.this.i = Utils.getTimeBoot();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        @Override // android.telephony.PhoneStateListener
        public void onDataConnectionStateChanged(int i) {
            super.onDataConnectionStateChanged(i);
            DebugUtils.writeCat("CgiManager", "CgiPhoneListener onDataConnectionStateChanged");
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            try {
                DebugUtils.writeCat("CgiManager", "CgiPhoneListener onServiceStateChanged");
                DebugUtils.writeCat("CgiManager", "noLocReqCgiEnable:" + CgiManager.this.u + " isStartLocation:" + CgiManager.this.t);
                if (CgiManager.this.u || CgiManager.this.t) {
                    int state = serviceState.getState();
                    if (state == 0) {
                        CgiManager.this.updateCgi(false, false);
                    } else {
                        if (state != 1) {
                            return;
                        }
                        CgiManager.this.h();
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthChanged(int i) {
            super.onSignalStrengthChanged(i);
            DebugUtils.writeCat("CgiManager", "CgiPhoneListener onSignalStrengthChanged");
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            DebugUtils.writeCat("CgiManager", "CgiPhoneListener onSignalStrengthsChanged");
            DebugUtils.writeCat("CgiManager", "noLocReqCgiEnable:" + CgiManager.this.u + " isStartLocation:" + CgiManager.this.t);
            if (signalStrength == null) {
                return;
            }
            CgiManager cgiManager = CgiManager.this;
            cgiManager.k = signalStrength;
            if (cgiManager.u || CgiManager.this.t) {
                try {
                    if (CgiManager.this.w != null) {
                        CgiManager.this.w.updateCell();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public CgiManager(Context context, Handler handler) {
        this.g = null;
        this.h = null;
        DebugUtils.writeCat("CgiManager", "==================CgiManager Constructor===================");
        this.f6679a = context;
        if (this.g == null) {
            this.g = (TelephonyManager) Utils.getServ(context, "phone");
        }
        f();
        CellAgeEstimator cellAgeEstimator = new CellAgeEstimator(context, "cellAge", handler);
        this.h = cellAgeEstimator;
        cellAgeEstimator.start();
    }

    private void g() {
        try {
            if (this.j == null) {
                this.j = new CgiPhoneListener();
            }
            int i = Build.VERSION.SDK_INT;
            String str = HAS_FINE_LOC_PERM;
            int i2 = 336;
            if (i < 31) {
                DebugUtils.writeCat("CgiManager | event LCL SUC2", false);
            } else if (this.f6679a.checkSelfPermission(Permission.ACCESS_FINE_LOCATION) == 0) {
                this.r = HAS_FINE_LOC_PERM;
                DebugUtils.writeCat("CgiManager | event LCL SUC1", false);
            } else {
                this.r = HAS_NO_FINE_LOC_PERM;
                DebugUtils.writeCat("CgiManager | LCL: NO FINE Loc Perm，failed", false);
                i2 = 320;
            }
            if (i >= 31) {
                boolean z = this.f6679a.checkSelfPermission(Permission.READ_PHONE_STATE) == 0;
                boolean z2 = this.f6679a.checkSelfPermission(Permission.ACCESS_FINE_LOCATION) == 0;
                if (z && z2) {
                    i2 |= 1024;
                    DebugUtils.writeCat("CgiManager | event LCI SUC3", false);
                } else {
                    DebugUtils.writeCat("CgiManager | LCI: NO rps Perm or NO fl Perm，failed", false);
                }
                this.f6680q = z ? HAS_READ_PHONESTATE_PERM : HAS_NO_READ_PHONESTATE_PERM;
                if (!z2) {
                    str = HAS_NO_FINE_LOC_PERM;
                }
                this.r = str;
                DebugUtils.writeCat("CgiManager | mLFLPerm = " + this.r + ";mLRPSPerm = " + this.f6680q, false);
            } else {
                DebugUtils.writeCat("CgiManager | event LCI SUC4", false);
                i2 |= 1024;
            }
            PhoneStateListener phoneStateListener = this.j;
            if (phoneStateListener != null) {
                this.g.listen(phoneStateListener, i2);
                this.v = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isValidCgiFlag(int i) {
        return i >= 1 && i <= 15;
    }

    public void destroy(boolean z) {
        this.h.destroy(z);
        this.i = 0L;
        synchronized (this.l) {
        }
        b();
        this.k = null;
        this.g = null;
    }

    public List<AmapCell> getAmapCells() {
        ArrayList arrayList = new ArrayList();
        List<CellInfo> c = c();
        if (c != null) {
            for (CellInfo cellInfo : c) {
                if (cellInfo instanceof CellInfoCdma) {
                    CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                    CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
                    AmapCellCdma amapCellCdma = new AmapCellCdma(cellInfo.isRegistered(), true);
                    amapCellCdma.latitude = cellIdentity.getLatitude();
                    amapCellCdma.longitude = cellIdentity.getLongitude();
                    amapCellCdma.sid = cellIdentity.getSystemId();
                    amapCellCdma.nid = cellIdentity.getNetworkId();
                    amapCellCdma.bid = cellIdentity.getBasestationId();
                    amapCellCdma.asuLevel = cellInfoCdma.getCellSignalStrength().getAsuLevel();
                    amapCellCdma.signalStrength = cellInfoCdma.getCellSignalStrength().getCdmaDbm();
                    arrayList.add(amapCellCdma);
                } else if (cellInfo instanceof CellInfoGsm) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                    AmapCellGsm amapCellGsm = new AmapCellGsm(cellInfo.isRegistered(), true);
                    amapCellGsm.mcc = String.valueOf(cellIdentity2.getMcc());
                    amapCellGsm.mnc = String.valueOf(cellIdentity2.getMnc());
                    amapCellGsm.lac = cellIdentity2.getLac();
                    amapCellGsm.cid = cellIdentity2.getCid();
                    amapCellGsm.signalStrength = cellInfoGsm.getCellSignalStrength().getDbm();
                    amapCellGsm.asuLevel = cellInfoGsm.getCellSignalStrength().getAsuLevel();
                    amapCellGsm.arfcn = cellIdentity2.getArfcn();
                    amapCellGsm.bsic = cellIdentity2.getBsic();
                    arrayList.add(amapCellGsm);
                } else if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                    AmapCellLte amapCellLte = new AmapCellLte(cellInfo.isRegistered());
                    amapCellLte.mcc = String.valueOf(cellIdentity3.getMcc());
                    amapCellLte.mnc = String.valueOf(cellIdentity3.getMnc());
                    amapCellLte.pci = cellIdentity3.getPci();
                    amapCellLte.asuLevel = cellInfoLte.getCellSignalStrength().getAsuLevel();
                    amapCellLte.ci = cellIdentity3.getCi();
                    amapCellLte.tac = cellIdentity3.getTac();
                    amapCellLte.timingAdvance = cellInfoLte.getCellSignalStrength().getTimingAdvance();
                    amapCellLte.signalStrength = cellInfoLte.getCellSignalStrength().getDbm();
                    amapCellLte.earfcn = cellIdentity3.getEarfcn();
                    arrayList.add(amapCellLte);
                } else if (cellInfo instanceof CellInfoWcdma) {
                    CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                    CellIdentityWcdma cellIdentity4 = cellInfoWcdma.getCellIdentity();
                    AmapCellWcdma amapCellWcdma = new AmapCellWcdma(cellInfo.isRegistered(), true);
                    amapCellWcdma.mcc = String.valueOf(cellIdentity4.getMcc());
                    amapCellWcdma.mnc = String.valueOf(cellIdentity4.getMnc());
                    amapCellWcdma.lac = cellIdentity4.getLac();
                    amapCellWcdma.cid = cellIdentity4.getCid();
                    amapCellWcdma.psc = cellIdentity4.getPsc();
                    amapCellWcdma.asuLevel = cellInfoWcdma.getCellSignalStrength().getAsuLevel();
                    amapCellWcdma.signalStrength = cellInfoWcdma.getCellSignalStrength().getDbm();
                    amapCellWcdma.uarfcn = cellIdentity4.getUarfcn();
                    arrayList.add(amapCellWcdma);
                }
            }
        }
        return arrayList;
    }

    public int getCgiFlag() {
        return getMainCgiType() | (this.b ? 4 : 0) | (this.c ? 8 : 0);
    }

    public synchronized String getCgiParam() {
        if (this.o) {
            h();
        }
        StringBuilder sb = this.p;
        if (sb == null) {
            this.p = new StringBuilder();
        } else {
            sb.delete(0, sb.length());
        }
        if (getMainCgiTypeMasked() == 1) {
            for (int i = 1; i < this.d.size(); i++) {
                this.p.append("#").append(this.d.get(i).mnc);
                this.p.append("|").append(this.d.get(i).lac);
                this.p.append("|").append(this.d.get(i).cid);
            }
        }
        for (int i2 = 1; i2 < this.f.size(); i2++) {
            Cgi cgi = this.f.get(i2);
            int i3 = cgi.type;
            if (i3 != 1 && i3 != 3 && i3 != 4 && i3 != 5) {
                if (i3 == 2) {
                    this.p.append("#").append(cgi.type);
                    this.p.append("|").append(cgi.mcc);
                    this.p.append("|").append(cgi.sid);
                    this.p.append("|").append(cgi.nid);
                    this.p.append("|").append(cgi.bid);
                }
            }
            this.p.append("#").append(cgi.type);
            this.p.append("|").append(cgi.mcc);
            this.p.append("|").append(cgi.mnc);
            this.p.append("|").append(cgi.lac);
            this.p.append("|").append(cgi.getCid());
        }
        if (this.p.length() > 0) {
            this.p.deleteCharAt(0);
        }
        return this.p.toString();
    }

    public synchronized ArrayList<Cgi> getDetectedCgiList() {
        ArrayList<Cgi> arrayList;
        arrayList = new ArrayList<>();
        ArrayList<Cgi> arrayList2 = this.d;
        if (arrayList2 != null) {
            Iterator<Cgi> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m7195clone());
            }
        }
        return arrayList;
    }

    public synchronized ArrayList<Cgi> getDetectedCgiV2List() {
        ArrayList<Cgi> arrayList;
        arrayList = new ArrayList<>();
        ArrayList<Cgi> arrayList2 = this.f;
        if (arrayList2 != null) {
            Iterator<Cgi> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m7195clone());
            }
        }
        return arrayList;
    }

    public synchronized Cgi getMainCgi() {
        if (this.o) {
            return null;
        }
        ArrayList<Cgi> arrayList = this.d;
        if (arrayList.size() < 1) {
            return null;
        }
        return arrayList.get(0).m7195clone();
    }

    public int getMainCgiType() {
        Cgi mainCgi = getMainCgi();
        if (mainCgi != null) {
            return mainCgi.type;
        }
        return 0;
    }

    public int getMainCgiTypeMasked() {
        return getMainCgiType() & 3;
    }

    public synchronized Cgi getMainCgiV2() {
        if (this.o) {
            return null;
        }
        ArrayList<Cgi> arrayList = this.f;
        if (arrayList.size() < 1) {
            return null;
        }
        Iterator<Cgi> it = arrayList.iterator();
        while (it.hasNext()) {
            Cgi next = it.next();
            if (next.isMain) {
                return next.m7195clone();
            }
        }
        return arrayList.get(0).m7195clone();
    }

    public String getRawOperatorStr() {
        return this.e;
    }

    public String getSecurityException() {
        return this.s;
    }

    public TelephonyManager getTelephonyManagerInstance() {
        return this.g;
    }

    synchronized void h() {
        this.s = null;
        this.d.clear();
        this.f.clear();
        this.b = false;
        this.c = false;
    }

    public boolean isSimValid() {
        try {
            TelephonyManager telephonyManager = this.g;
            if (telephonyManager != null) {
                if (!TextUtils.isEmpty(telephonyManager.getSimOperator())) {
                    return true;
                }
                if (!TextUtils.isEmpty(this.g.getSimCountryIso())) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            int netT = Utils.getNetT(Utils.getNetWorkInfo(this.f6679a));
            return netT == 0 || netT == 4 || netT == 2 || netT == 5 || netT == 3;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public void notifyLocationStatus(boolean z) {
        this.t = z;
        if (this.u) {
            return;
        }
        if (z && !this.v) {
            g();
        } else {
            if (z || !this.v) {
                return;
            }
            b();
        }
    }

    public void reInitIfNeed() {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                String str = this.f6679a.checkSelfPermission(Permission.ACCESS_FINE_LOCATION) == 0 ? HAS_FINE_LOC_PERM : HAS_NO_FINE_LOC_PERM;
                String str2 = this.f6679a.checkSelfPermission(Permission.READ_PHONE_STATE) == 0 ? HAS_READ_PHONESTATE_PERM : HAS_NO_READ_PHONESTATE_PERM;
                boolean z = true;
                boolean z2 = (TextUtils.isEmpty(this.r) || this.r.equals(str)) ? false : true;
                if (TextUtils.isEmpty(this.f6680q) || this.f6680q.equals(str2)) {
                    z = z2;
                }
                if (z) {
                    DebugUtils.writeCat("CgiManager | reInitPSL", false);
                    g();
                }
            }
        } catch (Throwable unused) {
            DebugUtils.writeCat("CgiManager | reInit e", false);
        }
    }

    public void setCollectionManager(ICollectionManager iCollectionManager) {
        this.w = iCollectionManager;
    }

    public void setNoLocReqCgiEnable(boolean z) {
        this.u = z;
    }

    public void updateCgi(boolean z, boolean z2) {
        try {
            this.o = Utils.airPlaneModeOn(this.f6679a);
            if (a()) {
                a(z, z2);
                a(e());
                a(d());
            }
            if (this.o) {
                h();
            }
        } catch (SecurityException e) {
            this.s = e.getMessage();
        } catch (Throwable th) {
            CoreUtil.reportError(th, "CgiManager", "refresh");
        }
    }

    private void b() {
        PhoneStateListener phoneStateListener;
        TelephonyManager telephonyManager = this.g;
        if (telephonyManager != null && (phoneStateListener = this.j) != null) {
            try {
                telephonyManager.listen(phoneStateListener, 0);
                this.v = false;
            } catch (Throwable th) {
                CoreUtil.reportError(th, "CgiManager", "destroy");
            }
        }
        this.j = null;
    }

    private List<CellInfo> c() {
        TelephonyManager telephonyManager = this.g;
        if (telephonyManager == null) {
            return null;
        }
        List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
        DebugUtils.writeCat("CgiManager", "getAllCellInfo");
        return allCellInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<CellInfo> d() {
        List<CellInfo> list;
        try {
            if (Utils.getSdk() < 18 || this.g == null) {
                return null;
            }
            try {
                list = c();
                try {
                    this.s = null;
                    return list;
                } catch (SecurityException e) {
                    e = e;
                    this.s = e.getMessage();
                    return list;
                }
            } catch (SecurityException e2) {
                e = e2;
                list = null;
            }
        } catch (Throwable th) {
            CoreUtil.reportError(th, "Cgi", "getNewCells");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CellLocation e() {
        TelephonyManager telephonyManager = this.g;
        if (telephonyManager != null && telephonyManager != null) {
            try {
                CellLocation cellLocation = telephonyManager.getCellLocation();
                DebugUtils.writeCat("CgiManager", "getCellLocation");
                this.s = null;
                return cellLocation;
            } catch (SecurityException e) {
                this.s = e.getMessage();
            } catch (Throwable th) {
                this.s = null;
                CoreUtil.reportError(th, "CgiManager", "getCellLocation");
            }
        }
        return null;
    }

    private void f() {
        if (this.g == null) {
            return;
        }
        g();
    }

    boolean a() {
        return !this.o && Utils.getTimeBoot() - this.i >= Const.L_MIN_CGI_REFRESH;
    }

    private void a(boolean z, boolean z2) {
        if (!this.o && this.g != null && Build.VERSION.SDK_INT >= 29 && this.f6679a.getApplicationInfo().targetSdkVersion >= 29) {
            if (this.m == null) {
                this.m = new CellInfoCallBack();
            }
            try {
                this.g.requestCellInfoUpdate(pc.d().b(), this.m);
            } catch (Throwable th) {
                CoreUtil.reportError(th, "Cgi", "refreshCgi");
            }
            if (z2 || z) {
                for (int i = 0; !this.n && i < 20; i++) {
                    try {
                        Thread.sleep(5L);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        this.c = false;
        TelephonyManager telephonyManager = this.g;
        if (telephonyManager != null) {
            String networkOperator = telephonyManager.getNetworkOperator();
            this.e = networkOperator;
            if (!TextUtils.isEmpty(networkOperator)) {
                this.c = true;
            }
        }
        this.i = Utils.getTimeBoot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(CellLocation cellLocation) {
        String[] mccMnc = Utils.getMccMnc(this.g);
        this.d.clear();
        if (cellLocation instanceof GsmCellLocation) {
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            Cgi cgi = new Cgi(1, true);
            cgi.mcc = Utils.parseInt(mccMnc[0]);
            cgi.mnc = Utils.parseInt(mccMnc[1]);
            cgi.lac = gsmCellLocation.getLac();
            cgi.cid = gsmCellLocation.getCid();
            SignalStrength signalStrength = this.k;
            if (signalStrength != null) {
                int gsmSignalStrength = signalStrength.getGsmSignalStrength();
                cgi.signalStrength = gsmSignalStrength == 99 ? Integer.MAX_VALUE : (gsmSignalStrength * 2) + Const.I_DEF_CGI_SIG;
            }
            cgi.newApi = false;
            this.h.update((CellAgeEstimator) cgi);
            this.d.add(cgi);
        } else if (cellLocation instanceof CdmaCellLocation) {
            CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
            Cgi cgi2 = new Cgi(2, true);
            cgi2.mcc = Integer.parseInt(mccMnc[0]);
            cgi2.mnc = Integer.parseInt(mccMnc[1]);
            cgi2.lat = cdmaCellLocation.getBaseStationLatitude();
            cgi2.lon = cdmaCellLocation.getBaseStationLongitude();
            cgi2.sid = cdmaCellLocation.getSystemId();
            cgi2.nid = cdmaCellLocation.getNetworkId();
            cgi2.bid = cdmaCellLocation.getBaseStationId();
            SignalStrength signalStrength2 = this.k;
            if (signalStrength2 != null) {
                cgi2.signalStrength = signalStrength2.getCdmaDbm();
            }
            cgi2.newApi = false;
            this.h.update((CellAgeEstimator) cgi2);
            this.d.add(cgi2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x024e A[Catch: all -> 0x028c, TryCatch #4 {all -> 0x028c, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x000e, B:12:0x0018, B:14:0x001f, B:18:0x026f, B:19:0x002c, B:29:0x024e, B:73:0x021c, B:75:0x022a, B:76:0x0236, B:78:0x022f, B:79:0x0234, B:63:0x028d, B:110:0x0278, B:112:0x027f, B:114:0x0285), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x026f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022a A[Catch: all -> 0x028c, TryCatch #4 {all -> 0x028c, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x000e, B:12:0x0018, B:14:0x001f, B:18:0x026f, B:19:0x002c, B:29:0x024e, B:73:0x021c, B:75:0x022a, B:76:0x0236, B:78:0x022f, B:79:0x0234, B:63:0x028d, B:110:0x0278, B:112:0x027f, B:114:0x0285), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    synchronized void a(java.util.List<android.telephony.CellInfo> r20) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.autonavi.aps.amapapi.restruct.CgiManager.a(java.util.List):void");
    }

    Cgi a(int i, boolean z, int i2, int i3, int i4, int i5, int i6) {
        Cgi cgi = new Cgi(i, z);
        cgi.mcc = i2;
        cgi.mnc = i3;
        cgi.lac = i4;
        cgi.cid = i5;
        cgi.sig = i6;
        return cgi;
    }
}
