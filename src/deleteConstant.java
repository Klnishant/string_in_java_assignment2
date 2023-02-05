public class deleteConstant {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Hello, have a good day");
        String result = "";

        for (int i=0; i< str.length(); i++)
        {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)=='u'
            || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)== 'I' || str.charAt(i)== 'O' || str.charAt(i)=='U')
            {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
