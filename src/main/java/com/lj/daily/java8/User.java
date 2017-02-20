package com.lj.daily.java8;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lijin <p>lijin@imdada.cn</p>
 * @date 2017/2/17.
 */
public class User {

    private String name;
    private Integer age;
    private Integer state;
    private Date createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User:" + name + "," + age + "," + state + "," + new SimpleDateFormat("yy:MM:dd HH:mm:sss").format(createTime);
    }
}
