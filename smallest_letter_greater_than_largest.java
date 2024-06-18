public class smallest_letter_greater_than_largest {
    public static void main(String[] args) {
        char target='c';
        int tres=(int)target,flag=0;
        char[] letters={'c','f','j'};
        for(int i=0;i<letters.length;i++){
            int res=(int) letters[i];
            if(res>tres){
                System.out.println(letters[i]);
                flag=1;
                break;
            }
        }
        if(flag==0){System.out.println(letters[0]);}
        
    }
}
