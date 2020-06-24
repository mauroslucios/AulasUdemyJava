package AulasUdemyJava.enumeracao;

import java.util.Date;

public class Order {

	private Integer id;
	private Date moment;
	//status do pedido
	private OrderStatus status;
	
	//contructor vazio
	public Order() {
		
	}
	
	//constructor com argumentos
	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	//método toString
	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
}
