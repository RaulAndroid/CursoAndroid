package com.cice.tutorialjava.poo.interfaces;

public class Racional implements Comparable{
	private int numerador;
	private int denominador;
	
	public Racional(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int compareTo(Object other) throws ComparationException {
		// TODO Auto-generated method stub
		if(!(other instanceof Racional))
			throw new ComparationException("el elemento comparado debe ser un objeto de tipo racional");
		Racional r=(Racional)other;
		if(numerador*r.getDenominador()>denominador*r.getNumerador())
			return 1;
		else if(numerador*r.getDenominador()<denominador*r.getNumerador())
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer();
		String sg=(numerador>=0 && denominador>0)||(numerador>=0&&denominador<0)?"+":"-";
		buffer.append(sg);
		buffer.append(Math.abs(numerador)+"/"+Math.abs(denominador));
		return buffer.toString();
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof Racional))
			return false;
		Racional r=(Racional)obj;
		return (numerador*r.getDenominador()==denominador*r.getNumerador())?true:false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result=17;
		result=31*result+numerador;
		result=31*result+denominador;
		return result;
		
	}
}
