{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh9760\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.io.FileWriter;\
import java.io.IOException;\
import java.util.Arrays;\
import java.util.Scanner;\
\
public class CharacterOccurance \{\
\
    static int[] countArray = new int[26];\
\
    public static void main(String[] args) throws IOException \{\
\
        Scanner scanner = new Scanner(System.in);\
\
        System.out.print("Enter the word/sentence : ");\
\
        String sentence = scanner.nextLine().toUpperCase();\
\
        countOccurrence(sentence);\
    \}\
\
    static void countOccurrence(String sentence) throws IOException \{\
\
        Arrays.fill(countArray, 0);\
\
        String fileContent = "Given input " + sentence + "\\nOUTPUT:\\n";\
        String fileInput = "";\
        String notALetter = "";\
\
        for (int i = 0; i < sentence.length(); i++) \{\
\
\
        \}\
\
        for (int i = 0; i < 26; i++) \{\
\
            if (countArray[i] != 0) \{\
                fileInput += "Character " + (char) (i + 65) + " occurs " + countArray[i] + " times\\n";\
                System.out.println("Character " + (char) (i + 65) + " occurs " + countArray[i] + " times\\n");\
            \}\
        \}\
\
        fileContent += /notALetter +/ fileInput;\
        System.out.println(fileContent);\
\
        FileWriter fw = null;\
\
        try \{\
            fw = new FileWriter("/Users/somyakhatri/Desktop/JAVALAB/output.txt");\
            fw.write(fileContent);\
        \} catch (Exception e) \{\
            System.out.println(e);\
        \} finally \{\
            fw.close();\
        \}\
        System.out.println("Successfully written into file");\
\
    \}\
\
\}}