package io.nats.client.support;

/* loaded from: classes6.dex */
public class ServerVersion implements Comparable<ServerVersion> {
    final String extra;
    final Integer major;
    final Integer minor;
    final Integer patch;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ServerVersion(java.lang.String r13) {
        /*
            r12 = this;
            r12.<init>()
            r0 = -1
            r1 = 0
            java.lang.String r2 = "v"
            boolean r2 = r13.startsWith(r2)     // Catch: java.lang.NumberFormatException -> L7a
            java.lang.String r3 = "\\Q.\\E"
            java.lang.String r4 = "."
            r5 = 1
            java.lang.String r6 = "-"
            if (r2 == 0) goto L21
            java.lang.String r13 = r13.substring(r5)     // Catch: java.lang.NumberFormatException -> L7a
            java.lang.String r13 = r13.replaceAll(r6, r4)     // Catch: java.lang.NumberFormatException -> L7a
            java.lang.String[] r13 = r13.split(r3)     // Catch: java.lang.NumberFormatException -> L7a
            goto L29
        L21:
            java.lang.String r13 = r13.replaceAll(r6, r4)     // Catch: java.lang.NumberFormatException -> L7a
            java.lang.String[] r13 = r13.split(r3)     // Catch: java.lang.NumberFormatException -> L7a
        L29:
            r2 = 0
            r2 = r13[r2]     // Catch: java.lang.NumberFormatException -> L7a
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L7a
            r3 = r13[r5]     // Catch: java.lang.NumberFormatException -> L7a
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L7a
            int r5 = r13.length     // Catch: java.lang.NumberFormatException -> L78
            r7 = 3
            if (r5 >= r7) goto L3c
            r5 = r0
            goto L43
        L3c:
            r5 = 2
            r5 = r13[r5]     // Catch: java.lang.NumberFormatException -> L78
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L78
        L43:
            r9 = r1
            r8 = r7
        L45:
            int r10 = r13.length     // Catch: java.lang.NumberFormatException -> L7d
            if (r8 >= r10) goto L7e
            if (r8 != r7) goto L5e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L7d
            r10.<init>()     // Catch: java.lang.NumberFormatException -> L7d
            java.lang.StringBuilder r10 = r10.append(r6)     // Catch: java.lang.NumberFormatException -> L7d
            r11 = r13[r8]     // Catch: java.lang.NumberFormatException -> L7d
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.NumberFormatException -> L7d
            java.lang.String r9 = r10.toString()     // Catch: java.lang.NumberFormatException -> L7d
            goto L75
        L5e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L7d
            r10.<init>()     // Catch: java.lang.NumberFormatException -> L7d
            java.lang.StringBuilder r10 = r10.append(r9)     // Catch: java.lang.NumberFormatException -> L7d
            java.lang.StringBuilder r10 = r10.append(r4)     // Catch: java.lang.NumberFormatException -> L7d
            r11 = r13[r8]     // Catch: java.lang.NumberFormatException -> L7d
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.NumberFormatException -> L7d
            java.lang.String r9 = r10.toString()     // Catch: java.lang.NumberFormatException -> L7d
        L75:
            int r8 = r8 + 1
            goto L45
        L78:
            r5 = r0
            goto L7c
        L7a:
            r3 = r0
            r5 = r3
        L7c:
            r9 = r1
        L7d:
            r2 = r0
        L7e:
            if (r2 != r0) goto L95
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r12.major = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r12.minor = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r12.patch = r13
            r12.extra = r1
            goto La9
        L95:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r12.major = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            r12.minor = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            r12.patch = r13
            r12.extra = r9
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nats.client.support.ServerVersion.<init>(java.lang.String):void");
    }

    public String toString() {
        StringBuilder append = new StringBuilder().append(this.major).append(".").append(this.minor).append(".").append(this.patch);
        String str = this.extra;
        if (str == null) {
            str = "";
        }
        return append.append(str).toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(ServerVersion serverVersion) {
        int compareTo = this.major.compareTo(serverVersion.major);
        if (compareTo != 0 || (compareTo = this.minor.compareTo(serverVersion.minor)) != 0 || (compareTo = this.patch.compareTo(serverVersion.patch)) != 0) {
            return compareTo;
        }
        String str = this.extra;
        if (str == null) {
            return serverVersion.extra == null ? 0 : 1;
        }
        String str2 = serverVersion.extra;
        if (str2 == null) {
            return -1;
        }
        return str.compareTo(str2);
    }

    public static boolean isNewer(String str, String str2) {
        return new ServerVersion(str).compareTo(new ServerVersion(str2)) > 0;
    }

    public static boolean isSame(String str, String str2) {
        return new ServerVersion(str).compareTo(new ServerVersion(str2)) == 0;
    }

    public static boolean isOlder(String str, String str2) {
        return new ServerVersion(str).compareTo(new ServerVersion(str2)) < 0;
    }

    public static boolean isSameOrOlder(String str, String str2) {
        return new ServerVersion(str).compareTo(new ServerVersion(str2)) <= 0;
    }

    public static boolean isSameOrNewer(String str, String str2) {
        return new ServerVersion(str).compareTo(new ServerVersion(str2)) >= 0;
    }
}
