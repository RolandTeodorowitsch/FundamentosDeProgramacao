// Para leitura de dados do terminal vamos usar as classes Scanner e Locale
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * Roteiro de Laborat&oacute;rio sobre Tipos Fundamentais de Dados.
 *
 * @author Roland Teodorowitsch
 * @version 24 ago. 2022
 *
 */
public class RoteiroDeLaboratorio {

	// Scanner foi declarada como uma "variável" que pode ser acessada a partir de todos os métodos da classe
	// (private indica que somente métodos desta classe poderão usar o Scanner in)
	private static Scanner in;

	/**
	 * Apresentação e instruções sobre este roteiro.
	 */
	public static void introducao() {
		System.out.println("\n----- Roteiro de Laboratório sobre Tipos de Dados Fundamentais (Roland Teodorowitsch; 24 ago. 2022)");
		System.out.println("\n- Execute o programa, acompanhe as informações apresentadas, faça os testes e procure resolver os exercícios.");
		System.out.println("\n- Procure entender por que se chegou a determinado resultado. Na dúvida, pergunte!");
		System.out.println("\n- Se já estiver familiarizado com determinado assunto, comente o método que contém o conteúdo correspondente no método main()!");
		System.out.println("\n- Na dúvida, crie seus próprios testes!");
		System.out.println("\n- Bom estudo!");
	}

	/**
	 * Explicações e exemplos de declaração e inicialização de variáveis.
	 */
	public static void declaracaoEInicializacaoDeVariaveis() {
		System.out.println("\n----- Declaração e inicialização de variáveis");
		System.out.println("\n- Em Java, variáveis devem ser declaradas especificando-se tipo, nome e valor inicial");
		System.out.println("\n- Exemplo:");
		System.out.println("\t// A variável numeroDeGarrafas armazena valores inteiros e tem valor inicial 6");
		System.out.println("\tint numeroDeGarrafas = 6;\n");
		System.out.println("\t// Seu valor pode ser a alterado usando:");
		System.out.println("\tnumeroDeGarrafas = 12;");

		System.out.println("\n- Em Java, há 8 tipos primitivos que podem ser usados para declarar variáveis:");
		System.out.println("\t* byte\t\tocupa 1 byte e armazena valores inteiros");
		System.out.println("\t* short\t\tocupa 2 bytes e armazena valores inteiros");
		System.out.println("\t* int\t\tocupa 4 bytes e armazena valores inteiros");
		System.out.println("\t* long\t\tocupa 8 bytes e armazena valores inteiros");
		System.out.println("\t* float\t\tocupa 4 bytes e armazena valores reais");
		System.out.println("\t* double\tocupa 8 bytes e armazena valores reais");
		System.out.println("\t* boolean\tocupa 1 byte e armazena um valor lógico (true/verdadeiro ou false/falso)");    
		System.out.println("\t* char\t\tocupa 1 byte e armazena um único caractere (em formato Unicode)");
		System.out.println("\n- Em Java, textos são armazenados usando String (que é uma classe!)");

		System.out.println("\n- Os três tipos mais usados provavelmente são: int, double e String");

		System.out.println("\n- Exemplos de declarações:");
		System.out.println("\tbyte    variavelByte    = 123;");
		System.out.println("\tshort   variavelShort   = 12345;");
		System.out.println("\tint     variavelInt     = 123456789;");
		System.out.println("\tlong    variavelLong    = 12345678900L;");
		System.out.println("\tfloat   variavelFloat   = 123.456F;");
		System.out.println("\tdouble  variavelDouble  = 12345.6789;");
		System.out.println("\tboolean variavelBoolean = true;");
		System.out.println("\tchar    variavelChar    = 'A';");
		System.out.println("\tString  variavelString  = \"Texto formado por vários caracteres\";");

		byte    variavelByte    = 123;
		short   variavelShort   = 12345;
		int     variavelInt     = 123456789;
		long    variavelLong    = 12345678900L;
		float   variavelFloat   = 123.456F;
		double  variavelDouble  = 12345.6789;
		boolean variavelBoolean = true;
		char    variavelChar    = 'A';
		String  variavelString  = "Texto formado por vários caracteres";

		System.out.println("\n- Resultado da impressão dos valores das variáveis com System.out.println:");
		System.out.print("\tvariavelByte\t= ");
		System.out.println(variavelByte);
		System.out.print("\tvariavelShort   = ");
		System.out.println(variavelShort);
		System.out.print("\tvariavelInt\t= ");
		System.out.println(variavelInt);
		System.out.print("\tvariavelLong\t= ");
		System.out.println(variavelLong);
		System.out.print("\tvariavelFloat\t= ");
		System.out.println(variavelFloat);
		System.out.print("\tvariavelDouble\t= ");
		System.out.println(variavelDouble);
		System.out.print("\tvariavelBoolean\t= ");
		System.out.println(variavelBoolean);
		System.out.print("\tvariavelChar\t= ");
		System.out.println(variavelChar);
		System.out.print("\tvariavelString\t= ");
		System.out.println(variavelString);

		System.out.println("\n- OBSERVE como especificar constantes literais:");
		System.out.println("\t* inteiros NÃO tem ponto decimal: 123456789");
		System.out.println("\t* inteiros longos são inteiros com L no final: 12345678900L");
		System.out.println("\t* valores reais (float) são números com ponto decimal: 12345.6789");
		System.out.println("\t* valores reais de menor capacidade (float) são terminados por F: 123.456F");
		System.out.println("\t* booleanos podem receber true ou false");
		System.out.println("\t* caracteres armazenam um único caractere e são delimitados por apóstrofo: 'A'");
		System.out.println("\t* cadeias de caracteres podem armazenar vários caracteres e são delimitados por aspas: \"AEIOU\"");

		System.out.println("\n- Também é possível especificar valores inteiros em hexadecimal ou octal (e não apenas decimal):");
		System.out.println("\tint varDec = 65;   // 65 em decimal");
		System.out.println("\tint varHex = 0x41; // 0x41 em hexadecimal corresponde a 65 em decimal");
		System.out.println("\tint varOct = 0101; // 0101 em octal também corresponde a 65 em decimal");

		System.out.println("\n- Para mostrar valores em binário pode-se usar Integer.toBinaryString(valorInteiro)");
		System.out.println("\tString s = Integer.toBinaryString(65);");
		System.out.println("\tSystem.out.println(\"65 em binário corresponde a \");");
		System.out.println("\tSystem.out.println(s);");

		System.out.println("\n- NUNCA se esqueça de:");
		System.out.println("\t* Declarar as variáveis antes de usá-las");
		System.out.println("\t* Inicializar todas as variáveis antes de usá-las");
		System.out.println("\t* Escolher o tipo certo para cada variável");
	}


	/**
	 * Apresenta a diferença entre tipos primitivos e classes.
	 */
	public static void diferencaEntreTiposPrimitivosEClasses() {
		System.out.println("\n----- Diferença entre tipos primitivos e classes");
		System.out.println("\n- OBSERVE que os nomes dos tipos primitivos iniciam com letras minúsculas e aceitam abreviações:");
		System.out.println("\t* int em vez de Integer");
		System.out.println("\t* char em vez de Character");
		System.out.println("\t* double em vez de Double");
		System.out.println("\n- Nomes de classes iniciam com maiúsculas e não costumam ser abreviados:");
		System.out.println("\t* String em vez de str");
		System.out.println("\n- Mas o mais importante é que, como String é uma CLASSE, as variáveis declaradas como String são OBJETOS e há métodos que podem ser executados sobre estes objetos");
		System.out.println("\nExemplo de código:");
		System.out.println("\tint variavelI = 10;");
		System.out.println("\tSystem.out.print(\"variavelI = \");");
		System.out.println("\tSystem.out.println(variavelI);");
		System.out.println("\tString variavelS = \"Oi!\";");
		System.out.println("\tSystem.out.print(\"variavelS = \");");
		System.out.println("\tSystem.out.println(variavelS);");
		System.out.println("\tSystem.out.print(\"variavelS.length() = \");");
		System.out.println("\tSystem.out.println( variavelS.length() );");

		System.out.println("\n- Observe que length() é um método que está sendo executado sobre variavelS e que retorna o tamanho do texto armazenado nesta variável String");

		System.out.println("\nResultado da execução:");
		
		int variavelI = 10;
		System.out.print("\tvariavelI = ");
		System.out.println(variavelI);
		String variavelS = "Oi!";
		System.out.print("\tvariavelS = ");
		System.out.println(variavelS);
		System.out.print("\tvariavelS.length() = ");
		System.out.println( variavelS.length() );
	}


