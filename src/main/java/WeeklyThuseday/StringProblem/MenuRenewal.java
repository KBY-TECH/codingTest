package WeeklyThuseday.StringProblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;


public class MenuRenewal {
    public static void main(String[] args) {
        String a[]={"XYZ", "XWY", "WXA"};
        int c[]={2,3,4};
        String str[]=solution(a,c);
        System.out.println(Arrays.toString(str));
    }
    static int max;
    static HashMap<String,Integer> map;
    public static String[] solution(String[] orders, int[] course) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        for (int i = 0; i <course.length ; i++) {
            map=new HashMap<>();
            max=0;
            int cnt=0; // 주문한 사람들
            for (int j = 0; j < orders.length; j++) {
                find(0,"",course[i],0,orders[j]);
            }
            for (String s : map.keySet()){
                if (map.get(s)==max&&max>1){ // 가장 큰거이면서 2명이상에게 주문 받아져야 한다.
                    pq.offer(s);
                }
            }
        }
        String  answer[] = new String[pq.size()];
        int k=0;
        while (!pq.isEmpty()){
            answer[k++] = pq.poll();
        }
        return answer;
    }
    static void find(int cnt,String str,int menuNumber,int idx,String orders)
    {
        if(cnt==menuNumber) // 만들어야 할 코스 요리 개수와 일치한다면.
        {
            char c[]=str.toCharArray();
            Arrays.sort(c);
            String temp="";
            for(char i :c)
            {
                temp+=i;
            }
            map.put(temp,map.getOrDefault(temp,0)+1);
            max=Math.max(max,map.get(temp));
            return;
        }
        for (int i = idx; i <orders.length() ; i++) {
            char c=orders.charAt(i);
            find(cnt+1,str+c,menuNumber,i+1,orders);
        }
    }
}




