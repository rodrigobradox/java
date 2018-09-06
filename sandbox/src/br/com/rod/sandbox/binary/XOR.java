package br.com.rod.sandbox.binary;

/**
 * @author Rodrigo Feitosa Soares
 * XOR (Ou Exclusivo)
 */

public class XOR {
    
    private static String BINARY_PAD = "0000000000000000";
    
    private static String intToBinary(int inteiro, String lpad) {
        String binary = Integer.toBinaryString(inteiro);
        return lpad.substring(binary.length()) + binary;
    }

    public static void main (String[] args) {
        int f = 74; //em bin�rio 1 = 01
        int g = 65; //em bin�rio 2 = 10
        
        System.out.println("XOR");
        System.out.println("------------------------------------------");
        System.out.println("f = "+ f +", g = "+ g);
        System.out.println("------------------------------------------");
        
        int x = f ^ g; //l�-se 01 XOR 10, resultando em 11, que em decimal � 3
        System.out.println("x = f ^ g => "+ f +" ^ "+ g +" => "+ intToBinary(f,BINARY_PAD) +" XOR "+ intToBinary(g,BINARY_PAD) +" => "+ intToBinary(x,BINARY_PAD) +" => "+ x);
        System.out.println("------------------------------------------");
        
        int y = g ^ x; //l�-se 10 XOR 11, resultando em 01, que em decimal � 1
        System.out.println("y = g ^ x => "+ g +" ^ "+ x +" => "+ intToBinary(g,BINARY_PAD) +" XOR "+ intToBinary(x,BINARY_PAD) +" => "+ intToBinary(y,BINARY_PAD) +" => "+ y);
        System.out.println("------------------------------------------");
        
        
        System.out.println("\nDeslocamento de Bit X Produto");
        System.out.println("------------------------------------------");
        int n = 80;
        int div2 = n >> 1;
        int div4 = n >> 2;
        int div8 = n >> 3;
        int mul2 = n << 1;
        int mul4 = n << 2;
        int mul8 = n << 3;
        
        System.out.println("n = " + n + " => " + intToBinary(n, BINARY_PAD));
        System.out.println("------------------------------------------");
        System.out.println("n >> 1 = "+ div2 +" <=> n / 2 = "+ n / 2);
        System.out.println("n >> 2 = "+ div4  +" <=> n / 4 = "+ n / 4);
        System.out.println("n >> 3 = "+ div8  +" <=> n / 8 = "+ n / 8);
        System.out.println("------------------------------------------");
        System.out.println("n << 1 = "+ mul2 +" <=> n * 2 = "+ n * 2);
        System.out.println("n << 2 = "+ mul4  +" <=> n * 4 = "+ n * 4);
        System.out.println("n << 3 = "+ mul8  +" <=> n * 8 = "+ n * 8);
        System.out.println("------------------------------------------");
    }
}