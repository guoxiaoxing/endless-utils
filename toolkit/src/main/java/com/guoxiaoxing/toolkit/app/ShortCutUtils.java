package com.guoxiaoxing.toolkit.app;

/**
 * Author: guoxiaoxing
 * Email: guoxiaoxingv@163.com
 * Site: https://github.com/guoxiaoxing
 * Date: 16/4/15 下午5:42
 * Function: 创建删除快捷图标
 * <p/>
 * 需要权限: com.android.launcher.permission.INSTALL_SHORTCUT com.android.launcher.permission.UNINSTALL_SHORTCUT
 * <p/>
 * Modification history:
 * Date                 Author              Version             Description
 * --------------------------------------------------------------------------
 * 16/4/15 下午5:42      guoxiaoxing          1.0
 */
public final class ShortCutUtils {

    /**
     * Don't let anyone instantiate this class.
     */
    private ShortCutUtils() {
        throw new Error("Do not need instantiate!");
    }

    /**
     * 检测是否存在快捷键
     *
     * @param activity Activity
     * @return 是否存在桌面图标
     */
//    public static boolean hasShortcut(Activity activity) {
//        boolean isInstallShortcut = false;
//        final ContentResolver cr = activity.getContentResolver();
//        final String AUTHORITY = "com.android.launcher.settings";
//        final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY
//                + "/favorites?notify=true");
//        Cursor c = cr.query(CONTENT_URI,
//                new String[]{"title", "iconResource"}, "title=?",
//                new String[]{activity.getString(R.string.app_name).trim()},
//                null);
//        if (c != null && c.getCount() > 0) {
//            isInstallShortcut = true;
//        }
//        return isInstallShortcut;
//    }

    /**
     * 为程序创建桌面快捷方式
     *
     * @param activity Activity
     * @param res      res
     */
//    public static void addShortcut(Activity activity, int res) {
//
//        Intent shortcut = new Intent(
//                "com.android.launcher.action.INSTALL_SHORTCUT");
//        // 快捷方式的名称
//        shortcut.putExtra(Intent.EXTRA_SHORTCUT_NAME,
//                activity.getString(R.string.app_name));
//        shortcut.putExtra("duplicate", false); // 不允许重复创建
//        Intent shortcutIntent = new Intent(Intent.ACTION_MAIN);
//        shortcutIntent.setClassName(activity, activity.getClass().getName());
//        shortcut.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
//        // 快捷方式的图标
//        ShortcutIconResource iconRes = Intent.ShortcutIconResource.fromContext(
//                activity, res);
//        shortcut.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, iconRes);
//
//        activity.sendBroadcast(shortcut);
//    }

    /**
     * 删除程序的快捷方式
     *
     * @param activity Activity
     */
//    public static void delShortcut(Activity activity) {
//
//        Intent shortcut = new Intent(
//                "com.android.launcher.action.UNINSTALL_SHORTCUT");
//        // 快捷方式的名称
//        shortcut.putExtra(Intent.EXTRA_SHORTCUT_NAME,
//                activity.getString(R.string.app_name));
//        String appClass = activity.getPackageName() + "."
//                + activity.getLocalClassName();
//        ComponentName comp = new ComponentName(activity.getPackageName(),
//                appClass);
//        shortcut.putExtra(Intent.EXTRA_SHORTCUT_INTENT, new Intent(
//                Intent.ACTION_MAIN).setComponent(comp));
//        activity.sendBroadcast(shortcut);
//    }
}