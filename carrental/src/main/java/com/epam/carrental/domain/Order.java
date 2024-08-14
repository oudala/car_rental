package com.epam.carrental.domain;

import java.math.BigDecimal;
import java.sql.Date;

public class Order {

	private long orderId;
	private long userId;
	private long carId;
	private Date orderDate;
	private Date returnDate;
	private boolean carReturned;
	private BigDecimal rentalcost;

	public Order() {
		super();
	}

	public Order(final long userId, final long carId, final Date orderDate, final Date returnDate,
			final boolean carReturned, final BigDecimal rentalcost) {
		super();
		this.userId = userId;
		this.carId = carId;
		this.orderDate = orderDate;
		this.returnDate = returnDate;
		this.carReturned = carReturned;
		this.rentalcost = rentalcost;
	}

	public Order(final long orderId, final long userId, final long carId, final Date orderDate, final Date returnDate,
			final boolean carReturned, final BigDecimal rentalcost) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.carId = carId;
		this.orderDate = orderDate;
		this.returnDate = returnDate;
		this.carReturned = carReturned;
		this.rentalcost = rentalcost;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(final long orderId) {
		this.orderId = orderId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(final long userId) {
		this.userId = userId;
	}

	public long getCarId() {
		return carId;
	}

	public void setCarId(final long carId) {
		this.carId = carId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(final Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(final Date returnDate) {
		this.returnDate = returnDate;
	}

	public boolean isCarReturned() {
		return carReturned;
	}

	public void setCarReturned(final boolean carReturned) {
		this.carReturned = carReturned;
	}

	public BigDecimal getRentalcost() {
		return rentalcost;
	}

	public void setRentalcost(final BigDecimal rentalcost) {
		this.rentalcost = rentalcost;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + userId + ", carId=" + carId + ", orderDate=" + orderDate
				+ ", returnDate=" + returnDate + ", carReturned=" + carReturned + ", rentalcost=" + rentalcost + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + (int) (carId ^ (carId >>> 32));
		result = (prime * result) + (carReturned ? 1231 : 1237);
		result = (prime * result) + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = (prime * result) + (int) (orderId ^ (orderId >>> 32));
		result = (prime * result) + ((rentalcost == null) ? 0 : rentalcost.hashCode());
		result = (prime * result) + ((returnDate == null) ? 0 : returnDate.hashCode());
		result = (prime * result) + (int) (userId ^ (userId >>> 32));
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Order other = (Order) obj;
		if (carId != other.carId) {
			return false;
		}
		if (carReturned != other.carReturned) {
			return false;
		}
		if (orderDate == null) {
			if (other.orderDate != null) {
				return false;
			}
		} else if (!orderDate.equals(other.orderDate)) {
			return false;
		}
		if (orderId != other.orderId) {
			return false;
		}
		if (rentalcost == null) {
			if (other.rentalcost != null) {
				return false;
			}
		} else if (!rentalcost.equals(other.rentalcost)) {
			return false;
		}
		if (returnDate == null) {
			if (other.returnDate != null) {
				return false;
			}
		} else if (!returnDate.equals(other.returnDate)) {
			return false;
		}
		if (userId != other.userId) {
			return false;
		}
		return true;
	}

}