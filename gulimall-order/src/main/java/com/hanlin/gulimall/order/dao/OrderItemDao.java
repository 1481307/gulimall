package com.hanlin.gulimall.order.dao;

import com.hanlin.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author LiaoHanlin
 * @email 1481307@qq.com
 * @date 2022-11-20 23:43:04
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
