public class Main {
    public static void main(String[] args){
        
    }
}

class MyString{
    private char[] charStr;

    public MyString(char[] chars){
        charStr = new char[chars.length];
        for(int i = 0; i < chars.length; i++){
            charStr[i] = chars[i];
        }
    }

    public char charAt(int index){
        char tmp = charStr[index];
        return tmp;
    }

    public int length(){
        return charStr.length;
    }

    public MyString substring(int begin, int end){
        char[] tmp = new char[end - begin];
        for(int i = 0; i<(end - begin); i++){
            tmp[i] = charStr[begin + i];
        }
        MyString myStr = new MyString(tmp);
        return myStr;
    }

    public MyString toLowerCase(){
        char[] temp = new char[charStr.length];
        for(int i = 0; i < charStr.length;i++){
            if((int)charStr[i] >= 97 && (int)charStr[i] <= 122){
                temp[i] = (char)((int)charStr[i] + 32);
            }else{
                temp[i] = charStr[i];
            }
        }
        MyString myStr = new MyString(temp);

        return myStr;
    }

    public MyString toUpperCase(){
        char[] temp = new char[charStr.length];
        for(int i = 0; i < charStr.length;i++){
            if((int)charStr[i] >= 65 && (int)charStr[i] <= 90){
                temp[i] = (char)((int)charStr[i] + 32);
            }else{
                temp[i] = charStr[i];
            }
        }
        MyString myStr = new MyString(temp);

        return myStr;
    }

    public boolean equals(MyString s){
        if(charStr.length != s.charStr.length){
            return false;
        }else {
            for (int i = 0; i < charStr.length; i++){
                if(charStr[i] != s.charStr[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public MyString getMyString(){
        char[] temp = new char[charStr.length];
        for(int i = 0;i<charStr.length;i++){
            temp[i] = charStr[i];
        }
        MyString myStr = new MyString(temp);
        return myStr;
    }

    public String toString(){
        String temp = new String(charStr);
        return temp;
    }

    //still do
    public static MyString valueOf(int i){
        char[] temp = new char[10];

        MyString myStr = new MyString(temp);
        return myStr;
    }

}
