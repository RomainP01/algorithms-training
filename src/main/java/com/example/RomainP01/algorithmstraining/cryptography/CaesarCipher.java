package com.example.RomainP01.algorithmstraining.cryptography;

import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {
    public Map<String,String> getCaesarMap(String alphabet, Integer shift){
        var alphaArray = alphabet.split("");
        Map<String,String> map = new HashMap<String,String>();
        for(var i=0; i<alphaArray.length;i++){
           var index = (i + shift) % alphaArray.length;
           if (index<0){
               index+= alphaArray.length;
           }
                map.put(alphaArray[i],alphaArray[index]);

        }
        return map;
    }

    public String caesarEncrypt(String str, Integer shift, String alphabet){

    var caesarMap = getCaesarMap(alphabet, shift);
    var strArray = str.toLowerCase().split("");
    var returnString = new StringBuilder();
    for (String s:strArray){
            if(s.equals(" ")){
                returnString.append(s);
            }
            else{
                returnString.append(caesarMap.get(s));
            }
        }
    return returnString.toString();
    }

    public String caesarDecrypt(String str, Integer shift, String alphabet){
        var caesarMap = getCaesarMap(alphabet, -shift);
        var strArray = str.toLowerCase().split("");
        var returnString = new StringBuilder();
        for (String s:strArray){
            if(s.equals(" ")){
                returnString.append(s);
            }
            else{

                returnString.append(caesarMap.get(s));
            }
        }
        return returnString.toString();
    }
}
