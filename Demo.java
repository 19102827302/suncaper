package suncaper;

import java.util.HashMap;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<Integer,String> pokes = new HashMap<>();
        String[] types = {"♠","♥","♣","♦"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int start = 0;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<types.length;j++){
                pokes.put(start,types[j]+numbers[i]);
                start= start+1;
            }
        }
        pokes.put(52,"大🃏");
        pokes.put(53,"小🃏");
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i<54;i++){
            list.add(i);
        }
        Collections.shuffle(list);
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        List<Integer> three = new ArrayList<>();
        List<Integer> four = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(i<17){
                one.add(list.get(i));
            } else if(i<34) {
                two.add(list.get(i));
            }else if(i<51) {
                three.add(list.get(i));
            }else  {
                four.add(list.get(i));
            }
        }

        List<String> onePoke = new ArrayList<>();
        List<String> twoPoke = new ArrayList<>();
        List<String> threePoke = new ArrayList<>();
        List<String> fourPoke = new ArrayList<>();
        Collections.sort(one);
        Collections.sort(two);
        Collections.sort(three);
        Collections.sort(four);
        for(Integer i:one){
            String s =pokes.get(i);
            onePoke.add(s);
        }
        for(Integer i:two){
            String s =pokes.get(i);
            twoPoke.add(s);
        }
        for(Integer i:three){
            String s =pokes.get(i);
            threePoke.add(s);
        }
        for(Integer i:four){
            String s =pokes.get(i);
            fourPoke.add(s);
        }
        System.out.println(onePoke);
        System.out.println(twoPoke);
        System.out.println(threePoke);
        System.out.println(fourPoke);

    }
}