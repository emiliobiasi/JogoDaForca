package tests;

import entities.ControladorDeErros;
import entities.Tracinhos;

public class TestControladorDeErros {
    public static void main (String[] args) {

        //teste 1
        try {
            ControladorDeErros ctrlDeErros = new ControladorDeErros(-1);
            System.out.println("Foi possivel instanciar o controladorDeErros com o parametro \"qtdMax\" negativo.");
        } catch (Exception erro) {
            System.err.println("Não foi possivel instanciar o controladorDeErros com o parametro \"qtdMax\" negativo.");
        }

        //teste 2
        try {
            ControladorDeErros ctrlDeErros = new ControladorDeErros(0);
            System.out.println("Foi possivel instanciar o controladorDeErros com o parametro \"qtdMax\" = 0.");
        } catch (Exception erro) {
            System.err.println("Não foi possivel instanciar o controladorDeErros com o parametro \"qtdMax\" = 0.");
        }

        //teste 3
        ControladorDeErros ctrlDeErros1 = null;
        try {
            ctrlDeErros1 = new ControladorDeErros(3);
            System.out.println("Foi possivel instanciar o controladorDeErros1 com o parametro \"qtdMax\" > 0: " + ctrlDeErros1);

        } catch (Exception erro) {
            System.err.println("Não foi possivel instanciar o controladorDeErros1 com o parametro \"qtdMax\" > 0.");
        }

        //teste 4
        ControladorDeErros ctrlDeErros2 = null;
        try {
            ctrlDeErros2 = new ControladorDeErros(3);
            System.out.println("Foi possivel instanciar o controladorDeErros2 com o parametro \"qtdMax\" > 0: " + ctrlDeErros2);

        } catch (Exception erro) {
            System.err.println("Não foi possivel instanciar o controladorDeErros2 com o parametro \"qtdMax\" > 0.");
        }

        //teste 5
        ControladorDeErros ctrlDeErros3 = null;
        try {
            ctrlDeErros3 = new ControladorDeErros(2);
            System.out.println("Foi possivel instanciar o controladorDeErros3 com o parametro \"qtdMax\" > 0: " + ctrlDeErros3);

        } catch (Exception erro) {
            System.err.println("Não foi possivel instanciar o controladorDeErros3 com o parametro \"qtdMax\" > 0.");
        }

        //teste 6 - resgistreUmErro
        try {
            ctrlDeErros3.registreUmErro();
            System.out.println("Foi possível adicionar um erro no \"ctrlDeErros3\"" + ctrlDeErros3);
        } catch (Exception erro) {
            System.err.println("Não foi possível adicionar um erro no \"ctrlDeErros3\"");
        }

        //teste 7
        try {
            ctrlDeErros3.registreUmErro();
            System.out.println("Foi possível adicionar um erro no \"ctrlDeErros3\"" + ctrlDeErros3);
        } catch (Exception erro) {
            System.err.println("Não foi possível adicionar um erro no \"ctrlDeErros3\"");
        }

        //teste 8
        try {
            if (ctrlDeErros2.isAtingidoMaximoDeErros()) {
                System.out.println("O ctrlDeErros2 atingiu o máximo de erros");
            } else {
                System.out.println("Ainda existem possibilidades de errar no ctrlDeErros2!");
            }

        } catch (Exception erro) {
            System.err.println("Não foi possível testar se ja foi atingido o maximo de erro");
        }


        //teste 9 - isAtingidoMaximoDeErros
        try {
            if (ctrlDeErros3.isAtingidoMaximoDeErros()) {
                System.out.println("O ctrlDeErros3 atingiu o máximo de erros");
            } else {
                System.out.println("Ainda existem possibilidades de errar no ctrlDeErros3!");
            }

        } catch (Exception erro) {
            System.err.println("Não foi possível testar se ja foi atingido o maximo de erro");
        }


        //teste 10
        System.out.println("--->Testando com \"ctrlDeErros2\", que possui ainda possibilidades de erros: " + ctrlDeErros2);
        try {
            if (ctrlDeErros2.isAtingidoMaximoDeErros()) {
                System.out.println("O ctrlDeErros2 atingiu o máximo de erros");
            } else {
                System.out.println("Ainda existem possibilidades de errar no ctrlDeErros2!");
            }
        } catch (Exception erro) {
            System.err.println("Não foi possível testar se ja foi atingido o maximo de erro");
        }

        //teste 11
        System.out.println("---> Voltando a testar com o \"ctrlDeErros3\"");
        try {
            ctrlDeErros3.registreUmErro();
            System.out.println("Foi possível adicionar um erro no \"ctrlDeErros3\"" + ctrlDeErros3);
        } catch (Exception erro) {
            System.err.println("Não foi possível testar adicionar um erro no \"ctrlDeErros3\", pois já está no limite máximo de erros.");
        }


        //teste 12 - equals
        System.out.println ("ctrlDeErros1: " + ctrlDeErros1 + " eh o controlador de erros que estamos testando");
        System.out.println ("ctrlDeErros2: " + ctrlDeErros2 + " eh o controlador de erros que estamos testando");
        System.out.println ("ctrlDeErros3: " + ctrlDeErros3 + " eh o controlador de erros que estamos testando");

        //teste 13
        System.out.println ("Eh " + ctrlDeErros1.equals(null) + " que \"ctrlDeErros1\" eh igual (pelo equals) a null");

        //teste 14
        System.out.println ("Eh "+ctrlDeErros1.equals(ctrlDeErros1)+" que \"ctrlDeErros1\" eh igual (pelo equals) a si mesmo");

        //teste 15
        System.out.println ("Eh "+ctrlDeErros1.equals(ctrlDeErros2)+" que \"ctrlDeErros1\": " + ctrlDeErros1 + " eh igual (pelo equals) a \"ctrlDeErros2\": " + ctrlDeErros2);

        //teste 16
        System.out.println ("Eh "+ctrlDeErros1.equals(ctrlDeErros3)+" que \"ctrlDeErros1\": " + ctrlDeErros1 + " eh igual (pelo equals) a \"ctrlDeErros3\": " + ctrlDeErros3);

        //teste 17 - hashCode
        System.out.println ("Eh "+(ctrlDeErros1.hashCode()==ctrlDeErros2.hashCode())+" que o hashCode de um \"ctrlDeErros1\": " + ctrlDeErros1 + " eh igual ao hashCode de outro \"ctrlDeErros2\": " + ctrlDeErros2);

        //teste 12
        System.out.println ("Eh "+(ctrlDeErros1.hashCode()==ctrlDeErros3.hashCode())+" que o hashCode de \"ctrlDeErros1\": " + ctrlDeErros1 + " eh igual ao hashCode de \"ctrlDeErros3\": " + ctrlDeErros3);

        // teste 18 - clone
        ControladorDeErros ctrlDeErrosCopy = (ControladorDeErros)ctrlDeErros1.clone();
        System.out.println("Controlador de erros \"ctrlDeErros1\" copiados em um novo objeto ctrlDeErrosCopy: ctrlDeErros1 = " + ctrlDeErros1 + ", ctrlDeErrosCopy = " + ctrlDeErrosCopy);
    }
}
