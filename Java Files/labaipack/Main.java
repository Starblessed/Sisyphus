package labaipack;

import java.util.*;
public class Main {

	public static int tamanho;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Insira o tamanho do labirinto (em movimentos): ");
		tamanho = sc.nextInt();
		int[] gabarito = new int[tamanho+1];
		int[][] erros = new int[tamanho+1][3];
		
		for(int i = 1; i<=tamanho; i++) {
			
			
			
			
			System.out.println("Estrada " + i);
			int validacao;
			System.out.println(erros[i][0]);
			System.out.println(erros[i][1]);
			System.out.println(erros[i][2]);
			int movimento = 0;
			for(int j = movimento; j == erros[i][0] ||
					j == erros[i][1] || j == erros[i][2] || j == 0; j = movimento) {
			if(gabarito[i] == 0) {
				
			
				double aleatorio = (((Math.random())+0.0001)*4);
				System.out.println(Math.ceil(aleatorio));
			
			
				if(aleatorio<=1) {
				movimento = 1;
				
				
				
				} else if(aleatorio>1 && aleatorio<=2) {
				movimento = 2;
				
				
				} else if(aleatorio>2 && aleatorio<=3) {
				movimento = 3;
				
				
				} else {
				movimento = 4;
				
				
				}
			} else {
				movimento = gabarito[i];
			}
			}
			
				//System.out.println("Teste");
				if(movimento == 1) {
				
					System.out.println("Me movimentei para frente!");
				
				} else if(movimento == 2) {
					
					System.out.println("Me movimentei para cima!");
					
				} else if(movimento == 3) {
					
					System.out.println("Me movimentei para tras!");
					
				} else if(movimento == 4) {
					
					System.out.println("Me movimentei para baixo!");
					
				}
				//System.out.println(aleatorio);
				System.out.println("O meu movimento foi valido?");
				validacao = sc.nextInt();
				if (validacao == 1) {
					gabarito[i] = movimento;
					System.out.println("gabarito antes: " + gabarito[i]);
				} else {
					
					if(erros[i][0] != 1 && erros[i][0] != 2 &&
							erros[i][0] != 3 && erros[i][0] != 4) {
					
					erros[i][0] = movimento;
					i = 0;
					System.out.println(erros[i][0]);
					
					} else if(erros[i][1] != 1 && erros[i][1] != 2 &&
							erros[i][1] != 3 && erros[i][1] != 4) {
					
					erros[i][1] = movimento;
					i = 0;
					System.out.println(erros[i][1]);
					
					} else if(erros[i][2] != 1 && erros[i][2] != 2 &&
							erros[i][2] != 3 && erros[i][2] != 4) {
						
					erros[i][2] = movimento;
					i = 0;
					System.out.println(erros[i][2]);
					
					}  else if(erros[i][3] != 1 && erros[i][3] != 2 &&
							erros[i][3] != 3 && erros[i][3] != 4) {
						
					erros[i][2] = movimento;
					i = 0;
					System.out.println(erros[i][3]);
					
					}
					
					System.out.println("Reiniciando...");
					
					
				}
			
				
				
			
			
			
			
		}
		
		System.out.println("Aparentemente, eu venci o jogo!");
		System.out.println("Movimentos: ");
		String nomeMove = "";
		for(int retro = 1; retro <= tamanho; retro++) {
			
			switch(gabarito[retro]) {
			
			case 1:
				nomeMove = "Frente";
				break;
			case 2: 
				nomeMove = "Cima";
				break;
			case 3:
				nomeMove = "Tras";
				break;
			case 4:
				nomeMove = "Baixo";
				break;
			
			
			
			}
			System.out.println("Estrada " + retro + ": " + nomeMove);
			
		}
	}
}
