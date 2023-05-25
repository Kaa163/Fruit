package com.nianxi.fruit;

import android.app.Application;

import cn.leancloud.LCObject;
import cn.leancloud.LeanCloud;

public class FruitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 提供 this、App ID、绑定的自定义 API 域名作为参数
        LeanCloud.initializeSecurely(
                this,
                "WLLg2DJdOEYWfjAiKbRDBPjG-gzGzoHsz",
                "https://wllg2djd.lc-cn-n1-shared.com"
        );

        LCObject testObject = new LCObject("TestObject");
        testObject.put("key", "Hello World!");
        testObject.saveInBackground().blockingSubscribe();
    }
}
