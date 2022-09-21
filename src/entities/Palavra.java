package entities;

public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
        // verifica se o texto recebido é nulo ou então vazio,
        // ou seja, sem nenhum caractere, lançando exceção.
        if (texto==null || texto=="")
            throw new Exception("O texto não pode ser vazio ou nulo");

        // armazena o texto recebido em this.texto.
        this.texto = texto;
    }

    public int getQuantidade (char letra)
    {
        // percorre o String this.texto, conta e retorna
        // quantas letras existem nele iguais a letra fornecida
        int count = 0;
        for (int i= 0; i < this.texto.length(); i++) {
            if (this.texto.charAt(i) == letra) {
                count++;
            }
        }
        return count;
    }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {
        // se i==0, retorna a posicao em que ocorre a primeira
        // aparicao de letra fornecida em this.texto;
        // se i==1, retorna a posicao em que ocorre a segunda
        // aparicao de letra fornecida em this.texto;
        // se i==2, retorna a posicao em que ocorre a terceira
        // aparicao de letra fornecida em this.texto;
        // e assim por diante.
        // lançar excecao caso nao encontre em this.texto
        // a Iézima aparição da letra fornecida.
        try {
            int qtd = this.getQuantidade(letra) - i;

            for(int j = 0; j < this.texto.length(); j++) {
                if (letra == this.texto.charAt(j)) {
                    qtd--;
                    if (qtd == 0) {
                        return j;
                    }
                }
            }
        } catch (Exception erro) {
            throw erro;
        }
        return -1;
    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    @Override
    public String toString ()
    {
        return this.texto;
    }

    @Override
    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Palavra palavra = (Palavra)obj;

        if (this.texto != palavra.texto) return false;

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

    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}
