package com.wuxin.factory.method;

import java.util.ArrayList;
import java.util.List;

/**
 * ContreteCreator(具体的创建者)
 * @author Administrator
 *
 */
public class IDCardFactory extends Factory{
	private List<String> owners = new ArrayList<String>();
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product p) {
		if (p instanceof IDCard) {
			owners.add(((IDCard)p).getOwner());
		}
	}
	
	public List<String> getOwners() {
		return owners;
	}
}
