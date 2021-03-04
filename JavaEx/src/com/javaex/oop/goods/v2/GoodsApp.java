package com.javaex.oop.goods.v2;
public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		notebook.name = "LG Gram";
		notebook.price = 1500000;
		//	setter를 이용한 우회 접근
		notebook.setName("LG Gram");
		notebook.setPrice(1500000);

		Goods smartphone = new Goods();
		smartphone.name = "iPhone SE";
		smartphone.price = 650000;
		smartphone.setName("iPhone SE");
		smartphone.setPrice(650000);

		System.out.printf("%s, %d원%n", 
				notebook.name, notebook.price);
				notebook.getName(), notebook.getPrice());
		notebook.showInfo();

		System.out.printf("%s, %d원%n",
				smartphone.name, smartphone.price);

				smartphone.getName(), smartphone.getPrice());
		smartphone.showInfo();
	}

}