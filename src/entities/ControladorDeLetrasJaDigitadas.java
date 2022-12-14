package entities;

import java.util.Objects;

public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        // torna this.letrasJaDigitadas igual ao String vazio
        this.letrasJaDigitadas = "";
    }

    public boolean isJaDigitada (char letra)
    {
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
        for (int i = 0; i < this.letrasJaDigitadas.length(); i++) {
            if (this.letrasJaDigitadas.charAt(i) == letra) {
                return true;
            }
        }
        return false;
    }

    public void registre (char letra) throws Exception
    {
        // verifica se a letra fornecida ja foi digitada (pode usar
        // o método this.isJaDigitada, para isso), lancando uma exceção
        // em caso afirmativo.
        if (isJaDigitada(letra)) {
            throw new Exception("Letra ja digitada antes!");
        } else {
            // concatena a letra fornecida a this.letrasJaDigitadas.
            this.letrasJaDigitadas += letra;
        }
    }

    @Override
    public String toString ()
    {
        // retorna um String com TODAS as letras presentes em
        // this.letrasJaDigitadas separadas por vírgula (,).
        String retLetrasJaDigitadas = "";
        for (int i = 0; i < this.letrasJaDigitadas.length(); i++) {
            retLetrasJaDigitadas = retLetrasJaDigitadas + letrasJaDigitadas.charAt(i) + ", ";
        }
        return retLetrasJaDigitadas;
    }

    @Override
    public boolean equals (Object obj)
    {
        // verificar se this e obj são iguais
        if (this ==obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        ControladorDeLetrasJaDigitadas cdljd = (ControladorDeLetrasJaDigitadas) obj;


        if (!this.letrasJaDigitadas.equals(cdljd.letrasJaDigitadas)) return false;

        return true;
    }

    @Override
    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        int ret = 7;
        ret = 7 * ret + new String(this.letrasJaDigitadas).hashCode();
        if (ret < 0) {
            ret=-ret;
        }
        return ret;
    }

    public ControladorDeLetrasJaDigitadas(
            ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
            throws Exception // construtor de cópia
    {
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
        if (controladorDeLetrasJaDigitadas == null) {
            throw new Exception("param controladorDeLetrasJaDigitadas não existe - null");
        }
        this.letrasJaDigitadas = controladorDeLetrasJaDigitadas.letrasJaDigitadas;
    }

    public Object clone ()
    {
        // criar uma cópia do this com o construtor de cópia e retornar
        ControladorDeLetrasJaDigitadas ret = null;
        try {
            ret = new ControladorDeLetrasJaDigitadas(this);
        } catch (Exception erro) {}

        return ret;
    }
}
