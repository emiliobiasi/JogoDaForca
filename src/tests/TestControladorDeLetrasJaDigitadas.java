package tests;

import entities.ControladorDeLetrasJaDigitadas;
import entities.Palavra;
import entities.Tracinhos;

public class TestControladorDeLetrasJaDigitadas {
    public static void main (String[] args) {

        //teste 1
        try
        {
            ControladorDeLetrasJaDigitadas cdljd = new ControladorDeLetrasJaDigitadas (null);
            System.out.println ("Deu certo construir um controlador de letras ja digitadas null");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir palavra um controlador de letras ja digitadas null");
        }

        //teste 2
        try
        {
            Palavra p2 = new Palavra ("");
            System.out.println ("Deu certo construir um controlador de letras ja digitadas \"\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir um controlador de letras ja digitadas \"\"");
        }

        //teste 3
        ControladorDeLetrasJaDigitadas cdljd1 = null;
        try
        {
            cdljd1 = new ControladorDeLetrasJaDigitadas ();
            System.out.println ("Deu certo construir um controlador de letras ja digitas \"cdljd1\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir um controlador de letras ja digitas \"cdljd1\"");
        }

        //teste 4
        ControladorDeLetrasJaDigitadas cdljd2 = null;
        try
        {
            cdljd2 = new ControladorDeLetrasJaDigitadas ();
            System.out.println ("Deu certo construir um controlador de letras ja digitas \"cdljd2\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir um controlador de letras ja digitas \"cdljd2\"");
        }

        //teste 5
        ControladorDeLetrasJaDigitadas cdljd3 = null;
        try
        {
            cdljd3 = new ControladorDeLetrasJaDigitadas ();
            System.out.println ("Deu certo construir um controlador de letras ja digitas \"cdljd3\"");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir um controlador de letras ja digitas \"cdljd3\"");
        }


        //teste 6 - resgistre
        try {
            cdljd1.registre('a');
            System.out.println("Deu certo ao registrar uma letra \"a\" ao controlador de letras ja digitas \"cdljd1\"");
        } catch (Exception erro) {
            System.err.println("Deu erro ao registrar uma letra \"a\" ao controlador de letras ja digitas \"cdljd1\"");
        }

        //teste 7
        try {
            cdljd1.registre('a');
            System.out.println("Deu certo ao registrar novamente uma letra \"a\" ao controlador de letras ja digitas \"cdljd1\"");
        } catch (Exception erro) {
            System.err.println("Deu erro ao registrar novamente uma letra \"a\" ao controlador de letras ja digitas \"cdljd1\"");
        }

        //teste 8
        try {
            cdljd1.registre('b');
            System.out.println("Deu certo ao registrar uma letra \"b\" ao controlador de letras ja digitas \"cdljd1\"");
        } catch (Exception erro) {
            System.err.println("Deu erro ao registrar uma letra \"b\" ao controlador de letras ja digitas \"cdljd1\"");
        }

        //teste 9
        try {
            cdljd2.registre('a');
            System.out.println("Deu certo ao registrar uma letra \"a\" ao controlador de letras ja digitas \"cdljd2\"");
        } catch (Exception erro) {
            System.err.println("Deu erro ao registrar uma letra \"a\" ao controlador de letras ja digitas \"cdljd2\"");
        }

        //teste 10
        try {
            cdljd2.registre('b');
            System.out.println("Deu certo ao registrar uma letra \"b\" ao controlador de letras ja digitas \"cdljd2\"");
        } catch (Exception erro) {
            System.err.println("Deu erro ao registrar uma letra \"b\" ao controlador de letras ja digitas \"cdljd2\"");
        }

        //teste 11
        try {
            cdljd3.registre('c');
            System.out.println("Deu certo ao registrar uma letra \"c\" ao controlador de letras ja digitas \"cdljd3\"");
        } catch (Exception erro) {
            System.err.println("Deu erro ao registrar uma letra \"c\" ao controlador de letras ja digitas \"cdljd3\"");
        }

        //teste 12 - isJaDigitada
        try {
            cdljd1.isJaDigitada('a');
            System.out.println("Deu certo ao verificar uma letra \"a\" no controlador de letras ja digitas \"cdljd1\"");
        } catch (Exception erro) {
            System.err.println("Deu erro ao verificar uma letra \"a\" no controlador de letras ja digitas \"cdljd1\"");
        }

        //teste 13
        try {
            cdljd1.isJaDigitada('b');
            System.out.println("Deu certo ao verificar uma letra \"b\" no controlador de letras ja digitas \"cdljd1\"");
        } catch (Exception erro) {
            System.err.println("Deu erro ao verificar uma letra \"b\" no controlador de letras ja digitas \"cdljd1\"");
        }

        //teste 11
        try {
            cdljd1.isJaDigitada('h');
            System.out.println("Deu certo ao verificar uma letra \"h\" no controlador de letras ja digitas \"cdljd1\", mesmo não existindo na String");
        } catch (Exception erro) {
            System.err.println("Deu erro ao verificar uma letra \"h\" no controlador de letras ja digitas \"cdljd1\"");
        }

        //teste 12
        System.out.println ("cdljd1 eh o controlador de letras ja digitadas que estamos testando: " + cdljd1);
        System.out.println ("cdljd2 eh o controlador de letras ja digitadas que estamos testando: " + cdljd2);
        System.out.println ("cdljd3 eh o controlador de letras ja digitadas que estamos testando: " + cdljd3);

        //teste 13
        System.out.println ("Eh " + cdljd1.equals(null) + " que o controlador de letras ja digitadas \"cdljd1\" eh igual (pelo equals) a null");

        //teste 14
        System.out.println ("Eh " + cdljd1.equals("") + " que o controlador de letras ja digitadas \"cdljd1\" eh igual (pelo equals) a si mesmo");

        //teste 15 ****
        System.out.println ("Eh "+cdljd1.equals(cdljd2)+" que o controlador de letras ja digitadas \"cdljd1\" eh igual (pelo equals) a \"cdljd2\"");

        //teste 16
        System.out.println ("Eh "+cdljd1.equals(cdljd3)+" que o controlador de letras ja digitadas \"cdljd1\" eh igual (pelo equals) a \"cdljd3\"");

        //teste 17
        System.out.println ("Eh "+(cdljd1.hashCode()==cdljd2.hashCode())+" que o hashCode de um controlador de letras ja digitadas \"cdljd1\" eh igual ao hashCode de outro \"cdljd2\"");

        //teste 18
        System.out.println ("Eh "+(cdljd1.hashCode()==cdljd3.hashCode())+" que o hashCode de um controlador de letras ja digitadas \"cdljd1\" eh igual ao hashCode de \"cdljd2\"");

        //teste 19 - clone
        ControladorDeLetrasJaDigitadas cdljdCopy = (ControladorDeLetrasJaDigitadas) cdljd1.clone();
        System.out.println("O controlador de letras ja digitadas \"cdljd1\" copiados em um novo objeto cdljdCopy: cdljd1 = " + cdljd1 + ", cdljdCopy = " + cdljdCopy);
    }
}
