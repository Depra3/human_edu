package human08;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(new Integer(80), "human1");
		tm.put(new Integer(70), "human2");
		tm.put(new Integer(99), "human3");
		tm.put(new Integer(90), "human4");
//		tm.put(86, "human4");
		System.out.println(tm);
		
		System.out.println("firstEntry() key : " + tm.firstEntry().getKey());
		System.out.println("firstEntry() value : " + tm.firstEntry().getValue());
		System.out.println("---------------------------------------------");
		
		System.out.println("lastEntry() key : " + tm.lastEntry().getKey());
		System.out.println("lastEntry() value : " + tm.lastEntry().getValue());
		System.out.println("---------------------------------------------");
		
		System.out.println("lowerEntry(82) key : " + tm.lowerEntry(80).getKey());	// 주어진 값을 포함하지 않는 작은 key 값
		System.out.println("lowerEntry(82) value : " + tm.lowerEntry(80).getValue());
		System.out.println("---------------------------------------------");
		
		System.out.println("higherEntry(82) key : " + tm.higherEntry(80).getKey());	// 주어진 값을 포함하지 않는 큰 key 값
		System.out.println("higherEntry(82) value : " + tm.higherEntry(80).getValue());
		System.out.println("---------------------------------------------");
		
		System.out.println("floorEntry(80) key : " + tm.floorEntry(80).getKey());	// 주어진 값을 포함하여 작은 key 값
		System.out.println("floorEntry(80) value : " + tm.floorEntry(80).getValue());
		System.out.println("---------------------------------------------");
		
		System.out.println("ceilingEntry(80) key : " + tm.ceilingEntry(80).getKey());	// 주어진 값을 포함하여 큰 key 값
		System.out.println("ceilingEntry(80) value : " + tm.ceilingEntry(80).getValue());
		System.out.println("---------------------------------------------");
		
//		Map.Entry<Integer, String> me = null;		// 이 코드 내에서는 의미 없음.
		NavigableMap<Integer, String> descMap = tm.descendingMap();
		// descMap은 key 기준으로 정렬이 됨.
		Set<Map.Entry<Integer, String>> descEntrySet = descMap.entrySet();
		// descEntrySet에는 Map의 값을 Key 기준으로 내림차순정렬을 하되 결과는 set으로 처리함.
		System.out.println("descEntrySet : " + descEntrySet);
//		System.out.println(descMap);
		
		NavigableMap<Integer, String> ascMap = descMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascEntrySet = ascMap.entrySet();
		System.out.println("ascEntrySet : " + ascEntrySet);
		
		NavigableMap<Integer, String> rangeMap = tm.subMap(80, true, 90, true);
		System.out.println("rangeMap : " + rangeMap);
		rangeMap = tm.subMap(80, false, 90, true);		// true 포함, false 미포함.
		System.out.println("rangeMap : " + rangeMap);
		System.out.println("---------------------------------------------");
		
	}

}
