# 潘多拉-尺寸库

可以直接使用各种适配尺寸

[![](https://jitpack.io/v/com.gitee.clbDream/pdl-box_dimens.svg)](https://jitpack.io/#com.gitee.clbDream/pdl-box_dimens)

![](images/banner.png)

## 简介

这是一个Android开发工具库系列开源项目,不包含任何隐私信息的搜集,完全可以通过国内应用市场隐私合规的检测,现在开源,供广大Android开发程序员同胞使用,欢迎大家一起来进行维护

我也是个萌新程序员,项目有什么地方不足,请多多指教,哈哈

#### 作者的其他开源项目

* 多功能记录项目<事迹>
  ：[RecordThings-Android](https://github.com/clbDream/RecordThings-Android) ![](https://img.shields.io/github/stars/clbDream/RecordThings-Android.svg) ![](https://img.shields.io/github/forks/clbDream/RecordThings-Android.svg)
* 常用第三方库集合<库多多>
  ：[Pdlbox_Library](https://github.com/clbDream/Pdlbox_Library) ![](https://img.shields.io/github/stars/clbDream/Pdlbox_Library.svg) ![](https://img.shields.io/github/forks/clbDream/Pdlbox_Library.svg)
* 常用工具库集合<Tools>
  ：[Pdlbox_Tools](https://github.com/clbDream/Pdlbox_Tools) ![](https://img.shields.io/github/stars/clbDream/Pdlbox_Tools.svg) ![](https://img.shields.io/github/forks/clbDream/Pdlbox_Tools.svg)
* 尺寸库<Dimens>
  ：[Pdlbox_Dimens](https://github.com/clbDream/Pdlbox_Dimens) ![](https://img.shields.io/github/stars/clbDream/Pdlbox_Dimens.svg) ![](https://img.shields.io/github/forks/clbDream/Pdlbox_Dimens.svg)

## 如何使用

1. Add the JitPack repository to your build file

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

2. Add the dependency(版本信息查看上面的标签里面)

```
dependencies {
	        implementation 'com.gitee.clbDream:pdl-box_dimens:$version'
	}
```

3. 在XML布局文件中使用

```
    <View
        android:id="@+id/view"
        android:layout_width="@dimen/dp_50"
        android:layout_height="@dimen/dp_50"
        android:layout_marginStart="168dp"
        android:layout_marginTop="120dp"
        android:background="#F44336"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```

4. 在代码中使用

```

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //代码中设置尺寸
        R.dimen.dp_50
        R.dimen.sp_10

    }
}
```

# 常见问题

1. 为什么我在项目中使用时无法识别对应的尺寸,无法以R.dimen.sp_10方式使用
   这是因为在高版本APG中默认增加了配置,会为每个库文件生成R文件,如果设置为true,就需要指定包名com.pdlbox.dimensutil.R.dimen.sp_10,如果想以R.dimen.sp_10方式使用的话,需要更改gradle.properties中以下配置为false
```
# Enables namespacing of each library's R class so that its R class includes only the
# resources declared in the library itself and none from the library's dependencies,
# thereby reducing the size of the R class for that library
android.nonTransitiveRClass=false
```
