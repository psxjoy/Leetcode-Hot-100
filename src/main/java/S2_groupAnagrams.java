import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S2_groupAnagrams {


    /**
     * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
     * <p>
     * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String tmpStr = strs[i];
            char[] tmpCharArr = tmpStr.toCharArray();
            Arrays.sort(tmpCharArr);
            String sortTmpChar = new String(tmpCharArr);
            if (map.containsKey(sortTmpChar)) {
                List<String> tmpList = map.get(sortTmpChar);
                tmpList.add(tmpStr);
                map.put(sortTmpChar, tmpList);
            } else {
                List<String> tmpList = new ArrayList<>();
                tmpList.add(tmpStr);
                map.put(sortTmpChar, tmpList);
            }
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;

    }
}
