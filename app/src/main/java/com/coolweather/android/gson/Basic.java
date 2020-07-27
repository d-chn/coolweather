package com.coolweather.android.gson;
import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")//由于JSON中的一些字段不太适合作为java字段直接命名，因此使用了@SerializedName来建立映射
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
//创建实体类，用于接纳由GSON解析的JSON数据