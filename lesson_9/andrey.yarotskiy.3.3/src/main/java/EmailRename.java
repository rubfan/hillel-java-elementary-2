/**
 * Created by My on 07.08.2018.
 */
public class EmailRename {
    public static void main(String[] args) {
        System.out.println(rename("person@gmail.com"));

    }
    public static String rename(String str){
        if (str.contains(".")){
            String[] split = str.split("\\.",2);
            str = split[0] + "[ dot ]" + split[1];
        }
        if (str.contains("@")){
            String[] split = str.split("@",2);
            str = split[0] + "[ at ]" + split[1];
        }
        return str;
    }
}
