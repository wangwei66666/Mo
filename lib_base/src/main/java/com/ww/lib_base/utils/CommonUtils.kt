
import android.app.ActivityManager
import android.content.Context
import android.os.Process


/*
 *  文件名:   CommonUtils
 *  描述：    基础工具类
 */
object CommonUtils {

    //获取主进程
    fun getProcessName(mContext: Context): String {
        val am =
            mContext.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val runningApps =
            am.runningAppProcesses ?: return ""
        for (proInfo in runningApps) {
            if (proInfo.pid == Process.myPid()) {
                if (proInfo.processName != null) {
                    return proInfo.processName
                }
            }
        }
        return ""
    }
}