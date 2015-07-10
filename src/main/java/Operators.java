import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Created by pawel on 09.07.15.
 */
public class Operators {

    private static final BiMap<Character,int[]> geneStorage;
    static{
        BiMap<Character,int[]> biMap = HashBiMap.create();
        biMap.put('+' , new int[] {1,1,1,0});
        biMap.put('-' , new int[] {1,1,0,1});
        biMap.put('/' , new int[] {1,0,1,1});
        biMap.put('*' , new int[] {0,1,0,1});
        geneStorage = biMap;
    }
    private static final BiMap<int[],Character> operatorStorage = geneStorage.inverse();

    public static int[] getGeneForCharacter(char c){
        return geneStorage.get(c);
    }

    public static Character getOperatorForGene(int[] gene){
        return operatorStorage.get(gene);
    }
}
