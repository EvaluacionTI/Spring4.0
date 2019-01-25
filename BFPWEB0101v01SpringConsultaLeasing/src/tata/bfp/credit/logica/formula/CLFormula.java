package tata.bfp.credit.logica.formula;

public class CLFormula {
	int BASE_CALCULO = 360;
	
	public double calculoInteres(double pTasa, double pNumeroDias, double pCapital, int pBaseCalculo){
		double lInteresCompuesto;
		
		if (pBaseCalculo == 0){
			lInteresCompuesto = (Math.pow((1+pTasa), (pNumeroDias/BASE_CALCULO))-1)*pCapital;
		}else{
			lInteresCompuesto = (Math.pow((1+pTasa), (pNumeroDias/pBaseCalculo))-1)*pCapital;
		}
		return lInteresCompuesto;
	}
	

}
