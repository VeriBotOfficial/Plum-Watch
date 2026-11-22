package com.bytedance.sdk.component.adexpress.dynamic.hm;

import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import com.anythink.expressad.foundation.d.t;
import com.bytedance.sdk.component.adexpress.dynamic.rb.dgx;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class sg {
    private String bh;
    public int fxn;
    public JSONObject gff;
    private bh hm;
    public String kg;
    private rb rb;

    public sg(rb rbVar) {
        this.rb = rbVar;
        this.fxn = rbVar.fxn();
        this.kg = rbVar.gff();
        this.gff = rbVar.rb().afz();
        this.bh = rbVar.hm();
        if (com.bytedance.sdk.component.adexpress.hm.gff() == 1) {
            this.hm = rbVar.sg();
        } else {
            this.hm = rbVar.rb();
        }
        if (com.bytedance.sdk.component.adexpress.hm.kg()) {
            this.hm = rbVar.rb();
        }
    }

    public int fxn() {
        return (int) this.hm.zu();
    }

    public int kg() {
        return (int) this.hm.rmu();
    }

    public int gff() {
        return (int) this.hm.ckl();
    }

    public int hm() {
        return (int) this.hm.xdg();
    }

    public float rb() {
        return this.hm.je();
    }

    public String bh() {
        if (this.fxn == 0) {
            if (!TextUtils.isEmpty(this.kg)) {
                return this.kg;
            }
            return this.gff.optString(com.bytedance.sdk.component.adexpress.hm.sg.gff(com.bytedance.sdk.component.adexpress.hm.fxn()));
        }
        return "";
    }

    public int sg() {
        return fxn(this.hm.iwp());
    }

    public int tw() {
        String ums = this.hm.ums();
        if ("left".equals(ums)) {
            return 17;
        }
        if ("center".equals(ums)) {
            return 4;
        }
        return "right".equals(ums) ? 3 : 2;
    }

    public int jq() {
        int tw = tw();
        if (tw == 4) {
            return 17;
        }
        return tw == 3 ? GravityCompat.END : GravityCompat.START;
    }

    public String hie() {
        int i = this.fxn;
        if (i == 2 || i == 13) {
            return this.kg;
        }
        return "";
    }

    public String dgx() {
        if (this.fxn == 1) {
            return this.kg;
        }
        return "";
    }

    public String mvp() {
        return this.bh;
    }

    public double rlu() {
        if (this.fxn == 11) {
            try {
                return !com.bytedance.sdk.component.adexpress.hm.kg() ? (int) r0 : Double.parseDouble(this.kg);
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public double zu() {
        return this.hm.ud();
    }

    public float ckl() {
        return this.hm.dgx();
    }

    public int xdg() {
        return fxn(this.hm.ke());
    }

    public float rmu() {
        return this.hm.mvp();
    }

    public int je() {
        return this.hm.qx();
    }

    public int ud() {
        return this.hm.lu();
    }

    public boolean dx() {
        return this.hm.jch();
    }

    public String ums() {
        return this.hm.bx();
    }

    public void fxn(float f) {
        this.hm.fxn(f);
    }

    public boolean iwp() {
        return this.hm.kee();
    }

    public int jz() {
        return this.hm.ps();
    }

    public String bx() {
        return this.hm.qhf();
    }

    public String uhw() {
        return this.hm.izz();
    }

    public long ke() {
        return this.hm.ul();
    }

    public int mve() {
        String qhf = this.hm.qhf();
        if ("skip-with-time-skip-btn".equals(this.rb.kg()) || "skip".equals(this.rb.kg()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.rb.kg())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.rb.kg()) && !"skip-with-time".equals(this.rb.kg())) {
            if (this.fxn == 10 && TextUtils.equals(this.hm.wc(), "click")) {
                return 5;
            }
            if (fa() && ibh()) {
                return 0;
            }
            if (fa()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.rb.kg())) {
                return 3;
            }
            if (!TextUtils.isEmpty(qhf) && !qhf.equals("none")) {
                if (qhf.equals("video") || (this.rb.fxn() == 7 && TextUtils.equals(qhf, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.hm.kg() && this.rb.rb() != null && this.rb.rb().jg()) ? 11 : 4;
                }
                if (qhf.equals("normal")) {
                    return 1;
                }
                return (qhf.equals(t.aD) || "slide".equals(this.hm.wc())) ? 2 : 0;
            }
        }
        return 0;
    }

    private boolean fa() {
        return (com.bytedance.sdk.component.adexpress.hm.kg() && (this.rb.kg().contains("logo-union") || this.rb.kg().contains("logounion") || this.rb.kg().contains("logoad"))) || "logo-union".equals(this.rb.kg()) || "logounion".equals(this.rb.kg()) || "logoad".equals(this.rb.kg());
    }

    public int zn() {
        return fxn(this.hm.jz());
    }

    public double ggo() {
        return this.hm.tw();
    }

    public int ax() {
        return this.hm.gff();
    }

    public int ci() {
        return this.hm.kg();
    }

    public int rz() {
        return this.hm.rb();
    }

    public int ils() {
        return this.hm.hm();
    }

    public int ij() {
        return this.hm.jq();
    }

    public String yws() {
        return this.hm.hie();
    }

    public String swx() {
        return this.hm.wc();
    }

    private boolean ibh() {
        if (com.bytedance.sdk.component.adexpress.hm.kg()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.kg) && this.kg.contains("adx:")) || dgx.kg();
    }

    public static int fxn(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (split = str.substring(str.indexOf(Separators.LPAREN) + 1, str.indexOf(Separators.RPAREN)).split(",")) != null) {
            try {
                if (split.length == 4) {
                    return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return -16777216;
    }

    public static float[] kg(String str) {
        String[] split = str.substring(str.indexOf(Separators.LPAREN) + 1, str.indexOf(Separators.RPAREN)).split(",");
        if (split != null && split.length == 4) {
            return new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3])};
        }
        return new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }

    public boolean fxn(int i) {
        rb rbVar = this.rb;
        if (rbVar == null) {
            return false;
        }
        if (i == 1) {
            this.hm = rbVar.sg();
        } else {
            this.hm = rbVar.rb();
        }
        return this.hm != null;
    }

    public boolean qhf() {
        return this.hm.ncz();
    }

    public int wc() {
        return this.hm.bgy();
    }

    public int zk() {
        return this.hm.bfa();
    }

    public String ei() {
        return this.hm.swx();
    }

    public boolean kee() {
        return this.hm.fqm();
    }

    public int ps() {
        return this.hm.sg();
    }

    public int deg() {
        return this.hm.zc();
    }

    public int np() {
        return this.hm.on();
    }

    public int pjf() {
        return this.hm.hx();
    }

    public int xtn() {
        return this.hm.lz();
    }

    public boolean fsb() {
        return this.hm.bmc();
    }

    public String kwc() {
        return this.hm.ggo();
    }

    public String fqt() {
        return this.hm.vkm();
    }

    public String fe() {
        return this.hm.gb();
    }

    public boolean ln() {
        return this.hm.rlu();
    }

    public boolean kwn() {
        return this.hm.ci();
    }

    public String hb() {
        return this.hm.ax();
    }

    public int zz() {
        return this.hm.rz();
    }

    public int uws() {
        return this.hm.ils();
    }

    public double qn() {
        return this.hm.ij();
    }

    public double gaw() {
        return this.hm.yws();
    }

    public int vts() {
        return this.hm.oox();
    }

    public String afz() {
        return this.hm.nu();
    }

    public String rns() {
        return this.hm.yx();
    }

    public boolean ncz() {
        return this.hm.oot();
    }

    public int bfa() {
        return this.hm.qu();
    }

    public int bgy() {
        return this.hm.an();
    }

    public int ig() {
        return this.hm.uz();
    }

    public boolean mcr() {
        return this.hm.bmc();
    }

    public String gs() {
        return this.hm.uhw();
    }
}
