package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author mzh
 * @email mazhonghuiMAY@163.com
 * @date 2024-07-08 16:04:11
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
