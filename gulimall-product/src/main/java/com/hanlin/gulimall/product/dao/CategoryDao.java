package com.hanlin.gulimall.product.dao;

import com.hanlin.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author LiaoHanlin
 * @email 1481307@qq.com
 * @date 2022-11-20 22:35:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
