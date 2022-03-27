class TCirculo{
	//****DEFINICION DE ATRIBUTOS****
	private double radio;
	
	
	//****DEFINICION DE METODOS****
	//METODOS CONTRUCTORES
	TCirculo(){
		radio = 0;
	}
	
	TCirculo(double radio){
		setRadio(radio);
	}
	
	//METODO SET
	public void setRadio(double radio){
		this.radio = radio;
	}
	
	//METODO GET
	public double getRadio(){
		return radio;
	}
	
	//METODOS DIVERSOS
	public double calcularArea(){
		return Math.PI*radio*radio;
	}
	
	public double calcularPerimetro(){
		return 2*Math.PI*radio;
	}
	
	@Override
	public String toString(){
		String cadena;
		
		cadena = "El perimetro del circulo de radio " + Double.toString(radio) + " es: " + calcularPerimetro() + "\n" + 
		"El arena del circulo de radio " + Double.toString(radio) + " es: " + calcularArea() + "\n";
		
		return cadena;
	}
}//FIN DE CLASE TCIRCULO
