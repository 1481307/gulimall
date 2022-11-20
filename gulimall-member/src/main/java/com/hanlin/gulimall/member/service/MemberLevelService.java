package com.hanlin.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanlin.common.utils.PageUtils;
import com.hanlin.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author LiaoHanlin
 * @email 1481307@qq.com
 * @date 2022-11-20 23:38:57
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

