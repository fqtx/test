package Demo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Demo01 {
    public static void main(String[] args){
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        Map<String,Object> map = new LinkedHashMap<String,Object>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        list.add(map);
        //fastjson
        JSON.toJSONString(list);
    }
}
