package com.sgcib.coffeemachine.domain.model;

public enum OrderType {
	CHOCOLATE("H"), TEA("T"), COFFEE("C"), MESSAGE("M");

	private String label;

	private OrderType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
