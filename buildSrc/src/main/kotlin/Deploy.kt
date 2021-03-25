import java.text.SimpleDateFormat
import java.util.*

/**
 * @author ww
 * @date 3/25/21.
 * description：
 */
object Deploy {
    //当前时间
    fun getSystemTime():String{
        val mSimpleDateFormat = SimpleDateFormat("MM_dd HH_mm", Locale.CHINA)
        return mSimpleDateFormat.format(System.currentTimeMillis())
    }
}