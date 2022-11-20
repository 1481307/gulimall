package com.hanlin.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanlin.common.utils.PageUtils;
import com.hanlin.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author LiaoHanlin
 * @email 1481307@qq.com
 * @date 2022-11-20 23:44:47
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

