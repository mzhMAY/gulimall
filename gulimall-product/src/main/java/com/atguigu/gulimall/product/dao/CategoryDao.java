package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mzh
 * @email mazhonghuiMAY@163.com
 * @date 2024-07-08 14:08:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
