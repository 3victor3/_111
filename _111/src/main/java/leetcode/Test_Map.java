package leetcode;

import java.util.*;

public class Test_Map {
    static int hashMapW = 0;
    static int hashMapR = 0;
    static int linkMapR = 0;
    static int linkMapW = 0;
    static int treeMapW = 0;
    static int treeMapR = 0;
    static int hashTableR = 0;
    static int hashTableW = 0;

    public static void main(String[] args) {
        for (int i=0; i<3; i++){
            Test_Map testMap = new Test_Map();
            testMap.test(100*10000);
            System.out.println();
        }

        System.out.println("hashMapW = " + hashMapW / 10);
        System.out.println("hashMapR = " + hashMapR / 10);
        System.out.println("linkMapW = " + linkMapW / 10);
        System.out.println("linkMapR = " + linkMapR / 10);
        System.out.println("treeMapW = " + treeMapW / 10);
        System.out.println("treeMapR = " + treeMapR / 10);
        System.out.println("hashTableW = " + hashTableW / 10);
        System.out.println("hashTableR = " + hashTableR / 10);
    }

    public void test(int size){
        int index;
        Random random = new Random();
        String[] key = new String[size];

        //hashmap insert
        Map<String,String> map = new HashMap<String, String>();
        long start = System.currentTimeMillis();
        for (int i=0; i<size;i++){
            key[i] = UUID.randomUUID().toString();
            map.put(key[i],UUID.randomUUID().toString());
        }
        long end = System.currentTimeMillis();
        hashMapW += (end-start);
        System.out.println("HashMap插入耗时 = " + (end - start) + " ms");

        //hashmap read
        start = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            index = random.nextInt(size);
            map.get(key[index]);
        }
        end = System.currentTimeMillis();
        hashMapR += (end-start);
        System.out.println("HashMap读取耗时 = " + (end - start) + " ms");

        //Linkedhashmap insert
        map = new LinkedHashMap<String, String>();
        start = System.currentTimeMillis();
        for (int i=0;i<size;i++){
            key[i] = UUID.randomUUID().toString();
            map.put(key[i],UUID.randomUUID().toString());
        }
        end = System.currentTimeMillis();
        linkMapW += (end-start);
        System.out.println("LinkedHashMap插入耗时 = " + (end - start) + " ms");

        //Linkedhashmap read
        start = System.currentTimeMillis();
        for (int i=0;i<size;i++){
            index = random.nextInt(size);
            map.get(key[index]);
        }
        end = System.currentTimeMillis();
        linkMapR += (end-start);
        System.out.println("LinkedHashMap读取耗时 = " + (end - start) + " ms");

        //treemap insert
        key = new String[size];
        map = new TreeMap<String, String>();
        start = System.currentTimeMillis();
        for (int i=0;i<size;i++){
            key[i] = UUID.randomUUID().toString();
            map.put(key[i],UUID.randomUUID().toString());
        }
        end = System.currentTimeMillis();
        treeMapW += (end-start);
        System.out.println("TreeMap插入耗时 = " + (end - start) + " ms");

        //treemap read
        start = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            index = random.nextInt(size);
            map.get(key[index]);
        }
        end = System.currentTimeMillis();
        treeMapR += (end-start);
        System.out.println("TreeMap读取耗时 = " + (end - start) + " ms");

        //hastable write
        key = new String[size];
        map = new Hashtable<String, String>();
        start = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            key[i] = UUID.randomUUID().toString();
            map.put(key[i],UUID.randomUUID().toString());
        }
        end = System.currentTimeMillis();
        hashTableW += (end-start);
        System.out.println("Hashtable插入耗时 = " + (end - start) + " ms");

        //hastable read
        start = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            index = random.nextInt(size);
            map.get(key[index]);
        }
        end = System.currentTimeMillis();
        hashTableR += (end-start);
        System.out.println("Hashtable读取耗时 = " + (end - start) + " ms");
    }
}
