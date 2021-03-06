package com.khc.kmooc.data_engineering.week9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class HashSetExample7 {
    public static HashSet<Integer> getHashSetID() throws IOException {
        HashSet<Integer> data = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\project\\personal\\data-engineering\\email.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            if (line.startsWith("#")) {
                continue;
            }
            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);
            data.add(from);
            data.add(to);
        }
        br.close();
        return data;
    }

    public static HashSet<Integer> getHashSetSenderIDs() throws IOException {
        HashSet<Integer> data = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\project\\personal\\data-engineering\\email.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            if (line.startsWith("#")) {
                continue;
            }
            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);
            data.add(from);
        }
        br.close();
        return data;
    }

    public static HashSet<Integer> getHashSetReceiverIDs() throws IOException {
        HashSet<Integer> data = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\project\\personal\\data-engineering\\email.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            if (line.startsWith("#")) {
                continue;
            }
            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);
            data.add(to);
        }
        br.close();
        return data;
    }

    public static void main(String[] args) throws IOException {
        HashSet<Integer> idSet = getHashSetID();
        HashSet<Integer> senderSet = getHashSetSenderIDs();
        HashSet<Integer> receiverSet = getHashSetReceiverIDs();

        System.out.println("?????? ?????? ???:" + senderSet.size());
        System.out.println("?????? ?????? ???:" + receiverSet.size());

        // ?????????
//        senderSet.addAll(receiverSet);
//        System.out.println("????????? ??????????????? ????????? ????????? ??? :" + senderSet.size());

        //?????????
//        senderSet.retainAll(receiverSet);
//        System.out.println("????????? ???????????? ?????? ????????? ??? ????????? ??? :" + senderSet.size());

        //?????????
//        senderSet.removeAll(receiverSet);
//        System.out.println("???????????? ???????????? ??? ????????? ??? :" + senderSet.size());

        //?????????
        receiverSet.removeAll(senderSet);
        System.out.println("???????????? ????????? ??? ????????? ??? :" + receiverSet.size());
    }
}
