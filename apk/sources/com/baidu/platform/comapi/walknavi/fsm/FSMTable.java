package com.baidu.platform.comapi.walknavi.fsm;

import android.util.Log;
import java.util.HashMap;

/* JADX INFO: loaded from: classes15.dex */
public class FSMTable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f8707a = new byte[0];
    public static HashMap<String, HashMap<String, String>> dictFSM;
    public static HashMap<String, String> dictStateBrowseMap;
    public static HashMap<String, String> dictStateCar3D;
    public static HashMap<String, String> dictStateEntry;
    public static HashMap<String, String> dictStateNorth2D;
    public static HashMap<String, String> dictStateOverview;
    public static HashMap<String, String> dictStateSeg;
    public static HashMap<String, String> dictStateSegEntry;

    private static void a() {
        HashMap<String, HashMap<String, String>> map = new HashMap<>();
        dictFSM = map;
        map.clear();
        dictFSM.put("Entry", dictStateEntry);
        dictFSM.put("SegEntry", dictStateSegEntry);
        dictFSM.put("North2D", dictStateNorth2D);
        dictFSM.put("Car3D", dictStateCar3D);
        dictFSM.put("BrowseMap", dictStateBrowseMap);
        dictFSM.put("Overview", dictStateOverview);
        dictFSM.put("Seg", dictStateSeg);
    }

    private static void b() {
        HashMap<String, String> map = new HashMap<>();
        dictStateBrowseMap = map;
        map.clear();
        dictStateBrowseMap.put("强诱导转到分段", "Seg");
        dictStateBrowseMap.put("[3D车头向上]按钮点击", "Car3D");
        dictStateBrowseMap.put("[查看全览]按钮点击", "Overview");
        dictStateBrowseMap.put("[回车位]按钮点击", "Car3D");
        dictStateBrowseMap.put("指南针点击", "BACK");
        dictStateBrowseMap.put("拖动地图", "BrowseMap");
        dictStateBrowseMap.put("触碰地图", "BrowseMap");
        dictStateBrowseMap.put("收到偏航算路成功消息", "BACK");
        dictStateBrowseMap.put("收到自动回车位消息", "BACK");
    }

    private static void c() {
        HashMap<String, String> map = new HashMap<>();
        dictStateCar3D = map;
        map.clear();
        dictStateCar3D.put("强诱导转到分段", "Seg");
        dictStateCar3D.put("[查看全览]按钮点击", "Overview");
        dictStateCar3D.put("[3D车头向上]按钮点击", "North2D");
        dictStateCar3D.put("指南针点击", "North2D");
        dictStateCar3D.put("拖动地图", "BrowseMap");
        dictStateCar3D.put("触碰地图", "Car3D");
        dictStateCar3D.put("收到偏航算路成功消息", "Car3D");
        dictStateCar3D.put("[2D正北]按钮点击", "North2D");
    }

    private static void d() {
        HashMap<String, String> map = new HashMap<>();
        dictStateEntry = map;
        map.clear();
        dictStateEntry.put("[查看全览]按钮点击", "Overview");
        dictStateEntry.put("[3D车头向上]按钮点击", "Car3D");
        dictStateEntry.put("指南针点击", "North2D");
        dictStateEntry.put("拖动地图", "BrowseMap");
        dictStateEntry.put("触碰地图", "Car3D");
        dictStateEntry.put("收到偏航算路成功消息", "Car3D");
        dictStateEntry.put("[2D正北]按钮点击", "North2D");
    }

    private static void e() {
        HashMap<String, String> map = new HashMap<>();
        dictStateNorth2D = map;
        map.clear();
        dictStateNorth2D.put("强诱导转到分段", "Seg");
        dictStateNorth2D.put("[查看全览]按钮点击", "Overview");
        dictStateNorth2D.put("[2D正北]按钮点击", "Car3D");
        dictStateNorth2D.put("[3D车头向上]按钮点击", "Car3D");
        dictStateNorth2D.put("指南针点击", "Car3D");
        dictStateNorth2D.put("拖动地图", "BrowseMap");
        dictStateNorth2D.put("触碰地图", "North2D");
        dictStateNorth2D.put("收到偏航算路成功消息", "North2D");
    }

    private static void f() {
        HashMap<String, String> map = new HashMap<>();
        dictStateOverview = map;
        map.clear();
        dictStateOverview.put("强诱导转到分段", "Seg");
        dictStateOverview.put("[查看全览]按钮点击", "Overview");
        dictStateOverview.put("[3D车头向上]按钮点击", "Car3D");
        dictStateOverview.put("[回车位]按钮点击", "Car3D");
        dictStateOverview.put("指南针点击", "North2D");
        dictStateOverview.put("拖动地图", "BrowseMap");
        dictStateOverview.put("触碰地图", "BrowseMap");
        dictStateOverview.put("收到偏航算路成功消息", "Car3D");
        dictStateOverview.put("收到自动回车位消息", "Car3D");
    }

    private static void g() {
        HashMap<String, String> map = new HashMap<>();
        dictStateSeg = map;
        map.clear();
        dictStateSeg.put("强诱导转到分段", "Seg");
        dictStateSeg.put("[查看全览]按钮点击", "Overview");
        dictStateSeg.put("[3D车头向上]按钮点击", "Car3D");
        dictStateSeg.put("[回车位]按钮点击", "Car3D");
        dictStateSeg.put("指南针点击", "North2D");
        dictStateSeg.put("拖动地图", "BrowseMap");
        dictStateSeg.put("触碰地图", "BrowseMap");
        dictStateSeg.put("收到偏航算路成功消息", "Car3D");
        dictStateSeg.put("收到自动回车位消息", "Car3D");
    }

    private static void h() {
        HashMap<String, String> map = new HashMap<>();
        dictStateSegEntry = map;
        map.clear();
        dictStateSegEntry.put("[查看全览]按钮点击", "Overview");
        dictStateSegEntry.put("[3D车头向上]按钮点击", "Car3D");
        dictStateSegEntry.put("[回车位]按钮点击", "Car3D");
        dictStateSegEntry.put("指南针点击", "North2D");
        dictStateSegEntry.put("拖动地图", "BrowseMap");
        dictStateSegEntry.put("触碰地图", "Car3D");
        dictStateSegEntry.put("收到偏航算路成功消息", "Car3D");
    }

    public static void initTransition() {
        d();
        h();
        e();
        c();
        b();
        f();
        g();
        a();
    }

    public static String queryDestState(String str, String str2) {
        synchronized (f8707a) {
            new HashMap();
            HashMap<String, String> map = dictFSM.get(str);
            if (map == null) {
                Log.e("FSMTable", "不存在该状态对应的状态机，请完善逻辑!");
                return null;
            }
            String str3 = map.get(str2);
            if (str3 != null) {
                return str3;
            }
            Log.e("FSMTable", "处于状态 (" + str + ")时， 不存在执行event = " + str2 + " 的跳转，请考虑是否完善逻辑!");
            return null;
        }
    }

    public static void release() {
        HashMap<String, HashMap<String, String>> map = dictFSM;
        if (map != null) {
            map.clear();
        }
        HashMap<String, String> map2 = dictStateEntry;
        if (map2 != null) {
            map2.clear();
            dictStateEntry = null;
        }
        HashMap<String, String> map3 = dictStateSegEntry;
        if (map3 != null) {
            map3.clear();
            dictStateSegEntry = null;
        }
        HashMap<String, String> map4 = dictStateNorth2D;
        if (map4 != null) {
            map4.clear();
            dictStateNorth2D = null;
        }
        HashMap<String, String> map5 = dictStateCar3D;
        if (map5 != null) {
            map5.clear();
            dictStateCar3D = null;
        }
        HashMap<String, String> map6 = dictStateBrowseMap;
        if (map6 != null) {
            map6.clear();
            dictStateBrowseMap = null;
        }
        HashMap<String, String> map7 = dictStateOverview;
        if (map7 != null) {
            map7.clear();
            dictStateOverview = null;
        }
        HashMap<String, String> map8 = dictStateSeg;
        if (map8 != null) {
            map8.clear();
            dictStateSeg = null;
        }
    }
}
