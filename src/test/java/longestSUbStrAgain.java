public class longestSUbStrAgain {
    public static void main(String[] args){
        String input = "abcdaabcd";
        int count=0;
        int max=0;
        for(int i=0;i<input.length();i++){
            for(int j=i+1;j<input.length();j++){
                if(input.charAt(i)==input.charAt(j)&&((j-i)>1)){
                    count=j+1;
                    i=i+1;
                    j=i+2;
                    if(count>max){
                        max=count;
                    }
                    break;
                }
                else if(input.charAt(i)==input.charAt(j)&&((j-i)==1)){
                    count=1;
                    i=i+1;
                    j=i+2;
                    max=count;
                    break;
                }

            }

        }
        System.out.println(max);
    }
}
