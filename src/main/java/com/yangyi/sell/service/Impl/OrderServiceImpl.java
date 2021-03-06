package com.yangyi.sell.service.Impl;

import com.yangyi.sell.dto.OrderDTO;
import com.yangyi.sell.service.OrderService;
import com.yangyi.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        //1. 查询商品（数量, 价格）
            //2. 计算订单总价
            //订单详情入库
            //3. 写入订单数据库（orderMaster和orderDetail）
            //4. 扣库存
            //发送websocket消息
            return null;
    }

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(Pageable pageable) {
        return null;
    }
}
