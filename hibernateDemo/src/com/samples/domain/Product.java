package com.samples.domain;

public class Product {
	

		private int id;
		private String pname;
		public Product() {}

		public Product(String pname) {
			this.pname = pname;
		}

		public int getid() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getpname() {
			return pname;
		}

		public void setpname(String pname) {
			this.pname = pname;
		}

		@Override
		public String toString() {
			return "Product[id=" + id + ", pname=" + pname + "]";
		}

}
