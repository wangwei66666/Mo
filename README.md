# Mo

### 一. [**kotlin Gradle DSL**](https://docs.gradle.org/current/userguide/kotlin_dsl.html#secmulti_project_builds)

**项目中的【buildSrc】**

### 二. Jetpack与MVVM

- Jetpack

  ​	Jetpack是-个由多个库组成的套件，可帮助开发者遵循最佳做法，减少样板代码并编写可在各种Android版本和设备中一致运行的代码，让开发者精力集中编写重要的代码。

  - MVC、MVP与MVVM
  - AndroidX
    - AndroidX命名空间中的包含Android Jetpack库
    - AndroidX代替Android Support Library
    - AAC (Android Architecture Component) 中的组件并入AndroidX
    - 其他一些需要频繁更新和迭代的特性也被并入了AndroidX
  - Jetpack组成

- LifeCycle

  ​	帮助开发者建立可感知生命周期的组件，组件在其内部管理自己的生命周期，从而降低模块耦合度，降低内存泄漏发生的可能性，Activity、Fragment、 Service、 Application均有LifeCycle支持

  - Lifecycle解耦页面与组件
  - LifecycleService解耦Service与组件
  - ProcessLifecycleOwner监听应用程序生命周期
    - 针对整个应用程序的监听，与Activity数量 无关。
    - Lifecycle.Event.ON CREATE只会被调用一次，Lifecycle.Event.ON DESTROY永远不会被调用。

- ViewModel

  ​	它是介于View (视图)和Model (数据模型)之间的桥梁；使视图和数据能够分离，也能保持通信；屏幕旋转之后用户操作数据仍然存在；独立于配置变化；

  ![image.png](https://upload-images.jianshu.io/upload_images/2194177-7ca0f164331bdb31.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/310)

  > 不要向ViewModel中传入Context，会导致内存泄漏。如果要使用Context,请使用AndroidViewMode中的Application

  - 作用与应用

    ![image.png](https://upload-images.jianshu.io/upload_images/2194177-4846773328d0114d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/400)

  - 生命周期特性

  - AndroidViewModel

- LiveData

  在ViewModel中的数据发生变化时通知页面

  ![image.png](https://upload-images.jianshu.io/upload_images/2194177-f42c2cd673f7b2e9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/400)

  - 应用与优势

    > 确保界面符合数据状态
    > 不会发生内存泄漏
    > 不会因Activity停止而导致崩溃
    > 不再需要手动处理生命周期
    > 数据始终保持最新状态
    > 适当的配置更改
    > 共享资源

  - ViewModel+LiveData实现Fragment间通信

- DataBinding

  - DataBinding意义
  - DataBinding应用
  - ActivityMainBinding的由来
  - 二级页面的绑定
  - 自定义BindingAdapter加载网络图片与参数可选
  - 双向绑定BaseObservable与ObservableField
  - RecyclerView的绑定
  - DataBinding+ViewModel+LiveData整合

- MVVM架构设计

  - MVVM架构与Jetpack
  - 数据模型驱动界面更新
  - 使用Jetpack组件构建MVVM应用程序



