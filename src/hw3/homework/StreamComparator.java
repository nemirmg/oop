package hw3.homework;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        return o1.getGroups().size() - o2.getGroups().size();
    }
    
}
