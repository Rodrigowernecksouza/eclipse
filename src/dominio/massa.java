package dominio;

public class massa {
    private float massaInicial;
    private float massaFinal;
    private int tempo;

    public massa(float massaInicial, float massaFinal, int tempo) {
        super();
        this.massaInicial = massaInicial;
        this.massaFinal = massaFinal;
        this.tempo = tempo;
    }

    public float getMassaInicial() {
        return massaInicial;
    }

    public void setMassaInicial(float massaInicial) {
        this.massaInicial = massaInicial;
    }

    public float getMassaFinal() {
        return massaFinal;
    }

    public void setMassaFinal(float massaFinal) {
        this.massaFinal = massaFinal;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }


    public void calculaTempo() {
       massaFinal = massaInicial;
       while (massaFinal >= 0.5) { 
            massaFinal/=2; // massaFinal = massaFinal /2
            tempo += 50;  // tempo = tempo + 50}
       }
    }
   }	
{
	int main()	
    {
    	int meiaVida = 0;
    			
    	float gramas = 0;
    	float segundos = 0, minutos = 0, horas = 0;
    
    	scanf("%f", &gramas);
    	
    	
    	while(gramas > 0.5)
    	{
    		gramas /= 2;
    		meiaVida++;
    	}
    	
    
    	segundos = meiaVida * 50;
    	
    	minutos = segundos/ 60;
    	horas = minutos / 60;
    	
    	
    	
    	printf("Tempo gasto para atingir um valor menor que 0,5g:\n");
    	
    	printf("%.2f segundos\n", segundos);
    	public void printf("%.2f minutos\n", minutos);
    	public void printf("%.2f horas\n", horas);
    	
    	return 0;   
}
}

