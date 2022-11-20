package com.hanlin.gulimall.coupon.dao;

import com.hanlin.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author LiaoHanlin
 * @email 1481307@qq.com
 * @date 2022-11-20 23:32:14
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
