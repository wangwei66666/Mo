package com.ww.module_study.databinding.handle

import android.content.Context
import android.view.View
import android.widget.Toast

/**
 * @author ww
 * @date 4/29/21.
 * description：
 */
class EventHandleListener(var mContext: Context) {

    fun btnOnClick(view: View) {
        Toast.makeText(mContext, "hello databinding(事件绑定)", Toast.LENGTH_SHORT).show()
    }
}