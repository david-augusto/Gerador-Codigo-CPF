/**
 *
 * @author David
 */


public class CPF 
{
private int NumeroInicial;
    
    public CPF(int NumeroInicial) {
        this.NumeroInicial = NumeroInicial;
    }    

    private int primeiroDigito(int x){
    int i = 2, soma = 0,r;

	while(x > 0){
    soma+= ((x%10) * i);
	x = x/10;
	i++;
	}
    r = soma%11;
	if((r == 0)|| (r == 1))
		return (0);
	else
		return (11 - r);
}

    private  int segundoDigito(int x,int y){
    int i = 3, soma,r;
	soma = y*2;
    
	while(x > 10){
    soma+= ((x%10) * i);
	x = x/10;
	i++;
	}
    r = soma%11;
	if((r == 0)|| (r == 1))
		return (0);
	else
		return (11 - r);
}

    public void gerador(){
       
       int d1 = this.primeiroDigito(this.NumeroInicial);
       int d2 = this.segundoDigito(this.NumeroInicial, d1);
       System.out.println("CPF + Codigo Verificador: " + this.NumeroInicial + "-" + d1 +""+ d2);
    }
    

}

 
