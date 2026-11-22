package com.bytedance.sdk.openadsdk.iwp;

import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.common.m.a;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class gff {
    private hm gff;
    private fxn hm;
    private kg kg;
    private final String fxn = "StrategyCenter";
    private int rb = 0;
    private Runnable bh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.iwp.gff.2
        @Override // java.lang.Runnable
        public void run() {
            gff.this.kg();
        }
    };

    public gff(hm hmVar) {
        this.kg = null;
        rb rbVar = new rb(hmVar);
        this.gff = rbVar;
        String gff = rbVar.gff();
        if (!TextUtils.isEmpty(gff) && !gff.startsWith("pag")) {
            gff = "pag_".concat(String.valueOf(gff));
        }
        this.kg = new kg(this.gff.kg(), gff);
    }

    public void fxn(fxn fxnVar) {
        this.hm = fxnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kg() {
        hm hmVar = this.gff;
        if (hmVar == null || hmVar.rb() == null || this.gff.bh() == null) {
            return;
        }
        this.gff.fxn().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.iwp.gff.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                gff.this.rb++;
                try {
                    if (gff.this.hm != null) {
                        gff.this.hm.fxn();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(gff.this.gff.rb()).openConnection();
                    if (gff.this.gff.sg() != null && gff.this.gff.sg().size() > 0) {
                        for (Map.Entry<String, String> entry : gff.this.gff.sg().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", a.f3976q);
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(gff.this.gff.bh().toString().getBytes());
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            Log.i("StrategyCenter", "executing strategy fetch");
                            if (responseCode != 200) {
                                if (gff.this.hm != null) {
                                    gff.this.hm.fxn(responseCode, httpURLConnection.getResponseMessage());
                                }
                            } else {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    } else {
                                        stringBuffer.append(readLine);
                                    }
                                }
                                bufferedReader.close();
                                JSONObject fxn = gff.this.gff.fxn(new JSONObject(stringBuffer.toString()));
                                gff.this.kg.fxn();
                                gff.this.kg.fxn(fxn);
                                if (gff.this.hm != null) {
                                    gff.this.hm.kg();
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = null;
                    }
                } catch (Throwable th3) {
                    Log.e("StrategyCenter", th3.getMessage() == null ? "error " : th3.getMessage());
                    if (gff.this.hm != null) {
                        gff.this.hm.fxn(-1, th3.getMessage());
                    }
                }
                gff.this.kg.fxn("local_last_update_time", System.currentTimeMillis());
                gff.this.fxn();
            }
        });
    }

    public void fxn() {
        if (this.gff != null) {
            int i = 3600000;
            int fxn = this.kg.fxn("req_interval", 3600000);
            long j = 0;
            long kg = this.kg.kg("local_last_update_time", 0L);
            if (fxn >= 600000 && fxn <= 86400000) {
                i = fxn;
            }
            long currentTimeMillis = System.currentTimeMillis() - kg;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(currentTimeMillis)));
            if (currentTimeMillis >= 0) {
                long j2 = i;
                if (currentTimeMillis <= j2) {
                    j = j2 - currentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j)));
            this.gff.hm().removeCallbacks(this.bh);
            if (this.rb > 24) {
                return;
            }
            this.gff.hm().postDelayed(this.bh, j);
        }
    }

    public int fxn(String str, int i) {
        kg kgVar = this.kg;
        return kgVar == null ? i : kgVar.fxn(str, i);
    }

    public String fxn(String str, String str2) {
        kg kgVar = this.kg;
        return kgVar == null ? str2 : kgVar.fxn(str, str2);
    }

    public boolean fxn(String str, boolean z) {
        kg kgVar = this.kg;
        return kgVar == null ? z : kgVar.fxn(str, z);
    }
}
