package com.huawei.l00379880.mythread.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/***********************************************************
 * @Description : 线程不安全
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2018/7/15 17:15
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
@Target(ElementType.TYPE)
// 仅对源码作标注
@Retention(RetentionPolicy.SOURCE)
public @interface ThreadNotSafe {
    String value() default "";
}
