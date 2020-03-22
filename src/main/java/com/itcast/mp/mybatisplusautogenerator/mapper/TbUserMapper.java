package com.itcast.mp.mybatisplusautogenerator.mapper;

import com.itcast.mp.mybatisplusautogenerator.entity.TbUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-03-22
 */
public interface TbUserMapper extends BaseMapper<TbUser> {

    List<TbUser> findAll();

}
