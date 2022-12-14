package entities;

public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
        // verifica se qtdMax fornecida não é positiva, lançando
        // uma exceção.
        if (qtdMax <= 0) {
            throw new Exception("Quantidade Maxima inválida!");
        }
        // armazena qtdMax fornecida em this.qtdMax.
        this.qtdMax = qtdMax;
    }

    public void registreUmErro () throws Exception
    {
        // verifica se this.qtdErr ja é igual a this.qtdMax,
        // lançando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo
        if (this.qtdErr == this.qtdMax) {
            throw new Exception("qtdErr == qtdMax!");
        }
        this.qtdErr++;
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou então false, caso contrario.
        if (this.qtdErr == this.qtdMax) {
            return true;
        }
        return false;
    }

    @Override
    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    @Override
    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        ControladorDeErros cde = (ControladorDeErros)obj;

        if (this.qtdErr != cde.qtdErr) return false;
        if (this.qtdMax != cde.qtdMax) return false;

        return true;
    }

    @Override
    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        int ret = 7;
        ret = 7 * ret + new Integer(this.qtdErr).hashCode();
        ret = 7 * ret + new Integer(this.qtdMax).hashCode();
        if (ret < 0) {
            ret=-ret;
        }
        return ret;
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de cópia
    {
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
        if (c == null) {
            throw new Exception("variavel c nao existente - null");
        }
        this.qtdMax = c.qtdMax;
        this.qtdErr = c.qtdErr;
    }

    public Object clone ()
    {
        // returnar uma cópia de this
        ControladorDeErros ret = null;
        try {
            ret = new ControladorDeErros(this);
        } catch (Exception erro) {}
        return ret;
    }

}