	/**
	 * Apresenta algumas regras para atribuição de variáveis de tipos diferentes.
	 */
	public static void atribuicoesDeVariaveisDeTiposDiferentes() {
		System.out.println("\n----- Atribuições de variáves de tipos diferentes");
		System.out.println("\n- Algumas atribuições de variáveis de tipos diferentes NÃO trazem problema");
		System.out.println("\n- Mas algumas vezes é necessário realizar uma conversão explícita (ou seja, indicar o tipo entrer parênteses)");

		System.out.println("\n- Atribuir double para int é possível, mas o contrário requer conversão:");
		System.out.println("\tdouble varDouble = 1.5;");
		System.out.println("\tint varInt = 1;");
		System.out.println("\tvarDouble = varInt; // OK");
		System.out.println("\t// varInt = varDouble; // ERRADO");
		System.out.println("\tvarInt = (int)varDouble; // OK");
	
		System.out.println("\n- Atribuir float para double é possível, mas o contrário requer conversão:");
		System.out.println("\tdouble varDouble = 1.5;");
		System.out.println("\tfloat varFloat = 1.5F;");
		System.out.println("\tvarDouble = varFloat; //OK");
		System.out.println("\t// varFloat = varDouble; // ERRADO");
		System.out.println("\tvarFloat = (float)varDouble;");

		System.out.println("\n- Atribuir float para double é possível, mas o contrário requer conversão:");
		System.out.println("\tlong varLong = 123;");
		System.out.println("\tint varInt = 123;");
		System.out.println("\tvarLong = varInt; //OK");
		System.out.println("\t// varInt = varLong; // ERRADO");
		System.out.println("\tvarInt = (int)varLong;");

		System.out.println("\n- Atribuir char para int é possível, mas o contrário requer conversão:");
		System.out.println("\tint varLong = 65;");
		System.out.println("\tchar varChar = 'A';");
		System.out.println("\tvarInt = varChar; //OK");
		System.out.println("\t// varChar = varInt; // ERRADO");
		System.out.println("\tvarChar = (char)varInt;");
	
		System.out.println("\n- Mas o que acontece quando se atribui um char para um int?");
		System.out.println("\t* Na verdade atribui-se o código do char na tabela ASCII para a variável int");
		System.out.println("\t* Na tabela ASCII:");
		System.out.println("\t  '0' => 48, '1' => 49, '2' => 50, ...");
		System.out.println("\t  'A' => 65, 'B' => 66, 'C' => 67, ...");
		System.out.println("\t  'a' => 97, 'b' => 98, 'c' => 99, ...");

		System.out.println("\n- Assim, se tivermos:");
		System.out.println("\tint varInt = 67;               // código ASCII da letra C (maiúscula)");
		System.out.println("\tchar varChar = (char)varInt;   // em um char, o código vira o próprio caractere");
		System.out.println("\tSystem.out.print(\"varChar = \");");
		System.out.println("\tSystem.out.println(varChar);");
		System.out.println("\tSystem.out.print(\"(int)varChar = \");");
		System.out.println("\tSystem.out.println((int)varChar);");
		System.out.println("\n\tvarChar = '4';                 // digito 4 (ASCII)");
		System.out.println("\tvarInt = varChar;              // em um int, o caractere é representado pelo seu código");
		System.out.println("\tSystem.out.print(\"varInt = \");");
		System.out.println("\tSystem.out.println(varInt    );");
		System.out.println("\tSystem.out.print(\"(char)varInt = \");");
		System.out.println("\tSystem.out.println((char)varInt);");
		System.out.println("\n\tint valor_decimal_de_varChar = varChar - '0';");
		System.out.println("\tSystem.out.print(\"valor_decimal_de_varChar = \");");
		System.out.println("\tSystem.out.println(valor_decimal_de_varChar);");

		System.out.println("\n- O resultado será:");
		int varInt = 67;               // código ASCII da letra C (maiúscula)
		char varChar = (char)varInt;   // em um char, o código vira o próprio caractere
		System.out.print("\tvarChar = ");
		System.out.println(varChar);
		System.out.print("\t(int)varChar = ");
		System.out.println((int)varChar);
		varChar = '4';                 // digito 4 (ASCII)
		varInt = varChar;              // em um int, o caractere é representado pelo seu código
		System.out.print("\tvarInt = ");
		System.out.println(varInt);
		System.out.print("\t(char)varInt = ");
		System.out.println((char)varInt);
		int valor_decimal_de_varChar = varChar - '0';
		System.out.print("\tvalor_decimal_de_varChar = ");
		System.out.println(valor_decimal_de_varChar);

		System.out.println("\n- Quanto um número está dentro de um String:");
		System.out.println("\t* ele é codificado com códigos da tabela ASCII, o  que não corresponde aos valores dos dígitos decimais");
		System.out.println("\t* não é possível fazer cálculos neste formato");
		System.out.println("\t* pode-se converter de String para inteiro usando Integer.parseInt(StringComValorInteiro)");
		System.out.println("\t* pode-se converter de String para double usando Double.parseDouble(StringComValorDouble)");

		System.out.println("\n- Por exemplo:");
		System.out.println("\tString varString = \"123\";");
		System.out.println("\tint varInt = Integer.parseInt(varString);");
		System.out.println("\tSystem.out.print(\"varInt = \");");
		System.out.println("\tSystem.out.println(varInt);");
		System.out.println("\n\tvarString = \"123.34\";");
		System.out.println("\tdouble varDouble = Double.parseDouble(varString);");
		System.out.println("\tSystem.out.print(\"varDouble = \");");
		System.out.println("\tSystem.out.println(varDouble);");

		System.out.println("\n- Gera como resultado:");

		String varString = "123";
		varInt = Integer.parseInt(varString);
		System.out.print("\tvarInt = ");
		System.out.println(varInt);

		varString = "123.34";
		double varDouble = Double.parseDouble(varString);
		System.out.print("\tvarDouble = ");
		System.out.println(varDouble);

		System.out.println("\n- PERCEBA que: sempre que há possibilidade de perder informação, o compilador exige conversão explícita de tipo");
	}


	/**
	 * Explicações, exemplos e desafios sobre expressões aritméticas.
	 */
	public static void expressoesAritmeticas() {
		System.out.println("\n----- Operações aritméticas");
		System.out.println("\n- Expressões matemáticas devem ser convertidas para expressões na sintaxe da linguagem");
		System.out.println("\n- Muita coisa permanece igual, mas:");
		System.out.println("\t* multiplicação é feita com * (asterisco)");
		System.out.println("\t* algumas coisas estão definidas (como a constante Math.PI) e outras são resolvidas com métodos (Math.pow, Math.sqrt, Math.sin, etc.)");
		System.out.println("\t* não há subscritos");
		System.out.println("\t* algumas operações como somatórios, por exemplo, devem ser implementados");
		System.out.println("\n- A precedência das operações em Java é a mesma da matemática: parenteses, multiplicação/divisão/resto, soma/subtração");
		System.out.println("\n- Operadores aritméticos binários (dois operandos): *, /, % (resto da divisão inteira), +, -");
		System.out.println("\n- Operadores aritméticos unários (um operando): -, +, conversão explícita de tipo");
		System.out.println("\n- Exercícios:");
		String resposta;
		System.out.println("  Considere:\n\tdouble a = 10.0, b = 20.0;\n  E responda:");
		double a = 10.0, b = 20.0;

		System.out.println("\nQuanto vale?\t\ta + b / 2");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(a + b / 2)+" (double)");
	
