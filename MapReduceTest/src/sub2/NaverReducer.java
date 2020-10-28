package sub2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class NaverReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
	
	public Map<String , Integer> map = new HashMap<String , Integer>();
	
	@Override
	protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
	
		int sum = 0;
		
		for(IntWritable val : values) {
			sum += val.get();
		}
				
		map.put(key.toString() , sum);
		
	}
	
	@Override
	public void cleanup(Context context) throws IOException, InterruptedException{
		// 마지막 리듀스 작업 후 실행되는 메서드   
		
		List<String> list = new ArrayList<>();
        list.addAll(map.keySet());
        
        Collections.sort(list, new Comparator<String>(){
            
            public int compare(String k1, String k2){
                Integer v1 = map.get(k1);
                Integer v2 = map.get(k2);
                
                int result = v1.compareTo(v2);                
                return result;
            }
        });
        
     	// 내림차순
        Collections.reverse(list); 
		
        Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			String word = (String) iter.next();
			int sum = (int) map.get(word);

			context.write(new Text(word), new IntWritable(sum));
		}
	}
}