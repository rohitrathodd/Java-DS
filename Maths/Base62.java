package Maths;

class Base62 {

    public static void main(String[] args){
        long n = 10000031101L;
        System.out.println(idToShortURL(n));
    }



    public static String idToShortURL(long n) {
        // code here
        StringBuilder id =new StringBuilder();
        long num =n;
        while(num>0){
            
            int d=(int)(num%62);
            
            if(d>=0 && d<=25){
                char abc = (char)(97+d);
                id.append(abc);

            }else if(d>=26 && d<=51){
                char ABC= (char)(65-26+d);
                id.append(ABC);
            }else if(d>=52 && d<=61){
                
                id.append(d-52);
            }
            
            num=num/62;
        }
        id.reverse();
        return id.toString();
    }
}