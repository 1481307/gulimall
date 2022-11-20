package com.hanlin.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanlin.common.utils.PageUtils;
import com.hanlin.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author LiaoHanlin
 * @email 1481307@qq.com
 * @date 2022-11-20 23:32:14
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

