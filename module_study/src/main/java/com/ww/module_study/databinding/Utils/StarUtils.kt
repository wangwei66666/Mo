package com.ww.module_study.databinding.Utils

/**
 * @author ww
 * @date 4/29/21.
 * description：
 */
object StarUtils {
    @JvmStatic
    fun getStar(star: Int): String {
        return when (star) {
            1 -> "1星"
            2 -> "2星"
            3 -> "3星"
            4 -> "4星"
            5 -> "5星"
            else -> "*星"
        }
    }
}