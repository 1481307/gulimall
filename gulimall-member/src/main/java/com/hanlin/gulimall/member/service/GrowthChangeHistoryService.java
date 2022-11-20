package com.hanlin.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanlin.common.utils.PageUtils;
import com.hanlin.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author LiaoHanlin
 * @email 1481307@qq.com
 * @date 2022-11-20 23:38:57
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

