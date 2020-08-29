package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	//

        String str = "abca";

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(char i : str.toCharArray()){
            System.out.println(map.get(i));

            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.put(i, map.get(i)+1);
            }

        }

        System.out.println(map);
        

    }

}