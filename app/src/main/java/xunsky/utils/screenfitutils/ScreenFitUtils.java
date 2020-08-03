package xunsky.utils.screenfitutils;

import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.unit.Subunits;

public class ScreenFitUtils {
    public static void init(){
        /**
         * 在Appliction的onCreate中初始化
         * 或可以让Application继承ScreenFitApplication
         *
         * 仅适配360*640的设计稿
         * 不影响dp的使用
         * 需要适配的布局使用mm单位
         *
         * :CustomAdapt -> 调整以高度为基准适配
         * :CancelAdapt -> 取消适配
         */
        AutoSizeConfig.getInstance()
                .getUnitsManager()
                .setSupportDP(false)
                .setSupportSP(false)
                .setSupportSubunits(Subunits.MM);
        AutoSizeConfig.getInstance()
                .setCustomFragment(true);
        /*
        如果是 Dialog、PopupWindow 等控件出现适配失效或适配异常
        重写 Activity 的 getResources() 方法即可，
        同样在每次 show() 之前调用 AutoSize#autoConvertDensity() 即可
        @override
        public Resources getResources() {
        AutoSizeCompat.autoConvertDensityOfGlobal((super.getResources());//如果没有自定义需求用这个方法
        AutoSizeCompat.autoConvertDensity((super.getResources(), 667, false);//如果有自定义需求就用这个方法
        return super.getResources();
        }
         */
    }
}
