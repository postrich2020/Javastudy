package c_exercise2;

import java.util.Scanner;


public class Product{


		String productNo, productName;
		int stock, sale, income;
		int stock() {
			stock+=income-sale;
			return stock;
		}
		
		public String getProductNo() {
			return productNo;
		}
		public void setProductNo(String productNo) {
			this.productNo = productNo;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getStock() {
			return stock;
		}
		public void setStock(int stock) {
			this.stock = stock;
		}
		public int getSale() {
			return sale;
		}
		public void setSale(int sale) {
			this.sale = sale;
		}
		public int getIncome() {
			return income;
		}
		public void setIncome(int income) {
			this.income = income;
		}
		
}