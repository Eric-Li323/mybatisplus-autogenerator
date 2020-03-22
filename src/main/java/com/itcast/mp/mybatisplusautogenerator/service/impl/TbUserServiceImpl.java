package com.itcast.mp.mybatisplusautogenerator.service.impl;

import com.itcast.mp.mybatisplusautogenerator.entity.TbUser;
import com.itcast.mp.mybatisplusautogenerator.mapper.TbUserMapper;
import com.itcast.mp.mybatisplusautogenerator.service.ITbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-03-22
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

}
