import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Created by pawel on 09.07.15.
 */
public class Numbers {
    private static final BiMap<Integer,int[]> geneStorage;
    static {
        BiMap<Integer,int[]> biMap = HashBiMap.create();
        biMap.put(1,new int[] {0,0,0,0});
        biMap.put(2,new int[] {0,0,0,1});
        biMap.put(3,new int[] {0,0,1,0});
        biMap.put(4,new int[] {0,1,0,0});
        biMap.put(5,new int[] {1,0,0,0});
        biMap.put(6,new int[] {0,0,1,1});
        biMap.put(7,new int[] {0,1,1,0});
        biMap.put(8,new int[] {1,1,0,0});
        biMap.put(9,new int[] {0,1,1,1});
        geneStorage = biMap;
    }
    private static final BiMap<int[],Integer> numbersStorage = geneStorage.inverse();

    public static int[] getGeneForNumber(int i){
        return geneStorage.get(i);
    }

    public static Integer getNumberForGene(int[] gene){
        return numbersStorage.get(gene);
    }

}
