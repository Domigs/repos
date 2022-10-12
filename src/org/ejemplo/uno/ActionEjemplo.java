package org.ejemplo.uno;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ActionEjemplo extends ActionSupport{
	
	public String execute () {
		System.out.println("EJECUTO ACCION EN STRUTS");
		return SUCCESS;
	}
}
