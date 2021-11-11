import identifier.Identifier;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IdentifierTest {

    Identifier id;

    @Before
    public void setUp(){
        id = new Identifier();
    }

    @Test
    public void verificaTamanhoValidoMaximo(){
        Boolean result;
        result = id.validateIdentifier("vaca11");
        Assert.assertTrue(result);
    }
    @Test
    public void verificaTamanhoValidoMinimo(){
        Boolean result;
        result = id.validateIdentifier("v");
        Assert.assertTrue(result);
    }

    @Test
    public void verificaIndetificadorVazio(){
        Boolean result;
        result = id.validateIdentifier("");
        Assert.assertFalse(result);
    }

    @Test
    public void verificaIdentificadorNulo(){
        Boolean result;
        result = id.validateIdentifier(null);
        Assert.assertFalse(result);
    }

    @Test
    public void verificaTamanhoInvalido(){
        Boolean result;
        result = id.validateIdentifier("vacao10");
        Assert.assertFalse(result);
    }

    @Test
    public void verificaComecaComLetra(){
        Boolean result;
        result = id.validateIdentifier("love1");
        Assert.assertTrue(result);
    }

    @Test
    public void verificaComecaComNumero(){
        Boolean result;
        result = id.validateIdentifier("2love");
        Assert.assertFalse(result);
    }

    @Test
    public void verificaCaracterEspecial(){
        Boolean result;
        result = id.validateIdentifier("l@ve");
        Assert.assertFalse(result);
    }

    @After
    public void tearDown(){
        id = null;
    }
}
