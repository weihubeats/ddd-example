package com.ddd.example.component.aggreagte;

/**
 * @author : wh
 * @date : 2022/6/8 09:53
 * @description:
 */
public abstract class AbstractAggregate<T> {

    private T oldObject;


    public void setOldObject(T oldObject) {
        this.oldObject = oldObject;
    }

    public T getOld() {
        return oldObject;
    }


}
