package org.hnitacm.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.hnitacm.mapper.OrderInfoMapper;
import org.hnitacm.pojo.OrderInfo;
import org.hnitacm.service.OrderInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Leo
 * @since 2020-05-21
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
