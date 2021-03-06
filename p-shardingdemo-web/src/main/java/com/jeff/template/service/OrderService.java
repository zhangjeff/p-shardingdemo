package com.jeff.template.service;

import com.jeff.template.api.IOrderService;
import com.jeff.template.mapper.base.OrderMapper;
import com.jeff.template.model.base.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int insertOrder(Order order) {
        return orderMapper.insert(order);
    }

    @Override
    public List<Order> listOrder() {
        return orderMapper.selectByExample(null);
    }
}
