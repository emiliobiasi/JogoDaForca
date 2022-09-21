package tests;

import entities.Palavra;
import entities.Tracinhos;

public class TestTracinhos {
    public static void main (String[] args) throws Exception {

        //teste 1
        try {
            Tracinhos t1 = new Tracinhos(null);
            System.out.println("Deu certo contruir tracinhos null.");
        } catch (Exception erro) {
            System.out.println("Deu erro contruir tracinhos nulo!");
        }

        //teste 2
        try {
            int qtd = -1;
            Tracinhos t2 = new Tracinhos(qtd);
            System.out.println("Deu certo construir tracinhos com quantidade negativa");
        } catch (Exception erro) {
            System.out.println("O tamanho da Palavra que monta os tracinhos é negativa, tracinhos não criado!");
        }

        //teste 3
        try {
            int qtd = 0;
            Tracinhos t3 = new Tracinhos(qtd);
            System.out.println("Foi possível cria tracinhos vazio: \"\"");
        } catch (Exception erro) {
            System.out.println("Não foi possível criar tracinhos vazio: \"\"");
        }

        //teste 4
        Palavra p1 = new Palavra("JAVA");
        Tracinhos t4 = null;
        try {
            t4 = new Tracinhos(p1.getTamanho());
            System.out.println("Deu certo construir tracinhos com a palavra JAVA: " + t4);
        } catch (Exception erro) {
            System.out.println("Não foi possível construir tracinhos com a palavra JAVA");
        }

        //teste 5
        Palavra p2 = new Palavra("MONGODB");
        Tracinhos t5 = null;
        Tracinhos t6 = null;
        Tracinhos t7 = null;

        try {
            t5 = new Tracinhos(p2.getTamanho());
            t6 = new Tracinhos(p2.getTamanho());
            t7 = new Tracinhos(p2.getTamanho());
            System.out.println("Deu certo construir tracinhos com a palavra MONGODB: " + t5);
        } catch (Exception erro) {
            System.out.println("Não foi possível construir tracinhos com a palavra MONGODB");
        }

        //teste 6 - método revele
        char letra = 'A';
        int qtd = p1.getQuantidade(letra);
        try {
            for (int i=0; i<qtd; i++)
            {
                int posicao = p1.getPosicaoDaIezimaOcorrencia (i,letra);
                t4.revele (posicao, letra);
            }
            System.out.println("Deu certo revelar as letras \"A\" da palavra JAVA: " + t4);
        } catch (Exception erro) {
            System.out.println("Não foi possível revelar a letra \"A\" da palavra JAVA");
        }

        //teste 7 - método revele
        letra = 'O';
        qtd = p2.getQuantidade(letra);
        try {
            for (int i=0; i<qtd; i++)
            {
                int posicao = p2.getPosicaoDaIezimaOcorrencia (i,letra);
                t5.revele (posicao, letra);
            }
            System.out.println("Deu certo revelar as letras \"O\" da palavra MONGODB: " + t5);
        } catch (Exception erro) {
            System.out.println("Não foi possível revelar a letra \"O\" da palavra MONGODB");
        }

        //teste 8 - método isAindaComTracinhos
        try {
            if (t4.isAindaComTracinhos()) {
                System.out.println("Deu certo a validação se ainda possuem tracinhos para revelar na palavra JAVA: " + t4);
            }
        } catch (Exception erro) {
            System.out.println("A validação deu erro, não encontrou nenhum tracinho na palavra JAVA: " + t4);
        }

        //teste 9 - método isAindaComTracinhos
        try {
            if (t5.isAindaComTracinhos()) {
                System.out.println("Deu certo a validação se ainda possuem tracinhos para revelar na palavra MONGODB: " + t5);
            }
        } catch (Exception erro) {
            System.out.println("A validação deu erro, não encontrou nenhum tracinho na palavra MONGODB: " + t5);
        }

        //teste 10 - toString
        System.out.println("A palavra que compõe os tracinhos é: " + p2 + ". Tracinhos: " + t6);

        //teste 11 - equals
        System.out.println ("Eh " + t6.equals(null) + " que \"MONGODB\" em tracinhos eh igual (pelo equals) a null");

        // teste 12
        System.out.println ("Eh " + t6.equals(t5) + " que \"MONGODB\" em tracinhos eh igual (pelo equals) a si mesmo");

        // teste 13
        System.out.println ("Eh " + t6.equals("_ _ _ _ _ _ _ ")+" que \"MONGODB\" em tracinhos eh igual (pelo equals) ao String \"_ _ _ _ _ _ _ \"");

        // teste 14  *******
        System.out.println ("Eh " + t6.equals(t7) +" que \"MONGODB\" em tracinhos eh igual (pelo equals) a \"MONGODB\" em tracinhos.");

        // teste 15
        System.out.println ("Eh "+t6.equals(t4)+" que \"MONGODB\" em tracinhos eh igual (pelo equals) a \"JAVA\" em tracinhos");

        // teste 16 - hashCode
        System.out.println ("Eh "+(t6.hashCode()==t7.hashCode())+" que o hashCode de um \"MONGODB\" em tracinhos eh igual ao hashCode de outro \"MONGODB\" em tracinhos");

        // teste 17
        System.out.println ("Eh "+(t6.hashCode()==t4.hashCode())+" que o hashCode de \"MONGODB\" em tracinhos eh igual ao hashCode de \"JAVA\" em tracinhos");

        // teste 18 - clone
        Tracinhos tcopy = (Tracinhos)t6.clone();
        System.out.println("Tracinhos de \"MONGODB\" copiados em um novo objeto tcopy: t6 = " + t6 + ", tcopy = " + tcopy);

    }
}
