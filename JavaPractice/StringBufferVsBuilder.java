package JavaPractice;

public class StringBufferVsBuilder {
    public static void main(String[] args) {
        int N = 999999999;
        long t;

        //Performance using StringBuffer
        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();

            for(int i = N; i-->0;){
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }


        //Performance using StringBuilder
        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();

            for(int i = N; i-->0;){
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
    }
}
