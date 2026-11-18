(() => {
  // 禁用双指缩放
  document.addEventListener("touchmove", (e) => {
    if (e.touches.length > 1) e.preventDefault();
  }, { passive: false });

  /** @typedef {"day"|"week"|"year"} RankType */

  const $ = (id) => document.getElementById(id);
  const listEl = $("list");
  const myRankEl = $("myRank");
  const subtitleEl = $("subtitle");
  const footerNoteEl = $("footerNote");
  const toastEl = $("toast");

  /** @type {RankType} */
  let currentType = "day";

  const TYPE_META = {
    day: { label: "日榜", range: "今日 00:00 - 23:59" },
    week: { label: "周榜", range: "本周 周一 - 周日" },
  };

  const fmtInt = (n) => new Intl.NumberFormat("zh-CN").format(n);

  const showToast = (msg) => {
    toastEl.textContent = msg;
    toastEl.classList.add("show");
    window.clearTimeout(showToast._t);
    showToast._t = window.setTimeout(() => {
      toastEl.classList.remove("show");
    }, 1200);
  };

  const API_BASE_URL_STORAGE_KEY = "steps_rank_api_base_url";

  const normalizeApiBaseUrl = (s) => {
    const v = (s || "").trim();
    if (!v) return "";
    return v.replace(/\/+$/, "");
  };

  const ENV_FALLBACK_BASE = "https://howear.iwhop.cn/step-service/api";

  const getDefaultBase = () => {
    try {
      const bridge = window.android_common;
      if (bridge && typeof bridge.getStepsRankApiBase === "function") {
        const base = String(bridge.getStepsRankApiBase() || "").trim();
        if (base) return base;
      }
    } catch (_) {}
    return ENV_FALLBACK_BASE;
  };

  const getApiBaseUrl = () => {
    const DEFAULT_BASE = getDefaultBase();
    try {
      const url = new URL(window.location.href);
      const fromQuery = normalizeApiBaseUrl(url.searchParams.get("apiBaseUrl"));
      if (fromQuery) return fromQuery;
      const fromStorage = normalizeApiBaseUrl(
        window.localStorage && window.localStorage.getItem(API_BASE_URL_STORAGE_KEY)
      );
      if (fromStorage) return fromStorage;
      return DEFAULT_BASE;
    } catch (e) {
      try {
        const fromStorage = normalizeApiBaseUrl(
          window.localStorage && window.localStorage.getItem(API_BASE_URL_STORAGE_KEY)
        );
        if (fromStorage) return fromStorage;
      } catch (e2) {}
      return DEFAULT_BASE;
    }
  };

  /** 与 App 主站一致：请求头 `token`（/api/health 等无需鉴权的接口可不传） */
  const buildAuthHeaders = () => {
    const h = {};
    try {
      const bridge = window.android_common;
      if (bridge && typeof bridge.getUserToken === "function") {
        const t = String(bridge.getUserToken() || "").trim();
        if (t) h.token = t;
      }
    } catch (e) {
      console.log("[steps_rank] getUserToken:", e);
    }
    return h;
  };

  const bindApiBaseUrlConfig = () => {};

  /**
   * 从各类后端包装中取出榜单数组与 my（兼容 list / records / rows 等）
   */
  const extractRankPayload = (json) => {
    if (!json || typeof json !== "object") return { rawList: [], myRaw: null };
    const root = json;
    let data = root.data != null ? root.data : root;
    let myRaw = null;
    let rawList = [];

    if (Array.isArray(data)) {
      rawList = data;
    } else if (data && typeof data === "object") {
      myRaw = data.my != null ? data.my : root.my;
      const candidates = [
        data.list,
        data.records,
        data.rows,
        data.rankList,
        data.items,
        data.content,
        root.list,
      ];
      for (let i = 0; i < candidates.length; i++) {
        if (Array.isArray(candidates[i])) {
          rawList = candidates[i];
          break;
        }
      }
    }

    return { rawList, myRaw };
  };

  const mapRankItem = (it, index) => {
    const rank = Number(
      it.rank != null ? it.rank : it.sort != null ? it.sort : it.order != null ? it.order : index + 1
    );
    const steps = Number(
      it.steps ??
        it.totalSteps ??
        it.stepCount ??
        it.step ??
        it.todaySteps ??
        0
    );
    return {
      rank: Number.isFinite(rank) ? rank : index + 1,
      userId: it.userId != null ? String(it.userId) : "",
      nickname:
        it.nickname ||
        it.nickName ||
        it.userName ||
        it.name ||
        `用户${String(index + 1).padStart(2, "0")}`,
      avatarUrl: (it.avatarUrl || it.avatar || it.headUrl || "").trim(),
      steps: Number.isFinite(steps) ? steps : 0,
    };
  };

  const parseRankResponseText = (text) => {
    const json = JSON.parse(text);
    const { rawList, myRaw } = extractRankPayload(json);
    const list = rawList.map((it, idx) => mapRankItem(it, idx));
    return { list, myRaw };
  };

  const fetchRankFromService = async (type) => {
    const apiBaseUrl = getApiBaseUrl();
    const pageSize = 100;
    const qs = new URLSearchParams({ type, pageSize: String(pageSize) });
    const url = `${apiBaseUrl}/steps/rank?${qs.toString()}`;
    const t0 = Date.now();
    console.log(`[steps_rank] request: ${url}`);

    const authHeaders = buildAuthHeaders();
    const resp = await fetch(url, { method: "GET", headers: authHeaders });

    console.log(
      `[steps_rank] response: status=${resp.status} duration=${Date.now() - t0}ms`
    );
    if (!resp.ok) throw new Error(`HTTP ${resp.status}`);

    const text = await resp.text();
    console.log(`[steps_rank] response body: ${text}`);
    const { list, myRaw } = parseRankResponseText(text);

    return { list, hasMore: false, topN: list.length, myRaw };
  };

  const normalizeMy = (raw) => {
    if (!raw || typeof raw !== "object") return null;
    const rank = Number(raw.rank);
    const steps = Number(raw.steps ?? raw.totalSteps ?? raw.stepCount ?? raw.step ?? NaN);
    if (!Number.isFinite(rank)) return null;
    return {
      userId: raw.userId != null ? String(raw.userId) : "",
      nickname: raw.nickname || raw.nickName || raw.userName || raw.name || "我",
      avatarUrl: (raw.avatarUrl || raw.avatar || raw.headUrl || "").trim(),
      rank,
      steps: Number.isFinite(steps) && steps >= 0 ? steps : 0,
    };
  };

  const fetchRank = async (type) => {
    const { list, topN, myRaw } = await fetchRankFromService(type);
    const my = normalizeMy(myRaw);
    return { list, my, hasMore: false, topN };
  };

  const renderRow = (item, opts = {}) => {
    const isTop3 = typeof item.rank === "number" && item.rank >= 1 && item.rank <= 3;
    const row = document.createElement("div");
    row.className = "row"
      + (opts.isMe ? " is-me" : "")
      + (isTop3 ? ` top-3 rank-${item.rank}` : "");

    const rankEl = document.createElement("div");
    rankEl.className = "rank";
    if (isTop3 && !opts.isMe) {
      const medal = document.createElement("div");
      const medalClass = item.rank === 1 ? "gold" : item.rank === 2 ? "silver" : "bronze";
      medal.className = `rank-medal ${medalClass}`;
      medal.textContent = String(item.rank);
      rankEl.appendChild(medal);
    } else {
      rankEl.textContent = String(item.rank);
    }

    const user = document.createElement("div");
    user.className = "user";

    const avatar = document.createElement("div");
    avatar.className =
      "avatar" +
      (item.rank === 1
        ? " frame-1"
        : item.rank === 2
        ? " frame-2"
        : item.rank === 3
        ? " frame-3"
        : "");

    if (item.avatarUrl) {
      avatar.classList.add("has-img");
      avatar.style.backgroundImage = `url(${item.avatarUrl})`;
      avatar.style.backgroundSize = "cover";
      avatar.style.backgroundPosition = "center";
    }

    const name = document.createElement("div");
    name.className = "name";
    name.textContent = item.nickname || "未命名";

    user.appendChild(avatar);
    user.appendChild(name);

    const steps = document.createElement("div");
    steps.className = "steps";
    steps.innerHTML = typeof item.steps === "number"
      ? `${fmtInt(item.steps)}<small>步</small>`
      : `${item.steps}<small>步</small>`;

    row.appendChild(rankEl);
    row.appendChild(user);
    row.appendChild(steps);

    return row;
  };

  const setActiveTab = (type) => {
    currentType = type;
    document.querySelectorAll(".tab").forEach((btn) => {
      const active = btn.getAttribute("data-type") === type;
      btn.classList.toggle("is-active", active);
      btn.setAttribute("aria-selected", active ? "true" : "false");
    });
    subtitleEl.textContent = TYPE_META[type].range;
  };

  let _renderSeq = 0;
  const render = async (type) => {
    const seq = ++_renderSeq;
    setActiveTab(type);
    listEl.innerHTML = "";
    myRankEl.innerHTML = "";
    footerNoteEl.textContent = "";

    for (let i = 0; i < 5; i++) {
      const sk = document.createElement("div");
      sk.className = "skeleton-row";
      sk.innerHTML =
        '<div class="skeleton-bone skeleton-rank"></div>' +
        '<div class="skeleton-user"><div class="skeleton-bone skeleton-avatar"></div><div class="skeleton-bone skeleton-name"></div></div>' +
        '<div class="skeleton-bone skeleton-steps"></div>';
      listEl.appendChild(sk);
    }

    try {
      const { list, my, topN } = await fetchRank(type);
      if (seq !== _renderSeq) return;
      listEl.innerHTML = "";

      if (list.length === 0) {
        const empty = document.createElement("div");
        empty.className = "empty-state";
        empty.innerHTML = '<div class="empty-icon">🏃</div><div class="empty-text">暂无排行数据</div>';
        listEl.appendChild(empty);
      } else {
        const myUserId = my ? my.userId : "";
        list.forEach((item) => {
          const isMe = myUserId && item.userId && String(item.userId) === String(myUserId);
          listEl.appendChild(renderRow(item, { isMe }));
        });
      }

      trackEvent("steps_rank_load_success", `${type}_count_${list.length}_rank_${my ? my.rank : 0}`);
      footerNoteEl.textContent = `当前展示前 ${topN} 名。`;

      // 将「日榜」我的名次回写给原生，用于首页入口展示
      const myRank = my ? my.rank : 0;
      const myRankInRange = myRank > 0 && myRank <= topN;
      try {
        if (type === "day") {
          if (window.android_common && typeof window.android_common.setStepsRankTodayRank === "function") {
            window.android_common.setStepsRankTodayRank(myRankInRange ? myRank : 0);
            console.log(`[steps_rank] wrote today_rank=${myRankInRange ? myRank : 0} to android_common`);
          }
        }
      } catch (e) {
        console.log(`[steps_rank] write today_rank failed: ${e && e.message ? e.message : String(e)}`);
      }

      // 我的排名卡片
      const myCard = document.createElement("div");
      myCard.className = "card";
      myCard.innerHTML =
        '<div class="card-header"><div class="card-title">我的排名</div></div>';
      const myList = document.createElement("div");
      myList.className = "list";
      myList.appendChild(
        renderRow(
          {
            rank: myRankInRange ? myRank : topN + "+",
            nickname: my ? my.nickname : "我",
            avatarUrl: my ? (my.avatarUrl || "") : "",
            steps: my ? my.steps : 0,
          },
          { isMe: true }
        )
      );
      myCard.appendChild(myList);
      myRankEl.appendChild(myCard);
    } catch (e) {
      if (seq !== _renderSeq) return;
      trackEvent("steps_rank_load_fail", e && e.message || String(e));
      listEl.innerHTML = "";
      const errState = document.createElement("div");
      errState.className = "empty-state";
      errState.innerHTML = '<div class="empty-icon">😥</div><div class="empty-text">加载失败，请稍后重试</div>';
      listEl.appendChild(errState);
      const retry = document.createElement("button");
      retry.className = "retry-btn";
      retry.textContent = "重新加载";
      retry.onclick = () => render(type);
      listEl.appendChild(retry);
    }
  };

  const bindTabs = () => {
    document.querySelectorAll(".tab").forEach((btn) => {
      btn.addEventListener("click", () => {
        const type = btn.getAttribute("data-type");
        if (!type) return;
        if (type === currentType) return;
        trackEvent("steps_rank_tab_switch", type);
        render(type);
      });
    });
  };

  /** 关闭页（无原生标题栏时由 H5 提供返回） */
  const bindNavBack = () => {
    const el = $("navBack");
    if (!el) return;
    el.addEventListener("click", () => {
      try {
        if (
          window.android_common &&
          typeof window.android_common.finish === "function"
        ) {
          window.android_common.finish();
          return;
        }
      } catch (_) {}
      if (window.history.length > 1) {
        window.history.back();
      }
    });
  };

  // ===== 埋点上报 =====
  const trackEvent = (eventId, value) => {
    try {
      const bridge = window.android_common;
      if (bridge && typeof bridge.trackEvent === "function") {
        bridge.trackEvent(eventId, value || "");
      }
    } catch (_) {}
    console.log(`[steps_rank] track: ${eventId} ${value || ""}`);
  };

  // init
  trackEvent("steps_rank_page_view", "page_view");
  bindNavBack();
  bindApiBaseUrlConfig();
  bindTabs();
  render("day");
})();
