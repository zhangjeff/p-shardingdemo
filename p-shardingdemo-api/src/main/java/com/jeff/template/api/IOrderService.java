package com.jeff.template.api;


import com.jeff.template.model.base.Order;

import java.util.List;


public interface IOrderService {

    int insertOrder(Order order);

    List<Order> listOrder();
}
