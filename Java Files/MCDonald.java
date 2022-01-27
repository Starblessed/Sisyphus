import java.util.Scanner;

public class MCDonald {
	
	public static String alfanum = "1234567890abcdefghijklmnopqrstuvwxyz_";
	public static String[] loki = {"1qw","0po","2we","9oi","3er","8iu","4rt","7uy","5ty","6yt","6yu","5tr","7ui","4re","8io","3ew","9op","2wq","0p_","1qa","azx","kmn","sxc","jnb","dcv","hbv","fvb","gvc","gbn","fcx","hnm","dxz","147","258","369","852","741"};
	public static Scanner sc = new Scanner(System.in);

	public static void codingAgent() {
		
		String inputMsg = sc.next();
		System.out.print("Mensagem codificada com sucesso, confira: ");
		for(int i = 0; i<= inputMsg.length() - 1; i++) {
				
			for(int j = 0; j <= alfanum.length() - 1;j++) {
				if(inputMsg.charAt(i) == alfanum.charAt(j)) {
					
					 System.out.print(loki[j]);
				}
			}
		}
	}
	public static void decodingAgent() {
		
		String inputCod = sc.next();
		System.out.print("Mensagem decodificada com sucesso, confira: ");
		for(int i = 0; i<= inputCod.length() - 1; i+=3) {
			String codeInterval = "";
			codeInterval = codeInterval + inputCod.charAt(i) + inputCod.charAt(i+1) + inputCod.charAt(i+2);
			
			for(int j = 0; j <= alfanum.length() - 1; j++) {
				
				if(codeInterval.equals(loki[j])) {
					
					 System.out.print(alfanum.charAt(j));
				}
			}
		}
		
	}
	public static void codificador() {
		
		System.out.println("Insira a mensagem nao codificada: (Nao utilize letras maiusculas e nem acentuadas. Utilize _ no lugar dos espacos.)");
		codingAgent();
		
	}

	public static void decodificador() {
		
		System.out.println("Insira a mensagem codificada: ");
		decodingAgent();
		
	}
	
	public static void inMenu() {
		
		System.out.println("Insira o servico desejado: (1 para codificar, 2 para decodificar)");
		int funcao = sc.nextInt();
		
		if(funcao == 1) {
			
			codificador();
			
		} else if(funcao ==2) {
			
			decodificador();
			
		} else {
			System.out.println("Comando invalido, reinicie o programa.");
	
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		inMenu();
		
		
		
	}
}
