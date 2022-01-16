package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class ChainingImpl {

    private int bucket;
    private ArrayList<LinkedList<Integer>> list;

    public ChainingImpl(int bucket){
        this.bucket = bucket;
        list = new ArrayList<LinkedList<Integer>>();
        for(int i = 0; i < bucket; i++){
            list.add(new LinkedList<Integer>());
        }
    }

    public void insert(int ele){
        int pos = ele % bucket;
        list.get(pos).add(ele);
    }

    public void remove(int ele){
        int pos = ele % bucket;
        list.get(pos).remove((Integer) ele);
    }

    public boolean search(int ele){
        int pos = ele % bucket;
        return list.get(pos).contains((Integer) pos);
    }
}

