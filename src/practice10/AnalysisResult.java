package practice10;

import java.io.*;
import java.util.*;
public class AnalysisResult {
    public static void main(String[] args) {
        File fRead=new File("E:\\score.txt");
        File fWrite=new File("scoreAnalysis.txt") ;
        try{
            Writer out=new FileWriter(fWrite,true);
            BufferedWriter bufferedWriter=new BufferedWriter(out);
            Reader in=new FileReader(fRead);
            BufferedReader bufferedReader=new BufferedReader(in);
            String str=null;
            while((str=bufferedReader.readLine())!=null){
                double totalScore=Fenxi.getTotalScore(str);
                str=str+"总分："+totalScore;
                double average=Fenxi.getTotalScore(str);
                average=totalScore/3;
                str=str+"平均成绩："+average;
                System.out.println(str);
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
    }
}
