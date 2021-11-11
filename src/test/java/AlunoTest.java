import identifier.Aluno;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlunoTest {
    Aluno estudante;

    @Before
    public void setUp(){
        estudante = new Aluno();
    }

    @Test
    public void alunoAprovadoSemProvaFinal(){
        estudante.setNota1(7.0);
        estudante.setNota2(7.0);
        estudante.setNota3(7.0);
        estudante.gerarMedia();
        String resultadoObtido = estudante.getStatus();
        String resultadoEsperado = "Aprovado";
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }
    @Test
    public void alunoReprovadoSemProvaFinal(){
        estudante.setNota1(4.0);
        estudante.setNota2(4.0);
        estudante.setNota3(3.7);
        estudante.gerarMedia();
        String resultadoObtido = estudante.getStatus();
        String resultadoEsperado = "Reprovado";
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void alunoQuaseReprovaMasVaiParaProvaFinal(){
        estudante.setNota1(4.0);
        estudante.setNota2(4.0);
        estudante.setNota3(4.5);
        estudante.gerarMedia();
        String resultadoObtido = estudante.getStatus();
        String resultadoEsperado = "Prova Final";
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void alunoQuasePassaMasVaiParaProvaFinal(){
        estudante.setNota1(8.0);
        estudante.setNota2(6.0);
        estudante.setNota3(6.7);
        estudante.gerarMedia();
        String resultadoObtido = estudante.getStatus();
        String resultadoEsperado = "Prova Final";
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void alunoQuaseReprovaMasEhAprovadoNaProvaFinal() {
        estudante.setNota1(4.0);
        estudante.setNota2(4.0);
        estudante.setNota3(4.5);
        estudante.gerarMedia();
        estudante.setProvaFinal(5.9);
        String resultadoObtido = estudante.getStatus();
        String resultadoEsperado = "Aprovado Prova Final";
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void alunoQuasePassaMasEhReprovadoNaProvaFinal(){
        estudante.setNota1(8.0);
        estudante.setNota2(6.0);
        estudante.setNota3(6.7);
        estudante.gerarMedia();
        estudante.setProvaFinal(2.9);
        String resultadoObtido = estudante.getStatus();
        String resultadoEsperado = "Reprovado Prova Final";
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

}
