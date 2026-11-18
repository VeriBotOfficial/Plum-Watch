package com.baidu.ar.lua;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface LuaMsgListener {
    List<String> getMsgKeyListened();

    void onLuaMessage(HashMap<String, Object> map);
}
