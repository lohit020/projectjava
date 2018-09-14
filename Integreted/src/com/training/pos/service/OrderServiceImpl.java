package com.training.pos.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.pos.bean.OrderBean;
import com.training.pos.bean.PosException;
import com.training.pos.dao.OrderDao;


@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderDao ord1;
	@Override
	public List<OrderBean> getOrder() throws PosException {
		return ord1.getOrder();
		
	}

	@Override
	public List<OrderBean> addOrder(OrderBean ord) throws PosException {
		return ord1.addOrder(ord);
	}

	@Override
	public int delete(String orderId) {
			System.out.println(orderId);
			return ord1.delete(orderId);
			
		}

	@Override
	public OrderBean getOrderById(String orderId) {
		
		return ord1.getOrderById(orderId);
	}

	@Override
	public int update(OrderBean order) {
		
		return ord1.update(order);
	}
	}
	


