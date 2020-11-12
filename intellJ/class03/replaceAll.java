package com.syntax.intellJ.class03;

public class replaceAll {
        public static void main(String[] args) {
            String mix="3213Hello 89 World354545 *&***^&*^&*";
           // System.out.println(mix.replaceAll("[0-8]", ""));
            //System.out.println(mix.replaceAll("[a-z]", "b"));
           //System.out.println(mix.replaceAll("[a-z A-Z]", ""));
            System.out.println(mix.replaceAll("[a-z 1-7]", ""));
            //System.out.println(mix.replaceAll("[^A-Za-z0-9]", ""));
            System.out.println(mix.replaceAll("\\s+", ""));
        }

    }