		System.out.println("\nQuanto vale?\t\t(a + b) / 2");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+((a + b) / 2)+" (double)");

		System.out.println("\nQuanto vale?\t\t40 / a + 2 * b");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(40 / a + 2 * b)+" (double)");

		System.out.println("\nQuanto vale?\t\t40 / (a + 2 * b)");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(40 / (a + 2 * b))+" (double)");

		System.out.println("\nQuanto vale?\t\t40 + a / 2 - b");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(40 + a / 2 - b)+" (double)");

		System.out.println("\nQuanto vale?\t\t40 * a / 20 - b / 2");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(40 * a / 20 - b / 2)+" (double)");

		System.out.println("\n  Agora considere:\n\tint x = 5, y = 2;\n  E responda:");
		int x = 5, y = 2;

		System.out.println("\nQuanto vale?\t\tx * y");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(x * y)+" (int)");

		System.out.println("\nQuanto vale?\t\tx / y");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(x / y)+" (int)");

		System.out.println("\nQuanto vale?\t\tx % y");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(x % y)+" (int)");

		System.out.println("\n  Finalmente considere:\n\tint i = 10, j = 20, k = 30;\n  E responda:");
		int i = 10, j = 20, k = 30;

		System.out.println("\nQuanto vale?\t\ti / 4 + 2 * j - k % 4");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(i / 4 + 2 * j - k % 4)+" (int)");

		System.out.println("\nQuanto vale?\t\ti + 4 / 2 - j % k * 4");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(i + 4 / 2 - j % k * 4)+" (int)");

		System.out.println("\nQuanto vale?\t\ti + j / 2");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(i + j / 2)+" (int)");

		System.out.println("\nQuanto vale?\t\t(i + j) / 2");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+((i + j) / 2)+" (int)");
	}


	/**
	 * Um pequeno exemplo de aplicação em um método.
	 */
	public static void constantesRotuladasEExemploDeAplicacao() {
		System.out.println("\n----- Constantes Rotuladas e exemplo de aplicação");
		System.out.println("\n- Pode-se criar uma \"variável\" constante (\"constantes rotuladas\" ou identificadas) usando final antes de uma declaração de variável:");
		System.out.println("\tfinal double VO    LUME_GARRAFA = 0.600;");
		System.out.println("\n- Constantes rotuladas:");
		System.out.println("\t* NÃO podem ter o seu valor alterado");
		System.out.println("\t* torma o código mais fácil de entender");
		System.out.println("\t* facilitam a atualização do valor, pois é necessário atualizar um único lugar");    
		System.out.println("\n- Lembre-se que variáveis declaradas dentro de um bloco/método existem somente dentro deste bloco/método");

		System.out.println("\n- Exemplo de código:");
		System.out.println("\n\t// Declara constante e variáveis");
		System.out.println("\tfinal double VOLUME_LATA = 0.350;");
		System.out.println("\tdouble valorIndividual = 3.99;");
		System.out.println("\tdouble valorNaPromocao = 3.49;");
		System.out.println("\n\t// Calcula");
		System.out.println("\tdouble valorLitro = valorIndividual / VOLUME_LATA;");
		System.out.println("\tdouble valorPromocao = valorNaPromocao / VOLUME_LATA;");
		System.out.println("\n\t// Mostra resultados");
		System.out.println("\tSystem.out.print(\"Valor/litro (NORMAL) = \");");
		System.out.println("\tSystem.out.println(valorLitro);");
		System.out.println("\tSystem.out.print(\"Valor/litro (PROMOÇÃO) = \");");
		System.out.println("\tSystem.out.println(valorPromocao);");

		System.out.println("\n- Resultado da execução:");
		
		// Declara constante e variáveis
		final double VOLUME_LATA = 0.350;
		double valorIndividual = 3.99;
		double valorNaPromocao = 3.49;

		// Calcula
		double valorLitro = valorIndividual / VOLUME_LATA;
		double valorPromocao = valorNaPromocao / VOLUME_LATA;

		// Mostra resultados
		System.out.print("Valor/litro (NORMAL) = ");
		System.out.println(valorLitro);
		System.out.print("Valor/litro (PROMOÇÃO) = ");
		System.out.println(valorPromocao);
	}


	/*
	 * Mostra como ler dados do terminal
	 */
	public static void lendoDadosDoTerminal() {
		if (in.hasNextLine()) in.nextLine(); // Para limpar qualquer conteúdo que houver na entrada

		System.out.println("\n----- Lendo dados do terminal (entrada)");
		System.out.println("\n- Para ler dados do terminal (entrada) deve-se usar antes da declaração da classe:");
		System.out.println("\timport java.util.Scanner;");
		System.out.println("\timport java.util.Locale;");
		System.out.println("\n - E, dentro da main ou do método, usa-se:");
		System.out.println("\tLocale.setDefault(Locale.ENGLISH);");
		System.out.println("\tScanner in = new Scanner(System.in);");
		System.out.println("\n- Locale é usado para ajustar configurações de localidade (aqui é usado para forçar a digitação de valores reais com usando ponto como serparador de casas decimais)");
		System.out.println("\n- Scanner é uma?... Classe!");
		System.out.println("\n- System.in é um objeto predefinido que corresponde ao terminal");
		System.out.println("\n- in é um novo objeto criado a partir da classe Scanner (poderia ter outro nome, mas é uma boa ideia usar in)");
		System.out.println("\n- Pode-se chamar uma série de métodos de in para realizar a leitura de dados do terminal");
		System.out.println("\n- Exemplos:");
		System.out.println("\tint varInt = in.nextInt();");
		System.out.println("\tint varDouble = in.nextDouble();");
		System.out.println("\tint varString = in.next(); // lê só uma palavra");
		System.out.println("\tvarString = in.nextLine(); // agora lê mais de uma palavra (até o final de linha/ENTER)");
		System.out.println("\n- Teste:");
		System.out.print("\nDigite um valor inteiro: ");
		int n = in.nextInt();
		System.out.println("Você digitou: "+n);
		System.out.print("Digite um valor real (com ponto): ");
		double v = in.nextDouble();
		System.out.println("Você digitou: "+v);
		System.out.print("Digite apenas uma palavra: ");
		String s = in.next();
		System.out.println("Você digitou: "+s);

		System.out.println("\n- Rode novamente. O que acontece quando:");
		System.out.println("\t* você digita uma palavra no lugar do valor inteiro?");
		System.out.println("\t* você digita um valor com ponto no lugar do valor inteiro?");
		System.out.println("\t* você digita uma palavra no lugar do valor real?");
		System.out.println("\t* você digita um valor com vírgula no lugar do valor real?");
		System.out.println("\t* você digita digital mais de uma palavra na entrada de texto com next()?");

		System.out.println("\n- DICA: para evitar problemas, quando precisar usar in.nextLine(), use apenas in.nextLine() - evite misturar in.nextLine() com in.nextInt(), in.nextDouble(), etc.");
		System.out.println("\n- Neste caso, o resultado de in.nextLine, que é String, pode e deve ser convertido para tipos numéricos:");
		System.out.println("\tString nomeCompleto = in.nextLine();");
		System.out.println("\tString linha;");
		System.out.println("\tlinha = in.nextLine();");
		System.out.println("\tint idade = Integer.parseInt(linha);");
		System.out.println("\tlinha = in.nextLine();");
		System.out.println("\tdouble peso = Double.parseDouble(linha);");
	}


	/**
	 * O mesmo exemplo de aplicação agora lendo dadaos do terminal.
	 */
	public static void exemploDeAplicacaoLendoDoTerminal() {
		System.out.println("\n----- Exemplo de aplicação lendo dados do terminal");
		System.out.println("\n- Exemplo de código:");
		System.out.println("\n\t// Cria o Scanner");
		System.out.println("\tLocale.setDefault(Locale.ENGLISH);");
		System.out.println("\tScanner in = new Scanner(System.in);");
		System.out.println("\n\t// Declara constante");
		System.out.println("\tfinal double VOLUME_LATA = 0.350;");
		System.out.println("\n\t// Lê os dados do terminal");
		System.out.println("\tSystem.out.print(\"Digite o valor individual da lata (usando .): \");");
		System.out.println("\tdouble valorIndividual = in.nextDouble();");
		System.out.println("\tSystem.out.print(\"Digite o valor promocional da lata (usando .): \");");
		System.out.println("\tdouble valorNaPromocao = in.nextDouble();");
		System.out.println("\n\t// Calcula");
		System.out.println("\tdouble valorLitro = valorIndividual / VOLUME_LATA;");
		System.out.println("\tdouble valorPromocao = valorNaPromocao / VOLUME_LATA;");
		System.out.println("\n\t// Mostra resultados");
		System.out.println("\tSystem.out.print(\"Valor/litro (NORMAL) = \");");
		System.out.println("\tSystem.out.println(valorLitro);");
		System.out.println("\tSystem.out.print(\"Valor/litro (PROMOÇÃO) = \");");
		System.out.println("\tSystem.out.println(valorPromocao);");

		System.out.println("\n- Resultado da execução:");
		
		// Declara constante
		final double VOLUME_LATA = 0.350;

		// Lê os dados do terminal
		System.out.print("Digite o valor individual da lata (usando .): ");
		double valorIndividual = in.nextDouble();
		System.out.print("Digite o valor promocional da lata (usando .): ");
		double valorNaPromocao = in.nextDouble();

		// Calcula
		double valorLitro = valorIndividual / VOLUME_LATA;
		double valorPromocao = valorNaPromocao / VOLUME_LATA;

		// Mostra resultados
		System.out.print("Valor/litro (NORMAL) = ");
		System.out.println(valorLitro);
		System.out.print("Valor/litro (PROMOÇÃO) = ");
		System.out.println(valorPromocao);
	}


	/**
	 * Explicações e desafios envolvendo a mistura de tipos.
	 */
	public static void misturaDeTipos() {
		System.out.println("\n----- Mistura de tipos");
		System.out.println("\n- Quando uma operação é feita sobre dois valores (variáveis ou constantes), as seguintes regras são usadas:");
		System.out.println("\t1) operandos de tipo igual: resultado é do mesmo tipo");
		System.out.println("\t2) caso contrário (quando possível): \"menor\" tipo é convertido para \"maior\" tipo");
		System.out.println("\t3) para atribuir um tipo maior para um menor é preciso usar conversão explícita de tipos");
		System.out.println("\n- Exemplos:");
		System.out.println("\n\t<int> operando <int>  =>  resultado (int)\n\t(int) 1 / (int) 2  =>  0 (int)");
		System.out.println("\n\t<int> operando <long>  =>  <long> operando <long>  =>  resultado (long)\n\t(int) 10 * (long) 987654321L  =>  9876543210L (long)");
		System.out.println("\n\t<int> operando <double>  =>  <double> operando <double>  =>  resultado (double)\n\t(int) 1 / (double) 2  =>  0.5 (double)");
		System.out.println("\n\t<String> + <int>  =>  <String> + <String>  =>  resultaldo (String)\n\t\"abc\" + (int) 123  =>  abc123 (String)");
		System.out.println("\n\t<String> + <double>  =>  <String> + <String>  =>  resultaldo (String)\n\t\"abc\" + (double) 12.35  =>  abc12.35 (String)");
		System.out.println("\n\t<String> + (...)  =>  <String> + <String>  =>  resultaldo (String)");
		System.out.println("\n- Exercícios:");
		String resposta;

		System.out.println("\nQuanto vale?\t\t1+1");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(1+1)+" (int)");

		System.out.println("\nQuanto vale?\t\t1+\"1\"");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(1+"1")+" (String)");

		System.out.println("\nQuanto vale?\t\t1+Integer.parseInt(\"1\")");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(1+Integer.parseInt("1"))+" (int)");

		System.out.println("\nQuanto vale?\t\t\"1\"+1");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+("1"+1)+" (String)");

		System.out.println("\nQuanto vale?\t\t\"1\"+1+1");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+("1"+1+1)+" (String)");

		System.out.println("\nQuanto vale?\t\t\"1\"+(1+1)");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+("1"+(1+1))+" (String)");

		System.out.println("\nQuanto vale?\t\t1+1+\"1\"");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(1+1+"1")+" (String)");

		System.out.println("\nQuanto vale?\t\t3/2 + 0.5");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(3/2 + 0.5)+" (double)");

		System.out.println("\nQuanto vale?\t\t3.0/2 + 0.5");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(3.0/2 + 0.5)+" (double)");

		System.out.println("\nQuanto vale?\t\t3/2.0 + 0.5");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(3/2.0 + 0.5)+" (double)");

		System.out.println("\nQuanto vale?\t\t3.0/2.0 + 0.5");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(3.0/2.0 + 0.5)+" (double)");

		System.out.println("\nQuanto vale?\t\t(double)3/2 + 0.5");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+((double)3/2 + 0.5)+" (double)");

		System.out.println("\nQuanto vale?\t\t3/(double)2 + 0.5");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(3/(double)2 + 0.5)+" (double)");

		System.out.println("\nQuanto vale?\t\t(double)3/(double)2 + 0.5");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+((double)3/(double)2 + 0.5)+" (double)");

		System.out.println("\nQuanto vale?\t\t(double)(3/2) + 0.5");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+((double)(3/2) + 0.5)+" (double)");
	}

	/*
	 * Explicações e exercícios sobre divisão inteira.
	 */
	public static void divisaoInteira() {
		System.out.println("\n----- Divisão inteira e resto da divisão");
		System.out.println("\n- A divisão entre inteiros gera um resultado inteiro (a parte fracionária é descartada)");
		System.out.println("\n- O operador % pode ser usado para determinar o resto da divisão");
		System.out.println("\n- Por exemplo:\n\t9 / 4\t resulta 2 (int)");
		System.out.println("\t9 % 4\t resulta 1 (int)");
		System.out.println("\to resto é 1, pois 2 * 4 resulta em 8 (falta 1 para chegar em 9)");
		System.out.println("\n- Exemplos de aplicações:");
		System.out.println("\n  1) obter unidade, dezena, centena, milhar, etc. de um número");
		System.out.println("\tint n = 1729, milhar, centena, dezena, unidade, resto;");
		System.out.println("\tmilhar = n / 1000;\t// milhar = 1");
		System.out.println("\tresto = n % 1000;\t// resto = 729");
		System.out.println("\tcentena = resto / 100;\t// centena = 7");
		System.out.println("\tresto = resto % 100;\t// resto = 29");
		System.out.println("\tdezena = resto / 10;\t// dezena = 2");
		System.out.println("\tunidade = resto % 10;\t// unidade = 9");
		System.out.println("\n  2) troco de unidades monetárias");
		System.out.println("\n  3) conversão de números entre sistemas de numeração de bases diferentes");

		System.out.println("\n- Exercícios:");
		String resposta;

		System.out.println("\nQuanto vale?\t\t7 % 1");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(7 % 1)+" (int)");

		System.out.println("\nQuanto vale?\t\t7 % 4");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(7 % 4)+" (int)");

		System.out.println("\nQuanto vale?\t\t7 % 7");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(7 % 7)+" (int)");

		System.out.println("\nQuanto vale?\t\t1 % 7");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(1 % 7)+" (int)");

		System.out.println("\nQuanto vale?\t\t16 % 7");
		System.out.print("Sua resposta:\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+(16 % 7)+" (int)");

		
	}


	/**
	 * Apresenta dois problemas que podem acontecer no processamento de valores numéricos.
	 */
	public static void algunsProblemas() {
		System.out.println("\n----- Alguns problemas");

		System.out.println("\n- Problema 1: overflow com valores inteiros");
		System.out.println("\n- Observe o seguinte código:");
		System.out.println("\tint cinquentaMilhoes = 50000000;");
		System.out.println("\tSystem.out.println( 100 * cinquentaMilhoes );");
		System.out.println("\n- O resultado deveria ser 5000000000, mas veja o que foi obtido:");
		System.out.print("\t");
		int cinquentaMilhoes = 50000000;
		System.out.println( 100 * cinquentaMilhoes );
		System.out.println("\n- Como resolver isso?...");
		System.out.println("\tint cinquentaMilhoes = 50000000;");
		System.out.println("\tSystem.out.println( (long)100 * cinquentaMilhoes );");
		System.out.println("\n- O resultado agora é:");
		System.out.print("\t");
		cinquentaMilhoes = 50000000;
		System.out.println( (long)100 * cinquentaMilhoes );

		System.out.println("\n- Problema 2: representação de valores reais em binário");
		System.out.println("\n- Observe o seguinte código:");
		System.out.println("\tdouble preco = 68.35;");
		System.out.println("\tdouble quantidade = 100.00;");
		System.out.println("\tdouble total = preco * quantidade;");
		System.out.println("\tSystem.out.println( total );");
		System.out.println("\n- O resultado deveria ser 6835.00, mas veja o que foi obtido:");
		System.out.print("\t");
		double preco = 68.35;
		double quantidade = 100.00;
		double total = preco * quantidade;
		System.out.println(total);
		System.out.println("\n- O que houve aqui?");
		System.out.println("\t* Toda informação é armazenada e processada em binário!");
		System.out.println("\t* Números inteiros em decimal podem ser convertidos para binário sem problema"); 
		System.out.println("\t* Mas... nem todo número decimal fracionário (valores à direita do ponto) podem ser representados em binário de forma exata...");

		System.out.println("\n- Para converter um valor decimal (base 10) em binário (base 2):");
		System.out.println("\t* Na parte inteira aplicam-se divisões inteiras sucessivas pela base (2), anotando o resto dessas divisões, até que se obtenha 0 (zero) como resultado da divisão");
		System.out.println("\t* Na parte fracionária aplicam-se multiplicaões sucessivas pela base (2), anotando a parte inteira do resultado e reaplicando a multiplicação pela base na parte fracionária, até que se obtenha 0 (zero) na parte fracionária (ou até que se atinja o número de bits disponível no armazenamento)");

		System.out.println("\n- Veja a conversão de 27.125 para binário:");
		System.out.println("\n  0 <- 1 <- 3 <- 6 <- 13 <- 27.125 -> .25 -> .5 -> .0");
		System.out.println("         |    |    |    |     |    |      |     |");
		System.out.println("         V    V    V    V     V    V      V     V");
		System.out.println("         1    1    0    1     1 .  0      0     1");
		System.out.println("\n  (27.125)10 = (11011.001)2  ===>  FUNCIONOU!!!");
 
		System.out.println("\n- Agora veja a conversão de 68.35 para binário:");
		System.out.println("\n  0 <- 1 <- 2 <- 4 <- 8 <- 17 <- 34 <- 68.35 -> .7 -> .4 -> .8 -> .6 -> .2 -> .4 (!) ...");
		System.out.println("         |    |    |    |    |     |     |   |     |     |     |     |     |");
		System.out.println("         V    V    V    V    V     V     V   V     V     V     V     V     V");
		System.out.println("         1    0    0    0    1     0     0 . 0     1     0     1     1     0");
		System.out.println("\n  (68.35)10 = (1000100.01 0110 0110 0110 0110...)2  <===  GEROU UMA DÍZIMA PERIÓDICA EM BINÁRIO");
	}


	/**
	 * Explicações, exemplos e desafios envolvendo pré/pós-incremento/decremtno
	 */
	public static void preEPosIncrementoEDecremento() {
		System.out.println("\n----- Pré/Pós-Incremento/Decremento");
		System.out.println("\n- Respectivamente, ++ e -- são operadores de incremento (aumentar 1 unidade) e decremento (diminuir uma unidade)");
		System.out.println("\n- Funcionam para tipos numéricos");
		System.out.println("\n- Veja o exemplo a seguir:");
		System.out.println("\tint i = 0; // i começa com 0");
		System.out.println("\ti = i + 1; // o valor de 1 é incrementado e passa de 0 para 1");
		System.out.println("\t++i;       // idem usando pré-incremento (aumenta o valor de 1 para 2)");
		System.out.println("\ti++;       // item usando pós-incremento (aumenta o valor de 2 para 3)");
		System.out.println("\t           // neste caso ++i; é igual a i++;");
		System.out.println("\ti = i - 1; // o valor de 1 é decrementado e passa de 3 para 2");
		System.out.println("\t--i;       // idem usando pré-decremento (diminui o valor de 2 para 1)");
		System.out.println("\ti--;       // idem usando pós-decremento (diminui o valor de 1 para 0)");
		System.out.println("\t           // neste caso --i; é igual a i--;");
		System.out.println("\n- Mas e se fosse feito o seguinte:");
		System.out.println("\tint j = 10;                    // j começa com 10");
		System.out.println("\tSystem.out.println( ++j );     // incrementa j (que terá 11) e imprime j (11)");
		System.out.println("\tj = 10;                        // j recebe 10 novamente");
		System.out.println("\tSystem.out.println( j++ );     // imprime j (10) e depois incrementa j (que terá 11)");
		System.out.println("\tj = 10;                        // j recebe 10 novamente");
		System.out.println("\tSystem.out.println( --j );     // decrementa j (que terá 9) e imprime j (9)");
		System.out.println("\tj = 10;                        // j recebe 10 novamente");
		System.out.println("\tSystem.out.println( j-- );     // imprime j (10) e depois incrementa j (que terá 9)");

		System.out.println("\n- Exercícios:");
		String resposta;
		int a, b, c;

		System.out.println("\nConsidere:\n\tint a = 10, b;\n\tb = ++a;");
		a = 10;
		b = ++a;
		System.out.print("Quanto vale a?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+a+" (int)");
		System.out.print("Quanto vale b?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+b+" (int)");

		System.out.println("\nConsidere:\n\tint a = 10, b;\n\tb = a++;");
		a = 10;
		b = a++;
		System.out.print("Quanto vale a?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+a+" (int)");
		System.out.print("Quanto vale b?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+b+" (int)");

		System.out.println("\nConsidere:\n\tint a = 10, b = 20, c;\n\tc = ++a + b++;");
		a = 10;
		b = 20;
		c = ++a + b++;
		System.out.print("Quanto vale a?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+a+" (int)");
		System.out.print("Quanto vale b?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+b+" (int)");
		System.out.print("Quanto vale c?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+c+" (int)");

		System.out.println("\nConsidere:\n\tint a = 1, b;\n\tb = ++a + a++ + + a;");
		a = 1;
		b = ++a + a++ + + a;;
		System.out.print("Quanto vale a?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+a+" (int)");
		System.out.print("Quanto vale b?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+b+" (int)");
	}


	/**
	 * Explicações, exemplos e desafios sobre atribuições sintéticas.
	 */
	public static void atribuicoesSinteticas() {
		System.out.println("\n----- Atribuições sintéticas");
		System.out.println("\n- Em vez de escrever:\n\ta = a + 10;\n  Pode-se escrever:\n\ta += 10;");
		System.out.println("\n- Vale para outros operadores (+, -, %,  *, /, etc.).");
		System.out.println("\n- Portanto, em vez de usar:\n\t<var> = <var> <op> <expressão>;");
		System.out.println("  Pode-se-se usar:\n\t<var <op>= <expressão>;");
		System.out.println("\n- Exemplos:");
		System.out.println("\ta = a + 10;\t\t\té equivalente a\t\t\ta += 10;");
		System.out.println("\tx = x * (b/c);\t\t\té equivalente a\t\t\tx *= (b/c);");
		System.out.println("\tn = n - z;\t\t\té equivalente a\t\t\tn -= z;");
		System.out.println("\tw = w / (p + q);\t\té equivalente a\t\t\tw /= (p + q);");

		System.out.println("\n- Exercícios:");
		String resposta;
		int a, b, c;

		System.out.println("\nConsidere:\n\tint a = 10, b = 20, c = 0;");
		System.out.println("\tc += a+1;\n\tc *= 2;\n\tc /= b-9;\n\tc -= a-b;");
		a = 10;
		b = 20;
		c = 0;
		c += a+1;
		c *= 2;
		c /= b-9;
		c -= a-b;
		System.out.print("Quanto vale c?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t"+c+" (int)");

		System.out.println("\nReescreva da forma mais abrevida possível os seguintes trechos de código em Java:");
		System.out.println("\na) i = i - 1;");
		System.out.print("Sua resposta?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t--i;\tou\ti--;");
		System.out.println("\nb) b = b + 1;");
		System.out.println("   a = b * c;");
		System.out.println("   c = c - 1;");
		System.out.print("Sua resposta?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\ta = ++b * c--");
		System.out.println("\nc) x = x / (b + c);");
		System.out.print("Sua resposta?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\tx /= (b+c);\tou\tx /= b + c;");
		System.out.println("\nd) x = x - 1;");
		System.out.println("   z = z - x + y;");
		System.out.println("   y = y + 1;");
		System.out.print("Sua resposta?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\tz -= --x - y++;\tou\tz += -(--x) + y++");
	}


	/**
	 * Explicações e testes usando saída formatada.
	 */
	public static void saidaFormatada() {
		System.out.println("\n----- Saída formatada");
		System.out.println("\n- System.out.print e System.out.println podem ser usados para imprimir informação (expressões)");
		System.out.println("\n- Com System.out.printf é possível imprimir informações FORMATADAS");
		System.out.println("\n- Sintaxe:\n\tSystem.out.printf(\"texto a ser impresso com especificadores de formato\",listaDeParametros);");
		System.out.println("\n- Formatos são especificados com % e uma letra:");
		System.out.println("\t%d\tinteiros decimais");
		System.out.println("\t%o\tinteiros octais");
		System.out.println("\t%x\tinteiros hexadecimais com letras minúsculas");
		System.out.println("\t%X\tinteiros hexadecimais com letras maiúsculas");
		System.out.println("\t%c\tcaractere");
		System.out.println("\t%f\tponto-flutuante fixo");
		System.out.println("\t%e\tnotação exponencial");
		System.out.println("\t%g\tponto-flutuante genérico (usa notação exponencial para números muito grandes ou pequenos)");
		System.out.println("\t%s\tcadeias de caracteres (Strings)");
		System.out.println("\t%%\timprime %");
		System.out.println("\t%n\tquebra de linha (tem o mesmo efeito     que \\n)");

		System.out.println("\n- Subformatos:");
		System.out.println("\t-\talinhamento à esquerda");
		System.out.println("\t.X\tvalor real com X casas decimais");
		System.out.println("\t0\tpreenchimento com zeros");
		System.out.println("\t+\tmostra o sinal também para números positivos");

		System.out.println("\n- Exemplos:");
		System.out.println("\n\tdouble percentagem = 15.0/100.0;");
		System.out.println("\tSystem.out.printf(\"%.2f %%%n\", 100*percentagem);");
		System.out.println("\n\tSystem.out.printf(\"PI vale %.15f\\n\", Math.PI);");
		System.out.println("\n\tString nome = \"Fulano de Tal\";");
		System.out.println("\tint idade = 20;");
		System.out.println("\tdouble peso = 75.5;");
		System.out.println("\tSystem.out.printf(\"%s tem %d anos e %.3f kg de peso.\\n\", nome, idade, peso);");
		System.out.println("\n\tint a = 10, b = 20;");
		System.out.println("\tSystem.out.printf(\"a = %d\\nb = %d\\n\", a, b);");

		System.out.println("\n- Resultado da execução:\n");
		double percentagem = 15.0/100.0;
		System.out.printf("%.2f %%%n", 100*percentagem);
		System.out.printf("PI vale %.15f\n", Math.PI);
		String nome = "Fulano de Tal";
		int idade = 20;
		double peso = 75.5;
		System.out.printf("%s tem %d anos e %.3f kg de peso.\n", nome, idade, peso);
		int a = 10, b = 20;
		System.out.printf("a = %d\nb = %d\n", a, b);

		System.out.println("\n- Testes:");

		System.out.print("\n  Digite um valor inteiro: ");
		int n = in.nextInt();
		System.out.printf("\tvalor inteiro impresso com %%o:\t|%o|\n",n);
		System.out.printf("\tvalor inteiro impresso com %%x:\t|%x|\n",n);
		System.out.printf("\tvalor inteiro impresso com %%X:\t|%X|\n",n);
		System.out.printf("\tvalor inteiro impresso com %%d:\t|%d|\n",n);
		System.out.printf("\tvalor inteiro impresso com %%c:\t|%c|\n",(char)n);
		System.out.printf("\tvalor inteiro impresso com %%+d:\t|%+d|\n",n);
		System.out.printf("\tvalor inteiro impresso com %%10d:\t|%10d|\n",n);
		System.out.printf("\tvalor inteiro impresso com %%-10d:\t|%-10d|\n",n);
		System.out.printf("\tvalor inteiro impresso com %%010d:\t|%010d|\n",n);

		System.out.print("\n  Digite um valor real (com ponto): ");
		double d = in.nextDouble();
		System.out.printf("\tvalor real impresso com %%f:\t|%f|\n",d);
		System.out.printf("\tvalor real impresso com %%e:\t|%e|\n",d);
		System.out.printf("\tvalor real impresso com %%.4f:\t|%.4f|\n",d);
		System.out.printf("\tvalor inteiro impresso com %%10.4f:\t|%10.4f|\n",d);
		System.out.printf("\tvalor inteiro impresso com %%-10.4f:\t|%-10.4f|\n",d);

		System.out.print("\n  Digite uma palavra (String): ");
		String s = in.next();
		System.out.printf("\tstring impresso com %%s:\t|%s|\n",s);
		System.out.printf("\tstring impresso com %%20s:\t|%20s|\n",s);
		System.out.printf("\tstring impresso com %%-20s:\t|%-20s|\n",s);
	}


	/**
	 * Explicações e testes usando a classe Math.
	 */
	public static void classeMath() {
		System.out.println("\n----- Classe Math (biblioteca matemática)");
		System.out.println("\n- Há constantes e métodos definidos na classe Math para diversas aplicações matemáticas");
		System.out.println("\n- Sempre deve-se usar Math. na frente do recurso que se deseja utilizar");
		System.out.println("\n- Exemplos:");
		System.out.println("\tMath.PI\t\t\tconstante matemática pi");
		System.out.println("\tMath.sqrt(x)\t\tRaiz quadrada de x");
		System.out.println("\tMath.pow(x, y)\t\tx elevado na y");
		System.out.println("\tMath.sin(x)\t\tSeno de x (x em radianos)");
		System.out.println("\tMath.cos(x)\t\tCosseno de x");
		System.out.println("\tMath.tan(x)\t\tTangente de x");
		System.out.println("\tMath.toRadians(x)\tConverte x graus para radianos");
		System.out.println("\tMath.toDegrees(x)\tConverte x radianos para graus");
		System.out.println("\tMath.exp(x)\t\te elevado na x");
		System.out.println("\tMath.log(x)\t\tLogaritmo natural");
		System.out.println("\tMath.log10(x)\t\tLogaritmo decimal");
		System.out.println("\tMath.round(x)\t\tInteiro mais próximo de x (como um long)");
		System.out.println("\tMath.abs(x)\t\tValor absolulto de x");
		System.out.println("\tMath.max(x, y)\t\tO maior valor entre x e y");
		System.out.println("\tMath.min(x, y)\t\tO menor valor entre x e y");
		System.out.println("\n- Testes:");
		System.out.printf("\n\tMath.PI\t\t= (double) %.20f\n ",Math.PI);
		System.out.printf("\tMath.E\t\t= (double) %.20f\n",Math.E);
		System.out.printf("\tMath.random()\t= (double) %.20f    \n",Math.random());

		System.out.print("\n  Digite um valor real (com ponto): ");
		double v = in.nextDouble();
		System.out.printf("\tMath.sqrt(%f)\t= (double) %f\n",v,Math.sqrt(v));
		System.out.printf("\tMath.round(%f)\t= (long) %d\n",v,Math.round    (v));
		System.out.printf("\tMath.floor(%f)\t= (double) %f\n",v,Math.floor(v));
		System.out.printf("\tMath.ceil(%f)\t= (double) %f\n",v,Math.ceil(v));
		System.out.printf("\tMath.sin(%f)\t= %f\n",v,Math.sin(v));
		System.out.printf("\tMath.cos(%f)\t= %f\n",v,Math.cos(v));
		System.out.printf("\tMath.tan(%f)\t= %f\n",v,Math.tan(v));
	}

	
	/**
	 * Explicações, exemplos e exercícios envonveldo cadeias de caracteres.
	 */
	public static void trabalhandoComCadeiasDeCaracteres() {
		System.out.println("\n----- Trabalhando com cadeias de caracteres");
		System.out.println("\n- O \"tipo\" String é utilizado para armazenar textos (que podem ser bastante grandes, ou seja, iguais ao tamanho de um int)");
		System.out.println("\n- Lembre-se que String é uma classe, o que significa que há métodos que podem ser chamados sobre as suas variáveis/objetos");
		System.out.println("\n- Exemplos:");
		System.out.println("\tString nome = \"Texto\";");
		System.out.println("\tint n = nome.length(); // n recebera o valor 5");
		System.out.println("\tString vazio = \"\";     // este string tem um conteúdo vazio");
		System.out.println("\tSystem.out.println( vazio.length() ); // imprime 0");

		System.out.println("\n- LEMBRE-SE: o operador + realiza uma concatenação quando há um String envolvido");

		System.out.println("\n- Exercícios:");
		String resposta;

		System.out.println("\nConsidere:");
		System.out.println("\tString pNome = \"Joao\";");
		System.out.println("\tString uNome = \"Silva\";");
		System.out.println("\tSystem.out.println( pNome + uNome );");
		System.out.print("O que será impresso?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t\tJoaoSilva (String)");

		System.out.println("\nConsidere:");
		System.out.println("\tString pNome = \"Joao\";");
		System.out.println("\tString uNome = \"Silva\";");
		System.out.println("\tSystem.out.println( pNome + \" \" + uNome );");
		System.out.print("O que será impresso?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t\tJoao Silva (String)");

		System.out.println("\nConsidere:");
		System.out.println("\tString agente = \"Agente 00\";");
		System.out.println("\tint codigo = 7;");
		System.out.println("\tSystem.out.println( agente + codigo );");
		System.out.print("O que será impresso?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t\tAgente 007 (String)");

		System.out.println("\nConsidere:");
		System.out.println("\tint tot = 100;");
		System.out.println("\tSystem.out.println( \"Total=\" + tot );");
		System.out.print("O que será impresso?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t\tTotal=100 (String)");

		System.out.println("\nConsidere:");
		System.out.println("\tSystem.out.println( \"Tic-\" + ");
		System.out.println("\t                    \"tac-\" + ");
		System.out.println("\t                    \"toe\" );");
		System.out.print("O que será impresso?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t\tTic-tac-toe (String)");

		System.out.println("\nConsidere:");
		System.out.println("\tString str = \"Ja\";");
		System.out.println("\tstr = str + \"va\";");
		System.out.println("\tSystem.out.println( str.length() );");
		System.out.print("O que será impresso?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t\t4 (int)");

		System.out.println("\n- LEMBRE-SE TAMBÉM QUE: é possível ler um String com next() - para uma única palavra - ou nextLine() - para ler a linha toda");
		System.out.println("\n\tSystem.out.print(\"Digite seu primeiro nome: \");");
		System.out.println("\tString nome = in.next();");
		System.out.println("\tSystem.out.print(\"Forneca o seu endereco: \");");
		System.out.println("\tString endereco = in.nextLine();");

		System.out.println("\n- Quando for necessário usar nextLine(), é recomendado usar nextLine() para toda a leitura, e então será necessário converter algumas leituras de linha, por exemplo, para int e para double:");
		System.out.println("\n\tString entrada;");
		System.out.println("\tSystem.out.print(\"Digite a sua idade: \");");
		System.out.println("\tentrada = in.nextLine();");
		System.out.println("\tint idade = Integer.parseInt(entrada);");
		System.out.println("\tSystem.out.print(\"Digite o seu peso: \");");
		System.out.println("\tentrada = in.nextLine();");
		System.out.println("\tdouble peso = Double.parseDouble(entrada);");

		System.out.println("\n- LEMBRE-SE AINDA QUE: uma String pode conter sequências de escape");
		System.out.println("\t\\n\tquebra de linha");
		System.out.println("\t\\\\\ta própria contra-barra");
		System.out.println("\t\\t\ttabulação");
		System.out.println("\t\\\"\taspa");
		System.out.println("\tetc.	");

		System.out.println("\n- Mais alguns desafios para pensar:");

		System.out.println("\nConsidere:");
		System.out.println("\tSystem.out.println( \"x=\"+1+1 );");
		System.out.print("O que será impresso?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t\tx=11 (String)");

		System.out.println("\nConsidere:");
		System.out.println("\tSystem.out.println( \"y=\"+1*3 );");
		System.out.print("O que será impresso?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t\ty=3	 (String)");

		System.out.println("\nConsidere:");
		System.out.println("\tSystem.out.println( \"z=\"+1-1 );");
		System.out.print("O que será impresso?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t\t[NADA, pois há um erro de sintaxe na expressão: o operador - não funcionia com String]");

		System.out.println("\nConsidere:");
		System.out.println("\tSystem.out.println( \"x=\"+(1+1) );");
		System.out.print("O que será impresso?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t\tx=2 (String)");

		System.out.println("\nConsidere:");
		System.out.println("\tSystem.out.println( \"y=\"+(1*3) );");
		System.out.print("O que será impresso?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t\ty=3 (String)");

		System.out.println("\nConsidere:");
		System.out.println("\tSystem.out.println( \"z=\"+(1-1) );");
		System.out.print("O que será impresso?\t\t");
		resposta = in.nextLine();
		System.out.println("Resposta correta:\t\tz=0 (String)");
	}

	/**
	 * Mais detalhes e métodos sobre cadeias de caracteres.
	 */
	public static void maisSobreCadeiasDeCaracteres() {
		System.out.println("\n----- Mais sobre cadeias de caracteres");

		System.out.println("\n- Uma variável String armazena uma sequência de caracteres (ou seja, de chars)");
		System.out.println("\n- Cada caractere de uma String é um char em formato Unicode");
		System.out.println("\n- Cada caractere tem um código que pode ser obtido na tabela ASCII");
		System.out.println("\t  '0' => 48, '1' => 49, '2v => 50, ...");
		System.out.println("\t  'A' => 65, 'B' => 66, 'C' => 67, ...");
		System.out.println("\t  'a' => 97, 'b' => 98, 'c' => 99, ...");
		System.out.println("\n- LEMBRE-SE: um char é delimitado por apóstrofos e uma String por aspas");
		System.out.println("\tchar inicial = 'B';");
		System.out.println("\tString iniciais = \"BRL\";");
		System.out.println("\n- Os caracteres de uma String tem índices que iniciam em 0 e vão até o tamanho da String menos 1");
		System.out.println("\n- Pode-se obter um caracteres específico de uma String usando o método charAt(indice):");
		System.out.println("\tString sentimento = \"SAUDADE\";");
		System.out.println("\tSystem.out.println( sentimento.charAt(0) );  // imprime 'S'");
		System.out.println("\tSystem.out.println( sentimento.charAt(1) );  // imprime 'A'");
		System.out.println("\tSystem.out.println( sentimento.charAt(2) );  // imprime 'U'");
		System.out.println("\tSystem.out.println( sentimento.charAt(3) );  // imprime 'D'");
		System.out.println("\tSystem.out.println( sentimento.charAt(4) );  // imprime 'A'");
		System.out.println("\tSystem.out.println( sentimento.charAt(5) );  // imprime 'D'");
		System.out.println("\tSystem.out.println( sentimento.charAt(6) );  // imprime 'E'");
		System.out.println("\tSystem.out.println( sentimento.charAt( sentimento.length()-1 ) );  // imprime o mesmo 'E'");

		System.out.println("\n- Teste:");
		System.out.print("\nDigite uma palavra: ");
		String palavra = in.nextLine();
		System.out.printf("\tPrimeira letra [palavra.charAt(0)]: %c\n",palavra.charAt(0));
		System.out.printf("\tÚltima letra [palavra.charAt(%d)]:   %c\n",palavra.length()-1,palavra.charAt(palavra.length()-1));

		System.out.println("\n- Para obter uma parte de uma String (que também é uma String) pode-se usar o método substring(indiceInicial,indiceFinal) ou substring(indiceInicial)");

		System.out.println("\n- Exemplos:");
		System.out.println("\tString saudacao = \"BOM DIA!\";");
		System.out.println("\tSystem.out.println( saudacao.substring(0,3) ); // imprime \"BOM\"");
		System.out.println("\tSystem.out.println( saudacao.substring(4,7) ); // imprime \"DIA\"");
		System.out.println("\tSystem.out.println( saudacao.substring(7) );   // imprime \"!\"");

		System.out.println("\tString texto = \"01234\";");
		System.out.println("\tSystem.out.println( \"[\" + texto.substring(0) + \"]\" ); // [01234]");
		System.out.println("\tSystem.out.println( \"[\" + texto.substring(1) + \"]\" ); // [1234]");
		System.out.println("\tSystem.out.println( \"[\" + texto.substring(2) + \"]\" ); // [234]");
		System.out.println("\tSystem.out.println( \"[\" + texto.substring(3) + \"]\" ); // [34]");
		System.out.println("\tSystem.out.println( \"[\" + texto.substring(4) + \"]\" ); // [4]");
		System.out.println("\tSystem.out.println( \"[\" + texto.substring(5) + \"]\" ); // []");
		System.out.println("\t// ERRO: System.out.println( \"[\" + texto.substring(1,0) + \"]\" );");
		System.out.println("\tSystem.out.println( \"[\" + texto.substring(1,1) + \"]\" ); // []");
		System.out.println("\tSystem.out.println( \"[\" + texto.substring(1,2) + \"]\" ); // [1]");
		System.out.println("\tSystem.out.println( \"[\" + texto.substring(1,3) + \"]\" ); // [12]");
		System.out.println("\tSystem.out.println( \"[\" + texto.substring(1,4) + \"]\" ); // [123]");
		System.out.println("\tSystem.out.println( \"[\" + texto.substring(1,5) + \"]\" ); // [1234]");
	}


	/**
	 * Um exemplo de aplicação que realiza o processamento de uma String.
	 */
	public static void exemploDeProcessamentoDeString() {
		System.out.println("\n----- Exemplo de processamento de String");
		System.out.println("\n- Considere que você tem uma data em uma String no formato DD/MM/AAAA e quer ter dia, mês e ano armazenados em variáveis inteiras para realizar algum processamento. Como isto pode ser feito?");

		System.out.println("\n\tString hoje = \"22/08/2022\";");
		System.out.println("\tint dia, mes, ano;");

		System.out.println("\n- Há mais de uma forma...");

		System.out.println("\n- Método 1:");
		System.out.println("\n\tdia = 10*(hoje.charAt(0)-'0') + (hoje.charAt(1)-'0');");
		System.out.println("\tmes = 10*(hoje.charAt(3)-'0') + (hoje.charAt(4)-'0');");
		System.out.println("\tano = 1000*(hoje.charAt(6)-'0') + 100*(hoje.charAt(7)-'0') + 10*(hoje.charAt(8)-'0') + (hoje.charAt(9)-'0');");
		System.out.println("\tSystem.out.printf( \"Método 1:\thoje=%s\t\tdia=%d; mes=%d; ano=%d\\n\", hoje, dia, mes, ano );");
	
		System.out.println("\n- Método 2:");
		System.out.println("\n\tdia = Integer.parseInt( hoje.substring(0,2) );");
		System.out.println("\tmes = Integer.parseInt( hoje.substring(3,5) );");
		System.out.println("\tano = Integer.parseInt( hoje.substring(6,10) );");
		System.out.println("\tSystem.out.printf( \"Método 2:\thoje=%s\t\tdia=%d; mes=%d; ano=%d\\n\", hoje, dia, mes, ano );");

		System.out.println("\n- Resultado da Execução:\n");
		String hoje = "22/08/2022";
		int dia, mes, ano;

		// método 1
		dia = 10*(hoje.charAt(0)-'0') + (hoje.charAt(1)-'0');
		mes = 10*(hoje.charAt(3)-'0') + (hoje.charAt(4)-'0');
		ano = 1000*(hoje.charAt(6)-'0') + 100*(hoje.charAt(7)-'0') + 10*(hoje.charAt(8)-'0') + (hoje.charAt(9)-'0');
		System.out.printf( "\tMétodo 1:\thoje=%s\t\tdia=%d; mes=%d; ano=%d\n", hoje, dia, mes, ano );
	
		// método 2
		dia = Integer.parseInt( hoje.substring(0,2) );
		mes = Integer.parseInt( hoje.substring(3,5) );
		ano = Integer.parseInt( hoje.substring(6,10) );
		System.out.printf( "\tMétodo 2:\thoje=%s\t\tdia=%d; mes=%d; ano=%d\n", hoje, dia, mes, ano );

		System.out.println("\n- Teste:\n");
		System.out.print("Digite uma válida data no formato [DD/MM/AAAA]: ");
		hoje = in.nextLine();
		// método 1
		dia = 10*(hoje.charAt(0)-'0') + (hoje.charAt(1)-'0');
		mes = 10*(hoje.charAt(3)-'0') + (hoje.charAt(4)-'0');
		ano = 1000*(hoje.charAt(6)-'0') + 100*(hoje.charAt(7)-'0') + 10*(hoje.charAt(8)-'0') + (hoje.charAt(9)-'0');
		System.out.printf( "\tMétodo 1:\thoje=%s\t\tdia=%d; mes=%d; ano=%d\n", hoje, dia, mes, ano );
	
		// método 2
		dia = Integer.parseInt( hoje.substring(0,2) );
		mes = Integer.parseInt( hoje.substring(3,5) );
		ano = Integer.parseInt( hoje.substring(6,10) );
		System.out.printf( "\tMétodo 2:\thoje=%s\t\tdia=%d; mes=%d; ano=%d\n", hoje, dia, mes, ano );
	}


	/**
	 * Apresenta os principais métodos que se pode usar com cadeias de caracteres.
	 */
	public static void metodosParaString() {
		System.out.println("\n----- Métodos para String");

		System.out.println("\n- A classe String disponibiliza uma grande variedade de métodos para processamento de Strings");

		System.out.println("\n\t* char charAt(int index)\n\t  retorna o valor do caractere no índice especificado");
		System.out.println("\n\t* int compareTo(String anotherString)\n\t  comparação lexicográfica (diferenciando caixa alta e caixa baixa)");
		System.out.println("\n\t* int compareToIgnoreCase(String str)\n\t  comparação lexicográfica (ignornado caixa alta e caixa baixa)");
		System.out.println("\n\t* String concat(String str)\n\t  concatena a string especificada no final desta string");
		System.out.println("\n\t* boolean endsWith(String suffix)\n\t  verifica se a string termina com o sufixo especificado");
		System.out.println("\n\t* boolean equals(Object anObject)\n\t  verifica se a string especificada é igual a esta");
		System.out.println("\n\t* boolean equalsIgnoreCase(String anotherString)\n\t  verifica se a strin} especificada é igual a esta, sem diferenciar caixa alta e caixa baixa");
		System.out.println("\n\t* int hashCode()\n\t  retorna um hash code para esta string");
		System.out.println("\n\t* boolean isEmpty()\n\t  retorna true se, e somente se, o length() for igual a 0");
		System.out.println("\n\t* int length()\n\t  retorna o tamanho desta string");
		System.out.println("\n\t* String substring(int beginIndex)\n\t  retorna uma nova string que é uma substring desta string, do índice até o final");
		System.out.println("\n\t* String substring(int beginIndex, int endIndex)\n\t  retorna uma nova string que é uma substring desta string");
		System.out.println("\n\t* String toLowerCase()\n\t  converte todos os caracteres desta string para uma string em caixa baixa usando as regras da localidade padrão");
		System.out.println("\n\t* String toLowerCase(Locale locale)\n\t  converte todos os caracteres desta string para uma string em caixa baixa usando as regras da localidade especificada");
		System.out.println("\n\t* String toString()\n\t  este objeto (que já é uma string) é autoretornado");
		System.out.println("\n\t* String toUpperCase()\n\t  converte todos os caracteres desta string para uma string em caixa alta usando as regras da localidade padrão");
		System.out.println("\n\t* String toUpperCase(Locale locale)\n\t  converte todos os caracteres desta string para uma string em caixa alta usando as regras da localidade especificada");
		System.out.println("\n\t* String trim()\n\t  retorna uma cópia da string eliminando espaços iniciais e finais");
		System.out.println("\n\t* static String valueOf(boolean b)\n\t  retorna uma string represesntando o argumento boolean");
		System.out.println("\n\t* static String valueOf(char c)\n\t  retorna uma string represesntando o argumento char");
		System.out.println("\n\t* static String valueOf(double d)\n\t  retorna uma string represesntando o argumento double");
		System.out.println("\n\t* static String valueOf(float f)\n\t  retorna uma string represesntando o argumento float");
		System.out.println("\n\t* static String valueOf(int i)\n\t  retorna uma string represesntando o argumento int");
		System.out.println("\n\t* static String valueOf(long l)\n\t  retorna uma string represesntando o argumento long");
	}


	/**
	 * Apresenta uma lista de exercícios.
	 */
	public static void exercicios() {
		System.out.println("\n----- Exercícios");
		System.out.println("\n1) Escreva um programa em Java que leia o raio de um círculo, calculando e mostrando a sua área e a sua circunferência.");
		System.out.println("\n2) Escreva um programa em Java que leia o raio de uma esfera, calculando e mostrando o valor de seu volume.");
		System.out.println("\n3) Escreva um programa em Java que calcule as raízes de uma equação do segundo grau (o programa deve ler os coeficientes a, b e c)");
		System.out.println("\n4) Considere um terreno retangular sobre o qual se deseja colocar \"placas\" de grama que são vendidas por metro quadrado. Neste terreno há um silo redondo e uma casa em formato retangular. Determine os dados que devem ser lidos para que se saiba o custo da colocação de grama nesse terreno e faça o programa em Java para realizar este cálculo.");
		System.out.println("+------------------------------+");
		System.out.println("|                       ___    |");
		System.out.println("|                      ////\\   |");
		System.out.println("|                     |/////|  |");
		System.out.println("|                      \\////   |");
		System.out.println("|                              |");
		System.out.println("|   +--------+                 |");
		System.out.println("|   |////////|                 |");
		System.out.println("|   |////////|                 |");
		System.out.println("|   +--------+                 |");
		System.out.println("|                              |");
		System.out.println("+------------------------------+");
	}


	/**
	 * Apresenta declarações de variáveis e operações diversas com estas variáveis.
	 * @param args Argumentos da linha de comando (NÃO usados).
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		// Aqui a declaração de Scanner foi removida, fazendo-se apenas a sua inicialização
		in = new Scanner(System.in);

		// Isto eh uma chamada de metodo (a execução é desviada para o método e retorna após a execução do método
		introducao();
		// Variáveis declaradas dentro do método não podem ser acessadas fora do método

		declaracaoEInicializacaoDeVariaveis();

		diferencaEntreTiposPrimitivosEClasses();

		atribuicoesDeVariaveisDeTiposDiferentes();
		
		expressoesAritmeticas();

		constantesRotuladasEExemploDeAplicacao();

		lendoDadosDoTerminal();

		exemploDeAplicacaoLendoDoTerminal();

		misturaDeTipos();

		divisaoInteira();

		algunsProblemas();

		preEPosIncrementoEDecremento();

		atribuicoesSinteticas();

		saidaFormatada();

		classeMath();

		trabalhandoComCadeiasDeCaracteres();

		maisSobreCadeiasDeCaracteres();

		exemploDeProcessamentoDeString();

		metodosParaString();

		exercicios();
	
		in.close();
	}

}
