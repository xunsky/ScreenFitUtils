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
         */
        AutoSizeConfig.getInstance()
                .getUnitsManager()
                .setSupportDP(false)
                .setSupportSP(false)
                .setSupportSubunits(Subunits.MM);
    }
}
