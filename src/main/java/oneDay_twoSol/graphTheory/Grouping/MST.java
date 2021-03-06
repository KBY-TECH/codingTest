package oneDay_twoSol.graphTheory.Grouping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MST {
    static int parent[];
    static PriorityQueue<Node> pq=new PriorityQueue<>();
    static ArrayList<Node> list=new ArrayList<>();
    static class Node implements Comparable<Node>
    {
        private int v1,v2,dist;

        public Node(int v1, int v2, int dist) {
            this.v1 = v1;
            this.v2 = v2;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node o) {
            if(this.dist-o.dist==0)
                return this.v1-o.v1;
            return this.dist-o.dist;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int v=sc.nextInt();
        parent=new int[v+1];
        for (int i = 1; i < v+1; i++) {
            parent[i]=i;
        }
        int e=sc.nextInt();
        for (int i = 0; i < e; i++) {
//            pq.offer(new Node(sc.nextInt(),sc.nextInt(),sc.nextInt()));
            list.add(new Node(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(list);
        int ans=0;
        // 우선순위 큐는 False 로 나온다 List는 통과함.
        for (Node node : list) {
            if(find(node.v1)!=find(node.v2))
            {
                union(node.v1,node.v2);
                ans+=node.dist;
            }
        }
        System.out.println(ans);

    }
    static void union(int a,int b)
    {
        a=find(a);
        b=find(b);
        if(a<b)
            parent[b]=a;
        else
            parent[a]=b;
    }
    static int find(int a)
    {
        if(parent[a]==a)
            return a;
        return parent[a]=find(parent[a]);
    }

}
