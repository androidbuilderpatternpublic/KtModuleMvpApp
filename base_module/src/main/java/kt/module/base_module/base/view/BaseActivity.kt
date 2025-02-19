package kt.module.base_module.base.view

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.view.View
import com.alibaba.android.arouter.launcher.ARouter
import com.trello.rxlifecycle2.LifecycleProvider
import com.trello.rxlifecycle2.android.ActivityEvent
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity
import kt.module.base_module.base.presenter.IBasePresenter
import kt.module.base_module.utils.StatusBarUtil
import kt.module.common_module.base.presenter.BasePresenter
import kt.module.common_module.base.view.IBaseView
import me.jessyan.autosize.internal.CustomAdapt
import java.lang.Exception

open abstract class BaseActivity<T : IBasePresenter> : RxAppCompatActivity(), CustomAdapt,
    LifecycleProvider<ActivityEvent> {

    protected open val view: View? = null

    @LayoutRes
    protected open val contentLayoutId: Int = -1

    open val presenter: T? = null
    private var mPresenter: T? = null

    protected open val isDarkStatus: Boolean = true//沉浸式：标签亮/深色

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter = presenter
        if (isDarkStatus) {
            StatusBarUtil.setDarkImmersion(this)
        } else {
            StatusBarUtil.setBrightImmersion(this)
        }

        try {
            if (contentLayoutId > 0) {
                setContentView(contentLayoutId)
            } else {
                if (view != null) {
                    setContentView(view)
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        initViews()
        initEvents()
        ARouter.getInstance().inject(this)
    }

    open fun initViews() {}
    open fun initEvents() {}

    override fun onDestroy() {
        mPresenter?.destroy()
        super.onDestroy()
    }

    override fun isBaseOnWidth(): Boolean {
        return true
    }

    override fun getSizeInDp(): Float {
        return 667f
    }
}