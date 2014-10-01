package br.com.omnesti.aulajava01;

public class Carro {
	
	private int id;
	private String Marca;
	private String Modelo;
	private String ano;
	private boolean ligado;
	private int marcha = 0;
	
	public Carro(){
		
	}
	
	public void ligarCarro(){ 
		
		if(this.ligado == false){
			if (this.marcha == 0){
				this.ligado = true;
				System.out.println("RUMMMMM....Carro Ligado!");
				System.out.println("Selecione o Destino ou Dirija Manualmente!");
				
			}else{
				 System.out.println("Verifique a Marcha do Carro Antes de Ligar");
			}
		}else{
			System.out.println("O Já está Carro esta Ligado");
		}
	}
	
	public void acelerar(int velocidade){
		if(this.ligado){
			if(velocidade == 0){
				System.out.println("O Carro esta Parado");
				trocarMarcha(0);
			} else if(velocidade <= 20){
				System.out.println("Passando a 1 Marcha");
				trocarMarcha(1);
			} else if(velocidade > 20 && velocidade <= 40){
				System.out.println("Passando a 2 Marcha");
				trocarMarcha(2);
			} else if (velocidade > 40 && velocidade <= 70){
				System.out.println("Passando a 3 Marcha");
				trocarMarcha(3);
			}else if (velocidade > 70 && velocidade <= 80){
				System.out.println("Passando a 4 Marcha");
				trocarMarcha(4);
			}else if (velocidade > 80 && velocidade <= 100){
				System.out.println("Passando a 5 Marcha");
				trocarMarcha(5);
			}
		}else{
			System.out.println("Para Acelerar Ligue o Carro");
		}
		
	}
	
	private void trocarMarcha(int marcha){
		if(this.ligado == true){
			if (marcha == 0){
				System.out.println("Carro em Marcha Neutra");
			}else{
				if(marcha > this.marcha){
					this.marcha = marcha;
					System.out.println("aumentando de Marcha" + this.marcha);
				}else{
					this.marcha = marcha;
					System.out.println("Reduzindo de Marcha" + this.marcha);
				}
			}
		}
	}
	
	public void desligarCarro(){
		if (this.ligado == true){
			this.acelerar(0);
			this.ligado = false;
			System.out.println("Carro Desligado!");
		}else{
			System.out.println("O carro já esta Desligado!");
		}
	}

}
