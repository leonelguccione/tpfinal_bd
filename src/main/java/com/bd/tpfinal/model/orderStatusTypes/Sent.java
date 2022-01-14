package com.bd.tpfinal.model.orderStatusTypes;

import com.bd.tpfinal.model.OrderStatus;

public class Sent extends OrderStatus {
	
	@Override
	public boolean canFinish() {
		return true;
	}

	@Override
	public boolean finish() throws Exception {
		// Se actualizan los puntajes del cliente y del DeliveryMan
		this.getOrder().addClientScore();
		this.getOrder().addDeliveryManScore();
		
		return true;
	}
	
}