package com.lj.daily.coupon;

import java.util.Date;

/**
 * @author lijin <p>lijin@imdada.cn</p>
 * @date 2016/12/14.
 */
public class Coupon {

    private Long couponId;
    private String couponName;
    private Date crateDate;
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Date getCrateDate() {
        return crateDate;
    }

    public void setCrateDate(Date crateDate) {
        this.crateDate = crateDate;
    }
}
