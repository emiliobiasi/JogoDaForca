import java.util.ArrayList;

public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
        // verifica se qtd não é positiva, lançando uma exceção.
        if (qtd < 0) {
            throw new Exception("Quantidade Inválida!");
        }
        // instancia this.texto com um vetor com tamanho igual qtd.
        this.texto = new char[qtd];

        // preenche this.texto com underlines (_).
        for (int i = 0; i < qtd; i++) {
            this.texto[i] = '_';
        }
    }

    public void revele (int posicao, char letra) throws Exception
    {
        // verifica se posicao é negativa ou então igual ou maior
        // do que this.texto.length, lançando uma exceção.
        if (posicao < 0 || posicao >= this.texto.length) {
            throw new Exception("Posicao inválida!");
        }
        // armazena a letra fornecida na posicao tambem fornecida
        // do vetor this.texto
        this.texto[posicao] = letra;
    }

    public boolean isAindaComTracinhos ()
    {
        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
        for (int i = 0; i < this.texto.length; i++) {
            if (this.texto[i] == '_') {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString ()
    {
        // retorna um String com TODOS os caracteres que há
        // no vetor this.texto, intercalados com espaços em
        // branco
        String retTracinhos = null;
        for (int i = 0; i < this.texto.length; i++) {
            retTracinhos = this.texto[i] + " ";
        }
        return retTracinhos;
    }

    @Override
    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo

        if (this == obj) return true;
        if (this == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Tracinhos tr = (Tracinhos) obj;

        if (this.texto != tr.texto) return false;

        return true;
    }

    @Override
    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        int ret = 7;
        ret = 7 * ret + new String (this.texto).hashCode();

        if (ret < 0) {
            ret=-ret;
        }
        return ret;
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia
    {
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conteúdo de t.texto para this.texto
        if (t == null) {
            throw new Exception ("t não existe (tracinho)");
        }
        this.texto = t.texto;
    }

    public Object clone ()
    {
        // retornar uma copia de this
        Tracinhos ret = null;
        try {
            ret = new Tracinhos(this);
        } catch (Exception erro) {}
        return ret;
    }

}
