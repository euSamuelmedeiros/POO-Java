package zFormaçãoBASICA.List.iterator;

import java.util.ArrayList;
import java.util.List;

public class iteratorTest01 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("athur");
        stringList.add("sergin");
        stringList.add("samuca");

        for (String arthur: stringList){
            System.out.println(arthur);
        }



    }
}
