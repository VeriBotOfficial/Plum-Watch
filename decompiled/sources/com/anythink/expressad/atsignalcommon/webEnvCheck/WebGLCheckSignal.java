package com.anythink.expressad.atsignalcommon.webEnvCheck;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class WebGLCheckSignal extends BaseWebGLCheckSignal {
    public void webglState(Object obj, String str) {
        try {
            new JSONObject(str).optInt("webgl");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
