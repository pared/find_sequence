import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestNumbersAndOperators {
    @Test
    public void shouldNumbersMatch(){
        //check loop number -> gene -> number
        for (int i = 1; i <= 9 ; i++) {
            assertEquals(new Integer(i),Numbers.getNumberForGene(Numbers.getGeneForNumber(i)));
        }
    }
    @Test
    public void shoudlOperatorsMatch(){
        assertEquals(new Character('+'),Operators.getOperatorForGene(Operators.getGeneForCharacter('+')));
        assertEquals(new Character('-'),Operators.getOperatorForGene(Operators.getGeneForCharacter('-')));
        assertEquals(new Character('\\'),Operators.getOperatorForGene(Operators.getGeneForCharacter('\\')));
        assertEquals(new Character('*'),Operators.getOperatorForGene(Operators.getGeneForCharacter('*')));
    }
}
