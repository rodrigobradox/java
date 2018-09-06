package br.com.rod.sandbox.binary;

/**
 * @author Rodrigo Feitosa Soares
 * Bit offset (Deslocamento de Bit)
 */

public class BitOffset {
    
    private static String BINARY_PAD = "0000000000000000";
    
    private static String intToBinary(int inteiro, String lpad) {
        String binary = Integer.toBinaryString(inteiro);
        return lpad.substring(binary.length()) + binary;
    }

    public static void main (String[] args) {
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