import android.app.Application
import android.text.TextUtils

/**
 * FileName: BaseApp
 * Profile: 基类App
 */
open class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        //只有主进程才能初始化
        val processName = CommonUtils.getProcessName(this)
        if (!TextUtils.isEmpty(processName)) {
            if (processName == packageName) {
                initApp()
            }
        }
    }

    //初始化App
    private fun initApp() {
        ARouterHelper.initHelper(this)
    }
}