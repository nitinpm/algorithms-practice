public class WithoutString {
    public String withoutString(String base, String remove){

        String result = "";

        for(int i = 0; i < base.length(); i++){
            int j = 0;
            if(base.toLowerCase().charAt(i) == remove.toLowerCase().charAt(j+i)){
                while(j != remove.length()) {
                    if(base.toLowerCase().charAt(i) == remove.toLowerCase().charAt(j+i)){
                        j++;
                        i++;
                    }
                }
            }
        }

        return result;
    }
}
