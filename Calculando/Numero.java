package Calculando;

public class Numero {

    
    public double n1;
    public double n2;
    public String resul;

    public void setN1(double n1) {
		this.n1 = n1;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public void setResul(String resul) {
		this.resul = resul;
	}

	public double getN1() {
		return n1;
	}

	public double getN2() {
		return n2;
	}

	public String getResul() {
		return resul;
	}

	public double calcular() {
		double resultado = 0;
        
        
        switch (resul) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "^":
                return Math.pow(n1, n2);
            case "R":
                if (n1 < 0) {
                    System.out.println("Não existe raiz de número negativo.");
                } else {
                    return Math.sqrt(n1);
                }
                break;
            case "/":
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Impossível realizar uma divisão por zero.");
                }
                break;
            default:
                System.out.println("Erro");
            }
            return resultado;
        }
}
