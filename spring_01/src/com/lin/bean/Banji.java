package com.lin.bean;
/*
*@author linone
*/

import java.util.Map;

public class Banji {

private	Map<String, String> banJi;

public Map<String, String> getBanJi() {
	return banJi;
}

public void setBanJi(Map<String, String> banJi) {
	this.banJi = banJi;
}

@Override
public String toString() {
	return "Banji [banJi=" + banJi + "]";
}

}
