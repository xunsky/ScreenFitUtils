package xunsky.utils.screenfitutils;

import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.unit.Subunits;

public class ScreenFitUtils {
    public static void init(){
        /**
         * 仅适配360*640的设计稿
         * 不影响dp的使用
         * 需要适配的布局使用pt单位
         */
        AutoSizeConfig.getInstance()
                .getUnitsManager()
                .setSupportDP(false)
                .setSupportSubunits(Subunits.PT);
    }
}
