/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.bdsoft.test.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;
 
public class TestForm extends ValidatorForm {
	 
	private String a;
 
	private String b;

	 
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
 
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}
 
	public String getA() {
		return a;
	}
 
	public void setA(String a) {
		this.a = a;
	}
 
	public String getB() {
		return b;
	}
 
	public void setB(String b) {
		this.b = b;
	}
}