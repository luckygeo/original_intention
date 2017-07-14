package me.common.utils;

/**
 * 枚举s
 * enum很像特殊的class，实际上enum声明定义的类型就是一个类
 * 所有的枚举值都是类静态常量
 * 反编译之后
 * public static final me.common.utils.SeasonEnums SPRING;

 public static final me.common.utils.SeasonEnums SUMMER;

 public static final me.common.utils.SeasonEnums AUTUMN;

 public static final me.common.utils.SeasonEnums WINTER;

 public static me.common.utils.SeasonEnums[] values();
 Code:
 0: getstatic     #1                  // Field $VALUES:[Lme/common/utils/SeasonEnums;
 3: invokevirtual #2                  // Method "[Lme/common/utils/SeasonEnums;".clone:()Ljava/lang/Object;
 6: checkcast     #3                  // class "[Lme/common/utils/SeasonEnums;"
 9: areturn

 public static me.common.utils.SeasonEnums valueOf(java.lang.String);
 Code:
 0: ldc           #4                  // class me/common/utils/SeasonEnums
 2: aload_0
 3: invokestatic  #5                  // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
 6: checkcast     #4                  // class me/common/utils/SeasonEnums
 9: areturn

 * @星期五
 */
public enum SeasonEnums {
    SPRING(1),
    SUMMER(2),
    AUTUMN(3),
    WINTER(4);
    private int i;
    private SeasonEnums(int i){
        this.i = i;
    }
    public int getI(){
        return i;
    }
    public String toString(){
        return super.toString()+" is ("+i+" season)";
    }



}
