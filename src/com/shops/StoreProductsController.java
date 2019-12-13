package com.shops;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.mysql.jdbc.CommunicationsException;


@ManagedBean
@SessionScoped
public class StoreProductsController {
	
	DAO dao;
	ArrayList<StoreProducts> products;
	
	public StoreProductsController() {
		super();
		try {
			dao = new DAO();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String loadStoreProducts(int pid) {
		System.out.println("In loadproducts()");
		try {
			products = dao.loadStoreProducts(pid);
			return "StoreProducts";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<StoreProducts> getProducts() {
		return products;
	}
	
}
