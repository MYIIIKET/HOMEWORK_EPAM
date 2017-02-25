package com.mylllket_inc.app;

import java.lang.annotation.*;

@Target(value=ElementType.TYPE)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface SubmarineExist {
    String name();
}


