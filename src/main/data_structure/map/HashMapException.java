package main.data_structure.map;

public class HashMapException extends Exception{
    String error;
    HashMapException(String str){
        this.error = str;
    }
}
