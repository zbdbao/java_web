package com.meme.webservice.test;

public class CalculateService {
	public float plus(float x, float y){
		return x+y;
	}
	public float minus(float x, float y){
		return x-y;
	}
	public float multiply(float x, float y){
		return x*y;
	}
	public float divide(float x, float y){
		if( y==0 ){
			return -1;
		}else{
			return x/y;
		}
	}
}
