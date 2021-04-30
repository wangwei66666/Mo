package com.ww.module_study.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ww.module_study.R
import com.ww.module_study.databinding.bean.User
import com.ww.module_study.databinding.handle.EventHandleListener
import kotlin.math.roundToInt

/**
 * @author ww
 * @date 4/29/21.
 * description：使用dataBinding展示图片
 * 问题解决：
 * https://blog.csdn.net/jie1123161402/article/details/81736677
 */
class DataBinding3Activity : AppCompatActivity() {
    private val binding: Activity3BindingDataBinding by lazy {
        Activity3BindingDataBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.user = User("明星", (Math.random() * 5 + 1).roundToInt())
        binding.eventHandle = EventHandleListener(this)

        binding.netImgae = "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg1.gtimg.com%2Fent%2Fpics%2Fhv1%2F207%2F150%2F1605%2F104403582.jpg&refer=http%3A%2F%2Fimg1.gtimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1618055817&t=82b21a7c70f4af742601ecded168d371"
        binding.localImgae = R.drawable.ic_zhm_pic
    }

}