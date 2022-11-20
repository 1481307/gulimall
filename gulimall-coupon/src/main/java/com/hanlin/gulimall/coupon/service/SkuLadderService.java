package com.hanlin.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanlin.common.utils.PageUtils;
import com.hanlin.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author LiaoHanlin
 * @email 1481307@qq.com
 * @date 2022-11-20 23:32:13
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

