import java.util.Scanner;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

/**
 * Classe para testar os métodos implementados na classe Vetor.
 *
 * @author Roland Teodorowitsch
 * @version 22 maio 2022
 */
public class TestaVetor {

    private final static boolean ADVERTENCIAS = false;

    private static int[] v16 = {10,16,4,11,1,14,6,15,3,13,7,9,2,8,12,5};
    private static int[] v16b = {10,16,4,11,1,14,6,15,3,13,7,0,0,0,0,0};
    private static int[] v20 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    private static int[] v20b = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0,0,0,0,0};
    private static int[] v25 = {25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
    private static int[] v25b = {25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,0,0,0,0,0};
    private static int[] v21 = {0xaa55,1,0x55aa,0xaa55,2,0x55aa,0xaa55,3,0x55aa,0xaa55,4,0x55aa,0xaa55,5,0x55aa,0xaa55,6,0x55aa,0xaa55,7,0x55aa};
    
    /**
     * Metodo que verifica se duas variáveis do tipo <code>String</code> contém uma relação dos mesmos valores inteiros.
     * @param s1 Primeira variável <code>String</code> com uma relação de valores inteiros (separados por espaço).
     * @param s2 Segunda variável <code>String</code> com uma relação de valores inteiros (separados por espaço).
     * @return <code>true</code> se ambas as variáveis <code>String</code> contiverem os mesmos valores inteiros, na mesma ordem,
     * ou <code>false</code> em caso contrário.
     */
    private static boolean contemMesmosValores(String s1, String s2) {
        Scanner sc1 = new Scanner(s1);
        Scanner sc2 = new Scanner(s2);
        while (sc1.hasNextInt()) {
                if (!sc2.hasNextInt())
                    return false;
                int i1 = sc1.nextInt();
                int i2 = sc2.nextInt();
                if (i1 != i2)
                    return false;
        }
        if (sc2.hasNextInt())
            return false;
        return true;
    }
    
    /**
     * Verifica se dois vetores de inteiros são iguais, chamando o método ehIgual() para vetores parcialmente preenchidos.
     * @param v1 Primeiro vetor a ser testado.
     * @param v2 Segundo vetor a ser testado.
     * @return <code>true</code> se os dois vetores tiverem exatamente o mesmo conteúdo, ou <code>false</code> em caso contrário.
     */
    private static boolean ehIgual(int[] v1, int[] v2) {
        return ehIgual(v1,v1.length,v2,v2.length);
    }

    /**
     * Verifica se dois vetores parcicalmente preenchidos de inteiros são iguais.
     * @param v1 Primeiro vetor parcialmente preenchido a ser testado.
     * @param t1 Tamanho do primeiro vetor parcialmente preenchido a ser testado.
     * @param v2 Segundo vetor parcialmente preenchido a ser testado.
     * @param t2 Tamanho do segundo vetor parcialmente preenchido a ser testado.
     * @return <code>true</code> se os dois vetores tiverem exatamente o mesmo conteúdo, ou <code>false</code> em caso contrário.
     */
    private static boolean ehIgual(int[] v1,int t1, int[] v2,int t2) {
        if (t1 != t2) return false;
        for (int i=0; i<t1; ++i) {
            if (v1[i] != v2[i])
                return false;
        }
        return true;
    }
   
    /**
     * Classe para testar o método Vetor.le().
     *
     * @return <code>true</code> se todos os estes funcionaram com sucesso, ou <code>false</code> em caso contrário.
     */
    public static boolean testaLe() {
        boolean res = true, teste;
        String leitura16 = "10 16 4 11 1 14 6 15 3 13 7 9 2 8 12 5";
        String leitura20 = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20";
        String leitura25 = "25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1";
        int[] vet16 = new int[16];
        Vetor.le(new Scanner(leitura16),vet16);
        teste = ehIgual(vet16,v16);
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.le(new Scanner(leitura),vet16) falhou...");
        res = res && teste;
        for (int i=0; i<vet16.length; ++i) vet16[i] = 0;
        Vetor.le(new Scanner(leitura16),vet16,11);
        teste = ehIgual(vet16,v16b);
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.le(new Scanner(leitura),vet16,11) falhou...");
        res = res && teste;
        int[] vet20 = new int[20];
        Vetor.le(new Scanner(leitura20),vet20);
        teste = ehIgual(vet20,v20);
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.le(new Scanner(leitura),vet20) falhou...");
        res = res && teste;
        for (int i=0; i<vet20.length; ++i) vet20[i] = 0;
        Vetor.le(new Scanner(leitura20),vet20,15);
        teste = ehIgual(vet20,v20b);
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.le(new Scanner(leitura),vet20,15) falhou...");
        res = res && teste;
        int[] vet25 = new int[25];
        Vetor.le(new Scanner(leitura25),vet25);
        teste = ehIgual(vet25,v25);
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.le(new Scanner(leitura),vet25) falhou...");
        res = res && teste;
        for (int i=0; i<vet25.length; ++i) vet25[i] = 0;
        Vetor.le(new Scanner(leitura25),vet25,20);
        teste = ehIgual(vet25,v25b);
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.le(new Scanner(leitura),vet25,20) falhou...");
        res = res && teste;
        return res;
    }
    
    /**
     * Classe para testar o método Vetor.imprime().
     *
     * @return <code>true</code> se todos os estes funcionaram com sucesso, ou <code>false</code> em caso contrário.
     */
    public static boolean testaImprime() {
        boolean res = true, teste;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        baos.reset();
        Vetor.imprime(out,v16);
        teste = contemMesmosValores(baos.toString(),"10 16 4 11 1 14 6 15 3 13 7 9 2 8 12 5");
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.imprime(out,v16) falhou...");
        res = res && teste;
        baos.reset();
        Vetor.imprime(out,v16,10);
        teste = contemMesmosValores(baos.toString(),"10 16 4 11 1 14 6 15 3 13");
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.imprime(out,v16,10) falhou...");
        res = res && teste;
        baos.reset();
        Vetor.imprime(out,v20);
        teste = contemMesmosValores(baos.toString(),"1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20");
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.imprime(out,v20) falhou...");
        res = res && teste;
        baos.reset();
        Vetor.imprime(out,v20,12);
        teste = contemMesmosValores(baos.toString(),"1 2 3 4 5 6 7 8 9 10 11 12");
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.imprime(out,v20,12) falhou...");
        res = res && teste;
        baos.reset();
        Vetor.imprime(out,v25);
        teste = contemMesmosValores(baos.toString(),"25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1");
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.imprime(out,v25) falhou...");
        res = res && teste;
        baos.reset();
        Vetor.imprime(out,v25,14);
        teste = contemMesmosValores(baos.toString(),"25 24 23 22 21 20 19 18 17 16 15 14 13 12");
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.imprime(out,v25,14) falhou...");
        res = res && teste;
        return res;
    }
    
    /**
     * Classe para testar o método Vetor.preenche().
     *
     * @return <code>true</code> se todos os estes funcionaram com sucesso, ou <code>false</code> em caso contrário.
     */
    public static boolean testaPreenche() { 
        boolean res = true, teste;
        final int TAM = 20;
        final int TAM2 = 12;
        final int PADRAO1 = 0xaa55;
        final int PADRAO2 = 0x55aa;
        int[] vet = new int[TAM];
        Vetor.preenche(vet,PADRAO1);
        teste = true;
        for (int i=0; i<TAM; ++i)
            teste = teste && vet[i] == PADRAO1;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.preenche(vet,PADRAO1) falhou...");
        res = res && teste;
        Vetor.preenche(vet,TAM2,PADRAO2);
        teste = true;
        for (int i=0; i<TAM2; ++i)
            teste = teste && vet[i] == PADRAO2;
        for (int i=TAM2; i<TAM; ++i)
            teste = teste && vet[i] == PADRAO1;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.preenche(vet,TAM2,PADRAO2) falhou...");
        res = res && teste;
        return res;
    }
    
    /**
     * Classe para testar o método Vetor.soma().
     *
     * @return <code>true</code> se todos os estes funcionaram com sucesso, ou <code>false</code> em caso contrário.
     */
    public static boolean testaSoma() {
        boolean res = true, teste;
        teste = Vetor.soma(v16)==136;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.soma(v16) falhou...");
        res = res && teste;
        teste =  Vetor.soma(v16,10)==93;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.soma(v16,10) falhou...");
        res = res && teste;
        teste = Vetor.soma(v20)==210;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.soma(v20) falhou...");
        res = res && teste;
        teste =  Vetor.soma(v20,15)==120;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.soma(v20,15) falhou...");
        res = res && teste;
        teste = Vetor.soma(v25)==325;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.soma(v25) falhou...");
        res = res && teste;
        teste =  Vetor.soma(v25,20)==310;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.soma(v25,20) falhou...");
        res = res && teste;
        return res;
    }
    
    /**
     * Classe para testar o método Vetor.media().
     *
     * @return <code>true</code> se todos os estes funcionaram com sucesso, ou <code>false</code> em caso contrário.
     */
    public static boolean testaMedia() {
        boolean res = true, teste;
        teste = Vetor.media(v16)==8.5;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.soma(v16) falhou...");
        res = res && teste;
        teste =  Vetor.media(v16,10)==9.3;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.soma(v16,10) falhou...");
        res = res && teste;
        teste = Vetor.media(v20)==10.5;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.soma(v20) falhou...");
        res = res && teste;
        teste =  Vetor.media(v20,15)==8.0;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.soma(v20,15) falhou...");
        res = res && teste;
        teste = Vetor.media(v25)==13.0;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.soma(v25) falhou...");
        res = res && teste;
        teste =  Vetor.media(v25,20)==15.5;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.soma(v25,20) falhou...");
        res = res && teste;
        return res;
    }
    
    /**
     * Classe para testar o método Vetor.menor().
     *
     * @return <code>true</code> se todos os estes funcionaram com sucesso, ou <code>false</code> em caso contrário.
     */
    public static boolean testaMenor() {
        boolean res = true, teste;
        teste = Vetor.menor(v16)==1;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.menor(v16) falhou...");
        res = res && teste;
        teste = Vetor.menor(v16,4)==4;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.menor(v16,4) falhou...");
        res = res && teste;
        teste = Vetor.menor(v20)==1;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.menor(v20) falhou...");
        res = res && teste;
        teste = Vetor.menor(v20,4)==1;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.menor(v20,4) falhou...");
        res = res && teste;
        teste = Vetor.menor(v25)==1;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.menor(v25) falhou...");
        res = res && teste;
        teste = Vetor.menor(v25,5)==21;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.menor(v20,4) falhou...");
        res = res && teste;
        return res;
    }
    
    /**
     * Classe para testar o método Vetor.maior().
     *
     * @return <code>true</code> se todos os estes funcionaram com sucesso, ou <code>false</code> em caso contrário.
     */
    public static boolean testaMaior() {
        boolean res = true, teste;
        teste = Vetor.maior(v16)==16;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.maior(v16) falhou...");
        res = res && teste;
        teste = Vetor.maior(v16,4)==16;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.maior(v16,4) falhou...");
        res = res && teste;
        teste = Vetor.maior(v20)==20;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.maior(v20) falhou...");
        res = res && teste;
        teste = Vetor.maior(v20,4)==4;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.maior(v20,4) falhou...");
        res = res && teste;
        teste = Vetor.maior(v25)==25;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.maior(v25) falhou...");
        res = res && teste;
        teste = Vetor.maior(v25,5)==25;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.maior(v20,4) falhou...");
        res = res && teste;
        return res;
    }
    
    /**
     * Classe para testar o método Vetor.buscaLinear().
     *
     * @return <code>true</code> se todos os estes funcionaram com sucesso, ou <code>false</code> em caso contrário.
     */
    public static boolean testaBuscaLinear() {
        int[] v18 = {13,1,2,3,14,5,6,7,15,0,9,2,10,4,11,6,12,8};
        int[] vResp18 = {9,1,2,3,13,5,6,7,17,10,12,14,16,0,4,8,-1,-1};
        int[] vResp18Par = {-1,1,2,3,-1,5,6,7,-1,-1,-1,-1,-1,0,4,8,-1,-1};
        boolean res = true, teste;
        for (int i=0; i<vResp18.length; ++i) {
            teste = Vetor.buscaLinear(v18,i) == vResp18[i]; 
            if (!teste && ADVERTENCIAS) System.out.println("> Vetor.buscaLinear(v18,"+i+") falhou...");
           res = res && teste;
        }
        for (int i=0; i<vResp18Par.length; ++i) {
            teste = Vetor.buscaLinear(v18,9,i) == vResp18Par[i]; 
            if (!teste && ADVERTENCIAS) System.out.println("> Vetor.buscaLinear(v18,9,"+i+") falhou...");
           res = res && teste;
        }
        return res;
    }
    
    /**
     * Classe para testar o método Vetor.conta().
     *
     * @return <code>true</code> se todos os estes funcionaram com sucesso, ou <code>false</code> em caso contrário.
     */
    public static boolean testaConta() {
        boolean res = true, teste;
        teste = Vetor.conta(v21,0xaa55)==7;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.conta(v21,0xaa55) falhou...");
        res = res && teste;
        teste = Vetor.conta(v21,0x55aa)==7;
        if (!teste && ADVERTENCIAS) System.out.println("> Vetor.conta(v21,0x55aa) falhou...");
        res = res && teste;
        for (int i=1; i<=7; ++i) {
            teste = Vetor.conta(v21,i*3,0xaa55)==i;
            if (!teste && ADVERTENCIAS) System.out.println("> Vetor.conta(v21,"+i*3+",0xaa55) falhou...");
            res = res && teste;
            teste = Vetor.conta(v21,i*3,0x55aa)==i;
            if (!teste && ADVERTENCIAS) System.out.println("> Vetor.conta(v21,"+i*3+",0x55aa) falhou...");
            res = res && teste;
        }
        return res;
    }
    
    /**
     * Metodo inicial, chama cada um dos métodos de teste.
     * @param args Argumentos da linha de comandos (NÃO utilizado).
     */
    public static void main(String[] args) {
        System.out.println("Teste para Vetor.le():                      " + (testaLe()?"OK":"ERRO"));
        System.out.println("Teste para Vetor.imprime():                 " + (testaImprime()?"OK":"ERRO"));
        System.out.println("Teste para Vetor.preenche():                " + (testaPreenche()?"OK":"ERRO"));
        System.out.println("Teste para Vetor.soma():                    " + (testaSoma()?"OK":"ERRO"));
        System.out.println("Teste para Vetor.media():                   " + (testaMedia()?"OK":"ERRO"));
        System.out.println("Teste para Vetor.menor():                   " + (testaMenor()?"OK":"ERRO"));
        System.out.println("Teste para Vetor.maior():                   " + (testaMaior()?"OK":"ERRO"));
        System.out.println("Teste para Vetor.buscaLinear():             " + (testaBuscaLinear()?"OK":"ERRO"));
        System.out.println("Teste para Vetor.conta():                   " + (testaConta()?"OK":"ERRO"));
    }
}
